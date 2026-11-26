package com.alightcreative.app.motion.activities.audiobrowser;
public final class AudioBrowserActivity extends com.alightcreative.app.motion.activities.audiobrowser.h {
    public static final int K;
    private static final java.util.concurrent.ExecutorService R;
    public static final com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$xfY f;
    private boolean E;
    private nVu.A H;
    private String Q;
    private com.alightcreative.app.motion.persist.xfY$xfY T;
    public TV.n X;
    private java.util.List ah;
    private final FKt.Xo ak;
    private jn.K db;
    private com.alightcreative.app.motion.activities.audiobrowser.xfY l;
    private String w;

    static AudioBrowserActivity()
    {
        com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity.f = new com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$xfY(0);
        com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity.K = 8;
        com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity.R = java.util.concurrent.Executors.newSingleThreadExecutor();
        return;
    }

    public AudioBrowserActivity()
    {
        this.T = com.alightcreative.app.motion.persist.xfY.INSTANCE.getAudioBrowserMode();
        this.db = jn.K.H;
        this.w = "";
        this.ah = kotlin.collections.CollectionsKt.emptyList();
        this.ak = new FKt.Xo(com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity.R, new p4.XSt(this)).X(new p4.V(this));
        return;
    }

    private final void If(com.alightcreative.app.motion.persist.xfY$xfY p17)
    {
        androidx.fragment.app.eWj v0_1 = this.getSupportFragmentManager().FT();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_1, "beginTransaction(...)");
        com.alightcreative.app.motion.activities.audiobrowser.xfY v1_4 = this.getSupportFragmentManager();
        String v2_3 = p17.name();
        com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity v3_1 = new StringBuilder();
        v3_1.append("AudioBucketFragment:");
        v3_1.append(v2_3);
        com.alightcreative.app.motion.activities.audiobrowser.xfY v1_0 = v1_4.hP(v3_1.toString());
        if (v1_0 != null) {
            v0_1.IB(v1_0);
        }
        v0_1.X(0);
        com.alightcreative.app.motion.activities.audiobrowser.xfY v1_2 = com.alightcreative.app.motion.activities.audiobrowser.xfY$xfY.j(com.alightcreative.app.motion.activities.audiobrowser.xfY.l, p17.name(), 0, 0, 0, 0, 0, 0, 0, 254, 0);
        String v2_1 = p17.name();
        com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity v3_3 = new StringBuilder();
        v3_3.append("AudioBucketFragment:");
        v3_3.append(v2_1);
        String v2_2 = v3_3.toString();
        this.l = v1_2;
        XQ4.xfY.j(v0_1).cD(2131362888, v1_2, v2_2).X(v2_2).uKP();
        return;
    }

    private static final w9w.a9t Jm(android.view.View p4, w9w.a9t p5)
    {
        int v0_1 = p5.q(w9w.a9t$Zv9.ojl());
        kotlin.jvm.internal.Intrinsics.checkNotNull(p4);
        p4.setPadding(p4.getPaddingLeft(), v0_1.j, p4.getPaddingRight(), v0_1.x);
        return p5;
    }

    public static synthetic java.util.Collection QR(com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity p0)
    {
        return com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity.g2(p0);
    }

    public static synthetic w9w.a9t S(android.view.View p0, w9w.a9t p1)
    {
        return com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity.Jm(p0, p1);
    }

    public static synthetic void ST5(com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity.cak(p0, p1);
        return;
    }

    public static synthetic kotlin.Unit Z(com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity p0)
    {
        return com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity.cKj(p0);
    }

    public static synthetic kotlin.Unit Zk(com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity p0)
    {
        return com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity.uM(p0);
    }

    public static synthetic void b9Y(com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity.e4D(p0, p1);
        return;
    }

    private static final kotlin.Unit cKj(com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity p0)
    {
        p0.g();
        return kotlin.Unit.INSTANCE;
    }

    private static final void cak(com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity p7, android.view.View p8)
    {
        FKt.h.cLW(p7, X7.xfY$A.X, 0, 0, new p4.cY(p7), 6, 0);
        return;
    }

    private static final void e4D(com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity p0, android.view.View p1)
    {
        p0.finish();
        return;
    }

    private final void g()
    {
        androidx.recyclerview.widget.LinearLayoutManager v3_0 = 0;
        if (!fx.c.cLW(this)) {
            FKt.Xo v0_1 = this.H;
            if (v0_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_1 = 0;
            }
            v0_1.x.setVisibility(8);
            FKt.Xo v0_3 = this.H;
            if (v0_3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_3 = 0;
            }
            v0_3.ojl.setVisibility(0);
            FKt.Xo v0_5 = this.H;
            if (v0_5 != null) {
                v3_0 = v0_5;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v3_0.j.setVisibility(0);
            return;
        } else {
            this.E = 1;
            android.widget.Button v5_0 = this.H;
            if (v5_0 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v5_0 = 0;
            }
            v5_0.x.setVisibility(0);
            android.widget.Button v5_2 = this.H;
            if (v5_2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v5_2 = 0;
            }
            v5_2.ojl.setVisibility(8);
            android.widget.Button v5_4 = this.H;
            if (v5_4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v5_4 = 0;
            }
            v5_4.j.setVisibility(8);
            androidx.recyclerview.widget.RecyclerView v1_1 = this.H;
            if (v1_1 != null) {
                v3_0 = v1_1;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            androidx.recyclerview.widget.RecyclerView v1_2 = v3_0.x;
            androidx.recyclerview.widget.LinearLayoutManager v3_2 = new androidx.recyclerview.widget.LinearLayoutManager(this, 1, 0);
            v3_2.ss(10);
            v3_2.rPC(1);
            v1_2.setLayoutManager(v3_2);
            this.ak.x();
            return;
        }
    }

    private static final java.util.Collection g2(com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity p55)
    {
        if (!fx.c.cLW(p55)) {
            return kotlin.collections.CollectionsKt.emptyList();
        } else {
            if (!p55.E) {
                java.util.Set v1_0 = p55.db;
                if (v1_0 == jn.K.H) {
                    java.util.Set v1_8 = com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$A.$EnumSwitchMapping$1[p55.T.ordinal()];
                    if (v1_8 == 1) {
                        java.util.Set v1_16 = new com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$cY(tI.uZ5.X(p55, kotlin.collections.SetsKt.setOf(tI.nn.X), tI.s.cD.hUw()));
                        java.util.Collection v0_11 = new java.util.LinkedHashMap();
                        long v4_10 = v1_16.sourceIterator();
                        while (v4_10.hasNext()) {
                            Object v8_7;
                            tI.Gc v5_18 = v4_10.next();
                            Object v6_4 = v1_16.keyOf(v5_18);
                            Object v7_4 = v0_11.get(v6_4);
                            if ((v7_4 != null) || (v0_11.containsKey(v6_4))) {
                                v8_7 = 0;
                            } else {
                                v8_7 = 1;
                            }
                            tI.Gc v5_1;
                            int v10_11 = ((tI.Gc) v7_4);
                            if (v8_7 == null) {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(v10_11);
                                v5_1 = tI.Gc.j(v10_11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (v10_11.ojl() + 1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217535, 0);
                            } else {
                                v5_1 = tI.Gc.j(((tI.Gc) v5_18), 0, tI.nn.T, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217533, 0);
                            }
                            v0_11.put(v6_4, v5_1);
                        }
                        return v0_11.values();
                    } else {
                        if (v1_8 == 2) {
                            java.util.Set v1_4 = new com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$c(tI.uZ5.X(p55, kotlin.collections.SetsKt.setOf(tI.nn.X), tI.s.cD.hUw()));
                            java.util.Collection v0_3 = new java.util.LinkedHashMap();
                            long v4_3 = v1_4.sourceIterator();
                            while (v4_3.hasNext()) {
                                Object v8_1;
                                tI.Gc v5_3 = v4_3.next();
                                Object v6_1 = v1_4.keyOf(v5_3);
                                Object v7_1 = v0_3.get(v6_1);
                                if ((v7_1 != null) || (v0_3.containsKey(v6_1))) {
                                    v8_1 = 0;
                                } else {
                                    v8_1 = 1;
                                }
                                tI.Gc v5_6;
                                int v10_2 = ((tI.Gc) v7_1);
                                if (v8_1 == null) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(v10_2);
                                    v5_6 = tI.Gc.j(v10_2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (v10_2.ojl() + 1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217535, 0);
                                } else {
                                    v5_6 = tI.Gc.j(((tI.Gc) v5_3), 0, tI.nn.T, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217533, 0);
                                }
                                v0_3.put(v6_1, v5_6);
                            }
                            return v0_3.values();
                        } else {
                            if (v1_8 == 3) {
                                java.util.Set v1_14 = new com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$K(tI.uZ5.X(p55, kotlin.collections.SetsKt.setOf(tI.nn.X), tI.s.cD.hUw()));
                                java.util.Collection v0_7 = new java.util.LinkedHashMap();
                                long v4_8 = v1_14.sourceIterator();
                                while (v4_8.hasNext()) {
                                    Object v8_3;
                                    tI.Gc v5_8 = v4_8.next();
                                    Object v6_2 = v1_14.keyOf(v5_8);
                                    Object v7_2 = v0_7.get(v6_2);
                                    if ((v7_2 != null) || (v0_7.containsKey(v6_2))) {
                                        v8_3 = 0;
                                    } else {
                                        v8_3 = 1;
                                    }
                                    tI.Gc v5_11;
                                    int v10_5 = ((tI.Gc) v7_2);
                                    if (v8_3 == null) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNull(v10_5);
                                        v5_11 = tI.Gc.j(v10_5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (v10_5.ojl() + 1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217535, 0);
                                    } else {
                                        v5_11 = tI.Gc.j(((tI.Gc) v5_8), 0, tI.nn.T, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217533, 0);
                                    }
                                    v0_7.put(v6_2, v5_11);
                                }
                                return v0_7.values();
                            } else {
                                if (v1_8 == 4) {
                                    java.util.Set v1_19 = tI.uZ5.X(p55, kotlin.collections.SetsKt.setOf(tI.nn.X), tI.s.cD.hUw());
                                    tI.uZ5.x(v1_19, p55);
                                    java.util.Set v1_21 = new com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$qfV(kotlin.collections.CollectionsKt.sortedWith(v1_19, new com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$F()));
                                    java.util.Collection v0_16 = new java.util.LinkedHashMap();
                                    long v4_14 = v1_21.sourceIterator();
                                    while (v4_14.hasNext()) {
                                        Object v8_5;
                                        tI.Gc v5_14 = v4_14.next();
                                        Object v6_3 = v1_21.keyOf(v5_14);
                                        Object v7_3 = v0_16.get(v6_3);
                                        if ((v7_3 != null) || (v0_16.containsKey(v6_3))) {
                                            v8_5 = 0;
                                        } else {
                                            v8_5 = 1;
                                        }
                                        tI.Gc v5_19;
                                        tI.Gc v9_5 = ((tI.Gc) v5_14);
                                        int v10_8 = ((tI.Gc) v7_3);
                                        ((Number) v6_3).longValue();
                                        if (v8_5 == null) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(v10_8);
                                            v5_19 = tI.Gc.j(v10_8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (v10_8.ojl() + 1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217535, 0);
                                        } else {
                                            v5_19 = tI.Gc.j(v9_5, 0, tI.nn.T, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217533, 0);
                                        }
                                        v0_16.put(v6_3, v5_19);
                                    }
                                    return v0_16.values();
                                } else {
                                    if (v1_8 != 5) {
                                        throw new kotlin.NoWhenBranchMatchedException();
                                    } else {
                                        return tI.uZ5.X(p55, kotlin.collections.SetsKt.setOf(tI.nn.X), tI.s.cD.cD());
                                    }
                                }
                            }
                        }
                    }
                } else {
                    java.util.Set v1_25 = com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$A.$EnumSwitchMapping$0[v1_0.ordinal()];
                    if (v1_25 == 1) {
                        java.util.Set v1_28 = tI.uZ5.X(p55, kotlin.collections.SetsKt.setOf(tI.nn.X), tI.s.cD.cD());
                        tI.uZ5.x(v1_28, p55);
                        tI.s v2_7 = new java.util.ArrayList();
                        java.util.Set v1_29 = v1_28.iterator();
                        while (v1_29.hasNext()) {
                            Object v3_1 = v1_29.next();
                            if (((tI.Gc) p55).E() == Long.parseLong(p55.w)) {
                                v2_7.add(v3_1);
                            }
                        }
                        return v2_7;
                    } else {
                        if (v1_25 == 2) {
                            java.util.Set v1_32 = tI.uZ5.X(p55, kotlin.collections.SetsKt.setOf(tI.nn.X), tI.s.cD.cD());
                            tI.s v2_11 = new java.util.ArrayList();
                            java.util.Set v1_33 = v1_32.iterator();
                            while (v1_33.hasNext()) {
                                Object v3_3 = v1_33.next();
                                if (kotlin.jvm.internal.Intrinsics.areEqual(((tI.Gc) v3_3).q(), p55.w)) {
                                    v2_11.add(v3_3);
                                }
                            }
                            return v2_11;
                        } else {
                            if (v1_25 == 3) {
                                java.util.Set v1_36 = tI.uZ5.X(p55, kotlin.collections.SetsKt.setOf(tI.nn.X), tI.s.cD.cD());
                                tI.s v2_15 = new java.util.ArrayList();
                                java.util.Set v1_37 = v1_36.iterator();
                                while (v1_37.hasNext()) {
                                    Object v3_5 = v1_37.next();
                                    if (((tI.Gc) p55).R6() == Long.parseLong(p55.w)) {
                                        v2_15.add(v3_5);
                                    }
                                }
                                return v2_15;
                            } else {
                                java.util.Set v1_40 = tI.uZ5.X(p55, kotlin.collections.SetsKt.setOf(tI.nn.X), tI.s.cD.hUw());
                                tI.s v2_19 = new java.util.ArrayList();
                                java.util.Set v1_41 = v1_40.iterator();
                                while (v1_41.hasNext()) {
                                    Object v3_7 = v1_41.next();
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((tI.Gc) v3_7).X(), p55.w)) {
                                        v2_19.add(v3_7);
                                    }
                                }
                                return v2_19;
                            }
                        }
                    }
                }
            } else {
                java.util.Set v1_42 = tI.nn.X;
                tI.Gc v5_23 = tI.s.cD;
                long v4_33 = tI.uZ5.X(p55, kotlin.collections.SetsKt.setOf(v1_42), v5_23.cD()).size();
                tI.Gc v5_27 = new com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$h(tI.uZ5.X(p55, kotlin.collections.SetsKt.setOf(v1_42), v5_23.hUw()));
                java.util.Set v1_46 = new java.util.LinkedHashMap();
                Object v6_10 = v5_27.sourceIterator();
                while (v6_10.hasNext()) {
                    int v10_17;
                    Object v7_21 = v6_10.next();
                    Object v8_18 = v5_27.keyOf(v7_21);
                    tI.Gc v9_25 = v1_46.get(v8_18);
                    if ((v9_25 != null) || (v1_46.containsKey(v8_18))) {
                        v10_17 = 0;
                    } else {
                        v10_17 = 1;
                    }
                    Object v7_0;
                    int v12_16 = ((tI.Gc) v9_25);
                    if (v10_17 == 0) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v12_16);
                        v7_0 = tI.Gc.j(v12_16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (v12_16.ojl() + 1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217535, 0);
                    } else {
                        v7_0 = tI.Gc.j(((tI.Gc) v7_21), 0, tI.nn.T, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217533, 0);
                    }
                    v1_46.put(v8_18, v7_0);
                }
                java.util.Set v1_48 = v1_46.values().size();
                Object v6_14 = new com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$XSt(tI.uZ5.X(p55, kotlin.collections.SetsKt.setOf(tI.nn.X), tI.s.cD.hUw()));
                tI.Gc v5_32 = new java.util.LinkedHashMap();
                Object v7_6 = v6_14.sourceIterator();
                while (v7_6.hasNext()) {
                    int v11_13;
                    Object v8_14 = v7_6.next();
                    tI.Gc v9_24 = v6_14.keyOf(v8_14);
                    int v10_15 = v5_32.get(v9_24);
                    if ((v10_15 != 0) || (v5_32.containsKey(v9_24))) {
                        v11_13 = 0;
                    } else {
                        v11_13 = 1;
                    }
                    Object v8_17;
                    long v13_8 = ((tI.Gc) v10_15);
                    if (v11_13 == 0) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v13_8);
                        v8_17 = tI.Gc.j(v13_8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (v13_8.ojl() + 1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217535, 0);
                    } else {
                        v8_17 = tI.Gc.j(((tI.Gc) v8_14), 0, tI.nn.T, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217533, 0);
                    }
                    v5_32.put(v9_24, v8_17);
                }
                tI.Gc v5_34 = v5_32.values().size();
                Object v6_17 = tI.uZ5.X(p55, kotlin.collections.SetsKt.setOf(tI.nn.X), tI.s.cD.hUw());
                tI.uZ5.x(v6_17, p55);
                Object v7_12 = new com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$V(kotlin.collections.CollectionsKt.sortedWith(v6_17, new com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$Enc()));
                Object v6_20 = new java.util.LinkedHashMap();
                Object v8_9 = v7_12.sourceIterator();
                while (v8_9.hasNext()) {
                    int v12_12;
                    tI.Gc v9_19 = v8_9.next();
                    int v10_14 = v7_12.keyOf(v9_19);
                    int v11_11 = v6_20.get(v10_14);
                    if ((v11_11 != 0) || (v6_20.containsKey(v10_14))) {
                        v12_12 = 0;
                    } else {
                        v12_12 = 1;
                    }
                    tI.Gc v9_23;
                    long v13_6 = ((tI.Gc) v9_19);
                    int v14_6 = ((tI.Gc) v11_11);
                    ((Number) v10_14).longValue();
                    if (v12_12 == 0) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v14_6);
                        v9_23 = tI.Gc.j(v14_6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (v14_6.ojl() + 1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217535, 0);
                    } else {
                        v9_23 = tI.Gc.j(v13_6, 0, tI.nn.T, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217533, 0);
                    }
                    v6_20.put(v10_14, v9_23);
                }
                tI.s v2_21 = v6_20.values().size();
                Object v7_14 = p55.getResources().getString(2132017366);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_14, "getString(...)");
                tI.Gc v9_10 = p55.getResources().getDrawable(2131231625, p55.getTheme());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v9_10, "getDrawable(...)");
                Object v3_9 = new p4.hz8(com.alightcreative.app.motion.persist.xfY$xfY.j, v7_14, v9_10, v4_33);
                Object v7_16 = p55.getResources().getString(2132017360);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_16, "getString(...)");
                tI.Gc v9_13 = p55.getResources().getDrawable(2131231622, p55.getTheme());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v9_13, "getDrawable(...)");
                long v4_35 = new p4.hz8(com.alightcreative.app.motion.persist.xfY$xfY.cD, v7_16, v9_13, v1_48);
                Object v7_18 = p55.getResources().getString(2132017361);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_18, "getString(...)");
                tI.Gc v9_16 = p55.getResources().getDrawable(2131231623, p55.getTheme());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v9_16, "getDrawable(...)");
                java.util.Set v1_51 = new p4.hz8(com.alightcreative.app.motion.persist.xfY$xfY.x, v7_18, v9_16, v5_34);
                Object v7_20 = p55.getResources().getString(2132017364);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_20, "getString(...)");
                Object v8_13 = p55.getResources().getDrawable(2131231624, p55.getTheme());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v8_13, "getDrawable(...)");
                p55.ah = kotlin.collections.CollectionsKt.listOf(new p4.hz8[] {v3_9, v4_35, v1_51, new p4.hz8(com.alightcreative.app.motion.persist.xfY$xfY.q, v7_20, v8_13, v2_21)}));
                return kotlin.collections.CollectionsKt.emptyList();
            }
        }
    }

    public static final synthetic void hsj(com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity p0, com.alightcreative.app.motion.persist.xfY$xfY p1)
    {
        p0.If(p1);
        return;
    }

    private static final kotlin.Unit lU(com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity p8, java.util.Collection p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "mediaList");
        nVu.A v3 = 0;
        if (!fx.c.cLW(p8)) {
            androidx.fragment.app.FragmentManager v9_1 = p8.H;
            if (v9_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v9_1 = 0;
            }
            v9_1.x.setVisibility(8);
            androidx.fragment.app.FragmentManager v9_3 = p8.H;
            if (v9_3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v9_3 = 0;
            }
            v9_3.ojl.setVisibility(0);
            androidx.fragment.app.FragmentManager v9_5 = p8.H;
            if (v9_5 != null) {
                v3 = v9_5;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v3.j.setVisibility(0);
            while (p8.getSupportFragmentManager().hsj() > 0) {
                p8.getSupportFragmentManager().CB();
            }
        } else {
            if (p8.E) {
                android.widget.Button v0_3 = p8.H;
                if (v0_3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v0_3 = 0;
                }
                v0_3.x.setAdapter(new com.alightcreative.app.motion.activities.audiobrowser.CU(p8.ah, new com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$CU(p8)));
                p8.E = 0;
            }
            android.widget.Button v0_5 = p8.H;
            if (v0_5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_5 = 0;
            }
            v0_5.x.setVisibility(0);
            android.widget.Button v0_7 = p8.H;
            if (v0_7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_7 = 0;
            }
            v0_7.ojl.setVisibility(8);
            android.widget.Button v0_9 = p8.H;
            if (v0_9 != null) {
                v3 = v0_9;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v3.j.setVisibility(8);
            kotlin.Unit v8_1 = p8.l;
            if (v8_1 != null) {
                v8_1.e0E(kotlin.collections.CollectionsKt.toMutableList(p9));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit tEh(com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity p0, java.util.Collection p1)
    {
        return com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity.lU(p0, p1);
    }

    private static final kotlin.Unit uM(com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity p0)
    {
        p0.g();
        return kotlin.Unit.INSTANCE;
    }

    public final TV.n N()
    {
        int v0_0 = this.X;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
            return 0;
        } else {
            return v0_0;
        }
    }

    protected void onActivityResult(int p4, int p5, android.content.Intent p6)
    {
        if (p4 != 2) {
            super.onActivityResult(p4, p5, p6);
            return;
        } else {
            if (p5 == -1) {
                int v1_0;
                android.content.Intent v5_3 = 0;
                if (p6 == null) {
                    v1_0 = 0;
                } else {
                    v1_0 = ((android.net.Uri) p6.getParcelableExtra("selectedUri"));
                }
                if (p6 != null) {
                    android.content.Intent v6_1 = p6.getStringExtra("mediaType");
                    if (v6_1 != null) {
                        v5_3 = ((tI.nn) FKt.nn.hUw(tI.nn.values(), v6_1));
                    }
                }
                if ((v1_0 != 0) && (v5_3 != null)) {
                    this.setResult(-1, new android.content.Intent().putExtra("selectedUri", v1_0).putExtra("mediaType", v5_3.name()));
                    this.finish();
                }
            }
            return;
        }
    }

    protected void onCreate(android.os.Bundle p4)
    {
        super.onCreate(p4);
        android.widget.Button v4_1 = nVu.A.cD(this.getLayoutInflater());
        this.H = v4_1;
        nVu.A v1 = 0;
        if (v4_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v4_1 = 0;
        }
        this.setContentView(v4_1.j());
        android.widget.Button v4_3 = this.H;
        if (v4_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v4_3 = 0;
        }
        android.widget.Button v4_7;
        w9w.Xo.If(v4_3.j(), new p4.xfY());
        android.widget.Button v4_6 = this.getIntent();
        if (v4_6 == null) {
            v4_7 = 0;
        } else {
            v4_7 = v4_6.getStringExtra("projectId");
        }
        this.Q = v4_7;
        android.widget.Button v4_8 = this.H;
        if (v4_8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v4_8 = 0;
        }
        v4_8.cD.setOnClickListener(new p4.A(this));
        android.widget.Button v4_10 = this.H;
        if (v4_10 != null) {
            v1 = v4_10;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1.j.setOnClickListener(new p4.CU(this));
        this.g();
        return;
    }

    public void onRequestPermissionsResult(int p11, String[] p12, int[] p13)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "grantResults");
        if (p11 != 1) {
            super.onRequestPermissionsResult(p11, p12, p13);
            return;
        } else {
            String v11_2;
            TV.n v1 = this.N();
            if (p13.length != 0) {
                v11_2 = 0;
            } else {
                v11_2 = 1;
            }
            if ((v11_2 != null) || (p13[0] != 0)) {
                int v2 = 0;
            } else {
                v2 = 1;
            }
            int v13_1;
            String v11_4 = this.Q;
            if (v11_4 == null) {
                v13_1 = 0;
            } else {
                v13_1 = new String[1];
                v13_1[0] = v11_4;
            }
            FKt.vp.cD(v1, v2, oqG.c.cD, v13_1, 0, 0, new p4.h(this), 48, 0);
            return;
        }
    }

    public final void uq6(com.alightcreative.app.motion.persist.xfY$xfY p2, jn.K p3, String p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "browserMode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "bucketMode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "bucketId");
        this.T = p2;
        this.db = p3;
        this.w = p4;
        this.ak.x();
        return;
    }

    public final void z2f(tI.Gc p21)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p21, "media");
        androidx.fragment.app.eWj v1_14 = com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$A.$EnumSwitchMapping$2[p21.ak().ordinal()];
        if ((v1_14 != 1) && (v1_14 != 2)) {
            if (v1_14 == 3) {
                this.setResult(-1, new android.content.Intent().putExtra("selectedUri", p21.f()).putExtra("mediaType", p21.ak().name()));
                this.finish();
            } else {
                if (v1_14 != 4) {
                    throw new kotlin.NoWhenBranchMatchedException();
                } else {
                    com.alightcreative.app.motion.activities.audiobrowser.xfY v2_2;
                    androidx.fragment.app.eWj v1_11 = this.getSupportFragmentManager().FT();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_11, "beginTransaction(...)");
                    String v6_6 = com.alightcreative.app.motion.activities.audiobrowser.AudioBrowserActivity$A.$EnumSwitchMapping$1[this.T.ordinal()];
                    if (v6_6 == 2) {
                        String v3_9 = p21.R6();
                        com.alightcreative.app.motion.persist.xfY$xfY v5_7 = this.getSupportFragmentManager();
                        String v6_8 = new StringBuilder();
                        v6_8.append("AudioBucketFragment:");
                        v6_8.append(v3_9);
                        com.alightcreative.app.motion.persist.xfY$xfY v5_8 = v5_7.hP(v6_8.toString());
                        if (v5_8 != null) {
                            v1_11.IB(v5_8);
                        }
                        int v15_3;
                        String v10_3 = this.T.name();
                        int v14_3 = Long.valueOf(v3_9);
                        String v3_11 = p21.cD();
                        if (v3_11 != null) {
                            v15_3 = v3_11;
                        } else {
                            com.alightcreative.app.motion.activities.audiobrowser.xfY v2_9 = p21.Q();
                            if (v2_9 != null) {
                                v15_3 = v2_9;
                            } else {
                                v15_3 = "?";
                            }
                        }
                        v2_2 = com.alightcreative.app.motion.activities.audiobrowser.xfY$xfY.j(com.alightcreative.app.motion.activities.audiobrowser.xfY.l, v10_3, 0, 0, 0, v14_3, v15_3, 0, 0, 206, 0);
                    } else {
                        if (v6_6 == 3) {
                            int v13_3 = p21.q();
                            if (v13_3 != 0) {
                                com.alightcreative.app.motion.activities.audiobrowser.xfY v2_10 = this.getSupportFragmentManager();
                                String v3_13 = new StringBuilder();
                                v3_13.append("AudioBucketFragment:");
                                v3_13.append(v13_3);
                                com.alightcreative.app.motion.activities.audiobrowser.xfY v2_0 = v2_10.hP(v3_13.toString());
                                if (v2_0 != null) {
                                    v1_11.IB(v2_0);
                                }
                                v2_2 = com.alightcreative.app.motion.activities.audiobrowser.xfY$xfY.j(com.alightcreative.app.motion.activities.audiobrowser.xfY.l, this.T.name(), 0, 0, v13_3, 0, 0, 0, 0, 246, 0);
                            } else {
                                return;
                            }
                        } else {
                            if (v6_6 == 4) {
                                String v3_3 = p21.E();
                                com.alightcreative.app.motion.persist.xfY$xfY v5_0 = this.getSupportFragmentManager();
                                String v6_1 = new StringBuilder();
                                v6_1.append("AudioBucketFragment:");
                                v6_1.append(v3_3);
                                com.alightcreative.app.motion.persist.xfY$xfY v5_1 = v5_0.hP(v6_1.toString());
                                if (v5_1 != null) {
                                    v1_11.IB(v5_1);
                                }
                                int v12_1;
                                String v10_1 = this.T.name();
                                int v11_1 = Long.valueOf(v3_3);
                                com.alightcreative.app.motion.activities.audiobrowser.xfY v2_3 = p21.IB();
                                if (v2_3 != null) {
                                    v12_1 = v2_3;
                                } else {
                                    v12_1 = "?";
                                }
                                v2_2 = com.alightcreative.app.motion.activities.audiobrowser.xfY$xfY.j(com.alightcreative.app.motion.activities.audiobrowser.xfY.l, v10_1, v11_1, v12_1, 0, 0, 0, 0, 0, 248, 0);
                            } else {
                                String v3_4 = p21.X();
                                if (v3_4 != null) {
                                    int v4_1 = this.getSupportFragmentManager();
                                    com.alightcreative.app.motion.persist.xfY$xfY v5_4 = new StringBuilder();
                                    v5_4.append("AudioBucketFragment:");
                                    v5_4.append(v3_4);
                                    int v4_2 = v4_1.hP(v5_4.toString());
                                    if (v4_2 != 0) {
                                        v1_11.IB(v4_2);
                                    }
                                    int v17_2;
                                    String v10_2 = this.T.name();
                                    com.alightcreative.app.motion.activities.audiobrowser.xfY v2_4 = p21.H();
                                    if (v2_4 != null) {
                                        v17_2 = v2_4;
                                    } else {
                                        v17_2 = "?";
                                    }
                                    v2_2 = com.alightcreative.app.motion.activities.audiobrowser.xfY$xfY.j(com.alightcreative.app.motion.activities.audiobrowser.xfY.l, v10_2, 0, 0, 0, 0, 0, v3_4, v17_2, 62, 0);
                                }
                            }
                        }
                    }
                    this.l = v2_2;
                    String v3_6 = this.w;
                    int v4_5 = new StringBuilder();
                    v4_5.append("AudioBucketFragment:");
                    v4_5.append(v3_6);
                    String v3_7 = v4_5.toString();
                    XQ4.xfY.j(v1_11).cD(2131362888, v2_2, v3_7).X(v3_7).uKP();
                    return;
                }
            }
        }
        return;
    }
}
