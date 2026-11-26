package com.alightcreative.app.motion.scene;
public final class SceneKt {
    private static final com.alightcreative.app.motion.scene.Scene EMPTY_SCENE = None;
    private static final com.alightcreative.app.motion.scene.SceneSelection EMPTY_SCENE_SELECTION = None;
    public static final int PRESET_FORMAT_VERSION = 107;
    public static final int PROJECT_FORMAT_VERSION = 106;
    private static final java.util.List STANDARD_FRAME_RATES = None;
    public static final int TIME_REMAPPING_VERSION = 108;
    private static long lastUsedElementId;
    private static final java.util.WeakHashMap sceneHashes;

    static SceneKt()
    {
        com.alightcreative.app.motion.scene.SceneSelection v1_0 = Integer.valueOf(12);
        Integer.valueOf(15);
        com.alightcreative.app.motion.scene.Scene v0 = 1;
        Integer.valueOf(18);
        v0 = 1;
        Integer.valueOf(20);
        v0 = 1;
        Integer.valueOf(24);
        v0 = 1;
        Integer.valueOf(25);
        v0 = 1;
        Integer.valueOf(30);
        v0 = 1;
        Integer.valueOf(48);
        v0 = 1;
        Integer.valueOf(50);
        v0 = 1;
        com.alightcreative.app.motion.scene.SceneKt.STANDARD_FRAME_RATES = kotlin.collections.CollectionsKt.listOf(new Integer[] {v1_0, Integer.valueOf(60)}));
        com.alightcreative.app.motion.scene.SceneKt.sceneHashes = new java.util.WeakHashMap();
        com.alightcreative.app.motion.scene.SceneKt.EMPTY_SCENE = com.alightcreative.app.motion.scene.SceneKt.emptyScene$default(0, 0, 3, 0);
        com.alightcreative.app.motion.scene.SceneKt.EMPTY_SCENE_SELECTION = new com.alightcreative.app.motion.scene.SceneSelection(kotlin.collections.SetsKt.emptySet(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4092, 0);
        return;
    }

    public static synthetic com.alightcreative.app.motion.scene.SceneElement E(kotlin.jvm.functions.Function1 p0, com.alightcreative.app.motion.scene.SceneElement p1)
    {
        return com.alightcreative.app.motion.scene.SceneKt.remapMediaUris$lambda$71$lambda$69(p0, p1);
    }

    public static synthetic String H(kotlin.jvm.internal.Ref$IntRef p0, com.alightcreative.app.motion.scene.SceneElement p1, int p2, int p3, int p4, android.net.Uri p5, android.net.Uri p6)
    {
        return com.alightcreative.app.motion.scene.SceneKt.makeMediaComp$lambda$58$lambda$56$lambda$51(p0, p1, p2, p3, p4, p5, p6);
    }

    public static synthetic String IB()
    {
        return com.alightcreative.app.motion.scene.SceneKt.makeMediaComp$lambda$58$lambda$49();
    }

    public static synthetic String R6()
    {
        return com.alightcreative.app.motion.scene.SceneKt.checkCanExport$lambda$59();
    }

