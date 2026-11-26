package com.alightcreative.app.motion.scene.visualeffect;
public final class VisualEffectKt {
    private static final String APP_STRING_PREFIX = "@am:string/";
    private static final android.util.LruCache effectParamsCache;
    private static String effectSig;
    private static final java.util.Map loadedVisualEffectPresets;
    private static final java.util.Map loadedVisualEffects;
    private static final java.util.concurrent.atomic.AtomicLong nextEID;
    private static final java.util.List presetLoadErrors;
    private static final java.util.concurrent.atomic.AtomicBoolean visualEffectPresetsInitState;
    private static final java.util.concurrent.CountDownLatch visualEffectPresetsLoaded;
    private static final java.util.concurrent.atomic.AtomicBoolean visualEffectsInitState;
    private static final java.util.concurrent.CountDownLatch visualEffectsLoaded;

    static VisualEffectKt()
    {
        x0.TGSatriyaidChannel.registerNativesForClass(1, com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt);
        x0.hidden.Hidden0.special_clinit_1_00(com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt);
        return;
    }

    public static native synthetic String E(com.alightcreative.app.motion.scene.visualeffect.EffectPreset p0, com.alightcreative.app.motion.scene.visualeffect.VisualEffect p1);

    public static native synthetic CharSequence F0(com.alightcreative.app.motion.scene.visualeffect.PresetInfo p0);

    public static native synthetic String FT(com.alightcreative.app.motion.scene.visualeffect.EffectPreset p0);

    public static native synthetic String H(java.util.List p0);

    public static native synthetic String IB(com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming p0, float p1, float p2, int p3);

    public static native synthetic float LV(int p0, int p1, float p2, float p3);

    public static native synthetic String R6();

    public static native synthetic float T(int p0, int p1, float p2, float p3);

    public static native synthetic String X(com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming p0, int p1, int p2);

    private static final native com.alightcreative.app.motion.scene.visualeffect.VisualEffect _get_affinityTypes_$lambda$2(com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef p0);

    public static final native synthetic java.util.List access$loadVisualEffectPresets$lambda$67$updateCodes(java.util.List p0);

    public static final native com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue adjustForTiming(com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue p0, com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming p1, int p2, int p3);

    public static final native java.util.Map adjustForTiming(java.util.Map p0, com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming p1, int p2, int p3);

    private static final native String adjustForTiming$lambda$12(com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming p0, int p1, int p2);

    private static final native float adjustForTiming$lambda$13(float p0, float p1);

    private static final native float adjustForTiming$lambda$14(float p0, float p1);

    private static final native float adjustForTiming$lambda$16(int p0, int p1, com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue p2, float p3, com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming p4, float p5);

    private static final native String adjustForTiming$lambda$16$lambda$15(com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming p0, float p1, float p2, int p3);

    private static final native float adjustForTiming$lambda$17(int p0, int p1, float p2, float p3);

    private static final native float adjustForTiming$lambda$18(int p0, int p1, float p2, float p3);

    private static final native float adjustForTiming$toLayerFraction(int p0, int p1, float p2);

    private static final native int adjustForTiming$toPresetMillis(float p0, int p1);

    public static final native int affinityFor(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0, java.util.Set p1);

    public static native synthetic String ah(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0, java.util.List p1);

    public static native synthetic String cD(java.util.List p0);

    public static native synthetic String cLW(com.alightcreative.app.motion.scene.visualeffect.EffectPreset p0);

    public static native synthetic String db(String p0);

    public static final native java.util.Set getAffinityTypes(com.alightcreative.app.motion.scene.SceneElement p0);

    public static final native com.alightcreative.app.motion.scene.visualeffect.VisualEffect getEffect(com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef p0);

    public static final native com.alightcreative.app.motion.scene.visualeffect.VisualEffect getEffect(com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef p0);

    public static final native String getEffectSig();

    public static final native boolean getHasWarpEffects(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0);

    public static final native java.util.List getPresetLoadErrors();

    public static final native java.util.List getPresets(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0);

    public static final native java.util.List getVisualEffectPresets(String p0);

    public static final native java.util.List getVisualEffects();

    public static final varargs native java.util.List getVisualEffects(com.alightcreative.app.motion.scene.visualeffect.EffectType p0, com.alightcreative.app.motion.scene.visualeffect.EffectType[] p1);

    public static native synthetic float hUw(float p0, float p1);

    public static final native void initVisualEffectPresets(android.content.Context p0, String p1);

    private static final native kotlin.Unit initVisualEffectPresets$lambda$25(android.content.Context p0, String p1);

