package com.alightcreative.app.motion.scene;
public final class SceneElement {
    public static final int $stable = 8;
    private int _hashCode;
    private final com.alightcreative.app.motion.scene.BlendingMode blendingMode;
    private final java.util.List borders;
    private final com.alightcreative.app.motion.scene.CameraProperties cameraProperties;
    private final boolean clippingMask;
    private final com.alightcreative.app.motion.scene.Drawing drawing;
    private final com.alightcreative.app.motion.scene.KeyableEdgeDecoration dropShadow;
    private final int endTime;
    private final com.alightcreative.app.motion.scene.EngineState engineState;
    private final com.alightcreative.app.motion.scene.Keyable fillColor;
    private final com.alightcreative.app.motion.scene.GradientFill fillGradient;
    private final android.net.Uri fillImage;
    private final com.alightcreative.app.motion.scene.FillType fillType;
    private final android.net.Uri fillVideo;
    private final com.alightcreative.app.motion.scene.Keyable gain;
    private final boolean hidden;
    private final long id;
    private final int inTime;
    private final String label;
    private final java.util.UUID linkedSceneUUID;
    private final com.alightcreative.app.motion.scene.liveshape.LiveShapeRef liveShape;
    private final boolean loop;
    private final com.alightcreative.app.motion.scene.rendering.TextureCropMode mediaFillMode;
    private final com.alightcreative.app.motion.scene.Scene nestedScene;
    private final kotlin.Lazy nestedSceneSpeedFactor$delegate;
    private final int outTime;
    private final com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline outline;
    private final Long parent;
    private final String presetId;
    private final com.alightcreative.app.motion.scene.Keyable speedMap;
    private final android.net.Uri src;
    private final int startTime;
    private final com.alightcreative.app.motion.scene.KeyableEdgeDecoration stroke;
    private final com.alightcreative.app.motion.scene.ElementTag tag;
    private final String templatePPId;
    private final com.alightcreative.app.motion.scene.StyledText text;
    private final kotlin.Lazy timeMapping$delegate;
    private final com.alightcreative.app.motion.scene.KeyableTransform transform;
    private final com.alightcreative.app.motion.scene.SceneElementType type;
    private final java.util.Map userElementParamValues;
    private final java.util.List visualEffectOrder;
    private final java.util.Map visualEffects;

    static SceneElement()
    {
        return;
    }

    public SceneElement(com.alightcreative.app.motion.scene.SceneElementType p17, int p18, int p19, long p20, com.alightcreative.app.motion.scene.EngineState p22, String p23, com.alightcreative.app.motion.scene.KeyableTransform p24, com.alightcreative.app.motion.scene.Keyable p25, android.net.Uri p26, android.net.Uri p27, com.alightcreative.app.motion.scene.GradientFill p28, com.alightcreative.app.motion.scene.FillType p29, com.alightcreative.app.motion.scene.rendering.TextureCropMode p30, com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline p31, android.net.Uri p32, com.alightcreative.app.motion.scene.Keyable p33, com.alightcreative.app.motion.scene.liveshape.LiveShapeRef p34, int p35, int p36, boolean p37, com.alightcreative.app.motion.scene.Keyable p38, com.alightcreative.app.motion.scene.StyledText p39, com.alightcreative.app.motion.scene.BlendingMode p40, com.alightcreative.app.motion.scene.Scene p41, java.util.UUID p42, java.util.Map p43, java.util.List p44, com.alightcreative.app.motion.scene.ElementTag p45, com.alightcreative.app.motion.scene.Drawing p46, java.util.Map p47, com.alightcreative.app.motion.scene.KeyableEdgeDecoration p48, java.util.List p49, com.alightcreative.app.motion.scene.KeyableEdgeDecoration p50, boolean p51, com.alightcreative.app.motion.scene.CameraProperties p52, Long p53, boolean p54, String p55, String p56)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p22, "engineState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p23, "label");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p24, "transform");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p25, "fillColor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p28, "fillGradient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p29, "fillType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p30, "mediaFillMode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p31, "outline");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p32, "src");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p33, "speedMap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p34, "liveShape");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p38, "gain");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p39, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p40, "blendingMode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p41, "nestedScene");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p43, "visualEffects");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p44, "visualEffectOrder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p45, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p46, "drawing");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p47, "userElementParamValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p48, "stroke");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p49, "borders");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p50, "dropShadow");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p52, "cameraProperties");
        com.alightcreative.app.motion.scene.SceneElement v0_25 = ;
