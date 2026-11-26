package com.alightcreative.app.motion.scene.visualeffect;
public final enum class EffectAffinity$Type extends java.lang.Enum {
    private static final synthetic kotlin.enums.EnumEntries $ENTRIES;
    private static final synthetic com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type[] $VALUES;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type Animation;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type Freehand;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type Media;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type Stroke;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type Text;
    public static final enum com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type TransformAnimation;
    private final String id;

    private static final synthetic com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type[] $values()
    {
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type v2 = com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.Stroke;
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type v4 = com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.Animation;
        return new com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type[] {com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.Text, com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.Media});
    }

    static EffectAffinity$Type()
    {
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.Text = new com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type("Text", 0, "text");
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.Freehand = new com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type("Freehand", 1, "freehand");
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.Stroke = new com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type("Stroke", 2, "stroke");
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.TransformAnimation = new com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type("TransformAnimation", 3, "transform-animation");
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.Animation = new com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type("Animation", 4, "animation");
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.Media = new com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type("Media", 5, "media");
        kotlin.enums.EnumEntries v0_10 = com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.$values();
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.$VALUES = v0_10;
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.$ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(v0_10);
        return;
    }

    private EffectAffinity$Type(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.id = p3;
        return;
    }

    public static kotlin.enums.EnumEntries getEntries()
    {
        return com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.$ENTRIES;
    }

    public static com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type valueOf(String p1)
    {
        return ((com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type) Enum.valueOf(com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type, p1));
    }

    public static com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type[] values()
    {
        return ((com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type[]) com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type.$VALUES.clone());
    }

    public final String getId()
    {
        return this.id;
    }
}