    private static final native String initVisualEffectPresets$lambda$25$lambda$21();

    private static final native String initVisualEffectPresets$lambda$25$lambda$22(com.alightcreative.app.motion.scene.visualeffect.EffectPreset p0, com.alightcreative.app.motion.scene.visualeffect.VisualEffect p1);

    private static final native String initVisualEffectPresets$lambda$25$lambda$23();

    private static final native String initVisualEffectPresets$lambda$25$lambda$24(com.alightcreative.app.motion.scene.visualeffect.EffectPreset p0);

    public static final native void initVisualEffects(android.content.Context p0, String p1, Vbv.c p2);

    private static final native kotlin.Unit initVisualEffects$lambda$37(android.content.Context p0, String p1, Vbv.c p2, android.content.Context p3);

    private static final native String initVisualEffects$lambda$37$lambda$26();

    private static final native String initVisualEffects$lambda$37$lambda$33(java.util.List p0);

    private static final native String initVisualEffects$lambda$37$lambda$36$lambda$35(int p0, com.alightcreative.app.motion.scene.visualeffect.VisualEffect p1, android.content.Context p2);

    public static final native boolean isNaturallyTimeDependent(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0);

    public static native synthetic kotlin.Unit j(java.util.List p0);

    public static native synthetic java.util.Map jE(com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef p0, float p1, float p2);

    public static native synthetic com.alightcreative.app.motion.scene.visualeffect.VisualEffect l(com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef p0);

    private static final native java.util.List loadVisualEffectPresets(android.content.Context p0, String p1);

    private static final native void loadVisualEffectPresets$lambda$46$presetError(String p0, String p1, java.util.List p2, String p3);

    private static final native String loadVisualEffectPresets$lambda$51(com.alightcreative.app.motion.scene.visualeffect.EffectPreset p0);

    private static final native String loadVisualEffectPresets$lambda$67$lambda$59(String p0);

    private static final native kotlin.Unit loadVisualEffectPresets$lambda$67$lambda$62(java.util.List p0);

    private static final native String loadVisualEffectPresets$lambda$67$lambda$62$lambda$61(java.util.List p0);

    private static final native CharSequence loadVisualEffectPresets$lambda$67$lambda$62$lambda$61$lambda$60(com.alightcreative.app.motion.scene.visualeffect.PresetInfo p0);

    private static final native java.util.List loadVisualEffectPresets$lambda$67$updateCodes(java.util.List p0);

    private static final native java.util.List loadVisualEffectPresets$toEnglishUCWords(String p0, android.content.Context p1, java.util.List p2);

    private static final native java.util.List loadVisualEffects(android.content.Context p0, String p1, Vbv.c p2);

    private static final native com.alightcreative.app.motion.scene.visualeffect.VisualEffect loadVisualEffects$fixTags(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0);

    private static final native String loadVisualEffects$lambda$85$lambda$76(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0, java.util.List p1);

    private static final native String loadVisualEffects$lambda$85$lambda$77(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0);

    private static final native String loadVisualEffects$lambda$85$lambda$78(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0);

    private static final native String loadVisualEffects$lambda$85$lambda$79(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0);

    private static final native String loadVisualEffects$lambda$85$lambda$80(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0);

    private static final native String loadVisualEffects$lambda$85$lambda$81(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0);

    private static final native String loadVisualEffects$lambda$85$lambda$82(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0);

    private static final native String loadVisualEffects$lambda$85$lambda$84$lambda$83(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0, String p1);

    public static final native long nextEffectInstanceId();

    public static native synthetic float ojl(float p0, float p1);

    public static native synthetic kotlin.Unit pM1(android.content.Context p0, String p1);

    public static final native java.util.Map paramsAtTime(com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef p0, float p1, float p2);

    private static final native java.util.Map paramsAtTime$lambda$0(com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef p0, float p1, float p2);

    public static native synthetic kotlin.Unit q(android.content.Context p0, String p1, Vbv.c p2, android.content.Context p3);

    public static final native void serialize(com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef p0, String p1, org.xmlpull.v1.XmlSerializer p2);

    public static final native void setEffectSig(String p0);

    public static native synthetic String uKP();

    public static final native com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef unserializeVisualEffect(String p0, org.xmlpull.v1.XmlPullParser p1, boolean p2);

    public static final native com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef valueAtTime(com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef p0, float p1, float p2);

    public static final native com.alightcreative.app.motion.scene.visualeffect.VisualEffect visualEffectById(String p0);

    public static native synthetic float w(int p0, int p1, com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue p2, float p3, com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming p4, float p5);

    public static native synthetic String x();
}
