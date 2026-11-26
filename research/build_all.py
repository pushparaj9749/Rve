from loguru import logger
logger.remove()
from androguard.core.apk import APK
from androguard.core.dex import DEX
from androguard.core.analysis.analysis import Analysis
from androguard.decompiler.decompiler import DecompilerDAD
import xml.etree.ElementTree as ET
import re, os, collections

OUT = "research"
os.makedirs(f"{OUT}/decompiled", exist_ok=True)
a = APK("google_drive/base.apk")
AND = "{http://schemas.android.com/apk/res/android}"

# ---------- manifest ----------
def g(name, default=None):
    fn = getattr(a, name, None)
    try:
        return fn() if callable(fn) else fn
    except Exception:
        return default

with open(f"{OUT}/manifest_report.txt", "w") as f:
    f.write(f"PACKAGE: {g('get_package')}\nVERSION_NAME: {g('get_androidversion_name')}\n")
    f.write(f"VERSION_CODE: {g('get_androidversion_code')}\nMIN_SDK: {g('get_min_sdk_version')}\n")
    f.write(f"TARGET_SDK: {g('get_target_sdk_version')}\nAPP_NAME: {g('get_app_name')}\n\n")
    for label, meth in [("PERMISSIONS","get_permissions"),("ACTIVITIES","get_activities"),
                        ("SERVICES","get_services"),("RECEIVERS","get_receivers"),("PROVIDERS","get_providers")]:
        f.write(f"--- {label} ---\n")
        for x in sorted(g(meth, []) or []): f.write(f"  {x}\n")
        f.write("\n")

xml = a.get_android_manifest_axml().get_xml()
if isinstance(xml, bytes): xml = xml.decode("utf-8", "replace")
root = ET.fromstring(xml); app = root.find("application")
with open(f"{OUT}/manifest_detail.txt", "w") as f:
    f.write("--- APPLICATION ATTRS ---\n")
    for k,v in sorted(app.attrib.items()): f.write(f"  {k} = {v}\n")
    f.write("\n--- INTENT FILTERS (app components) ---\n")
    for tag in ["activity","service","receiver","provider"]:
        for comp in app.findall(tag):
            name = comp.attrib.get(AND+"name","?")
            if not name.startswith("com.alightcreative"): continue
            f.write(f"\n[{tag}] {name}\n  attrs={dict(comp.attrib)}\n")
            for flt in comp.findall("intent-filter"):
                acts=[x.attrib.get(AND+"name") for x in flt.findall("action")]
                cats=[x.attrib.get(AND+"name") for x in flt.findall("category")]
                datas=[dict(x.attrib) for x in flt.findall("data")]
                f.write(f"  filter: actions={acts} cats={cats} data={datas}\n")
    f.write("\n--- META-DATA ---\n")
    for md in app.findall("meta-data"): f.write(f"  {dict(md.attrib)}\n")

# ---------- dex ----------
blobs = list(a.get_all_dex())
dex_names = list(a.get_dex_names())
url_re = re.compile(r'https?://[^\s"\'<>\[\]{}()]{4,}', re.I)
domain_re = re.compile(r'(?:[a-z0-9-]+\.)+(?:com|net|org|io|app|dev|co|in|tv|me|xyz|link|page|firebaseapp|googleapis|android|vending)', re.I)
path_re = re.compile(r'/(?:api|v\d|graphql|auth|user|users|project|projects|template|templates|export|upload|download|paywall|purchase|billing|license|config)(?:/[A-Za-z0-9_.{}-]+)+', re.I)
interesting_re = re.compile(r'alight|motion|aftermotion|pairip|bendingspoons|injet|satriya|applovin|firebase|paywall|subscription|license|export|template', re.I)

