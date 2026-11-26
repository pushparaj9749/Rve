package com.alightcreative.app.motion.scene;
public final class CubicBSplineKt {
    private static final java.util.WeakHashMap boundsCache;
    private static final java.util.WeakHashMap compoundBoundsCache;

    static CubicBSplineKt()
    {
        com.alightcreative.app.motion.scene.CubicBSplineKt.boundsCache = new java.util.WeakHashMap();
        com.alightcreative.app.motion.scene.CubicBSplineKt.compoundBoundsCache = new java.util.WeakHashMap();
        return;
    }

    public static synthetic Float H(String p0)
    {
        return com.alightcreative.app.motion.scene.CubicBSplineKt.cubicBSplineFromSVGPolygon$lambda$43(p0);
    }

    public static synthetic String R6(float p0, float p1, com.alightcreative.app.motion.scene.Rectangle p2, float p3)
    {
        return com.alightcreative.app.motion.scene.CubicBSplineKt.fitIn$lambda$24(p0, p1, p2, p3);
    }

    public static synthetic kotlin.Unit X(java.util.List p0, java.util.List p1, FKt.mW p2, String p3)
    {
        return com.alightcreative.app.motion.scene.CubicBSplineKt.compoundCubicBSplineFromSVGPath$lambda$48(p0, p1, p2, p3);
    }

