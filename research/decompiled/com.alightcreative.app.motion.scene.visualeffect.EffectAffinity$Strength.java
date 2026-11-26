package com.alightcreative.app.motion.scene.visualeffect;
public final enum class EffectAffinity$Strength extends java.lang.Enum {
    private static final synthetic kotlin.enums.EnumEntries $ENTRIES;
    private static final synthetic com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength[] $VALUES;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength Recommended;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength Required;

    private static final synthetic com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength[] $values()
    {
        return new com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength[] {com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength.Required, com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength.Recommended});
    }

    static EffectAffinity$Strength()
    {
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength.Required = new com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength("Required", 0);
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength.Recommended = new com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength("Recommended", 1);
        kotlin.enums.EnumEntries v0_1 = com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength.$values();
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength.$VALUES = v0_1;
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength.$ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(v0_1);
        return;
    }

    private EffectAffinity$Strength(String p1, int p2)
    {
        super(p1, p2);
        return;
    }

    public static kotlin.enums.EnumEntries getEntries()
    {
        return com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength.$ENTRIES;
    }

    public static com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength valueOf(String p1)
    {
        return ((com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength) Enum.valueOf(com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength, p1));
    }

    public static com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength[] values()
    {
        return ((com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength[]) com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength.$VALUES.clone());
    }
}