summary=[]; filtered=set(); method_rows=0
with open(f"{OUT}/class_method_index.tsv","w") as midx:
    midx.write("class\tmethod\tdescriptor\thas_code\tdex\n")
    for i,blob in enumerate(blobs):
        d=DEX(blob); classes=list(d.get_classes()); strings=list(d.get_strings()); code_count=0
        for c in classes:
            cls=c.get_name().lstrip('L').rstrip(';').replace('/','.')
            if not cls.startswith(('com.alightcreative','com.bendingspoons','com.pairip','com.strxid')): continue
            for m in c.get_methods():
                method_rows+=1
                has=1 if m.get_code() is not None else 0
                code_count+=has
                midx.write(f"{cls}\t{m.get_name()}\t{m.get_descriptor()}\t{has}\tdex{i}\n")
        for s in strings:
            if not isinstance(s,str) or not (4 <= len(s) <= 500): continue
            if url_re.search(s) or domain_re.search(s) or path_re.search(s) or interesting_re.search(s):
                filtered.add(s)
        summary.append((i, os.path.basename(dex_names[i]) if i<len(dex_names) else f'dex{i}', len(classes), len(strings), code_count))

with open(f"{OUT}/dex_summary.txt","w") as f:
    f.write("idx\tfile\tclasses\tstrings\tcode_methods\n")
    for r in summary: f.write("\t".join(map(str,r))+"\n")
    f.write(f"\nTOTAL classes={sum(r[2] for r in summary)} strings={sum(r[3] for r in summary)} code_methods={sum(r[4] for r in summary)} indexed_methods={method_rows}\n")

clean=[]
for s in filtered:
    try: t=s
    except Exception: continue
    if t and all(32 <= ord(ch) < 127 for ch in t): clean.append(t)
clean=sorted(set(clean))
open(f"{OUT}/strings_clean.txt","w").write("\n".join(clean))
urls=sorted({u.rstrip('),;') for line in clean for u in url_re.findall(line)})
open(f"{OUT}/urls_all.txt","w").write("\n".join(urls))

cats={
 'urls': lambda s: s.startswith('http'),
 'endpoints': lambda s: s.startswith('/') or bool(re.search(r'/(?:v\d|public|appdata|events|templates|setup)',s)),
 'intent_actions': lambda s: 'android.intent.' in s,
 'mime_types': lambda s: bool(re.match(r'^(video|audio|image|application|text)/[a-z0-9.+-]+$',s)),
 'file_extensions': lambda s: bool(re.search(r'\.(amproj|zip|xml|json|mp4|mov|png|jpg|jpeg|webp|gif|ta|so|pdf|bks)$',s,re.I)),
 'cloud_functions': lambda s: bool(re.search(r'cloudfunctions|validateProjectPackage',s,re.I)),
 'log_messages': lambda s: bool(re.search(r'^(IAP:|Error|WARN|DEBUG|Failed|Invalid|Unable|Success)',s,re.I)),
 'deep_links': lambda s: bool(re.search(r'alight(?:\.to|\.page\.link|creative\.page\.link|motion://)|__/auth/links',s)),
}
with open(f"{OUT}/strings_index.md","w") as f:
    f.write("# String index (auto-categorized)\n\n")
    f.write(f"Total printable filtered strings: {len(clean)}\n\n")
    for name,fn in cats.items():
        hits=sorted({s for s in clean if fn(s)})
        f.write(f"## {name} ({len(hits)})\n\n")
        for s in hits[:250]: f.write(f"- `{s}`\n")
        if len(hits)>250: f.write(f"- … {len(hits)-250} more (see strings_clean.txt)\n")
        f.write("\n")

