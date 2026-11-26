from loguru import logger; logger.remove()
from androguard.core.apk import APK
from androguard.core.dex import DEX
from androguard.core.analysis.analysis import Analysis
from androguard.decompiler.decompiler import DecompilerDAD
a=APK('google_drive/base.apk'); blobs=list(a.get_all_dex())
targets=[
'com.alightcreative.app.motion.scene.visualeffect.EffectType',
'com.alightcreative.app.motion.scene.visualeffect.EffectPreset',
'com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming',
'com.alightcreative.app.motion.scene.visualeffect.EffectAffinity',
'com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type',
'com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength',
'com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef',
'com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef',
'com.alightcreative.app.motion.scene.visualeffect.OptionalVisualEffect',
'com.alightcreative.app.motion.scene.visualeffect.PresetInfo',
'com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue',
]
found={}
for i,b in enumerate(blobs):
    d=DEX(b)
    for c in d.get_classes():
        n=c.get_name().lstrip('L').rstrip(';').replace('/','.')
        if n in targets: found[n]=(i,d,c)
cache={}; miss=[]
for n in targets:
    if n not in found: miss.append(n); continue
    i,d,c=found[n]
    if i not in cache:
        v=Analysis(); v.add(d); cache[i]=DecompilerDAD(d,v)
    try: src=cache[i].get_source_class(c) or ''
    except Exception as e: src=f'// ERR {e}\n'
    open(f'research/decompiled/{n}.java','w').write(src)
    print(n, len(src))
print('missed', miss)
