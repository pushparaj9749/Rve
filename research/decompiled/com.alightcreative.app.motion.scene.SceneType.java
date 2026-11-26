package com.alightcreative.app.motion.scene;
public final enum class SceneType extends java.lang.Enum {
    private static final synthetic kotlin.enums.EnumEntries $ENTRIES;
    private static final synthetic com.alightcreative.app.motion.scene.SceneType[] $VALUES;
    public static final enum com.alightcreative.app.motion.scene.SceneType ELEMENT;
    public static final enum com.alightcreative.app.motion.scene.SceneType PRESET;
    public static final enum com.alightcreative.app.motion.scene.SceneType SCENE;
    private final String label;

    private static final synthetic com.alightcreative.app.motion.scene.SceneType[] $values()
    {
        return new com.alightcreative.app.motion.scene.SceneType[] {com.alightcreative.app.motion.scene.SceneType.SCENE, com.alightcreative.app.motion.scene.SceneType.ELEMENT, com.alightcreative.app.motion.scene.SceneType.PRESET});
    }

    static SceneType()
    {
        com.alightcreative.app.motion.scene.SceneType.SCENE = new com.alightcreative.app.motion.scene.SceneType("SCENE", 0, "scene");
        com.alightcreative.app.motion.scene.SceneType.ELEMENT = new com.alightcreative.app.motion.scene.SceneType("ELEMENT", 1, "element");
        com.alightcreative.app.motion.scene.SceneType.PRESET = new com.alightcreative.app.motion.scene.SceneType("PRESET", 2, "preset");
        kotlin.enums.EnumEntries v0_4 = com.alightcreative.app.motion.scene.SceneType.$values();
        com.alightcreative.app.motion.scene.SceneType.$VALUES = v0_4;
        com.alightcreative.app.motion.scene.SceneType.$ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(v0_4);
        return;
    }

    private SceneType(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.label = p3;
        return;
    }

    public static kotlin.enums.EnumEntries getEntries()
    {
        return com.alightcreative.app.motion.scene.SceneType.$ENTRIES;
    }

    public static com.alightcreative.app.motion.scene.SceneType valueOf(String p1)
    {
        return ((com.alightcreative.app.motion.scene.SceneType) Enum.valueOf(com.alightcreative.app.motion.scene.SceneType, p1));
    }

    public static com.alightcreative.app.motion.scene.SceneType[] values()
    {
        return ((com.alightcreative.app.motion.scene.SceneType[]) com.alightcreative.app.motion.scene.SceneType.$VALUES.clone());
    }

    public final String getLabel()
    {
        return this.label;
    }
}