    public static final com.alightcreative.app.motion.scene.SceneHolder SceneHolder(com.alightcreative.app.motion.scene.Scene p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "scene");
        return new com.alightcreative.app.motion.scene.SceneHolderImpl(p1);
    }

    public static synthetic com.alightcreative.app.motion.scene.SceneHolder SceneHolder$default(com.alightcreative.app.motion.scene.Scene p0, int p1, Object p2)
    {
        if ((p1 & 1) != 0) {
            p0 = com.alightcreative.app.motion.scene.SceneKt.EMPTY_SCENE;
        }
        return com.alightcreative.app.motion.scene.SceneKt.SceneHolder(p0);
    }

    public static synthetic String T(int p0, com.alightcreative.app.motion.scene.Scene p1)
    {
        return com.alightcreative.app.motion.scene.SceneKt._get_thumbTime_$lambda$3$lambda$2(p0, p1);
    }

    public static synthetic String X(com.alightcreative.app.motion.scene.SceneElement p0, long p1, java.util.Set p3)
    {
        return com.alightcreative.app.motion.scene.SceneKt.uniquifyIds$lambda$25(p0, p1, p3);
    }

    private static final boolean _get_thumbTime_$lambda$0(com.alightcreative.app.motion.scene.SceneElement p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        return p1.getType().isRenderable();
    }

    private static final String _get_thumbTime_$lambda$3$lambda$2(int p6, com.alightcreative.app.motion.scene.Scene p7)
    {
        int v0 = p7.getTotalTime();
        com.alightcreative.app.motion.scene.SceneType v1 = p7.getType();
        int v2 = p7.getReTimingInMark();
        int v3 = p7.getReTimingOutMark();
        String v7_1 = p7.getTitle();
        StringBuilder v4_1 = new StringBuilder();
        v4_1.append("Scene.thumbTime thumbTime=");
        v4_1.append(p6);
        v4_1.append(" totalTime=");
        v4_1.append(v0);
        v4_1.append(" type=");
        v4_1.append(v1);
        v4_1.append(" reTimingInMark=");
        v4_1.append(v2);
        v4_1.append(" reTimingOutMark=");
        v4_1.append(v3);
        v4_1.append(" title=");
        v4_1.append(v7_1);
        return v4_1.toString();
    }

    public static final synthetic com.alightcreative.app.motion.scene.Scene access$withUpdatedTrimmingFor(com.alightcreative.app.motion.scene.Scene p0, long p1)
    {
        return com.alightcreative.app.motion.scene.SceneKt.withUpdatedTrimmingFor(p0, p1);
    }

    public static final java.util.List audioUris(com.alightcreative.app.motion.scene.Scene p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        java.util.ArrayList v0_2 = new java.util.ArrayList();
        java.util.ArrayList v1_1 = new java.util.ArrayList();
        kotlin.Pair v7_4 = p7.getElements().iterator();
        while (v7_4.hasNext()) {
            kotlin.Pair v2_4 = ((com.alightcreative.app.motion.scene.SceneElement) v7_4.next());
            kotlin.collections.CollectionsKt.emptyList();
            if ((v2_4.getType() == com.alightcreative.app.motion.scene.SceneElementType.Audio) && (!kotlin.jvm.internal.Intrinsics.areEqual(v2_4.getSrc(), android.net.Uri.EMPTY))) {
                v0_2.add(v2_4.getSrc());
            }
            if (v2_4.getType().getHasNestedScene()) {
                v1_1.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.listOf(v2_4), v2_4.getNestedScene()));
            }
        }
        do {
            kotlin.Pair v7_2 = ((kotlin.Pair) fx.D.hUw(v1_1));
            if (v7_2 != null) {
                kotlin.Pair v2_2 = ((java.util.List) v7_2.component1());
                java.util.List v3_3 = ((com.alightcreative.app.motion.scene.Scene) v7_2.component2()).getElements().iterator();
                while (v3_3.hasNext()) {
                    kotlin.Pair v4_2 = ((com.alightcreative.app.motion.scene.SceneElement) v3_3.next());
                    if ((v4_2.getType() == com.alightcreative.app.motion.scene.SceneElementType.Audio) && (!kotlin.jvm.internal.Intrinsics.areEqual(v4_2.getSrc(), android.net.Uri.EMPTY))) {
                        v0_2.add(v4_2.getSrc());
                    }
                    if (v4_2.getType().getHasNestedScene()) {
                        v1_1.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.plus(v2_2, v4_2), v4_2.getNestedScene()));
                    }
                }
            }
        } while(v7_2 != null);
        return v0_2;
    }

    public static synthetic String cD()
    {
        return com.alightcreative.app.motion.scene.SceneKt.makeMediaComp$lambda$48();
    }

    public static synthetic com.alightcreative.app.motion.scene.SceneElement cLW(kotlin.jvm.functions.Function1 p0, com.alightcreative.app.motion.scene.SceneElement p1)
    {
        return com.alightcreative.app.motion.scene.SceneKt.remapMediaUris$lambda$71$lambda$68(p0, p1);
    }

    public static final java.util.Set checkCanExport(com.alightcreative.app.motion.scene.Scene p18, FKt.Sq p19)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "contentResolver");
        java.util.LinkedHashSet v2_3 = new java.util.LinkedHashSet();
        int v3_2 = new java.util.ArrayList();
        int v4_2 = new java.util.ArrayList();
        fx.Enc.H(p18, new com.alightcreative.app.motion.scene.j());
        Integer v5_9 = new java.util.ArrayList();
        Integer v6_6 = p18.getElements().iterator();
        int v7 = 0;
        Integer v8_8 = 0;
        while(true) {
            Integer v10_11 = -1;
            Integer v13_4 = 1;
            if (!v6_6.hasNext()) {
                break;
            }
            kotlin.Pair v9_2 = ((com.alightcreative.app.motion.scene.SceneElement) v6_6.next());
            kotlin.collections.CollectionsKt.emptyList();
            if ((v9_2.getType().getHasFillVideo()) && ((v9_2.getFillType() == com.alightcreative.app.motion.scene.FillType.MEDIA) && (v9_2.getFillVideo() != null))) {
                Integer v8_25 = tI.Y.x1(p19, v9_2.getFillVideo(), 0, 4, 0);
                if (!(v8_25 instanceof tI.qfV)) {
                    if (!(v8_25 instanceof tI.Enc)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    } else {
                        v2_3.add(com.alightcreative.app.motion.scene.ExportProblem.MissingOrErrorContent);
                    }
                } else {
                    Integer v8_28 = ((tI.qfV) v8_25);
                    Integer v8_31 = Math.max(((Math.min(v8_28.db(), v8_28.q()) * 9) / 16), Math.min(v8_28.db(), v8_28.q()));
                    if (v8_31 <= com.alightcreative.app.motion.persist.xfY.INSTANCE.getMaxRes()) {
                        v3_2.add(kotlin.TuplesKt.to(Integer.valueOf(v9_2.getStartTime()), Integer.valueOf(v8_31)));
                        v3_2.add(kotlin.TuplesKt.to(Integer.valueOf(v9_2.getEndTime()), Integer.valueOf((- v8_31))));
                        v4_2.add(kotlin.TuplesKt.to(Integer.valueOf(v9_2.getStartTime()), Integer.valueOf(1)));
                        v4_2.add(kotlin.TuplesKt.to(Integer.valueOf(v9_2.getEndTime()), Integer.valueOf(-1)));
                    } else {
                        v2_3.add(com.alightcreative.app.motion.scene.ExportProblem.ContentResTooHigh);
                    }
                }
                v8_8 = 1;
            }
            if (v9_2.getType().getHasNestedScene()) {
                v5_9.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.listOf(v9_2), v9_2.getNestedScene()));
            }
        }
        while(true) {
            Integer v6_8 = ((kotlin.Pair) fx.D.hUw(v5_9));
            if (v6_8 != null) {
                kotlin.Pair v9_4 = ((java.util.List) v6_8.component1());
                android.net.Uri v14_7 = ((com.alightcreative.app.motion.scene.Scene) v6_8.component2()).getElements().iterator();
                while (v14_7.hasNext()) {
                    com.alightcreative.app.motion.scene.FillType v17_0;
                    com.alightcreative.app.motion.scene.FillType v16_2;
                    com.alightcreative.app.motion.scene.SceneElement v15_1 = ((com.alightcreative.app.motion.scene.SceneElement) v14_7.next());
                    if (!v15_1.getType().getHasFillVideo()) {
                        v16_2 = v10_11;
                        v17_0 = v13_4;
                    } else {
                        v16_2 = v10_11;
                        v17_0 = v13_4;
                        if ((v15_1.getFillType() == com.alightcreative.app.motion.scene.FillType.MEDIA) && (v15_1.getFillVideo() != null)) {
                            Integer v8_6 = tI.Y.x1(p19, v15_1.getFillVideo(), 0, 4, 0);
                            if (!(v8_6 instanceof tI.qfV)) {
                                if (!(v8_6 instanceof tI.Enc)) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                } else {
                                    v2_3.add(com.alightcreative.app.motion.scene.ExportProblem.MissingOrErrorContent);
                                }
                            } else {
                                Integer v8_10 = ((tI.qfV) v8_6);
                                Integer v8_13 = Math.max(((Math.min(v8_10.db(), v8_10.q()) * 9) / 16), Math.min(v8_10.db(), v8_10.q()));
                                if (v8_13 <= com.alightcreative.app.motion.persist.xfY.INSTANCE.getMaxRes()) {
                                    v3_2.add(kotlin.TuplesKt.to(Integer.valueOf(v15_1.getStartTime()), Integer.valueOf(v8_13)));
                                    v3_2.add(kotlin.TuplesKt.to(Integer.valueOf(v15_1.getEndTime()), Integer.valueOf((- v8_13))));
                                    v4_2.add(kotlin.TuplesKt.to(Integer.valueOf(v15_1.getStartTime()), Integer.valueOf(v17_0)));
                                    v4_2.add(kotlin.TuplesKt.to(Integer.valueOf(v15_1.getEndTime()), Integer.valueOf(v16_2)));
                                } else {
                                    v2_3.add(com.alightcreative.app.motion.scene.ExportProblem.ContentResTooHigh);
                                }
                            }
                            v8_8 = v17_0;
                        }
                    }
                    if (v15_1.getType().getHasNestedScene()) {
                        v5_9.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.plus(v9_4, v15_1), v15_1.getNestedScene()));
                    }
                    v10_11 = v16_2;
                    v13_4 = v17_0;
                }
            }
            if (v6_8 != null) {
            } else {
                int v1_18;
                fx.Enc.H(p18, new com.alightcreative.app.motion.scene.f());
                com.alightcreative.app.motion.scene.ExportProblem v0_15 = Math.max(((Math.min(p18.getWidth(), p18.getHeight()) * 9) / 16), Math.min(p18.getWidth(), p18.getHeight()));
                int v1_17 = com.alightcreative.app.motion.persist.xfY.INSTANCE;
                if (v8_8 == null) {
                    v1_18 = v1_17.getMaxRes();
                } else {
                    v1_18 = v1_17.getMaxResWithVideo();
                }
                if (v0_15 > v1_18) {
                    com.alightcreative.app.motion.scene.ExportProblem v0_16;
                    if (v8_8 == null) {
                        v0_16 = com.alightcreative.app.motion.scene.ExportProblem.SceneResTooHigh;
                    } else {
                        v0_16 = com.alightcreative.app.motion.scene.ExportProblem.SceneResTooHighWithVideo;
                    }
                    v2_3.add(v0_16);
                }
                com.alightcreative.app.motion.scene.ExportProblem v0_20 = kotlin.collections.CollectionsKt.sortedWith(v3_2, new com.alightcreative.app.motion.scene.SceneKt$checkCanExport$$inlined$sortedBy$1()).iterator();
                int v1_10 = 0;
                int v3_0 = 0;
                while (v0_20.hasNext()) {
                    v1_10 += ((Number) ((kotlin.Pair) v0_20.next()).getSecond()).intValue();
                    v3_0 = Math.max(v3_0, v1_10);
                }
                com.alightcreative.app.motion.scene.ExportProblem v0_24 = kotlin.collections.CollectionsKt.sortedWith(v4_2, new com.alightcreative.app.motion.scene.SceneKt$checkCanExport$$inlined$sortedBy$2()).iterator();
                int v1_9 = 0;
                int v4_1 = 0;
                while (v0_24.hasNext()) {
                    v1_9 += ((Number) ((kotlin.Pair) v0_24.next()).getSecond()).intValue();
                    v4_1 = Math.max(v4_1, v1_9);
                }
                int v1_8;
                com.alightcreative.app.motion.scene.ExportProblem v0_1 = com.alightcreative.app.motion.persist.xfY.INSTANCE;
                int v1_7 = ((Integer) kotlin.collections.CollectionsKt.maxOrNull(kotlin.collections.CollectionsKt.listOf(new Integer[] {Integer.valueOf((v0_1.getMaxLayers720() * 720)), Integer.valueOf((v0_1.getMaxLayers1080() * 1080)), Integer.valueOf((v0_1.getMaxLayers1440() * 1440)), Integer.valueOf((v0_1.getMaxLayers2160() * 2160))}))));
                if (v1_7 == 0) {
                    v1_8 = 0;
                } else {
                    v1_8 = v1_7.intValue();
                }
                com.alightcreative.app.motion.scene.ExportProblem v0_7 = ((Integer) kotlin.collections.CollectionsKt.maxOrNull(kotlin.collections.CollectionsKt.listOf(new Integer[] {Integer.valueOf(v0_1.getMaxLayers720()), Integer.valueOf(v0_1.getMaxLayers1080()), Integer.valueOf(v0_1.getMaxLayers1440()), Integer.valueOf(v0_1.getMaxLayers2160())}))));
                if (v0_7 != null) {
                    v7 = v0_7.intValue();
                }
                if ((v3_0 <= v1_8) && (v4_1 <= v7)) {
                    return v2_3;
                } else {
                    v2_3.add(com.alightcreative.app.motion.scene.ExportProblem.ContentTooHeavy);
                    return v2_3;
                }
            }
        }
    }

    private static final String checkCanExport$lambda$59()
    {
        return "PrepExport: checkCanExport forEachElementRecursive IN";
    }

    private static final String checkCanExport$lambda$61()
    {
        return "PrepExport: checkCanExport forEachElementRecursive OUT";
    }

    public static final boolean checkDrawingAtTime(com.alightcreative.app.motion.scene.Scene p6, int p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        int v7_1 = ((int) ((((long) p7) * ((long) 100000)) / ((long) p6.getFramesPerHundredSeconds())));
        java.util.ArrayList v0_2 = new java.util.ArrayList();
        com.alightcreative.app.motion.scene.Scene v1_1 = p6.getElements().iterator();
        while (v1_1.hasNext()) {
            com.alightcreative.app.motion.scene.Scene v2_3 = ((com.alightcreative.app.motion.scene.SceneElement) v1_1.next());
            com.alightcreative.app.motion.scene.Scene v3_4 = com.alightcreative.app.motion.scene.SceneElementKt.absoluteTimingInScene(v2_3, p6);
            com.alightcreative.app.motion.scene.SceneElementType v4_5 = v3_4.component1();
            com.alightcreative.app.motion.scene.Scene v3_5 = v3_4.component2();
            if ((v4_5 > v7_1) || ((v7_1 >= v3_5) || (v2_3.getType() != com.alightcreative.app.motion.scene.SceneElementType.Drawing))) {
                if (v2_3.getType().getHasNestedScene()) {
                    v0_2.add(v2_3.getNestedScene());
                }
            }
            if (v2_3 == null) {
                return 0;
            } else {
                return 1;
            }
        }
        while(true) {
            com.alightcreative.app.motion.scene.Scene v1_3 = ((com.alightcreative.app.motion.scene.Scene) fx.D.hUw(v0_2));
            if (v1_3 != null) {
                com.alightcreative.app.motion.scene.Scene v2_1 = v1_3.getElements();
                if (v2_1 != null) {
                    com.alightcreative.app.motion.scene.Scene v2_2 = v2_1.iterator();
                    while (v2_2.hasNext()) {
                        com.alightcreative.app.motion.scene.Scene v3_2 = ((com.alightcreative.app.motion.scene.SceneElement) v2_2.next());
                        com.alightcreative.app.motion.scene.SceneElementType v4_0 = com.alightcreative.app.motion.scene.SceneElementKt.absoluteTimingInScene(v3_2, p6);
                        com.alightcreative.app.motion.scene.SceneElementType v5_0 = v4_0.component1();
                        com.alightcreative.app.motion.scene.SceneElementType v4_1 = v4_0.component2();
                        if ((v5_0 > v7_1) || ((v7_1 >= v4_1) || (v3_2.getType() != com.alightcreative.app.motion.scene.SceneElementType.Drawing))) {
                            if (v3_2.getType().getHasNestedScene()) {
                                v0_2.add(v3_2.getNestedScene());
                            }
                        } else {
                            v2_3 = v3_2;
                        }
                    }
                }
            }
            if (v1_3 == null) {
                v2_3 = 0;
            }
        }
    }

    public static final java.util.List copyReplacingFirst(java.util.List p4, long p5, com.alightcreative.app.motion.scene.SceneElement p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "element");
        java.util.Iterator v0_2 = p4.iterator();
        int v1 = 0;
        while (v0_2.hasNext()) {
            if (((com.alightcreative.app.motion.scene.SceneElement) v0_2.next()).getId() != p5) {
                v1++;
            }
            if (v1 >= 0) {
                java.util.List v4_1 = kotlin.collections.CollectionsKt.toMutableList(p4);
                v4_1.set(v1, p7);
                return v4_1;
            } else {
                return p4;
            }
        }
        v1 = -1;
    }

    public static final com.alightcreative.app.motion.scene.Scene copyUpdatingElement(com.alightcreative.app.motion.scene.Scene p25, com.alightcreative.app.motion.scene.SceneElement p26)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p25, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p26, "element");
        int v2_5 = p25.getElements().iterator();
        while (v2_5.hasNext()) {
            int v3_1 = v2_5.next();
            if (((com.alightcreative.app.motion.scene.SceneElement) p26).getId() == p26.getId()) {
            }
            int v3_2 = ((com.alightcreative.app.motion.scene.SceneElement) v3_1);
            if (v3_2 == 0) {
                return p25;
            } else {
                return com.alightcreative.app.motion.scene.Scene.copy$default(p25, 0, 0, 0, 0, 0, 0, FKt.g.x(p25.getElements(), v3_2, p26), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1048511, 0);
            }
        }
        v3_1 = 0;
    }

    public static final com.alightcreative.app.motion.scene.Scene copyUpdatingElements(com.alightcreative.app.motion.scene.Scene p1, java.util.List p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "elements");
        java.util.Iterator v2_1 = p2.iterator();
        while (v2_1.hasNext()) {
            p1 = com.alightcreative.app.motion.scene.SceneKt.copyUpdatingElement(p1, ((com.alightcreative.app.motion.scene.SceneElement) v2_1.next()));
        }
        return p1;
    }

    public static final com.alightcreative.app.motion.scene.Scene copyUpdatingNestedScene(com.alightcreative.app.motion.scene.Scene p49, java.util.List p50, com.alightcreative.app.motion.scene.Scene p51)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p49, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p50, "nestedSceneIds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p51, "newScene");
        if (!p50.isEmpty()) {
            com.alightcreative.app.motion.scene.Scene v4_0 = com.alightcreative.app.motion.scene.SceneKt.elementById(p49, ((Long) kotlin.collections.CollectionsKt.first(p50)));
            if (v4_0 == null) {
                throw new IllegalStateException();
            } else {
                int v2_1;
                com.alightcreative.app.motion.scene.SceneElement v3_2;
                if (v4_0.getNestedScene().getReTimingMethod() != com.alightcreative.app.motion.scene.ReTimingMethod.OFF) {
                    v3_2 = com.alightcreative.app.motion.scene.SceneElement.copy$default(v4_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.SceneKt.copyUpdatingNestedScene(v4_0.getNestedScene(), kotlin.collections.CollectionsKt.drop(p50, 1), p51), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8388609, 127, 0);
                    v2_1 = v4_0;
                } else {
                    if (p50.size() != 1) {
                        int v2_5 = v4_0;
                        int v29_2 = com.alightcreative.app.motion.scene.SceneKt.copyUpdatingNestedScene(v2_5.getNestedScene(), kotlin.collections.CollectionsKt.drop(p50, 1), p51);
                        int v24_3 = v29_2.getTotalTime();
                        v4_0 = v2_5;
                        v3_2 = com.alightcreative.app.motion.scene.SceneElement.copy$default(v4_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v24_3, 0, 0, 0, 0, v29_2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8781825, 127, 0);
                        com.alightcreative.app.motion.scene.SceneElement v0_2 = com.alightcreative.app.motion.scene.TrimmingKt.trimEnd(v3_2, v24_3, 1);
                        if (v0_2 != null) {
                            v3_2 = v0_2;
                        }
                    } else {
                        com.alightcreative.app.motion.scene.SceneElement v0_5;
                        if (!p51.getElements().isEmpty()) {
                            v0_5 = p51.getTotalTime();
                        } else {
                            v0_5 = (v4_0.getEndTime() - v4_0.getStartTime());
                        }
                        com.alightcreative.app.motion.scene.Scene v22_1 = v0_5;
                        v2_1 = v4_0;
                        v3_2 = com.alightcreative.app.motion.scene.SceneElement.copy$default(v2_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v22_1, 0, 0, 0, 0, p51, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8781825, 127, 0);
                        com.alightcreative.app.motion.scene.SceneElement v0_10 = com.alightcreative.app.motion.scene.TrimmingKt.trimEnd(v3_2, v22_1, 1);
                        if (v0_10 != null) {
                            v3_2 = v0_10;
                        }
                    }
                }
                return com.alightcreative.app.motion.scene.Scene.copy$default(p49, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.SceneKt.copyReplacingFirst(p49.getElements(), v2_1.getId(), v3_2), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1048511, 0);
            }
        } else {
            return p51;
        }
    }

    public static synthetic kotlin.Unit db(com.alightcreative.app.motion.scene.SceneElement p0, int p1, int p2, java.util.List p3, hvJ.F p4)
    {
        return com.alightcreative.app.motion.scene.SceneKt.makeMediaComp$lambda$58$lambda$56$lambda$54(p0, p1, p2, p3, p4);
    }

    public static final kotlin.sequences.Sequence effectIdsSequence(com.alightcreative.app.motion.scene.Scene p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return kotlin.sequences.SequencesKt.sequence(new com.alightcreative.app.motion.scene.SceneKt$effectIdsSequence$1(p2, 0));
    }

    public static final com.alightcreative.app.motion.scene.SceneElement elementById(com.alightcreative.app.motion.scene.Scene p6, Long p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        Object v0_1 = 0;
        if (p7 != null) {
            java.util.Iterator v6_2 = p6.getElements().iterator();
            while (v6_2.hasNext()) {
                Object v1_1 = v6_2.next();
                if (((com.alightcreative.app.motion.scene.SceneElement) v1_1).getId() == p7.longValue()) {
                    v0_1 = v1_1;
                    break;
                }
            }
            return ((com.alightcreative.app.motion.scene.SceneElement) v0_1);
        } else {
            return 0;
        }
    }

    public static final com.alightcreative.app.motion.scene.Scene emptyScene(int p24, int p25)
    {
        return new com.alightcreative.app.motion.scene.Scene(0, 106, p24, p25, p24, p25, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 524225, 0);
    }

    public static synthetic com.alightcreative.app.motion.scene.Scene emptyScene$default(int p0, int p1, int p2, Object p3)
    {
        if ((p2 & 1) != 0) {
            p0 = 1280;
        }
        if ((p2 & 2) != 0) {
            p1 = 720;
        }
        return com.alightcreative.app.motion.scene.SceneKt.emptyScene(p0, p1);
    }

    public static final kotlin.sequences.Sequence externalMediaSequence(com.alightcreative.app.motion.scene.Scene p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return kotlin.sequences.SequencesKt.sequence(new com.alightcreative.app.motion.scene.SceneKt$externalMediaSequence$1(p2, 0));
    }

    public static final com.alightcreative.app.motion.scene.SceneElement findElementRecursive(com.alightcreative.app.motion.scene.Scene p4, kotlin.jvm.functions.Function1 p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "predicate");
        java.util.ArrayList v0_3 = new java.util.ArrayList();
        int v4_5 = p4.getElements().iterator();
        while (v4_5.hasNext()) {
            java.util.Iterator v1_4 = ((com.alightcreative.app.motion.scene.SceneElement) v4_5.next());
            if (!((Boolean) p5.invoke(v1_4)).booleanValue()) {
                if (v1_4.getType().getHasNestedScene()) {
                    v0_3.add(v1_4.getNestedScene());
                }
            } else {
                return v1_4;
            }
        }
        do {
            int v4_2 = ((com.alightcreative.app.motion.scene.Scene) fx.D.hUw(v0_3));
            if (v4_2 != 0) {
                java.util.Iterator v1_1 = v4_2.getElements();
                if (v1_1 != null) {
                    java.util.Iterator v1_2 = v1_1.iterator();
                    while (v1_2.hasNext()) {
                        com.alightcreative.app.motion.scene.Scene v2_2 = ((com.alightcreative.app.motion.scene.SceneElement) v1_2.next());
                        if (!((Boolean) p5.invoke(v2_2)).booleanValue()) {
                            if (v2_2.getType().getHasNestedScene()) {
                                v0_3.add(v2_2.getNestedScene());
                            }
                        } else {
                            return v2_2;
                        }
                    }
                }
            }
        } while(v4_2 != 0);
        return 0;
    }

    public static final void forEachElementRecursive(com.alightcreative.app.motion.scene.Scene p5, kotlin.jvm.functions.Function2 p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "action");
        java.util.ArrayList v0_3 = new java.util.ArrayList();
        kotlin.Pair v5_4 = p5.getElements().iterator();
        while (v5_4.hasNext()) {
            java.util.List v1_4 = ((com.alightcreative.app.motion.scene.SceneElement) v5_4.next());
            p6.invoke(kotlin.collections.CollectionsKt.emptyList(), v1_4);
            if (v1_4.getType().getHasNestedScene()) {
                v0_3.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.listOf(v1_4), v1_4.getNestedScene()));
            }
        }
        do {
            kotlin.Pair v5_2 = ((kotlin.Pair) fx.D.hUw(v0_3));
            if (v5_2 != null) {
                java.util.List v1_2 = ((java.util.List) v5_2.component1());
                java.util.Iterator v2_3 = ((com.alightcreative.app.motion.scene.Scene) v5_2.component2()).getElements().iterator();
                while (v2_3.hasNext()) {
                    kotlin.Pair v3_2 = ((com.alightcreative.app.motion.scene.SceneElement) v2_3.next());
                    p6.invoke(v1_2, v3_2);
                    if (v3_2.getType().getHasNestedScene()) {
                        v0_3.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.plus(v1_2, v3_2), v3_2.getNestedScene()));
                    }
                }
            }
        } while(v5_2 != null);
        return;
    }

    public static final void forEachElementRecursiveWithLens(com.alightcreative.app.motion.scene.Scene p14, kotlin.jvm.functions.Function1 p15)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "action");
        java.util.ArrayList v0_3 = new java.util.ArrayList();
        kotlin.Pair v14_4 = p14.getElements().iterator();
        int v2_0 = 0;
        while (v14_4.hasNext()) {
            java.util.Iterator v3_5 = v14_4.next();
            int v5_5 = (v2_0 + 1);
            if (v2_0 < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.util.Iterator v3_6 = ((com.alightcreative.app.motion.scene.SceneElement) v3_5);
            int v7_0 = com.alightcreative.app.motion.scene.SceneKt$forEachElementRecursiveWithLens$1$lens$1.INSTANCE;
            rVb.CU v8_2 = new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Scene), v7_0.getReturnType(), new rVb.Enc(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Scene), kotlin.reflect.full.KClassifiers.createType$default(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Scene), 0, 0, 0, 7, 0)), v7_0);
            kotlin.reflect.KClass v4_0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Scene);
            int v7_5 = ((kotlin.reflect.KTypeProjection) v8_2.x().getArguments().get(0)).getType();
            kotlin.jvm.internal.Intrinsics.checkNotNull(v7_5);
            com.alightcreative.app.motion.scene.SceneElement v6_2 = new rVb.CU(v4_0, v7_5, v8_2, v2_0);
            p15.invoke(v6_2);
            if (v3_6.getType().getHasNestedScene()) {
                v0_3.add(kotlin.TuplesKt.to(v6_2, v3_6.getNestedScene()));
            }
            v2_0 = v5_5;
        }
        do {
            kotlin.Pair v14_2 = ((kotlin.Pair) fx.D.hUw(v0_3));
            if (v14_2 != null) {
                int v2_6 = ((rVb.xfY) v14_2.component1());
                java.util.Iterator v3_4 = ((com.alightcreative.app.motion.scene.Scene) v14_2.component2()).getElements().iterator();
                int v5_0 = 0;
                while (v3_4.hasNext()) {
                    com.alightcreative.app.motion.scene.SceneElement v6_4 = v3_4.next();
                    int v7_6 = (v5_0 + 1);
                    if (v5_0 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    com.alightcreative.app.motion.scene.SceneElement v6_5 = ((com.alightcreative.app.motion.scene.SceneElement) v6_4);
                    rVb.CU v8_3 = com.alightcreative.app.motion.scene.SceneKt$forEachElementRecursiveWithLens$2$lens$1.INSTANCE;
                    rVb.CU v8_4 = com.alightcreative.app.motion.scene.SceneKt$forEachElementRecursiveWithLens$2$lens$2.INSTANCE;
                    rVb.qfV v10_3 = new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Scene), v8_4.getReturnType(), new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Scene), v8_3.getReturnType(), v2_6, v8_3), v8_4);
                    kotlin.reflect.KClass v9_3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Scene);
                    kotlin.reflect.KType v11_6 = ((kotlin.reflect.KTypeProjection) v10_3.x().getArguments().get(0)).getType();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(v11_6);
                    rVb.CU v8_6 = new rVb.CU(v9_3, v11_6, v10_3, v5_0);
                    p15.invoke(v8_6);
                    if (v6_5.getType().getHasNestedScene()) {
                        v0_3.add(kotlin.TuplesKt.to(v8_6, v6_5.getNestedScene()));
                    }
                    v5_0 = v7_6;
                }
            }
        } while(v14_2 != null);
        return;
    }

    public static final void forEachElementWithActiveVideoTrackAtFrame(com.alightcreative.app.motion.scene.Scene p7, int p8, kotlin.jvm.functions.Function1 p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "action");
        int v8_1 = ((int) ((((long) p8) * ((long) 100000)) / ((long) p7.getFramesPerHundredSeconds())));
        java.util.ArrayList v0_3 = new java.util.ArrayList();
        kotlin.Pair v1_1 = p7.getElements().iterator();
        while (v1_1.hasNext()) {
            kotlin.Pair v2_8 = ((com.alightcreative.app.motion.scene.SceneElement) v1_1.next());
            kotlin.collections.CollectionsKt.emptyList();
            android.net.Uri v3_11 = com.alightcreative.app.motion.scene.SceneElementKt.absoluteTimingInScene(v2_8, p7);
            kotlin.Pair v4_6 = v3_11.component1();
            android.net.Uri v3_12 = v3_11.component2();
            if ((v4_6 <= v8_1) && ((v8_1 < v3_12) && ((v2_8.getType().isRenderable()) && ((v2_8.getType().getHasFillVideo()) && ((v2_8.getFillType() == com.alightcreative.app.motion.scene.FillType.MEDIA) && (v2_8.getFillVideo() != null)))))) {
                p9.invoke(v2_8);
            }
            if (v2_8.getType().getHasNestedScene()) {
                v0_3.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.listOf(v2_8), v2_8.getNestedScene()));
            }
        }
        do {
            kotlin.Pair v1_3 = ((kotlin.Pair) fx.D.hUw(v0_3));
            if (v1_3 != null) {
                kotlin.Pair v2_5 = ((java.util.List) v1_3.component1());
                android.net.Uri v3_10 = ((com.alightcreative.app.motion.scene.Scene) v1_3.component2()).getElements().iterator();
                while (v3_10.hasNext()) {
                    kotlin.Pair v4_3 = ((com.alightcreative.app.motion.scene.SceneElement) v3_10.next());
                    android.net.Uri v5_0 = com.alightcreative.app.motion.scene.SceneElementKt.absoluteTimingInScene(v4_3, p7);
                    com.alightcreative.app.motion.scene.FillType v6_0 = v5_0.component1();
                    android.net.Uri v5_1 = v5_0.component2();
                    if ((v6_0 <= v8_1) && ((v8_1 < v5_1) && ((v4_3.getType().isRenderable()) && ((v4_3.getType().getHasFillVideo()) && ((v4_3.getFillType() == com.alightcreative.app.motion.scene.FillType.MEDIA) && (v4_3.getFillVideo() != null)))))) {
                        p9.invoke(v4_3);
                    }
                    if (v4_3.getType().getHasNestedScene()) {
                        v0_3.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.plus(v2_5, v4_3), v4_3.getNestedScene()));
                    }
                }
            }
        } while(v1_3 != null);
        return;
    }

    public static final int getDuration(com.alightcreative.app.motion.scene.Scene p4)
    {
        int v4_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        int v4_6 = p4.getElements().iterator();
        if (v4_6.hasNext()) {
            Object v0_1 = v4_6.next();
            if (v4_6.hasNext()) {
                int v1_3 = ((com.alightcreative.app.motion.scene.SceneElement) v0_1).getEndTime();
                do {
                    boolean v2_0 = v4_6.next();
                    int v3_2 = ((com.alightcreative.app.motion.scene.SceneElement) v2_0).getEndTime();
                    if (v1_3 < v3_2) {
                        v0_1 = v2_0;
                        v1_3 = v3_2;
                    }
                } while(v4_6.hasNext());
            }
            v4_2 = v0_1;
        } else {
            v4_2 = 0;
        }
        int v4_3 = ((com.alightcreative.app.motion.scene.SceneElement) v4_2);
        if (v4_3 == 0) {
            return 0;
        } else {
            return v4_3.getEndTime();
        }
    }

    public static final com.alightcreative.app.motion.scene.Scene getEMPTY_SCENE()
    {
        return com.alightcreative.app.motion.scene.SceneKt.EMPTY_SCENE;
    }

    public static final com.alightcreative.app.motion.scene.SceneSelection getEMPTY_SCENE_SELECTION()
    {
        return com.alightcreative.app.motion.scene.SceneKt.EMPTY_SCENE_SELECTION;
    }

    public static final com.alightcreative.app.motion.scene.Scene getEditingScene(com.alightcreative.app.motion.scene.SceneHolder p2, int p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        java.util.Iterator v3_1 = kotlin.collections.CollectionsKt.take(p2.getEditingNestedSceneIds(), p3);
        com.alightcreative.app.motion.scene.Scene v2_2 = p2.getRootScene();
        java.util.Iterator v3_2 = v3_1.iterator();
        while (v3_2.hasNext()) {
            long vtmp7 = ((Number) v3_2.next()).longValue();
            if (v2_2 != null) {
                com.alightcreative.app.motion.scene.Scene v2_1 = com.alightcreative.app.motion.scene.SceneKt.elementById(v2_2, Long.valueOf(vtmp7));
                if (v2_1 != null) {
                    v2_2 = v2_1.getNestedScene();
                }
            }
            v2_2 = 0;
        }
        return v2_2;
    }

    public static final boolean getHasActiveReTiming(com.alightcreative.app.motion.scene.SceneHolder p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        if (((!com.alightcreative.app.motion.scene.SceneKt.isEditingNestedScene(p2)) || (p2.getScene().getReTimingMethod() == com.alightcreative.app.motion.scene.ReTimingMethod.OFF)) && ((com.alightcreative.app.motion.scene.SceneKt.isEditingNestedScene(p2)) || (p2.getRootScene().getType() != com.alightcreative.app.motion.scene.SceneType.ELEMENT))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final boolean getHasExternalAudio(com.alightcreative.app.motion.scene.Scene p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "<this>");
        java.util.ArrayList v0_2 = new java.util.ArrayList();
        int v7_5 = p7.getElements().iterator();
        while (v7_5.hasNext()) {
            kotlin.Pair v1_3 = ((com.alightcreative.app.motion.scene.SceneElement) v7_5.next());
            kotlin.collections.CollectionsKt.emptyList();
            if ((v1_3.getType() != com.alightcreative.app.motion.scene.SceneElementType.Audio) || (kotlin.jvm.internal.Intrinsics.areEqual(v1_3.getSrc(), android.net.Uri.EMPTY))) {
                if (v1_3.getType().getHasNestedScene()) {
                    v0_2.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.listOf(v1_3), v1_3.getNestedScene()));
                }
            } else {
                return 1;
            }
        }
        do {
            int v7_2 = ((kotlin.Pair) fx.D.hUw(v0_2));
            if (v7_2 != 0) {
                kotlin.Pair v1_1 = ((java.util.List) v7_2.component1());
                java.util.Iterator v3_3 = ((com.alightcreative.app.motion.scene.Scene) v7_2.component2()).getElements().iterator();
                while (v3_3.hasNext()) {
                    kotlin.Pair v4_2 = ((com.alightcreative.app.motion.scene.SceneElement) v3_3.next());
                    if ((v4_2.getType() != com.alightcreative.app.motion.scene.SceneElementType.Audio) || (kotlin.jvm.internal.Intrinsics.areEqual(v4_2.getSrc(), android.net.Uri.EMPTY))) {
                        if (v4_2.getType().getHasNestedScene()) {
                            v0_2.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.plus(v1_1, v4_2), v4_2.getNestedScene()));
                        }
                    } else {
                        return 1;
                    }
                }
            }
        } while(v7_2 != 0);
        return 0;
    }

    public static final boolean getHasExternalMedia(com.alightcreative.app.motion.scene.Scene p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        java.util.ArrayList v0_2 = new java.util.ArrayList();
        int v6_5 = p6.getElements().iterator();
        while (v6_5.hasNext()) {
            kotlin.Pair v1_3 = ((com.alightcreative.app.motion.scene.SceneElement) v6_5.next());
            kotlin.collections.CollectionsKt.emptyList();
            if ((!v1_3.getType().getHasFillImage()) || (v1_3.getFillImage() == null)) {
                if ((!v1_3.getType().getHasFillVideo()) || (v1_3.getFillVideo() == null)) {
                    if (v1_3.getType().getHasNestedScene()) {
                        v0_2.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.listOf(v1_3), v1_3.getNestedScene()));
                    }
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        }
        do {
            int v6_2 = ((kotlin.Pair) fx.D.hUw(v0_2));
            if (v6_2 != 0) {
                kotlin.Pair v1_1 = ((java.util.List) v6_2.component1());
                android.net.Uri v3_3 = ((com.alightcreative.app.motion.scene.Scene) v6_2.component2()).getElements().iterator();
                while (v3_3.hasNext()) {
                    kotlin.Pair v4_2 = ((com.alightcreative.app.motion.scene.SceneElement) v3_3.next());
                    if ((!v4_2.getType().getHasFillImage()) || (v4_2.getFillImage() == null)) {
                        if ((!v4_2.getType().getHasFillVideo()) || (v4_2.getFillVideo() == null)) {
                            if (v4_2.getType().getHasNestedScene()) {
                                v0_2.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.plus(v1_1, v4_2), v4_2.getNestedScene()));
                            }
                        } else {
                            return 1;
                        }
                    } else {
                        return 1;
                    }
                }
            }
        } while(v6_2 != 0);
        return 0;
    }

    public static final boolean getHasLayerParenting(com.alightcreative.app.motion.scene.Scene p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        int v3_2 = p3.getElements().iterator();
        while (v3_2.hasNext()) {
            boolean v0_2 = ((com.alightcreative.app.motion.scene.SceneElement) v3_2.next());
            if (v0_2.getParent() == null) {
                if (com.alightcreative.app.motion.scene.SceneKt.getHasLayerParenting(v0_2.getNestedScene())) {
                    return 1;
                }
            } else {
                return 1;
            }
        }
        return 0;
    }

    public static final boolean getHasTrialEasingItem(com.alightcreative.app.motion.scene.Scene p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        int v4_2 = p4.getElements().iterator();
        while (v4_2.hasNext()) {
            boolean v0_2 = ((com.alightcreative.app.motion.scene.SceneElement) v4_2.next());
            java.util.Iterator v1_0 = com.alightcreative.app.motion.scene.SceneElementKt.getKeyableProperties(v0_2);
            boolean v2_1 = new java.util.ArrayList();
            java.util.Iterator v1_1 = v1_0.iterator();
            while (v1_1.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(v2_1, ((com.alightcreative.app.motion.scene.Keyable) v1_1.next()).getKeyframes());
            }
            java.util.Iterator v1_2 = v2_1.iterator();
            while (v1_2.hasNext()) {
                if (com.alightcreative.app.motion.easing.EasingKt.getAdvanced(((com.alightcreative.app.motion.scene.Keyframe) v1_2.next()).getEasing())) {
                    return 1;
                }
            }
            if (com.alightcreative.app.motion.scene.SceneKt.getHasTrialEasingItem(v0_2.getNestedScene())) {
                return 1;
            }
        }
        return 0;
    }

    public static final boolean getHasTrialEffectItem(com.alightcreative.app.motion.scene.Scene p5)
    {
        boolean v0 = 0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, kotlinx.serialization.kbj.OzAjBQLs.uuroy);
        int v5_3 = p5.getElements().iterator();
        while (v5_3.hasNext()) {
            boolean v0_1 = ((com.alightcreative.app.motion.scene.SceneElement) v5_3.next());
            java.util.Iterator v1_3 = ((Iterable) v0_1.getVisualEffects().values()).iterator();
            while (v1_3.hasNext()) {
                if (Vbv.vp.hUw().contains(((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) v1_3.next()).getId())) {
                    return 1;
                }
            }
            if (com.alightcreative.app.motion.scene.SceneKt.getHasTrialEffectItem(v0_1.getNestedScene())) {
                return 1;
            }
        }
        return 0;
    }

    public static final int getMAX_SUPPORTED_PROJECT_FORMAT_VERSION()
    {
        return Math.max(106, 108);
    }

    public static final Long getMainCameraId(com.alightcreative.app.motion.scene.Scene p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        long v0_3 = p5.getElements();
        int v1_2 = new java.util.ArrayList();
        long v0_4 = v0_3.iterator();
        while (v0_4.hasNext()) {
            int v2_1 = v0_4.next();
            if (((com.alightcreative.app.motion.scene.SceneElement) v2_1).getType() == com.alightcreative.app.motion.scene.SceneElementType.Camera) {
                v1_2.add(v2_1);
            }
        }
        long v0_1 = v1_2.iterator();
        int v2_0 = 2147483647;
        while (v0_1.hasNext()) {
            v2_0 = Math.min(p5.getElements().indexOf(((com.alightcreative.app.motion.scene.SceneElement) v0_1.next())), v2_0);
        }
        if (v2_0 == 2147483647) {
            return 0;
        } else {
            return Long.valueOf(((com.alightcreative.app.motion.scene.SceneElement) p5.getElements().get(v2_0)).getId());
        }
    }

    public static final java.util.Set getMultiSelectionElements(com.alightcreative.app.motion.scene.SceneSelection p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (p1.getDirectSelection() != null) {
            return kotlin.collections.SetsKt.emptySet();
        } else {
            return p1.getSelectedElements();
        }
    }

    public static final long getNextAvailableId(com.alightcreative.app.motion.scene.Scene p4)
    {
        long v4_1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        long v4_3 = p4.getElements().iterator();
        if (v4_3.hasNext()) {
            Long v0_4 = Long.valueOf(((com.alightcreative.app.motion.scene.SceneElement) v4_3.next()).getId());
            while (v4_3.hasNext()) {
                Long v1_4 = Long.valueOf(((com.alightcreative.app.motion.scene.SceneElement) v4_3.next()).getId());
                if (v0_4.compareTo(v1_4) < 0) {
                    v0_4 = v1_4;
                }
            }
            v4_1 = v0_4;
        } else {
            v4_1 = 0;
        }
        Long v0_5;
        if (v4_1 == 0) {
            v0_5 = 0;
        } else {
            v0_5 = v4_1.longValue();
        }
        Long v0_7 = (Math.max(com.alightcreative.app.motion.scene.SceneKt.lastUsedElementId, v0_5) + 1);
        com.alightcreative.app.motion.scene.SceneKt.lastUsedElementId = v0_7;
        return v0_7;
    }

    public static final java.util.Set getPremiumEffectIds(com.alightcreative.app.motion.scene.Scene p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        java.util.LinkedHashSet v0_2 = new java.util.LinkedHashSet();
        java.util.Iterator v6_2 = p6.getElements().iterator();
        while (v6_2.hasNext()) {
            Iterable v1_1 = ((com.alightcreative.app.motion.scene.SceneElement) v6_2.next());
            java.util.Iterator v2_3 = ((Iterable) v1_1.getVisualEffects().values()).iterator();
            while (v2_3.hasNext()) {
                String v3_2 = ((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) v2_3.next());
                if (Vbv.vp.hUw().contains(v3_2.getId())) {
                    v0_2.add(v3_2.getId());
                }
            }
            kotlin.collections.CollectionsKt.addAll(v0_2, ((Iterable) com.alightcreative.app.motion.scene.SceneKt.getPremiumEffectIds(v1_1.getNestedScene())));
        }
        return v0_2;
    }

    public static final com.alightcreative.app.motion.project.ProjectInfo$A getProjectInfo(com.alightcreative.app.motion.scene.Scene p17, java.io.File p18)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "projectFile");
        String v2_1 = kotlin.io.FilesKt.getNameWithoutExtension(p18);
        String v3 = p17.getTitle();
        int v4 = p17.getWidth();
        int v5 = p17.getHeight();
        int v6 = p17.getTotalTime();
        int v7 = p17.getFramesPerHundredSeconds();
        long v8 = p18.lastModified();
        long v10 = p18.length();
        com.alightcreative.app.motion.scene.SceneType v12 = p17.getType();
        java.util.Iterator v0_5 = ((Iterable) p17.getMediaInfo().values()).iterator();
        long v13 = 0;
        while (v0_5.hasNext()) {
            v13 += ((com.alightcreative.app.motion.scene.MediaUriInfo) v0_5.next()).getSize();
        }
        return new com.alightcreative.app.motion.project.ProjectInfo$A(v2_1, v3, v4, v5, v6, v7, v8, v10, v12, v13, p17.getFormatVersion(), p17.getTemplateLink());
    }

    public static final java.util.List getRecursiveElements(com.alightcreative.app.motion.scene.Scene p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        java.util.List v0_1 = kotlin.collections.CollectionsKt.createListBuilder();
        java.util.ArrayList v1_1 = new java.util.ArrayList();
        java.util.List v6_5 = p6.getElements().iterator();
        while (v6_5.hasNext()) {
            java.util.List v2_4 = ((com.alightcreative.app.motion.scene.SceneElement) v6_5.next());
            kotlin.collections.CollectionsKt.emptyList();
            v0_1.add(v2_4);
            if (v2_4.getType().getHasNestedScene()) {
                v1_1.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.listOf(v2_4), v2_4.getNestedScene()));
            }
        }
        do {
            java.util.List v6_2 = ((kotlin.Pair) fx.D.hUw(v1_1));
            if (v6_2 != null) {
                java.util.List v2_2 = ((java.util.List) v6_2.component1());
                java.util.Iterator v3_3 = ((com.alightcreative.app.motion.scene.Scene) v6_2.component2()).getElements().iterator();
                while (v3_3.hasNext()) {
                    kotlin.Pair v4_2 = ((com.alightcreative.app.motion.scene.SceneElement) v3_3.next());
                    v0_1.add(v4_2);
                    if (v4_2.getType().getHasNestedScene()) {
                        v1_1.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.plus(v2_2, v4_2), v4_2.getNestedScene()));
                    }
                }
            }
        } while(v6_2 != null);
        return kotlin.collections.CollectionsKt.build(v0_1);
    }

    public static final java.util.List getSTANDARD_FRAME_RATES()
    {
        return com.alightcreative.app.motion.scene.SceneKt.STANDARD_FRAME_RATES;
    }

    public static final java.util.List getSettableUserParams(com.alightcreative.app.motion.scene.Scene p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "<this>");
        java.util.Iterator v9_1 = p9.getElements();
        java.util.ArrayList v0_2 = new java.util.ArrayList();
        java.util.Iterator v9_2 = v9_1.iterator();
        while (v9_2.hasNext()) {
            java.util.List v3_2;
            com.alightcreative.app.motion.scene.SceneElement v1_1 = ((com.alightcreative.app.motion.scene.SceneElement) v9_2.next());
            if (com.alightcreative.app.motion.scene.SceneKt$WhenMappings.$EnumSwitchMapping$0[v1_1.getType().ordinal()] != 1) {
                v3_2 = com.alightcreative.app.motion.scene.SceneElementKt.getSettableUserParams(v1_1);
            } else {
                java.util.Iterator v2_4 = com.alightcreative.app.motion.scene.SceneKt.getSettableUserParams(v1_1.getNestedScene());
                v3_2 = new java.util.ArrayList();
                java.util.Iterator v2_5 = v2_4.iterator();
                while (v2_5.hasNext()) {
                    com.alightcreative.app.motion.scene.UserElementProperty v4_2 = ((com.alightcreative.app.motion.scene.UserElementProperty) v2_5.next());
                    int v5_2 = ((com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue) v1_1.getUserElementParamValues().get(v4_2.getId()));
                    if (v5_2 != 0) {
                        if (v5_2.getDataType() == com.alightcreative.app.motion.scene.userparam.DataType.STRING) {
                            if (!com.alightcreative.app.motion.scene.SceneElementKt.isValidUserElementTag(v5_2.getStringValue())) {
                                if (v5_2.getStringValue().length() == 0) {
                                    if (v4_2 != null) {
                                        v3_2.add(v4_2);
                                    }
                                }
                            } else {
                                v4_2 = com.alightcreative.app.motion.scene.SceneElementKt.getUserElementTextProperty(v5_2.getStringValue());
                            }
                        }
                        v4_2 = 0;
                    }
                }
            }
            kotlin.collections.CollectionsKt.addAll(v0_2, v3_2);
        }
        return v0_2;
    }

    public static final String getSha1(com.alightcreative.app.motion.scene.Scene p33)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p33, "<this>");
        String v0_1 = com.alightcreative.app.motion.scene.SceneKt.sceneHashes;
        String v2_2 = v0_1.get(p33);
        if (v2_2 == null) {
            String v2_1 = FKt.bV.w(com.alightcreative.app.motion.scene.serializer.SceneSerializerKt.serializeScene$default(com.alightcreative.app.motion.scene.Scene.copy$default(p33, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 917503, 0), 0, 0, 0, 0, 0, 38, 0));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_1, "sha1(...)");
            v2_2 = FKt.bV.FT(v2_1);
            v0_1.put(p33, v2_2);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_2, "getOrPut(...)");
        return ((String) v2_2);
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getSize(com.alightcreative.app.motion.scene.Scene p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(((float) p2.getWidth()), ((float) p2.getHeight()));
    }

    public static final int getThumbTime(com.alightcreative.app.motion.scene.Scene p5)
    {
        int v0_12;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        Object v1_4 = com.alightcreative.app.motion.scene.SceneType.ELEMENT;
        if ((p5.getType() != v1_4) || (p5.getThumbnailTime() < 0)) {
            if ((p5.getType() != v1_4) || ((p5.getReTimingInMark() == 0) || (p5.getReTimingOutMark() == 0))) {
                int v0_9;
                int v0_7 = kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(p5.getElements()), new com.alightcreative.app.motion.scene.MfS()).iterator();
                if (v0_7.hasNext()) {
                    Object v1_3 = v0_7.next();
                    if (v0_7.hasNext()) {
                        int v2_3 = ((com.alightcreative.app.motion.scene.SceneElement) v1_3).getEndTime();
                        do {
                            boolean v3_0 = v0_7.next();
                            int v4_2 = ((com.alightcreative.app.motion.scene.SceneElement) v3_0).getEndTime();
                            if (v2_3 < v4_2) {
                                v1_3 = v3_0;
                                v2_3 = v4_2;
                            }
                        } while(v0_7.hasNext());
                    }
                    v0_9 = v1_3;
                } else {
                    v0_9 = 0;
                }
                int v0_11;
                int v0_10 = ((com.alightcreative.app.motion.scene.SceneElement) v0_9);
                if (v0_10 == 0) {
                    v0_11 = 0;
                } else {
                    v0_11 = v0_10.getEndTime();
                }
                v0_12 = (v0_11 / 3);
            } else {
                v0_12 = ((p5.getReTimingInMark() + p5.getReTimingOutMark()) / 2);
            }
        } else {
            v0_12 = p5.getThumbnailTime();
        }
        fx.Enc.H(p5, new com.alightcreative.app.motion.scene.i2(v0_12, p5));
        return v0_12;
    }

    public static synthetic float hUw(com.alightcreative.app.motion.scene.SceneElement p0, java.util.List p1, long p2)
    {
        return com.alightcreative.app.motion.scene.SceneKt.makeMediaComp$lambda$58$lambda$56$lambda$54$lambda$53(p0, p1, p2);
    }

    public static final boolean hasAnyAudio(com.alightcreative.app.motion.scene.Scene p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        int v2_3 = p2.getElements();
        if ((v2_3 == 0) || (!v2_3.isEmpty())) {
            int v2_1 = v2_3.iterator();
            while (v2_1.hasNext()) {
                if (com.alightcreative.app.motion.scene.SceneElementKt.hasAnyAudio(((com.alightcreative.app.motion.scene.SceneElement) v2_1.next()))) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public static final boolean hasAnyVideo(com.alightcreative.app.motion.scene.Scene p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        int v2_3 = p2.getElements();
        if ((v2_3 == 0) || (!v2_3.isEmpty())) {
            int v2_1 = v2_3.iterator();
            while (v2_1.hasNext()) {
                if (com.alightcreative.app.motion.scene.SceneElementKt.hasAnyVideo(((com.alightcreative.app.motion.scene.SceneElement) v2_1.next()))) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public static final boolean hasCameraObject(com.alightcreative.app.motion.scene.Scene p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        int v3_3 = p3.getElements();
        if ((v3_3 == 0) || (!v3_3.isEmpty())) {
            int v3_1 = v3_3.iterator();
            while (v3_1.hasNext()) {
                if (((com.alightcreative.app.motion.scene.SceneElement) v3_1.next()).getType() == com.alightcreative.app.motion.scene.SceneElementType.Camera) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public static final boolean hasUniqueIds(com.alightcreative.app.motion.scene.Scene p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        boolean v0_5 = p4.getElements();
        int v1_2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_5, 10));
        boolean v0_1 = v0_5.iterator();
        while (v0_1.hasNext()) {
            v1_2.add(Long.valueOf(((com.alightcreative.app.motion.scene.SceneElement) v0_1.next()).getId()));
        }
        if (kotlin.collections.CollectionsKt.toSet(v1_2).size() == v1_2.size()) {
            int v4_1 = p4.getElements();
            if ((v4_1 == 0) || (!v4_1.isEmpty())) {
                int v4_2 = v4_1.iterator();
                while (v4_2.hasNext()) {
                    if (!com.alightcreative.app.motion.scene.SceneKt.hasUniqueIds(((com.alightcreative.app.motion.scene.SceneElement) v4_2.next()).getNestedScene())) {
                    }
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    public static final boolean isEditingNestedScene(com.alightcreative.app.motion.scene.SceneHolder p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if ((p1.getEditingNestedSceneIds().isEmpty()) && (p1.getScene() == p1.getRootScene())) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final boolean isNestedSceneValid(com.alightcreative.app.motion.scene.SceneHolder p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return 1;
    }

    public static synthetic boolean j(com.alightcreative.app.motion.scene.SceneElement p0, com.alightcreative.app.motion.scene.SceneElement p1)
    {
        return com.alightcreative.app.motion.scene.SceneKt.pathToElement$lambda$46(p0, p1);
    }

    public static synthetic String l()
    {
        return com.alightcreative.app.motion.scene.SceneKt.checkCanExport$lambda$61();
    }

    public static final hvJ.A makeMediaComp(com.alightcreative.app.motion.scene.Scene p2, FKt.Sq p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "contentResolver");
        int v0_2 = p2.getFramesPerHundredSeconds();
        fx.Enc.H(p2, new com.alightcreative.app.motion.scene.cJ());
        return hvJ.c.hUw(p3, new com.alightcreative.app.motion.scene.gR(v0_2, p2));
    }

    private static final String makeMediaComp$lambda$48()
    {
        return "makeMediaComp IN";
    }

    private static final kotlin.Unit makeMediaComp$lambda$58(int p13, com.alightcreative.app.motion.scene.Scene p14, hvJ.cY p15)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "$this$mediaComp");
        p15.uKP(Integer.valueOf(p13));
        fx.Enc.H(p15, new com.alightcreative.app.motion.scene.fS());
        kotlin.jvm.internal.Ref$IntRef v2_1 = new kotlin.jvm.internal.Ref$IntRef();
        v2_1.element = -1;
        java.util.ArrayList v0_3 = new java.util.ArrayList();
        kotlin.Pair v9_0 = p14.getElements().iterator();
        while (v9_0.hasNext()) {
            kotlin.Pair v1_5;
            com.alightcreative.app.motion.scene.Scene v3_1 = ((com.alightcreative.app.motion.scene.SceneElement) v9_0.next());
            java.util.List v11_0 = kotlin.collections.CollectionsKt.emptyList();
            v2_1.element = (v2_1.element + 1);
            if (v3_1.getType() != com.alightcreative.app.motion.scene.SceneElementType.Audio) {
                v1_5 = v3_1.getFillVideo();
            } else {
                v1_5 = v3_1.getSrc();
            }
            com.alightcreative.app.motion.scene.A2 v7_0 = v1_5;
            android.net.Uri v8_0 = v3_1.getFillVideo();
            kotlin.Pair v1_6 = v11_0.iterator();
            int v4_2 = 0;
            while (v1_6.hasNext()) {
                v4_2 += com.alightcreative.app.motion.scene.TimeKt.roundToFrame(((com.alightcreative.app.motion.scene.SceneElement) v1_6.next()).getStartTime(), p13);
            }
            kotlin.Pair v1_7 = com.alightcreative.app.motion.scene.SceneElementKt.absoluteTimingInScene(v3_1, p14);
            int v5_5 = v1_7.component1();
            int v6_0 = v1_7.component2();
            fx.Enc.H(p15, new com.alightcreative.app.motion.scene.A2(v2_1, v3_1, v4_2, v5_5, v6_0, v7_0, v8_0));
            if (v7_0 != null) {
                p15.R6(v7_0, new com.alightcreative.app.motion.scene.Ih(v3_1, v5_5, v6_0, v11_0));
            }
            if ((v8_0 != null) && (!v3_1.getHidden())) {
                p15.T(v8_0, new com.alightcreative.app.motion.scene.a9t(v3_1, v5_5, v6_0));
            }
            if (v3_1.getType().getHasNestedScene()) {
                v0_3.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.listOf(v3_1), v3_1.getNestedScene()));
            }
        }
        do {
            kotlin.Pair v9_2 = ((kotlin.Pair) fx.D.hUw(v0_3));
            if (v9_2 != null) {
                java.util.List v11_2 = ((java.util.List) v9_2.component1());
                java.util.Iterator v12 = ((com.alightcreative.app.motion.scene.Scene) v9_2.component2()).getElements().iterator();
                while (v12.hasNext()) {
                    kotlin.Pair v1_31;
                    com.alightcreative.app.motion.scene.Scene v3_4 = ((com.alightcreative.app.motion.scene.SceneElement) v12.next());
                    v2_1.element = (v2_1.element + 1);
                    if (v3_4.getType() != com.alightcreative.app.motion.scene.SceneElementType.Audio) {
                        v1_31 = v3_4.getFillVideo();
                    } else {
                        v1_31 = v3_4.getSrc();
                    }
                    com.alightcreative.app.motion.scene.A2 v7_1 = v1_31;
                    android.net.Uri v8_1 = v3_4.getFillVideo();
                    kotlin.Pair v1_32 = v11_2.iterator();
                    int v4_0 = 0;
                    while (v1_32.hasNext()) {
                        v4_0 += com.alightcreative.app.motion.scene.TimeKt.roundToFrame(((com.alightcreative.app.motion.scene.SceneElement) v1_32.next()).getStartTime(), p13);
                    }
                    kotlin.Pair v1_33 = com.alightcreative.app.motion.scene.SceneElementKt.absoluteTimingInScene(v3_4, p14);
                    int v5_11 = v1_33.component1();
                    int v6_1 = v1_33.component2();
                    fx.Enc.H(p15, new com.alightcreative.app.motion.scene.A2(v2_1, v3_4, v4_0, v5_11, v6_1, v7_1, v8_1));
                    if (v7_1 != null) {
                        p15.R6(v7_1, new com.alightcreative.app.motion.scene.Ih(v3_4, v5_11, v6_1, v11_2));
                    }
                    if ((v8_1 != null) && (!v3_4.getHidden())) {
                        p15.T(v8_1, new com.alightcreative.app.motion.scene.a9t(v3_4, v5_11, v6_1));
                    }
                    if (v3_4.getType().getHasNestedScene()) {
                        v0_3.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.plus(v11_2, v3_4), v3_4.getNestedScene()));
                    }
                }
            }
        } while(v9_2 != null);
        fx.Enc.H(p15, new com.alightcreative.app.motion.scene.EiH());
        return kotlin.Unit.INSTANCE;
    }

    private static final String makeMediaComp$lambda$58$lambda$49()
    {
        return "makeMediaComp before forEachElementRecursive";
    }

    private static final String makeMediaComp$lambda$58$lambda$56$lambda$51(kotlin.jvm.internal.Ref$IntRef p8, com.alightcreative.app.motion.scene.SceneElement p9, int p10, int p11, int p12, android.net.Uri p13, android.net.Uri p14)
    {
        String v8_1 = p8.element;
        long v0 = p9.getId();
        com.alightcreative.app.motion.scene.SceneElementType v2 = p9.getType();
        int v3 = p9.getStartTime();
        int v4 = p9.getEndTime();
        int v5 = p9.getInTime();
        int v9_1 = p9.getOutTime();
        StringBuilder v6_1 = new StringBuilder();
        v6_1.append("makeMediaComp[");
        v6_1.append(v8_1);
        v6_1.append("]: ID=");
        v6_1.append(v0);
        v6_1.append(" TYPE=");
        v6_1.append(v2);
        v6_1.append(" startTimeOffset=");
        v6_1.append(p10);
        v6_1.append(" absStart=");
        v6_1.append(p11);
        v6_1.append(" absEnd=");
        v6_1.append(p12);
        v6_1.append(" el=[");
        v6_1.append(v3);
        v6_1.append("->");
        v6_1.append(v4);
        v6_1.append("; orig=");
        v6_1.append(v5);
        v6_1.append("->");
        v6_1.append(v9_1);
        v6_1.append("] audioSrc=");
        v6_1.append(p13);
        v6_1.append(" videoSrc=");
        v6_1.append(p14);
        return v6_1.toString();
    }

    private static final kotlin.Unit makeMediaComp$lambda$58$lambda$56$lambda$54(com.alightcreative.app.motion.scene.SceneElement p4, int p5, int p6, java.util.List p7, hvJ.F p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "$this$audioTrack");
        p8.w(Long.valueOf((((long) -2147483648) + p4.getEngineState().getTrackId())));
        p8.E(Double.valueOf((((double) p5) / 4652007308841189376)));
        p8.db(Double.valueOf((((double) p6) / 4652007308841189376)));
        p8.cLW(Double.valueOf((((double) p4.getInTime()) / 4652007308841189376)));
        p8.pM1(Double.valueOf((((double) p4.getOutTime()) / 4652007308841189376)));
        p8.l(Float.valueOf(com.alightcreative.app.motion.scene.SceneElementKt.getAudioVideoSpeedFactor(p4)));
        p8.IB(new com.alightcreative.app.motion.scene.TX(p4, p7));
        return kotlin.Unit.INSTANCE;
    }

    private static final float makeMediaComp$lambda$58$lambda$56$lambda$54$lambda$53(com.alightcreative.app.motion.scene.SceneElement p4, java.util.List p5, long p6)
    {
        float v4_2 = ((Number) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(p4.getGain(), com.alightcreative.app.motion.scene.SceneElementKt.fractionalTime(p4, ((int) (((double) p6) / 4696837146684686336))))).floatValue();
        java.util.Iterator v5_1 = p5.iterator();
        float v0_1 = 1065353216;
        while (v5_1.hasNext()) {
            float v0_4 = ((com.alightcreative.app.motion.scene.SceneElement) v5_1.next());
            v0_1 = ((Number) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(v0_4.getGain(), com.alightcreative.app.motion.scene.SceneElementKt.fractionalTime(v0_4, ((int) (((float) p6) / 1232348160))))).floatValue();
        }
        return (v4_2 * v0_1);
    }

    private static final kotlin.Unit makeMediaComp$lambda$58$lambda$56$lambda$55(com.alightcreative.app.motion.scene.SceneElement p4, int p5, int p6, hvJ.F p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "$this$videoTrack");
        p7.w(Long.valueOf(p4.getEngineState().getTrackId()));
        p7.E(Double.valueOf((((double) p5) / 4652007308841189376)));
        p7.db(Double.valueOf((((double) p6) / 4652007308841189376)));
        p7.cLW(Double.valueOf((((double) p4.getInTime()) / 4652007308841189376)));
        p7.pM1(Double.valueOf((((double) p4.getOutTime()) / 4652007308841189376)));
        p7.l(Float.valueOf(com.alightcreative.app.motion.scene.SceneElementKt.getAudioVideoSpeedFactor(p4)));
        return kotlin.Unit.INSTANCE;
    }

    private static final String makeMediaComp$lambda$58$lambda$57()
    {
        return "makeMediaComp after forEachElementRecursive";
    }

    public static final String makeNumberedLabel(com.alightcreative.app.motion.scene.Scene p6, String p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "baseLabel");
        java.util.Iterator v0_1 = new kotlin.ranges.IntRange(1, 2147483647).iterator();
        while (v0_1.hasNext()) {
            int v1_3 = ((kotlin.collections.IntIterator) v0_1).nextInt();
            java.util.Iterator v2_0 = p6.getElements();
            if ((v2_0 == null) || (!v2_0.isEmpty())) {
                java.util.Iterator v2_1 = v2_0.iterator();
                while (v2_1.hasNext()) {
                    boolean v4_4 = ((com.alightcreative.app.motion.scene.SceneElement) v2_1.next()).getLabel();
                    String v5_1 = new StringBuilder();
                    v5_1.append(p7);
                    v5_1.append(" ");
                    v5_1.append(v1_3);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(v4_4, v5_1.toString())) {
                    }
                }
            }
            String v6_4 = new StringBuilder();
            v6_4.append(p7);
            v6_4.append(" ");
            v6_4.append(v1_3);
            return v6_4.toString();
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final com.alightcreative.app.motion.scene.SceneElement nestedElementById(com.alightcreative.app.motion.scene.Scene p8, Long p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "<this>");
        if (p9 != null) {
            java.util.ArrayList v1_1 = new java.util.ArrayList();
            com.alightcreative.app.motion.scene.Scene v8_1 = p8.getElements().iterator();
            while (v8_1.hasNext()) {
                java.util.Iterator v2_4 = ((com.alightcreative.app.motion.scene.SceneElement) v8_1.next());
                if (v2_4.getId() != p9.longValue()) {
                    if (v2_4.getType().getHasNestedScene()) {
                        v1_1.add(v2_4.getNestedScene());
                    }
                } else {
                    return v2_4;
                }
            }
            do {
                com.alightcreative.app.motion.scene.Scene v8_3 = ((com.alightcreative.app.motion.scene.Scene) fx.D.hUw(v1_1));
                if (v8_3 != null) {
                    java.util.Iterator v2_1 = v8_3.getElements();
                    if (v2_1 != null) {
                        java.util.Iterator v2_2 = v2_1.iterator();
                        while (v2_2.hasNext()) {
                            com.alightcreative.app.motion.scene.Scene v3_2 = ((com.alightcreative.app.motion.scene.SceneElement) v2_2.next());
                            if (v3_2.getId() != p9.longValue()) {
                                if (v3_2.getType().getHasNestedScene()) {
                                    v1_1.add(v3_2.getNestedScene());
                                }
                            } else {
                                return v3_2;
                            }
                        }
                    }
                }
            } while(v8_3 != null);
            return 0;
        } else {
            return 0;
        }
    }

    public static final com.alightcreative.app.motion.scene.SceneElement nestedElementByTrackId(com.alightcreative.app.motion.scene.Scene p8, Long p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "<this>");
        if (p9 != null) {
            java.util.ArrayList v1_1 = new java.util.ArrayList();
            com.alightcreative.app.motion.scene.Scene v8_1 = p8.getElements().iterator();
            while (v8_1.hasNext()) {
                java.util.Iterator v2_4 = ((com.alightcreative.app.motion.scene.SceneElement) v8_1.next());
                if (v2_4.getEngineState().getTrackId() != p9.longValue()) {
                    if (v2_4.getType().getHasNestedScene()) {
                        v1_1.add(v2_4.getNestedScene());
                    }
                } else {
                    return v2_4;
                }
            }
            do {
                com.alightcreative.app.motion.scene.Scene v8_3 = ((com.alightcreative.app.motion.scene.Scene) fx.D.hUw(v1_1));
                if (v8_3 != null) {
                    java.util.Iterator v2_1 = v8_3.getElements();
                    if (v2_1 != null) {
                        java.util.Iterator v2_2 = v2_1.iterator();
                        while (v2_2.hasNext()) {
                            com.alightcreative.app.motion.scene.Scene v3_2 = ((com.alightcreative.app.motion.scene.SceneElement) v2_2.next());
                            if (v3_2.getEngineState().getTrackId() != p9.longValue()) {
                                if (v3_2.getType().getHasNestedScene()) {
                                    v1_1.add(v3_2.getNestedScene());
                                }
                            } else {
                                return v3_2;
                            }
                        }
                    }
                }
            } while(v8_3 != null);
            return 0;
        } else {
            return 0;
        }
    }

    public static synthetic String ojl()
    {
        return com.alightcreative.app.motion.scene.SceneKt.uniquifyIds$lambda$26();
    }

    public static final com.alightcreative.app.motion.scene.SceneSelection overlaySelectionHint()
    {
        return new com.alightcreative.app.motion.scene.SceneSelection(kotlin.collections.SetsKt.emptySet(), 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 3836, 0);
    }

    public static synthetic kotlin.Unit pM1(com.alightcreative.app.motion.scene.SceneElement p0, int p1, int p2, hvJ.F p3)
    {
        return com.alightcreative.app.motion.scene.SceneKt.makeMediaComp$lambda$58$lambda$56$lambda$55(p0, p1, p2, p3);
    }

    public static final java.util.List pathToElement(com.alightcreative.app.motion.scene.Scene p2, com.alightcreative.app.motion.scene.SceneElement p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "element");
        return com.alightcreative.app.motion.scene.SceneKt.pathToElement$default(p2, 0, new com.alightcreative.app.motion.scene.Bn(p3), 1, 0);
    }

    public static final java.util.List pathToElement(com.alightcreative.app.motion.scene.Scene p2, java.util.List p3, kotlin.jvm.functions.Function1 p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "parentElements");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "predicate");
        java.util.List v2_4 = p2.getElements().iterator();
        while (v2_4.hasNext()) {
            java.util.List v0_3 = ((com.alightcreative.app.motion.scene.SceneElement) v2_4.next());
            if (!((Boolean) p4.invoke(v0_3)).booleanValue()) {
                if (!v0_3.getNestedScene().getElements().isEmpty()) {
                    java.util.List v0_6 = com.alightcreative.app.motion.scene.SceneKt.pathToElement(v0_3.getNestedScene(), kotlin.collections.CollectionsKt.plus(p3, v0_3), p4);
                    if (v0_6 != null) {
                        return v0_6;
                    }
                }
            } else {
                return kotlin.collections.CollectionsKt.plus(p3, v0_3);
            }
        }
        return 0;
    }

    public static synthetic java.util.List pathToElement$default(com.alightcreative.app.motion.scene.Scene p0, java.util.List p1, kotlin.jvm.functions.Function1 p2, int p3, Object p4)
    {
        if ((p3 & 1) != 0) {
            p1 = kotlin.collections.CollectionsKt.emptyList();
        }
        return com.alightcreative.app.motion.scene.SceneKt.pathToElement(p0, p1, p2);
    }

    private static final boolean pathToElement$lambda$46(com.alightcreative.app.motion.scene.SceneElement p1, com.alightcreative.app.motion.scene.SceneElement p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        if (p2 != p1) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final com.alightcreative.app.motion.scene.SceneElement prepElementForAdd(com.alightcreative.app.motion.scene.Scene p45, com.alightcreative.app.motion.scene.SceneElement p46)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p45, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p46, "element");
        if (p46.getId() > 0) {
            java.util.Iterator v0_1 = p45.getElements();
            if ((v0_1 == null) || (!v0_1.isEmpty())) {
                java.util.Iterator v0_2 = v0_1.iterator();
                while (v0_2.hasNext()) {
                    if (((com.alightcreative.app.motion.scene.SceneElement) v0_2.next()).getId() == p46.getId()) {
                    }
                }
                return p46;
            } else {
                return p46;
            }
        }
        return com.alightcreative.app.motion.scene.SceneElement.copy$default(p46, 0, 0, 0, com.alightcreative.app.motion.scene.SceneKt.getNextAvailableId(p45), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -9, 127, 0);
    }

    public static synthetic com.alightcreative.app.motion.scene.SceneElement q(kotlin.jvm.functions.Function1 p0, com.alightcreative.app.motion.scene.SceneElement p1)
    {
        return com.alightcreative.app.motion.scene.SceneKt.remapMediaUris$lambda$71$lambda$70(p0, p1);
    }

    public static final com.alightcreative.app.motion.scene.Scene remapMediaUris(com.alightcreative.app.motion.scene.Scene p17, kotlin.jvm.functions.Function1 p18)
    {
        Object v2_0 = p17;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "uriMapper");
        java.util.ArrayList v1_3 = new java.util.ArrayList();
        kotlin.Pair v3_0 = p17.getElements().iterator();
        com.alightcreative.app.motion.scene.SceneElement v5_0 = 0;
        while (v3_0.hasNext()) {
            java.util.Iterator v6_0 = v3_0.next();
            int v8_9 = (v5_0 + 1);
            if (v5_0 < null) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            java.util.Iterator v6_1 = ((com.alightcreative.app.motion.scene.SceneElement) v6_0);
            int v10_1 = com.alightcreative.app.motion.scene.SceneKt$forEachElementRecursiveWithLens$1$lens$1.INSTANCE;
            rVb.CU v11_3 = new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Scene), v10_1.getReturnType(), new rVb.Enc(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Scene), kotlin.reflect.full.KClassifiers.createType$default(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Scene), 0, 0, 0, 7, 0)), v10_1);
            android.net.Uri v7_0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Scene);
            int v10_6 = ((kotlin.reflect.KTypeProjection) v11_3.x().getArguments().get(0)).getType();
            kotlin.jvm.internal.Intrinsics.checkNotNull(v10_6);
            com.alightcreative.app.motion.scene.SceneElement v9_3 = new rVb.CU(v7_0, v10_6, v11_3, v5_0);
            com.alightcreative.app.motion.scene.SceneElement v5_2 = ((com.alightcreative.app.motion.scene.SceneElement) v9_3.get(v2_0));
            if ((v5_2.getType().getHasFillImage()) && (v5_2.getFillImage() != null)) {
                v2_0 = v9_3.cD(v2_0, new com.alightcreative.app.motion.scene.I8(p18));
            }
            if ((v5_2.getType().getHasFillVideo()) && (v5_2.getFillVideo() != null)) {
                v2_0 = v9_3.cD(v2_0, new com.alightcreative.app.motion.scene.Db(p18));
            }
            if ((v5_2.getType() == com.alightcreative.app.motion.scene.SceneElementType.Audio) && (!kotlin.jvm.internal.Intrinsics.areEqual(v5_2.getSrc(), android.net.Uri.EMPTY))) {
                v2_0 = v9_3.cD(v2_0, new com.alightcreative.app.motion.scene.CN(p18));
            }
            if (v6_1.getType().getHasNestedScene()) {
                v1_3.add(kotlin.TuplesKt.to(v9_3, v6_1.getNestedScene()));
            }
            v5_0 = v8_9;
        }
        do {
            kotlin.Pair v3_2 = ((kotlin.Pair) fx.D.hUw(v1_3));
            if (v3_2 != null) {
                com.alightcreative.app.motion.scene.SceneElement v5_12 = ((rVb.xfY) v3_2.component1());
                java.util.Iterator v6_6 = ((com.alightcreative.app.motion.scene.Scene) v3_2.component2()).getElements().iterator();
                int v8_8 = 0;
                while (v6_6.hasNext()) {
                    com.alightcreative.app.motion.scene.SceneElement v9_5 = v6_6.next();
                    int v10_8 = (v8_8 + 1);
                    if (v8_8 < 0) {
                        kotlin.collections.CollectionsKt.throwIndexOverflow();
                    }
                    com.alightcreative.app.motion.scene.SceneElement v9_6 = ((com.alightcreative.app.motion.scene.SceneElement) v9_5);
                    rVb.CU v11_4 = com.alightcreative.app.motion.scene.SceneKt$forEachElementRecursiveWithLens$2$lens$1.INSTANCE;
                    rVb.CU v11_5 = com.alightcreative.app.motion.scene.SceneKt$forEachElementRecursiveWithLens$2$lens$2.INSTANCE;
                    com.alightcreative.app.motion.scene.SceneElementType v13_5 = new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Scene), v11_5.getReturnType(), new rVb.qfV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Scene), v11_4.getReturnType(), v5_12, v11_4), v11_5);
                    android.net.Uri v12_6 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.app.motion.scene.Scene);
                    kotlin.reflect.KType v14_7 = ((kotlin.reflect.KTypeProjection) v13_5.x().getArguments().get(0)).getType();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(v14_7);
                    rVb.CU v11_7 = new rVb.CU(v12_6, v14_7, v13_5, v8_8);
                    int v8_11 = ((com.alightcreative.app.motion.scene.SceneElement) v11_7.get(v2_0));
                    if ((v8_11.getType().getHasFillImage()) && (v8_11.getFillImage() != null)) {
                        v2_0 = v11_7.cD(v2_0, new com.alightcreative.app.motion.scene.I8(p18));
                    }
                    if ((v8_11.getType().getHasFillVideo()) && (v8_11.getFillVideo() != null)) {
                        v2_0 = v11_7.cD(v2_0, new com.alightcreative.app.motion.scene.Db(p18));
                    }
                    if ((v8_11.getType() == com.alightcreative.app.motion.scene.SceneElementType.Audio) && (!kotlin.jvm.internal.Intrinsics.areEqual(v8_11.getSrc(), android.net.Uri.EMPTY))) {
                        v2_0 = v11_7.cD(v2_0, new com.alightcreative.app.motion.scene.CN(p18));
                    }
                    if (v9_6.getType().getHasNestedScene()) {
                        v1_3.add(kotlin.TuplesKt.to(v11_7, v9_6.getNestedScene()));
                    }
                    v8_8 = v10_8;
                }
            }
        } while(v3_2 != null);
        return ((com.alightcreative.app.motion.scene.Scene) v2_0);
    }

    private static final com.alightcreative.app.motion.scene.SceneElement remapMediaUris$lambda$71$lambda$68(kotlin.jvm.functions.Function1 p45, com.alightcreative.app.motion.scene.SceneElement p46)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p46, "it");
        com.alightcreative.app.motion.scene.SceneElement v0_1 = p46.getFillImage();
        kotlin.jvm.internal.Intrinsics.checkNotNull(v0_1);
        return com.alightcreative.app.motion.scene.SceneElement.copy$default(p46, 0, 0, 0, 0, 0, 0, 0, 0, ((android.net.Uri) p45.invoke(v0_1)), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -257, 127, 0);
    }

    private static final com.alightcreative.app.motion.scene.SceneElement remapMediaUris$lambda$71$lambda$69(kotlin.jvm.functions.Function1 p45, com.alightcreative.app.motion.scene.SceneElement p46)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p46, "it");
        com.alightcreative.app.motion.scene.SceneElement v0_1 = p46.getFillVideo();
        kotlin.jvm.internal.Intrinsics.checkNotNull(v0_1);
        return com.alightcreative.app.motion.scene.SceneElement.copy$default(p46, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((android.net.Uri) p45.invoke(v0_1)), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -513, 127, 0);
    }

    private static final com.alightcreative.app.motion.scene.SceneElement remapMediaUris$lambda$71$lambda$70(kotlin.jvm.functions.Function1 p45, com.alightcreative.app.motion.scene.SceneElement p46)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p46, "it");
        return com.alightcreative.app.motion.scene.SceneElement.copy$default(p46, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ((android.net.Uri) p45.invoke(p46.getSrc())), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -16385, 127, 0);
    }

    public static final com.alightcreative.app.motion.scene.SceneSelection selectionHint(com.alightcreative.app.motion.scene.SceneElement p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "hintElement");
        return new com.alightcreative.app.motion.scene.SceneSelection(kotlin.collections.SetsKt.emptySet(), 0, 0, 0, 0, 0, 0, Long.valueOf(p16.getId()), 0, 0, 0, 0, 3964, 0);
    }

    public static final com.alightcreative.app.motion.scene.SceneSelection singleElementSelection(long p15)
    {
        return new com.alightcreative.app.motion.scene.SceneSelection(kotlin.collections.SetsKt.setOf(Long.valueOf(p15)), Long.valueOf(p15), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4092, 0);
    }

    public static final com.alightcreative.app.motion.scene.SceneSelection singleElementSelection(com.alightcreative.app.motion.scene.SceneElement p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "selectedElement");
        return new com.alightcreative.app.motion.scene.SceneSelection(kotlin.collections.SetsKt.setOf(Long.valueOf(p16.getId())), Long.valueOf(p16.getId()), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4092, 0);
    }

    public static final com.alightcreative.app.motion.scene.FrameStats statsForFrame(com.alightcreative.app.motion.scene.Scene p16, int p17)
    {
        com.alightcreative.app.motion.scene.Scene v0_0 = p16;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "<this>");
        int v2_1 = ((int) ((((long) p17) * ((long) 100000)) / ((long) p16.getFramesPerHundredSeconds())));
        java.util.ArrayList v3_1 = new java.util.ArrayList();
        java.util.ArrayList v4_2 = new java.util.ArrayList();
        kotlin.Pair v5_1 = p16.getElements().iterator();
        int v6 = 0;
        int v7 = 0;
        while (v5_1.hasNext()) {
            kotlin.Pair v8_1 = ((com.alightcreative.app.motion.scene.SceneElement) v5_1.next());
            kotlin.collections.CollectionsKt.emptyList();
            java.util.Iterator v11_0 = com.alightcreative.app.motion.scene.SceneElementKt.absoluteTimingInScene(v8_1, p16);
            String v12_1 = v11_0.component1();
            java.util.Iterator v11_1 = v11_0.component2();
            if ((v12_1 <= v2_1) && (v2_1 < v11_1)) {
                if ((v8_1.getType().isRenderable()) && ((v8_1.getType().getHasFillVideo()) && ((v8_1.getFillType() == com.alightcreative.app.motion.scene.FillType.MEDIA) && (v8_1.getFillVideo() != null)))) {
                    v6++;
                }
                if (com.alightcreative.app.motion.scene.SceneElementKt.hasAnyAudio(v8_1)) {
                    v7++;
                }
                if (v8_1.getType().getHasVisualEffects()) {
                    java.util.Iterator v11_12 = v8_1.getVisualEffectOrder().iterator();
                    while (v11_12.hasNext()) {
                        String v12_9 = ((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) v8_1.getVisualEffects().get(Long.valueOf(((Number) v11_12.next()).longValue())));
                        if (v12_9 != null) {
                            v3_1.add(FKt.bV.db(v12_9.getId(), "com.alightcreative.effects.", "."));
                        }
                    }
                }
            }
            if (v8_1.getType().getHasNestedScene()) {
                v4_2.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.listOf(v8_1), v8_1.getNestedScene()));
            }
        }
        while(true) {
            kotlin.Pair v5_3 = ((kotlin.Pair) fx.D.hUw(v4_2));
            if (v5_3 != null) {
                kotlin.Pair v8_6 = ((java.util.List) v5_3.component1());
                java.util.Iterator v11_16 = ((com.alightcreative.app.motion.scene.Scene) v5_3.component2()).getElements().iterator();
                while (v11_16.hasNext()) {
                    String v12_14 = ((com.alightcreative.app.motion.scene.SceneElement) v11_16.next());
                    java.util.Iterator v13_0 = com.alightcreative.app.motion.scene.SceneElementKt.absoluteTimingInScene(v12_14, v0_0);
                    Long v14_5 = v13_0.component1();
                    java.util.Iterator v13_1 = v13_0.component2();
                    if ((v14_5 <= v2_1) && (v2_1 < v13_1)) {
                        if ((v12_14.getType().isRenderable()) && ((v12_14.getType().getHasFillVideo()) && ((v12_14.getFillType() == com.alightcreative.app.motion.scene.FillType.MEDIA) && (v12_14.getFillVideo() != null)))) {
                            v6++;
                        }
                        if (com.alightcreative.app.motion.scene.SceneElementKt.hasAnyAudio(v12_14)) {
                            v7++;
                        }
                        if (v12_14.getType().getHasVisualEffects()) {
                            java.util.Iterator v13_12 = v12_14.getVisualEffectOrder().iterator();
                            while (v13_12.hasNext()) {
                                com.alightcreative.app.motion.scene.Scene v0_5 = ((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) v12_14.getVisualEffects().get(Long.valueOf(((Number) v13_12.next()).longValue())));
                                if (v0_5 != null) {
                                    v3_1.add(FKt.bV.db(v0_5.getId(), "com.alightcreative.effects.", "."));
                                }
                            }
                        }
                    }
                    if (v12_14.getType().getHasNestedScene()) {
                        v4_2.add(kotlin.TuplesKt.to(kotlin.collections.CollectionsKt.plus(v8_6, v12_14), v12_14.getNestedScene()));
                    }
                    v0_0 = p16;
                }
            }
            if (v5_3 == null) {
                break;
            }
            v0_0 = p16;
        }
        return new com.alightcreative.app.motion.scene.FrameStats(p17, v6, v7, v3_1);
    }

    public static synthetic String uKP()
    {
        return com.alightcreative.app.motion.scene.SceneKt.makeMediaComp$lambda$58$lambda$57();
    }

    public static final com.alightcreative.app.motion.scene.Scene uniquifyIds(com.alightcreative.app.motion.scene.Scene p53)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p53, "<this>");
        java.util.Iterator v1_5 = p53.getElements();
        Long v2_5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v1_5, 10));
        java.util.Iterator v1_1 = v1_5.iterator();
        while (v1_1.hasNext()) {
            v2_5.add(Long.valueOf(((com.alightcreative.app.motion.scene.SceneElement) v1_1.next()).getId()));
        }
        java.util.Iterator v1_2 = kotlin.collections.CollectionsKt.toSet(v2_5);
        Long v2_1 = new java.util.LinkedHashSet();
        com.alightcreative.app.motion.scene.SceneElement v3_3 = p53.getElements().iterator();
        java.util.List v4_0 = p53;
        while(true) {
            long v6_2 = 1;
            if (!v3_3.hasNext()) {
                break;
            }
            com.alightcreative.app.motion.scene.Scene v8_2 = ((com.alightcreative.app.motion.scene.SceneElement) v3_3.next());
            if (!v2_1.contains(Long.valueOf(v8_2.getId()))) {
                v2_1.add(Long.valueOf(v8_2.getId()));
            } else {
                int v9_2;
                Long v5_8 = ((Long) kotlin.collections.CollectionsKt.maxOrNull(((Iterable) kotlin.collections.SetsKt.plus(v1_2, v2_1))));
                if (v5_8 == null) {
                    v9_2 = 0;
                } else {
                    v9_2 = v5_8.longValue();
                }
                int v12_0 = (v9_2 + 1);
                fx.Enc.H(p53, new com.alightcreative.app.motion.scene.AF(v8_2, v12_0, v2_1));
                int v28_2 = v12_0;
                v4_0 = com.alightcreative.app.motion.scene.Scene.copy$default(v4_0, 0, 0, 0, 0, 0, 0, FKt.g.x(v4_0.getElements(), v8_2, com.alightcreative.app.motion.scene.SceneElement.copy$default(v8_2, 0, 0, 0, v12_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -9, 127, 0)), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1048511, 0);
                v2_1.add(Long.valueOf(v28_2));
            }
        }
        java.util.Iterator v1_4 = v4_0.getElements().iterator();
        com.alightcreative.app.motion.scene.Scene v8_0 = v4_0;
        while (v1_4.hasNext()) {
            int v9_6 = ((com.alightcreative.app.motion.scene.SceneElement) v1_4.next());
            if (v9_6.getType().getHasNestedScene()) {
                com.alightcreative.app.motion.scene.SceneElement v3_13 = com.alightcreative.app.motion.scene.SceneKt.uniquifyIds(v9_6.getNestedScene());
                if (v3_13 != v9_6.getNestedScene()) {
                    fx.Enc.H(p53, new com.alightcreative.app.motion.scene.pQK());
                    v8_0 = com.alightcreative.app.motion.scene.Scene.copy$default(v8_0, 0, 0, 0, 0, 0, 0, FKt.g.x(v8_0.getElements(), v9_6, com.alightcreative.app.motion.scene.SceneElement.copy$default(v9_6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v3_13, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8388609, 127, 0)), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1048511, 0);
                }
            }
        }
        Long v2_3 = ((Long) kotlin.collections.CollectionsKt.maxOrNull(v2_1));
        if (v2_3 != null) {
            v6_2 = v2_3.longValue();
        }
        com.alightcreative.app.motion.scene.SceneKt.lastUsedElementId = Math.max(com.alightcreative.app.motion.scene.SceneKt.lastUsedElementId, v6_2);
        return v8_0;
    }

    private static final String uniquifyIds$lambda$25(com.alightcreative.app.motion.scene.SceneElement p11, long p12, java.util.Set p14)
    {
        String v0_0 = p11.getId();
        String v11_1 = kotlin.collections.CollectionsKt.joinToString$default(((Iterable) p14), ",", 0, 0, 0, 0, 0, 62, 0);
        StringBuilder v14_2 = new StringBuilder();
        v14_2.append("Replace with Unique ID : ");
        v14_2.append(v0_0);
        v14_2.append(" -> ");
        v14_2.append(p12);
        v14_2.append(" (used=");
        v14_2.append(v11_1);
        v14_2.append(")");
        return v14_2.toString();
    }

    private static final String uniquifyIds$lambda$26()
    {
        return "Replace nested scene with Unique IDs";
    }

    public static synthetic kotlin.Unit w(int p0, com.alightcreative.app.motion.scene.Scene p1, hvJ.cY p2)
    {
        return com.alightcreative.app.motion.scene.SceneKt.makeMediaComp$lambda$58(p0, p1, p2);
    }

    private static final com.alightcreative.app.motion.scene.Scene withUpdatedTrimmingFor(com.alightcreative.app.motion.scene.Scene p3, long p4)
    {
        com.alightcreative.app.motion.scene.SceneElement v4_2 = com.alightcreative.app.motion.scene.SceneKt.elementById(p3, Long.valueOf(p4));
        if ((v4_2 != null) && (v4_2.getNestedScene().getReTimingMethod() == com.alightcreative.app.motion.scene.ReTimingMethod.OFF)) {
            com.alightcreative.app.motion.scene.SceneElement v4_3 = com.alightcreative.app.motion.scene.TrimmingKt.trimEnd$default(v4_2, (v4_2.getStartTime() + kotlin.ranges.RangesKt.coerceAtLeast(kotlin.math.MathKt.roundToInt((((float) com.alightcreative.app.motion.scene.SceneKt.getDuration(v4_2.getNestedScene())) / v4_2.getNestedSceneSpeedFactor())), 1)), 0, 2, 0);
            if (v4_3 != null) {
                return com.alightcreative.app.motion.scene.SceneKt.copyUpdatingElement(p3, v4_3);
            }
        }
        return p3;
    }

    public static synthetic boolean x(com.alightcreative.app.motion.scene.SceneElement p0)
    {
        return com.alightcreative.app.motion.scene.SceneKt._get_thumbTime_$lambda$0(p0);
    }
}