    public static synthetic CharSequence cD(com.alightcreative.app.motion.scene.CubicBSpline p0)
    {
        return com.alightcreative.app.motion.scene.CubicBSplineKt.toSVGPath$lambda$39(p0);
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline centeredAtOrigin(com.alightcreative.app.motion.scene.CompoundCubicBSpline p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return com.alightcreative.app.motion.scene.CubicBSplineKt.minus(p1, com.alightcreative.app.motion.scene.CubicBSplineKt.knotBounds(p1).getCenter());
    }

    public static final com.alightcreative.app.motion.scene.CubicBSpline centeredAtOrigin(com.alightcreative.app.motion.scene.CubicBSpline p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return com.alightcreative.app.motion.scene.CubicBSplineKt.minus(p1, com.alightcreative.app.motion.scene.CubicBSplineKt.knotBounds(p1).getCenter());
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline compoundCubicBSplineFromSVGPath(String p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "path");
        java.util.ArrayList v0_2 = new java.util.ArrayList();
        FKt.N5W v1_1 = new FKt.N5W(new com.alightcreative.app.motion.scene.CubicBSplineKt$compoundCubicBSplineFromSVGPath$$inlined$boundaryChecker$1(), 0, 2, 0);
        v0_2.clear();
        java.util.ArrayList v2_1 = new java.util.ArrayList();
        FKt.ibQ.hUw(v1_1, p9, new com.alightcreative.app.motion.scene.qfV(v0_2, v2_1));
        if (!v0_2.isEmpty()) {
            com.alightcreative.app.motion.scene.CubicBSplineKt.compoundCubicBSplineFromSVGPath$linkKnotEndsIfNeeded(v0_2);
            v2_1.add(new com.alightcreative.app.motion.scene.CubicBSpline(kotlin.collections.CollectionsKt.toList(v0_2), 0, 0, 4, 0));
            v0_2.clear();
        }
        if (v2_1.isEmpty()) {
            v2_1.add(com.alightcreative.app.motion.scene.CubicBSpline.Companion.getEMPTY());
        }
        return new com.alightcreative.app.motion.scene.CompoundCubicBSpline(v2_1);
    }

    private static final kotlin.Unit compoundCubicBSplineFromSVGPath$lambda$48(java.util.List p19, java.util.List p20, FKt.mW p21, String p22)
    {
        com.alightcreative.app.motion.scene.serializer.MalformedSceneException v4_9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p21, "$this$parse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p22, "token");
        if ((!p21.R6()) && ((!kotlin.jvm.internal.Intrinsics.areEqual(p21.ojl(), "M")) && (!kotlin.jvm.internal.Intrinsics.areEqual(p22, "Z")))) {
            v4_9 = 0;
        } else {
            v4_9 = 1;
        }
        int v9_10 = p22.hashCode();
        if (v9_10 == 67) {
            if (!p22.equals("C")) {
                kotlin.Unit v0_2 = new StringBuilder();
                v0_2.append("Unexpected token \'");
                v0_2.append(p22);
                v0_2.append("\' in path");
                throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException(v0_2.toString(), 0, 0, 6, 0);
            } else {
                if (p19.isEmpty()) {
                    throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Expected \'M\' at beginning of contour", 0, 0, 6, 0);
                } else {
                    com.alightcreative.app.motion.scene.CBKnot v1_46 = p21.H(2, 44);
                    if (v1_46 == null) {
                        throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Path \'C\' command has wrong number of parameters", 0, 0, 6, 0);
                    } else {
                        com.alightcreative.app.motion.scene.CBKnot v3_14 = ((Number) v1_46.get(0)).floatValue();
                        com.alightcreative.app.motion.scene.CBKnot v1_49 = ((Number) v1_46.get(1)).floatValue();
                        p21.X(44);
                        String v5_15 = p21.H(2, 44);
                        if (v5_15 == null) {
                            throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Path \'C\' command has wrong number of parameters", 0, 0, 6, 0);
                        } else {
                            int v6_12 = ((Number) v5_15.get(0)).floatValue();
                            String v5_19 = ((Number) v5_15.get(1)).floatValue();
                            p21.X(44);
                            com.alightcreative.app.motion.scene.OptionalVector2D$NONE v2_30 = p21.H(2, 44);
                            if (v2_30 == null) {
                                throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Path \'C\' command has wrong number of parameters", 0, 0, 6, 0);
                            } else {
                                int v10_1 = new com.alightcreative.app.motion.scene.Vector2D(((Number) v2_30.get(0)).floatValue(), ((Number) v2_30.get(1)).floatValue());
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.alightcreative.app.motion.scene.CBKnot) p19.get((p19.size() - 1))).getP(), new com.alightcreative.app.motion.scene.Vector2D(v3_14, v1_49))) {
                                    p19.set((p19.size() - 1), com.alightcreative.app.motion.scene.CubicBSplineKt.withOutPoint(((com.alightcreative.app.motion.scene.CBKnot) p19.get((p19.size() - 1))), v3_14, v1_49));
                                }
                                if ((v4_9 == null) || (!kotlin.jvm.internal.Intrinsics.areEqual(((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.first(p19)).getP(), v10_1))) {
                                    com.alightcreative.app.motion.scene.CBKnot v1_11;
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(v10_1, new com.alightcreative.app.motion.scene.Vector2D(v6_12, v5_19))) {
                                        v1_11 = new com.alightcreative.app.motion.scene.Vector2D(v6_12, v5_19);
                                    } else {
                                        v1_11 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
                                    }
                                    p19.add(new com.alightcreative.app.motion.scene.CBKnot(v10_1, v1_11, com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE));
                                } else {
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.first(p19)).getP(), new com.alightcreative.app.motion.scene.Vector2D(v6_12, v5_19))) {
                                        p19.set(0, com.alightcreative.app.motion.scene.CubicBSplineKt.withInPoint(((com.alightcreative.app.motion.scene.CBKnot) p19.get(0)), v6_12, v5_19));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (v9_10 == 90) {
                if (!p22.equals("Z")) {
                }
            } else {
                if (v9_10 == 122) {
                    if (!p22.equals("z")) {
                    }
                } else {
                    if (v9_10 == 2867) {
                        if (!p22.equals("ZM")) {
                        }
                    } else {
                        if (v9_10 == 76) {
                            if (!p22.equals("L")) {
                            } else {
                                if (p19.isEmpty()) {
                                    throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Expected \'M\' at beginning of contour", 0, 0, 6, 0);
                                } else {
                                    com.alightcreative.app.motion.scene.CBKnot v1_22 = p21.H(2, 44);
                                    if (v1_22 == null) {
                                        throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Path \'L\' command has wrong number of parameters", 0, 0, 6, 0);
                                    } else {
                                        com.alightcreative.app.motion.scene.CBKnot v3_6 = new com.alightcreative.app.motion.scene.Vector2D(((Number) v1_22.get(0)).floatValue(), ((Number) v1_22.get(1)).floatValue());
                                        if ((v4_9 == null) || (((((com.alightcreative.app.motion.scene.CBKnot) p19.get(0)).getCurveIn() instanceof com.alightcreative.app.motion.scene.Vector2D)) && (!kotlin.jvm.internal.Intrinsics.areEqual(((com.alightcreative.app.motion.scene.CBKnot) p19.get(0)).getP(), v3_6)))) {
                                            p19.add(new com.alightcreative.app.motion.scene.CBKnot(v3_6, com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE, com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE));
                                        }
                                    }
                                }
                            }
                            return kotlin.Unit.INSTANCE;
                        } else {
                            if ((v9_10 != 77) || (!p22.equals("M"))) {
                            }
                        }
                    }
                    if (!p19.isEmpty()) {
                        com.alightcreative.app.motion.scene.CubicBSplineKt.compoundCubicBSplineFromSVGPath$linkKnotEndsIfNeeded(p19);
                        p20.add(new com.alightcreative.app.motion.scene.CubicBSpline(kotlin.collections.CollectionsKt.toList(p19), 0, 0, 4, 0));
                        p19.clear();
                    }
                    com.alightcreative.app.motion.scene.CBKnot v1_38 = p21.H(2, 44);
                    if (v1_38 == null) {
                        throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Path \'M\' command has wrong number of parameters", 0, 0, 6, 0);
                    } else {
                        p19.add(new com.alightcreative.app.motion.scene.CBKnot(new com.alightcreative.app.motion.scene.Vector2D(((Number) v1_38.get(0)).floatValue(), ((Number) v1_38.get(1)).floatValue()), com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE, com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE));
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (p19.isEmpty()) {
                throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Only supports \'Z\' at end of contour", 0, 0, 6, 0);
            } else {
                com.alightcreative.app.motion.scene.CubicBSplineKt.compoundCubicBSplineFromSVGPath$linkKnotEndsIfNeeded(p19);
                p20.add(new com.alightcreative.app.motion.scene.CubicBSpline(kotlin.collections.CollectionsKt.toList(p19), 1, 0, 4, 0));
                p19.clear();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void compoundCubicBSplineFromSVGPath$linkKnotEndsIfNeeded(java.util.List p9)
    {
        if ((p9.size() > 2) && (kotlin.jvm.internal.Intrinsics.areEqual(((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.first(p9)).getP(), ((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.last(p9)).getP()))) {
            int v0_3 = ((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.last(p9));
            int v1_4 = ((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.first(p9));
            com.alightcreative.app.motion.scene.CBKnot v3_0 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(v0_3.getCurveOut(), v3_0)) || ((kotlin.jvm.internal.Intrinsics.areEqual(v0_3.getCurveIn(), v3_0)) || (!kotlin.jvm.internal.Intrinsics.areEqual(v1_4.getCurveIn(), v3_0)))) {
                if ((kotlin.jvm.internal.Intrinsics.areEqual(v0_3.getCurveIn(), v1_4.getCurveIn())) && (kotlin.jvm.internal.Intrinsics.areEqual(v0_3.getCurveOut(), v1_4.getCurveOut()))) {
                    p9.remove(kotlin.collections.CollectionsKt.getLastIndex(p9));
                }
            } else {
                p9.set(0, com.alightcreative.app.motion.scene.CBKnot.copy$default(((com.alightcreative.app.motion.scene.CBKnot) p9.get(0)), 0, v0_3.getCurveIn(), 0, 5, 0));
                p9.remove(kotlin.collections.CollectionsKt.getLastIndex(p9));
                return;
            }
        }
        return;
    }

    public static final com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline copyUpdatingContour(com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline p2, int p3, kotlin.jvm.functions.Function1 p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "updater");
        return p2.copy(FKt.g.cD(p2.getContours(), p3, p4.invoke(p2.getContours().get(p3))));
    }

    public static final com.alightcreative.app.motion.scene.CubicBSpline cubicBSplineFromPoints(com.alightcreative.app.motion.scene.CBKnot[] p7, boolean p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "knots");
        return new com.alightcreative.app.motion.scene.CubicBSpline(kotlin.collections.ArraysKt.toList(p7), p8, 0, 4, 0);
    }

    public static synthetic com.alightcreative.app.motion.scene.CubicBSpline cubicBSplineFromPoints$default(com.alightcreative.app.motion.scene.CBKnot[] p0, boolean p1, int p2, Object p3)
    {
        if ((p2 & 2) != 0) {
            p1 = 1;
        }
        return com.alightcreative.app.motion.scene.CubicBSplineKt.cubicBSplineFromPoints(p0, p1);
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline cubicBSplineFromSVGAuto(String p11, boolean p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "svg");
        com.alightcreative.app.motion.scene.serializer.MalformedSceneException v0_8 = kotlin.text.StringsKt.first(kotlin.text.StringsKt.trim(p11).toString());
        if (!Character.isLetter(v0_8)) {
            if (!Character.isDigit(v0_8)) {
                throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException(0, 0, 0, 7, 0);
            } else {
                return com.alightcreative.app.motion.scene.CubicBSplineKt.toCompound(com.alightcreative.app.motion.scene.CubicBSplineKt.cubicBSplineFromSVGPolygon(p11, p12));
            }
        } else {
            com.alightcreative.app.motion.scene.CompoundCubicBSpline v11_3 = com.alightcreative.app.motion.scene.CubicBSplineKt.compoundCubicBSplineFromSVGPath(p11);
            java.util.Iterator v12_1 = v11_3.getContours();
            com.alightcreative.app.motion.scene.serializer.MalformedSceneException v0_6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v12_1, 10));
            java.util.Iterator v12_2 = v12_1.iterator();
            int v2_1 = 0;
            while (v12_2.hasNext()) {
                Object v3_2 = v12_2.next();
                int v4_1 = (v2_1 + 1);
                if (v2_1 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                int v8;
                if (v2_1 <= 0) {
                    v8 = 0;
                } else {
                    v8 = 1;
                }
                v0_6.add(com.alightcreative.app.motion.scene.CubicBSpline.copy$default(((com.alightcreative.app.motion.scene.CubicBSpline) v3_2), 0, 0, v8, 3, 0));
                v2_1 = v4_1;
            }
            return v11_3.copy(v0_6);
        }
    }

    public static synthetic com.alightcreative.app.motion.scene.CompoundCubicBSpline cubicBSplineFromSVGAuto$default(String p0, boolean p1, int p2, Object p3)
    {
        if ((p2 & 2) != 0) {
            p1 = 1;
        }
        return com.alightcreative.app.motion.scene.CubicBSplineKt.cubicBSplineFromSVGAuto(p0, p1);
    }

    public static final com.alightcreative.app.motion.scene.CubicBSpline cubicBSplineFromSVGPath(String p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "path");
        java.util.ArrayList v2_1 = new java.util.ArrayList();
        int v0_9 = new FKt.N5W(new com.alightcreative.app.motion.scene.CubicBSplineKt$cubicBSplineFromSVGPath$$inlined$boundaryChecker$1(), 0, 2, 0);
        v2_1.clear();
        com.alightcreative.app.motion.scene.CubicBSpline v1_1 = new kotlin.jvm.internal.Ref$BooleanRef();
        FKt.ibQ.hUw(v0_9, p10, new com.alightcreative.app.motion.scene.K(v2_1, v1_1));
        if ((v2_1.size() > 2) && (kotlin.jvm.internal.Intrinsics.areEqual(((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.first(v2_1)).getP(), ((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.last(v2_1)).getP()))) {
            int v10_7 = ((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.last(v2_1));
            int v0_5 = ((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.first(v2_1));
            com.alightcreative.app.motion.scene.CBKnot v4_0 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(v10_7.getCurveOut(), v4_0)) || ((kotlin.jvm.internal.Intrinsics.areEqual(v10_7.getCurveIn(), v4_0)) || (!kotlin.jvm.internal.Intrinsics.areEqual(v0_5.getCurveIn(), v4_0)))) {
                if ((kotlin.jvm.internal.Intrinsics.areEqual(v10_7.getCurveIn(), v0_5.getCurveIn())) && (kotlin.jvm.internal.Intrinsics.areEqual(v10_7.getCurveOut(), v0_5.getCurveOut()))) {
                    v2_1.remove(kotlin.collections.CollectionsKt.getLastIndex(v2_1));
                }
            } else {
                v2_1.set(0, com.alightcreative.app.motion.scene.CBKnot.copy$default(((com.alightcreative.app.motion.scene.CBKnot) v2_1.get(0)), 0, v10_7.getCurveIn(), 0, 5, 0));
                v2_1.remove(kotlin.collections.CollectionsKt.getLastIndex(v2_1));
            }
        }
        return new com.alightcreative.app.motion.scene.CubicBSpline(v2_1, v1_1.element, 0, 4, 0);
    }

    private static final kotlin.Unit cubicBSplineFromSVGPath$lambda$46(java.util.List p12, kotlin.jvm.internal.Ref$BooleanRef p13, FKt.mW p14, String p15)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "$this$parse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "token");
        com.alightcreative.app.motion.scene.Vector2D v0_6 = p15.hashCode();
        if (v0_6 == 67) {
            if (!p15.equals("C")) {
                kotlin.Unit v12_7 = new StringBuilder();
                v12_7.append("Unexpected token \'");
                v12_7.append(p15);
                v12_7.append("\' in path");
                throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException(v12_7.toString(), 0, 0, 6, 0);
            } else {
                if (p14.x()) {
                    throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Expected \'M\' at beginning of path", 0, 0, 6, 0);
                } else {
                    com.alightcreative.app.motion.scene.CBKnot v13_48 = p14.H(2, 44);
                    if (v13_48 == null) {
                        throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException(NmY.UpJ.mkYBuByLqXh.VLzQAzNqTJQ, 0, 0, 6, 0);
                    } else {
                        com.alightcreative.app.motion.scene.CBKnot v15_9 = ((Number) v13_48.get(0)).floatValue();
                        com.alightcreative.app.motion.scene.CBKnot v13_56 = ((Number) v13_48.get(1)).floatValue();
                        p14.X(44);
                        com.alightcreative.app.motion.scene.Vector2D v0_7 = p14.H(2, 44);
                        if (v0_7 == null) {
                            throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Path \'C\' command has wrong number of parameters", 0, 0, 6, 0);
                        } else {
                            com.alightcreative.app.motion.scene.serializer.MalformedSceneException v1_10 = ((Number) v0_7.get(0)).floatValue();
                            com.alightcreative.app.motion.scene.Vector2D v0_10 = ((Number) v0_7.get(1)).floatValue();
                            p14.X(44);
                            String v2_17 = p14.H(2, 44);
                            if (v2_17 == null) {
                                throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Path \'C\' command has wrong number of parameters", 0, 0, 6, 0);
                            } else {
                                int v6_11 = new com.alightcreative.app.motion.scene.Vector2D(((Number) v2_17.get(0)).floatValue(), ((Number) v2_17.get(1)).floatValue());
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.alightcreative.app.motion.scene.CBKnot) p12.get((p12.size() - 1))).getP(), new com.alightcreative.app.motion.scene.Vector2D(v15_9, v13_56))) {
                                    p12.set((p12.size() - 1), com.alightcreative.app.motion.scene.CubicBSplineKt.withOutPoint(((com.alightcreative.app.motion.scene.CBKnot) p12.get((p12.size() - 1))), v15_9, v13_56));
                                }
                                if ((!p14.R6()) || (!kotlin.jvm.internal.Intrinsics.areEqual(((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.first(p12)).getP(), v6_11))) {
                                    com.alightcreative.app.motion.scene.CBKnot v14_2;
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(v6_11, new com.alightcreative.app.motion.scene.Vector2D(v1_10, v0_10))) {
                                        v14_2 = new com.alightcreative.app.motion.scene.CBKnot(v6_11, new com.alightcreative.app.motion.scene.Vector2D(v1_10, v0_10), com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE);
                                    } else {
                                        v14_2 = new com.alightcreative.app.motion.scene.CBKnot(v6_11, com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE, com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE);
                                    }
                                    p12.add(v14_2);
                                } else {
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.first(p12)).getP(), new com.alightcreative.app.motion.scene.Vector2D(v1_10, v0_10))) {
                                        p12.set(0, com.alightcreative.app.motion.scene.CubicBSplineKt.withInPoint(((com.alightcreative.app.motion.scene.CBKnot) p12.get(0)), v1_10, v0_10));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (v0_6 == 90) {
                if (!p15.equals("Z")) {
                }
            } else {
                if (v0_6 == 122) {
                    if (!p15.equals("z")) {
                    }
                } else {
                    if (v0_6 == 76) {
                        if (!p15.equals("L")) {
                        } else {
                            if (p14.x()) {
                                throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Expected \'M\' at beginning of path", 0, 0, 6, 0);
                            } else {
                                com.alightcreative.app.motion.scene.CBKnot v13_27 = p14.H(2, 44);
                                if (v13_27 == null) {
                                    throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Path \'L\' command has wrong number of parameters", 0, 0, 6, 0);
                                } else {
                                    com.alightcreative.app.motion.scene.Vector2D v0_3 = new com.alightcreative.app.motion.scene.Vector2D(((Number) v13_27.get(0)).floatValue(), ((Number) v13_27.get(1)).floatValue());
                                    if ((!p14.R6()) || (((((com.alightcreative.app.motion.scene.CBKnot) p12.get(0)).getCurveIn() instanceof com.alightcreative.app.motion.scene.Vector2D)) && (!kotlin.jvm.internal.Intrinsics.areEqual(((com.alightcreative.app.motion.scene.CBKnot) p12.get(0)).getP(), v0_3)))) {
                                        p12.add(new com.alightcreative.app.motion.scene.CBKnot(v0_3, com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE, com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE));
                                    }
                                }
                            }
                        }
                    } else {
                        if ((v0_6 != 77) || (!p15.equals("M"))) {
                        } else {
                            if (!p14.x()) {
                                throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Expected \'M\' only at beginning of path", 0, 0, 6, 0);
                            } else {
                                com.alightcreative.app.motion.scene.CBKnot v13_47 = p14.H(2, 44);
                                if (v13_47 == null) {
                                    throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Path \'M\' command has wrong number of parameters", 0, 0, 6, 0);
                                } else {
                                    p12.add(new com.alightcreative.app.motion.scene.CBKnot(new com.alightcreative.app.motion.scene.Vector2D(((Number) v13_47.get(0)).floatValue(), ((Number) v13_47.get(1)).floatValue()), com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE, com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE));
                                }
                            }
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (!p14.R6()) {
                throw new com.alightcreative.app.motion.scene.serializer.MalformedSceneException("Only supports \'Z\' at end of path", 0, 0, 6, 0);
            } else {
                p13.element = 1;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final com.alightcreative.app.motion.scene.CubicBSpline cubicBSplineFromSVGPolygon(String p8, boolean p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "polygon");
        boolean v3_1 = new char[5];
        v3_1 = {44, 32, 9, 10, 13};
        return new com.alightcreative.app.motion.scene.CubicBSpline(kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.chunked(kotlin.sequences.SequencesKt.mapNotNull(kotlin.text.StringsKt.splitToSequence$default(p8, v3_1, 0, 0, 6, 0), new com.alightcreative.app.motion.scene.h()), 2, new com.alightcreative.app.motion.scene.XSt())), p9, 0, 4, 0);
    }

    public static synthetic com.alightcreative.app.motion.scene.CubicBSpline cubicBSplineFromSVGPolygon$default(String p0, boolean p1, int p2, Object p3)
    {
        if ((p2 & 2) != 0) {
            p1 = 1;
        }
        return com.alightcreative.app.motion.scene.CubicBSplineKt.cubicBSplineFromSVGPolygon(p0, p1);
    }

    private static final Float cubicBSplineFromSVGPolygon$lambda$43(String p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        return kotlin.text.StringsKt.toFloatOrNull(kotlin.text.StringsKt.trim(p1).toString());
    }

    private static final com.alightcreative.app.motion.scene.CBKnot cubicBSplineFromSVGPolygon$lambda$44(java.util.List p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<destruct>");
        return new com.alightcreative.app.motion.scene.CBKnot(new com.alightcreative.app.motion.scene.Vector2D(((Number) p7.get(0)).floatValue(), ((Number) p7.get(1)).floatValue()), 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline fitIn(com.alightcreative.app.motion.scene.CompoundCubicBSpline p3, float p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        com.alightcreative.app.motion.scene.Rectangle v0_1 = com.alightcreative.app.motion.scene.CubicBSplineKt.knotBounds(p3);
        float v1_0 = Math.min((p4 / v0_1.getWidth()), (p5 / v0_1.getHeight()));
        fx.Enc.H(p3, new com.alightcreative.app.motion.scene.V(p4, p5, v0_1, v1_0));
        return com.alightcreative.app.motion.scene.CubicBSplineKt.times(p3, v1_0);
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline fitIn(com.alightcreative.app.motion.scene.CompoundCubicBSpline p1, int p2, int p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return com.alightcreative.app.motion.scene.CubicBSplineKt.fitIn(p1, ((float) p2), ((float) p3));
    }

    public static final com.alightcreative.app.motion.scene.CubicBSpline fitIn(com.alightcreative.app.motion.scene.CubicBSpline p4, float p5, float p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        float v1_4 = p4.getKnots();
        com.alightcreative.app.motion.scene.c v2_5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v1_4, 10));
        float v1_0 = v1_4.iterator();
        while (v1_0.hasNext()) {
            v2_5.add(((com.alightcreative.app.motion.scene.CBKnot) v1_0.next()).getP());
        }
        com.alightcreative.app.motion.scene.Rectangle v0_1 = com.alightcreative.app.motion.scene.Rectangle.Companion.enclosing(v2_5);
        float v1_3 = Math.min((p5 / v0_1.getWidth()), (p6 / v0_1.getHeight()));
        fx.Enc.H(p4, new com.alightcreative.app.motion.scene.c(p5, p6, v0_1, v1_3));
        return com.alightcreative.app.motion.scene.CubicBSplineKt.times(p4, v1_3);
    }

    public static final com.alightcreative.app.motion.scene.CubicBSpline fitIn(com.alightcreative.app.motion.scene.CubicBSpline p1, int p2, int p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return com.alightcreative.app.motion.scene.CubicBSplineKt.fitIn(p1, ((float) p2), ((float) p3));
    }

    private static final String fitIn$lambda$23(float p2, float p3, com.alightcreative.app.motion.scene.Rectangle p4, float p5)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("CubicBSpline.fitIn(");
        v0_1.append(p2);
        v0_1.append(", ");
        v0_1.append(p3);
        v0_1.append(") -> bbox=");
        v0_1.append(p4);
        v0_1.append(" scale=");
        v0_1.append(p5);
        return v0_1.toString();
    }

    private static final String fitIn$lambda$24(float p2, float p3, com.alightcreative.app.motion.scene.Rectangle p4, float p5)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("CubicBSpline.fitIn(");
        v0_1.append(p2);
        v0_1.append(", ");
        v0_1.append(p3);
        v0_1.append(") -> bbox=");
        v0_1.append(p4);
        v0_1.append(" scale=");
        v0_1.append(p5);
        return v0_1.toString();
    }

    public static final float fitInScale(com.alightcreative.app.motion.scene.CompoundCubicBSpline p3, float p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        com.alightcreative.app.motion.scene.Rectangle v0_1 = com.alightcreative.app.motion.scene.CubicBSplineKt.knotBounds(p3);
        float v1_0 = Math.min((p4 / v0_1.getWidth()), (p5 / v0_1.getHeight()));
        fx.Enc.H(p3, new com.alightcreative.app.motion.scene.A(p4, p5, v0_1, v1_0));
        return v1_0;
    }

    public static final float fitInScale(com.alightcreative.app.motion.scene.CompoundCubicBSpline p1, int p2, int p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return com.alightcreative.app.motion.scene.CubicBSplineKt.fitInScale(p1, ((float) p2), ((float) p3));
    }

    public static final float fitInScale(com.alightcreative.app.motion.scene.CubicBSpline p6, float p7, float p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        float v1_4 = p6.getKnots();
        com.alightcreative.app.motion.scene.cY v2_5 = new java.util.ArrayList();
        float v1_5 = v1_4.iterator();
        while (v1_5.hasNext()) {
            java.util.List v3_2 = ((com.alightcreative.app.motion.scene.CBKnot) v1_5.next());
            kotlin.collections.CollectionsKt.addAll(v2_5, kotlin.collections.CollectionsKt.listOf(new com.alightcreative.app.motion.scene.Vector2D[] {v3_2.getP(), com.alightcreative.app.motion.scene.GeometryKt.orNull(v3_2.getCurveIn()), com.alightcreative.app.motion.scene.GeometryKt.orNull(v3_2.getCurveOut())})));
        }
        com.alightcreative.app.motion.scene.Rectangle v0_1 = com.alightcreative.app.motion.scene.Rectangle.Companion.enclosing(kotlin.collections.CollectionsKt.filterNotNull(v2_5));
        float v1_3 = Math.min((p7 / v0_1.getWidth()), (p8 / v0_1.getHeight()));
        fx.Enc.H(p6, new com.alightcreative.app.motion.scene.cY(p7, p8, v0_1, v1_3));
        return v1_3;
    }

    public static final float fitInScale(com.alightcreative.app.motion.scene.CubicBSpline p1, int p2, int p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return com.alightcreative.app.motion.scene.CubicBSplineKt.fitInScale(p1, ((float) p2), ((float) p3));
    }

    private static final String fitInScale$lambda$26(float p2, float p3, com.alightcreative.app.motion.scene.Rectangle p4, float p5)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("CubicBSpline.fitIn(");
        v0_1.append(p2);
        v0_1.append(", ");
        v0_1.append(p3);
        v0_1.append(") -> bbox=");
        v0_1.append(p4);
        v0_1.append(" scale=");
        v0_1.append(p5);
        return v0_1.toString();
    }

    private static final String fitInScale$lambda$27(float p2, float p3, com.alightcreative.app.motion.scene.Rectangle p4, float p5)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("CubicBSpline.fitIn(");
        v0_1.append(p2);
        v0_1.append(", ");
        v0_1.append(p3);
        v0_1.append(") -> bbox=");
        v0_1.append(p4);
        v0_1.append(" scale=");
        v0_1.append(p5);
        return v0_1.toString();
    }

    public static final void forEachInContext(java.util.List p6, boolean p7, kotlin.jvm.functions.Function3 p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "action");
        int v0_2 = p6.size();
        if (v0_2 >= 1) {
            int v2_0 = 0;
            while (v2_0 < v0_2) {
                int v4_1;
                Object v3 = 0;
                if (v2_0 != 0) {
                    v4_1 = p6.get((v2_0 - 1));
                } else {
                    if (!p7) {
                        v4_1 = 0;
                    } else {
                        v4_1 = p6.get((v0_2 - 1));
                    }
                }
                int v5 = (v2_0 + 1);
                if (v5 < v0_2) {
                    v3 = p6.get(v5);
                } else {
                    if (p7) {
                        v3 = p6.get(0);
                    }
                }
                p8.invoke(p6.get(v2_0), v4_1, v3);
                v2_0 = v5;
            }
        }
        return;
    }

    public static synthetic void forEachInContext$default(java.util.List p4, boolean p5, kotlin.jvm.functions.Function3 p6, int p7, Object p8)
    {
        if ((p7 & 1) != 0) {
            p5 = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "action");
        int v7_2 = p4.size();
        if (v7_2 >= 1) {
            int v8_1 = 0;
            while (v8_1 < v7_2) {
                int v2_1;
                Object v1 = 0;
                if (v8_1 != 0) {
                    v2_1 = p4.get((v8_1 - 1));
                } else {
                    if (p5 == 0) {
                        v2_1 = 0;
                    } else {
                        v2_1 = p4.get((v7_2 - 1));
                    }
                }
                int v3 = (v8_1 + 1);
                if (v3 < v7_2) {
                    v1 = p4.get(v3);
                } else {
                    if (p5 != 0) {
                        v1 = p4.get(0);
                    }
                }
                p6.invoke(p4.get(v8_1), v2_1, v1);
                v8_1 = v3;
            }
        }
        return;
    }

    public static final void forEachInContextWrap(java.util.List p6, kotlin.jvm.functions.Function3 p7)
    {
        int v0 = 0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, zkP.EA.UXGujvGg.fxoy);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "action");
        int v0_2 = p6.size();
        if (v0_2 >= 1) {
            int v2_0 = 0;
            while (v2_0 < v0_2) {
                Object v3_0;
                if (v2_0 != 0) {
                    v3_0 = (v2_0 - 1);
                } else {
                    v3_0 = (v0_2 - 1);
                }
                Object v5;
                Object v3_1 = p6.get(v3_0);
                int v4 = (v2_0 + 1);
                if (v4 < v0_2) {
                    v5 = p6.get(v4);
                } else {
                    v5 = p6.get(0);
                }
                p7.invoke(p6.get(v2_0), v3_1, v5);
                v2_0 = v4;
            }
        }
        return;
    }

    public static final com.alightcreative.app.motion.scene.OptionalVector2D get(com.alightcreative.app.motion.scene.CBKnot p1, com.alightcreative.app.motion.scene.ControlHandle p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "handle");
        int v2_2 = com.alightcreative.app.motion.scene.CubicBSplineKt$WhenMappings.$EnumSwitchMapping$0[p2.ordinal()];
        if (v2_2 == 1) {
            return p1.getCurveIn();
        } else {
            if (v2_2 == 2) {
                return p1.getP();
            } else {
                if (v2_2 == 3) {
                    return p1.getCurveOut();
                } else {
                    if (v2_2 == 4) {
                        throw new UnsupportedOperationException();
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
            }
        }
    }

    public static final Object get(com.alightcreative.app.motion.scene.KeyableCBKnot p1, com.alightcreative.app.motion.scene.ControlHandle p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "handle");
        int v2_2 = com.alightcreative.app.motion.scene.CubicBSplineKt$WhenMappings.$EnumSwitchMapping$0[p2.ordinal()];
        if (v2_2 == 1) {
            return p1.getCurveIn();
        } else {
            if (v2_2 == 2) {
                return p1.getP();
            } else {
                if (v2_2 == 3) {
                    return p1.getCurveOut();
                } else {
                    if (v2_2 == 4) {
                        throw new UnsupportedOperationException();
                    } else {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
            }
        }
    }

    public static final com.alightcreative.app.motion.scene.Rectangle getBounds(com.alightcreative.app.motion.scene.CompoundCubicBSpline p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        java.util.WeakHashMap v0_1 = com.alightcreative.app.motion.scene.CubicBSplineKt.compoundBoundsCache;
        com.alightcreative.app.motion.scene.Rectangle v1_0 = v0_1.get(p4);
        if (v1_0 == null) {
            com.alightcreative.app.motion.scene.Rectangle v1_3 = new android.graphics.RectF();
            com.alightcreative.app.motion.scene.CubicBSplineKt.toPath(p4).j().computeBounds(v1_3, 1);
            v1_0 = com.alightcreative.app.motion.scene.GeometryKt.toRectangle(v1_3);
            v0_1.put(p4, v1_0);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_0, "getOrPut(...)");
        return ((com.alightcreative.app.motion.scene.Rectangle) v1_0);
    }

    public static final com.alightcreative.app.motion.scene.Rectangle getBounds(com.alightcreative.app.motion.scene.CubicBSpline p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        java.util.WeakHashMap v0_1 = com.alightcreative.app.motion.scene.CubicBSplineKt.boundsCache;
        com.alightcreative.app.motion.scene.Rectangle v1_0 = v0_1.get(p4);
        if (v1_0 == null) {
            com.alightcreative.app.motion.scene.Rectangle v1_3 = new android.graphics.RectF();
            com.alightcreative.app.motion.scene.CubicBSplineKt.toPath(p4).j().computeBounds(v1_3, 1);
            v1_0 = com.alightcreative.app.motion.scene.GeometryKt.toRectangle(v1_3);
            v0_1.put(p4, v1_0);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_0, "getOrPut(...)");
        return ((com.alightcreative.app.motion.scene.Rectangle) v1_0);
    }

    public static final boolean getKeyed(com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        int v2_3 = p2.getContours();
        if ((v2_3 == 0) || (!v2_3.isEmpty())) {
            int v2_1 = v2_3.iterator();
            while (v2_1.hasNext()) {
                if (com.alightcreative.app.motion.scene.CubicBSplineKt.getKeyed(((com.alightcreative.app.motion.scene.KeyableCubicBSpline) v2_1.next()))) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public static final boolean getKeyed(com.alightcreative.app.motion.scene.KeyableCubicBSpline p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        int v3_2 = p3.getKnots();
        if ((v3_2 == 0) || (!v3_2.isEmpty())) {
            int v3_1 = v3_2.iterator();
            while (v3_1.hasNext()) {
                boolean v1_2 = ((com.alightcreative.app.motion.scene.KeyableCBKnot) v3_1.next());
                if (((v1_2.getP().getKeyed()) || (((v1_2.getCurveIn() instanceof com.alightcreative.app.motion.scene.KeyableVector2D)) && (((com.alightcreative.app.motion.scene.KeyableVector2D) v1_2.getCurveIn()).getKeyed()))) || (((v1_2.getCurveOut() instanceof com.alightcreative.app.motion.scene.KeyableVector2D)) && (((com.alightcreative.app.motion.scene.KeyableVector2D) v1_2.getCurveOut()).getKeyed()))) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public static synthetic String hUw(float p0, float p1, com.alightcreative.app.motion.scene.Rectangle p2, float p3)
    {
        return com.alightcreative.app.motion.scene.CubicBSplineKt.fitInScale$lambda$27(p0, p1, p2, p3);
    }

    public static synthetic kotlin.Unit j(java.util.List p0, kotlin.jvm.internal.Ref$BooleanRef p1, FKt.mW p2, String p3)
    {
        return com.alightcreative.app.motion.scene.CubicBSplineKt.cubicBSplineFromSVGPath$lambda$46(p0, p1, p2, p3);
    }

    public static final com.alightcreative.app.motion.scene.KeyableCBKnot keyable(com.alightcreative.app.motion.scene.CBKnot p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.KeyableCBKnot(com.alightcreative.app.motion.scene.KeyableKt.keyable(p4.getP()), com.alightcreative.app.motion.scene.KeyableKt.keyable(com.alightcreative.app.motion.scene.GeometryKt.minus(p4.getCurveIn(), p4.getP())), com.alightcreative.app.motion.scene.KeyableKt.keyable(com.alightcreative.app.motion.scene.GeometryKt.minus(p4.getCurveOut(), p4.getP())));
    }

    public static final com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline keyable(com.alightcreative.app.motion.scene.CompoundCubicBSpline p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline v2_4 = p2.getContours();
        java.util.ArrayList v0_2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v2_4, 10));
        com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline v2_1 = v2_4.iterator();
        while (v2_1.hasNext()) {
            v0_2.add(com.alightcreative.app.motion.scene.CubicBSplineKt.keyable(((com.alightcreative.app.motion.scene.CubicBSpline) v2_1.next())));
        }
        return new com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline(v0_2);
    }

    public static final com.alightcreative.app.motion.scene.KeyableCubicBSpline keyable(com.alightcreative.app.motion.scene.CubicBSpline p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        boolean v0_3 = p3.getKnots();
        java.util.ArrayList v1_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        boolean v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            v1_1.add(com.alightcreative.app.motion.scene.CubicBSplineKt.keyable(((com.alightcreative.app.motion.scene.CBKnot) v0_1.next())));
        }
        return new com.alightcreative.app.motion.scene.KeyableCubicBSpline(v1_1, p3.getClosed(), p3.getExclude());
    }

    public static final com.alightcreative.app.motion.scene.Rectangle knotBounds(com.alightcreative.app.motion.scene.CompoundCubicBSpline p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        com.alightcreative.app.motion.scene.Rectangle v5_2 = p5.getContours();
        java.util.ArrayList v1_1 = new java.util.ArrayList();
        com.alightcreative.app.motion.scene.Rectangle v5_3 = v5_2.iterator();
        while (v5_3.hasNext()) {
            java.util.Iterator v2_3 = ((com.alightcreative.app.motion.scene.CubicBSpline) v5_3.next()).getKnots();
            java.util.ArrayList v3_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v2_3, 10));
            java.util.Iterator v2_4 = v2_3.iterator();
            while (v2_4.hasNext()) {
                v3_1.add(((com.alightcreative.app.motion.scene.CBKnot) v2_4.next()).getP());
            }
            kotlin.collections.CollectionsKt.addAll(v1_1, v3_1);
        }
        return com.alightcreative.app.motion.scene.Rectangle.Companion.enclosing(v1_1);
    }

    public static final com.alightcreative.app.motion.scene.Rectangle knotBounds(com.alightcreative.app.motion.scene.CubicBSpline p3)
    {
        com.alightcreative.app.motion.scene.Rectangle$Companion v0 = 0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, TAJ.TqX.ocVYDHTgyRH.xaySOeOyDkGRnN);
        com.alightcreative.app.motion.scene.Rectangle v3_3 = p3.getKnots();
        java.util.ArrayList v1_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v3_3, 10));
        com.alightcreative.app.motion.scene.Rectangle v3_1 = v3_3.iterator();
        while (v3_1.hasNext()) {
            v1_0.add(((com.alightcreative.app.motion.scene.CBKnot) v3_1.next()).getP());
        }
        return com.alightcreative.app.motion.scene.Rectangle.Companion.enclosing(v1_0);
    }

    public static final com.alightcreative.app.motion.scene.CBKnot minus(com.alightcreative.app.motion.scene.CBKnot p5, com.alightcreative.app.motion.scene.Vector2D p6)
    {
        com.alightcreative.app.motion.scene.OptionalVector2D v2_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "other");
        com.alightcreative.app.motion.scene.Vector2D v1_1 = com.alightcreative.app.motion.scene.GeometryKt.minus(p5.getP(), p6);
        com.alightcreative.app.motion.scene.OptionalVector2D v2_0 = p5.getCurveIn();
        if (!(v2_0 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            com.alightcreative.app.motion.scene.OptionalVector2D v3_1 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(v2_0, v3_1)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                v2_2 = v3_1;
            }
        } else {
            v2_2 = com.alightcreative.app.motion.scene.GeometryKt.minus(((com.alightcreative.app.motion.scene.Vector2D) p5.getCurveIn()), p6);
        }
        kotlin.NoWhenBranchMatchedException v5_3;
        com.alightcreative.app.motion.scene.OptionalVector2D v3_2 = p5.getCurveOut();
        if (!(v3_2 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            v5_3 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(v3_2, v5_3)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            v5_3 = com.alightcreative.app.motion.scene.GeometryKt.minus(((com.alightcreative.app.motion.scene.Vector2D) p5.getCurveOut()), p6);
        }
        return new com.alightcreative.app.motion.scene.CBKnot(v1_1, v2_2, v5_3);
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline minus(com.alightcreative.app.motion.scene.CompoundCubicBSpline p3, com.alightcreative.app.motion.scene.Vector2D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "offset");
        java.util.Iterator v0_3 = p3.getContours();
        java.util.ArrayList v1_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        java.util.Iterator v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            v1_0.add(com.alightcreative.app.motion.scene.CubicBSplineKt.minus(((com.alightcreative.app.motion.scene.CubicBSpline) v0_1.next()), p4));
        }
        return p3.copy(v1_0);
    }

    public static final com.alightcreative.app.motion.scene.CubicBSpline minus(com.alightcreative.app.motion.scene.CubicBSpline p7, com.alightcreative.app.motion.scene.Vector2D p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "offset");
        java.util.Iterator v0_3 = p7.getKnots();
        java.util.ArrayList v2_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        java.util.Iterator v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            v2_0.add(com.alightcreative.app.motion.scene.CubicBSplineKt.minus(((com.alightcreative.app.motion.scene.CBKnot) v0_1.next()), p8));
        }
        return com.alightcreative.app.motion.scene.CubicBSpline.copy$default(p7, v2_0, 0, 0, 6, 0);
    }

    public static synthetic String ojl(float p0, float p1, com.alightcreative.app.motion.scene.Rectangle p2, float p3)
    {
        return com.alightcreative.app.motion.scene.CubicBSplineKt.fitInScale$lambda$26(p0, p1, p2, p3);
    }

    public static final com.alightcreative.app.motion.scene.CBKnot plus(com.alightcreative.app.motion.scene.CBKnot p5, com.alightcreative.app.motion.scene.Vector2D p6)
    {
        com.alightcreative.app.motion.scene.OptionalVector2D v2_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "other");
        com.alightcreative.app.motion.scene.Vector2D v1_1 = com.alightcreative.app.motion.scene.GeometryKt.plus(p5.getP(), p6);
        com.alightcreative.app.motion.scene.OptionalVector2D v2_0 = p5.getCurveIn();
        if (!(v2_0 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            com.alightcreative.app.motion.scene.OptionalVector2D v3_1 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(v2_0, v3_1)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                v2_2 = v3_1;
            }
        } else {
            v2_2 = com.alightcreative.app.motion.scene.GeometryKt.plus(((com.alightcreative.app.motion.scene.Vector2D) p5.getCurveIn()), p6);
        }
        kotlin.NoWhenBranchMatchedException v5_3;
        com.alightcreative.app.motion.scene.OptionalVector2D v3_2 = p5.getCurveOut();
        if (!(v3_2 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            v5_3 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(v3_2, v5_3)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            v5_3 = com.alightcreative.app.motion.scene.GeometryKt.plus(((com.alightcreative.app.motion.scene.Vector2D) p5.getCurveOut()), p6);
        }
        return new com.alightcreative.app.motion.scene.CBKnot(v1_1, v2_2, v5_3);
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline plus(com.alightcreative.app.motion.scene.CompoundCubicBSpline p3, com.alightcreative.app.motion.scene.Vector2D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "offset");
        java.util.Iterator v0_3 = p3.getContours();
        java.util.ArrayList v1_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        java.util.Iterator v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            v1_0.add(com.alightcreative.app.motion.scene.CubicBSplineKt.plus(((com.alightcreative.app.motion.scene.CubicBSpline) v0_1.next()), p4));
        }
        return p3.copy(v1_0);
    }

