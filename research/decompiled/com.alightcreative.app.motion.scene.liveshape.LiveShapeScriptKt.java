package com.alightcreative.app.motion.scene.liveshape;
public final class LiveShapeScriptKt {
    private static final com.alightcreative.app.motion.scene.liveshape.HInfo HInfoZero;
    private static final java.util.Map defaultHandlesCache;
    private static final android.util.LruCache outlineCache;
    private static final java.util.Map scriptEnvCache;
    private static final java.util.Map shapeDefaultOutlineCache;

    static LiveShapeScriptKt()
    {
        com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.scriptEnvCache = new java.util.LinkedHashMap();
        com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.shapeDefaultOutlineCache = new java.util.LinkedHashMap();
        com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.defaultHandlesCache = new java.util.LinkedHashMap();
        com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.outlineCache = new android.util.LruCache(128);
        com.alightcreative.app.motion.scene.Vector2D v1_1 = com.alightcreative.app.motion.scene.Vector2D.Companion;
        com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.HInfoZero = new com.alightcreative.app.motion.scene.liveshape.HInfo(v1_1.getZERO(), v1_1.getZERO());
        return;
    }

    public static synthetic void E(java.util.List p0, kotlin.jvm.internal.Ref$BooleanRef p1, com.caoccao.javet.values.V8Value p2, com.caoccao.javet.values.V8Value p3)
    {
        com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.cubicBSplineFromScriptResult$lambda$45(p0, p1, p2, p3);
        return;
    }