# ---------- decompile ----------
targets = [
'com.alightcreative.app.motion.scene.Scene','com.alightcreative.app.motion.scene.SceneElement',
'com.alightcreative.app.motion.scene.SceneHolderImpl','com.alightcreative.app.motion.scene.ExportParams',
'com.alightcreative.app.motion.scene.Keyable','com.alightcreative.app.motion.scene.SceneType',
'com.alightcreative.export.preview.ExportPreviewActivity','com.alightcreative.export.projectpackage.SharedProjectPackageInfo',
'com.alightcreative.export.projectpackage.RegisterAMProjectPackageRequest','com.alightcreative.export.projectpackage.ProjectPackageIDRequest',
'com.alightcreative.importer.projectpackage.AlightLinkMetadataRequest','com.alightcreative.importer.projectpackage.RequestProjectDownloadRequest',
'com.alightcreative.importer.xml.data.XmlValidationBackend','com.alightcreative.importer.xml.ui.ImportActivity',
'com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity','com.alightcreative.monorepo.settings.AlightSettingsEntity',
'com.alightcreative.account.A','com.bendingspoons.oracle.models.Settings','com.bendingspoons.oracle.models.User',
'com.bendingspoons.injet.webbridge.AndroidBridge','com.bendingspoons.injet.ui.InjetPresenterActivity',
'com.alightcreative.app.motion.activities.SaveToStorageActivity','com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser',
'com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity','com.alightcreative.app.motion.persist.xfY',
'com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager',
'com.alightcreative.app.motion.scene.rendering.RenderEnvironmentImpl','com.alightcreative.monetization.ui.PaywallActivity',
'com.alightcreative.app.motion.tutorial.TutorialActivity','com.alightcreative.export.projectpackage.ProjectPackageIDResponse',
'com.alightcreative.export.projectpackage.RegisterAMProjectPackageResponse','com.alightcreative.export.projectpackage.SharedProjectInfo',
'com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse','com.alightcreative.importer.projectpackage.RequestProjectDownloadResponse',
'com.alightcreative.app.motion.scene.ExportFormat','com.alightcreative.app.motion.scene.SceneElementType',
'com.alightcreative.app.motion.scene.KeyableTransform','com.alightcreative.app.motion.project.ProjectInfo',
'com.alightcreative.app.motion.scene.visualeffect.VisualEffect','com.alightcreative.app.motion.scene.GeometryKt',
'com.alightcreative.app.motion.scene.SceneKt','com.alightcreative.app.motion.scene.KeyableKt',
'com.alightcreative.app.motion.scene.SceneElementKt','com.alightcreative.app.motion.scene.CubicBSplineKt',
'com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt','com.alightcreative.app.motion.scene.SceneThumbnailMaker',
'com.alightcreative.app.motion.activities.AboutActivity','com.alightcreative.app.motion.activities.SettingsActivity',
'com.alightcreative.app.motion.activities.FontBrowserActivity','com.alightcreative.app.motion.activities.effectbrowser.EffectBrowserActivity',
'com.alightcreative.app.motion.activities.MyAccountActivity','com.alightcreative.app.motion.activities.ManageAccountActivity',
'com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity','com.alightcreative.app.motion.activities.DevSettingsActivity',
'com.alightcreative.app.motion.activities.survey.SurveyActivity','com.alightcreative.onboarding.ui.OnboardingActivity',
'com.alightcreative.app.motion.activities.creatorprogram.rewardlist.CreatorRewardListActivity',
'com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity',
'com.alightcreative.app.motion.ranking.ui.editprofile.EditProfileActivity','com.alightcreative.share.xfY',
'com.alightcreative.app.motion.feed.FeedContentRequest','com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity',
'com.bendingspoons.forceupdater.internal.ForceUpdateActivity','com.bendingspoons.injet.module.MonetizationModule',
'com.bendingspoons.injet.module.NativeStorageModule','com.bendingspoons.oracle.models.Products',
'com.bendingspoons.oracle.models.IdentityToken','com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent',
'com.bendingspoons.spidersense.domain.network.entities.NetworkPacket',
'com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt','com.alightcreative.importer.projectpackage.ElementDownloadActivity',
'com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity',
]
found={}
for i,blob in enumerate(blobs):
    d=DEX(blob)
    for c in d.get_classes():
        n=c.get_name().lstrip('L').rstrip(';').replace('/','.')
        if n in targets: found[n]=(i,d,c)
cache={}; missed=[]
with open(f"{OUT}/decompile_log.txt","w") as log:
    log.write(f"requested={len(targets)} found={len(found)}\n")
    for n in targets:
        if n not in found: missed.append(n); log.write(f"MISS {n}\n"); continue
        i,d,c=found[n]
        if i not in cache:
            vmx=Analysis(); vmx.add(d); cache[i]=DecompilerDAD(d,vmx)
        try: src=cache[i].get_source_class(c) or ''
        except Exception as e: src=f"// ERROR {type(e).__name__}: {e}\n"
        open(f"{OUT}/decompiled/{n}.java","w").write(src)
        log.write(f"OK {n} {len(src)} chars\n")
    log.write(f"missed={len(missed)}\n")
print("DONE", "methods", method_rows, "decompiled", len(found)-len(missed), "missed", missed)
