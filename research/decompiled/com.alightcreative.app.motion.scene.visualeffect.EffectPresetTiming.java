package com.alightcreative.app.motion.scene.visualeffect;
public final enum class EffectPresetTiming extends java.lang.Enum {
    private static final synthetic kotlin.enums.EnumEntries $ENTRIES;
    private static final synthetic com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming[] $VALUES;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming End;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming Extend;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming ExtendMatch;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming Split;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming Start;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming Stretch;

    private static final synthetic com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming[] $values()
    {
        com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming v2 = com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.ExtendMatch;
        com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming v4 = com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.Start;
        return new com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming[] {com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.Stretch, com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.End});
    }

    static EffectPresetTiming()
    {
        com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.Stretch = new com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming("Stretch", 0);
        com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.Extend = new com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming("Extend", 1);
        com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.ExtendMatch = new com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming("ExtendMatch", 2);
        com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.Split = new com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming("Split", 3);
        com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.Start = new com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming("Start", 4);
        com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.End = new com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming("End", 5);
        kotlin.enums.EnumEntries v0_10 = com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.$values();
        com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.$VALUES = v0_10;
        com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.$ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(v0_10);
        return;
    }

    private EffectPresetTiming(String p1, int p2)
    {
        super(p1, p2);
        return;
    }

    public static kotlin.enums.EnumEntries getEntries()
    {
        return com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.$ENTRIES;
    }

    public static com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming valueOf(String p1)
    {
        return ((com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming) Enum.valueOf(com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming, p1));
    }

    public static com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming[] values()
    {
        return ((com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming[]) com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming.$VALUES.clone());
    }
}