    public static synthetic String F0()
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getShapeOutline$lambda$8$lambda$6$lambda$5$lambda$4();
    }

    public static synthetic String FT()
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getShapeOutline$lambda$8$lambda$7();
    }

    public static synthetic String H(com.alightcreative.app.motion.scene.CompoundCubicBSpline p0)
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getShapeOutline$lambda$25$lambda$24$lambda$23$lambda$22$lambda$21(p0);
    }

    public static synthetic String IB()
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.makeScriptEnv$lambda$41$lambda$39$lambda$35();
    }

    public static synthetic String R6()
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getShapeOutline$lambda$8$lambda$6$lambda$2();
    }

    public static synthetic com.alightcreative.app.motion.scene.CompoundCubicBSpline T(com.alightcreative.app.motion.scene.SceneElement p0, com.alightcreative.app.motion.scene.liveshape.LiveShape p1, java.util.Map p2, float p3)
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getShapeOutline$lambda$25(p0, p1, p2, p3);
    }

    public static synthetic String X()
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.makeScriptEnv$lambda$41$lambda$39$lambda$36();
    }

    public static synthetic java.util.Map ah(java.util.Map p0, com.alightcreative.app.motion.scene.liveshape.LiveShape p1, NCh.A p2, com.caoccao.javet.interop.V8Runtime p3)
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getDefaultHandles$lambda$19$lambda$15(p0, p1, p2, p3);
    }

    public static synthetic String cD()
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.makeScriptEnv$lambda$41$lambda$40();
    }

    public static synthetic String cLW(java.util.Map p0, com.alightcreative.app.motion.scene.liveshape.LiveShape p1, java.util.List p2)
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getDefaultHandles$lambda$19$lambda$18(p0, p1, p2);
    }

    private static final com.alightcreative.app.motion.scene.CompoundCubicBSpline compoundCubicBSplineFromScriptResult(com.caoccao.javet.values.reference.V8ValueArray p1)
    {
        return new com.alightcreative.app.motion.scene.CompoundCubicBSpline(kotlin.collections.CollectionsKt.listOf(com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.cubicBSplineFromScriptResult(p1)));
    }

    private static final com.alightcreative.app.motion.scene.CubicBSpline cubicBSplineFromScriptResult(com.caoccao.javet.values.reference.V8ValueArray p6)
    {
        java.util.ArrayList v1_1 = new java.util.ArrayList();
        com.alightcreative.app.motion.scene.CubicBSpline v0_3 = new kotlin.jvm.internal.Ref$BooleanRef();
        v0_3.element = 1;
        p6.forEach(new com.alightcreative.app.motion.scene.liveshape.Ki(v1_1, v0_3));
        return new com.alightcreative.app.motion.scene.CubicBSpline(v1_1, v0_3.element, 0, 4, 0);
    }

    private static final void cubicBSplineFromScriptResult$lambda$45(java.util.List p6, kotlin.jvm.internal.Ref$BooleanRef p7, com.caoccao.javet.values.V8Value p8, com.caoccao.javet.values.V8Value p9)
    {
        if (!(p9 instanceof com.caoccao.javet.values.reference.V8ValueArray)) {
            if ((p9 instanceof com.caoccao.javet.values.reference.V8ValueObject)) {
                if ((!((com.caoccao.javet.values.reference.V8ValueObject) p9).has("p")) || (!NCh.qfV.H(((com.caoccao.javet.values.reference.V8ValueObject) p9), "p"))) {
                    if (((com.caoccao.javet.values.reference.V8ValueObject) p9).has("closed")) {
                        p7.element = ((com.caoccao.javet.values.reference.V8ValueObject) p9).getBoolean("closed").booleanValue();
                    }
                } else {
                    com.caoccao.javet.values.V8Value v7_2 = ((com.caoccao.javet.values.reference.V8ValueObject) p9).get("p");
                    try {
                        com.alightcreative.app.motion.scene.Vector2D v1_3 = ((com.caoccao.javet.values.reference.V8ValueArray) v7_2);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v1_3);
                    } catch (Throwable v0_1) {
                        Throwable v6_1 = v0_1;
                        try {
                            throw v6_1;
                        } catch (Throwable v0_2) {
                            Throwable v8_2 = v0_2;
                            kotlin.jdk7.AutoCloseableKt.closeFinally(v7_2, v6_1);
                            throw v8_2;
                        }
                    }
                    if (NCh.qfV.ojl(v1_3)) {
                        Throwable v0_5;
                        com.alightcreative.app.motion.scene.Vector2D v1_4 = NCh.qfV.db(v1_3);
                        com.alightcreative.app.motion.scene.Vector2D v2_2 = com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
                        if ((!((com.caoccao.javet.values.reference.V8ValueObject) p9).has("in")) || (!NCh.qfV.H(((com.caoccao.javet.values.reference.V8ValueObject) p9), "in"))) {
                            v0_5 = v2_2;
                        } else {
                            boolean v4_9 = ((com.caoccao.javet.values.reference.V8ValueObject) p9).get("in");
                            Throwable v0_7 = ((com.caoccao.javet.values.reference.V8ValueArray) v4_9);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(v0_7);
                            if (!NCh.qfV.ojl(v0_7)) {
                                v0_5 = v2_2;
                            } else {
                                v0_5 = NCh.qfV.db(v0_7);
                            }
                            kotlin.jdk7.AutoCloseableKt.closeFinally(v4_9, 0);
                        }
                        if ((((com.caoccao.javet.values.reference.V8ValueObject) p9).has("out")) && (NCh.qfV.H(((com.caoccao.javet.values.reference.V8ValueObject) p9), "out"))) {
                            Throwable v8_5 = ((com.caoccao.javet.values.reference.V8ValueObject) p9).get("out");
                            Throwable v9_4 = ((com.caoccao.javet.values.reference.V8ValueArray) v8_5);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(v9_4);
                            if (NCh.qfV.ojl(v9_4)) {
                                v2_2 = NCh.qfV.db(v9_4);
                            }
                            kotlin.jdk7.AutoCloseableKt.closeFinally(v8_5, 0);
                        }
                        p6.add(new com.alightcreative.app.motion.scene.CBKnot(v1_4, v0_5, v2_2));
                    }
                    kotlin.jdk7.AutoCloseableKt.closeFinally(v7_2, 0);
                    return;
                }
            }
        } else {
            if (NCh.qfV.ojl(((com.caoccao.javet.values.reference.V8ValueArray) p9))) {
                p6.add(new com.alightcreative.app.motion.scene.CBKnot(NCh.qfV.db(((com.caoccao.javet.values.reference.V8ValueArray) p9)), 0, 0, 6, 0));
                return;
            }
        }
        return;
    }

    public static synthetic String db(java.util.Map p0, com.alightcreative.app.motion.scene.liveshape.LiveShape p1, java.util.List p2)
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getShapeHandles$lambda$33(p0, p1, p2);
    }

    public static final java.util.List getDefaultHandles(com.alightcreative.app.motion.scene.liveshape.LiveShape p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        java.util.Map v0_9 = com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.defaultHandlesCache.get(p10.getId());
        if (v0_9 != null) {
            return ((java.util.List) v0_9);
        } else {
            java.util.Map v0_1 = com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.scriptEnvCache;
            com.alightcreative.app.motion.scene.liveshape.hz8 v1_0 = p10.getId();
            java.util.ArrayList v2_0 = v0_1.get(v1_0);
            if (v2_0 == null) {
                v2_0 = com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.makeScriptEnv(p10);
                v0_1.put(v1_0, v2_0);
            }
            java.util.ArrayList v2_1 = ((NCh.K) v2_0);
            java.util.Map v0_3 = p10.getParameters();
            com.alightcreative.app.motion.scene.liveshape.hz8 v1_2 = new java.util.ArrayList();
            java.util.Map v0_4 = v0_3.iterator();
            while(true) {
                com.alightcreative.app.motion.scene.Vector2D v4_0 = 0;
                if (!v0_4.hasNext()) {
                    break;
                }
                com.alightcreative.app.motion.scene.liveshape.ShapeHandle v3_1 = ((com.alightcreative.app.motion.scene.userparam.UserParameter) v0_4.next());
                com.alightcreative.app.motion.scene.liveshape.PositionedShapeHandle v5_0 = com.alightcreative.app.motion.scene.userparam.UserParameterKt.getDefaultKeyableUserParameterValue(v3_1);
                if (v5_0 != null) {
                    v4_0 = kotlin.TuplesKt.to(v3_1.getName(), v5_0);
                }
                if (v4_0 != null) {
                    v1_2.add(v4_0);
                }
            }
            java.util.Map v0_8 = ((java.util.Map) NCh.K.uKP(v2_1, 0, new com.alightcreative.app.motion.scene.liveshape.MY(kotlin.collections.MapsKt.toMap(v1_2), p10), 1, 0));
            com.alightcreative.app.motion.scene.liveshape.hz8 v1_6 = p10.getHandles();
            java.util.ArrayList v2_3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v1_6, 10));
            com.alightcreative.app.motion.scene.liveshape.hz8 v1_7 = v1_6.iterator();
            while (v1_7.hasNext()) {
                com.alightcreative.app.motion.scene.liveshape.ShapeHandle v3_9 = ((com.alightcreative.app.motion.scene.liveshape.ShapeHandle) v1_7.next());
                com.alightcreative.app.motion.scene.Vector2D v4_3 = ((com.alightcreative.app.motion.scene.liveshape.HInfo) v0_8.get(v3_9.getId()));
                if (v4_3 == null) {
                    v4_3 = com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.HInfoZero;
                }
                com.alightcreative.app.motion.scene.Vector2D v4_5;
                com.alightcreative.app.motion.scene.Vector2D v6 = v4_3.getPos();
                switch (com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt$WhenMappings.$EnumSwitchMapping$0[v3_9.getType().ordinal()]) {
                    case 1:
                        v4_5 = new com.alightcreative.app.motion.scene.Vector2D(1065353216, 0);
                    case 2:
                        v4_5 = new com.alightcreative.app.motion.scene.Vector2D(0, 1065353216);
                        break;
                    case 3:
                        v4_5 = new com.alightcreative.app.motion.scene.Vector2D(1065353216, 1065353216);
                        break;
                    case 4:
                        v4_5 = com.alightcreative.app.motion.scene.GeometryKt.perpCCw(com.alightcreative.app.motion.scene.GeometryKt.normalize(v4_3.getPos()));
                        break;
                    case 5:
                        v4_5 = com.alightcreative.app.motion.scene.GeometryKt.normalize(v4_3.getPos());
                        break;
                    case 6:
                        v4_5 = com.alightcreative.app.motion.scene.GeometryKt.normalize(v4_3.getAxis());
                        break;
                    default:
                        throw new kotlin.NoWhenBranchMatchedException();
                }
                v2_3.add(new com.alightcreative.app.motion.scene.liveshape.PositionedShapeHandle(v3_9, v6, v4_5));
            }
            fx.Enc.H(p10, new com.alightcreative.app.motion.scene.liveshape.hz8(v0_8, p10, v2_3));
            return v2_3;
        }
    }

    private static final java.util.Map getDefaultHandles$lambda$19$lambda$15(java.util.Map p1, com.alightcreative.app.motion.scene.liveshape.LiveShape p2, NCh.A p3, com.caoccao.javet.interop.V8Runtime p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "$this$run");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "it");
        com.caoccao.javet.values.V8Value v1_1 = com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt.userParamsAtTimeForScript(p3, com.alightcreative.app.motion.scene.userparam.UserParameterKt.atTime(p1, 0), p2.getParamsById(), 0);
        Throwable v2_2 = p3.q().getGlobalObject();
        com.alightcreative.app.motion.scene.liveshape.D v4_2 = new com.caoccao.javet.values.V8Value[1];
        v4_2[0] = v1_1;
        com.caoccao.javet.values.V8Value v1_2 = v2_2.invoke("getHandles", v4_2);
        try {
            Throwable v2_4 = ((com.caoccao.javet.values.reference.V8ValueObject) v1_2);
            Throwable v3_3 = new java.util.LinkedHashMap();
            v2_4.forEach(new com.alightcreative.app.motion.scene.liveshape.D(v3_3));
            kotlin.jdk7.AutoCloseableKt.closeFinally(v1_2, 0);
            return v3_3;
        } catch (Throwable v2_6) {
            try {
                throw v2_6;
            } catch (Throwable v3_4) {
                kotlin.jdk7.AutoCloseableKt.closeFinally(v1_2, v2_6);
                throw v3_4;
            }
        }
    }

    private static final void getDefaultHandles$lambda$19$lambda$15$lambda$14$lambda$13(java.util.Map p7, com.caoccao.javet.values.primitive.V8ValueString p8, com.caoccao.javet.values.V8Value p9)
    {
        float v0_0 = (p9 instanceof com.caoccao.javet.values.reference.V8ValueArray);
        int v1_1 = Integer.valueOf(1);
        float v2_3 = Integer.valueOf(0);
        if (v0_0 == 0) {
            if (((p9 instanceof com.caoccao.javet.values.reference.V8ValueObject)) && ((((com.caoccao.javet.values.reference.V8ValueObject) p9).has("x")) && (((com.caoccao.javet.values.reference.V8ValueObject) p9).has("y")))) {
                com.alightcreative.app.motion.scene.Vector2D v3_0;
                float v0_2 = ((com.caoccao.javet.values.reference.V8ValueObject) p9).getFloat("x");
                Float v4_2 = ((com.caoccao.javet.values.reference.V8ValueObject) p9).getFloat("y");
                if ((!((com.caoccao.javet.values.reference.V8ValueObject) p9).has("axis")) || (!NCh.qfV.H(((com.caoccao.javet.values.reference.V8ValueObject) p9), "axis"))) {
                    v3_0 = com.alightcreative.app.motion.scene.Vector2D.Companion.getZERO();
                } else {
                    com.alightcreative.app.motion.scene.liveshape.HInfo v9_3 = ((com.caoccao.javet.values.reference.V8ValueObject) p9).get("axis");
                    com.caoccao.javet.values.reference.V8ValueArray v5_3 = ((com.caoccao.javet.values.reference.V8ValueArray) v9_3);
                    if (v5_3.getLength() != 2) {
                        v3_0 = com.alightcreative.app.motion.scene.Vector2D.Companion.getZERO();
                    } else {
                        float v2_1 = v5_3.getFloat(v2_3);
                        int v1_3 = v5_3.getFloat(v1_1);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v2_1);
                        float v2_2 = v2_1.floatValue();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v1_3);
                        v3_0 = new com.alightcreative.app.motion.scene.Vector2D(v2_2, v1_3.floatValue());
                    }
                    kotlin.jdk7.AutoCloseableKt.closeFinally(v9_3, 0);
                }
                Throwable v8_2 = p8.toPrimitive();
                kotlin.jvm.internal.Intrinsics.checkNotNull(v0_2);
                float v0_3 = v0_2.floatValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(v4_2);
                p7.put(v8_2, new com.alightcreative.app.motion.scene.liveshape.HInfo(new com.alightcreative.app.motion.scene.Vector2D(v0_3, v4_2.floatValue()), v3_0));
            }
        } else {
            if (((com.caoccao.javet.values.reference.V8ValueArray) p9).getLength() == 2) {
                float v0_5 = ((com.caoccao.javet.values.reference.V8ValueArray) p9).getFloat(v2_3);
                com.alightcreative.app.motion.scene.liveshape.HInfo v9_7 = ((com.caoccao.javet.values.reference.V8ValueArray) p9).getFloat(v1_1);
                Throwable v8_3 = p8.toPrimitive();
                kotlin.jvm.internal.Intrinsics.checkNotNull(v0_5);
                float v0_7 = v0_5.floatValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(v9_7);
                p7.put(v8_3, new com.alightcreative.app.motion.scene.liveshape.HInfo(new com.alightcreative.app.motion.scene.Vector2D(v0_7, v9_7.floatValue()), com.alightcreative.app.motion.scene.Vector2D.Companion.getZERO()));
                return;
            }
        }
        return;
    }

    private static final String getDefaultHandles$lambda$19$lambda$18(java.util.Map p2, com.alightcreative.app.motion.scene.liveshape.LiveShape p3, java.util.List p4)
    {
        java.util.List v3_1 = p3.getHandles();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("getShapeHandles: handlePositions=");
        v0_1.append(p2);
        v0_1.append(" shape.handles=");
        v0_1.append(v3_1);
        v0_1.append(" result=");
        v0_1.append(p4);
        return v0_1.toString();
    }

    public static final java.util.List getShapeHandles(com.alightcreative.app.motion.scene.SceneElement p10, float p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        if (p10.getLiveShape().getId() != null) {
            com.alightcreative.app.motion.scene.liveshape.LiveShape v0_1 = com.alightcreative.app.motion.scene.liveshape.LiveShapeKt.getShape(p10.getLiveShape());
            if (v0_1 != null) {
                com.alightcreative.app.motion.scene.liveshape.et v1_0 = com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.scriptEnvCache;
                java.util.ArrayList v2_1 = p10.getLiveShape().getId();
                com.alightcreative.app.motion.scene.liveshape.ShapeHandle v3_0 = v1_0.get(v2_1);
                if (v3_0 == null) {
                    v3_0 = com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.makeScriptEnv(v0_1);
                    v1_0.put(v2_1, v3_0);
                }
                java.util.Map v11_3 = ((java.util.Map) NCh.K.uKP(((NCh.K) v3_0), 0, new com.alightcreative.app.motion.scene.liveshape.AWD(p10, p11, v0_1), 1, 0));
                com.alightcreative.app.motion.scene.liveshape.et v1_3 = v0_1.getHandles();
                java.util.ArrayList v2_4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v1_3, 10));
                com.alightcreative.app.motion.scene.liveshape.et v1_4 = v1_3.iterator();
                while (v1_4.hasNext()) {
                    com.alightcreative.app.motion.scene.liveshape.ShapeHandle v3_6 = ((com.alightcreative.app.motion.scene.liveshape.ShapeHandle) v1_4.next());
                    com.alightcreative.app.motion.scene.Vector2D v4_3 = ((com.alightcreative.app.motion.scene.liveshape.HInfo) v11_3.get(v3_6.getId()));
                    if (v4_3 == null) {
                        v4_3 = com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.HInfoZero;
                    }
                    com.alightcreative.app.motion.scene.Vector2D v4_5;
                    com.alightcreative.app.motion.scene.Vector2D v6 = v4_3.getPos();
                    switch (com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt$WhenMappings.$EnumSwitchMapping$0[v3_6.getType().ordinal()]) {
                        case 1:
                            v4_5 = new com.alightcreative.app.motion.scene.Vector2D(1065353216, 0);
                            break;
                        case 2:
                            v4_5 = new com.alightcreative.app.motion.scene.Vector2D(0, 1065353216);
                            break;
                        case 3:
                            v4_5 = new com.alightcreative.app.motion.scene.Vector2D(1065353216, 1065353216);
                            break;
                        case 4:
                            v4_5 = com.alightcreative.app.motion.scene.GeometryKt.perpCCw(com.alightcreative.app.motion.scene.GeometryKt.normalize(v4_3.getPos()));
                            break;
                        case 5:
                            v4_5 = com.alightcreative.app.motion.scene.GeometryKt.normalize(v4_3.getPos());
                            break;
                        case 6:
                            v4_5 = com.alightcreative.app.motion.scene.GeometryKt.normalize(v4_3.getAxis());
                            break;
                        default:
                            throw new kotlin.NoWhenBranchMatchedException();
                    }
                    v2_4.add(new com.alightcreative.app.motion.scene.liveshape.PositionedShapeHandle(v3_6, v6, v4_5));
                }
                fx.Enc.H(p10, new com.alightcreative.app.motion.scene.liveshape.et(v11_3, v0_1, v2_4));
                return v2_4;
            } else {
                return kotlin.collections.CollectionsKt.emptyList();
            }
        } else {
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }

    private static final java.util.Map getShapeHandles$lambda$30(com.alightcreative.app.motion.scene.SceneElement p1, float p2, com.alightcreative.app.motion.scene.liveshape.LiveShape p3, NCh.A p4, com.caoccao.javet.interop.V8Runtime p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "$this$run");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "it");
        com.caoccao.javet.values.V8Value v1_5 = com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt.userParamsAtTimeForScript(p4, com.alightcreative.app.motion.scene.userparam.UserParameterKt.atTimeAccum(p1.getLiveShape().getParamValues(), p2, (((float) (p1.getEndTime() - p1.getStartTime())) / 1148846080), p3.getParamsById()), p3.getParamsById(), p2);
        Throwable v2_2 = p4.q().getGlobalObject();
        com.alightcreative.app.motion.scene.liveshape.qfV v4_2 = new com.caoccao.javet.values.V8Value[1];
        v4_2[0] = v1_5;
        com.caoccao.javet.values.V8Value v1_6 = v2_2.invoke("getHandles", v4_2);
        try {
            Throwable v2_4 = ((com.caoccao.javet.values.reference.V8ValueObject) v1_6);
            Throwable v3_4 = new java.util.LinkedHashMap();
            v2_4.forEach(new com.alightcreative.app.motion.scene.liveshape.qfV(v3_4));
            kotlin.jdk7.AutoCloseableKt.closeFinally(v1_6, 0);
            return v3_4;
        } catch (Throwable v2_6) {
            try {
                throw v2_6;
            } catch (Throwable v3_5) {
                kotlin.jdk7.AutoCloseableKt.closeFinally(v1_6, v2_6);
                throw v3_5;
            }
        }
    }

    private static final void getShapeHandles$lambda$30$lambda$29$lambda$28(java.util.Map p4, com.caoccao.javet.values.primitive.V8ValueString p5, com.caoccao.javet.values.V8Value p6)
    {
        if (!(p6 instanceof com.caoccao.javet.values.reference.V8ValueArray)) {
            if (((p6 instanceof com.caoccao.javet.values.reference.V8ValueObject)) && ((((com.caoccao.javet.values.reference.V8ValueObject) p6).has("x")) && (((com.caoccao.javet.values.reference.V8ValueObject) p6).has("y")))) {
                com.alightcreative.app.motion.scene.Vector2D v2_2;
                float v0_1 = ((com.caoccao.javet.values.reference.V8ValueObject) p6).getFloat("x");
                float v1_0 = ((com.caoccao.javet.values.reference.V8ValueObject) p6).getFloat("y");
                if ((!((com.caoccao.javet.values.reference.V8ValueObject) p6).has("axis")) || (!NCh.qfV.H(((com.caoccao.javet.values.reference.V8ValueObject) p6), "axis"))) {
                    v2_2 = com.alightcreative.app.motion.scene.Vector2D.Companion.getZERO();
                } else {
                    com.alightcreative.app.motion.scene.liveshape.HInfo v6_2 = ((com.caoccao.javet.values.reference.V8ValueObject) p6).get("axis");
                    com.alightcreative.app.motion.scene.Vector2D v2_4 = ((com.caoccao.javet.values.reference.V8ValueArray) v6_2);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(v2_4);
                    if (!NCh.qfV.ojl(v2_4)) {
                        v2_2 = com.alightcreative.app.motion.scene.Vector2D.Companion.getZERO();
                    } else {
                        v2_2 = NCh.qfV.db(v2_4);
                    }
                    kotlin.jdk7.AutoCloseableKt.closeFinally(v6_2, 0);
                }
                Throwable v5_2 = p5.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(v0_1);
                float v0_4 = v0_1.floatValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(v1_0);
                p4.put(v5_2, new com.alightcreative.app.motion.scene.liveshape.HInfo(new com.alightcreative.app.motion.scene.Vector2D(v0_4, v1_0.floatValue()), v2_2));
            }
        } else {
            if (NCh.qfV.ojl(((com.caoccao.javet.values.reference.V8ValueArray) p6))) {
                p4.put(p5.getValue(), new com.alightcreative.app.motion.scene.liveshape.HInfo(NCh.qfV.db(((com.caoccao.javet.values.reference.V8ValueArray) p6)), com.alightcreative.app.motion.scene.Vector2D.Companion.getZERO()));
                return;
            }
        }
        return;
    }

    private static final String getShapeHandles$lambda$33(java.util.Map p2, com.alightcreative.app.motion.scene.liveshape.LiveShape p3, java.util.List p4)
    {
        java.util.List v3_1 = p3.getHandles();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("getShapeHandles: handlePositions=");
        v0_1.append(p2);
        v0_1.append(" shape.handles=");
        v0_1.append(v3_1);
        v0_1.append(" result=");
        v0_1.append(p4);
        return v0_1.toString();
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline getShapeOutline(com.alightcreative.app.motion.scene.SceneElement p5, float p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        if (p5.getLiveShape().getId() != null) {
            com.alightcreative.app.motion.scene.liveshape.LiveShape v0_1 = com.alightcreative.app.motion.scene.liveshape.LiveShapeKt.getShape(p5.getLiveShape());
            if (v0_1 != null) {
                java.util.Map v1_2 = com.alightcreative.app.motion.scene.userparam.UserParameterKt.atTimeAccum(p5.getLiveShape().getParamValues(), p6, (((float) (p5.getEndTime() - p5.getStartTime())) / 1148846080), v0_1.getParamsById());
                return ((com.alightcreative.app.motion.scene.CompoundCubicBSpline) com.alightcreative.app.motion.scene.ImageCacheKt.getOrPut(com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.outlineCache, new com.alightcreative.app.motion.scene.liveshape.ShapeInstanceDesc(v0_1.getId(), v1_2), new com.alightcreative.app.motion.scene.liveshape.q(p5, v0_1, v1_2, p6)));
            } else {
                return com.alightcreative.app.motion.scene.CubicBSplineKt.valueAtTime(p5.getOutline(), p6);
            }
        } else {
            return com.alightcreative.app.motion.scene.CubicBSplineKt.valueAtTime(p5.getOutline(), p6);
        }
    }

    public static final com.alightcreative.app.motion.scene.CompoundCubicBSpline getShapeOutline(com.alightcreative.app.motion.scene.liveshape.LiveShape p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        com.alightcreative.app.motion.scene.CompoundCubicBSpline v0_9 = com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.shapeDefaultOutlineCache.get(p3.getId());
        if (v0_9 != null) {
            return ((com.alightcreative.app.motion.scene.CompoundCubicBSpline) v0_9);
        } else {
            fx.Enc.H(p3, new com.alightcreative.app.motion.scene.liveshape.Y());
            com.alightcreative.app.motion.scene.CompoundCubicBSpline v0_3 = com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.scriptEnvCache;
            com.alightcreative.app.motion.scene.liveshape.XSt v1_0 = p3.getId();
            NCh.K v2_0 = v0_3.get(v1_0);
            if (v2_0 == null) {
                v2_0 = com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.makeScriptEnv(p3);
                v0_3.put(v1_0, v2_0);
            }
            com.alightcreative.app.motion.scene.CompoundCubicBSpline v0_8 = ((com.alightcreative.app.motion.scene.CompoundCubicBSpline) ((NCh.K) v2_0).ojl(30000, new com.alightcreative.app.motion.scene.liveshape.h(p3)));
            fx.Enc.H(p3, new com.alightcreative.app.motion.scene.liveshape.XSt());
            return v0_8;
        }
    }

    private static final com.alightcreative.app.motion.scene.CompoundCubicBSpline getShapeOutline$lambda$25(com.alightcreative.app.motion.scene.SceneElement p2, com.alightcreative.app.motion.scene.liveshape.LiveShape p3, java.util.Map p4, float p5)
    {
        java.util.Map v0 = com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.scriptEnvCache;
        com.alightcreative.app.motion.scene.CompoundCubicBSpline v2_6 = p2.getLiveShape().getId();
        NCh.K v1_1 = v0.get(v2_6);
        if (v1_1 == null) {
            v1_1 = com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.makeScriptEnv(p3);
            v0.put(v2_6, v1_1);
        }
        return ((com.alightcreative.app.motion.scene.CompoundCubicBSpline) NCh.K.uKP(((NCh.K) v1_1), 0, new com.alightcreative.app.motion.scene.liveshape.CU(p4, p3, p5), 1, 0));
    }

    private static final com.alightcreative.app.motion.scene.CompoundCubicBSpline getShapeOutline$lambda$25$lambda$24(java.util.Map p1, com.alightcreative.app.motion.scene.liveshape.LiveShape p2, float p3, NCh.A p4, com.caoccao.javet.interop.V8Runtime p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "$this$run");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "it");
        com.caoccao.javet.values.V8Value v1_2 = com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt.userParamsAtTimeForScript(p4, p1, p2.getParamsById(), p3);
        Throwable v2_1 = p4.q().getGlobalObject();
        com.caoccao.javet.values.V8Value[] v5_2 = new com.caoccao.javet.values.V8Value[1];
        v5_2[0] = v1_2;
        com.caoccao.javet.values.V8Value v1_1 = v2_1.invoke("getPath", v5_2);
        try {
            Throwable v2_3 = ((com.caoccao.javet.values.reference.V8ValueArray) v1_1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(v2_3);
            Throwable v2_4 = com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.compoundCubicBSplineFromScriptResult(v2_3);
            fx.Enc.H(p4, new com.alightcreative.app.motion.scene.liveshape.Sq(v2_4));
            kotlin.jdk7.AutoCloseableKt.closeFinally(v1_1, 0);
            return v2_4;
        } catch (Throwable v2_5) {
            try {
                throw v2_5;
            } catch (Throwable v3_5) {
                kotlin.jdk7.AutoCloseableKt.closeFinally(v1_1, v2_5);
                throw v3_5;
            }
        }
    }

    private static final String getShapeOutline$lambda$25$lambda$24$lambda$23$lambda$22$lambda$21(com.alightcreative.app.motion.scene.CompoundCubicBSpline p2)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("getShapeOutline >> ");
        v0_1.append(p2);
        return v0_1.toString();
    }

    private static final String getShapeOutline$lambda$8$lambda$0()
    {
        return "LiveShape:getShapeOutline: IN";
    }

    private static final com.alightcreative.app.motion.scene.CompoundCubicBSpline getShapeOutline$lambda$8$lambda$6(com.alightcreative.app.motion.scene.liveshape.LiveShape p3, NCh.A p4, com.caoccao.javet.interop.V8Runtime p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "$this$run");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "it");
        fx.Enc.H(p4, new com.alightcreative.app.motion.scene.liveshape.Enc());
        com.alightcreative.app.motion.scene.liveshape.F v3_2 = com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt.userParamsAtTimeForScript(p4, kotlin.collections.MapsKt.emptyMap(), p3.getParamsById(), 0);
        Throwable v5_2 = p4.q().getGlobalObject();
        com.caoccao.javet.values.V8Value[] v1_1 = new com.caoccao.javet.values.V8Value[1];
        v1_1[0] = v3_2;
        com.alightcreative.app.motion.scene.liveshape.F v3_3 = v5_2.invoke("getPath", v1_1);
        try {
            Throwable v5_4 = ((com.caoccao.javet.values.reference.V8ValueArray) v3_3);
            kotlin.jvm.internal.Intrinsics.checkNotNull(v5_4);
            Throwable v5_5 = com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.compoundCubicBSplineFromScriptResult(v5_4);
            kotlin.jdk7.AutoCloseableKt.closeFinally(v3_3, 0);
            com.alightcreative.app.motion.scene.liveshape.F v3_5 = new com.alightcreative.app.motion.scene.liveshape.F();
            fx.Enc.H(p4, v3_5);
            return v5_5;
        } catch (Throwable v4_1) {
            try {
                throw v4_1;
            } catch (Throwable v5_6) {
                kotlin.jdk7.AutoCloseableKt.closeFinally(v3_5, v4_1);
                throw v5_6;
            }
        }
    }

    private static final String getShapeOutline$lambda$8$lambda$6$lambda$2()
    {
        return "LiveShape:getShapeOutline:Run IN";
    }

    private static final String getShapeOutline$lambda$8$lambda$6$lambda$5$lambda$4()
    {
        return "LiveShape:getShapeOutline:Run OUT";
    }

    private static final String getShapeOutline$lambda$8$lambda$7()
    {
        return "LiveShape:getShapeOutline: OUT";
    }

    public static synthetic com.alightcreative.app.motion.scene.CompoundCubicBSpline hUw(java.util.Map p0, com.alightcreative.app.motion.scene.liveshape.LiveShape p1, float p2, NCh.A p3, com.caoccao.javet.interop.V8Runtime p4)
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getShapeOutline$lambda$25$lambda$24(p0, p1, p2, p3, p4);
    }

    public static synthetic java.util.Map j(com.alightcreative.app.motion.scene.SceneElement p0, float p1, com.alightcreative.app.motion.scene.liveshape.LiveShape p2, NCh.A p3, com.caoccao.javet.interop.V8Runtime p4)
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getShapeHandles$lambda$30(p0, p1, p2, p3, p4);
    }

    public static synthetic void jE(java.util.Map p0, com.caoccao.javet.values.primitive.V8ValueString p1, com.caoccao.javet.values.V8Value p2)
    {
        com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getShapeHandles$lambda$30$lambda$29$lambda$28(p0, p1, p2);
        return;
    }

    public static synthetic String l(com.alightcreative.app.motion.scene.liveshape.LiveShape p0)
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.makeScriptEnv$lambda$41$lambda$34(p0);
    }

    private static final NCh.K makeScriptEnv(com.alightcreative.app.motion.scene.liveshape.LiveShape p5)
    {
        com.alightcreative.app.motion.scene.liveshape.x v1_4 = p5.getId();
        int v2_2 = new StringBuilder();
        v2_2.append("liveShape:");
        v2_2.append(v1_4);
        NCh.K v0_1 = new NCh.K(v2_2.toString());
        fx.Enc.H(p5, new com.alightcreative.app.motion.scene.liveshape.Zv9(p5));
        NCh.K.uKP(v0_1, 0, new com.alightcreative.app.motion.scene.liveshape.m(p5), 1, 0);
        fx.Enc.H(p5, new com.alightcreative.app.motion.scene.liveshape.x());
        return v0_1;
    }

    private static final String makeScriptEnv$lambda$41$lambda$34(com.alightcreative.app.motion.scene.liveshape.LiveShape p2)
    {
        String v2_1 = p2.getScripts();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("LiveShape:makeScriptEnv: IN (scripts=");
        v0_1.append(v2_1);
        v0_1.append(")");
        return v0_1.toString();
    }

    private static final kotlin.Unit makeScriptEnv$lambda$41$lambda$39(com.alightcreative.app.motion.scene.liveshape.LiveShape p3, NCh.A p4, com.caoccao.javet.interop.V8Runtime p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "$this$run");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "v8");
        fx.Enc.H(p4, new com.alightcreative.app.motion.scene.liveshape.V());
        String v0_10 = p4.cD();
        com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt.registerAlightMotionScriptMethods(p5, v0_10, p3.getId());
        fx.Enc.H(p4, new com.alightcreative.app.motion.scene.liveshape.cY());
        p5.getGlobalObject().set("AM", v0_10);
        fx.Enc.H(p4, new com.alightcreative.app.motion.scene.liveshape.c(p3));
        kotlin.NotImplementedError v3_2 = p3.getScripts().iterator();
        while (v3_2.hasNext()) {
            String v0_6 = ((com.alightcreative.app.motion.scene.scripting.ACScript) v3_2.next());
            if (com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt$WhenMappings.$EnumSwitchMapping$1[v0_6.getType().ordinal()] != 1) {
                throw new kotlin.NotImplementedError(0, 1, 0);
            } else {
                com.alightcreative.app.motion.scene.scripting.ScriptExecutorKt.executeVoidScript(p5, v0_6.getSource());
            }
        }
        fx.Enc.H(p4, new com.alightcreative.app.motion.scene.liveshape.K());
        return kotlin.Unit.INSTANCE;
    }

    private static final String makeScriptEnv$lambda$41$lambda$39$lambda$35()
    {
        return "LiveShape:makeScriptEnv:Run: IN";
    }

    private static final String makeScriptEnv$lambda$41$lambda$39$lambda$36()
    {
        return "LiveShape:makeScriptEnv:Register: IN";
    }

    private static final String makeScriptEnv$lambda$41$lambda$39$lambda$37(com.alightcreative.app.motion.scene.liveshape.LiveShape p2)
    {
        String v2_1 = p2.getScripts();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("LiveShape:makeScriptEnv:ACLoadScripts scripts=");
        v0_1.append(v2_1);
        return v0_1.toString();
    }

    private static final String makeScriptEnv$lambda$41$lambda$39$lambda$38()
    {
        return "LiveShape:makeScriptEnv:Run: Out";
    }

    private static final String makeScriptEnv$lambda$41$lambda$40()
    {
        return "LiveShape:makeScriptEnv: OUT";
    }

    public static synthetic String ojl()
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.makeScriptEnv$lambda$41$lambda$39$lambda$38();
    }

    public static synthetic kotlin.Unit pM1(com.alightcreative.app.motion.scene.liveshape.LiveShape p0, NCh.A p1, com.caoccao.javet.interop.V8Runtime p2)
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.makeScriptEnv$lambda$41$lambda$39(p0, p1, p2);
    }

    public static synthetic String q(com.alightcreative.app.motion.scene.liveshape.LiveShape p0)
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.makeScriptEnv$lambda$41$lambda$39$lambda$37(p0);
    }

    public static synthetic void uKP(java.util.Map p0, com.caoccao.javet.values.primitive.V8ValueString p1, com.caoccao.javet.values.V8Value p2)
    {
        com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getDefaultHandles$lambda$19$lambda$15$lambda$14$lambda$13(p0, p1, p2);
        return;
    }

    public static synthetic com.alightcreative.app.motion.scene.CompoundCubicBSpline w(com.alightcreative.app.motion.scene.liveshape.LiveShape p0, NCh.A p1, com.caoccao.javet.interop.V8Runtime p2)
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getShapeOutline$lambda$8$lambda$6(p0, p1, p2);
    }

    public static synthetic String x()
    {
        return com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getShapeOutline$lambda$8$lambda$0();
    }
}
