package com.alightcreative.app.motion.scene;
public final class SceneElementKt {
    private static final android.graphics.Region InfinityBounds = None;
    private static final int MAX_SCENE_SIZE = 100000;
    public static final float MINIMUM_ELEMENT_SPEED = 981668463;
    private static final java.util.WeakHashMap actualBoundsCache;
    private static final java.util.WeakHashMap boundsOverLifetimeCache;
    private static final java.util.WeakHashMap drawingBoundsCache;
    private static final java.util.Map elementReaders;
    private static final java.util.WeakHashMap pointStringCache;
    private static final java.util.WeakHashMap strokeBoundsCache;
    private static final java.util.WeakHashMap timingCache;

    static SceneElementKt()
    {
        com.alightcreative.app.motion.scene.SceneElementKt.strokeBoundsCache = new java.util.WeakHashMap();
        com.alightcreative.app.motion.scene.SceneElementKt.drawingBoundsCache = new java.util.WeakHashMap();
        java.util.WeakHashMap v0_14 = com.alightcreative.app.motion.scene.SceneElementType.values();
        int v2_2 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(v0_14.length), 16));
        int v1_2 = v0_14.length;
        int v3 = 0;
        while (v3 < v1_2) {
            Object v4_0 = v0_14[v3];
            Object v4_1 = kotlin.TuplesKt.to(v4_0.getXmlTag(), new com.alightcreative.app.motion.scene.SceneElementKt$elementReaders$1$1(v4_0));
            v2_2.put(v4_1.getFirst(), v4_1.getSecond());
            v3++;
        }
        com.alightcreative.app.motion.scene.SceneElementKt.elementReaders = v2_2;
        com.alightcreative.app.motion.scene.SceneElementKt.actualBoundsCache = new java.util.WeakHashMap();
        com.alightcreative.app.motion.scene.SceneElementKt.InfinityBounds = new android.graphics.Region(-100000, -100000, 100000, 100000);
        com.alightcreative.app.motion.scene.SceneElementKt.boundsOverLifetimeCache = new java.util.WeakHashMap();
        com.alightcreative.app.motion.scene.SceneElementKt.pointStringCache = new java.util.WeakHashMap();
        com.alightcreative.app.motion.scene.SceneElementKt.timingCache = new java.util.WeakHashMap();
        return;
    }

    public static synthetic String H(android.graphics.RectF p0)
    {
        return com.alightcreative.app.motion.scene.SceneElementKt.boundsAtTime$lambda$42$lambda$40(p0);
    }

    public static synthetic com.alightcreative.app.motion.scene.SceneElement R6(java.util.Map p0, com.alightcreative.app.motion.scene.SceneElement p1)
    {
        return com.alightcreative.app.motion.scene.SceneElementKt.withAbsoluteTimingAndSpeedInScene$lambda$74(p0, p1);
    }

    public static synthetic String X(int p0, int p1, java.util.List p2)
    {
        return com.alightcreative.app.motion.scene.SceneElementKt.absoluteTimingInScene$lambda$70(p0, p1, p2);
    }

    public static final com.alightcreative.app.motion.scene.ElementTiming absoluteTimingInScene(com.alightcreative.app.motion.scene.SceneElement p12, com.alightcreative.app.motion.scene.Scene p13)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "scene");
        java.util.WeakHashMap v0_10 = ((java.util.WeakHashMap) com.alightcreative.app.motion.scene.SceneElementKt.timingCache.get(p12));
        if (v0_10 != null) {
            java.util.WeakHashMap v0_2 = ((com.alightcreative.app.motion.scene.ElementTiming) v0_10.get(p13));
            if (v0_2 != null) {
                return v0_2;
            }
        }
        java.util.WeakHashMap v0_3 = p13.getFramesPerHundredSeconds();
        com.alightcreative.app.motion.scene.ElementTiming v1_0 = com.alightcreative.app.motion.scene.SceneKt.pathToElement(p13, p12);
        kotlin.jvm.internal.Intrinsics.checkNotNull(v1_0);
        com.alightcreative.app.motion.scene.ElementTiming v1_1 = kotlin.collections.CollectionsKt.dropLast(v1_0, 1);
        java.util.Map v2_1 = v1_1.iterator();
        int v4 = 0;
        while (v2_1.hasNext()) {
            v4 += com.alightcreative.app.motion.scene.TimeKt.roundToFrame(((com.alightcreative.app.motion.scene.SceneElement) v2_1.next()).getStartTime(), v0_3);
        }
        java.util.Map v2_4 = com.alightcreative.app.motion.scene.TimeKt.roundToFrameStartTime((p12.getStartTime() + v4), v0_3);
        int v5_6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v1_1, 10));
        java.util.Iterator v6_2 = v1_1.iterator();
        int v7_0 = 0;
        while (v6_2.hasNext()) {
            com.alightcreative.app.motion.scene.SceneElement v8_1 = v6_2.next();
            int v9 = (v7_0 + 1);
            if (v7_0 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            com.alightcreative.app.motion.scene.SceneElement v8_2 = ((com.alightcreative.app.motion.scene.SceneElement) v8_1);
            int v7_2 = kotlin.collections.CollectionsKt.take(v1_1, v7_0).iterator();
            int v10_0 = 0;
            while (v7_2.hasNext()) {
                v10_0 += com.alightcreative.app.motion.scene.TimeKt.roundToFrame(((com.alightcreative.app.motion.scene.SceneElement) v7_2.next()).getStartTime(), v0_3);
            }
            v5_6.add(Integer.valueOf((v10_0 + v8_2.getEndTime())));
            v7_0 = v9;
        }
        com.alightcreative.app.motion.scene.Xo v3_3;
        com.alightcreative.app.motion.scene.Xo v3_2 = ((Integer) kotlin.collections.CollectionsKt.minOrNull(v5_6));
        if (v3_2 == null) {
            v3_3 = 2147483647;
        } else {
            v3_3 = v3_2.intValue();
        }
        java.util.WeakHashMap v0_7 = kotlin.ranges.RangesKt.coerceAtMost(com.alightcreative.app.motion.scene.TimeKt.roundToFrameEndTime((p12.getEndTime() + v4), v0_3), v3_3);
        fx.Enc.H(p12, new com.alightcreative.app.motion.scene.Xo(v2_4, v0_7, v1_1));
        com.alightcreative.app.motion.scene.ElementTiming v1_3 = new com.alightcreative.app.motion.scene.ElementTiming(v2_4, v0_7);
        java.util.WeakHashMap v0_9 = com.alightcreative.app.motion.scene.SceneElementKt.timingCache;
        java.util.Map v2_5 = v0_9.get(p12);
        if (v2_5 == null) {
            v2_5 = new java.util.WeakHashMap();
            v0_9.put(p12, v2_5);
        }
        ((java.util.Map) v2_5).put(p13, v1_3);
        return v1_3;
    }

    private static final String absoluteTimingInScene$lambda$70(int p5, int p6, java.util.List p7)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(p7, 10));
        StringBuilder v7_3 = p7.iterator();
        while (v7_3.hasNext()) {
            String v1_3 = ((com.alightcreative.app.motion.scene.SceneElement) v7_3.next());
            String v2_0 = v1_3.getId();
            String v1_4 = v1_3.getStartTime();
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append(v2_0);
            v4_1.append(":");
            v4_1.append(v1_4);
            v0_1.add(v4_1.toString());
        }
        StringBuilder v7_2 = new StringBuilder();
        v7_2.append("absoluteTiming: absStart=");
        v7_2.append(p5);
        v7_2.append(" absEnd=");
        v7_2.append(p6);
        v7_2.append(" parentElemens=");
        v7_2.append(v0_1);
        return v7_2.toString();
    }

    public static final com.alightcreative.app.motion.scene.Rectangle actualBoundsFor(com.alightcreative.app.motion.scene.Scene p4, Iterable p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "elements");
        com.alightcreative.app.motion.scene.Rectangle v0_2 = com.alightcreative.app.motion.scene.Rectangle.Companion.getEMPTY();
        java.util.Iterator v5_1 = p5.iterator();
        while (v5_1.hasNext()) {
            com.alightcreative.app.motion.scene.Rectangle v1_2 = ((com.alightcreative.app.motion.scene.SceneElement) v5_1.next());
            if ((!v1_2.getType().getHasBlendingMode()) || (v1_2.getBlendingMode() != com.alightcreative.app.motion.scene.BlendingMode.MASK)) {
                v0_2 = com.alightcreative.app.motion.scene.GeometryKt.union(v0_2, com.alightcreative.app.motion.scene.SceneElementKt.boundsOverLifetime(v1_2, p4));
            } else {
                v0_2 = com.alightcreative.app.motion.scene.SceneElementKt.boundsOverLifetime(v1_2, p4);
            }
        }
        return v0_2;
    }

    public static final com.alightcreative.app.motion.scene.Rectangle boundsAtTime(com.alightcreative.app.motion.scene.SceneElement p2, com.alightcreative.app.motion.scene.Scene p3, float p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        int v0 = 0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, com.fyber.inneractive.sdk.config.enums.omu.kpIGB.jhDqdM);
        return com.alightcreative.app.motion.scene.SceneElementKt.boundsAtTime(p2, p3, p4, com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.SceneElementKt.sceneTime(p2, p4), p3.getFramesPerHundredSeconds()), p3.getFramesPerHundredSeconds());
    }

    public static final com.alightcreative.app.motion.scene.Rectangle boundsAtTime(com.alightcreative.app.motion.scene.SceneElement p13, com.alightcreative.app.motion.scene.Scene p14, float p15, int p16, int p17)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "scene");
        kotlin.NoWhenBranchMatchedException v13_9 = com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt.runScripts$default(p13, p15, p16, p17, p14, p13.getTransform().valueAtTime(p15), 0, 0, 0, 0, 0, 992, 0);
        if (v13_9.getType() != com.alightcreative.app.motion.scene.SceneElementType.Camera) {
            if (v13_9.getType() != com.alightcreative.app.motion.scene.SceneElementType.NullObject) {
                if (!v13_9.getType().getHasOutline()) {
                    fx.Enc.H(v13_9, new com.alightcreative.app.motion.scene.sKo(v13_9, p14, p15));
                    return com.alightcreative.app.motion.scene.GeometryKt.enclosingTransform(com.alightcreative.app.motion.scene.SceneElementKt.boundsInScene(v13_9, p14), v13_9.getTransform().valueAtTime(p15));
                } else {
                    com.alightcreative.app.motion.scene.Rectangle v14_7 = new android.graphics.RectF();
                    float v0_16 = com.alightcreative.app.motion.scene.CubicBSplineKt.toPath(com.alightcreative.app.motion.scene.CubicBSplineKt.valueAtTime(v13_9.getOutline(), p15)).j();
                    v0_16.transform(v13_9.getTransform().valueAtTime(p15).getMatrix());
                    v0_16.computeBounds(v14_7, 1);
                    if (v13_9.getType().getHasBorderAndShadow()) {
                        float v0_20 = com.alightcreative.app.motion.scene.SceneElementKt.getEdgeDecorations(v13_9).iterator();
                        float v4_0 = 0;
                        float v5_0 = 0;
                        float v6_1 = 0;
                        float v7_1 = 0;
                        while (v0_20.hasNext()) {
                            float v8_1 = ((com.alightcreative.app.motion.scene.KeyableEdgeDecoration) v0_20.next());
                            if (v8_1.getEnabled()) {
                                float v8_2;
                                float v9_3 = ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(v8_1.getOffset(), p15));
                                int v10_2 = com.alightcreative.app.motion.scene.SceneElementKt$WhenMappings.$EnumSwitchMapping$2[v8_1.getDirection().ordinal()];
                                if (v10_2 == 1) {
                                    v8_2 = 0;
                                } else {
                                    if (v10_2 == 2) {
                                        v8_2 = ((Number) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(v8_1.getSize(), p15)).floatValue();
                                    } else {
                                        if (v10_2 != 3) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        } else {
                                            v8_2 = (((Number) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(v8_1.getSize(), p15)).floatValue() / 1073741824);
                                        }
                                    }
                                }
                                v4_0 = Math.max(v4_0, ((- v9_3.getX()) + v8_2));
                                v5_0 = Math.max(v5_0, ((- v9_3.getY()) + v8_2));
                                v6_1 = Math.max(v6_1, (v9_3.getX() + v8_2));
                                v7_1 = Math.max(v7_1, (v9_3.getY() + v8_2));
                            }
                        }
                        v14_7.left = (v14_7.left - v4_0);
                        v14_7.top = (v14_7.top - v5_0);
                        v14_7.right = (v14_7.right + v6_1);
                        v14_7.bottom = (v14_7.bottom + v7_1);
                    }
                    fx.Enc.H(v13_9, new com.alightcreative.app.motion.scene.HLZ(v14_7));
                    return com.alightcreative.app.motion.scene.GeometryKt.toRectangle(v14_7);
                }
            } else {
                return com.alightcreative.app.motion.scene.GeometryKt.enclosingTransform(com.alightcreative.app.motion.scene.Rectangle.Companion.centeredWithSize(new com.alightcreative.app.motion.scene.Vector2D(1112014848, 1112014848)), v13_9.getTransform().valueAtTime(p15));
            }
        } else {
            return com.alightcreative.app.motion.scene.GeometryKt.enclosingTransform(com.alightcreative.app.motion.scene.Rectangle.Companion.centeredWithSize(com.alightcreative.app.motion.scene.CameraElementKt.calcCameraDimensions(p14, ((Number) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(v13_9.getCameraProperties().getFov(), p15)).floatValue(), (- ((com.alightcreative.app.motion.scene.Vector3D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(v13_9.getTransform().getLocation(), p15)).getZ()))), v13_9.getTransform().valueAtTime(p15));
        }
    }

    private static final String boundsAtTime$lambda$42$lambda$40(android.graphics.RectF p2)
    {
        String v2_1 = com.alightcreative.app.motion.scene.GeometryKt.toRectangle(p2);
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("SceneElement.boundsAtTime [by outline] pathBounds=");
        v0_1.append(v2_1);
        return v0_1.toString();
    }

    private static final String boundsAtTime$lambda$42$lambda$41(com.alightcreative.app.motion.scene.SceneElement p3, com.alightcreative.app.motion.scene.Scene p4, float p5)
    {
        String v0_0 = com.alightcreative.app.motion.scene.SceneElementKt.boundsInScene(p3, p4);
        String v4_4 = com.alightcreative.app.motion.scene.GeometryKt.enclosingTransform(com.alightcreative.app.motion.scene.SceneElementKt.boundsInScene(p3, p4), p3.getTransform().valueAtTime(p5));
        String v3_2 = p3.getTransform().valueAtTime(p5);
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("SceneElement.boundsAtTime [by enclosingTransform] bounds=");
        v1_1.append(v0_0);
        v1_1.append(" afterTransform=");
        v1_1.append(v4_4);
        v1_1.append(" transform(");
        v1_1.append(p5);
        v1_1.append(")=");
        v1_1.append(v3_2);
        return v1_1.toString();
    }

    public static final com.alightcreative.app.motion.scene.Rectangle boundsInScene(com.alightcreative.app.motion.scene.SceneElement p6, com.alightcreative.app.motion.scene.Scene p7)
    {
        com.alightcreative.app.motion.scene.Rectangle v0_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "scene");
        com.alightcreative.app.motion.scene.Rectangle v0_18 = com.alightcreative.app.motion.scene.SceneElementKt$WhenMappings.$EnumSwitchMapping$0[p6.getType().ordinal()];
        if (v0_18 == 1) {
            v0_2 = com.alightcreative.app.motion.scene.CubicBSplineKt.getBounds(com.alightcreative.app.motion.scene.CubicBSplineKt.valueAtTime(p6.getOutline(), 0));
        } else {
            if (v0_18 == 2) {
                v0_2 = com.alightcreative.app.motion.scene.SceneElementKt.getBounds(p6.getDrawing());
            } else {
                if (v0_18 == 3) {
                    com.alightcreative.app.motion.scene.Rectangle v0_9 = com.alightcreative.app.motion.scene.SceneElementKt.getActualBounds(p6.getNestedScene());
                    if (!v0_9.isEmpty()) {
                        v0_2 = com.alightcreative.app.motion.scene.GeometryKt.minus(v0_9, com.alightcreative.app.motion.scene.GeometryKt.div(com.alightcreative.app.motion.scene.SceneKt.getSize(p6.getNestedScene()), 1073741824));
                    } else {
                        v0_2 = com.alightcreative.app.motion.scene.SceneElementKt.getBounds(p6.getNestedScene());
                    }
                } else {
                    if (v0_18 == 4) {
                        com.alightcreative.app.motion.scene.Rectangle v0_13 = com.alightcreative.app.motion.scene.TextElementKt.getTextDimensions(p6.getText(), com.alightcreative.app.motion.scene.StyleParams.Companion.forElement(p6, 0));
                        int v2_6 = v0_13.component1();
                        com.alightcreative.app.motion.scene.Rectangle v0_14 = v0_13.component2();
                        v0_2 = new com.alightcreative.app.motion.scene.Rectangle(((- v2_6) / ((float) 2)), ((- v0_14) / ((float) 2)), (v2_6 / ((float) 2)), (v0_14 / ((float) 2)));
                    } else {
                        if (v0_18 == 6) {
                            v0_2 = com.alightcreative.app.motion.scene.Rectangle.Companion.centeredWithSize(com.alightcreative.app.motion.scene.CameraElementKt.calcCameraDimensions(p7, ((Number) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(p6.getCameraProperties().getFov(), 0)).floatValue(), (- ((com.alightcreative.app.motion.scene.Vector3D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(p6.getTransform().getLocation(), 0)).getZ())));
                        } else {
                            if (v0_18 == 7) {
                                v0_2 = com.alightcreative.app.motion.scene.Rectangle.Companion.centeredWithSize(new com.alightcreative.app.motion.scene.Vector2D(1112014848, 1112014848));
                            } else {
                                v0_2 = com.alightcreative.app.motion.scene.Rectangle.Companion.getEMPTY();
                            }
                        }
                    }
                }
            }
        }
        if ((!Float.isNaN(v0_2.getWidth())) && (!Float.isNaN(v0_2.getHeight()))) {
            return v0_2;
        } else {
            com.alightcreative.app.motion.scene.Vector2D v1_9 = new StringBuilder();
            v1_9.append("NAN Bounds Scene: ");
            v1_9.append(p7);
            fx.Enc.x(v1_9.toString());
            IllegalStateException v7_3 = new StringBuilder();
            v7_3.append("NAN Bounds Element: ");
            v7_3.append(p6);
            fx.Enc.x(v7_3.toString());
            com.google.firebase.crashlytics.FirebaseCrashlytics v6_2 = com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance();
            com.alightcreative.app.motion.scene.Vector2D v1_12 = new StringBuilder();
            v1_12.append("Invalid NAN bounds returned for element in scene: ");
            v1_12.append(v0_2);
            v6_2.recordException(new IllegalStateException(v1_12.toString()));
            return v0_2;
        }
    }

    public static final com.alightcreative.app.motion.scene.Rectangle boundsOverLifetime(com.alightcreative.app.motion.scene.SceneElement p8, com.alightcreative.app.motion.scene.Scene p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "scene");
        java.util.WeakHashMap v0_2 = com.alightcreative.app.motion.scene.SceneElementKt.boundsOverLifetimeCache;
        kotlin.Pair v1 = kotlin.TuplesKt.to(p9, p8);
        com.alightcreative.app.motion.scene.Rectangle v2_6 = v0_2.get(v1);
        if (v2_6 == null) {
            com.alightcreative.app.motion.scene.Rectangle v2_1 = com.alightcreative.app.motion.scene.TransformKt.getKeyableProperties(p8.getTransform());
            com.alightcreative.app.motion.scene.Rectangle v3_1 = new java.util.ArrayList();
            com.alightcreative.app.motion.scene.Rectangle v2_2 = v2_1.iterator();
            while (v2_2.hasNext()) {
                com.alightcreative.app.motion.scene.Rectangle v4_8 = ((com.alightcreative.app.motion.scene.Keyable) v2_2.next()).getKeyframes();
                com.alightcreative.app.motion.scene.SceneElement v5_2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v4_8, 10));
                com.alightcreative.app.motion.scene.Rectangle v4_9 = v4_8.iterator();
                while (v4_9.hasNext()) {
                    v5_2.add(Float.valueOf(((com.alightcreative.app.motion.scene.Keyframe) v4_9.next()).getTime()));
                }
                kotlin.collections.CollectionsKt.addAll(v3_1, v5_2);
            }
            com.alightcreative.app.motion.scene.Rectangle v2_4 = ((Iterable) kotlin.collections.CollectionsKt.toSet(v3_1));
            com.alightcreative.app.motion.scene.Rectangle v3_3 = com.alightcreative.app.motion.scene.Rectangle.Companion.getEMPTY();
            com.alightcreative.app.motion.scene.Rectangle v2_5 = v2_4.iterator();
            while (v2_5.hasNext()) {
                com.alightcreative.app.motion.scene.Rectangle v4_4 = ((Number) v2_5.next()).floatValue();
                v3_3 = com.alightcreative.app.motion.scene.GeometryKt.union(v3_3, com.alightcreative.app.motion.scene.SceneElementKt.boundsAtTime(com.alightcreative.app.motion.scene.LayerParentingKt.applyLayerParenting(p8, p9, v4_4), p9, v4_4, com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(((int) ((((float) (p8.getEndTime() - p8.getStartTime())) * v4_4) + ((float) p8.getStartTime()))), 30), 30));
            }
            v0_2.put(v1, v3_3);
            v2_6 = v3_3;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_6, "getOrPut(...)");
        return ((com.alightcreative.app.motion.scene.Rectangle) v2_6);
    }

    public static synthetic CharSequence cD(com.alightcreative.app.motion.scene.StrokePoint p0)
    {
        return com.alightcreative.app.motion.scene.SceneElementKt.serialize$lambda$60$lambda$59(p0);
    }

    public static final com.alightcreative.app.motion.scene.SceneElement copyAdjustingKeyframeTiming(com.alightcreative.app.motion.scene.SceneElement p3, kotlin.jvm.functions.Function1 p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "adjuster");
        java.util.Iterator v0_3 = com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses(p3).iterator();
        while (v0_3.hasNext()) {
            p3 = ((com.alightcreative.app.motion.scene.SceneElement) rVb.c.cD(((rVb.xfY) v0_3.next()), p3, new com.alightcreative.app.motion.scene.SceneElementKt$copyAdjustingKeyframeTiming$1$1(p4)));
        }
        return p3;
    }

    public static final boolean directParent(com.alightcreative.app.motion.scene.SceneElement p2, Long p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        long v0_1 = p2.getId();
        if ((p3 == null) || (v0_1 != p3.longValue())) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final void forEachVisualEffect(com.alightcreative.app.motion.scene.SceneElement p5, kotlin.jvm.functions.Function2 p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "action");
        java.util.Iterator v0_3 = p5.getVisualEffectOrder().iterator();
        while (v0_3.hasNext()) {
            Long v1_2 = ((Number) v0_3.next()).longValue();
            com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef v3_2 = ((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) p5.getVisualEffects().get(Long.valueOf(v1_2)));
            if (v3_2 != null) {
                p6.invoke(Long.valueOf(v1_2), v3_2);
            }
        }
        return;
    }

    public static final void forEachVisualEffectIndexed(com.alightcreative.app.motion.scene.SceneElement p7, kotlin.jvm.functions.Function3 p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "action");
        java.util.Iterator v0_3 = p7.getVisualEffectOrder().iterator();
        int v1_1 = 0;
        while (v0_3.hasNext()) {
            com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef v2_1 = v0_3.next();
            int v3 = (v1_1 + 1);
            if (v1_1 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            Long v4_0 = ((Number) v2_1).longValue();
            com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef v2_5 = ((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) p7.getVisualEffects().get(Long.valueOf(v4_0)));
            if (v2_5 != null) {
                p8.invoke(Integer.valueOf(v1_1), Long.valueOf(v4_0), v2_5);
            }
            v1_1 = v3;
        }
        return;
    }

    public static final float fractionalTime(com.alightcreative.app.motion.scene.SceneElement p1, int p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return (((float) (p2 - p1.getStartTime())) / ((float) (p1.getEndTime() - p1.getStartTime())));
    }

    public static final com.alightcreative.app.motion.scene.Rectangle getActualBounds(com.alightcreative.app.motion.scene.Scene p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        java.util.WeakHashMap v0_1 = com.alightcreative.app.motion.scene.SceneElementKt.actualBoundsCache;
        com.alightcreative.app.motion.scene.Rectangle v1_4 = v0_1.get(p5);
        if (v1_4 == null) {
            if (((double) p5.getBackground().getA()) <= 4562254508917369340) {
                v1_4 = com.alightcreative.app.motion.scene.GeometryKt.intersect(com.alightcreative.app.motion.scene.SceneElementKt.actualBoundsFor(p5, p5.getElements()), com.alightcreative.app.motion.scene.SceneElementKt.getFrame(p5));
            } else {
                v1_4 = com.alightcreative.app.motion.scene.SceneElementKt.getFrame(p5);
            }
            v0_1.put(p5, v1_4);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_4, "getOrPut(...)");
        return ((com.alightcreative.app.motion.scene.Rectangle) v1_4);
    }

    public static final java.util.List getAdjustablePropertyLenses(com.alightcreative.app.motion.scene.SceneElement p15)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "<this>");
        java.util.ArrayList v0_2 = new java.util.ArrayList();
        if (p15.getType().getHasTransform()) {
            kotlin.Unit v1_5 = com.alightcreative.app.motion.scene.TransformKt.getKeyablePropertyLenses(p15.getTransform());
            rVb.qfV v3_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v1_5, 10));
            kotlin.Unit v1_22 = v1_5.iterator();
            while (v1_22.hasNext()) {
                int v4_47 = ((rVb.xfY) v1_22.next());
                rVb.qfV v5_54 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$1$1.INSTANCE;
                v3_1.add(new rVb.K(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v4_47.x(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v5_54.getReturnType(), v5_54), v4_47));
            }
            kotlin.collections.CollectionsKt.addAll(v0_2, v3_1);
        }
        if (p15.getType().getHasFillColor()) {
            kotlin.Unit v1_39 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$2.INSTANCE;
            v0_2.add(new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v1_39.getReturnType(), v1_39));
        }
        if (p15.getType().getHasVolume()) {
            kotlin.Unit v1_42 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$3.INSTANCE;
            v0_2.add(new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v1_42.getReturnType(), v1_42));
        }
        if (p15.getType().getHasOutline()) {
            kotlin.Unit v1_46 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$4.INSTANCE;
            kotlin.Unit v1_47 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$5.INSTANCE;
            v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v1_47.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v1_46.getReturnType(), v1_46), v1_47));
        }
        if ((p15.getType().getHasOutline()) && (p15.getLiveShape().getId() == null)) {
            kotlin.Unit v1_55 = p15.getOutline().getContours().iterator();
            int v4_43 = 0;
            while (v1_55.hasNext()) {
                v1_55.next();
                int v6_16 = (v4_43 + 1);
                if (v4_43 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                rVb.qfV v5_52 = ((com.alightcreative.app.motion.scene.KeyableCubicBSpline) p15.getOutline().getContours().get(v4_43)).getKnots().iterator();
                com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$12 v7_22 = 0;
                while (v5_52.hasNext()) {
                    rVb.CU v8_39 = v5_52.next();
                    kotlin.reflect.KType v9_26 = (v7_22 + 1);
                    if (v7_22 < null) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    rVb.CU v8_40 = ((com.alightcreative.app.motion.scene.KeyableCBKnot) v8_39);
                    if (v8_40.getP().getKeyed()) {
                        rVb.qfV v10_13 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$1.INSTANCE;
                        rVb.qfV v10_14 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$2.INSTANCE;
                        kotlin.reflect.KType v12_12 = new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v10_14.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v10_13.getReturnType(), v10_13), v10_14);
                        kotlin.reflect.KClass v11_12 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement);
                        kotlin.reflect.KType v13_14 = ((kotlin.reflect.KTypeProjection) v12_12.x().getArguments().get(0)).getType();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v13_14);
                        kotlin.reflect.KClass v11_13 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$3.INSTANCE;
                        kotlin.reflect.KType v12_14 = new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v11_13.getReturnType(), new rVb.CU(v11_12, v13_14, v12_12, v4_43), v11_13);
                        kotlin.reflect.KClass v11_14 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement);
                        kotlin.reflect.KType v13_20 = ((kotlin.reflect.KTypeProjection) v12_14.x().getArguments().get(0)).getType();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v13_20);
                        kotlin.reflect.KClass v11_15 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$4.INSTANCE;
                        v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v11_15.getReturnType(), new rVb.CU(v11_14, v13_20, v12_14, v7_22), v11_15));
                    }
                    if (((v8_40.getCurveIn() instanceof com.alightcreative.app.motion.scene.KeyableVector2D)) && (((com.alightcreative.app.motion.scene.KeyableVector2D) v8_40.getCurveIn()).getKeyed())) {
                        rVb.qfV v10_24 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$5.INSTANCE;
                        rVb.qfV v10_25 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$6.INSTANCE;
                        kotlin.reflect.KType v12_19 = new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v10_25.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v10_24.getReturnType(), v10_24), v10_25);
                        kotlin.reflect.KClass v11_18 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement);
                        kotlin.reflect.KType v13_28 = ((kotlin.reflect.KTypeProjection) v12_19.x().getArguments().get(0)).getType();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v13_28);
                        kotlin.reflect.KClass v11_19 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$7.INSTANCE;
                        kotlin.reflect.KType v12_21 = new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v11_19.getReturnType(), new rVb.CU(v11_18, v13_28, v12_19, v4_43), v11_19);
                        kotlin.reflect.KClass v11_20 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement);
                        kotlin.reflect.KType v13_34 = ((kotlin.reflect.KTypeProjection) v12_21.x().getArguments().get(0)).getType();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v13_34);
                        kotlin.reflect.KClass v11_21 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$8.INSTANCE;
                        v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v11_21.getReturnType(), new rVb.CU(v11_20, v13_34, v12_21, v7_22), v11_21));
                    }
                    if (((v8_40.getCurveOut() instanceof com.alightcreative.app.motion.scene.KeyableVector2D)) && (((com.alightcreative.app.motion.scene.KeyableVector2D) v8_40.getCurveOut()).getKeyed())) {
                        rVb.CU v8_44 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$9.INSTANCE;
                        rVb.CU v8_45 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$10.INSTANCE;
                        kotlin.reflect.KClass v11_24 = new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v8_45.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v8_44.getReturnType(), v8_44), v8_45);
                        rVb.qfV v10_34 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement);
                        kotlin.reflect.KType v12_30 = ((kotlin.reflect.KTypeProjection) v11_24.x().getArguments().get(0)).getType();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v12_30);
                        rVb.qfV v10_35 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$11.INSTANCE;
                        kotlin.reflect.KClass v11_26 = new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v10_35.getReturnType(), new rVb.CU(v10_34, v12_30, v11_24, v4_43), v10_35);
                        rVb.qfV v10_36 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement);
                        kotlin.reflect.KType v12_36 = ((kotlin.reflect.KTypeProjection) v11_26.x().getArguments().get(0)).getType();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v12_36);
                        com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$12 v7_23 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$12.INSTANCE;
                        v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v7_23.getReturnType(), new rVb.CU(v10_36, v12_36, v11_26, v7_22), v7_23));
                    }
                    v7_22 = v9_26;
                }
                v4_43 = v6_16;
            }
        }
        if (p15.getType().getHasBorderAndShadow()) {
            kotlin.Unit v1_58 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$7.INSTANCE;
            kotlin.Unit v1_0 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$8.INSTANCE;
            v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v1_0.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v1_58.getReturnType(), v1_58), v1_0));
            kotlin.Unit v1_2 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$9.INSTANCE;
            kotlin.Unit v1_3 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$10.INSTANCE;
            v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v1_3.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v1_2.getReturnType(), v1_2), v1_3));
            kotlin.Unit v1_4 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$11.INSTANCE;
            kotlin.Unit v1_6 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$12.INSTANCE;
            v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v1_6.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v1_4.getReturnType(), v1_4), v1_6));
            kotlin.Unit v1_7 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$13.INSTANCE;
            kotlin.Unit v1_8 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$14.INSTANCE;
            v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v1_8.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v1_7.getReturnType(), v1_7), v1_8));
            kotlin.Unit v1_10 = p15.getBorders().size();
            int v4_8 = 0;
            while (v4_8 < v1_10) {
                rVb.qfV v5_39 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$15.INSTANCE;
                int v6_11 = new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v5_39.getReturnType(), v5_39);
                com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$12 v7_15 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement);
                rVb.CU v8_29 = ((kotlin.reflect.KTypeProjection) v6_11.x().getArguments().get(0)).getType();
                kotlin.jvm.internal.Intrinsics.checkNotNull(v8_29);
                int v6_12 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$16.INSTANCE;
                v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v6_12.getReturnType(), new rVb.CU(v7_15, v8_29, v6_11, v4_8), v6_12));
                rVb.qfV v5_42 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$17.INSTANCE;
                int v6_14 = new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v5_42.getReturnType(), v5_42);
                com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$12 v7_19 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement);
                rVb.CU v8_36 = ((kotlin.reflect.KTypeProjection) v6_14.x().getArguments().get(0)).getType();
                kotlin.jvm.internal.Intrinsics.checkNotNull(v8_36);
                int v6_15 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$18.INSTANCE;
                v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v6_15.getReturnType(), new rVb.CU(v7_19, v8_36, v6_14, v4_8), v6_15));
                v4_8++;
            }
        }
        if (p15.getType().getHasVisualEffects()) {
            kotlin.Unit v1_14 = p15.getVisualEffectOrder().iterator();
            int v4_10 = 0;
            while (v1_14.hasNext()) {
                rVb.qfV v5_36 = v1_14.next();
                int v6_9 = (v4_10 + 1);
                if (v4_10 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                int v4_40 = ((Number) v5_36).longValue();
                com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$12 v7_10 = ((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) p15.getVisualEffects().get(Long.valueOf(v4_40)));
                if (v7_10 != null) {
                    com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$12 v7_13 = v7_10.getParameters().entrySet().iterator();
                    while (v7_13.hasNext()) {
                        rVb.CU v8_12 = ((java.util.Map$Entry) v7_13.next());
                        kotlin.reflect.KType v9_10 = ((String) v8_12.getKey());
                        rVb.CU v8_14 = ((com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue) v8_12.getValue());
                        rVb.qfV v10_6 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$baseLens$1.INSTANCE;
                        kotlin.reflect.KClass v11_1 = new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v10_6.getReturnType(), v10_6);
                        rVb.qfV v10_7 = Long.valueOf(v4_40);
                        kotlin.reflect.KType v13_1 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement);
                        kotlin.reflect.KType v14_4 = ((kotlin.reflect.KTypeProjection) v11_1.x().getArguments().get(0)).getType();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v14_4);
                        rVb.qfV v10_8 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$baseLens$2.INSTANCE;
                        kotlin.reflect.KClass v11_3 = new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v10_8.getReturnType(), new rVb.h(v13_1, v14_4, v11_1, v10_7), v10_8);
                        kotlin.reflect.KType v12_3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement);
                        kotlin.reflect.KType v13_7 = ((kotlin.reflect.KTypeProjection) v11_3.x().getArguments().get(0)).getType();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v13_7);
                        rVb.qfV v10_10 = new rVb.h(v12_3, v13_7, v11_3, v9_10);
                        switch (com.alightcreative.app.motion.scene.SceneElementKt$WhenMappings.$EnumSwitchMapping$1[v8_14.getDataType().ordinal()]) {
                            case 1:
                                rVb.CU v8_23 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$1.INSTANCE;
                                v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v8_23.getReturnType(), v10_10, v8_23));
                            case 2:
                                break;
                            case 3:
                                rVb.CU v8_22 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$2.INSTANCE;
                                v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v8_22.getReturnType(), v10_10, v8_22));
                                break;
                            case 4:
                                rVb.CU v8_21 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$3.INSTANCE;
                                v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v8_21.getReturnType(), v10_10, v8_21));
                                break;
                            case 5:
                                rVb.CU v8_20 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$4.INSTANCE;
                                v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v8_20.getReturnType(), v10_10, v8_20));
                                break;
                            case 6:
                                rVb.CU v8_19 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$5.INSTANCE;
                                v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v8_19.getReturnType(), v10_10, v8_19));
                                break;
                            case 7:
                                rVb.CU v8_18 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$19$6.INSTANCE;
                                v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v8_18.getReturnType(), v10_10, v8_18));
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                break;
                            default:
                                throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                }
                v4_10 = v6_9;
            }
        }
        if (p15.getLiveShape().getId() != null) {
            kotlin.Unit v1_18 = com.alightcreative.app.motion.scene.liveshape.LiveShapeKt.getShape(p15.getLiveShape());
            if (v1_18 != null) {
                kotlin.Unit v1_19 = v1_18.getParameters();
                if (v1_19 != null) {
                    kotlin.Unit v1_20 = v1_19.iterator();
                    int v4_11 = 0;
                    while (v1_20.hasNext()) {
                        rVb.qfV v5_20 = v1_20.next();
                        int v6_8 = (v4_11 + 1);
                        if (v4_11 < 0) {
                            kotlin.collections.CollectionsKt.throwIndexOverflow();
                        }
                        rVb.qfV v5_21 = ((com.alightcreative.app.motion.scene.userparam.UserParameter) v5_20);
                        int v4_27 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$baseLens$1.INSTANCE;
                        int v4_28 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$baseLens$2.INSTANCE;
                        rVb.CU v8_2 = new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v4_28.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v4_27.getReturnType(), v4_27), v4_28);
                        int v4_29 = v5_21.getName();
                        kotlin.reflect.KType v9_2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement);
                        rVb.qfV v10_5 = ((kotlin.reflect.KTypeProjection) v8_2.x().getArguments().get(0)).getType();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v10_5);
                        com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$6$1$12 v7_7 = new rVb.h(v9_2, v10_5, v8_2, v4_29);
                        switch (com.alightcreative.app.motion.scene.SceneElementKt$WhenMappings.$EnumSwitchMapping$1[v5_21.getDataType().ordinal()]) {
                            case 1:
                                int v4_39 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$1.INSTANCE;
                                v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v4_39.getReturnType(), v7_7, v4_39));
                            case 2:
                                break;
                            case 3:
                                int v4_38 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$2.INSTANCE;
                                v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v4_38.getReturnType(), v7_7, v4_38));
                                break;
                            case 4:
                                int v4_37 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$3.INSTANCE;
                                v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v4_37.getReturnType(), v7_7, v4_37));
                                break;
                            case 5:
                                int v4_36 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$4.INSTANCE;
                                v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v4_36.getReturnType(), v7_7, v4_36));
                                break;
                            case 6:
                                int v4_35 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$5.INSTANCE;
                                v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v4_35.getReturnType(), v7_7, v4_35));
                                break;
                            case 7:
                                int v4_34 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$20$6.INSTANCE;
                                v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v4_34.getReturnType(), v7_7, v4_34));
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                                break;
                            default:
                                throw new kotlin.NoWhenBranchMatchedException();
                        }
                        v4_11 = v6_8;
                    }
                }
            }
        }
        if (p15.getType() == com.alightcreative.app.motion.scene.SceneElementType.Camera) {
            kotlin.NoWhenBranchMatchedException v15_2 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$21.INSTANCE;
            kotlin.NoWhenBranchMatchedException v15_3 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$22.INSTANCE;
            v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v15_3.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v15_2.getReturnType(), v15_2), v15_3));
            kotlin.NoWhenBranchMatchedException v15_4 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$23.INSTANCE;
            kotlin.NoWhenBranchMatchedException v15_5 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$24.INSTANCE;
            v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v15_5.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v15_4.getReturnType(), v15_4), v15_5));
            kotlin.NoWhenBranchMatchedException v15_6 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$25.INSTANCE;
            kotlin.NoWhenBranchMatchedException v15_7 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$26.INSTANCE;
            v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v15_7.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v15_6.getReturnType(), v15_6), v15_7));
            kotlin.NoWhenBranchMatchedException v15_8 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$27.INSTANCE;
            kotlin.NoWhenBranchMatchedException v15_9 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$28.INSTANCE;
            v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v15_9.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v15_8.getReturnType(), v15_8), v15_9));
            kotlin.NoWhenBranchMatchedException v15_10 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$29.INSTANCE;
            kotlin.NoWhenBranchMatchedException v15_11 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$30.INSTANCE;
            v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v15_11.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v15_10.getReturnType(), v15_10), v15_11));
            kotlin.NoWhenBranchMatchedException v15_12 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$31.INSTANCE;
            kotlin.NoWhenBranchMatchedException v15_13 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$32.INSTANCE;
            v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v15_13.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v15_12.getReturnType(), v15_12), v15_13));
            kotlin.NoWhenBranchMatchedException v15_14 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$33.INSTANCE;
            kotlin.NoWhenBranchMatchedException v15_15 = com.alightcreative.app.motion.scene.SceneElementKt$getAdjustablePropertyLenses$34.INSTANCE;
            v0_2.add(new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v15_15.getReturnType(), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v15_14.getReturnType(), v15_14), v15_15));
        }
        return v0_2;
    }

    public static final float getAudioVideoSpeedFactor(com.alightcreative.app.motion.scene.SceneElement p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return 1065353216;
    }

    public static final com.alightcreative.app.motion.scene.Rectangle getBounds(com.alightcreative.app.motion.scene.Drawing p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        java.util.WeakHashMap v0_1 = com.alightcreative.app.motion.scene.SceneElementKt.drawingBoundsCache;
        com.alightcreative.app.motion.scene.Rectangle v1_1 = v0_1.get(p4);
        if (v1_1 == null) {
            com.alightcreative.app.motion.scene.Rectangle v1_3 = p4.getStrokes();
            com.alightcreative.app.motion.scene.Rectangle v2_0 = com.alightcreative.app.motion.scene.Rectangle.Companion.getEMPTY();
            com.alightcreative.app.motion.scene.Rectangle v1_0 = v1_3.iterator();
            while (v1_0.hasNext()) {
                v2_0 = com.alightcreative.app.motion.scene.GeometryKt.union(v2_0, com.alightcreative.app.motion.scene.SceneElementKt.getBounds(((com.alightcreative.app.motion.scene.Stroke) v1_0.next())));
            }
            v0_1.put(p4, v2_0);
            v1_1 = v2_0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_1, "getOrPut(...)");
        return ((com.alightcreative.app.motion.scene.Rectangle) v1_1);
    }

    public static final com.alightcreative.app.motion.scene.Rectangle getBounds(com.alightcreative.app.motion.scene.Scene p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        return new com.alightcreative.app.motion.scene.Rectangle((((float) (- p5.getWidth())) / 1073741824), (((float) (- p5.getHeight())) / 1073741824), (((float) p5.getWidth()) / 1073741824), (((float) p5.getHeight()) / 1073741824));
    }

    public static final com.alightcreative.app.motion.scene.Rectangle getBounds(com.alightcreative.app.motion.scene.Stroke p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "<this>");
        java.util.WeakHashMap v0_1 = com.alightcreative.app.motion.scene.SceneElementKt.strokeBoundsCache;
        com.alightcreative.app.motion.scene.Rectangle v1_1 = v0_1.get(p8);
        if (v1_1 == null) {
            com.alightcreative.app.motion.scene.Rectangle v1_3 = p8.getPoints();
            com.alightcreative.app.motion.scene.Rectangle v2_0 = com.alightcreative.app.motion.scene.Rectangle.Companion.getEMPTY();
            com.alightcreative.app.motion.scene.Rectangle v1_0 = v1_3.iterator();
            while (v1_0.hasNext()) {
                float v4_1;
                float v3_2 = ((com.alightcreative.app.motion.scene.StrokePoint) v1_0.next());
                if (p8.getTool() != com.alightcreative.app.motion.scene.DrawingTool.BRUSH) {
                    v4_1 = 1065353216;
                } else {
                    v4_1 = v3_2.getPressure();
                }
                float v4_3 = ((v4_1 * p8.getWidth()) / 1073741824);
                v2_0 = com.alightcreative.app.motion.scene.GeometryKt.union(v2_0, (v3_2.getLocation().getX() - v4_3), (v3_2.getLocation().getY() - v4_3), (v3_2.getLocation().getX() + v4_3), (v3_2.getLocation().getY() + v4_3));
            }
            v0_1.put(p8, v2_0);
            v1_1 = v2_0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_1, "getOrPut(...)");
        return ((com.alightcreative.app.motion.scene.Rectangle) v1_1);
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getCenter(com.alightcreative.app.motion.scene.Scene p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D((((float) p3.getWidth()) / 1073741824), (((float) p3.getHeight()) / 1073741824));
    }

    public static final String getDisplayLabel(com.alightcreative.app.motion.scene.SceneElement p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if ((kotlin.text.StringsKt.trim(p1.getLabel()).toString().length() != 0) || ((!p1.getType().getHasText()) || (kotlin.text.StringsKt.trim(p1.getText().getText()).toString().length() <= 0))) {
            return p1.getLabel();
        } else {
            return p1.getText().getText();
        }
    }

    public static final float getDurationInSeconds(com.alightcreative.app.motion.scene.SceneElement p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return (((float) (p1.getEndTime() - p1.getStartTime())) / 1148846080);
    }

    public static final java.util.List getEdgeDecorations(com.alightcreative.app.motion.scene.SceneElement p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!p1.getType().getHasBorderAndShadow()) {
            return kotlin.collections.CollectionsKt.emptyList();
        } else {
            return kotlin.collections.CollectionsKt.plus(p1.getBorders(), kotlin.collections.CollectionsKt.listOf(p1.getDropShadow()));
        }
    }

    public static final java.util.Map getElementReaders()
    {
        return com.alightcreative.app.motion.scene.SceneElementKt.elementReaders;
    }

    public static final com.alightcreative.app.motion.scene.Rectangle getFrame(com.alightcreative.app.motion.scene.Scene p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Rectangle(0, 0, ((float) p3.getWidth()), ((float) p3.getHeight()));
    }

    public static final boolean getHasFill(com.alightcreative.app.motion.scene.SceneElementType p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if ((!p1.getHasFillColor()) && ((!p1.getHasFillGradient()) && ((!p1.getHasFillVideo()) && ((!p1.getHasFillImage()) && (!p1.getHasFillType()))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final java.util.List getKeyableProperties(com.alightcreative.app.motion.scene.SceneElement p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        java.util.Iterator v0_1 = com.alightcreative.app.motion.scene.SceneElementKt.getKeyablePropertyLenses(p3);
        java.util.ArrayList v1_1 = new java.util.ArrayList();
        java.util.Iterator v0_2 = v0_1.iterator();
        while (v0_2.hasNext()) {
            com.alightcreative.app.motion.scene.Keyable v2_3 = ((com.alightcreative.app.motion.scene.Keyable) ((rVb.xfY) v0_2.next()).R6(p3));
            if (v2_3 != null) {
                v1_1.add(v2_3);
            }
        }
        return v1_1;
    }

    public static final java.util.List getKeyablePropertyLenses(com.alightcreative.app.motion.scene.SceneElement p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        com.alightcreative.app.motion.scene.SceneElementKt$getKeyablePropertyLenses$1 v0_1 = com.alightcreative.app.motion.scene.SceneElementKt$getKeyablePropertyLenses$1.INSTANCE;
        return kotlin.collections.CollectionsKt.plus(com.alightcreative.app.motion.scene.SceneElementKt.getAdjustablePropertyLenses(p4), new rVb.A(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SceneElement), v0_1.getReturnType(), v0_1));
    }

    public static final boolean getMissingMedia(com.alightcreative.app.motion.scene.SceneElement p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        if ((!p2.getType().getHasFillVideo()) || ((p2.getFillType() != com.alightcreative.app.motion.scene.FillType.MEDIA) || (p2.getFillVideo() == null))) {
            if ((!p2.getType().getHasFillImage()) || ((p2.getFillType() != com.alightcreative.app.motion.scene.FillType.MEDIA) || (p2.getFillImage() == null))) {
                if (p2.getType() != com.alightcreative.app.motion.scene.SceneElementType.Audio) {
                    return 0;
                } else {
                    return tI.Y.IB(p2.getSrc());
                }
            } else {
                return tI.Y.IB(p2.getFillImage());
            }
        } else {
            return tI.Y.IB(p2.getFillVideo());
        }
    }

    public static final java.util.List getSettableUserParams(com.alightcreative.app.motion.scene.SceneElement p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        switch (com.alightcreative.app.motion.scene.SceneElementKt$WhenMappings.$EnumSwitchMapping$0[p2.getType().ordinal()]) {
            case 1:
                return kotlin.collections.CollectionsKt.emptyList();
            case 2:
                return kotlin.collections.CollectionsKt.emptyList();
            case 3:
                return com.alightcreative.app.motion.scene.SceneKt.getSettableUserParams(p2.getNestedScene());
            case 4:
                java.util.List v2_6 = com.alightcreative.app.motion.scene.SceneElementKt.getUserElementTextProperty(p2.getText().getText());
                if (v2_6 != null) {
                    java.util.List v2_7 = kotlin.collections.CollectionsKt.listOf(v2_6);
                    if (v2_7 != null) {
                        return v2_7;
                    }
                }
                return kotlin.collections.CollectionsKt.emptyList();
            case 5:
                return kotlin.collections.CollectionsKt.emptyList();
            case 6:
                return kotlin.collections.CollectionsKt.emptyList();
            case 7:
                return kotlin.collections.CollectionsKt.emptyList();
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final String getUserElementTagId(String p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return com.alightcreative.app.motion.scene.SceneElementKt.getUserElementTagRaw(p1);
    }

    public static final String getUserElementTagLabel(String p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return com.alightcreative.app.motion.scene.SceneElementKt.getUserElementTagRaw(p1);
    }

    public static final String getUserElementTagRaw(String p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!com.alightcreative.app.motion.scene.SceneElementKt.isValidUserElementTag(p1)) {
            p1 = 0;
        }
        return p1;
    }

    public static final com.alightcreative.app.motion.scene.UserElementProperty getUserElementTextProperty(String p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        if (com.alightcreative.app.motion.scene.SceneElementKt.isValidUserElementTag(p3)) {
            String v1 = com.alightcreative.app.motion.scene.SceneElementKt.getUserElementTagId(p3);
            kotlin.jvm.internal.Intrinsics.checkNotNull(v1);
            String v3_1 = com.alightcreative.app.motion.scene.SceneElementKt.getUserElementTagLabel(p3);
            kotlin.jvm.internal.Intrinsics.checkNotNull(v3_1);
            return new com.alightcreative.app.motion.scene.UserElementProperty(v1, v3_1, com.alightcreative.app.motion.scene.userparam.DataType.STRING);
        } else {
            return 0;
        }
    }

    public static final java.util.List getVisualEffectsInOrder(com.alightcreative.app.motion.scene.SceneElement p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        java.util.Iterator v0_1 = p5.getVisualEffectOrder();
        java.util.ArrayList v1_1 = new java.util.ArrayList();
        java.util.Iterator v0_2 = v0_1.iterator();
        while (v0_2.hasNext()) {
            com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef v2_5 = ((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) p5.getVisualEffects().get(Long.valueOf(((Number) v0_2.next()).longValue())));
            if (v2_5 != null) {
                v1_1.add(v2_5);
            }
        }
        return v1_1;
    }

    public static synthetic String hUw(com.alightcreative.app.motion.scene.SceneElement p0, com.alightcreative.app.motion.scene.Scene p1, float p2)
    {
        return com.alightcreative.app.motion.scene.SceneElementKt.boundsAtTime$lambda$42$lambda$41(p0, p1, p2);
    }

    public static final boolean hasAnyAudio(com.alightcreative.app.motion.scene.SceneElement p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        com.alightcreative.app.motion.scene.FillType v0_4 = com.alightcreative.app.motion.scene.SceneElementKt$WhenMappings.$EnumSwitchMapping$0[p4.getType().ordinal()];
        if (v0_4 == 1) {
            if ((p4.getFillType() != com.alightcreative.app.motion.scene.FillType.MEDIA) || (p4.getFillVideo() == null)) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (v0_4 == 3) {
                return com.alightcreative.app.motion.scene.SceneKt.hasAnyAudio(p4.getNestedScene());
            } else {
                if (v0_4 == 5) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    public static final boolean hasAnyVideo(com.alightcreative.app.motion.scene.SceneElement p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        com.alightcreative.app.motion.scene.FillType v0_4 = com.alightcreative.app.motion.scene.SceneElementKt$WhenMappings.$EnumSwitchMapping$0[p4.getType().ordinal()];
        if (v0_4 == 1) {
            if ((p4.getFillType() != com.alightcreative.app.motion.scene.FillType.MEDIA) || (p4.getFillVideo() == null)) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (v0_4 == 3) {
                return com.alightcreative.app.motion.scene.SceneKt.hasAnyVideo(p4.getNestedScene());
            } else {
                return 0;
            }
        }
    }

    public static final boolean hitTestAtTime(com.alightcreative.app.motion.scene.SceneElement p14, com.alightcreative.app.motion.scene.Scene p15, float p16, float p17, float p18, xT.yH p19, int p20, int p21)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "scene");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "userPreviewMode");
        boolean v14_1 = com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt.runScripts$default(p14, p18, p20, p21, p15, p14.getTransform().valueAtTime(float v1), 0, 0, 0, 0, 0, 992, 0);
        android.graphics.Region v0_3 = new android.graphics.Region();
        if (!v14_1.getType().getHasOutline()) {
            if (!v14_1.getType().isRenderable()) {
                v0_3.setEmpty();
            } else {
                android.graphics.Path v2_6 = com.alightcreative.app.motion.scene.GeometryKt.asPath(com.alightcreative.app.motion.scene.SceneElementKt.boundsInScene(v14_1, p15));
                com.alightcreative.app.motion.scene.TransformKt.transform(v2_6, com.alightcreative.app.motion.scene.CameraElementKt.applyCameraAndParenting(v14_1, p15, p18, p19).getTransform().valueAtTime(p18));
                v0_3.setPath(v2_6, com.alightcreative.app.motion.scene.SceneElementKt.InfinityBounds);
            }
        } else {
            android.graphics.Path v2_9 = com.alightcreative.app.motion.scene.CubicBSplineKt.toPath(com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getShapeOutline(v14_1, p18)).j();
            com.alightcreative.app.motion.scene.TransformKt.transform(v2_9, com.alightcreative.app.motion.scene.CameraElementKt.applyCameraAndParenting(v14_1, p15, p18, p19).getTransform().valueAtTime(p18));
            v0_3.setPath(v2_9, com.alightcreative.app.motion.scene.SceneElementKt.InfinityBounds);
        }
        return v0_3.contains(((int) p16), ((int) p17));
    }

    private static final boolean includesScriptEffects(java.util.Collection p3)
    {
        if ((!(((Iterable) p3) instanceof java.util.Collection)) || (!((java.util.Collection) ((Iterable) p3)).isEmpty())) {
            java.util.Iterator v3_2 = ((Iterable) p3).iterator();
            while (v3_2.hasNext()) {
                int v0_5 = com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt.visualEffectById(((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) v3_2.next()).getId());
                if (v0_5 != 0) {
                    int v0_6 = v0_5.getScripts();
                    if ((v0_6 != 0) && ((v0_6.isEmpty() ^ 1) == 1)) {
                        return 1;
                    }
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    private static final boolean includesScriptEffects(java.util.Map p0)
    {
        return com.alightcreative.app.motion.scene.SceneElementKt.includesScriptEffects(p0.values());
    }

    private static final boolean includesShaderEffects(java.util.Collection p5)
    {
        if ((!(((Iterable) p5) instanceof java.util.Collection)) || (!((java.util.Collection) ((Iterable) p5)).isEmpty())) {
            int v5_2 = ((Iterable) p5).iterator();
            while (v5_2.hasNext()) {
                com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef v0_3 = ((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) v5_2.next());
                java.util.Iterator v2_1 = com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt.visualEffectById(v0_3.getId());
                if (v2_1 != null) {
                    java.util.Iterator v2_2 = v2_1.getShaderGroups();
                    if ((v2_2 != null) && (!v2_2.isEmpty())) {
                        java.util.Iterator v2_4 = v2_2.entrySet().iterator();
                        while (v2_4.hasNext()) {
                            if (!v0_3.getDisabledRenderGroups().contains(((java.util.Map$Entry) v2_4.next()).getKey())) {
                                return 1;
                            }
                        }
                    }
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    private static final boolean includesShaderEffects(java.util.Map p0)
    {
        return com.alightcreative.app.motion.scene.SceneElementKt.includesShaderEffects(p0.values());
    }

    public static final boolean indirectParent(com.alightcreative.app.motion.scene.SceneElement p7, com.alightcreative.app.motion.scene.Scene p8, long p9)
    {
        java.util.Iterator v0_3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "scene");
        if (p7.getParent() == null) {
            v0_3 = 0;
        } else {
            java.util.Iterator v0_1 = p7.getParent();
            if ((v0_1 == null) || (v0_1.longValue() != p9)) {
            } else {
                v0_3 = 1;
            }
        }
        if ((p7.getParent() == null) || (v0_3 != null)) {
            return v0_3;
        } else {
            java.util.Iterator v0_6 = p8.getElements().iterator();
            while (v0_6.hasNext()) {
                com.alightcreative.app.motion.scene.SceneElement v2_3 = v0_6.next();
                long v3_2 = ((com.alightcreative.app.motion.scene.SceneElement) v2_3).getId();
                long v5_0 = p7.getParent();
                if ((v5_0 != 0) && (v3_2 == v5_0.longValue())) {
                }
                com.alightcreative.app.motion.scene.SceneElement v2_4 = ((com.alightcreative.app.motion.scene.SceneElement) v2_3);
                if (v2_4 == null) {
                    return 0;
                } else {
                    return com.alightcreative.app.motion.scene.SceneElementKt.indirectParent(v2_4, p8, p9);
                }
            }
            v2_3 = 0;
        }
    }

    public static final boolean isElementOrLinkedProject(com.alightcreative.app.motion.scene.SceneElement p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        if ((p2.getType() != com.alightcreative.app.motion.scene.SceneElementType.Scene) || (p2.getLinkedSceneUUID() == null)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final boolean isGroup(com.alightcreative.app.motion.scene.SceneElement p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        if ((p2.getType() != com.alightcreative.app.motion.scene.SceneElementType.Scene) || (p2.getLinkedSceneUUID() != null)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final boolean isTimeDependent(com.alightcreative.app.motion.scene.Scene p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        int v0_1 = com.alightcreative.app.motion.scene.SceneKt.getDuration(p5);
        int v5_3 = p5.getElements();
        if ((v5_3 == 0) || (!v5_3.isEmpty())) {
            int v5_1 = v5_3.iterator();
            while (v5_1.hasNext()) {
                int v2_3 = ((com.alightcreative.app.motion.scene.SceneElement) v5_1.next());
                if ((com.alightcreative.app.motion.scene.SceneElementKt.isTimeDependent(v2_3)) || ((v2_3.getStartTime() > 5) || (v2_3.getEndTime() < (v0_1 - 5)))) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public static final boolean isTimeDependent(com.alightcreative.app.motion.scene.SceneElement p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        if ((!p2.getType().getHasFillVideo()) || (p2.getFillVideo() == null)) {
            boolean v0_1 = com.alightcreative.app.motion.scene.SceneElementKt.getKeyableProperties(p2);
            if ((!v0_1) || (!v0_1.isEmpty())) {
                boolean v0_2 = v0_1.iterator();
                while (v0_2.hasNext()) {
                    if (((com.alightcreative.app.motion.scene.Keyable) v0_2.next()).getKeyed()) {
                    }
                    return 1;
                }
            }
            if ((!p2.getType().getHasNestedScene()) || (!com.alightcreative.app.motion.scene.SceneElementKt.isTimeDependent(p2.getNestedScene()))) {
                if (p2.getType().getHasVisualEffects()) {
                    java.util.Iterator v2_3 = com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt.getVisualEffects();
                    if ((v2_3 == null) || (!v2_3.isEmpty())) {
                        java.util.Iterator v2_4 = v2_3.iterator();
                        while (v2_4.hasNext()) {
                            if (com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt.isNaturallyTimeDependent(((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) v2_4.next()))) {
                                return 1;
                            }
                        }
                    }
                }
                return 0;
            }
        }
        return 1;
    }

    public static final boolean isValidUserElementTag(String p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return (kotlin.text.StringsKt.isBlank(p1) ^ 1);
    }

    public static synthetic com.alightcreative.app.motion.scene.StrokePoint j(String p0)
    {
        return com.alightcreative.app.motion.scene.SceneElementKt.unserializeStroke$lambda$64(p0);
    }

    public static final com.alightcreative.app.motion.scene.SceneElement mapChildren(com.alightcreative.app.motion.scene.SceneElement p46, kotlin.jvm.functions.Function1 p47)
    {
        com.alightcreative.app.motion.scene.SceneElement v1_1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p46, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p47, "transform");
        if (!p46.getType().getHasNestedScene()) {
            v1_1 = p46;
        } else {
            int v3_0 = p46.getNestedScene();
            com.alightcreative.app.motion.scene.SceneElement v1_3 = p46.getNestedScene().getElements();
            int v10_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v1_3, 10));
            com.alightcreative.app.motion.scene.SceneElement v1_4 = v1_3.iterator();
            while (v1_4.hasNext()) {
                v10_1.add(com.alightcreative.app.motion.scene.SceneElementKt.mapChildren(((com.alightcreative.app.motion.scene.SceneElement) v1_4.next()), p47));
            }
            v1_1 = com.alightcreative.app.motion.scene.SceneElement.copy$default(p46, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.Scene.copy$default(v3_0, 0, 0, 0, 0, 0, 0, v10_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1048511, 0), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8388609, 127, 0);
        }
        return ((com.alightcreative.app.motion.scene.SceneElement) p47.invoke(v1_1));
    }

    public static final com.alightcreative.app.motion.scene.SceneElement mapChildrenWithDepth(com.alightcreative.app.motion.scene.SceneElement p46, int p47, kotlin.jvm.functions.Function2 p48)
    {
        com.alightcreative.app.motion.scene.SceneElement v1_1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p46, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p48, "transform");
        if (!p46.getType().getHasNestedScene()) {
            v1_1 = p46;
        } else {
            int v3_0 = p46.getNestedScene();
            com.alightcreative.app.motion.scene.SceneElement v1_3 = p46.getNestedScene().getElements();
            int v10_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v1_3, 10));
            com.alightcreative.app.motion.scene.SceneElement v1_4 = v1_3.iterator();
            while (v1_4.hasNext()) {
                v10_1.add(com.alightcreative.app.motion.scene.SceneElementKt.mapChildrenWithDepth(((com.alightcreative.app.motion.scene.SceneElement) v1_4.next()), (p47 + 1), p48));
            }
            v1_1 = com.alightcreative.app.motion.scene.SceneElement.copy$default(p46, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.Scene.copy$default(v3_0, 0, 0, 0, 0, 0, 0, v10_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1048511, 0), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8388609, 127, 0);
        }
        return ((com.alightcreative.app.motion.scene.SceneElement) p48.invoke(Integer.valueOf(p47), v1_1));
    }

    public static synthetic com.alightcreative.app.motion.scene.SceneElement mapChildrenWithDepth$default(com.alightcreative.app.motion.scene.SceneElement p0, int p1, kotlin.jvm.functions.Function2 p2, int p3, Object p4)
    {
        if ((p3 & 1) != 0) {
            p1 = 0;
        }
        return com.alightcreative.app.motion.scene.SceneElementKt.mapChildrenWithDepth(p0, p1, p2);
    }

    public static synthetic com.alightcreative.app.motion.scene.SceneElement q(com.alightcreative.app.motion.scene.SceneElement p0)
    {
        return com.alightcreative.app.motion.scene.SceneElementKt.withAbsoluteTimingAndSpeedInScene$lambda$74$lambda$73$lambda$72(p0);
    }

    public static final com.alightcreative.app.motion.scene.SceneElement recreateEngineState(com.alightcreative.app.motion.scene.SceneElement p45)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p45, "<this>");
        com.alightcreative.app.motion.scene.EngineState v7_1 = new com.alightcreative.app.motion.scene.EngineState(sC.xfY.hUw.hUw());
        int v8_1 = p45.getNestedScene();
        com.alightcreative.app.motion.scene.SceneElement v0_2 = p45.getNestedScene().getElements();
        int v15_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_2, 10));
        com.alightcreative.app.motion.scene.SceneElement v0_3 = v0_2.iterator();
        while (v0_3.hasNext()) {
            v15_1.add(com.alightcreative.app.motion.scene.SceneElementKt.recreateEngineState(((com.alightcreative.app.motion.scene.SceneElement) v0_3.next())));
        }
        return com.alightcreative.app.motion.scene.SceneElement.copy$default(p45, 0, 0, 0, 0, v7_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.Scene.copy$default(v8_1, 0, 0, 0, 0, 0, 0, v15_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1048511, 0), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8388625, 127, 0);
    }

    public static final int sceneFrameToMediaFrameMillis(com.alightcreative.app.motion.scene.SceneElement p2, int p3, int p4)
    {
        int v3_7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        int v3_3 = kotlin.math.MathKt.roundToInt(((((float) (com.alightcreative.app.motion.scene.TimeKt.timeFromFrameNumber(p3, p4) - p2.getStartTime())) * com.alightcreative.app.motion.scene.SceneElementKt.getAudioVideoSpeedFactor(p2)) + ((float) p2.getStartTime())));
        int v0_4 = (p2.getOutTime() - p2.getInTime());
        if (!p2.getLoop()) {
            v3_7 = Math.min((Math.min(v3_3, p2.getEndTime()) - p2.getStartTime()), v0_4);
        } else {
            v3_7 = ((Math.min(v3_3, p2.getEndTime()) - p2.getStartTime()) % v0_4);
        }
        return com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime((v3_7 + p2.getInTime()), p4);
    }

    public static final int sceneFrameToMediaTimeMillis(com.alightcreative.app.motion.scene.SceneElement p2, int p3, int p4, int p5)
    {
        int v3_6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        int v5_1 = Math.max(p5, p2.getStartTime());
        int v3_3 = kotlin.math.MathKt.roundToInt(((((float) (com.alightcreative.app.motion.scene.TimeKt.timeFromFrameNumber(p3, p4) - v5_1)) * com.alightcreative.app.motion.scene.SceneElementKt.getAudioVideoSpeedFactor(p2)) + ((float) v5_1)));
        int v4_4 = (p2.getOutTime() - p2.getInTime());
        if (!p2.getLoop()) {
            v3_6 = Math.min((Math.min(v3_3, ((p2.getEndTime() - p2.getStartTime()) + v5_1)) - v5_1), v4_4);
        } else {
            v3_6 = ((Math.min(v3_3, ((p2.getEndTime() - p2.getStartTime()) + v5_1)) - v5_1) % v4_4);
        }
        return (v3_6 + p2.getInTime());
    }

    public static final int sceneTime(com.alightcreative.app.motion.scene.SceneElement p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return ((int) ((((float) (p2.getEndTime() - p2.getStartTime())) * p3) + ((float) p2.getStartTime())));
    }

    public static final double sceneTimeSeconds(com.alightcreative.app.motion.scene.SceneElement p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return (((double) ((((float) (p2.getEndTime() - p2.getStartTime())) * p3) + ((float) p2.getStartTime()))) / 4652007308841189376);
    }

    public static final long sceneTimeToMediaTimeMicros(com.alightcreative.app.motion.scene.SceneElement p6, long p7)
    {
        long v7_3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        long v0_5 = (((long) (p6.getOutTime() - p6.getInTime())) * 1000);
        if (!p6.getLoop()) {
            v7_3 = Math.min((Math.min(p7, (((long) p6.getEndTime()) * 1000)) - (((long) p6.getStartTime()) * 1000)), v0_5);
        } else {
            v7_3 = ((Math.min(p7, (((long) p6.getEndTime()) * 1000)) - (((long) p6.getStartTime()) * 1000)) % v0_5);
        }
        return (v7_3 + ((long) p6.getInTime()));
    }

    public static final int sceneTimeToMediaTimeMillis(com.alightcreative.app.motion.scene.SceneElement p2, int p3)
    {
        int v3_3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        int v0_2 = (p2.getOutTime() - p2.getInTime());
        if (!p2.getLoop()) {
            v3_3 = Math.min((Math.min(p3, p2.getEndTime()) - p2.getStartTime()), v0_2);
        } else {
            v3_3 = ((Math.min(p3, p2.getEndTime()) - p2.getStartTime()) % v0_2);
        }
        return (v3_3 + p2.getInTime());
    }

    public static final long sceneTimeToMediaTimeNanos(com.alightcreative.app.motion.scene.SceneElement p6, long p7)
    {
        long v7_3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        long v0_5 = (((long) (p6.getOutTime() - p6.getInTime())) * 1000000);
        if (!p6.getLoop()) {
            v7_3 = Math.min((Math.min(p7, (((long) p6.getEndTime()) * 1000000)) - (((long) p6.getStartTime()) * 1000000)), v0_5);
        } else {
            v7_3 = ((Math.min(p7, (((long) p6.getEndTime()) * 1000000)) - (((long) p6.getStartTime()) * 1000000)) % v0_5);
        }
        return (v7_3 + ((long) p6.getInTime()));
    }

    public static final void serialize(com.alightcreative.app.motion.scene.SceneElement p1, String p2, org.xmlpull.v1.XmlSerializer p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "serializer");
        p1.getType().serialize(p1, p2, p3);
        return;
    }

    public static final void serialize(com.alightcreative.app.motion.scene.Stroke p11, String p12, org.xmlpull.v1.XmlSerializer p13)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "serializer");
        String v0_3 = com.alightcreative.app.motion.scene.SceneElementKt.pointStringCache;
        String v1_0 = v0_3.get(p11);
        if (v1_0 == null) {
            v1_0 = kotlin.collections.CollectionsKt.joinToString$default(p11.getPoints(), ";", 0, 0, 0, 0, new com.alightcreative.app.motion.scene.t(), 30, 0);
            v0_3.put(p11, v1_0);
        }
        String v1_1 = ((String) v1_0);
        p13.startTag(p12, "stroke");
        p13.attribute(p12, "color", FKt.Ep.j(com.alightcreative.app.motion.scene.ColorKt.toInt(p11.getColor())));
        FKt.k.hUw(p13, p12, "width", p11.getWidth());
        String v11_2 = p11.getTool().name();
        String v2_4 = java.util.Locale.ENGLISH;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_4, "ENGLISH");
        String v11_3 = v11_2.toLowerCase(v2_4);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v11_3, "toLowerCase(...)");
        p13.attribute(p12, "type", v11_3);
        p13.attribute(p12, "points", v1_1);
        p13.endTag(p12, "stroke");
        return;
    }

    private static final CharSequence serialize$lambda$60$lambda$59(com.alightcreative.app.motion.scene.StrokePoint p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "it");
        String v0_4 = FKt.VI.hUw(p3.getLocation().getX());
        String v1_1 = FKt.VI.hUw(p3.getLocation().getY());
        String v3_2 = FKt.VI.hUw(p3.getPressure());
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append(v0_4);
        v2_1.append(",");
        v2_1.append(v1_1);
        v2_1.append(",");
        v2_1.append(v3_2);
        return v2_1.toString();
    }

    public static final void serializeCommonAttributes(com.alightcreative.app.motion.scene.SceneElement p8, String p9, org.xmlpull.v1.XmlSerializer p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "serializer");
        FKt.k.cD(p10, p9, "id", p8.getId());
        if (!kotlin.text.StringsKt.isBlank(p8.getTag().getId())) {
            p10.attribute(p9, "tag", p8.getTag().getId());
        }
        if (!kotlin.text.StringsKt.isBlank(p8.getLabel())) {
            p10.attribute(p9, "label", p8.getLabel());
        }
        if (p8.getHidden()) {
            FKt.k.x(p10, p9, "hidden", 1);
        }
        FKt.k.j(p10, p9, "startTime", p8.getStartTime());
        FKt.k.j(p10, p9, "endTime", p8.getEndTime());
        if (p8.getClippingMask()) {
            FKt.k.x(p10, p9, "clippingMask", 1);
        }
        if (p8.getType().getHasFillType()) {
            String v0_62 = p8.getFillType().name();
            String v3_2 = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v3_2, "ENGLISH");
            String v0_63 = v0_62.toLowerCase(v3_2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_63, "toLowerCase(...)");
            p10.attribute(p9, "fillType", v0_63);
        }
        if ((p8.getType().getHasBlendingMode()) && (p8.getBlendingMode() != com.alightcreative.app.motion.scene.BlendingMode.NORMAL)) {
            p10.attribute(p9, "blending", p8.getBlendingMode().getId());
        }
        if ((p8.getType().getHasFillImage()) && (p8.getFillImage() != null)) {
            p10.attribute(p9, "fillImage", p8.getFillImage().toString());
        }
        if ((p8.getType() != com.alightcreative.app.motion.scene.SceneElementType.Scene) || (p8.getNestedScene().getReTimingMethod() != com.alightcreative.app.motion.scene.ReTimingMethod.OFF)) {
            if (!p8.getType().getHasSourceMedia()) {
                if ((p8.getType().getHasFillVideo()) && (p8.getFillVideo() != null)) {
                    p10.attribute(p9, "fillVideo", p8.getFillVideo().toString());
                    if (p8.getInTime() != 0) {
                        FKt.k.j(p10, p9, "inTime", p8.getInTime());
                    }
                    if (p8.getOutTime() != 2147483647) {
                        FKt.k.j(p10, p9, "outTime", p8.getOutTime());
                    }
                    if (p8.getLoop()) {
                        FKt.k.x(p10, p9, "loop", 1);
                    }
                }
            } else {
                p10.attribute(p9, "src", p8.getSrc().toString());
                if (p8.getInTime() != 0) {
                    FKt.k.j(p10, p9, "inTime", p8.getInTime());
                }
                if (p8.getOutTime() != 2147483647) {
                    FKt.k.j(p10, p9, "outTime", p8.getOutTime());
                }
                if (p8.getLoop()) {
                    FKt.k.x(p10, p9, "loop", 1);
                }
            }
        } else {
            if (p8.getInTime() != 0) {
                FKt.k.j(p10, p9, "inTime", p8.getInTime());
            }
            if (p8.getOutTime() != 2147483647) {
                FKt.k.j(p10, p9, "outTime", p8.getOutTime());
            }
        }
        if (p8.getSpeedMap().getKeyframes().size() == 1) {
            String v0_39 = ((Number) ((com.alightcreative.app.motion.scene.Keyframe) kotlin.collections.CollectionsKt.first(p8.getSpeedMap().getKeyframes())).getValue()).floatValue();
            if (v0_39 != 1065353216) {
                FKt.k.hUw(p10, p9, "speed", v0_39);
            }
        }
        String v0_43 = p8.getMediaFillMode().toString().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_43, "toLowerCase(...)");
        p10.attribute(p9, "mediaFillMode", v0_43);
        if (p8.getParent() != null) {
            FKt.k.cD(p10, p9, "parent", p8.getParent().longValue());
        }
        String v0_48 = p8.getTemplatePPId();
        if (v0_48 != null) {
            p10.attribute(p9, "templatePPId", v0_48);
        }
        String v8_1 = p8.getPresetId();
        if (v8_1 != null) {
            p10.attribute(p9, "presetId", v8_1);
        }
        return;
    }

    public static final void serializeCommonChildTags(com.alightcreative.app.motion.scene.SceneElement p10, String p11, org.xmlpull.v1.XmlSerializer p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "serializer");
        if (p10.getType().getHasTransform()) {
            com.alightcreative.app.motion.scene.TransformKt.serialize(p10.getTransform(), p11, p12, "transform");
        }
        if (p10.getType().getHasFillColor()) {
            com.alightcreative.app.motion.scene.KeyableSerializerKt.serialize$default(p10.getFillColor(), com.alightcreative.app.motion.scene.SolidColor.Companion.getWHITE(), p11, p12, "fillColor", 0, 16, 0);
        }
        if (p10.getType().getHasFillGradient()) {
            com.alightcreative.app.motion.scene.GradientFillKt.serialize(p10.getFillGradient(), com.alightcreative.app.motion.scene.GradientFill.Companion.getDEFAULT(), p11, p12, "gradient");
        }
        if (p10.getType().getHasVisualEffects()) {
            kotlin.NoWhenBranchMatchedException v0_17 = com.alightcreative.app.motion.scene.SceneElementKt.getVisualEffectsInOrder(p10).iterator();
            while (v0_17.hasNext()) {
                com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt.serialize(((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) v0_17.next()), p11, p12);
            }
        }
        if (p10.getType().getHasGain()) {
            com.alightcreative.app.motion.scene.KeyableSerializerKt.serialize$default(p10.getGain(), Float.valueOf(1065353216), p11, p12, "gain", 0, 16, 0);
        }
        if (p10.getSpeedMap().getKeyframes().size() > 1) {
            com.alightcreative.app.motion.scene.KeyableSerializerKt.serialize$default(p10.getSpeedMap(), Float.valueOf(1065353216), p11, p12, "speedMap", 0, 16, 0);
        }
        if (p10.getType().getHasBorderAndShadow()) {
            kotlin.NoWhenBranchMatchedException v0_29 = p10.getBorders().iterator();
            while (v0_29.hasNext()) {
                com.alightcreative.app.motion.scene.KeyableEdgeDecoration v4_5;
                com.alightcreative.app.motion.scene.KeyableEdgeDecoration v1_5 = ((com.alightcreative.app.motion.scene.KeyableEdgeDecoration) v0_29.next());
                com.alightcreative.app.motion.scene.KeyableEdgeDecoration v4_3 = com.alightcreative.app.motion.scene.SceneElementKt$WhenMappings.$EnumSwitchMapping$2[v1_5.getDirection().ordinal()];
                if (v4_3 == 1) {
                    v4_5 = com.alightcreative.app.motion.scene.KeyableEdgeDecoration.Companion.getNO_INNER_BORDER();
                } else {
                    if (v4_3 == 2) {
                        v4_5 = com.alightcreative.app.motion.scene.KeyableEdgeDecoration.Companion.getNO_OUTER_BORDER();
                    } else {
                        if (v4_3 != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        } else {
                            v4_5 = com.alightcreative.app.motion.scene.KeyableEdgeDecoration.Companion.getNO_CENTERED_BORDER();
                        }
                    }
                }
                com.alightcreative.app.motion.scene.EdgeDecorationKt.serialize(v1_5, v4_5, p11, p12);
            }
            com.alightcreative.app.motion.scene.KeyableEdgeDecoration v1_1 = com.alightcreative.app.motion.scene.KeyableEdgeDecoration.Companion;
            com.alightcreative.app.motion.scene.EdgeDecorationKt.serialize(p10.getStroke(), v1_1.getNO_STROKE(), p11, p12);
            com.alightcreative.app.motion.scene.EdgeDecorationKt.serialize(p10.getDropShadow(), v1_1.getNO_SHADOW(), p11, p12);
        }
        return;
    }

    public static final com.alightcreative.app.motion.scene.SceneElement unserializeBaseSceneElement(com.alightcreative.app.motion.scene.SceneElementType p44, String p45, org.xmlpull.v1.XmlPullParser p46)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p44, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p46, "parser");
        int v3_8 = p46.getAttributeValue(p45, "startTime");
        if (v3_8 != 0) {
            int v3_0 = kotlin.text.StringsKt.toIntOrNull(v3_8);
            if (v3_0 != 0) {
                int v3_3 = v3_0.intValue();
                long v4_2 = p46.getAttributeValue(p45, "endTime");
                if (v4_2 != 0) {
                    long v4_3 = kotlin.text.StringsKt.toIntOrNull(v4_2);
                    if (v4_3 != 0) {
                        long v4_4 = v4_3.intValue();
                        float v5_1 = p46.getAttributeValue(p45, "label");
                        if (v5_1 == 0) {
                            v5_1 = "";
                        }
                        float v5_5;
                        String v7 = v5_1;
                        float v5_3 = p46.getAttributeValue(p45, "speed");
                        if (v5_3 == 0) {
                            v5_5 = 1065353216;
                        } else {
                            float v5_4 = kotlin.text.StringsKt.toFloatOrNull(v5_3);
                            if (v5_4 == 0) {
                            } else {
                                v5_5 = v5_4.floatValue();
                            }
                        }
                        int v19;
                        com.alightcreative.app.motion.scene.EngineState v6_11 = p46.getAttributeValue(p45, "inTime");
                        if (v6_11 == null) {
                            v19 = 0;
                        } else {
                            com.alightcreative.app.motion.scene.EngineState v6_12 = kotlin.text.StringsKt.toIntOrNull(v6_11);
                            if (v6_12 == null) {
                            } else {
                                v19 = v6_12.intValue();
                            }
                        }
                        com.alightcreative.app.motion.scene.EngineState v6_17;
                        com.alightcreative.app.motion.scene.EngineState v6_15 = p46.getAttributeValue(p45, "outTime");
                        if (v6_15 == null) {
                            v6_17 = 2147483647;
                        } else {
                            com.alightcreative.app.motion.scene.EngineState v6_16 = kotlin.text.StringsKt.toIntOrNull(v6_15);
                            if (v6_16 == null) {
                            } else {
                                v6_17 = v6_16.intValue();
                            }
                        }
                        int v21;
                        int v20 = v6_17;
                        com.alightcreative.app.motion.scene.EngineState v6_19 = p46.getAttributeValue(p45, "loop");
                        if (v6_19 == null) {
                            v21 = 0;
                        } else {
                            v21 = Boolean.parseBoolean(v6_19);
                        }
                        com.alightcreative.app.motion.scene.EngineState v6_21 = com.alightcreative.app.motion.scene.ElementTag.values();
                        int v10_0 = 0;
                        while (v10_0 < v6_21.length) {
                            int v12_0 = v6_21[v10_0];
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(v12_0.getId(), p46.getAttributeValue(p45, "tag"))) {
                                v10_0++;
                            }
                            if (v12_0 == 0) {
                                v12_0 = com.alightcreative.app.motion.scene.ElementTag.NONE;
                            }
                            com.alightcreative.app.motion.scene.KeyableSolidColor v9_1;
                            com.alightcreative.app.motion.scene.ElementTag v29 = v12_0;
                            com.alightcreative.app.motion.scene.EngineState v6_1 = p46.getAttributeValue(p45, "id");
                            if (v6_1 == null) {
                                v9_1 = 0;
                            } else {
                                com.alightcreative.app.motion.scene.EngineState v6_2 = kotlin.text.StringsKt.toLongOrNull(v6_1);
                                if (v6_2 == null) {
                                } else {
                                    v9_1 = v6_2.longValue();
                                }
                            }
                            com.alightcreative.app.motion.scene.EngineState v6_5;
                            com.alightcreative.app.motion.scene.EngineState v6_4 = p46.getAttributeValue(p45, "fillType");
                            if (v6_4 == null) {
                                v6_5 = 0;
                            } else {
                                int v13_2 = com.alightcreative.app.motion.scene.FillType.values();
                                com.alightcreative.app.motion.scene.rendering.TextureCropMode v14_2 = java.util.Locale.ENGLISH;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v14_2, "ENGLISH");
                                com.alightcreative.app.motion.scene.EngineState v6_6 = v6_4.toUpperCase(v14_2);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v6_6, "toUpperCase(...)");
                                v6_5 = ((com.alightcreative.app.motion.scene.FillType) FKt.nn.hUw(v13_2, v6_6));
                            }
                            com.alightcreative.app.motion.scene.KeyableFloat v17_0;
                            int v13_4 = p46.getAttributeValue(p45, "blending");
                            if (v13_4 == 0) {
                                v17_0 = com.alightcreative.app.motion.scene.BlendingMode.NORMAL;
                            } else {
                                com.alightcreative.app.motion.scene.rendering.TextureCropMode v14_3 = com.alightcreative.app.motion.scene.BlendingMode.values();
                                int v8_0 = 0;
                                while (v8_0 < v14_3.length) {
                                    v17_0 = v14_3[v8_0];
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(v17_0.getId(), v13_4)) {
                                        v8_0++;
                                    }
                                    if (v17_0 == null) {
                                    }
                                }
                                v17_0 = 0;
                            }
                            int v8_3;
                            com.alightcreative.app.motion.scene.BlendingMode v24 = v17_0;
                            int v8_2 = p46.getAttributeValue(p45, "fillImage");
                            if (v8_2 == 0) {
                                v8_3 = 0;
                            } else {
                                v8_3 = android.net.Uri.parse(v8_2);
                            }
                            int v11_4;
                            int v11_3 = p46.getAttributeValue(p45, "fillVideo");
                            if (v11_3 == 0) {
                                v11_4 = 0;
                            } else {
                                v11_4 = android.net.Uri.parse(v11_3);
                            }
                            int v12_3;
                            int v13_6 = p46.getAttributeValue(p45, "mediaFillMode");
                            if (v13_6 == 0) {
                                v12_3 = com.alightcreative.app.motion.scene.rendering.TextureCropMode.STRETCH;
                            } else {
                                com.alightcreative.app.motion.scene.rendering.TextureCropMode v14_4 = com.alightcreative.app.motion.scene.rendering.TextureCropMode.values();
                                int v13_7 = v13_6.toUpperCase(java.util.Locale.ROOT);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v13_7, "toUpperCase(...)");
                                v12_3 = ((com.alightcreative.app.motion.scene.rendering.TextureCropMode) FKt.nn.hUw(v14_4, v13_7));
                                if (v12_3 == 0) {
                                }
                            }
                            int v35;
                            com.alightcreative.app.motion.scene.rendering.TextureCropMode v14_5 = v12_3;
                            int v12_5 = p46.getAttributeValue(p45, "hidden");
                            if (v12_5 == 0) {
                                v35 = 0;
                            } else {
                                v35 = Boolean.parseBoolean(v12_5);
                            }
                            int v38;
                            int v12_8 = p46.getAttributeValue(p45, "clippingMask");
                            if (v12_8 == 0) {
                                v38 = 0;
                            } else {
                                v38 = Boolean.parseBoolean(v12_8);
                            }
                            int v12_12;
                            int v12_11 = p46.getAttributeValue(p45, "src");
                            if (v12_11 == 0) {
                                v12_12 = android.net.Uri.EMPTY;
                            } else {
                                v12_12 = android.net.Uri.parse(v12_11);
                                if (v12_12 == 0) {
                                }
                            }
                            int v37;
                            android.net.Uri v16 = v12_12;
                            int v12_14 = p46.getAttributeValue(p45, "parent");
                            if (v12_14 == 0) {
                                v37 = 0;
                            } else {
                                v37 = kotlin.text.StringsKt.toLongOrNull(v12_14);
                            }
                            int v39;
                            int v12_17 = p46.getAttributeValue(p45, "templatePPId");
                            if (v12_17 == 0) {
                                v39 = 0;
                            } else {
                                v39 = v12_17.toString();
                            }
                            int v40;
                            com.alightcreative.app.motion.scene.FillType v0_2 = p46.getAttributeValue(p45, "presetId");
                            if (v0_2 == null) {
                                v40 = 0;
                            } else {
                                v40 = v0_2.toString();
                            }
                            com.alightcreative.app.motion.scene.FillType v0_4 = v6_5;
                            com.alightcreative.app.motion.scene.EngineState v6_9 = new com.alightcreative.app.motion.scene.EngineState(sC.xfY.hUw.hUw());
                            kotlin.jvm.internal.Intrinsics.checkNotNull(v16);
                            if (v0_4 == null) {
                                if ((v11_4 == 0) && (v8_3 == 0)) {
                                    if (!com.alightcreative.app.motion.scene.SceneElementTypeKt.getSupportsIntrinsicFill(p44)) {
                                        if ((p44 != com.alightcreative.app.motion.scene.SceneElementType.Shape) && (p44 != com.alightcreative.app.motion.scene.SceneElementType.Text)) {
                                            v0_4 = com.alightcreative.app.motion.scene.FillType.NONE;
                                        } else {
                                            v0_4 = com.alightcreative.app.motion.scene.FillType.COLOR;
                                        }
                                    } else {
                                        v0_4 = com.alightcreative.app.motion.scene.FillType.INTRINSIC;
                                    }
                                } else {
                                    v0_4 = com.alightcreative.app.motion.scene.FillType.MEDIA;
                                }
                            }
                            return new com.alightcreative.app.motion.scene.SceneElement(p44, v3_3, v4_4, v9_1, v6_9, v7, 0, com.alightcreative.app.motion.scene.KeyableSolidColor.Companion.getWHITE(), v8_3, v11_4, 0, v0_4, v14_5, 0, v16, com.alightcreative.app.motion.scene.KeyableKt.keyable(v5_5), 0, v19, v20, v21, 0, 0, v24, 0, 0, 0, 0, v29, 0, 0, 0, 0, 0, v35, 0, v37, v38, v39, v40, -139385792, 5, 0);
                        }
                        v12_0 = 0;
                    }
                }
                String v1_3 = p46.getPositionDescription();
                String v2_6 = new StringBuilder();
                v2_6.append("endTime missing: ");
                v2_6.append(v1_3);
                throw new org.xmlpull.v1.XmlPullParserException(v2_6.toString());
            }
        }
        String v1_1 = p46.getPositionDescription();
        String v2_1 = new StringBuilder();
        v2_1.append("startTime missing: ");
        v2_1.append(v1_1);
        throw new org.xmlpull.v1.XmlPullParserException(v2_1.toString());
    }

    public static final com.alightcreative.app.motion.scene.SceneElement unserializeCommonChildTag(com.alightcreative.app.motion.scene.SceneElement p45, String p46, String p47, org.xmlpull.v1.XmlPullParser p48, boolean p49)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p45, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p46, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p48, "parser");
        int v5_0 = p46.hashCode();
        int v6_1 = Float.valueOf(1065353216);
        switch (v5_0) {
            case -2131201131:
                if (p46.equals("speedMap")) {
                    return com.alightcreative.app.motion.scene.SceneElement.copy$default(p45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.KeyableSerializerKt.unserializeKeyable(p47, p48, p46, v6_1, p49), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -32769, 127, 0);
                } else {
                }
            case -1383304148:
                if (p46.equals("border")) {
                    com.alightcreative.app.motion.scene.KeyableEdgeDecoration v33_4 = com.alightcreative.app.motion.scene.EdgeDecorationKt.unserializeKeyableEdgeDecoration(p47, p48, p46, p49);
                    com.alightcreative.app.motion.scene.KeyableEdgeDecoration v0_11 = com.alightcreative.app.motion.scene.SceneElementKt$WhenMappings.$EnumSwitchMapping$3[v33_4.getType().ordinal()];
                    if (v0_11 == 1) {
                        int v2_11 = new StringBuilder();
                        v2_11.append("An operation is not implemented: ");
                        v2_11.append("Implement glow support");
                        throw new kotlin.NotImplementedError(v2_11.toString());
                    } else {
                        int v4_4 = 0;
                        if (v0_11 == 2) {
                            com.alightcreative.app.motion.scene.KeyableEdgeDecoration v0_20;
                            int v35_4 = v33_4;
                            if (v35_4.getBorderId() <= 0) {
                                com.alightcreative.app.motion.scene.KeyableEdgeDecoration v0_18 = p45.getBorders().iterator();
                                if (v0_18.hasNext()) {
                                    Integer v1_33 = Integer.valueOf(((com.alightcreative.app.motion.scene.KeyableEdgeDecoration) v0_18.next()).getBorderId());
                                    do {
                                        v4_4 = v1_33;
                                        if (!v0_18.hasNext()) {
                                            break;
                                        }
                                        v1_33 = Integer.valueOf(((com.alightcreative.app.motion.scene.KeyableEdgeDecoration) v0_18.next()).getBorderId());
                                        if (v4_4.compareTo(v1_33) < 0) {
                                        } else {
                                        }
                                    } while(!v0_18.hasNext());
                                }
                                com.alightcreative.app.motion.scene.KeyableEdgeDecoration v0_19;
                                if (v4_4 == 0) {
                                    v0_19 = 0;
                                } else {
                                    v0_19 = v4_4.intValue();
                                }
                                v0_20 = com.alightcreative.app.motion.scene.KeyableEdgeDecoration.copy$default(v35_4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (v0_19 + 1), 8191, 0);
                            } else {
                                com.alightcreative.app.motion.scene.KeyableEdgeDecoration v0_15 = p45.getBorders();
                                if ((v0_15 == null) || (!v0_15.isEmpty())) {
                                    com.alightcreative.app.motion.scene.KeyableEdgeDecoration v0_16 = v0_15.iterator();
                                    while (v0_16.hasNext()) {
                                        if (((com.alightcreative.app.motion.scene.KeyableEdgeDecoration) v0_16.next()).getBorderId() == v35_4.getBorderId()) {
                                        }
                                        return com.alightcreative.app.motion.scene.SceneElement.copy$default(p45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, kotlin.collections.CollectionsKt.plus(p45.getBorders(), v0_20), 0, 0, 0, 0, 0, 0, 0, 2147483647, 127, 0);
                                    }
                                }
                                v0_20 = v35_4;
                            }
                            return com.alightcreative.app.motion.scene.SceneElement.copy$default(p45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, kotlin.collections.CollectionsKt.plus(p45.getBorders(), v0_20), 0, 0, 0, 0, 0, 0, 0, 2147483647, 127, 0);
                        } else {
                            if (v0_11 == 3) {
                                int v35_6 = v33_4;
                                com.alightcreative.app.motion.scene.KeyableEdgeDecoration v0_24 = com.alightcreative.app.motion.scene.SceneElementKt$WhenMappings.$EnumSwitchMapping$2[v35_6.getDirection().ordinal()];
                                if (v0_24 == 1) {
                                    throw new kotlin.NotImplementedError(0, 1, 0);
                                } else {
                                    if (v0_24 == 2) {
                                        throw new kotlin.NotImplementedError(0, 1, 0);
                                    } else {
                                        if (v0_24 != 3) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        } else {
                                            return com.alightcreative.app.motion.scene.SceneElement.copy$default(p45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v35_6, 0, 0, 0, 0, 0, 0, 0, 0, -1073741825, 127, 0);
                                        }
                                    }
                                }
                            } else {
                                if (v0_11 == 4) {
                                    com.alightcreative.app.motion.scene.KeyableEdgeDecoration v0_34 = com.alightcreative.app.motion.scene.SceneElementKt$WhenMappings.$EnumSwitchMapping$2[v33_4.getDirection().ordinal()];
                                    if (v0_34 == 1) {
                                        int v2_16 = new StringBuilder();
                                        v2_16.append("An operation is not implemented: ");
                                        v2_16.append("Implement inner shadow");
                                        throw new kotlin.NotImplementedError(v2_16.toString());
                                    } else {
                                        if (v0_34 == 2) {
                                            return com.alightcreative.app.motion.scene.SceneElement.copy$default(p45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v33_4, 0, 0, 0, 0, 0, 0, -1, 126, 0);
                                        } else {
                                            if (v0_34 == 3) {
                                                throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException(0, 0, 0, 7, 0);
                                            } else {
                                                throw new kotlin.NoWhenBranchMatchedException();
                                            }
                                        }
                                    }
                                } else {
                                    if (v0_11 == 5) {
                                        throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException(0, 0, 0, 7, 0);
                                    } else {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    }
                                }
                            }
                        }
                    }
                } else {
                }
            case -1306084975:
                if (p46.equals("effect")) {
                    com.alightcreative.app.motion.scene.KeyableEdgeDecoration v0_6 = com.alightcreative.app.motion.scene.visualeffect.VisualEffectKt.unserializeVisualEffect(p47, p48, p49);
                    return com.alightcreative.app.motion.scene.SceneElement.copy$default(p45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, kotlin.collections.MapsKt.plus(p45.getVisualEffects(), kotlin.TuplesKt.to(Long.valueOf(v0_6.getInstanceId()), v0_6)), kotlin.collections.CollectionsKt.plus(p45.getVisualEffectOrder(), Long.valueOf(v0_6.getInstanceId())), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -100663297, 127, 0);
                } else {
                }
            case -1141881952:
                if (p46.equals("fillColor")) {
                    return com.alightcreative.app.motion.scene.SceneElement.copy$default(p45, 0, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.KeyableSerializerKt.unserializeKeyable(p47, p48, p46, com.alightcreative.app.motion.scene.SolidColor.Companion.getWHITE(), p49), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -129, 127, 0);
                } else {
                }
            case -903579360:
                if (p46.equals("shadow")) {
                } else {
                }
                break;
            case 3165055:
                if (p46.equals("gain")) {
                    return com.alightcreative.app.motion.scene.SceneElement.copy$default(p45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.KeyableSerializerKt.unserializeKeyable(p47, p48, p46, v6_1, p49), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1048577, 127, 0);
                } else {
                }
            case 3175821:
                if (p46.equals("glow")) {
                } else {
                }
                break;
            case 89650992:
                if (p46.equals("gradient")) {
                    return com.alightcreative.app.motion.scene.SceneElement.copy$default(p45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.GradientFillKt.gradientFillFromXml(p47, p48), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1025, 127, 0);
                } else {
                }
            case 766277856:
                if (p46.equals("path-stroke")) {
                } else {
                }
                break;
            case 1052666732:
                if (p46.equals("transform")) {
                    return com.alightcreative.app.motion.scene.SceneElement.copy$default(p45, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.TransformKt.keyableTransformFromXml(p47, p48, p49), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -65, 127, 0);
                } else {
                }
            default:
        }
        FKt.k.q(p48);
        return p45;
    }

    public static final com.alightcreative.app.motion.scene.Stroke unserializeStroke(String p9, org.xmlpull.v1.XmlPullParser p10)
    {
        com.alightcreative.app.motion.scene.SolidColor v0_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "parser");
        p10.require(2, p9, "stroke");
        com.alightcreative.app.motion.scene.SolidColor v0_6 = p10.getAttributeValue(p9, "color");
        if (v0_6 == null) {
            v0_2 = com.alightcreative.app.motion.scene.SolidColor.Companion.getBLUE();
        } else {
            v0_2 = FKt.Ep.cD(FKt.bV.H(v0_6));
            if (v0_2 == null) {
            }
        }
        float v1_3;
        float v1_1 = p10.getAttributeValue(p9, "width");
        if (v1_1 == 0) {
            v1_3 = 1084227584;
        } else {
            float v1_2 = kotlin.text.StringsKt.toFloatOrNull(v1_1);
            if (v1_2 == 0) {
            } else {
                v1_3 = v1_2.floatValue();
            }
        }
        com.alightcreative.app.motion.scene.DrawingTool v2_4;
        com.alightcreative.app.motion.scene.DrawingTool v2_1 = p10.getAttributeValue(p9, "type");
        if (v2_1 == null) {
            v2_4 = com.alightcreative.app.motion.scene.DrawingTool.PEN;
        } else {
            com.alightcreative.app.motion.scene.go v3_0 = com.alightcreative.app.motion.scene.DrawingTool.values();
            String[] v4_0 = java.util.Locale.ENGLISH;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_0, "ENGLISH");
            com.alightcreative.app.motion.scene.DrawingTool v2_2 = v2_1.toUpperCase(v4_0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_2, "toUpperCase(...)");
            v2_4 = ((com.alightcreative.app.motion.scene.DrawingTool) FKt.nn.hUw(v3_0, v2_2));
            if (v2_4 == null) {
            }
        }
        java.util.List v9_1 = p10.getAttributeValue(p9, "points");
        if (v9_1 == null) {
            v9_1 = "";
        }
        java.util.List v9_4 = kotlin.sequences.SequencesKt.mapNotNull(kotlin.text.StringsKt.splitToSequence$default(v9_1, new String[] {";"}), 0, 0, 6, 0), new com.alightcreative.app.motion.scene.go());
        FKt.k.q(p10);
        return new com.alightcreative.app.motion.scene.Stroke(kotlin.sequences.SequencesKt.toList(v9_4), v0_2, v2_4, v1_3);
    }

    private static final com.alightcreative.app.motion.scene.StrokePoint unserializeStroke$lambda$64(String p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "it");
        int v7_1 = kotlin.text.StringsKt.split$default(p7, new String[] {","}), 0, 0, 6, 0);
        float v0_2 = new java.util.ArrayList();
        int v7_2 = v7_1.iterator();
        while (v7_2.hasNext()) {
            float v1_7 = kotlin.text.StringsKt.toFloatOrNull(((String) v7_2.next()));
            if (v1_7 != 0) {
                v0_2.add(v1_7);
            }
        }
        int v7_4 = com.alightcreative.app.motion.scene.SceneElementKt.unserializeStroke$requireMinLengthOrNull(v0_2, 3);
        if (v7_4 == 0) {
            return 0;
        } else {
            return new com.alightcreative.app.motion.scene.StrokePoint(new com.alightcreative.app.motion.scene.Vector2D(((Number) v7_4.get(0)).floatValue(), ((Number) v7_4.get(1)).floatValue()), ((Number) v7_4.get(2)).floatValue());
        }
    }

    private static final java.util.List unserializeStroke$requireMinLengthOrNull(java.util.List p1, int p2)
    {
        if (p1.size() < p2) {
            p1 = 0;
        }
        return p1;
    }

    public static final com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef visualEffectAtPosition(com.alightcreative.app.motion.scene.SceneElement p3, int p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        RuntimeException v0_1 = ((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) p3.getVisualEffects().get(p3.getVisualEffectOrder().get(p4)));
        if (v0_1 == null) {
            String v3_2 = p3.getVisualEffectOrder().get(p4);
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("Visual effect at index ");
            v1_1.append(p4);
            v1_1.append(" (iid=");
            v1_1.append(v3_2);
            v1_1.append(") does not exist.");
            throw new RuntimeException(v1_1.toString());
        } else {
            return v0_1;
        }
    }

    public static final com.alightcreative.app.motion.scene.SceneElement withAbsoluteTimingAndSpeedInScene(com.alightcreative.app.motion.scene.SceneElement p47, java.util.List p48, java.util.Map p49)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p47, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p48, "elementPath");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p49, "withClippingCache");
        if (p48.size() != 1) {
            UnsupportedOperationException v0_3 = kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(p48), new com.alightcreative.app.motion.scene.ibQ(p49)).iterator();
            if (!v0_3.hasNext()) {
                throw new UnsupportedOperationException("Empty sequence can\'t be reduced.");
            } else {
                com.alightcreative.app.motion.scene.SceneElement v1_1 = v0_3.next();
                while (v0_3.hasNext()) {
                    com.alightcreative.app.motion.scene.SceneElement v3_1 = ((com.alightcreative.app.motion.scene.SceneElement) v0_3.next());
                    com.alightcreative.app.motion.scene.SceneElement v1_5 = ((com.alightcreative.app.motion.scene.SceneElement) v1_1);
                    com.alightcreative.app.motion.scene.Keyable v2_7 = ZX.h.cD;
                    v1_1 = com.alightcreative.app.motion.scene.SceneElement.copy$default(v3_1, 0, kotlin.ranges.RangesKt.coerceAtMost((((int) ZX.h.ojl(i2v.A.x(v2_7.j(((long) v3_1.getStartTime())), v2_7.j(((long) v1_5.getInTime())), v1_5.getTimeMapping().getSpeedFunction()))) + v1_5.getStartTime()), v1_5.getEndTime()), kotlin.ranges.RangesKt.coerceAtMost((((int) ZX.h.ojl(i2v.A.x(v2_7.j(((long) v3_1.getEndTime())), v2_7.j(((long) v1_5.getInTime())), v1_5.getTimeMapping().getSpeedFunction()))) + v1_5.getStartTime()), v1_5.getEndTime()), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.userparam.UserParameterKt.copyAdjustingFloatValue(v3_1.getSpeedMap(), new com.alightcreative.app.motion.scene.gs(v1_5.getNestedSceneSpeedFactor())), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -32775, 127, 0);
                }
                return ((com.alightcreative.app.motion.scene.SceneElement) v1_1);
            }
        } else {
            return p47;
        }
    }

    private static final com.alightcreative.app.motion.scene.SceneElement withAbsoluteTimingAndSpeedInScene$lambda$74(java.util.Map p2, com.alightcreative.app.motion.scene.SceneElement p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "el");
        com.alightcreative.app.motion.scene.SceneElement v0_3 = p2.get(p3);
        if (v0_3 == null) {
            com.alightcreative.app.motion.scene.SceneElement v0_1;
            if (p3.getType() != com.alightcreative.app.motion.scene.SceneElementType.Scene) {
                v0_1 = 0;
            } else {
                v0_1 = 1;
            }
            v0_3 = ((com.alightcreative.app.motion.scene.SceneElement) gjP.V.hUw(p3, v0_1, new com.alightcreative.app.motion.scene.aW8()));
            p2.put(p3, v0_3);
        }
        return ((com.alightcreative.app.motion.scene.SceneElement) v0_3);
    }

    private static final com.alightcreative.app.motion.scene.SceneElement withAbsoluteTimingAndSpeedInScene$lambda$74$lambda$73$lambda$72(com.alightcreative.app.motion.scene.SceneElement p45)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p45, "it");
        return com.alightcreative.app.motion.scene.SceneElement.copy$default(p45, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.NestedSceneClippingKt.getNestedSceneApplyingClipping(com.alightcreative.app.motion.scene.SceneElement v1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8388609, 127, 0);
    }

    private static final float withAbsoluteTimingAndSpeedInScene$lambda$76$lambda$75(float p0, float p1)
    {
        return p0;
    }

    public static synthetic float x(float p0, float p1)
    {
        return com.alightcreative.app.motion.scene.SceneElementKt.withAbsoluteTimingAndSpeedInScene$lambda$76$lambda$75(p0, p1);
    }
}