v0_25.type = p17;
        v0_25.startTime = p18;
        v0_25.endTime = p19;
        v0_25.id = p20;
        v0_25.engineState = p22;
        v0_25.label = p23;
        v0_25.transform = p24;
        v0_25.fillColor = p25;
        v0_25.fillImage = p26;
        v0_25.fillVideo = p27;
        v0_25.fillGradient = p28;
        v0_25.fillType = p29;
        v0_25.mediaFillMode = p30;
        v0_25.outline = p31;
        v0_25.src = p32;
        v0_25.speedMap = p33;
        v0_25.liveShape = p34;
        v0_25.inTime = p35;
        v0_25.outTime = p36;
        v0_25.loop = p37;
        v0_25.gain = p38;
        v0_25.text = p39;
        v0_25.blendingMode = p40;
        v0_25.nestedScene = p41;
        v0_25.linkedSceneUUID = p42;
        v0_25.visualEffects = p43;
        v0_25.visualEffectOrder = p44;
        v0_25.tag = p45;
        v0_25.drawing = p46;
        v0_25.userElementParamValues = p47;
        v0_25.stroke = p48;
        v0_25.borders = p49;
        v0_25.dropShadow = p50;
        v0_25.hidden = p51;
        v0_25.cameraProperties = p52;
        v0_25.parent = p53;
        v0_25.clippingMask = p54;
        v0_25.templatePPId = p55;
        v0_25.presetId = p56;
        v0_25.nestedSceneSpeedFactor$delegate = kotlin.LazyKt.lazy(new com.alightcreative.app.motion.scene.n(v0_25));
        v0_25.timeMapping$delegate = kotlin.LazyKt.lazy(new com.alightcreative.app.motion.scene.Bt(v0_25));
        return;
    }

    public synthetic SceneElement(com.alightcreative.app.motion.scene.SceneElementType p45, int p46, int p47, long p48, com.alightcreative.app.motion.scene.EngineState p50, String p51, com.alightcreative.app.motion.scene.KeyableTransform p52, com.alightcreative.app.motion.scene.Keyable p53, android.net.Uri p54, android.net.Uri p55, com.alightcreative.app.motion.scene.GradientFill p56, com.alightcreative.app.motion.scene.FillType p57, com.alightcreative.app.motion.scene.rendering.TextureCropMode p58, com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline p59, android.net.Uri p60, com.alightcreative.app.motion.scene.Keyable p61, com.alightcreative.app.motion.scene.liveshape.LiveShapeRef p62, int p63, int p64, boolean p65, com.alightcreative.app.motion.scene.Keyable p66, com.alightcreative.app.motion.scene.StyledText p67, com.alightcreative.app.motion.scene.BlendingMode p68, com.alightcreative.app.motion.scene.Scene p69, java.util.UUID p70, java.util.Map p71, java.util.List p72, com.alightcreative.app.motion.scene.ElementTag p73, com.alightcreative.app.motion.scene.Drawing p74, java.util.Map p75, com.alightcreative.app.motion.scene.KeyableEdgeDecoration p76, java.util.List p77, com.alightcreative.app.motion.scene.KeyableEdgeDecoration p78, boolean p79, com.alightcreative.app.motion.scene.CameraProperties p80, Long p81, boolean p82, String p83, String p84, int p85, int p86, kotlin.jvm.internal.DefaultConstructorMarker p87)
    {
        com.alightcreative.app.motion.scene.KeyableTransform v11_1;
        if ((p85 & 64) == 0) {
            v11_1 = p52;
        } else {
            v11_1 = new com.alightcreative.app.motion.scene.KeyableTransform(com.alightcreative.app.motion.scene.KeyableKt.keyable(com.alightcreative.app.motion.scene.Vector3D.Companion.getZERO()), 0, 0, 0, 0, 0, 0, 0, 0, 510, 0);
        }
        com.alightcreative.app.motion.scene.Keyable v12_1;
        if ((p85 & 128) == 0) {
            v12_1 = p53;
        } else {
            v12_1 = com.alightcreative.app.motion.scene.KeyableKt.keyable(new com.alightcreative.app.motion.scene.SolidColor(0, 0, 0, 0, 8, 0));
        }
        android.net.Uri v13_1;
        if ((p85 & 256) == 0) {
            v13_1 = p54;
        } else {
            v13_1 = 0;
        }
        android.net.Uri v14;
        if ((p85 & 512) == 0) {
            v14 = p55;
        } else {
            v14 = 0;
        }
        com.alightcreative.app.motion.scene.GradientFill v15;
        if ((p85 & 1024) == 0) {
            v15 = p56;
        } else {
            v15 = com.alightcreative.app.motion.scene.GradientFill.Companion.getDEFAULT();
        }
        com.alightcreative.app.motion.scene.FillType v16;
        if ((p85 & 2048) == 0) {
            v16 = p57;
        } else {
            v16 = com.alightcreative.app.motion.scene.FillType.NONE;
        }
        com.alightcreative.app.motion.scene.rendering.TextureCropMode v17;
        if ((p85 & 4096) == 0) {
            v17 = p58;
        } else {
            v17 = com.alightcreative.app.motion.scene.rendering.TextureCropMode.FILL;
        }
        com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline v18;
        if ((p85 & 8192) == 0) {
            v18 = p59;
        } else {
            v18 = com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline.Companion.getEMPTY();
        }
        android.net.Uri v19;
        if ((p85 & 16384) == 0) {
            v19 = p60;
        } else {
            v19 = android.net.Uri.EMPTY;
        }
        com.alightcreative.app.motion.scene.Keyable v20;
        if ((32768 & p85) == 0) {
            v20 = p61;
        } else {
            v20 = com.alightcreative.app.motion.scene.KeyableKt.keyable(1065353216);
        }
        com.alightcreative.app.motion.scene.liveshape.LiveShapeRef v21;
        if ((65536 & p85) == 0) {
            v21 = p62;
        } else {
            v21 = com.alightcreative.app.motion.scene.liveshape.LiveShapeRef.Companion.getNONE();
        }
        com.alightcreative.app.motion.scene.Keyable v25;
        if ((1048576 & p85) == 0) {
            v25 = p66;
        } else {
            v25 = com.alightcreative.app.motion.scene.KeyableKt.keyable(1065353216);
        }
        com.alightcreative.app.motion.scene.StyledText v26;
        if ((2097152 & p85) == 0) {
            v26 = p67;
        } else {
            int v1_1 = new com.alightcreative.app.motion.scene.StyledText;
            v1_1(0, 0, 0, 0, 0, 31, 0);
            v26 = v1_1;
        }
        com.alightcreative.app.motion.scene.BlendingMode v27;
        if ((4194304 & p85) == 0) {
            v27 = p68;
        } else {
            v27 = com.alightcreative.app.motion.scene.BlendingMode.NORMAL;
        }
        com.alightcreative.app.motion.scene.Scene v28;
        if ((8388608 & p85) == 0) {
            v28 = p69;
        } else {
            v28 = com.alightcreative.app.motion.scene.SceneKt.getEMPTY_SCENE();
        }
        java.util.UUID v29;
        if ((16777216 & p85) == 0) {
            v29 = p70;
        } else {
            v29 = 0;
        }
        java.util.Map v30;
        if ((33554432 & p85) == 0) {
            v30 = p71;
        } else {
            v30 = kotlin.collections.MapsKt.emptyMap();
        }
        java.util.List v31;
        if ((67108864 & p85) == 0) {
            v31 = p72;
        } else {
            v31 = kotlin.collections.CollectionsKt.emptyList();
        }
        com.alightcreative.app.motion.scene.ElementTag v32;
        if ((134217728 & p85) == 0) {
            v32 = p73;
        } else {
            v32 = com.alightcreative.app.motion.scene.ElementTag.NONE;
        }
        com.alightcreative.app.motion.scene.Drawing v33;
        if ((268435456 & p85) == 0) {
            v33 = p74;
        } else {
            v33 = com.alightcreative.app.motion.scene.Drawing.Companion.getEMPTY();
        }
        java.util.Map v34;
        if ((536870912 & p85) == 0) {
            v34 = p75;
        } else {
            v34 = kotlin.collections.MapsKt.emptyMap();
        }
        com.alightcreative.app.motion.scene.KeyableEdgeDecoration v35;
        if ((1073741824 & p85) == 0) {
            v35 = p76;
        } else {
            v35 = com.alightcreative.app.motion.scene.KeyableEdgeDecoration.Companion.getNO_STROKE();
        }
        java.util.List v36;
        if ((p85 & -2147483648) == 0) {
            v36 = p77;
        } else {
            v36 = kotlin.collections.CollectionsKt.emptyList();
        }
        com.alightcreative.app.motion.scene.KeyableEdgeDecoration v37;
        if ((p86 & 1) == 0) {
            v37 = p78;
        } else {
            v37 = com.alightcreative.app.motion.scene.KeyableEdgeDecoration.Companion.getNO_SHADOW();
        }
        boolean v38;
        if ((p86 & 2) == 0) {
            v38 = p79;
        } else {
            v38 = 0;
        }
        com.alightcreative.app.motion.scene.CameraProperties v39;
        if ((p86 & 4) == 0) {
            v39 = p80;
        } else {
            v39 = com.alightcreative.app.motion.scene.CameraProperties.Companion.getDEFAULT();
        }
        Long v40;
        if ((p86 & 8) == 0) {
            v40 = p81;
        } else {
            v40 = 0;
        }
        boolean v41;
        if ((p86 & 16) == 0) {
            v41 = p82;
        } else {
            v41 = 0;
        }
        String v42;
        if ((p86 & 32) == 0) {
            v42 = p83;
        } else {
            v42 = 0;
        }
        String v43;
        if ((p86 & 64) == 0) {
            v43 = p84;
        } else {
            v43 = 0;
        }
        this(p45, p46, p47, p48, p50, p51, v11_1, v12_1, v13_1, v14, v15, v16, v17, v18, v19, v20, v21, p63, p64, p65, v25, v26, v27, v28, v29, v30, v31, v32, v33, v34, v35, v36, v37, v38, v39, v40, v41, v42, v43);
        return;
    }

    public static synthetic com.alightcreative.app.motion.scene.SceneElement copy$default(com.alightcreative.app.motion.scene.SceneElement p17, com.alightcreative.app.motion.scene.SceneElementType p18, int p19, int p20, long p21, com.alightcreative.app.motion.scene.EngineState p23, String p24, com.alightcreative.app.motion.scene.KeyableTransform p25, com.alightcreative.app.motion.scene.Keyable p26, android.net.Uri p27, android.net.Uri p28, com.alightcreative.app.motion.scene.GradientFill p29, com.alightcreative.app.motion.scene.FillType p30, com.alightcreative.app.motion.scene.rendering.TextureCropMode p31, com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline p32, android.net.Uri p33, com.alightcreative.app.motion.scene.Keyable p34, com.alightcreative.app.motion.scene.liveshape.LiveShapeRef p35, int p36, int p37, boolean p38, com.alightcreative.app.motion.scene.Keyable p39, com.alightcreative.app.motion.scene.StyledText p40, com.alightcreative.app.motion.scene.BlendingMode p41, com.alightcreative.app.motion.scene.Scene p42, java.util.UUID p43, java.util.Map p44, java.util.List p45, com.alightcreative.app.motion.scene.ElementTag p46, com.alightcreative.app.motion.scene.Drawing p47, java.util.Map p48, com.alightcreative.app.motion.scene.KeyableEdgeDecoration p49, java.util.List p50, com.alightcreative.app.motion.scene.KeyableEdgeDecoration p51, boolean p52, com.alightcreative.app.motion.scene.CameraProperties p53, Long p54, boolean p55, String p56, String p57, int p58, int p59, Object p60)
    {
        android.net.Uri v2_1;
        if ((p58 & 1) == 0) {
            v2_1 = p18;
        } else {
            v2_1 = p17.type;
        }
        int v3_1;
        if ((p58 & 2) == 0) {
            v3_1 = p19;
        } else {
            v3_1 = p17.startTime;
        }
        int v4_1;
        if ((p58 & 4) == 0) {
            v4_1 = p20;
        } else {
            v4_1 = p17.endTime;
        }
        long v5_1;
        if ((p58 & 8) == 0) {
            v5_1 = p21;
        } else {
            v5_1 = p17.id;
        }
        com.alightcreative.app.motion.scene.EngineState v7_1;
        if ((p58 & 16) == 0) {
            v7_1 = p23;
        } else {
            v7_1 = p17.engineState;
        }
        String v8_1;
        if ((p58 & 32) == 0) {
            v8_1 = p24;
        } else {
            v8_1 = p17.label;
        }
        com.alightcreative.app.motion.scene.KeyableTransform v9_1;
        if ((p58 & 64) == 0) {
            v9_1 = p25;
        } else {
            v9_1 = p17.transform;
        }
        com.alightcreative.app.motion.scene.Keyable v10_1;
        if ((p58 & 128) == 0) {
            v10_1 = p26;
        } else {
            v10_1 = p17.fillColor;
        }
        android.net.Uri v11_1;
        if ((p58 & 256) == 0) {
            v11_1 = p27;
        } else {
            v11_1 = p17.fillImage;
        }
        android.net.Uri v12_1;
        if ((p58 & 512) == 0) {
            v12_1 = p28;
        } else {
            v12_1 = p17.fillVideo;
        }
        com.alightcreative.app.motion.scene.GradientFill v13_1;
        if ((p58 & 1024) == 0) {
            v13_1 = p29;
        } else {
            v13_1 = p17.fillGradient;
        }
        com.alightcreative.app.motion.scene.FillType v14_1;
        if ((p58 & 2048) == 0) {
            v14_1 = p30;
        } else {
            v14_1 = p17.fillType;
        }
        com.alightcreative.app.motion.scene.rendering.TextureCropMode v15_1;
        if ((p58 & 4096) == 0) {
            v15_1 = p31;
        } else {
            v15_1 = p17.mediaFillMode;
        }
        android.net.Uri v2_3;
        if ((p58 & 8192) == 0) {
            v2_3 = p32;
        } else {
            v2_3 = p17.outline;
        }
        android.net.Uri v2_5;
        com.alightcreative.app.motion.scene.SceneElementType v19_2 = v2_3;
        if ((p58 & 16384) == 0) {
            v2_5 = p33;
        } else {
            v2_5 = p17.src;
        }
        String v1_19;
        if ((p58 & 32768) == 0) {
            v1_19 = p34;
        } else {
            v1_19 = p17.speedMap;
        }
        String v1_20;
        int v20_2 = v1_19;
        if ((p58 & 65536) == 0) {
            v1_20 = p35;
        } else {
            v1_20 = p17.liveShape;
        }
        String v1_21;
        int v21_2 = v1_20;
        if ((p58 & 131072) == 0) {
            v1_21 = p36;
        } else {
            v1_21 = p17.inTime;
        }
        String v1_22;
        long v22_1 = v1_21;
        if ((p58 & 262144) == 0) {
            v1_22 = p37;
        } else {
            v1_22 = p17.outTime;
        }
        String v1_23;
        int v23_1 = v1_22;
        if ((p58 & 524288) == 0) {
            v1_23 = p38;
        } else {
            v1_23 = p17.loop;
        }
        String v1_24;
        com.alightcreative.app.motion.scene.EngineState v24_2 = v1_23;
        if ((p58 & 1048576) == 0) {
            v1_24 = p39;
        } else {
            v1_24 = p17.gain;
        }
        String v1_1;
        String v25_1 = v1_24;
        if ((p58 & 2097152) == 0) {
            v1_1 = p40;
        } else {
            v1_1 = p17.text;
        }
        String v1_2;
        com.alightcreative.app.motion.scene.KeyableTransform v26_1 = v1_1;
        if ((p58 & 4194304) == 0) {
            v1_2 = p41;
        } else {
            v1_2 = p17.blendingMode;
        }
        String v1_3;
        com.alightcreative.app.motion.scene.Keyable v27_1 = v1_2;
        if ((p58 & 8388608) == 0) {
            v1_3 = p42;
        } else {
            v1_3 = p17.nestedScene;
        }
        String v1_4;
        android.net.Uri v28_1 = v1_3;
        if ((p58 & 16777216) == 0) {
            v1_4 = p43;
        } else {
            v1_4 = p17.linkedSceneUUID;
        }
        String v1_5;
        android.net.Uri v29_1 = v1_4;
        if ((p58 & 33554432) == 0) {
            v1_5 = p44;
        } else {
            v1_5 = p17.visualEffects;
        }
        String v1_6;
        com.alightcreative.app.motion.scene.GradientFill v30_1 = v1_5;
        if ((p58 & 67108864) == 0) {
            v1_6 = p45;
        } else {
            v1_6 = p17.visualEffectOrder;
        }
        String v1_7;
        com.alightcreative.app.motion.scene.FillType v31_1 = v1_6;
        if ((p58 & 134217728) == 0) {
            v1_7 = p46;
        } else {
            v1_7 = p17.tag;
        }
        String v1_8;
        com.alightcreative.app.motion.scene.rendering.TextureCropMode v32_1 = v1_7;
        if ((p58 & 268435456) == 0) {
            v1_8 = p47;
        } else {
            v1_8 = p17.drawing;
        }
        String v1_9;
        com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline v33_1 = v1_8;
        if ((p58 & 536870912) == 0) {
            v1_9 = p48;
        } else {
            v1_9 = p17.userElementParamValues;
        }
        String v1_10;
        android.net.Uri v34_1 = v1_9;
        if ((p58 & 1073741824) == 0) {
            v1_10 = p49;
        } else {
            v1_10 = p17.stroke;
        }
        String v1_11;
        int v35_1 = v1_10;
        if ((p58 & -2147483648) == 0) {
            v1_11 = p50;
        } else {
            v1_11 = p17.borders;
        }
        String v1_12;
        int v36_1 = v1_11;
        if ((p59 & 1) == 0) {
            v1_12 = p51;
        } else {
            v1_12 = p17.dropShadow;
        }
        String v1_13;
        long v37_1 = v1_12;
        if ((p59 & 2) == 0) {
            v1_13 = p52;
        } else {
            v1_13 = p17.hidden;
        }
        String v1_14;
        int v38_1 = v1_13;
        if ((p59 & 4) == 0) {
            v1_14 = p53;
        } else {
            v1_14 = p17.cameraProperties;
        }
        String v1_15;
        com.alightcreative.app.motion.scene.EngineState v39_1 = v1_14;
        if ((p59 & 8) == 0) {
            v1_15 = p54;
        } else {
            v1_15 = p17.parent;
        }
        String v1_16;
        String v40_1 = v1_15;
        if ((p59 & 16) == 0) {
            v1_16 = p55;
        } else {
            v1_16 = p17.clippingMask;
        }
        String v1_17;
        com.alightcreative.app.motion.scene.KeyableTransform v41_1 = v1_16;
        if ((p59 & 32) == 0) {
            v1_17 = p56;
        } else {
            v1_17 = p17.templatePPId;
        }
        android.net.Uri v28_2;
        com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline v48_1;
        android.net.Uri v34_2;
        String v58_1;
        android.net.Uri v49_1;
        String v40_2;
        android.net.Uri v29_2;
        int v35_2;
        com.alightcreative.app.motion.scene.EngineState v24_1;
        com.alightcreative.app.motion.scene.KeyableTransform v41_2;
        com.alightcreative.app.motion.scene.Keyable v50_1;
        com.alightcreative.app.motion.scene.Keyable v42_1;
        int v36_2;
        com.alightcreative.app.motion.scene.liveshape.LiveShapeRef v51_1;
        com.alightcreative.app.motion.scene.GradientFill v30_2;
        android.net.Uri v43_1;
        int v52_1;
        String v25_2;
        long v37_2;
        com.alightcreative.app.motion.scene.FillType v31_2;
        android.net.Uri v44_1;
        int v53_1;
        long v22_0;
        com.alightcreative.app.motion.scene.KeyableTransform v26_2;
        int v38_2;
        com.alightcreative.app.motion.scene.GradientFill v45_1;
        boolean v54_1;
        com.alightcreative.app.motion.scene.rendering.TextureCropMode v32_2;
        int v20_1;
        com.alightcreative.app.motion.scene.FillType v46_1;
        com.alightcreative.app.motion.scene.Keyable v55_1;
        com.alightcreative.app.motion.scene.Keyable v27_2;
        com.alightcreative.app.motion.scene.EngineState v39_2;
        com.alightcreative.app.motion.scene.rendering.TextureCropMode v47_1;
        com.alightcreative.app.motion.scene.StyledText v56_1;
        com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline v33_2;
        int v21_1;
        String v57_1;
        if ((p59 & 64) == 0) {
            v58_1 = p57;
            v57_1 = v1_17;
            v42_1 = v27_1;
            v43_1 = v28_1;
            v44_1 = v29_1;
            v45_1 = v30_1;
            v46_1 = v31_1;
            v47_1 = v32_1;
            v48_1 = v33_1;
            v49_1 = v34_1;
            v50_1 = v35_1;
            v51_1 = v36_1;
            v52_1 = v37_1;
            v53_1 = v38_1;
            v54_1 = v39_1;
            v55_1 = v40_1;
            v56_1 = v41_1;
            v34_2 = v2_5;
            v27_2 = v10_1;
            v28_2 = v11_1;
            v29_2 = v12_1;
            v30_2 = v13_1;
            v31_2 = v14_1;
            v32_2 = v15_1;
            v33_2 = v19_2;
            v35_2 = v20_2;
            v36_2 = v21_2;
            v37_2 = v22_1;
            v38_2 = v23_1;
            v39_2 = v24_2;
            v40_2 = v25_1;
            v41_2 = v26_1;
            v20_1 = v3_1;
            v21_1 = v4_1;
            v22_0 = v5_1;
            v24_1 = v7_1;
            v25_2 = v8_1;
            v26_2 = v9_1;
        } else {
            v57_1 = v1_17;
            v58_1 = p17.presetId;
            v43_1 = v28_1;
            v44_1 = v29_1;
            v45_1 = v30_1;
            v46_1 = v31_1;
            v47_1 = v32_1;
            v48_1 = v33_1;
            v49_1 = v34_1;
            v50_1 = v35_1;
            v51_1 = v36_1;
            v52_1 = v37_1;
            v53_1 = v38_1;
            v54_1 = v39_1;
            v55_1 = v40_1;
            v56_1 = v41_1;
            v34_2 = v2_5;
            v28_2 = v11_1;
            v29_2 = v12_1;
            v30_2 = v13_1;
            v31_2 = v14_1;
            v32_2 = v15_1;
            v33_2 = v19_2;
            v35_2 = v20_2;
            v36_2 = v21_2;
            v37_2 = v22_1;
            v38_2 = v23_1;
            v39_2 = v24_2;
            v40_2 = v25_1;
            v41_2 = v26_1;
            v42_1 = v27_1;
            v20_1 = v3_1;
            v21_1 = v4_1;
            v22_0 = v5_1;
            v24_1 = v7_1;
            v25_2 = v8_1;
            v26_2 = v9_1;
            v27_2 = v10_1;
        }
        return p17.copy(v2_1, v20_1, v21_1, v22_0, v24_1, v25_2, v26_2, v27_2, v28_2, v29_2, v30_2, v31_2, v32_2, v33_2, v34_2, v35_2, v36_2, v37_2, v38_2, v39_2, v40_2, v41_2, v42_1, v43_1, v44_1, v45_1, v46_1, v47_1, v48_1, v49_1, v50_1, v51_1, v52_1, v53_1, v54_1, v55_1, v56_1, v57_1, v58_1);
    }

    public static synthetic com.alightcreative.app.motion.scene.timemapping.TimeMapping hUw(com.alightcreative.app.motion.scene.SceneElement p0)
    {
        return com.alightcreative.app.motion.scene.SceneElement.timeMapping_delegate$lambda$3(p0);
    }

    public static synthetic float j(com.alightcreative.app.motion.scene.SceneElement p0)
    {
        return com.alightcreative.app.motion.scene.SceneElement.nestedSceneSpeedFactor_delegate$lambda$2(p0);
    }

    private static final float nestedSceneSpeedFactor_delegate$lambda$2(com.alightcreative.app.motion.scene.SceneElement p2)
    {
        IllegalStateException v0_0 = p2.type;
        if (v0_0 != com.alightcreative.app.motion.scene.SceneElementType.Scene) {
            String v2_11 = new StringBuilder();
            v2_11.append("Speed factor cannot be accessed for elements which are not nested scenes! Element type:");
            v2_11.append(v0_0);
            throw new IllegalStateException(v2_11.toString().toString());
        } else {
            if (p2.speedMap.getKeyed()) {
                String v2_2 = p2.speedMap;
                IllegalStateException v0_6 = new StringBuilder();
                v0_6.append("Incompatible speedValue detected. Expecting a non-keyed keyable! Speed value: ");
                v0_6.append(v2_2);
                throw new IllegalStateException(v0_6.toString().toString());
            } else {
                return ((Number) ((com.alightcreative.app.motion.scene.Keyframe) kotlin.collections.CollectionsKt.first(p2.speedMap.getKeyframes())).getValue()).floatValue();
            }
        }
    }

    private static final com.alightcreative.app.motion.scene.timemapping.TimeMapping timeMapping_delegate$lambda$3(com.alightcreative.app.motion.scene.SceneElement p10)
    {
        return com.alightcreative.app.motion.scene.timemapping.TimeMappingKt.toTimeMapping-Uq-o2Ic$default(p10.speedMap, ZX.h.cD.j(((long) p10.inTime)), ZX.xfY.cD.cD(kotlin.ranges.RangesKt.coerceAtLeast(((long) (p10.endTime - p10.startTime)), 1)), 0, 0, 12, 0);
    }

    public final com.alightcreative.app.motion.scene.SceneElementType component1()
    {
        return this.type;
    }

    public final android.net.Uri component10()
    {
        return this.fillVideo;
    }

    public final com.alightcreative.app.motion.scene.GradientFill component11()
    {
        return this.fillGradient;
    }

    public final com.alightcreative.app.motion.scene.FillType component12()
    {
        return this.fillType;
    }

    public final com.alightcreative.app.motion.scene.rendering.TextureCropMode component13()
    {
        return this.mediaFillMode;
    }

    public final com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline component14()
    {
        return this.outline;
    }

    public final android.net.Uri component15()
    {
        return this.src;
    }

    public final com.alightcreative.app.motion.scene.Keyable component16()
    {
        return this.speedMap;
    }

    public final com.alightcreative.app.motion.scene.liveshape.LiveShapeRef component17()
    {
        return this.liveShape;
    }

    public final int component18()
    {
        return this.inTime;
    }

    public final int component19()
    {
        return this.outTime;
    }

    public final int component2()
    {
        return this.startTime;
    }

    public final boolean component20()
    {
        return this.loop;
    }

    public final com.alightcreative.app.motion.scene.Keyable component21()
    {
        return this.gain;
    }

    public final com.alightcreative.app.motion.scene.StyledText component22()
    {
        return this.text;
    }

    public final com.alightcreative.app.motion.scene.BlendingMode component23()
    {
        return this.blendingMode;
    }

    public final com.alightcreative.app.motion.scene.Scene component24()
    {
        return this.nestedScene;
    }

    public final java.util.UUID component25()
    {
        return this.linkedSceneUUID;
    }

    public final java.util.Map component26()
    {
        return this.visualEffects;
    }

    public final java.util.List component27()
    {
        return this.visualEffectOrder;
    }

    public final com.alightcreative.app.motion.scene.ElementTag component28()
    {
        return this.tag;
    }

    public final com.alightcreative.app.motion.scene.Drawing component29()
    {
        return this.drawing;
    }

    public final int component3()
    {
        return this.endTime;
    }

    public final java.util.Map component30()
    {
        return this.userElementParamValues;
    }

    public final com.alightcreative.app.motion.scene.KeyableEdgeDecoration component31()
    {
        return this.stroke;
    }

    public final java.util.List component32()
    {
        return this.borders;
    }

    public final com.alightcreative.app.motion.scene.KeyableEdgeDecoration component33()
    {
        return this.dropShadow;
    }

    public final boolean component34()
    {
        return this.hidden;
    }

    public final com.alightcreative.app.motion.scene.CameraProperties component35()
    {
        return this.cameraProperties;
    }

    public final Long component36()
    {
        return this.parent;
    }

    public final boolean component37()
    {
        return this.clippingMask;
    }

    public final String component38()
    {
        return this.templatePPId;
    }

    public final String component39()
    {
        return this.presetId;
    }

    public final long component4()
    {
        return this.id;
    }

    public final com.alightcreative.app.motion.scene.EngineState component5()
    {
        return this.engineState;
    }

    public final String component6()
    {
        return this.label;
    }

    public final com.alightcreative.app.motion.scene.KeyableTransform component7()
    {
        return this.transform;
    }

    public final com.alightcreative.app.motion.scene.Keyable component8()
    {
        return this.fillColor;
    }

    public final android.net.Uri component9()
    {
        return this.fillImage;
    }

    public final com.alightcreative.app.motion.scene.SceneElement copy(com.alightcreative.app.motion.scene.SceneElementType p43, int p44, int p45, long p46, com.alightcreative.app.motion.scene.EngineState p48, String p49, com.alightcreative.app.motion.scene.KeyableTransform p50, com.alightcreative.app.motion.scene.Keyable p51, android.net.Uri p52, android.net.Uri p53, com.alightcreative.app.motion.scene.GradientFill p54, com.alightcreative.app.motion.scene.FillType p55, com.alightcreative.app.motion.scene.rendering.TextureCropMode p56, com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline p57, android.net.Uri p58, com.alightcreative.app.motion.scene.Keyable p59, com.alightcreative.app.motion.scene.liveshape.LiveShapeRef p60, int p61, int p62, boolean p63, com.alightcreative.app.motion.scene.Keyable p64, com.alightcreative.app.motion.scene.StyledText p65, com.alightcreative.app.motion.scene.BlendingMode p66, com.alightcreative.app.motion.scene.Scene p67, java.util.UUID p68, java.util.Map p69, java.util.List p70, com.alightcreative.app.motion.scene.ElementTag p71, com.alightcreative.app.motion.scene.Drawing p72, java.util.Map p73, com.alightcreative.app.motion.scene.KeyableEdgeDecoration p74, java.util.List p75, com.alightcreative.app.motion.scene.KeyableEdgeDecoration p76, boolean p77, com.alightcreative.app.motion.scene.CameraProperties p78, Long p79, boolean p80, String p81, String p82)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p43, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p48, "engineState");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p49, "label");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p50, "transform");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p51, "fillColor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p54, "fillGradient");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p55, "fillType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p56, "mediaFillMode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p57, "outline");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p58, "src");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p59, "speedMap");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p60, "liveShape");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p64, "gain");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p65, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p66, S0.sfUe.pHsbRqMPh.gKfHnun);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p67, "nestedScene");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p69, "visualEffects");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p70, "visualEffectOrder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p71, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p72, "drawing");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p73, "userElementParamValues");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p74, "stroke");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p75, "borders");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p76, "dropShadow");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p78, "cameraProperties");
        return new com.alightcreative.app.motion.scene.SceneElement(p43, p44, p45, p46, p48, p49, p50, p51, p52, p53, p54, p55, p56, p57, p58, p59, p60, p61, p62, p63, p64, p65, p66, p67, p68, p69, p70, p71, p72, p73, p74, p75, p76, p77, p78, p79, p80, p81, p82);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.alightcreative.app.motion.scene.SceneElement)) {
                if (this.type == ((com.alightcreative.app.motion.scene.SceneElement) p8).type) {
                    if (this.startTime == ((com.alightcreative.app.motion.scene.SceneElement) p8).startTime) {
                        if (this.endTime == ((com.alightcreative.app.motion.scene.SceneElement) p8).endTime) {
                            if (this.id == ((com.alightcreative.app.motion.scene.SceneElement) p8).id) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.engineState, ((com.alightcreative.app.motion.scene.SceneElement) p8).engineState)) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.label, ((com.alightcreative.app.motion.scene.SceneElement) p8).label)) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.transform, ((com.alightcreative.app.motion.scene.SceneElement) p8).transform)) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.fillColor, ((com.alightcreative.app.motion.scene.SceneElement) p8).fillColor)) {
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.fillImage, ((com.alightcreative.app.motion.scene.SceneElement) p8).fillImage)) {
                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.fillVideo, ((com.alightcreative.app.motion.scene.SceneElement) p8).fillVideo)) {
                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.fillGradient, ((com.alightcreative.app.motion.scene.SceneElement) p8).fillGradient)) {
                                                            if (this.fillType == ((com.alightcreative.app.motion.scene.SceneElement) p8).fillType) {
                                                                if (this.mediaFillMode == ((com.alightcreative.app.motion.scene.SceneElement) p8).mediaFillMode) {
                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.outline, ((com.alightcreative.app.motion.scene.SceneElement) p8).outline)) {
                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.src, ((com.alightcreative.app.motion.scene.SceneElement) p8).src)) {
                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.speedMap, ((com.alightcreative.app.motion.scene.SceneElement) p8).speedMap)) {
                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.liveShape, ((com.alightcreative.app.motion.scene.SceneElement) p8).liveShape)) {
                                                                                    if (this.inTime == ((com.alightcreative.app.motion.scene.SceneElement) p8).inTime) {
                                                                                        if (this.outTime == ((com.alightcreative.app.motion.scene.SceneElement) p8).outTime) {
                                                                                            if (this.loop == ((com.alightcreative.app.motion.scene.SceneElement) p8).loop) {
                                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.gain, ((com.alightcreative.app.motion.scene.SceneElement) p8).gain)) {
                                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.alightcreative.app.motion.scene.SceneElement) p8).text)) {
                                                                                                        if (this.blendingMode == ((com.alightcreative.app.motion.scene.SceneElement) p8).blendingMode) {
                                                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.nestedScene, ((com.alightcreative.app.motion.scene.SceneElement) p8).nestedScene)) {
                                                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.linkedSceneUUID, ((com.alightcreative.app.motion.scene.SceneElement) p8).linkedSceneUUID)) {
                                                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.visualEffects, ((com.alightcreative.app.motion.scene.SceneElement) p8).visualEffects)) {
                                                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.visualEffectOrder, ((com.alightcreative.app.motion.scene.SceneElement) p8).visualEffectOrder)) {
                                                                                                                            if (this.tag == ((com.alightcreative.app.motion.scene.SceneElement) p8).tag) {
                                                                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.drawing, ((com.alightcreative.app.motion.scene.SceneElement) p8).drawing)) {
                                                                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.userElementParamValues, ((com.alightcreative.app.motion.scene.SceneElement) p8).userElementParamValues)) {
                                                                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.stroke, ((com.alightcreative.app.motion.scene.SceneElement) p8).stroke)) {
                                                                                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.borders, ((com.alightcreative.app.motion.scene.SceneElement) p8).borders)) {
                                                                                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.dropShadow, ((com.alightcreative.app.motion.scene.SceneElement) p8).dropShadow)) {
                                                                                                                                                    if (this.hidden == ((com.alightcreative.app.motion.scene.SceneElement) p8).hidden) {
                                                                                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.cameraProperties, ((com.alightcreative.app.motion.scene.SceneElement) p8).cameraProperties)) {
                                                                                                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.parent, ((com.alightcreative.app.motion.scene.SceneElement) p8).parent)) {
                                                                                                                                                                if (this.clippingMask == ((com.alightcreative.app.motion.scene.SceneElement) p8).clippingMask) {
                                                                                                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.templatePPId, ((com.alightcreative.app.motion.scene.SceneElement) p8).templatePPId)) {
                                                                                                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.presetId, ((com.alightcreative.app.motion.scene.SceneElement) p8).presetId)) {
                                                                                                                                                                            return 1;
                                                                                                                                                                        } else {
                                                                                                                                                                            return 0;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        return 0;
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    return 0;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                return 0;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            return 0;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        return 0;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    return 0;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                return 0;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            return 0;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        return 0;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    return 0;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                return 0;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            return 0;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        return 0;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    return 0;
                                                                                                                }
                                                                                                            } else {
                                                                                                                return 0;
                                                                                                            }
                                                                                                        } else {
                                                                                                            return 0;
                                                                                                        }
                                                                                                    } else {
                                                                                                        return 0;
                                                                                                    }
                                                                                                } else {
                                                                                                    return 0;
                                                                                                }
                                                                                            } else {
                                                                                                return 0;
                                                                                            }
                                                                                        } else {
                                                                                            return 0;
                                                                                        }
                                                                                    } else {
                                                                                        return 0;
                                                                                    }
                                                                                } else {
                                                                                    return 0;
                                                                                }
                                                                            } else {
                                                                                return 0;
                                                                            }
                                                                        } else {
                                                                            return 0;
                                                                        }
                                                                    } else {
                                                                        return 0;
                                                                    }
                                                                } else {
                                                                    return 0;
                                                                }
                                                            } else {
                                                                return 0;
                                                            }
                                                        } else {
                                                            return 0;
                                                        }
                                                    } else {
                                                        return 0;
                                                    }
                                                } else {
                                                    return 0;
                                                }
                                            } else {
                                                return 0;
                                            }
                                        } else {
                                            return 0;
                                        }
                                    } else {
                                        return 0;
                                    }
                                } else {
                                    return 0;
                                }
                            } else {
                                return 0;
                            }
                        } else {
                            return 0;
                        }
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final com.alightcreative.app.motion.scene.BlendingMode getBlendingMode()
    {
        return this.blendingMode;
    }

    public final java.util.List getBorders()
    {
        return this.borders;
    }

    public final com.alightcreative.app.motion.scene.CameraProperties getCameraProperties()
    {
        return this.cameraProperties;
    }

    public final boolean getClippingMask()
    {
        return this.clippingMask;
    }

    public final com.alightcreative.app.motion.scene.Drawing getDrawing()
    {
        return this.drawing;
    }

    public final com.alightcreative.app.motion.scene.KeyableEdgeDecoration getDropShadow()
    {
        return this.dropShadow;
    }

    public final int getEndTime()
    {
        return this.endTime;
    }

    public final com.alightcreative.app.motion.scene.EngineState getEngineState()
    {
        return this.engineState;
    }

    public final com.alightcreative.app.motion.scene.Keyable getFillColor()
    {
        return this.fillColor;
    }

    public final com.alightcreative.app.motion.scene.GradientFill getFillGradient()
    {
        return this.fillGradient;
    }

    public final android.net.Uri getFillImage()
    {
        return this.fillImage;
    }

    public final com.alightcreative.app.motion.scene.FillType getFillType()
    {
        return this.fillType;
    }

    public final android.net.Uri getFillVideo()
    {
        return this.fillVideo;
    }

    public final com.alightcreative.app.motion.scene.Keyable getGain()
    {
        return this.gain;
    }

    public final boolean getHidden()
    {
        return this.hidden;
    }

    public final long getId()
    {
        return this.id;
    }

    public final int getInTime()
    {
        return this.inTime;
    }

    public final String getLabel()
    {
        return this.label;
    }

    public final java.util.UUID getLinkedSceneUUID()
    {
        return this.linkedSceneUUID;
    }

    public final com.alightcreative.app.motion.scene.liveshape.LiveShapeRef getLiveShape()
    {
        return this.liveShape;
    }

    public final boolean getLoop()
    {
        return this.loop;
    }

    public final com.alightcreative.app.motion.scene.rendering.TextureCropMode getMediaFillMode()
    {
        return this.mediaFillMode;
    }

    public final com.alightcreative.app.motion.scene.Scene getNestedScene()
    {
        return this.nestedScene;
    }

    public final float getNestedSceneSpeedFactor()
    {
        return ((Number) this.nestedSceneSpeedFactor$delegate.getValue()).floatValue();
    }

    public final int getOutTime()
    {
        return this.outTime;
    }

    public final com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline getOutline()
    {
        return this.outline;
    }

    public final Long getParent()
    {
        return this.parent;
    }

    public final String getPresetId()
    {
        return this.presetId;
    }

    public final com.alightcreative.app.motion.scene.Keyable getSpeedMap()
    {
        return this.speedMap;
    }

    public final android.net.Uri getSrc()
    {
        return this.src;
    }

    public final int getStartTime()
    {
        return this.startTime;
    }

    public final com.alightcreative.app.motion.scene.KeyableEdgeDecoration getStroke()
    {
        return this.stroke;
    }

    public final com.alightcreative.app.motion.scene.ElementTag getTag()
    {
        return this.tag;
    }

    public final String getTemplatePPId()
    {
        return this.templatePPId;
    }

    public final com.alightcreative.app.motion.scene.StyledText getText()
    {
        return this.text;
    }

    public final com.alightcreative.app.motion.scene.Keyable getTimeKeyframes()
    {
        return this.getTimeMapping().getItemKeyable();
    }

    public final com.alightcreative.app.motion.scene.timemapping.TimeMapping getTimeMapping()
    {
        return ((com.alightcreative.app.motion.scene.timemapping.TimeMapping) this.timeMapping$delegate.getValue());
    }

    public final com.alightcreative.app.motion.scene.KeyableTransform getTransform()
    {
        return this.transform;
    }

    public final com.alightcreative.app.motion.scene.SceneElementType getType()
    {
        return this.type;
    }

    public final java.util.Map getUserElementParamValues()
    {
        return this.userElementParamValues;
    }

    public final java.util.List getVisualEffectOrder()
    {
        return this.visualEffectOrder;
    }

    public final java.util.Map getVisualEffects()
    {
        return this.visualEffects;
    }

    public int hashCode()
    {
        int v0_0 = this._hashCode;
        if (v0_0 == 0) {
            Long v1_37;
            int v0_40 = (((((((((((((this.type.hashCode() * 31) + this.startTime) * 31) + this.endTime) * 31) + Long.hashCode(this.id)) * 31) + this.label.hashCode()) * 31) + this.transform.hashCode()) * 31) + this.fillColor.hashCode()) * 31);
            Long v1_36 = this.fillImage;
            int v2 = 0;
            if (v1_36 == null) {
                v1_37 = 0;
            } else {
                v1_37 = v1_36.hashCode();
            }
            Long v1_39;
            int v0_42 = ((v0_40 + v1_37) * 31);
            Long v1_38 = this.fillVideo;
            if (v1_38 == null) {
                v1_39 = 0;
            } else {
                v1_39 = v1_38.hashCode();
            }
            Long v1_4;
            int v0_5 = ((((((((((((((((((((((((((((v0_42 + v1_39) * 31) + this.fillGradient.hashCode()) * 31) + this.fillType.hashCode()) * 31) + this.outline.hashCode()) * 31) + this.src.hashCode()) * 31) + this.speedMap.hashCode()) * 31) + this.liveShape.hashCode()) * 31) + this.inTime) * 31) + this.outTime) * 31) + Boolean.hashCode(this.loop)) * 31) + this.gain.hashCode()) * 31) + this.text.hashCode()) * 31) + this.blendingMode.hashCode()) * 31) + this.nestedScene.hashCode()) * 31);
            Long v1_3 = this.linkedSceneUUID;
            if (v1_3 == null) {
                v1_4 = 0;
            } else {
                v1_4 = v1_3.hashCode();
            }
            int v0_32 = ((((((((((((((((((((((((v0_5 + v1_4) * 31) + this.visualEffects.hashCode()) * 31) + this.visualEffectOrder.hashCode()) * 31) + this.tag.hashCode()) * 31) + this.drawing.hashCode()) * 31) + this.userElementParamValues.hashCode()) * 31) + this.stroke.hashCode()) * 31) + this.borders.hashCode()) * 31) + this.dropShadow.hashCode()) * 31) + Boolean.hashCode(this.hidden)) * 31) + this.cameraProperties.hashCode()) * 31) + Boolean.hashCode(this.clippingMask)) * 31);
            Long v1_30 = this.parent;
            if (v1_30 != null) {
                v2 = v1_30.hashCode();
            }
            int v0_33 = (v0_32 + v2);
            this._hashCode = v0_33;
            return v0_33;
        } else {
            return v0_0;
        }
    }

    public String toString()
    {
        String v1_0 = this.type;
        int v2 = this.startTime;
        int v3 = this.endTime;
        long v4 = this.id;
        com.alightcreative.app.motion.scene.EngineState v6 = this.engineState;
        String v7 = this.label;
        com.alightcreative.app.motion.scene.KeyableTransform v8 = this.transform;
        com.alightcreative.app.motion.scene.Keyable v9 = this.fillColor;
        android.net.Uri v10 = this.fillImage;
        android.net.Uri v11 = this.fillVideo;
        com.alightcreative.app.motion.scene.GradientFill v12 = this.fillGradient;
        com.alightcreative.app.motion.scene.FillType v13 = this.fillType;
        com.alightcreative.app.motion.scene.rendering.TextureCropMode v14 = this.mediaFillMode;
        com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline v16 = this.outline;
        android.net.Uri v17 = this.src;
        com.alightcreative.app.motion.scene.Keyable v18 = this.speedMap;
        com.alightcreative.app.motion.scene.liveshape.LiveShapeRef v19 = this.liveShape;
        int v20 = this.inTime;
        int v21 = this.outTime;
        boolean v22 = this.loop;
        com.alightcreative.app.motion.scene.Keyable v23 = this.gain;
        com.alightcreative.app.motion.scene.StyledText v24 = this.text;
        com.alightcreative.app.motion.scene.BlendingMode v25 = this.blendingMode;
        com.alightcreative.app.motion.scene.Scene v26 = this.nestedScene;
        java.util.UUID v27 = this.linkedSceneUUID;
        java.util.Map v28 = this.visualEffects;
        java.util.List v29 = this.visualEffectOrder;
        com.alightcreative.app.motion.scene.ElementTag v30 = this.tag;
        com.alightcreative.app.motion.scene.Drawing v31 = this.drawing;
        java.util.Map v32 = this.userElementParamValues;
        com.alightcreative.app.motion.scene.KeyableEdgeDecoration v33 = this.stroke;
        java.util.List v34 = this.borders;
        com.alightcreative.app.motion.scene.KeyableEdgeDecoration v35 = this.dropShadow;
        boolean v36 = this.hidden;
        com.alightcreative.app.motion.scene.CameraProperties v37 = this.cameraProperties;
        Long v38 = this.parent;
        boolean v39 = this.clippingMask;
        String v40 = this.templatePPId;
        String v15_25 = this.presetId;
        String v0_3 = new StringBuilder();
        String v41 = v15_25;
        v0_3.append("SceneElement(type=");
        v0_3.append(v1_0);
        v0_3.append(", startTime=");
        v0_3.append(v2);
        v0_3.append(", endTime=");
        v0_3.append(v3);
        v0_3.append(", id=");
        v0_3.append(v4);
        v0_3.append(", engineState=");
        v0_3.append(v6);
        v0_3.append(", label=");
        v0_3.append(v7);
        v0_3.append(", transform=");
        v0_3.append(v8);
        v0_3.append(", fillColor=");
        v0_3.append(v9);
        v0_3.append(", fillImage=");
        v0_3.append(v10);
        v0_3.append(", fillVideo=");
        v0_3.append(v11);
        v0_3.append(", fillGradient=");
        v0_3.append(v12);
        v0_3.append(", fillType=");
        v0_3.append(v13);
        v0_3.append(", mediaFillMode=");
        v0_3.append(v14);
        v0_3.append(", outline=");
        v0_3.append(v16);
        v0_3.append(", src=");
        v0_3.append(v17);
        v0_3.append(", speedMap=");
        v0_3.append(v18);
        v0_3.append(", liveShape=");
        v0_3.append(v19);
        v0_3.append(", inTime=");
        v0_3.append(v20);
        v0_3.append(", outTime=");
        v0_3.append(v21);
        v0_3.append(", loop=");
        v0_3.append(v22);
        v0_3.append(", gain=");
        v0_3.append(v23);
        v0_3.append(", text=");
        v0_3.append(v24);
        v0_3.append(", blendingMode=");
        v0_3.append(v25);
        v0_3.append(", nestedScene=");
        v0_3.append(v26);
        v0_3.append(", linkedSceneUUID=");
        v0_3.append(v27);
        v0_3.append(", visualEffects=");
        v0_3.append(v28);
        v0_3.append(", visualEffectOrder=");
        v0_3.append(v29);
        v0_3.append(", tag=");
        v0_3.append(v30);
        v0_3.append(", drawing=");
        v0_3.append(v31);
        v0_3.append(", userElementParamValues=");
        v0_3.append(v32);
        v0_3.append(", stroke=");
        v0_3.append(v33);
        v0_3.append(", borders=");
        v0_3.append(v34);
        v0_3.append(", dropShadow=");
        v0_3.append(v35);
        v0_3.append(", hidden=");
        v0_3.append(v36);
        v0_3.append(", cameraProperties=");
        v0_3.append(v37);
        v0_3.append(", parent=");
        v0_3.append(v38);
        v0_3.append(", clippingMask=");
        v0_3.append(v39);
        v0_3.append(", templatePPId=");
        v0_3.append(v40);
        v0_3.append(", presetId=");
        v0_3.append(v41);
        v0_3.append(")");
        return v0_3.toString();
    }
}
