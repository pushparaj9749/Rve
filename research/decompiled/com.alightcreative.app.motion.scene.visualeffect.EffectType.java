package com.alightcreative.app.motion.scene.visualeffect;
public final enum class EffectType extends java.lang.Enum {
    private static final synthetic kotlin.enums.EnumEntries $ENTRIES;
    private static final synthetic com.alightcreative.app.motion.scene.visualeffect.EffectType[] $VALUES;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectType DRAWING;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectType SHADER;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectType TEXT;

    private static final synthetic com.alightcreative.app.motion.scene.visualeffect.EffectType[] $values()
    {
        return new com.alightcreative.app.motion.scene.visualeffect.EffectType[] {com.alightcreative.app.motion.scene.visualeffect.EffectType.SHADER, com.alightcreative.app.motion.scene.visualeffect.EffectType.DRAWING, com.alightcreative.app.motion.scene.visualeffect.EffectType.TEXT});
    }

    static EffectType()
    {
        com.alightcreative.app.motion.scene.visualeffect.EffectType.SHADER = new com.alightcreative.app.motion.scene.visualeffect.EffectType("SHADER", 0);
        com.alightcreative.app.motion.scene.visualeffect.EffectType.DRAWING = new com.alightcreative.app.motion.scene.visualeffect.EffectType("DRAWING", 1);
        com.alightcreative.app.motion.scene.visualeffect.EffectType.TEXT = new com.alightcreative.app.motion.scene.visualeffect.EffectType("TEXT", 2);
        kotlin.enums.EnumEntries v0_3 = com.alightcreative.app.motion.scene.visualeffect.EffectType.$values();
        com.alightcreative.app.motion.scene.visualeffect.EffectType.$VALUES = v0_3;
        com.alightcreative.app.motion.scene.visualeffect.EffectType.$ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(v0_3);
        return;
    }

    private EffectType(String p1, int p2)
    {
        super(p1, p2);
        return;
    }

    public static kotlin.enums.EnumEntries getEntries()
    {
        return com.alightcreative.app.motion.scene.visualeffect.EffectType.$ENTRIES;
    }

    public static com.alightcreative.app.motion.scene.visualeffect.EffectType valueOf(String p1)
    {
        return ((com.alightcreative.app.motion.scene.visualeffect.EffectType) Enum.valueOf(com.alightcreative.app.motion.scene.visualeffect.EffectType, p1));
    }

    public static com.alightcreative.app.motion.scene.visualeffect.EffectType[] values()
    {
        return ((com.alightcreative.app.motion.scene.visualeffect.EffectType[]) com.alightcreative.app.motion.scene.visualeffect.EffectType.$VALUES.clone());
    }
}