    public static final com.alightcreative.app.motion.scene.CubicBSpline plus(com.alightcreative.app.motion.scene.CubicBSpline p7, com.alightcreative.app.motion.scene.Vector2D p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "offset");
        java.util.Iterator v0_3 = p7.getKnots();
        java.util.ArrayList v2_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        java.util.Iterator v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            v2_0.add(com.alightcreative.app.motion.scene.CubicBSplineKt.plus(((com.alightcreative.app.motion.scene.CBKnot) v0_1.next()), p8));
        }
        return com.alightcreative.app.motion.scene.CubicBSpline.copy$default(p7, v2_0, 0, 0, 6, 0);
    }

    public static synthetic com.alightcreative.app.motion.scene.CBKnot q(java.util.List p0)
    {
        return com.alightcreative.app.motion.scene.CubicBSplineKt.cubicBSplineFromSVGPolygon$lambda$44(p0);
    }

    public static final com.alightcreative.app.motion.scene.CBKnot rot(com.alightcreative.app.motion.scene.CBKnot p5, float p6)
    {
        com.alightcreative.app.motion.scene.OptionalVector2D v2_1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        com.alightcreative.app.motion.scene.Vector2D v1_1 = com.alightcreative.app.motion.scene.GeometryKt.rot(p5.getP(), p6);
        com.alightcreative.app.motion.scene.OptionalVector2D v2_4 = p5.getCurveIn();
        if (!(v2_4 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            com.alightcreative.app.motion.scene.OptionalVector2D v3_0 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(v2_4, v3_0)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                v2_1 = v3_0;
            }
        } else {
            v2_1 = com.alightcreative.app.motion.scene.GeometryKt.rot(((com.alightcreative.app.motion.scene.Vector2D) p5.getCurveIn()), p6);
        }
        kotlin.NoWhenBranchMatchedException v5_3;
        com.alightcreative.app.motion.scene.OptionalVector2D v3_1 = p5.getCurveOut();
        if (!(v3_1 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            v5_3 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(v3_1, v5_3)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            v5_3 = com.alightcreative.app.motion.scene.GeometryKt.rot(((com.alightcreative.app.motion.scene.Vector2D) p5.getCurveOut()), p6);
        }
        return new com.alightcreative.app.motion.scene.CBKnot(v1_1, v2_1, v5_3);
    }

    public static final com.alightcreative.app.motion.scene.CubicBSpline rot(com.alightcreative.app.motion.scene.CubicBSpline p7, float p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        if (Math.abs(p8) >= 925353388) {
            java.util.Iterator v0_4 = p7.getKnots();
            java.util.ArrayList v2_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_4, 10));
            java.util.Iterator v0_1 = v0_4.iterator();
            while (v0_1.hasNext()) {
                v2_1.add(com.alightcreative.app.motion.scene.CubicBSplineKt.rot(((com.alightcreative.app.motion.scene.CBKnot) v0_1.next()), p8));
            }
            return com.alightcreative.app.motion.scene.CubicBSpline.copy$default(p7, v2_1, 0, 0, 6, 0);
        } else {
            return p7;
        }
    }

    public static final com.alightcreative.app.motion.scene.CBSegment segmentBetween(com.alightcreative.app.motion.scene.KeyableCBKnot p5, com.alightcreative.app.motion.scene.KeyableCBKnot p6, float p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "a");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "b");
        com.alightcreative.app.motion.scene.Vector2D v3_0 = com.alightcreative.app.motion.scene.Vector2D.Companion;
        return new com.alightcreative.app.motion.scene.CBSegment(((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(p5.getP(), p7)), com.alightcreative.app.motion.scene.GeometryKt.plus(com.alightcreative.app.motion.scene.GeometryKt.orElse(com.alightcreative.app.motion.scene.KeyableKt.optionalValueAtTime(p5.getCurveOut(), p7), v3_0.getZERO()), ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(p5.getP(), p7))), com.alightcreative.app.motion.scene.GeometryKt.plus(com.alightcreative.app.motion.scene.GeometryKt.orElse(com.alightcreative.app.motion.scene.KeyableKt.optionalValueAtTime(p6.getCurveIn(), p7), v3_0.getZERO()), ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(p6.getP(), p7))), ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(p6.getP(), p7)));
    }

    public static final kotlin.Pair splitCubicBezierSegment(float p17, com.alightcreative.app.motion.scene.CBSegment p18)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "segment");
        com.alightcreative.app.motion.scene.CBSegment v2_0 = p18.getP1().getX();
        float v3 = p18.getP1().getY();
        kotlin.Pair v0_2 = p18.getP2().getX();
        float v4_1 = p18.getP2().getY();
        float v5_1 = p18.getP3().getX();
        float v6_1 = p18.getP3().getY();
        float v15 = p18.getP4().getX();
        float v16 = p18.getP4().getY();
        com.alightcreative.app.motion.scene.CBSegment v1_4 = (((v0_2 - v2_0) * p17) + v2_0);
        float v7_3 = (((v4_1 - v3) * p17) + v3);
        com.alightcreative.app.motion.scene.CBSegment v8_2 = (((v5_1 - v0_2) * p17) + v0_2);
        kotlin.Pair v0_6 = (((v6_1 - v4_1) * p17) + v4_1);
        float v13 = (((v15 - v5_1) * p17) + v5_1);
        float v14 = (((v16 - v6_1) * p17) + v6_1);
        float v6_2 = (((v8_2 - v1_4) * p17) + v1_4);
        float v4_10 = (((v0_6 - v7_3) * p17) + v7_3);
        float v11 = (((v13 - v8_2) * p17) + v8_2);
        float v12 = (((v14 - v0_6) * p17) + v0_6);
        com.alightcreative.app.motion.scene.CBSegment v8_3 = (((v11 - v6_2) * p17) + v6_2);
        float v9_0 = (((v12 - v4_10) * p17) + v4_10);
        return new kotlin.Pair(new com.alightcreative.app.motion.scene.CBSegment(v2_0, v3, v1_4, v7_3, v6_2, v4_10, v8_3, v9_0), new com.alightcreative.app.motion.scene.CBSegment(v8_3, v9_0, v11, v12, v13, v14, v15, v16));
    }

    public static final com.alightcreative.app.motion.scene.CBKnot times(com.alightcreative.app.motion.scene.CBKnot p1, float p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return com.alightcreative.app.motion.scene.CubicBSplineKt.times(p1, new com.alightcreative.app.motion.scene.Vector2D(p2, p2));
    }

    public static final com.alightcreative.app.motion.scene.CBKnot times(com.alightcreative.app.motion.scene.CBKnot p5, android.graphics.Matrix p6)
    {
        com.alightcreative.app.motion.scene.OptionalVector2D v2_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "other");
        com.alightcreative.app.motion.scene.Vector2D v1_1 = com.alightcreative.app.motion.scene.GeometryKt.times(p5.getP(), p6);
        com.alightcreative.app.motion.scene.OptionalVector2D v2_0 = p5.getCurveIn();
        if (!(v2_0 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            com.alightcreative.app.motion.scene.OptionalVector2D v3_1 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(v2_0, v3_1)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                v2_2 = v3_1;
            }
        } else {
            v2_2 = com.alightcreative.app.motion.scene.GeometryKt.times(((com.alightcreative.app.motion.scene.Vector2D) p5.getCurveIn()), p6);
        }
        kotlin.NoWhenBranchMatchedException v5_3;
        com.alightcreative.app.motion.scene.OptionalVector2D v3_2 = p5.getCurveOut();
        if (!(v3_2 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            v5_3 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(v3_2, v5_3)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            v5_3 = com.alightcreative.app.motion.scene.GeometryKt.times(((com.alightcreative.app.motion.scene.Vector2D) p5.getCurveOut()), p6);
        }
        return new com.alightcreative.app.motion.scene.CBKnot(v1_1, v2_2, v5_3);
    }

    public static final com.alightcreative.app.motion.scene.CBKnot times(com.alightcreative.app.motion.scene.CBKnot p5, com.alightcreative.app.motion.scene.Vector2D p6)
    {
        com.alightcreative.app.motion.scene.OptionalVector2D v2_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "other");
        com.alightcreative.app.motion.scene.Vector2D v1_1 = com.alightcreative.app.motion.scene.GeometryKt.times(p5.getP(), p6);
        com.alightcreative.app.motion.scene.OptionalVector2D v2_0 = p5.getCurveIn();
        if (!(v2_0 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            com.alightcreative.app.motion.scene.OptionalVector2D v3_1 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(v2_0, v3_1)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                v2_2 = v3_1;
            }
        } else {
            v2_2 = com.alightcreative.app.motion.scene.GeometryKt.times(((com.alightcreative.app.motion.scene.Vector2D) p5.getCurveIn()), p6);
        }
        kotlin.NoWhenBranchMatchedException v5_3;
        com.alightcreative.app.motion.scene.OptionalVector2D v3_2 = p5.getCurveOut();
        if (!(v3_2 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            v5_3 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(v3_2, v5_3)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
        } else {
            v5_3 = com.alightcreative.app.motion.scene.GeometryKt.times(((com.alightcreative.app.motion.scene.Vector2D) p5.getCurveOut()), p6);
        }
        return new com.alightcreative.app.motion.scene.CBKnot(v1_1, v2_2, v5_3);
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline times(com.alightcreative.app.motion.scene.CompoundCubicBSpline p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        java.util.Iterator v0_2 = p4.getContours();
        java.util.ArrayList v1_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_2, 10));
        java.util.Iterator v0_1 = v0_2.iterator();
        while (v0_1.hasNext()) {
            v1_1.add(com.alightcreative.app.motion.scene.CubicBSplineKt.times(((com.alightcreative.app.motion.scene.CubicBSpline) v0_1.next()), new com.alightcreative.app.motion.scene.Vector2D(p5, p5)));
        }
        return p4.copy(v1_1);
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline times(com.alightcreative.app.motion.scene.CompoundCubicBSpline p3, android.graphics.Matrix p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "other");
        java.util.Iterator v0_3 = p3.getContours();
        java.util.ArrayList v1_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        java.util.Iterator v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            v1_0.add(com.alightcreative.app.motion.scene.CubicBSplineKt.times(((com.alightcreative.app.motion.scene.CubicBSpline) v0_1.next()), p4));
        }
        return p3.copy(v1_0);
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline times(com.alightcreative.app.motion.scene.CompoundCubicBSpline p4, com.alightcreative.app.motion.scene.Transform p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "other");
        java.util.Iterator v0_3 = p4.getContours();
        java.util.ArrayList v1_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        java.util.Iterator v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            v1_0.add(com.alightcreative.app.motion.scene.CubicBSplineKt.times(((com.alightcreative.app.motion.scene.CubicBSpline) v0_1.next()), p5.getMatrix()));
        }
        return p4.copy(v1_0);
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline times(com.alightcreative.app.motion.scene.CompoundCubicBSpline p3, com.alightcreative.app.motion.scene.Vector2D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "other");
        java.util.Iterator v0_3 = p3.getContours();
        java.util.ArrayList v1_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        java.util.Iterator v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            v1_0.add(com.alightcreative.app.motion.scene.CubicBSplineKt.times(((com.alightcreative.app.motion.scene.CubicBSpline) v0_1.next()), p4));
        }
        return p3.copy(v1_0);
    }

    public static final com.alightcreative.app.motion.scene.CubicBSpline times(com.alightcreative.app.motion.scene.CubicBSpline p7, float p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        java.util.Iterator v0_2 = p7.getKnots();
        java.util.ArrayList v2_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_2, 10));
        java.util.Iterator v0_1 = v0_2.iterator();
        while (v0_1.hasNext()) {
            v2_1.add(com.alightcreative.app.motion.scene.CubicBSplineKt.times(((com.alightcreative.app.motion.scene.CBKnot) v0_1.next()), new com.alightcreative.app.motion.scene.Vector2D(p8, p8)));
        }
        return com.alightcreative.app.motion.scene.CubicBSpline.copy$default(p7, v2_1, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.CubicBSpline times(com.alightcreative.app.motion.scene.CubicBSpline p7, android.graphics.Matrix p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "other");
        java.util.Iterator v0_3 = p7.getKnots();
        java.util.ArrayList v2_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        java.util.Iterator v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            v2_0.add(com.alightcreative.app.motion.scene.CubicBSplineKt.times(((com.alightcreative.app.motion.scene.CBKnot) v0_1.next()), p8));
        }
        return com.alightcreative.app.motion.scene.CubicBSpline.copy$default(p7, v2_0, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.CubicBSpline times(com.alightcreative.app.motion.scene.CubicBSpline p7, com.alightcreative.app.motion.scene.Transform p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "other");
        java.util.Iterator v0_3 = p7.getKnots();
        java.util.ArrayList v2_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        java.util.Iterator v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            v2_0.add(com.alightcreative.app.motion.scene.CubicBSplineKt.times(((com.alightcreative.app.motion.scene.CBKnot) v0_1.next()), p8.getMatrix()));
        }
        return com.alightcreative.app.motion.scene.CubicBSpline.copy$default(p7, v2_0, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.CubicBSpline times(com.alightcreative.app.motion.scene.CubicBSpline p7, com.alightcreative.app.motion.scene.Vector2D p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "other");
        java.util.Iterator v0_3 = p7.getKnots();
        java.util.ArrayList v2_0 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_3, 10));
        java.util.Iterator v0_1 = v0_3.iterator();
        while (v0_1.hasNext()) {
            v2_0.add(com.alightcreative.app.motion.scene.CubicBSplineKt.times(((com.alightcreative.app.motion.scene.CBKnot) v0_1.next()), p8));
        }
        return com.alightcreative.app.motion.scene.CubicBSpline.copy$default(p7, v2_0, 0, 0, 6, 0);
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline toCompound(com.alightcreative.app.motion.scene.CubicBSpline p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return new com.alightcreative.app.motion.scene.CompoundCubicBSpline(kotlin.collections.CollectionsKt.listOf(p1));
    }

    public static final oEu.m toPath(com.alightcreative.app.motion.scene.CompoundCubicBSpline p14)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "<this>");
        oEu.m v1_1 = new oEu.m();
        if (!p14.getContours().isEmpty()) {
            IllegalStateException v14_4 = p14.getContours().iterator();
            while (v14_4.hasNext()) {
                boolean v0_3 = ((com.alightcreative.app.motion.scene.CubicBSpline) v14_4.next());
                java.util.List v8 = v0_3.getKnots();
                if (!v8.isEmpty()) {
                    float v2_17 = ((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.first(v8)).getP();
                    v1_1.zm(v2_17.getX(), v2_17.getY());
                    boolean v9 = v0_3.getClosed();
                    int v10 = v8.size();
                    if (v10 >= 1) {
                        float v2_14 = 0;
                        while (v2_14 < v10) {
                            float v3_12 = 0;
                            if (v2_14 != 0) {
                                v8.get((v2_14 - 1));
                            } else {
                                if (v9) {
                                    v8.get((v10 - 1));
                                }
                            }
                            int v12 = (v2_14 + 1);
                            if (v12 < v10) {
                                v3_12 = v8.get(v12);
                            } else {
                                if (v9) {
                                    v3_12 = v8.get(0);
                                }
                            }
                            float v3_13 = ((com.alightcreative.app.motion.scene.CBKnot) v3_12);
                            float v2_22 = ((com.alightcreative.app.motion.scene.CBKnot) v8.get(v2_14));
                            if (v3_13 != 0) {
                                float v5_11 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
                                if ((!kotlin.jvm.internal.Intrinsics.areEqual(v2_22.getCurveOut(), v5_11)) || (!kotlin.jvm.internal.Intrinsics.areEqual(v3_13.getCurveIn(), v5_11))) {
                                    if ((!(v2_22.getCurveOut() instanceof com.alightcreative.app.motion.scene.Vector2D)) || (!(v3_13.getCurveIn() instanceof com.alightcreative.app.motion.scene.Vector2D))) {
                                        if ((!kotlin.jvm.internal.Intrinsics.areEqual(v2_22.getCurveOut(), v5_11)) || (!(v3_13.getCurveIn() instanceof com.alightcreative.app.motion.scene.Vector2D))) {
                                            if ((!(v2_22.getCurveOut() instanceof com.alightcreative.app.motion.scene.Vector2D)) || (!kotlin.jvm.internal.Intrinsics.areEqual(v3_13.getCurveIn(), v5_11))) {
                                                throw new IllegalStateException();
                                            } else {
                                                v1_1.x1(((com.alightcreative.app.motion.scene.Vector2D) v2_22.getCurveOut()).getX(), ((com.alightcreative.app.motion.scene.Vector2D) v2_22.getCurveOut()).getY(), v3_13.getP().getX(), v3_13.getP().getY(), v3_13.getP().getX(), v3_13.getP().getY());
                                            }
                                        } else {
                                            v1_1.x1(v2_22.getP().getX(), v2_22.getP().getY(), ((com.alightcreative.app.motion.scene.Vector2D) v3_13.getCurveIn()).getX(), ((com.alightcreative.app.motion.scene.Vector2D) v3_13.getCurveIn()).getY(), v3_13.getP().getX(), v3_13.getP().getY());
                                        }
                                    } else {
                                        v1_1.x1(((com.alightcreative.app.motion.scene.Vector2D) v2_22.getCurveOut()).getX(), ((com.alightcreative.app.motion.scene.Vector2D) v2_22.getCurveOut()).getY(), ((com.alightcreative.app.motion.scene.Vector2D) v3_13.getCurveIn()).getX(), ((com.alightcreative.app.motion.scene.Vector2D) v3_13.getCurveIn()).getY(), v3_13.getP().getX(), v3_13.getP().getY());
                                    }
                                } else {
                                    v1_1.oiZ(v3_13.getP().getX(), v3_13.getP().getY());
                                }
                            }
                            v2_14 = v12;
                        }
                    }
                    if (v0_3.getClosed()) {
                        if (!v0_3.getExclude()) {
                            v1_1.K();
                        } else {
                            v1_1.f();
                        }
                    }
                }
            }
        }
        return v1_1;
    }

    public static final oEu.m toPath(com.alightcreative.app.motion.scene.CubicBSpline p13)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "<this>");
        oEu.m v1_1 = new oEu.m();
        if (!p13.getKnots().isEmpty()) {
            java.util.List v0_4 = ((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.first(p13.getKnots())).getP();
            v1_1.zm(v0_4.getX(), v0_4.getY());
            java.util.List v0_6 = p13.getKnots();
            boolean v8 = p13.getClosed();
            int v9 = v0_6.size();
            if (v9 >= 1) {
                float v2_14 = 0;
                while (v2_14 < v9) {
                    float v3_11 = 0;
                    if (v2_14 != 0) {
                        v0_6.get((v2_14 - 1));
                    } else {
                        if (v8) {
                            v0_6.get((v9 - 1));
                        }
                    }
                    int v11 = (v2_14 + 1);
                    if (v11 < v9) {
                        v3_11 = v0_6.get(v11);
                    } else {
                        if (v8) {
                            v3_11 = v0_6.get(0);
                        }
                    }
                    float v3_12 = ((com.alightcreative.app.motion.scene.CBKnot) v3_11);
                    float v2_17 = ((com.alightcreative.app.motion.scene.CBKnot) v0_6.get(v2_14));
                    if (v3_12 != 0) {
                        float v5_11 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
                        if ((!kotlin.jvm.internal.Intrinsics.areEqual(v2_17.getCurveOut(), v5_11)) || (!kotlin.jvm.internal.Intrinsics.areEqual(v3_12.getCurveIn(), v5_11))) {
                            if ((!(v2_17.getCurveOut() instanceof com.alightcreative.app.motion.scene.Vector2D)) || (!(v3_12.getCurveIn() instanceof com.alightcreative.app.motion.scene.Vector2D))) {
                                if ((!kotlin.jvm.internal.Intrinsics.areEqual(v2_17.getCurveOut(), v5_11)) || (!(v3_12.getCurveIn() instanceof com.alightcreative.app.motion.scene.Vector2D))) {
                                    if ((!(v2_17.getCurveOut() instanceof com.alightcreative.app.motion.scene.Vector2D)) || (!kotlin.jvm.internal.Intrinsics.areEqual(v3_12.getCurveIn(), v5_11))) {
                                        throw new IllegalStateException();
                                    } else {
                                        v1_1.x1(((com.alightcreative.app.motion.scene.Vector2D) v2_17.getCurveOut()).getX(), ((com.alightcreative.app.motion.scene.Vector2D) v2_17.getCurveOut()).getY(), v3_12.getP().getX(), v3_12.getP().getY(), v3_12.getP().getX(), v3_12.getP().getY());
                                    }
                                } else {
                                    v1_1.x1(v2_17.getP().getX(), v2_17.getP().getY(), ((com.alightcreative.app.motion.scene.Vector2D) v3_12.getCurveIn()).getX(), ((com.alightcreative.app.motion.scene.Vector2D) v3_12.getCurveIn()).getY(), v3_12.getP().getX(), v3_12.getP().getY());
                                }
                            } else {
                                v1_1.x1(((com.alightcreative.app.motion.scene.Vector2D) v2_17.getCurveOut()).getX(), ((com.alightcreative.app.motion.scene.Vector2D) v2_17.getCurveOut()).getY(), ((com.alightcreative.app.motion.scene.Vector2D) v3_12.getCurveIn()).getX(), ((com.alightcreative.app.motion.scene.Vector2D) v3_12.getCurveIn()).getY(), v3_12.getP().getX(), v3_12.getP().getY());
                            }
                        } else {
                            v1_1.oiZ(v3_12.getP().getX(), v3_12.getP().getY());
                        }
                    }
                    v2_14 = v11;
                }
            }
            if (p13.getClosed()) {
                v1_1.ak();
            }
        }
        return v1_1;
    }

    public static final oEu.m toPathSegment(com.alightcreative.app.motion.scene.CubicBSpline p8, int p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "<this>");
        oEu.m v1_1 = new oEu.m();
        if (!p8.getKnots().isEmpty()) {
            com.alightcreative.app.motion.scene.CBKnot v0_3 = ((com.alightcreative.app.motion.scene.CBKnot) p8.getKnots().get(p9));
            com.alightcreative.app.motion.scene.Vector2D v8_8 = ((com.alightcreative.app.motion.scene.CBKnot) p8.getKnots().get(((p9 + 1) % p8.getKnots().size())));
            com.alightcreative.app.motion.scene.Vector2D v9_21 = v0_3.getP();
            v1_1.zm(v9_21.getX(), v9_21.getY());
            float v2_4 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(v0_3.getCurveOut(), v2_4)) || (!kotlin.jvm.internal.Intrinsics.areEqual(v8_8.getCurveIn(), v2_4))) {
                if ((!(v0_3.getCurveOut() instanceof com.alightcreative.app.motion.scene.Vector2D)) || (!(v8_8.getCurveIn() instanceof com.alightcreative.app.motion.scene.Vector2D))) {
                    if ((!kotlin.jvm.internal.Intrinsics.areEqual(v0_3.getCurveOut(), v2_4)) || (!(v8_8.getCurveIn() instanceof com.alightcreative.app.motion.scene.Vector2D))) {
                        if ((!(v0_3.getCurveOut() instanceof com.alightcreative.app.motion.scene.Vector2D)) || (!kotlin.jvm.internal.Intrinsics.areEqual(v8_8.getCurveIn(), v2_4))) {
                            throw new IllegalStateException();
                        } else {
                            v1_1.x1(((com.alightcreative.app.motion.scene.Vector2D) v0_3.getCurveOut()).getX(), ((com.alightcreative.app.motion.scene.Vector2D) v0_3.getCurveOut()).getY(), v8_8.getP().getX(), v8_8.getP().getY(), v8_8.getP().getX(), v8_8.getP().getY());
                            return v1_1;
                        }
                    } else {
                        v1_1.x1(v0_3.getP().getX(), v0_3.getP().getY(), ((com.alightcreative.app.motion.scene.Vector2D) v8_8.getCurveIn()).getX(), ((com.alightcreative.app.motion.scene.Vector2D) v8_8.getCurveIn()).getY(), v8_8.getP().getX(), v8_8.getP().getY());
                        return v1_1;
                    }
                } else {
                    v1_1.x1(((com.alightcreative.app.motion.scene.Vector2D) v0_3.getCurveOut()).getX(), ((com.alightcreative.app.motion.scene.Vector2D) v0_3.getCurveOut()).getY(), ((com.alightcreative.app.motion.scene.Vector2D) v8_8.getCurveIn()).getX(), ((com.alightcreative.app.motion.scene.Vector2D) v8_8.getCurveIn()).getY(), v8_8.getP().getX(), v8_8.getP().getY());
                    return v1_1;
                }
            } else {
                v1_1.oiZ(v8_8.getP().getX(), v8_8.getP().getY());
                return v1_1;
            }
        } else {
            return v1_1;
        }
    }

    public static final oEu.m toPathSegment(com.alightcreative.app.motion.scene.KeyableCubicBSpline p8, int p9, float p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "<this>");
        oEu.m v1_1 = new oEu.m();
        if (!p8.getKnots().isEmpty()) {
            com.alightcreative.app.motion.scene.Keyable v0_6 = ((com.alightcreative.app.motion.scene.KeyableCBKnot) p8.getKnots().get(p9));
            com.alightcreative.app.motion.scene.Vector2D v8_18 = ((com.alightcreative.app.motion.scene.KeyableCBKnot) p8.getKnots().get(((p9 + 1) % p8.getKnots().size())));
            com.alightcreative.app.motion.scene.Vector2D v9_7 = ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(v0_6.getP(), p10));
            v1_1.zm(v9_7.getX(), v9_7.getY());
            float v3_3 = com.alightcreative.app.motion.scene.OptionalKeyableVector2D$NONE.INSTANCE;
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(v0_6.getCurveOut(), v3_3)) || (!kotlin.jvm.internal.Intrinsics.areEqual(v8_18.getCurveIn(), v3_3))) {
                if ((!(v0_6.getCurveOut() instanceof com.alightcreative.app.motion.scene.KeyableVector2D)) || (!(v8_18.getCurveIn() instanceof com.alightcreative.app.motion.scene.KeyableVector2D))) {
                    if ((!kotlin.jvm.internal.Intrinsics.areEqual(v0_6.getCurveOut(), v3_3)) || (!(v8_18.getCurveIn() instanceof com.alightcreative.app.motion.scene.KeyableVector2D))) {
                        if ((!(v0_6.getCurveOut() instanceof com.alightcreative.app.motion.scene.KeyableVector2D)) || (!kotlin.jvm.internal.Intrinsics.areEqual(v8_18.getCurveIn(), v3_3))) {
                            throw new IllegalStateException();
                        } else {
                            com.alightcreative.app.motion.scene.Vector2D v8_23 = ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(v8_18.getP(), p10));
                            com.alightcreative.app.motion.scene.Vector2D v9_8 = com.alightcreative.app.motion.scene.GeometryKt.plus(((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(((com.alightcreative.app.motion.scene.Keyable) v0_6.getCurveOut()), p10)), v9_7);
                            v1_1.x1(v9_8.getX(), v9_8.getY(), v8_23.getX(), v8_23.getY(), v8_23.getX(), v8_23.getY());
                            return v1_1;
                        }
                    } else {
                        com.alightcreative.app.motion.scene.Keyable v0_4 = ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(v8_18.getP(), p10));
                        com.alightcreative.app.motion.scene.Vector2D v8_5 = com.alightcreative.app.motion.scene.GeometryKt.plus(((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(((com.alightcreative.app.motion.scene.Keyable) v8_18.getCurveIn()), p10)), v0_4);
                        v1_1.x1(v9_7.getX(), v9_7.getY(), v8_5.getX(), v8_5.getY(), v0_4.getX(), v0_4.getY());
                        return v1_1;
                    }
                } else {
                    float v2_3 = ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(v8_18.getP(), p10));
                    com.alightcreative.app.motion.scene.Vector2D v9_1 = com.alightcreative.app.motion.scene.GeometryKt.plus(((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(((com.alightcreative.app.motion.scene.Keyable) v0_6.getCurveOut()), p10)), v9_7);
                    com.alightcreative.app.motion.scene.Vector2D v8_10 = com.alightcreative.app.motion.scene.GeometryKt.plus(((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(((com.alightcreative.app.motion.scene.Keyable) v8_18.getCurveIn()), p10)), v2_3);
                    com.alightcreative.app.motion.scene.Vector2D v10_1 = v2_3;
                    v1_1.x1(v9_1.getX(), v9_1.getY(), v8_10.getX(), v8_10.getY(), v10_1.getX(), v10_1.getY());
                    return v1_1;
                }
            } else {
                com.alightcreative.app.motion.scene.Vector2D v8_13 = ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(v8_18.getP(), p10));
                v1_1.oiZ(v8_13.getX(), v8_13.getY());
                return v1_1;
            }
        } else {
            return v1_1;
        }
    }

    public static final String toSVGPath(com.alightcreative.app.motion.scene.CompoundCubicBSpline p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        return kotlin.collections.CollectionsKt.joinToString$default(p10.getContours(), "", 0, 0, 0, 0, new com.alightcreative.app.motion.scene.CU(), 30, 0);
    }

    public static final String toSVGPath(com.alightcreative.app.motion.scene.CubicBSpline p15)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "<this>");
        if (!p15.getKnots().isEmpty()) {
            String v0_3 = ((com.alightcreative.app.motion.scene.CBKnot) kotlin.collections.CollectionsKt.first(p15.getKnots())).getP();
            java.util.List v2_0 = v0_3.getX();
            String v0_4 = v0_3.getY();
            int v3_1 = new StringBuilder();
            v3_1.append("");
            v3_1.append("M ");
            v3_1.append(v2_0);
            v3_1.append(" ");
            v3_1.append(v0_4);
            String v0_5 = v3_1.toString();
            java.util.List v2_1 = p15.getKnots();
            int v3_2 = v2_1.size();
            if (v3_2 >= 1) {
                String v5_11 = 0;
                while (v5_11 < v3_2) {
                    float v6_14;
                    if (v5_11 != null) {
                        v6_14 = (v5_11 - 1);
                    } else {
                        v6_14 = (v3_2 - 1);
                    }
                    float v8_8;
                    v2_1.get(v6_14);
                    int v7 = (v5_11 + 1);
                    if (v7 < v3_2) {
                        v8_8 = v2_1.get(v7);
                    } else {
                        v8_8 = v2_1.get(0);
                    }
                    String v5_3;
                    float v8_9 = ((com.alightcreative.app.motion.scene.CBKnot) v8_8);
                    String v5_13 = ((com.alightcreative.app.motion.scene.CBKnot) v2_1.get(v5_11));
                    float v9_9 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
                    if ((!kotlin.jvm.internal.Intrinsics.areEqual(v5_13.getCurveOut(), v9_9)) || (!kotlin.jvm.internal.Intrinsics.areEqual(v8_9.getCurveIn(), v9_9))) {
                        if ((!(v5_13.getCurveOut() instanceof com.alightcreative.app.motion.scene.Vector2D)) || (!(v8_9.getCurveIn() instanceof com.alightcreative.app.motion.scene.Vector2D))) {
                            if ((!kotlin.jvm.internal.Intrinsics.areEqual(v5_13.getCurveOut(), v9_9)) || (!(v8_9.getCurveIn() instanceof com.alightcreative.app.motion.scene.Vector2D))) {
                                if ((!(v5_13.getCurveOut() instanceof com.alightcreative.app.motion.scene.Vector2D)) || (!kotlin.jvm.internal.Intrinsics.areEqual(v8_9.getCurveIn(), v9_9))) {
                                    throw new IllegalStateException();
                                } else {
                                    float v6_4 = ((com.alightcreative.app.motion.scene.Vector2D) v5_13.getCurveOut()).getX();
                                    String v5_2 = ((com.alightcreative.app.motion.scene.Vector2D) v5_13.getCurveOut()).getY();
                                    float v9_1 = v8_9.getP().getX();
                                    float v12_1 = v8_9.getP().getY();
                                    float v13_1 = v8_9.getP().getX();
                                    float v8_1 = v8_9.getP().getY();
                                    StringBuilder v14_1 = new StringBuilder();
                                    v14_1.append("C ");
                                    v14_1.append(v6_4);
                                    v14_1.append(" ");
                                    v14_1.append(v5_2);
                                    v14_1.append(", ");
                                    v14_1.append(v9_1);
                                    v14_1.append(" ");
                                    v14_1.append(v12_1);
                                    v14_1.append(", ");
                                    v14_1.append(v13_1);
                                    v14_1.append(" ");
                                    v14_1.append(v8_1);
                                    v5_3 = v14_1.toString();
                                }
                            } else {
                                float v6_6 = v5_13.getP().getX();
                                String v5_5 = v5_13.getP().getY();
                                float v9_4 = ((com.alightcreative.app.motion.scene.Vector2D) v8_9.getCurveIn()).getX();
                                float v12_4 = ((com.alightcreative.app.motion.scene.Vector2D) v8_9.getCurveIn()).getY();
                                float v13_3 = v8_9.getP().getX();
                                float v8_3 = v8_9.getP().getY();
                                StringBuilder v14_3 = new StringBuilder();
                                v14_3.append("C ");
                                v14_3.append(v6_6);
                                v14_3.append(" ");
                                v14_3.append(v5_5);
                                v14_3.append(", ");
                                v14_3.append(v9_4);
                                v14_3.append(" ");
                                v14_3.append(v12_4);
                                v14_3.append(", ");
                                v14_3.append(v13_3);
                                v14_3.append(" ");
                                v14_3.append(v8_3);
                                v5_3 = v14_3.toString();
                            }
                        } else {
                            float v6_9 = ((com.alightcreative.app.motion.scene.Vector2D) v5_13.getCurveOut()).getX();
                            String v5_8 = ((com.alightcreative.app.motion.scene.Vector2D) v5_13.getCurveOut()).getY();
                            float v9_7 = ((com.alightcreative.app.motion.scene.Vector2D) v8_9.getCurveIn()).getX();
                            float v12_7 = ((com.alightcreative.app.motion.scene.Vector2D) v8_9.getCurveIn()).getY();
                            float v13_5 = v8_9.getP().getX();
                            float v8_5 = v8_9.getP().getY();
                            StringBuilder v14_5 = new StringBuilder();
                            v14_5.append("C ");
                            v14_5.append(v6_9);
                            v14_5.append(" ");
                            v14_5.append(v5_8);
                            v14_5.append(", ");
                            v14_5.append(v9_7);
                            v14_5.append(" ");
                            v14_5.append(v12_7);
                            v14_5.append(", ");
                            v14_5.append(v13_5);
                            v14_5.append(" ");
                            v14_5.append(v8_5);
                            v5_3 = v14_5.toString();
                        }
                    } else {
                        String v5_10 = v8_9.getP().getX();
                        float v6_11 = v8_9.getP().getY();
                        float v8_7 = new StringBuilder();
                        v8_7.append("L ");
                        v8_7.append(v5_10);
                        v8_7.append(" ");
                        v8_7.append(v6_11);
                        v5_3 = v8_7.toString();
                    }
                    float v6_13 = new StringBuilder();
                    v6_13.append(v0_5);
                    v6_13.append(v5_3);
                    v0_5 = v6_13.toString();
                    v5_11 = v7;
                }
            }
            if (!p15.getClosed()) {
                return v0_5;
            } else {
                IllegalStateException v15_5 = new StringBuilder();
                v15_5.append(v0_5);
                v15_5.append("Z");
                return v15_5.toString();
            }
        } else {
            return "";
        }
    }

    private static final CharSequence toSVGPath$lambda$39(com.alightcreative.app.motion.scene.CubicBSpline p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        return com.alightcreative.app.motion.scene.CubicBSplineKt.toSVGPath(p1);
    }

    public static final com.alightcreative.app.motion.scene.CBKnot valueAtTime(com.alightcreative.app.motion.scene.KeyableCBKnot p3, float p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        com.alightcreative.app.motion.scene.Vector2D v0_3 = ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(p3.getP(), p4));
        return new com.alightcreative.app.motion.scene.CBKnot(v0_3, com.alightcreative.app.motion.scene.GeometryKt.plus(com.alightcreative.app.motion.scene.KeyableKt.optionalValueAtTime(p3.getCurveIn(), p4), v0_3), com.alightcreative.app.motion.scene.GeometryKt.plus(com.alightcreative.app.motion.scene.KeyableKt.optionalValueAtTime(p3.getCurveOut(), p4), v0_3));
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline valueAtTime(com.alightcreative.app.motion.scene.KeyableCompoundCubicBSpline p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        com.alightcreative.app.motion.scene.CompoundCubicBSpline v2_4 = p2.getContours();
        java.util.ArrayList v0_2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v2_4, 10));
        com.alightcreative.app.motion.scene.CompoundCubicBSpline v2_1 = v2_4.iterator();
        while (v2_1.hasNext()) {
            v0_2.add(com.alightcreative.app.motion.scene.CubicBSplineKt.valueAtTime(((com.alightcreative.app.motion.scene.KeyableCubicBSpline) v2_1.next()), p3));
        }
        return new com.alightcreative.app.motion.scene.CompoundCubicBSpline(v0_2);
    }

    public static final com.alightcreative.app.motion.scene.CubicBSpline valueAtTime(com.alightcreative.app.motion.scene.KeyableCubicBSpline p3, float p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        com.alightcreative.app.motion.scene.CubicBSpline v0_4 = p3.getKnots();
        java.util.ArrayList v1_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_4, 10));
        com.alightcreative.app.motion.scene.CubicBSpline v0_1 = v0_4.iterator();
        while (v0_1.hasNext()) {
            v1_1.add(com.alightcreative.app.motion.scene.CubicBSplineKt.valueAtTime(((com.alightcreative.app.motion.scene.KeyableCBKnot) v0_1.next()), p4));
        }
        return new com.alightcreative.app.motion.scene.CubicBSpline(v1_1, p3.getClosed(), p3.getExclude());
    }

    public static final com.alightcreative.app.motion.scene.CBKnot withInPoint(com.alightcreative.app.motion.scene.CBKnot p3, float p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.CBKnot(p3.getP(), new com.alightcreative.app.motion.scene.Vector2D(p4, p5), p3.getCurveOut());
    }

    public static final com.alightcreative.app.motion.scene.CBKnot withOutPoint(com.alightcreative.app.motion.scene.CBKnot p3, float p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.CBKnot(p3.getP(), p3.getCurveIn(), new com.alightcreative.app.motion.scene.Vector2D(p4, p5));
    }

    public static synthetic String x(float p0, float p1, com.alightcreative.app.motion.scene.Rectangle p2, float p3)
    {
        return com.alightcreative.app.motion.scene.CubicBSplineKt.fitIn$lambda$23(p0, p1, p2, p3);
    }
}
