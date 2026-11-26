package com.alightcreative.app.motion.scene;
public final enum class SceneElementType extends java.lang.Enum implements com.alightcreative.app.motion.scene.ISceneElementType {
    private static final synthetic kotlin.enums.EnumEntries $ENTRIES;
    private static final synthetic com.alightcreative.app.motion.scene.SceneElementType[] $VALUES;
    public static final enum com.alightcreative.app.motion.scene.SceneElementType Audio;
    public static final enum com.alightcreative.app.motion.scene.SceneElementType Camera;
    public static final enum com.alightcreative.app.motion.scene.SceneElementType Drawing;
    public static final enum com.alightcreative.app.motion.scene.SceneElementType NullObject;
    public static final enum com.alightcreative.app.motion.scene.SceneElementType Scene;
    public static final enum com.alightcreative.app.motion.scene.SceneElementType Shape;
    public static final enum com.alightcreative.app.motion.scene.SceneElementType Text;
    private final com.alightcreative.app.motion.scene.ISceneElementType impl;

    private static final synthetic com.alightcreative.app.motion.scene.SceneElementType[] $values()
    {
        com.alightcreative.app.motion.scene.SceneElementType v2 = com.alightcreative.app.motion.scene.SceneElementType.Scene;
        com.alightcreative.app.motion.scene.SceneElementType v4 = com.alightcreative.app.motion.scene.SceneElementType.Audio;
        return new com.alightcreative.app.motion.scene.SceneElementType[] {com.alightcreative.app.motion.scene.SceneElementType.Shape, com.alightcreative.app.motion.scene.SceneElementType.NullObject});
    }

    static SceneElementType()
    {
        com.alightcreative.app.motion.scene.SceneElementType.Shape = new com.alightcreative.app.motion.scene.SceneElementType("Shape", 0, com.alightcreative.app.motion.scene.ShapeElementTypeImpl.INSTANCE);
        com.alightcreative.app.motion.scene.SceneElementType.Drawing = new com.alightcreative.app.motion.scene.SceneElementType("Drawing", 1, com.alightcreative.app.motion.scene.DrawingElementTypeImpl.INSTANCE);
        com.alightcreative.app.motion.scene.SceneElementType.Scene = new com.alightcreative.app.motion.scene.SceneElementType("Scene", 2, com.alightcreative.app.motion.scene.NestedSceneElementTypeImpl.INSTANCE);
        com.alightcreative.app.motion.scene.SceneElementType.Text = new com.alightcreative.app.motion.scene.SceneElementType("Text", 3, com.alightcreative.app.motion.scene.TextElementTypeImpl.INSTANCE);
        com.alightcreative.app.motion.scene.SceneElementType.Audio = new com.alightcreative.app.motion.scene.SceneElementType("Audio", 4, com.alightcreative.app.motion.scene.AudioElementTypeImpl.INSTANCE);
        com.alightcreative.app.motion.scene.SceneElementType.Camera = new com.alightcreative.app.motion.scene.SceneElementType("Camera", 5, com.alightcreative.app.motion.scene.CameraElementTypeImpl.INSTANCE);
        com.alightcreative.app.motion.scene.SceneElementType.NullObject = new com.alightcreative.app.motion.scene.SceneElementType("NullObject", 6, com.alightcreative.app.motion.scene.NullObjectElementTypeImpl.INSTANCE);
        kotlin.enums.EnumEntries v0_13 = com.alightcreative.app.motion.scene.SceneElementType.$values();
        com.alightcreative.app.motion.scene.SceneElementType.$VALUES = v0_13;
        com.alightcreative.app.motion.scene.SceneElementType.$ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(v0_13);
        return;
    }

    private SceneElementType(String p1, int p2, com.alightcreative.app.motion.scene.ISceneElementType p3)
    {
        super(p1, p2);
        super.impl = p3;
        return;
    }

    public static kotlin.enums.EnumEntries getEntries()
    {
        return com.alightcreative.app.motion.scene.SceneElementType.$ENTRIES;
    }

    public static com.alightcreative.app.motion.scene.SceneElementType valueOf(String p1)
    {
        return ((com.alightcreative.app.motion.scene.SceneElementType) Enum.valueOf(com.alightcreative.app.motion.scene.SceneElementType, p1));
    }

    public static com.alightcreative.app.motion.scene.SceneElementType[] values()
    {
        return ((com.alightcreative.app.motion.scene.SceneElementType[]) com.alightcreative.app.motion.scene.SceneElementType.$VALUES.clone());
    }

    public boolean getHasBlendingMode()
    {
        return this.impl.getHasBlendingMode();
    }

    public boolean getHasBorderAndShadow()
    {
        return this.impl.getHasBorderAndShadow();
    }

    public boolean getHasFillColor()
    {
        return this.impl.getHasFillColor();
    }

    public boolean getHasFillGradient()
    {
        return this.impl.getHasFillGradient();
    }

    public boolean getHasFillImage()
    {
        return this.impl.getHasFillImage();
    }

    public boolean getHasFillType()
    {
        return this.impl.getHasFillType();
    }

    public boolean getHasFillVideo()
    {
        return this.impl.getHasFillVideo();
    }

    public boolean getHasGain()
    {
        return this.impl.getHasGain();
    }

    public boolean getHasNestedScene()
    {
        return this.impl.getHasNestedScene();
    }

    public boolean getHasOpacity()
    {
        return this.impl.getHasOpacity();
    }

    public boolean getHasOutline()
    {
        return this.impl.getHasOutline();
    }

    public boolean getHasSourceMedia()
    {
        return this.impl.getHasSourceMedia();
    }

    public boolean getHasStroke()
    {
        return this.impl.getHasStroke();
    }

    public boolean getHasText()
    {
        return this.impl.getHasText();
    }

    public boolean getHasTransform()
    {
        return this.impl.getHasTransform();
    }

    public boolean getHasVisualContent()
    {
        return this.impl.getHasVisualContent();
    }

    public boolean getHasVisualEffects()
    {
        return this.impl.getHasVisualEffects();
    }

    public boolean getHasVolume()
    {
        return this.impl.getHasVolume();
    }

    public final com.alightcreative.app.motion.scene.ISceneElementType getImpl()
    {
        return this.impl;
    }

    public String getXmlTag()
    {
        return this.impl.getXmlTag();
    }

    public boolean isRenderable()
    {
        return this.impl.isRenderable();
    }

    public void render(com.alightcreative.app.motion.scene.SceneElement p8, oEu.q p9, com.alightcreative.app.motion.scene.rendering.RenderEnvironment p10, com.alightcreative.app.motion.scene.SceneSelection p11, com.alightcreative.app.motion.scene.Rectangle p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "el");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "canvas");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "env");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "selection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "viewport");
        this.impl.render(p8, p9, p10, p11, p12);
        return;
    }

    public void renderOutline(com.alightcreative.app.motion.scene.SceneElement p8, oEu.q p9, com.alightcreative.app.motion.scene.rendering.RenderEnvironment p10, com.alightcreative.app.motion.scene.SceneSelection p11, com.alightcreative.app.motion.scene.Rectangle p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "el");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "canvas");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "env");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "selection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "viewport");
        this.impl.renderOutline(p8, p9, p10, p11, p12);
        return;
    }

    public void renderSelection(com.alightcreative.app.motion.scene.SceneElement p8, oEu.q p9, com.alightcreative.app.motion.scene.rendering.RenderEnvironment p10, com.alightcreative.app.motion.scene.SceneSelection p11, com.alightcreative.app.motion.scene.Rectangle p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "el");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "canvas");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "env");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "selection");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "viewport");
        this.impl.renderSelection(p8, p9, p10, p11, p12);
        return;
    }

    public void serialize(com.alightcreative.app.motion.scene.SceneElement p2, String p3, org.xmlpull.v1.XmlSerializer p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "el");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "serializer");
        this.impl.serialize(p2, p3, p4);
        return;
    }

    public com.alightcreative.app.motion.scene.SceneElement unserializeElement(String p2, org.xmlpull.v1.XmlPullParser p3, boolean p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "parser");
        return this.impl.unserializeElement(p2, p3, p4);
    }
}
