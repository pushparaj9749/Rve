package com.alightcreative.app.motion.scene;
public final class KeyableKt {
    private static final com.alightcreative.app.motion.scene.KeyableDouble KEYABLE_DOUBLE_DEFAULT;
    private static final com.alightcreative.app.motion.scene.KeyableFloat KEYABLE_FLOAT_DEFAULT;
    private static final com.alightcreative.app.motion.scene.KeyableSolidColor KEYABLE_SOLID_COLOR_DEFAULT;
    private static final com.alightcreative.app.motion.scene.KeyableVector2D KEYABLE_VECTOR2D_DEFAULT;
    private static final com.alightcreative.app.motion.scene.KeyableVector3D KEYABLE_VECTOR3D_DEFAULT;
    private static final com.alightcreative.app.motion.scene.KeyableVector4D KEYABLE_VECTOR4D_DEFAULT;
    private static final java.util.WeakHashMap motionPathInfoCache;
    private static final float[] posAry;
    private static final android.graphics.PathMeasure scratchPathMeasure;
    private static final float[] tanAry;

    static KeyableKt()
    {
        com.alightcreative.app.motion.scene.KeyableKt.scratchPathMeasure = new android.graphics.PathMeasure();
        float[] v1 = new float[2];
        com.alightcreative.app.motion.scene.KeyableKt.posAry = v1;
        com.alightcreative.app.motion.scene.KeyableVector4D v0_15 = new float[2];
        com.alightcreative.app.motion.scene.KeyableKt.tanAry = v0_15;
        com.alightcreative.app.motion.scene.KeyableKt.motionPathInfoCache = new java.util.WeakHashMap();
        com.alightcreative.app.motion.scene.KeyableKt.KEYABLE_FLOAT_DEFAULT = com.alightcreative.app.motion.scene.KeyableKt.keyable(0);
        com.alightcreative.app.motion.scene.KeyableKt.KEYABLE_DOUBLE_DEFAULT = com.alightcreative.app.motion.scene.KeyableKt.keyable(0);
        com.alightcreative.app.motion.scene.KeyableKt.KEYABLE_SOLID_COLOR_DEFAULT = com.alightcreative.app.motion.scene.KeyableKt.keyable(com.alightcreative.app.motion.scene.ColorKt.SolidColor());
        com.alightcreative.app.motion.scene.KeyableKt.KEYABLE_VECTOR2D_DEFAULT = com.alightcreative.app.motion.scene.KeyableKt.keyable(com.alightcreative.app.motion.scene.GeometryKt.Vector2D());
        com.alightcreative.app.motion.scene.KeyableKt.KEYABLE_VECTOR3D_DEFAULT = com.alightcreative.app.motion.scene.KeyableKt.keyable(com.alightcreative.app.motion.scene.GeometryKt.Vector3D());
        com.alightcreative.app.motion.scene.KeyableKt.KEYABLE_VECTOR4D_DEFAULT = com.alightcreative.app.motion.scene.KeyableKt.keyable(com.alightcreative.app.motion.scene.GeometryKt.Vector4D());
        return;
    }

    public static synthetic boolean cD(float p0, com.alightcreative.app.motion.scene.Keyframe p1)
    {
        return com.alightcreative.app.motion.scene.KeyableKt.closestSurroundingTime$lambda$8(p0, p1);
    }

    public static final com.alightcreative.app.motion.scene.Keyframe closestAfterTime(com.alightcreative.app.motion.scene.Keyable p5, float p6)
    {
        Object v5_3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        Object v5_1 = kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(p5.getKeyframes()), new com.alightcreative.app.motion.scene.m(p6)).iterator();
        if (v5_1.hasNext()) {
            Object v0_2 = v5_1.next();
            if (v5_1.hasNext()) {
                float v1_5 = Math.abs((p6 - ((com.alightcreative.app.motion.scene.Keyframe) v0_2).getTime()));
                do {
                    boolean v2_0 = v5_1.next();
                    float v3_4 = Math.abs((p6 - ((com.alightcreative.app.motion.scene.Keyframe) v2_0).getTime()));
                    if (Float.compare(v1_5, v3_4) > 0) {
                        v0_2 = v2_0;
                        v1_5 = v3_4;
                    }
                } while(v5_1.hasNext());
            }
            v5_3 = v0_2;
        } else {
            v5_3 = 0;
        }
        return ((com.alightcreative.app.motion.scene.Keyframe) v5_3);
    }

    private static final boolean closestAfterTime$lambda$4(float p1, com.alightcreative.app.motion.scene.Keyframe p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        if (p2.getTime() < p1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final com.alightcreative.app.motion.scene.Keyframe closestBeforeTime(com.alightcreative.app.motion.scene.Keyable p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        java.util.Iterator v4_2 = p4.getKeyframes().iterator();
        com.alightcreative.app.motion.scene.Keyframe v0_1 = 0;
        while (v4_2.hasNext()) {
            com.alightcreative.app.motion.scene.Keyframe v1_1 = ((com.alightcreative.app.motion.scene.Keyframe) v4_2.next());
            if ((v1_1.getTime() <= p5) && ((v0_1 == null) || ((p5 - v1_1.getTime()) < (p5 - v0_1.getTime())))) {
                v0_1 = v1_1;
            }
        }
        return v0_1;
    }

    public static final com.alightcreative.app.motion.scene.Keyframe closestStrictlyAfterTime(com.alightcreative.app.motion.scene.Keyable p5, float p6)
    {
        Object v5_3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        Object v5_1 = kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(p5.getKeyframes()), new com.alightcreative.app.motion.scene.x(p6)).iterator();
        if (v5_1.hasNext()) {
            Object v0_2 = v5_1.next();
            if (v5_1.hasNext()) {
                float v1_5 = Math.abs((p6 - ((com.alightcreative.app.motion.scene.Keyframe) v0_2).getTime()));
                do {
                    boolean v2_0 = v5_1.next();
                    float v3_4 = Math.abs((p6 - ((com.alightcreative.app.motion.scene.Keyframe) v2_0).getTime()));
                    if (Float.compare(v1_5, v3_4) > 0) {
                        v0_2 = v2_0;
                        v1_5 = v3_4;
                    }
                } while(v5_1.hasNext());
            }
            v5_3 = v0_2;
        } else {
            v5_3 = 0;
        }
        return ((com.alightcreative.app.motion.scene.Keyframe) v5_3);
    }

    private static final boolean closestStrictlyAfterTime$lambda$6(float p1, com.alightcreative.app.motion.scene.Keyframe p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        if (p2.getTime() <= p1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final kotlin.Pair closestSurroundingTime(com.alightcreative.app.motion.scene.Keyable p7, float p8)
    {
        float v1_1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        boolean v0_1 = kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(p7.getKeyframes()), new com.alightcreative.app.motion.scene.MY(p8)).iterator();
        Object v2_0 = 0;
        if (v0_1.hasNext()) {
            v1_1 = v0_1.next();
            if (v0_1.hasNext()) {
                int v3_5 = Math.abs((p8 - ((com.alightcreative.app.motion.scene.Keyframe) v1_1).getTime()));
                do {
                    boolean v4_0 = v0_1.next();
                    float v5_4 = Math.abs((p8 - ((com.alightcreative.app.motion.scene.Keyframe) v4_0).getTime()));
                    if (Float.compare(v3_5, v5_4) > 0) {
                        v1_1 = v4_0;
                        v3_5 = v5_4;
                    }
                } while(v0_1.hasNext());
            }
        } else {
            v1_1 = 0;
        }
        boolean v4_3 = ((com.alightcreative.app.motion.scene.Keyframe) v1_1);
        float v5_5 = kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(p7.getKeyframes()), new com.alightcreative.app.motion.scene.hz8(p8)).iterator();
        if (v5_5.hasNext()) {
            v2_0 = v5_5.next();
            if (v5_5.hasNext()) {
                float v7_10 = Math.abs((p8 - ((com.alightcreative.app.motion.scene.Keyframe) v2_0).getTime()));
                do {
                    boolean v0_6 = v5_5.next();
                    float v1_8 = Math.abs((p8 - ((com.alightcreative.app.motion.scene.Keyframe) v0_6).getTime()));
                    if (Float.compare(v7_10, v1_8) > 0) {
                        v2_0 = v0_6;
                        v7_10 = v1_8;
                    }
                } while(v5_5.hasNext());
            }
        }
        return new kotlin.Pair(v4_3, ((com.alightcreative.app.motion.scene.Keyframe) v2_0));
    }

    private static final boolean closestSurroundingTime$lambda$10(float p1, com.alightcreative.app.motion.scene.Keyframe p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        if (p2.getTime() <= p1) {
            return 0;
        } else {
            return 1;
        }
    }

    private static final boolean closestSurroundingTime$lambda$8(float p1, com.alightcreative.app.motion.scene.Keyframe p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        if (p2.getTime() > p1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final com.alightcreative.app.motion.scene.Keyframe closestToTime(com.alightcreative.app.motion.scene.Keyable p6, float p7)
    {
        int v7_1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        java.util.Iterator v0_2 = p6.getKeyframes().iterator();
        if (v0_2.hasNext()) {
            Object v1_0 = v0_2.next();
            if (v0_2.hasNext()) {
                float v2_5 = Math.abs((p7 - ((com.alightcreative.app.motion.scene.Keyframe) v1_0).getTime()));
                do {
                    boolean v3_0 = v0_2.next();
                    float v4_4 = Math.abs((p7 - ((com.alightcreative.app.motion.scene.Keyframe) v3_0).getTime()));
                    if (Float.compare(v2_5, v4_4) > 0) {
                        v1_0 = v3_0;
                        v2_5 = v4_4;
                    }
                } while(v0_2.hasNext());
            }
            v7_1 = v1_0;
        } else {
            v7_1 = 0;
        }
        int v7_2 = ((com.alightcreative.app.motion.scene.Keyframe) v7_1);
        if (v7_2 != 0) {
            return v7_2;
        } else {
            return ((com.alightcreative.app.motion.scene.Keyframe) p6.getKeyframes().get(0));
        }
    }

    public static final com.alightcreative.app.motion.scene.Keyable copyAddingAnimator(com.alightcreative.app.motion.scene.Keyable p7, com.alightcreative.app.motion.scene.animators.Animator p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "animator");
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p7, 0, 0, kotlin.collections.CollectionsKt.plus(p7.getAnimators(), p8), 3, 0);
    }

    public static final com.alightcreative.app.motion.scene.Keyable copyAddingNewKeyframe(com.alightcreative.app.motion.scene.Keyable p8, com.alightcreative.app.motion.scene.Scene p9, com.alightcreative.app.motion.scene.SceneElement p10, float p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "scene");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "element");
        if (p8.getKeyed()) {
            com.alightcreative.app.motion.scene.Keyable v8_1 = p9.getFramesPerHundredSeconds();
            int v9_1 = com.alightcreative.app.motion.scene.KeyableKt.closestBeforeTime(p8, p11);
            com.alightcreative.app.motion.scene.Keyframe v11_1 = com.alightcreative.app.motion.scene.KeyableKt.closestAfterTime(p8, p11);
            java.util.List v1_1 = com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p10, p11), v8_1);
            if (((v9_1 == 0) || (v1_1 != com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p10, v9_1.getTime()), v8_1))) && ((v11_1 == null) || (v1_1 != com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p10, v11_1.getTime()), v8_1)))) {
                return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p8, kotlin.collections.CollectionsKt.plus(p8.getKeyframes(), new com.alightcreative.app.motion.scene.Keyframe(com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(p8, p11), p11, 0, 0, 12, 0)), 0, 0, 6, 0);
            } else {
                return p8;
            }
        } else {
            return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p8, kotlin.collections.CollectionsKt.listOf(new com.alightcreative.app.motion.scene.Keyframe(((com.alightcreative.app.motion.scene.Keyframe) p8.getKeyframes().get(0)).getValue(), p11, 0, 0, 12, 0)), 1, 0, 4, 0);
        }
    }

    public static final com.alightcreative.app.motion.scene.Keyable copyAdjustingTime(com.alightcreative.app.motion.scene.Keyable p10, kotlin.jvm.functions.Function1 p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "adjuster");
        java.util.Iterator v0_3 = p10.getKeyframes();
        java.util.ArrayList v2_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        java.util.Iterator v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            int v3_2 = ((com.alightcreative.app.motion.scene.Keyframe) v0_1.next());
            v2_0.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(v3_2, 0, ((Number) p11.invoke(Float.valueOf(v3_2.getTime()))).floatValue(), 0, 0, 13, 0));
        }
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v2_0, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.Keyable copyRemovingAnimator(com.alightcreative.app.motion.scene.Keyable p7, com.alightcreative.app.motion.scene.animators.Animator p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "animator");
        if (!p7.getAnimators().contains(p8)) {
            return p7;
        } else {
            return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p7, 0, 0, kotlin.collections.CollectionsKt.minus(p7.getAnimators(), p8), 3, 0);
        }
    }

    public static final com.alightcreative.app.motion.scene.Keyable copyRemovingKeyframe(com.alightcreative.app.motion.scene.Keyable p9, com.alightcreative.app.motion.scene.Scene p10, com.alightcreative.app.motion.scene.SceneElement p11, float p12)
    {
        com.alightcreative.app.motion.scene.Keyable v0_3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "scene");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "element");
        if (p9.getKeyed()) {
            int v10_1 = p10.getFramesPerHundredSeconds();
            com.alightcreative.app.motion.scene.Keyable v0_1 = com.alightcreative.app.motion.scene.KeyableKt.closestBeforeTime(p9, p12);
            java.util.List v1_0 = com.alightcreative.app.motion.scene.KeyableKt.closestAfterTime(p9, p12);
            int v12_2 = com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p11, p12), v10_1);
            if ((v0_1 == null) || (v12_2 != com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p11, v0_1.getTime()), v10_1))) {
                v0_3 = p9;
                if ((v1_0 != null) && (v12_2 == com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p11, v1_0.getTime()), v10_1))) {
                    if (p9.getKeyframes().size() != 1) {
                        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p9, kotlin.collections.CollectionsKt.minus(p9.getKeyframes(), v1_0), 0, 0, 6, 0);
                    } else {
                        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p9, 0, 0, 0, 5, 0);
                    }
                }
            } else {
                if (p9.getKeyframes().size() != 1) {
                    return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p9, kotlin.collections.CollectionsKt.minus(p9.getKeyframes(), v0_1), 0, 0, 6, 0);
                } else {
                    return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p9, 0, 0, 0, 5, 0);
                }
            }
        } else {
            v0_3 = p9;
        }
        return v0_3;
    }

    public static final com.alightcreative.app.motion.scene.OptionalKeyableVector2D copyWithComputedOptionalValueForTime(com.alightcreative.app.motion.scene.OptionalKeyableVector2D p1, com.alightcreative.app.motion.scene.Scene p2, com.alightcreative.app.motion.scene.SceneElement p3, float p4, kotlin.jvm.functions.Function1 p5)
    {
        com.alightcreative.app.motion.scene.OptionalKeyableVector2D$NONE v1_1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "scene");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "element");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "value");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.KeyableVector2D)) {
            v1_1 = 0;
        } else {
            v1_1 = ((com.alightcreative.app.motion.scene.KeyableVector2D) p1);
        }
        if (v1_1 == null) {
            return com.alightcreative.app.motion.scene.OptionalKeyableVector2D$NONE.INSTANCE;
        } else {
            com.alightcreative.app.motion.scene.OptionalKeyableVector2D$NONE v1_3 = com.alightcreative.app.motion.scene.KeyableKt.copyWithComputedValueForTime(v1_1, p2, p3, p4, p5);
            kotlin.jvm.internal.Intrinsics.checkNotNull(v1_3, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.OptionalKeyableVector2D");
            return ((com.alightcreative.app.motion.scene.OptionalKeyableVector2D) v1_3);
        }
    }

    public static final com.alightcreative.app.motion.scene.Keyable copyWithComputedValueForTime(com.alightcreative.app.motion.scene.Keyable p9, com.alightcreative.app.motion.scene.Scene p10, com.alightcreative.app.motion.scene.SceneElement p11, float p12, kotlin.jvm.functions.Function1 p13)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "scene");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "element");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "value");
        if (p9.getKeyed()) {
            com.alightcreative.app.motion.scene.Keyable v9_3 = p10.getFramesPerHundredSeconds();
            java.util.List v1_2 = com.alightcreative.app.motion.scene.KeyableKt.closestBeforeTime(p9, p12);
            int v2_3 = com.alightcreative.app.motion.scene.KeyableKt.closestAfterTime(p9, p12);
            com.alightcreative.app.motion.scene.Keyframe v10_6 = com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p11, p12), v9_3);
            if ((v1_2 == null) || (v10_6 != com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p11, v1_2.getTime()), v9_3))) {
                if ((v2_3 == 0) || (v10_6 != com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p11, v2_3.getTime()), v9_3))) {
                    return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p9, kotlin.collections.CollectionsKt.plus(p9.getKeyframes(), new com.alightcreative.app.motion.scene.Keyframe(p13.invoke(com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(p9, p12)), p12, 0, 0, 12, 0)), 0, 0, 6, 0);
                } else {
                    return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p9, kotlin.collections.CollectionsKt.plus(kotlin.collections.CollectionsKt.minus(p9.getKeyframes(), v2_3), com.alightcreative.app.motion.scene.Keyframe.copy$default(v2_3, p13.invoke(v2_3.getValue()), 0, 0, 0, 14, 0)), 0, 0, 6, 0);
                }
            } else {
                return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p9, kotlin.collections.CollectionsKt.plus(kotlin.collections.CollectionsKt.minus(p9.getKeyframes(), v1_2), com.alightcreative.app.motion.scene.Keyframe.copy$default(v1_2, p13.invoke(v1_2.getValue()), 0, 0, 0, 14, 0)), 0, 0, 6, 0);
            }
        } else {
            return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p9, kotlin.collections.CollectionsKt.listOf(new com.alightcreative.app.motion.scene.Keyframe(p13.invoke(((com.alightcreative.app.motion.scene.Keyframe) p9.getKeyframes().get(0)).getValue()), 0, 0, 0, 12, 0)), 0, 0, 6, 0);
        }
    }

    public static final com.alightcreative.app.motion.scene.Keyable copyWithEasingForTime(com.alightcreative.app.motion.scene.Keyable p8, float p9, com.alightcreative.app.motion.easing.Easing p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "easing");
        if (p8.getKeyed()) {
            com.alightcreative.app.motion.scene.Keyframe v1 = com.alightcreative.app.motion.scene.KeyableKt.closestStrictlyAfterTime(p8, p9);
            if (v1 != null) {
                return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p8, th.cY.hUw(p8.getKeyframes(), v1, com.alightcreative.app.motion.scene.Keyframe.copy$default(v1, 0, 0, p10, 0, 11, 0)), 0, 0, 6, 0);
            }
        }
        return p8;
    }

    public static final com.alightcreative.app.motion.scene.Keyable copyWithEasingToAllKeyframe(com.alightcreative.app.motion.scene.Keyable p10, com.alightcreative.app.motion.easing.Easing p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "easing");
        java.util.Iterator v0_3 = p10.getKeyframes();
        java.util.ArrayList v2_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        java.util.Iterator v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            v2_0.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(((com.alightcreative.app.motion.scene.Keyframe) v0_1.next()), 0, 0, p11, 0, 11, 0));
        }
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v2_0, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.Keyable copyWithOnlyKeyframe(com.alightcreative.app.motion.scene.Keyable p9, com.alightcreative.app.motion.scene.Scene p10, com.alightcreative.app.motion.scene.SceneElement p11, float p12)
    {
        com.alightcreative.app.motion.scene.Keyable v0_3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "scene");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "element");
        if (p9.getKeyed()) {
            int v10_1 = p10.getFramesPerHundredSeconds();
            com.alightcreative.app.motion.scene.Keyable v0_1 = com.alightcreative.app.motion.scene.KeyableKt.closestBeforeTime(p9, p12);
            java.util.List v1_0 = com.alightcreative.app.motion.scene.KeyableKt.closestAfterTime(p9, p12);
            int v12_2 = com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p11, p12), v10_1);
            if ((v0_1 == null) || (v12_2 != com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p11, v0_1.getTime()), v10_1))) {
                v0_3 = p9;
                if ((v1_0 != null) && (v12_2 == com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p11, v1_0.getTime()), v10_1))) {
                    return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p9, kotlin.collections.CollectionsKt.listOf(v1_0), 0, 0, 4, 0);
                }
            } else {
                return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p9, kotlin.collections.CollectionsKt.listOf(v0_1), 0, 0, 4, 0);
            }
        } else {
            v0_3 = p9;
        }
        return v0_3;
    }

    public static final com.alightcreative.app.motion.scene.Keyable copyWithSmoothingForTime(com.alightcreative.app.motion.scene.Keyable p8, float p9, com.alightcreative.app.motion.scene.Smoothing p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "smoothing");
        if (p8.getKeyed()) {
            java.util.List v1_1 = com.alightcreative.app.motion.scene.KeyableKt.closestAfterTime(p8, p9);
            if (v1_1 != null) {
                return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p8, kotlin.collections.CollectionsKt.plus(kotlin.collections.CollectionsKt.minus(p8.getKeyframes(), v1_1), com.alightcreative.app.motion.scene.Keyframe.copy$default(v1_1, 0, 0, 0, p10, 7, 0)), 0, 0, 6, 0);
            }
        }
        return p8;
    }

    public static final com.alightcreative.app.motion.scene.Keyable copyWithValueForTime(com.alightcreative.app.motion.scene.Keyable p8, com.alightcreative.app.motion.scene.Scene p9, com.alightcreative.app.motion.scene.SceneElement p10, float p11, Object p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "scene");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "element");
        if (p8.getKeyed()) {
            com.alightcreative.app.motion.scene.Keyable v8_2 = p9.getFramesPerHundredSeconds();
            com.alightcreative.app.motion.scene.Keyable v9_1 = com.alightcreative.app.motion.scene.KeyableKt.closestBeforeTime(p8, p11);
            com.alightcreative.app.motion.scene.Keyframe v12_1 = com.alightcreative.app.motion.scene.KeyableKt.closestAfterTime(p8, p11);
            int v2_3 = com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p10, p11), v8_2);
            if ((v9_1 == null) || (v2_3 != com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p10, v9_1.getTime()), v8_2))) {
                if ((v12_1 == null) || (v2_3 != com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(com.alightcreative.app.motion.scene.KeyableKt.sceneTimeFromLocalTime(p10, v12_1.getTime()), v8_2))) {
                    return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p8, kotlin.collections.CollectionsKt.plus(p8.getKeyframes(), new com.alightcreative.app.motion.scene.Keyframe(p12, p11, 0, 0, 12, 0)), 0, 0, 6, 0);
                } else {
                    return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p8, kotlin.collections.CollectionsKt.plus(kotlin.collections.CollectionsKt.minus(p8.getKeyframes(), v12_1), new com.alightcreative.app.motion.scene.Keyframe(p12, v12_1.getTime(), 0, 0, 12, 0)), 0, 0, 6, 0);
                }
            } else {
                return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p8, kotlin.collections.CollectionsKt.plus(kotlin.collections.CollectionsKt.minus(p8.getKeyframes(), v9_1), new com.alightcreative.app.motion.scene.Keyframe(p12, v9_1.getTime(), 0, 0, 12, 0)), 0, 0, 6, 0);
            }
        } else {
            return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p8, kotlin.collections.CollectionsKt.listOf(new com.alightcreative.app.motion.scene.Keyframe(p12, 0, 0, 0, 12, 0)), 0, 0, 6, 0);
        }
    }

    public static final com.alightcreative.app.motion.scene.Keyframe firstKeyframe(com.alightcreative.app.motion.scene.Keyable p6)
    {
        int v0_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        int v0_5 = p6.getKeyframes().iterator();
        if (v0_5.hasNext()) {
            Object v1_0 = v0_5.next();
            if (v0_5.hasNext()) {
                float v2_3 = ((com.alightcreative.app.motion.scene.Keyframe) v1_0).getTime();
                do {
                    boolean v3_0 = v0_5.next();
                    float v4_2 = ((com.alightcreative.app.motion.scene.Keyframe) v3_0).getTime();
                    if (Float.compare(v2_3, v4_2) > 0) {
                        v1_0 = v3_0;
                        v2_3 = v4_2;
                    }
                } while(v0_5.hasNext());
            }
            v0_2 = v1_0;
        } else {
            v0_2 = 0;
        }
        int v0_3 = ((com.alightcreative.app.motion.scene.Keyframe) v0_2);
        if (v0_3 != 0) {
            return v0_3;
        } else {
            return ((com.alightcreative.app.motion.scene.Keyframe) p6.getKeyframes().get(0));
        }
    }

    public static final com.alightcreative.app.motion.scene.Keyable flipped(com.alightcreative.app.motion.scene.Keyable p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        java.util.Iterator v0_2 = p10.getKeyframes();
        java.util.ArrayList v2_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_2, 10));
        java.util.Iterator v0_1 = v0_2.iterator();
        while (v0_1.hasNext()) {
            int v3_2 = ((com.alightcreative.app.motion.scene.Keyframe) v0_1.next());
            v2_1.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(v3_2, new com.alightcreative.app.motion.scene.Vector2D(((com.alightcreative.app.motion.scene.Vector2D) v3_2.getValue()).getY(), ((com.alightcreative.app.motion.scene.Vector2D) v3_2.getValue()).getX()), 0, 0, 0, 14, 0));
        }
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v2_1, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.KeyableDouble getKEYABLE_DOUBLE_DEFAULT()
    {
        return com.alightcreative.app.motion.scene.KeyableKt.KEYABLE_DOUBLE_DEFAULT;
    }

    public static final com.alightcreative.app.motion.scene.KeyableFloat getKEYABLE_FLOAT_DEFAULT()
    {
        return com.alightcreative.app.motion.scene.KeyableKt.KEYABLE_FLOAT_DEFAULT;
    }

    public static final com.alightcreative.app.motion.scene.KeyableSolidColor getKEYABLE_SOLID_COLOR_DEFAULT()
    {
        return com.alightcreative.app.motion.scene.KeyableKt.KEYABLE_SOLID_COLOR_DEFAULT;
    }

    public static final com.alightcreative.app.motion.scene.KeyableVector2D getKEYABLE_VECTOR2D_DEFAULT()
    {
        return com.alightcreative.app.motion.scene.KeyableKt.KEYABLE_VECTOR2D_DEFAULT;
    }

    public static final com.alightcreative.app.motion.scene.KeyableVector3D getKEYABLE_VECTOR3D_DEFAULT()
    {
        return com.alightcreative.app.motion.scene.KeyableKt.KEYABLE_VECTOR3D_DEFAULT;
    }

    public static final com.alightcreative.app.motion.scene.KeyableVector4D getKEYABLE_VECTOR4D_DEFAULT()
    {
        return com.alightcreative.app.motion.scene.KeyableKt.KEYABLE_VECTOR4D_DEFAULT;
    }

    public static final java.util.List getKeyframesIfExistsAndKeyed(com.alightcreative.app.motion.scene.OptionalKeyableVector2D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.KeyableVector2D)) {
            return kotlin.collections.CollectionsKt.emptyList();
        } else {
            return com.alightcreative.app.motion.scene.KeyableKt.getKeyframesIfKeyed(((com.alightcreative.app.motion.scene.Keyable) p1));
        }
    }

    public static final java.util.List getKeyframesIfKeyed(com.alightcreative.app.motion.scene.Keyable p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!p1.getKeyed()) {
            return kotlin.collections.CollectionsKt.emptyList();
        } else {
            return p1.getKeyframes();
        }
    }

    public static synthetic boolean hUw(float p0, com.alightcreative.app.motion.scene.Keyframe p1)
    {
        return com.alightcreative.app.motion.scene.KeyableKt.closestSurroundingTime$lambda$10(p0, p1);
    }

    public static synthetic boolean j(float p0, com.alightcreative.app.motion.scene.Keyframe p1)
    {
        return com.alightcreative.app.motion.scene.KeyableKt.closestAfterTime$lambda$4(p0, p1);
    }

    public static final synthetic com.alightcreative.app.motion.scene.Keyable keyable(java.util.List p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "keyframes");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        String v0_15 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(Object);
        if (!kotlin.jvm.internal.Intrinsics.areEqual(v0_15, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(Float.TYPE))) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(v0_15, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(Double.TYPE))) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v0_15, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Vector2D))) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(v0_15, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.SolidColor))) {
                        String v0_4 = new StringBuilder();
                        v0_4.append("An operation is not implemented: ");
                        v0_4.append("Not Implemented");
                        throw new kotlin.NotImplementedError(v0_4.toString());
                    } else {
                        return new com.alightcreative.app.motion.scene.KeyableSolidColor(1, p3, kotlin.collections.CollectionsKt.emptyList());
                    }
                } else {
                    return new com.alightcreative.app.motion.scene.KeyableVector2D(1, p3, kotlin.collections.CollectionsKt.emptyList());
                }
            } else {
                return new com.alightcreative.app.motion.scene.KeyableDouble(1, p3, kotlin.collections.CollectionsKt.emptyList());
            }
        } else {
            return new com.alightcreative.app.motion.scene.KeyableFloat(1, p3, kotlin.collections.CollectionsKt.emptyList());
        }
    }

    public static final com.alightcreative.app.motion.scene.KeyableDouble keyable(double p8)
    {
        return new com.alightcreative.app.motion.scene.KeyableDouble(0, kotlin.collections.CollectionsKt.listOf(new com.alightcreative.app.motion.scene.Keyframe(Double.valueOf(p8), 0, 0, 0, 14, 0)), kotlin.collections.CollectionsKt.emptyList());
    }

    public static final varargs com.alightcreative.app.motion.scene.KeyableDouble keyable(double[] p15)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "values");
        java.util.ArrayList v0_2 = new java.util.ArrayList(p15.length);
        com.alightcreative.app.motion.scene.KeyableDouble v1_3 = p15.length;
        int v2 = 0;
        int v3_1 = 0;
        while (v2 < v1_3) {
            int v7 = (v3_1 + 1);
            v0_2.add(new com.alightcreative.app.motion.scene.Keyframe(Double.valueOf(p15[v2]), (((float) v3_1) / ((float) (p15.length - 1))), 0, 0, 12, 0));
            v2++;
            v3_1 = v7;
        }
        return new com.alightcreative.app.motion.scene.KeyableDouble(1, v0_2, kotlin.collections.CollectionsKt.emptyList());
    }

    public static final com.alightcreative.app.motion.scene.KeyableFloat keyable(float p8)
    {
        return new com.alightcreative.app.motion.scene.KeyableFloat(0, kotlin.collections.CollectionsKt.listOf(new com.alightcreative.app.motion.scene.Keyframe(Float.valueOf(p8), 0, 0, 0, 14, 0)), kotlin.collections.CollectionsKt.emptyList());
    }

    public static final varargs com.alightcreative.app.motion.scene.KeyableFloat keyable(float[] p14)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "values");
        java.util.ArrayList v0_2 = new java.util.ArrayList(p14.length);
        com.alightcreative.app.motion.scene.KeyableFloat v1_3 = p14.length;
        int v2 = 0;
        int v3_1 = 0;
        while (v2 < v1_3) {
            int v6 = (v3_1 + 1);
            v0_2.add(new com.alightcreative.app.motion.scene.Keyframe(Float.valueOf(p14[v2]), (((float) v3_1) / ((float) (p14.length - 1))), 0, 0, 12, 0));
            v2++;
            v3_1 = v6;
        }
        return new com.alightcreative.app.motion.scene.KeyableFloat(1, v0_2, kotlin.collections.CollectionsKt.emptyList());
    }

    public static final com.alightcreative.app.motion.scene.KeyableQuaternion keyable(com.alightcreative.app.motion.scene.Quaternion p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "value");
        return new com.alightcreative.app.motion.scene.KeyableQuaternion(0, kotlin.collections.CollectionsKt.listOf(new com.alightcreative.app.motion.scene.Keyframe(p8, 0, 0, 0, 14, 0)), kotlin.collections.CollectionsKt.emptyList());
    }

    public static final com.alightcreative.app.motion.scene.KeyableSolidColor keyable(com.alightcreative.app.motion.scene.SolidColor p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "value");
        return new com.alightcreative.app.motion.scene.KeyableSolidColor(0, kotlin.collections.CollectionsKt.listOf(new com.alightcreative.app.motion.scene.Keyframe(p8, 0, 0, 0, 14, 0)), kotlin.collections.CollectionsKt.emptyList());
    }

    public static final varargs com.alightcreative.app.motion.scene.KeyableSolidColor keyable(com.alightcreative.app.motion.scene.SolidColor[] p13)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "values");
        java.util.ArrayList v0_2 = new java.util.ArrayList(p13.length);
        com.alightcreative.app.motion.scene.KeyableSolidColor v1_3 = p13.length;
        int v2 = 0;
        int v3_1 = 0;
        while (v2 < v1_3) {
            int v12 = (v3_1 + 1);
            v0_2.add(new com.alightcreative.app.motion.scene.Keyframe(p13[v2], (((float) v3_1) / ((float) (p13.length - 1))), 0, 0, 12, 0));
            v2++;
            v3_1 = v12;
        }
        return new com.alightcreative.app.motion.scene.KeyableSolidColor(1, v0_2, kotlin.collections.CollectionsKt.emptyList());
    }

    public static final com.alightcreative.app.motion.scene.KeyableVector2D keyable(com.alightcreative.app.motion.scene.Vector2D p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "value");
        return new com.alightcreative.app.motion.scene.KeyableVector2D(0, kotlin.collections.CollectionsKt.listOf(new com.alightcreative.app.motion.scene.Keyframe(p8, 0, 0, 0, 14, 0)), kotlin.collections.CollectionsKt.emptyList());
    }

    public static final varargs com.alightcreative.app.motion.scene.KeyableVector2D keyable(com.alightcreative.app.motion.scene.Vector2D[] p13)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "values");
        java.util.ArrayList v0_2 = new java.util.ArrayList(p13.length);
        com.alightcreative.app.motion.scene.KeyableVector2D v1_3 = p13.length;
        int v2 = 0;
        int v3_1 = 0;
        while (v2 < v1_3) {
            int v12 = (v3_1 + 1);
            v0_2.add(new com.alightcreative.app.motion.scene.Keyframe(p13[v2], (((float) v3_1) / ((float) (p13.length - 1))), 0, 0, 12, 0));
            v2++;
            v3_1 = v12;
        }
        return new com.alightcreative.app.motion.scene.KeyableVector2D(1, v0_2, kotlin.collections.CollectionsKt.emptyList());
    }

    public static final com.alightcreative.app.motion.scene.KeyableVector3D keyable(com.alightcreative.app.motion.scene.Vector3D p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "value");
        return new com.alightcreative.app.motion.scene.KeyableVector3D(0, kotlin.collections.CollectionsKt.listOf(new com.alightcreative.app.motion.scene.Keyframe(p8, 0, 0, 0, 14, 0)), kotlin.collections.CollectionsKt.emptyList());
    }

    public static final com.alightcreative.app.motion.scene.KeyableVector4D keyable(com.alightcreative.app.motion.scene.Vector4D p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "value");
        return new com.alightcreative.app.motion.scene.KeyableVector4D(0, kotlin.collections.CollectionsKt.listOf(new com.alightcreative.app.motion.scene.Keyframe(p8, 0, 0, 0, 14, 0)), kotlin.collections.CollectionsKt.emptyList());
    }

    public static final com.alightcreative.app.motion.scene.OptionalKeyableVector2D keyable(com.alightcreative.app.motion.scene.OptionalVector2D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(p1, com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE)) {
            if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                return com.alightcreative.app.motion.scene.KeyableKt.keyable(((com.alightcreative.app.motion.scene.Vector2D) p1));
            }
        } else {
            return com.alightcreative.app.motion.scene.OptionalKeyableVector2D$NONE.INSTANCE;
        }
    }

    public static final com.alightcreative.app.motion.scene.Keyable mirrored(com.alightcreative.app.motion.scene.Keyable p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        java.util.Iterator v0_2 = p10.getKeyframes();
        java.util.ArrayList v2_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_2, 10));
        java.util.Iterator v0_1 = v0_2.iterator();
        while (v0_1.hasNext()) {
            int v3_2 = ((com.alightcreative.app.motion.scene.Keyframe) v0_1.next());
            v2_1.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(v3_2, com.alightcreative.app.motion.scene.GeometryKt.unaryMinus(((com.alightcreative.app.motion.scene.Vector2D) v3_2.getValue())), 0, 0, 0, 14, 0));
        }
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v2_1, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.Keyable offsetBy(com.alightcreative.app.motion.scene.Keyable p10, float p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        java.util.Iterator v0_2 = p10.getKeyframes();
        java.util.ArrayList v2_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_2, 10));
        java.util.Iterator v0_1 = v0_2.iterator();
        while (v0_1.hasNext()) {
            int v3_2 = ((com.alightcreative.app.motion.scene.Keyframe) v0_1.next());
            v2_1.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(v3_2, Float.valueOf((((Number) v3_2.getValue()).floatValue() + p11)), 0, 0, 0, 14, 0));
        }
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v2_1, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.OptionalKeyableVector2D optionalRotatedBy(com.alightcreative.app.motion.scene.OptionalKeyableVector2D p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        if (!(p2 instanceof com.alightcreative.app.motion.scene.KeyableVector2D)) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(p2, com.alightcreative.app.motion.scene.OptionalKeyableVector2D$NONE.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                return p2;
            }
        } else {
            kotlin.NoWhenBranchMatchedException v2_2 = com.alightcreative.app.motion.scene.KeyableKt.rotatedBy(((com.alightcreative.app.motion.scene.Keyable) p2), p3);
            return new com.alightcreative.app.motion.scene.KeyableVector2D(v2_2.getKeyed(), v2_2.getKeyframes(), v2_2.getAnimators());
        }
    }

    public static final com.alightcreative.app.motion.scene.OptionalVector2D optionalValueAtTime(com.alightcreative.app.motion.scene.OptionalKeyableVector2D p1, float p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(p1, com.alightcreative.app.motion.scene.OptionalKeyableVector2D$NONE.INSTANCE)) {
            if (!(p1 instanceof com.alightcreative.app.motion.scene.KeyableVector2D)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                return ((com.alightcreative.app.motion.scene.OptionalVector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(((com.alightcreative.app.motion.scene.Keyable) p1), p2));
            }
        } else {
            return com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
        }
    }

    public static final com.alightcreative.app.motion.scene.Keyable reverseInterpolateFirstFrame(com.alightcreative.app.motion.scene.Keyable p10, float p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        if (p10.getKeyed()) {
            java.util.List v0_5 = com.alightcreative.app.motion.scene.KeyableKt.firstKeyframe(p10);
            com.alightcreative.app.motion.scene.Keyable v1_1 = com.alightcreative.app.motion.scene.KeyableKt.closestAfterTime(p10, Math.nextUp(v0_5.getTime()));
            if ((v1_1 != null) && ((v0_5.getTime() >= (- p11)) && (v0_5.getTime() <= p11))) {
                com.alightcreative.app.motion.scene.Keyable v1_6;
                int v5_0 = (v0_5.getTime() - (p11 * 1073741824));
                java.util.List v11_2 = v0_5.getValue();
                java.util.List v2_5 = v1_1.getValue();
                if ((!(v1_1.getEasing() instanceof com.alightcreative.app.motion.easing.LinearEasing)) && (!(v1_1.getEasing() instanceof com.alightcreative.app.motion.easing.CubicBezierEasing))) {
                    v1_6 = (((v1_1.getEasing().interpolate(1017370378) - v1_1.getEasing().interpolate(1008981770)) / 1008981770) * v5_0);
                } else {
                    v1_6 = v1_1.getEasing().interpolate((v5_0 / (v1_1.getTime() - v0_5.getTime())));
                }
                return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, kotlin.collections.CollectionsKt.plus(kotlin.collections.CollectionsKt.listOf(new com.alightcreative.app.motion.scene.Keyframe(p10.interp(v11_2, v2_5, v1_6), v5_0, 0, 0, 12, 0)), p10.getKeyframes()), 0, 0, 6, 0);
            }
        }
        return p10;
    }

    public static final com.alightcreative.app.motion.scene.Keyable rotatedBy(com.alightcreative.app.motion.scene.Keyable p10, float p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        java.util.Iterator v0_2 = p10.getKeyframes();
        java.util.ArrayList v2_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_2, 10));
        java.util.Iterator v0_1 = v0_2.iterator();
        while (v0_1.hasNext()) {
            int v3_2 = ((com.alightcreative.app.motion.scene.Keyframe) v0_1.next());
            v2_1.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(v3_2, com.alightcreative.app.motion.scene.GeometryKt.rot(((com.alightcreative.app.motion.scene.Vector2D) v3_2.getValue()), p11), 0, 0, 0, 14, 0));
        }
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v2_1, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.Keyable scaleBy(com.alightcreative.app.motion.scene.Keyable p10, float p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        java.util.Iterator v0_2 = p10.getKeyframes();
        java.util.ArrayList v2_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_2, 10));
        java.util.Iterator v0_1 = v0_2.iterator();
        while (v0_1.hasNext()) {
            int v3_2 = ((com.alightcreative.app.motion.scene.Keyframe) v0_1.next());
            v2_1.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(v3_2, Float.valueOf((((Number) v3_2.getValue()).floatValue() * p11)), 0, 0, 0, 14, 0));
        }
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v2_1, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.Keyable scaledBy(com.alightcreative.app.motion.scene.Keyable p10, float p11, float p12, float p13, float p14)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        java.util.Iterator v0_2 = p10.getKeyframes();
        java.util.ArrayList v2_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_2, 10));
        java.util.Iterator v0_1 = v0_2.iterator();
        while (v0_1.hasNext()) {
            int v3_2 = ((com.alightcreative.app.motion.scene.Keyframe) v0_1.next());
            v2_1.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(v3_2, new com.alightcreative.app.motion.scene.Vector2D((((((com.alightcreative.app.motion.scene.Vector2D) v3_2.getValue()).getX() - p13) * p11) + p13), (((((com.alightcreative.app.motion.scene.Vector2D) v3_2.getValue()).getY() - p14) * p12) + p14)), 0, 0, 0, 14, 0));
        }
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v2_1, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.Keyable scaledBy(com.alightcreative.app.motion.scene.Keyable p10, float p11, float p12, float p13, float p14, float p15, float p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        java.util.Iterator v0_2 = p10.getKeyframes();
        java.util.ArrayList v1_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_2, 10));
        java.util.Iterator v0_1 = v0_2.iterator();
        while (v0_1.hasNext()) {
            com.alightcreative.app.motion.scene.Keyframe v3_1 = ((com.alightcreative.app.motion.scene.Keyframe) v0_1.next());
            v1_1.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(v3_1, new com.alightcreative.app.motion.scene.Vector3D((((((com.alightcreative.app.motion.scene.Vector3D) v3_1.getValue()).getX() - p14) * p11) + p14), (((((com.alightcreative.app.motion.scene.Vector3D) v3_1.getValue()).getY() - p15) * p12) + p15), (((((com.alightcreative.app.motion.scene.Vector3D) v3_1.getValue()).getZ() - p16) * p13) + p16)), 0, 0, 0, 14, 0));
        }
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v1_1, 0, 0, 6, 0);
    }

    public static synthetic com.alightcreative.app.motion.scene.Keyable scaledBy$default(com.alightcreative.app.motion.scene.Keyable p1, float p2, float p3, float p4, float p5, float p6, float p7, int p8, Object p9)
    {
        if ((p8 & 1) != 0) {
            p2 = 1065353216;
        }
        if ((p8 & 2) != 0) {
            p3 = 1065353216;
        }
        if ((p8 & 4) != 0) {
            p4 = 1065353216;
        }
        if ((p8 & 8) != 0) {
            p5 = 0;
        }
        if ((p8 & 16) != 0) {
            p6 = 0;
        }
        if ((p8 & 32) != 0) {
            p7 = 0;
        }
        return com.alightcreative.app.motion.scene.KeyableKt.scaledBy(p1, p2, p3, p4, p5, p6, p7);
    }

    public static synthetic com.alightcreative.app.motion.scene.Keyable scaledBy$default(com.alightcreative.app.motion.scene.Keyable p1, float p2, float p3, float p4, float p5, int p6, Object p7)
    {
        if ((p6 & 1) != 0) {
            p2 = 1065353216;
        }
        if ((p6 & 2) != 0) {
            p3 = 1065353216;
        }
        if ((p6 & 4) != 0) {
            p4 = 0;
        }
        if ((p6 & 8) != 0) {
            p5 = 0;
        }
        return com.alightcreative.app.motion.scene.KeyableKt.scaledBy(p1, p2, p3, p4, p5);
    }

    public static final int sceneTimeFromLocalTime(com.alightcreative.app.motion.scene.SceneElement p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return ((int) (((double) p4.getStartTime()) + (((double) (p4.getEndTime() - p4.getStartTime())) * ((double) p5))));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D smoothedVector2DAtTime(com.alightcreative.app.motion.scene.Keyable p25, com.alightcreative.app.motion.scene.animators.AnimatorEnvironment p26)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p25, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p26, "env");
        if (p25.getKeyframes().size() >= 2) {
            com.alightcreative.app.motion.scene.Vector2D v2_2 = ((com.alightcreative.app.motion.scene.MotionPathInfo) com.alightcreative.app.motion.scene.KeyableKt.motionPathInfoCache.get(p25));
            if (v2_2 == null) {
                com.alightcreative.app.motion.scene.Vector2D v2_5 = new android.graphics.Path();
                com.alightcreative.app.motion.scene.KeyableFloat v6_4 = new com.alightcreative.app.motion.scene.KeyableFloat(1, kotlin.collections.CollectionsKt.emptyList(), kotlin.collections.CollectionsKt.emptyList());
                android.graphics.PathMeasure v7_2 = kotlin.collections.CollectionsKt.sortedWith(p25.getKeyframes(), new com.alightcreative.app.motion.scene.KeyableKt$smoothedVector2DAtTime$lambda$30$$inlined$sortedBy$1());
                int v8_3 = v7_2.size();
                if (v8_3 >= 1) {
                    float v9_0 = v6_4;
                    com.alightcreative.app.motion.scene.KeyableFloat v6_6 = 0;
                    while (v6_6 < v8_3) {
                        int v11_15;
                        java.util.List v10_0 = 0;
                        if (v6_6 != null) {
                            v11_15 = v7_2.get((v6_6 - 1));
                        } else {
                            v11_15 = 0;
                        }
                        int v12_3;
                        int v15 = (v6_6 + 1);
                        if (v15 < v8_3) {
                            v12_3 = v7_2.get(v15);
                        } else {
                            v12_3 = 0;
                        }
                        com.alightcreative.app.motion.scene.KeyableFloat v6_1;
                        com.alightcreative.app.motion.scene.Keyframe v16_5 = ((com.alightcreative.app.motion.scene.Keyframe) v12_3);
                        int v11_16 = ((com.alightcreative.app.motion.scene.Keyframe) v11_15);
                        com.alightcreative.app.motion.scene.KeyableFloat v6_10 = ((com.alightcreative.app.motion.scene.Keyframe) v7_2.get(v6_6));
                        if (v11_16 != 0) {
                            if (v16_5 == null) {
                                if (v11_16 != 0) {
                                    EgU.xfY.ojl(v2_5, ((com.alightcreative.app.motion.scene.Vector2D) v6_10.getValue()));
                                    java.util.List v10_3 = com.alightcreative.app.motion.scene.KeyableKt.scratchPathMeasure;
                                    v10_3.setPath(v2_5, 0);
                                    v6_1 = com.alightcreative.app.motion.scene.KeyableFloat.copy$default(v9_0, 0, kotlin.collections.CollectionsKt.plus(v9_0.getKeyframes(), new com.alightcreative.app.motion.scene.Keyframe(Float.valueOf(v10_3.getLength()), v6_10.getTime(), v6_10.getEasing(), 0, 8, 0)), 0, 5, 0);
                                    v9_0 = v6_1;
                                }
                            } else {
                                if (v11_16 == 0) {
                                    EgU.xfY.uKP(v2_5, ((com.alightcreative.app.motion.scene.Vector2D) v6_10.getValue()));
                                    com.alightcreative.app.motion.scene.KeyableKt.scratchPathMeasure.setPath(v2_5, 0);
                                    v9_0 = com.alightcreative.app.motion.scene.KeyableFloat.copy$default(v9_0, 0, kotlin.collections.CollectionsKt.plus(v9_0.getKeyframes(), new com.alightcreative.app.motion.scene.Keyframe(Float.valueOf(0), v6_10.getTime(), v6_10.getEasing(), 0, 8, 0)), 0, 5, 0);
                                }
                                float v9_5;
                                Float v17_3 = v9_0;
                                java.util.List v10_11 = com.alightcreative.app.motion.scene.KeyableKt$WhenMappings.$EnumSwitchMapping$0;
                                float v9_3 = v10_11[v16_5.getSmoothing().ordinal()];
                                if (v9_3 == 1) {
                                    v9_5 = ((com.alightcreative.app.motion.scene.Vector2D) v16_5.getValue());
                                } else {
                                    if (v9_3 != 2) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    } else {
                                        v9_5 = com.alightcreative.app.motion.scene.GeometryKt.div(com.alightcreative.app.motion.scene.GeometryKt.plus(((com.alightcreative.app.motion.scene.Vector2D) v6_10.getValue()), ((com.alightcreative.app.motion.scene.Vector2D) v16_5.getValue())), 2);
                                    }
                                }
                                int v11_8 = v10_11[v6_10.getSmoothing().ordinal()];
                                if (v11_8 == 1) {
                                    EgU.xfY.ojl(v2_5, v9_5);
                                } else {
                                    if (v11_8 != 2) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    } else {
                                        EgU.xfY.T(v2_5, ((com.alightcreative.app.motion.scene.Vector2D) v6_10.getValue()), v9_5);
                                    }
                                }
                                float v9_12;
                                float v9_11 = v10_11[v16_5.getSmoothing().ordinal()];
                                if (v9_11 == 1) {
                                    v9_12 = v16_5.getTime();
                                } else {
                                    if (v9_11 != 2) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    } else {
                                        v9_12 = (v6_10.getTime() + ((v16_5.getTime() - v6_10.getTime()) * 1056964608));
                                    }
                                }
                                int v20_2 = v9_12;
                                float v9_14 = com.alightcreative.app.motion.scene.KeyableKt.scratchPathMeasure;
                                v9_14.setPath(v2_5, 0);
                                v6_1 = com.alightcreative.app.motion.scene.KeyableFloat.copy$default(v17_3, 0, kotlin.collections.CollectionsKt.plus(v17_3.getKeyframes(), new com.alightcreative.app.motion.scene.Keyframe(Float.valueOf(v9_14.getLength()), v20_2, v6_10.getEasing(), 0, 8, 0)), 0, 5, 0);
                            }
                        } else {
                            if (v16_5 != null) {
                                v10_0 = v16_5.getSmoothing();
                            }
                            if (v10_0 != com.alightcreative.app.motion.scene.Smoothing.Auto) {
                            } else {
                                EgU.xfY.uKP(v2_5, ((com.alightcreative.app.motion.scene.Vector2D) v6_10.getValue()));
                                com.alightcreative.app.motion.scene.KeyableKt.scratchPathMeasure.setPath(v2_5, 0);
                                v6_1 = com.alightcreative.app.motion.scene.KeyableFloat.copy$default(v9_0, 0, kotlin.collections.CollectionsKt.plus(v9_0.getKeyframes(), new com.alightcreative.app.motion.scene.Keyframe(Float.valueOf(0), v6_10.getTime(), v6_10.getEasing(), 0, 8, 0)), 0, 5, 0);
                            }
                        }
                        v6_6 = v15;
                    }
                    v6_4 = v9_0;
                }
                com.alightcreative.app.motion.scene.animators.Animator v3_5 = new com.alightcreative.app.motion.scene.MotionPathInfo(v6_4, v2_5, new android.graphics.PathMeasure(v2_5, 0));
                com.alightcreative.app.motion.scene.KeyableKt.motionPathInfoCache.put(p25, v3_5);
                v2_2 = v3_5;
            }
            com.alightcreative.app.motion.scene.KeyableFloat v6_8 = com.alightcreative.app.motion.scene.KeyableKt.posAry;
            v2_2.getPathMeasure().getPosTan(((Number) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(v2_2.getTimeToLengthMap(), p26.getTime())).floatValue(), v6_8, com.alightcreative.app.motion.scene.KeyableKt.tanAry);
            com.alightcreative.app.motion.scene.Vector2D v2_12 = new com.alightcreative.app.motion.scene.Vector2D(v6_8[0], v6_8[1]);
            kotlin.NoWhenBranchMatchedException v0_15 = p25.getAnimators().iterator();
            while (v0_15.hasNext()) {
                v2_12 = ((com.alightcreative.app.motion.scene.Vector2D) ((com.alightcreative.app.motion.scene.animators.Animator) v0_15.next()).animate(v2_12, p26));
            }
            return v2_12;
        } else {
            com.alightcreative.app.motion.scene.Vector2D v2_6 = p25.getAnimators();
            kotlin.NoWhenBranchMatchedException v0_10 = ((com.alightcreative.app.motion.scene.Keyframe) kotlin.collections.CollectionsKt.first(p25.getKeyframes())).getValue();
            com.alightcreative.app.motion.scene.Vector2D v2_7 = v2_6.iterator();
            while (v2_7.hasNext()) {
                v0_10 = ((com.alightcreative.app.motion.scene.Vector2D) ((com.alightcreative.app.motion.scene.animators.Animator) v2_7.next()).animate(((com.alightcreative.app.motion.scene.Vector2D) v0_10), p26));
            }
            return ((com.alightcreative.app.motion.scene.Vector2D) v0_10);
        }
    }

    public static final com.alightcreative.app.motion.scene.Smoothing smoothingFromSerializedString(String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "s");
        int v2_7 = kotlin.text.StringsKt.trim(p2).toString();
        String v0_5 = java.util.Locale.ENGLISH;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_5, "ENGLISH");
        int v2_1 = v2_7.toLowerCase(v0_5);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_1, "toLowerCase(...)");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(v2_1, "none")) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(v2_1, "auto")) {
                return 0;
            } else {
                return com.alightcreative.app.motion.scene.Smoothing.Auto;
            }
        } else {
            return com.alightcreative.app.motion.scene.Smoothing.None;
        }
    }

    public static final com.alightcreative.app.motion.scene.Keyable translatedBy(com.alightcreative.app.motion.scene.Keyable p10, float p11, float p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        java.util.Iterator v0_2 = p10.getKeyframes();
        java.util.ArrayList v2_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_2, 10));
        java.util.Iterator v0_1 = v0_2.iterator();
        while (v0_1.hasNext()) {
            int v3_2 = ((com.alightcreative.app.motion.scene.Keyframe) v0_1.next());
            v2_1.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(v3_2, new com.alightcreative.app.motion.scene.Vector2D((((com.alightcreative.app.motion.scene.Vector2D) v3_2.getValue()).getX() + p11), (((com.alightcreative.app.motion.scene.Vector2D) v3_2.getValue()).getY() + p12)), 0, 0, 0, 14, 0));
        }
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v2_1, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.Keyable translatedBy(com.alightcreative.app.motion.scene.Keyable p10, float p11, float p12, float p13)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        java.util.Iterator v0_2 = p10.getKeyframes();
        java.util.ArrayList v2_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_2, 10));
        java.util.Iterator v0_1 = v0_2.iterator();
        while (v0_1.hasNext()) {
            int v3_2 = ((com.alightcreative.app.motion.scene.Keyframe) v0_1.next());
            v2_1.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(v3_2, new com.alightcreative.app.motion.scene.Vector3D((((com.alightcreative.app.motion.scene.Vector3D) v3_2.getValue()).getX() + p11), (((com.alightcreative.app.motion.scene.Vector3D) v3_2.getValue()).getY() + p12), (((com.alightcreative.app.motion.scene.Vector3D) v3_2.getValue()).getZ() + p13)), 0, 0, 0, 14, 0));
        }
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v2_1, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.Keyable translatedBy(com.alightcreative.app.motion.scene.Keyable p10, com.alightcreative.app.motion.scene.Vector2D p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "offset");
        java.util.Iterator v0_3 = p10.getKeyframes();
        java.util.ArrayList v2_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        java.util.Iterator v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            int v3_2 = ((com.alightcreative.app.motion.scene.Keyframe) v0_1.next());
            v2_0.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(v3_2, new com.alightcreative.app.motion.scene.Vector2D((((com.alightcreative.app.motion.scene.Vector2D) v3_2.getValue()).getX() + p11.getX()), (((com.alightcreative.app.motion.scene.Vector2D) v3_2.getValue()).getY() + p11.getY())), 0, 0, 0, 14, 0));
        }
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v2_0, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.Keyable translatedBy(com.alightcreative.app.motion.scene.Keyable p10, com.alightcreative.app.motion.scene.Vector3D p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "offset");
        java.util.Iterator v0_3 = p10.getKeyframes();
        java.util.ArrayList v2_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        java.util.Iterator v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            int v3_2 = ((com.alightcreative.app.motion.scene.Keyframe) v0_1.next());
            v2_0.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(v3_2, new com.alightcreative.app.motion.scene.Vector3D((((com.alightcreative.app.motion.scene.Vector3D) v3_2.getValue()).getX() + p11.getX()), (((com.alightcreative.app.motion.scene.Vector3D) v3_2.getValue()).getY() + p11.getY()), (((com.alightcreative.app.motion.scene.Vector3D) v3_2.getValue()).getZ() + p11.getZ())), 0, 0, 0, 14, 0));
        }
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v2_0, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.KeyableVector2D translatedBy(com.alightcreative.app.motion.scene.KeyableVector2D p10, float p11, float p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        java.util.Iterator v0_2 = p10.getKeyframes();
        java.util.ArrayList v2_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_2, 10));
        java.util.Iterator v0_1 = v0_2.iterator();
        while (v0_1.hasNext()) {
            int v3_2 = ((com.alightcreative.app.motion.scene.Keyframe) v0_1.next());
            v2_1.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(v3_2, new com.alightcreative.app.motion.scene.Vector2D((((com.alightcreative.app.motion.scene.Vector2D) v3_2.getValue()).getX() + p11), (((com.alightcreative.app.motion.scene.Vector2D) v3_2.getValue()).getY() + p12)), 0, 0, 0, 14, 0));
        }
        return ((com.alightcreative.app.motion.scene.KeyableVector2D) com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v2_1, 0, 0, 6, 0));
    }

    public static final com.alightcreative.app.motion.scene.Keyable translatedByVector3D(com.alightcreative.app.motion.scene.Keyable p10, float p11, float p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        java.util.Iterator v0_2 = p10.getKeyframes();
        java.util.ArrayList v2_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_2, 10));
        java.util.Iterator v0_1 = v0_2.iterator();
        while (v0_1.hasNext()) {
            int v3_2 = ((com.alightcreative.app.motion.scene.Keyframe) v0_1.next());
            v2_1.add(com.alightcreative.app.motion.scene.Keyframe.copy$default(v3_2, new com.alightcreative.app.motion.scene.Vector3D((((com.alightcreative.app.motion.scene.Vector3D) v3_2.getValue()).getX() + p11), (((com.alightcreative.app.motion.scene.Vector3D) v3_2.getValue()).getY() + p12), ((com.alightcreative.app.motion.scene.Vector3D) v3_2.getValue()).getZ()), 0, 0, 0, 14, 0));
        }
        return com.alightcreative.app.motion.scene.Keyable$DefaultImpls.copyWith$default(p10, v2_1, 0, 0, 6, 0);
    }

    public static final Object valueAtTime(com.alightcreative.app.motion.scene.Keyable p9, float p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "<this>");
        float v0_2 = com.alightcreative.app.motion.scene.KeyableKt.closestBeforeTime(p9, p10);
        float v1_2 = com.alightcreative.app.motion.scene.KeyableKt.closestAfterTime(p9, p10);
        if (v0_2 != 0) {
            if (v1_2 != 0) {
                if ((v0_2 != v1_2) && ((v1_2.getTime() - v0_2.getTime()) != 0)) {
                    return p9.interp(v0_2.getValue(), v1_2.getValue(), v1_2.getEasing().interpolate(((p10 - v0_2.getTime()) / (v1_2.getTime() - v0_2.getTime()))));
                } else {
                    return v0_2.getValue();
                }
            } else {
                Object v9_3 = v0_2.getValue();
                if (v9_3 == null) {
                    throw new IllegalStateException();
                } else {
                    return v9_3;
                }
            }
        } else {
            if (v1_2 != 0) {
                float v0_3 = v1_2.getValue();
                if (v0_3 != 0) {
                    return v0_3;
                }
            }
            Object v9_6 = p9.getKeyframes();
            float v0_5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v9_6, 10));
            Object v9_7 = v9_6.iterator();
            while (v9_7.hasNext()) {
                v0_5.add(Float.valueOf(((com.alightcreative.app.motion.scene.Keyframe) v9_7.next()).getTime()));
            }
            Object v9_8 = kotlin.collections.CollectionsKt.joinToString$default(v0_5, ",", 0, 0, 0, 0, 0, 62, 0);
            float v0_7 = new StringBuilder();
            v0_7.append("before and after kf both null: t=");
            v0_7.append(p10);
            v0_7.append(" keyframes=");
            v0_7.append(v9_8);
            throw new IllegalStateException(v0_7.toString());
        }
    }

    public static final Object valueAtTime(com.alightcreative.app.motion.scene.Keyable p7, com.alightcreative.app.motion.scene.animators.AnimatorEnvironment p8)
    {
        Object v0_5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "env");
        Object v0_6 = p8.getTime();
        com.alightcreative.app.motion.scene.animators.Animator v1_4 = com.alightcreative.app.motion.scene.KeyableKt.closestBeforeTime(p7, v0_6);
        float v2_2 = com.alightcreative.app.motion.scene.KeyableKt.closestAfterTime(p7, v0_6);
        if (v1_4 != null) {
            if (v2_2 != 0) {
                if ((v1_4 != v2_2) && ((v2_2.getTime() - v1_4.getTime()) != 0)) {
                    v0_5 = p7.interp(v1_4.getValue(), v2_2.getValue(), v2_2.getEasing().interpolate(((v0_6 - v1_4.getTime()) / (v2_2.getTime() - v1_4.getTime()))));
                } else {
                    v0_5 = v1_4.getValue();
                }
            } else {
                v0_5 = v1_4.getValue();
                if (v0_5 == null) {
                    throw new IllegalStateException();
                }
            }
        } else {
            if (v2_2 != 0) {
                v0_5 = v2_2.getValue();
                if (v0_5 != null) {
                    java.util.Iterator v7_6 = p7.getAnimators().iterator();
                    while (v7_6.hasNext()) {
                        v0_5 = ((com.alightcreative.app.motion.scene.animators.Animator) v7_6.next()).animate(v0_5, p8);
                    }
                    return v0_5;
                }
            }
            throw new IllegalStateException();
        }
    }

    public static final Object valueAtTimeOneFrameEarlier(com.alightcreative.app.motion.scene.Keyable p7, com.alightcreative.app.motion.scene.animators.AnimatorEnvironment p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "env");
        Object v0_6 = p8.getPreviousFrameTime();
        if (v0_6 >= 0) {
            Object v0_5;
            float v2_0 = com.alightcreative.app.motion.scene.KeyableKt.closestBeforeTime(p7, v0_6);
            float v3_0 = com.alightcreative.app.motion.scene.KeyableKt.closestAfterTime(p7, v0_6);
            if (v2_0 != 0) {
                if (v3_0 != 0) {
                    if ((v2_0 != v3_0) && ((v3_0.getTime() - v2_0.getTime()) != 0)) {
                        v0_5 = p7.interp(v2_0.getValue(), v3_0.getValue(), v3_0.getEasing().interpolate(((v0_6 - v2_0.getTime()) / (v3_0.getTime() - v2_0.getTime()))));
                    } else {
                        v0_5 = v2_0.getValue();
                    }
                } else {
                    v0_5 = v2_0.getValue();
                    if (v0_5 == null) {
                        throw new IllegalStateException();
                    }
                }
            } else {
                if (v3_0 != 0) {
                    v0_5 = v3_0.getValue();
                    if (v0_5 != null) {
                        java.util.Iterator v7_6 = p7.getAnimators().iterator();
                        while (v7_6.hasNext()) {
                            v0_5 = ((com.alightcreative.app.motion.scene.animators.Animator) v7_6.next()).animate(v0_5, p8);
                        }
                        return v0_5;
                    }
                }
                throw new IllegalStateException();
            }
        } else {
            return p7.interp(com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(p7, p8.getTime()), com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(p7, com.alightcreative.app.motion.scene.animators.AnimatorKt.getNextFrameTime(p8)), -1082130432);
        }
    }

    public static synthetic boolean x(float p0, com.alightcreative.app.motion.scene.Keyframe p1)
    {
        return com.alightcreative.app.motion.scene.KeyableKt.closestStrictlyAfterTime$lambda$6(p0, p1);
    }
}
