package com.alightcreative.app.motion.activities.mediabrowser;
public final class MediaBrowser extends com.alightcreative.app.motion.activities.mediabrowser.xfY implements jn.Nrb {
    public static final int AM;
    public static final com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$A GO;
    private static final java.util.concurrent.ExecutorService M;
    private static ref.WeakReference e;
    private int E;
    private final FKt.Xo F;
    private nVu.Y H;
    private java.util.List K;
    private int Q;
    private boolean R;
    public Vbv.c T;
    public TV.n X;
    private String ah;
    private int ak;
    private androidx.media3.exoplayer.ExoPlayer cv;
    private com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$AWD d;
    private String db;
    private int f;
    private int l;
    private String w;
    private final android.os.Handler z;

    static MediaBrowser()
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.GO = new com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$A(0);
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.AM = 8;
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.M = java.util.concurrent.Executors.newSingleThreadExecutor();
        return;
    }

    public MediaBrowser()
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$AWD v0_0 = com.alightcreative.app.motion.persist.xfY.INSTANCE;
        this.db = v0_0.getMediaBucketID();
        this.w = v0_0.getMediaBucketName();
        this.K = new java.util.ArrayList();
        this.z = new android.os.Handler(android.os.Looper.getMainLooper());
        this.F = new FKt.Xo(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.M, new jn.Gc(this)).X(new jn.nn(this));
        this.d = new com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$AWD(this);
        return;
    }

    private final void A()
    {
        android.os.Handler v0_0 = this.H;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.z.GO();
        android.os.Handler v0_9 = this.cv;
        if (v0_9 != null) {
            v0_9.pause();
        }
        android.os.Handler v0_1 = this.H;
        if (v0_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_1 = 0;
        }
        v0_1.Z5u.setImageDrawable(this.getResources().getDrawable(2131231966, this.getTheme()));
        android.os.Handler v0_3 = this.H;
        if (v0_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_3 = 0;
        }
        v0_3.Z5u.setVisibility(0);
        android.os.Handler v0_5 = this.H;
        if (v0_5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_5 = 0;
        }
        v0_5.LV.setVisibility(0);
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.e = 0;
        this.z.removeCallbacks(this.d);
        return;
    }

    private static final void AX(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        p0.finish();
        return;
    }

    public static synthetic void B(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.AX(p0, p1);
        return;
    }

    private static final kotlin.Unit C0b(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p2, com.alightcreative.app.motion.activities.mediabrowser.A p3, tI.Gc p4, long p5, long p7)
    {
        p2.z.removeCallbacks(p2.d);
        if ((p5 != 0) || (p7 != 0)) {
            p3.ah().put(p4.f(), new kotlin.Pair(Long.valueOf(p5), Long.valueOf(p7)));
        } else {
            p3.ah().remove(p4.f());
        }
        p3.notifyItemChanged(p3.w());
        return kotlin.Unit.INSTANCE;
    }

    private final void C4W()
    {
        this.F.x();
        return;
    }

    private final int C8(int p3)
    {
        int v0_0 = this.Q;
        if (p3 > v0_0) {
            return (v0_0 + ((p3 - v0_0) * this.E));
        } else {
            return p3;
        }
    }

    private static final void CYw(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, com.alightcreative.app.motion.activities.mediabrowser.A p1, tI.Gc p2, kotlin.jvm.internal.Ref$LongRef p3, android.view.View p4)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.VJy(p0, p1, p2, p3);
        p0.b();
        return;
    }

    private static final void EMD(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p12, android.view.View p13)
    {
        if (!p12.jfW()) {
            boolean v13_17 = p12.H;
            android.view.ViewGroup v1_1 = 0;
            if (!v13_17) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v13_17 = 0;
            }
            if (v13_17.R6.getRotation() != 1127481344) {
                boolean v13_13 = p12.H;
                if (!v13_13) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v13_13 = 0;
                }
                v13_13.uKP.setVisibility(4);
                boolean v13_15 = p12.H;
                if (!v13_15) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v13_15 = 0;
                }
                v13_15.x.setVisibility(4);
                boolean v13_18 = p12.H;
                if (!v13_18) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v13_18 = 0;
                }
                v13_18.f.setVisibility(4);
                boolean v13_20 = p12.H;
                if (!v13_20) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v13_20 = 0;
                }
                v13_20.R6.setRotation(1127481344);
                boolean v13_22 = p12.H;
                if (!v13_22) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v13_22 = 0;
                }
                v13_22.R6.setActivated(1);
                boolean v13_25 = new android.widget.ListPopupWindow(p12);
                v13_25.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(p12.getResources().getColor(2131099661, p12.getTheme())));
                java.util.List v7_1 = p12.K;
                v13_25.setAdapter(new jn.AWD(v7_1, v7_1.isEmpty(), new com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$F(p12), p12.v(), new com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$D(v13_25)));
                int v4_5 = p12.H;
                if (v4_5 == 0) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v4_5 = 0;
                }
                v13_25.setAnchorView(v4_5.H);
                v13_25.setOnItemClickListener(new jn.mW(p12, v13_25));
                v13_25.setOnDismissListener(new jn.N(p12));
                v13_25.setVerticalOffset(0);
                v13_25.setHorizontalOffset(0);
                int v3_2 = p12.H;
                if (v3_2 == 0) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v3_2 = 0;
                }
                v13_25.setHeight(Math.min(v3_2.db.getHeight(), (p12.getResources().getDimensionPixelOffset(2131165316) * (p12.K.size() + p12.K.isEmpty()))));
                v13_25.setWidth(-1);
                v13_25.setModal(1);
                v13_25.show();
                nVu.Y v12_5 = v13_25.getListView();
                if (v12_5 != null) {
                    v12_5.setClipToOutline(1);
                }
                nVu.Y v12_6 = v13_25.getListView();
                if (v12_6 != null) {
                    v12_6.setClipChildren(1);
                }
                nVu.Y v12_8;
                nVu.Y v12_7 = v13_25.getListView();
                if (v12_7 == null) {
                    v12_8 = 0;
                } else {
                    v12_8 = v12_7.getParent();
                }
                nVu.Y v12_9;
                if (!(v12_8 instanceof android.view.View)) {
                    v12_9 = 0;
                } else {
                    v12_9 = ((android.view.View) v12_8);
                }
                if (v12_9 != null) {
                    v12_9.setClipToOutline(1);
                }
                nVu.Y v12_11;
                nVu.Y v12_10 = v13_25.getListView();
                if (v12_10 == null) {
                    v12_11 = 0;
                } else {
                    v12_11 = v12_10.getParent();
                }
                if ((v12_11 instanceof android.view.ViewGroup)) {
                    v1_1 = ((android.view.ViewGroup) v12_11);
                }
                if (v1_1 != null) {
                    v1_1.setClipChildren(1);
                }
            } else {
                boolean v13_5 = p12.H;
                if (!v13_5) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v13_5 = 0;
                }
                v13_5.uKP.setVisibility(0);
                boolean v13_7 = p12.H;
                if (!v13_7) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v13_7 = 0;
                }
                v13_7.x.setVisibility(0);
                boolean v13_9 = p12.H;
                if (!v13_9) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v13_9 = 0;
                }
                v13_9.f.setVisibility(0);
                boolean v13_11 = p12.H;
                if (!v13_11) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v13_11 = 0;
                }
                v13_11.R6.setRotation(0);
                nVu.Y v12_12 = p12.H;
                if (v12_12 != null) {
                    v1_1 = v12_12;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                v1_1.R6.setActivated(0);
                return;
            }
        }
        return;
    }

    private static final void Ear(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p4)
    {
        int v0_0 = p4.H;
        nVu.Y v1 = 0;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.LV.setVisibility(4);
        androidx.appcompat.widget.AppCompatImageButton v4_1 = p4.H;
        if (v4_1 != null) {
            v1 = v4_1;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1.Z5u.setVisibility(8);
        return;
    }

    private static final boolean Ehf(android.view.View p1, android.view.MotionEvent p2)
    {
        if (p2.getAction() == 1) {
            p1.performClick();
        }
        return 1;
    }

    private final void En(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$xfY p20)
    {
        int v2_5 = this.H;
        String v3_1 = 0;
        if (v2_5 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v2_5 = 0;
        }
        int v2_0 = v2_5.ak.getAdapter();
        if ((v2_0 instanceof com.alightcreative.app.motion.activities.mediabrowser.A)) {
            v3_1 = ((com.alightcreative.app.motion.activities.mediabrowser.A) v2_0);
        }
        if ((v3_1 != null) && (v3_1.FT().size() > 0)) {
            int v2_4 = new java.util.ArrayList();
            TV.xfY$c v4_2 = v3_1.FT().iterator();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_2, "iterator(...)");
            int v5_0 = 0;
            int v6 = 0;
            while (v4_2.hasNext()) {
                Number v7_7 = v4_2.next();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_7, "next(...)");
                Number v7_8 = ((tI.Gc) v7_7);
                int v8_7 = com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$CU.$EnumSwitchMapping$0[v7_8.ak().ordinal()];
                if (v8_7 == 1) {
                    int v8_11;
                    int v8_10 = ((Integer) v3_1.F0().get(v7_8.f()));
                    if (v8_10 == 0) {
                        v8_11 = this.ak;
                    } else {
                        v8_11 = v8_10.intValue();
                    }
                    v2_4.add(new com.alightcreative.app.motion.activities.mediabrowser.AddVisualMediaInfo(v7_8.f(), v7_8.ak().name(), this.JHw(v8_11), 0, 0, 24, 0));
                    v5_0++;
                } else {
                    if (v8_7 == 2) {
                        long v9_3;
                        int v8_2 = ((kotlin.Pair) v3_1.ah().get(v7_8.f()));
                        if (v8_2 == 0) {
                            v9_3 = v7_8.l();
                        } else {
                            v9_3 = ((v7_8.l() - ((Number) v8_2.getFirst()).longValue()) - ((Number) v8_2.getSecond()).longValue());
                        }
                        com.alightcreative.app.motion.activities.mediabrowser.AddVisualMediaInfo v15_1;
                        android.net.Uri v12_0 = v7_8.f();
                        long v13_1 = v7_8.ak().name();
                        int v14 = ((int) v9_3);
                        long v9_6 = 0;
                        if (v8_2 == 0) {
                            v15_1 = 0;
                        } else {
                            v15_1 = ((Number) v8_2.getFirst()).longValue();
                        }
                        if (v8_2 != 0) {
                            v9_6 = ((Number) v8_2.getSecond()).longValue();
                        }
                        v2_4.add(new com.alightcreative.app.motion.activities.mediabrowser.AddVisualMediaInfo(v12_0, v13_1, v14, v15_1, v9_6));
                        v6++;
                    }
                }
            }
            TV.xfY$c v4_4;
            android.content.Intent v1_1 = this.CB();
            String v3_3 = new android.os.Bundle();
            if (p20 != com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$xfY.j) {
                v4_4 = "sequence";
            } else {
                v4_4 = "concurrent";
            }
            v3_3.putString("type", v4_4);
            v3_3.putInt("image_count", v5_0);
            v3_3.putInt("video_count", v6);
            v1_1.hUw(new TV.xfY$c("add_media", v3_3));
            android.content.Intent v1_3 = new android.content.Intent();
            v1_3.putExtra("AddMediaList", v2_4);
            v1_3.putExtra("MultiMode", p20.name());
            this.setResult(-1, v1_3);
            this.finish();
        }
        return;
    }

    public static synthetic kotlin.Unit Frn(com.alightcreative.app.motion.activities.mediabrowser.A p0, kotlin.jvm.internal.Ref$LongRef p1, com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p2, long p3)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.z8(p0, p1, p2, p3);
    }

    public static synthetic void Ie(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, com.alightcreative.app.motion.activities.mediabrowser.A p1, tI.Gc p2, kotlin.jvm.internal.Ref$LongRef p3, android.view.View p4)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.CYw(p0, p1, p2, p3, p4);
        return;
    }

    public static synthetic kotlin.Unit If(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.v9(p0);
    }

    private final int JHw(int p2)
    {
        return ((int) ((((float) p2) / ((float) this.E)) * 1148846080));
    }

    public static synthetic w9w.a9t Jju(android.view.View p0, w9w.a9t p1)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.wH(p0, p1);
    }

    public static synthetic void Jm(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.wll(p0, p1);
        return;
    }

    public static final synthetic android.os.Handler KE(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        return p0.z;
    }

    private static final void Kpz(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        p0.En(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$xfY.j);
        return;
    }

    private static final kotlin.Unit MMm(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p5, int p6)
    {
        int v6_1 = p5.C8(p6);
        boolean v0_1 = p5.H;
        nVu.Y v1 = 0;
        if (!v0_1) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_1 = 0;
        }
        v0_1.IB.setText(com.alightcreative.app.motion.scene.TimeKt.formatFrameNumber(v6_1, (p5.E * 100), "mm:ss:ff"));
        boolean v0_0 = p5.H;
        if (v0_0) {
            v1 = v0_0;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        if (!v1.l.isActivated()) {
            p5.ak = v6_1;
        } else {
            p5.f = v6_1;
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit MTr()
    {
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void N(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.Ear(p0);
        return;
    }

    private static final void O9(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p2, android.view.View p3)
    {
        androidx.appcompat.widget.LinearLayoutCompat v3_0 = p2.H;
        nVu.Y v0 = 0;
        if (v3_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v3_0 = 0;
        }
        androidx.appcompat.widget.LinearLayoutCompat v3_1 = v3_0.LV;
        int v2_4 = p2.H;
        if (v2_4 != 0) {
            v0 = v2_4;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        int v2_3;
        if (v0.LV.getVisibility() != 0) {
            v2_3 = 0;
        } else {
            v2_3 = 4;
        }
        v3_1.setVisibility(v2_3);
        return;
    }

    public static final synthetic nVu.Y Odv(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        return p0.H;
    }

    public static synthetic void PC0(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.Zm(p0, p1);
        return;
    }

    public static synthetic void Pg(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.qxC(p0, p1);
        return;
    }

    private static final kotlin.Unit QP(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        p0.C4W();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit QR(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.QP(p0);
    }

    private final boolean RF()
    {
        if (!kotlin.jvm.internal.Intrinsics.areEqual("All", this.db)) {
            int v0_4 = this.db;
            if ((v0_4 != 0) && (!kotlin.text.StringsKt.isBlank(v0_4))) {
                return 0;
            }
        }
        return 1;
    }

    public static synthetic void S(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.EMD(p0, p1);
        return;
    }

    private static final kotlin.Pair S6(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p54)
    {
        if (!fx.c.l(p54)) {
            return new kotlin.Pair(kotlin.collections.CollectionsKt.emptyList(), new java.util.ArrayList());
        } else {
            java.util.List v4_0;
            int v44_1;
            int v1_10 = jn.gs.j(tI.uZ5.ojl(p54, tI.nn.j.j(), 0, 4, 0), p54.v());
            com.alightcreative.app.motion.persist.xfY v3_8 = ((tI.Gc) kotlin.collections.CollectionsKt.firstOrNull(v1_10));
            if (v3_8 == null) {
                v44_1 = v1_10;
                v4_0 = new java.util.ArrayList();
            } else {
                java.util.List v4_3 = new com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$c(v1_10);
                int v5_6 = new java.util.LinkedHashMap();
                String v6_1 = v4_3.sourceIterator();
                while(true) {
                    int v8_0 = 0;
                    if (!v6_1.hasNext()) {
                        break;
                    }
                    tI.Gc v7_0 = v6_1.next();
                    int v10_0 = v4_3.keyOf(v7_0);
                    int v11_0 = v5_6.get(v10_0);
                    if ((v11_0 == 0) && (!v5_6.containsKey(v10_0))) {
                        v8_0 = 1;
                    }
                    tI.Gc v7_3;
                    int v13_1 = ((tI.Gc) v11_0);
                    if (v8_0 == 0) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v13_1);
                        v7_3 = tI.Gc.j(v13_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (v13_1.ojl() + 1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217535, 0);
                    } else {
                        v7_3 = tI.Gc.j(((tI.Gc) v7_0), 0, tI.nn.T, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073217533, 0);
                    }
                    v5_6.put(v10_0, v7_3);
                }
                v44_1 = v1_10;
                String v2_1 = kotlin.collections.CollectionsKt.toMutableList(v5_6.values());
                v2_1.add(0, tI.Gc.j(v3_8, 0, tI.nn.T, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, p54.getResources().getString(2132017291), "All", 0, 0, 0, 0, 0, (v1_10.size() + 1), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1073205245, 0));
                v4_0 = v2_1;
            }
            int v1_6;
            int v1_2 = p54.db;
            if ((v1_2 != 0) && (!kotlin.text.StringsKt.isBlank(v1_2))) {
                v1_6 = new java.util.ArrayList();
                String v2_2 = v44_1.iterator();
                while (v2_2.hasNext()) {
                    com.alightcreative.app.motion.persist.xfY v3_2 = v2_2.next();
                    if (kotlin.jvm.internal.Intrinsics.areEqual(((tI.Gc) p54).X(), p54.db)) {
                        v1_6.add(v3_2);
                    }
                }
            } else {
                v1_6 = kotlin.collections.CollectionsKt.emptyList();
            }
            String v2_4 = p54.db;
            if ((v2_4 != null) && ((!kotlin.text.StringsKt.isBlank(v2_4)) && (v1_6.isEmpty()))) {
                p54.db = "All";
                p54.w = p54.getResources().getString(2132017291);
                com.alightcreative.app.motion.persist.xfY v3_6 = com.alightcreative.app.motion.persist.xfY.INSTANCE;
                v3_6.setMediaBucketID("All");
                v3_6.setMediaBucketName(p54.getResources().getString(2132017291));
            }
            if (!p54.RF()) {
                return new kotlin.Pair(v1_6, v4_0);
            } else {
                return new kotlin.Pair(v44_1, v4_0);
            }
        }
    }

    public static synthetic kotlin.Unit ST5(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.jj(p0);
    }

    private static final void TT1(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.widget.ListPopupWindow p1, android.widget.AdapterView p2, android.view.View p3, int p4, long p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<unused var>");
        if (!p0.K.isEmpty()) {
            p0.ygC(((tI.Gc) p0.K.get(p4)));
        }
        p1.dismiss();
        return;
    }

    private static final void V(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p4, android.view.View p5)
    {
        android.view.LayoutInflater v5_0 = p4.H;
        tI.qfV v0_0 = 0;
        if (v5_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v5_0 = 0;
        }
        android.view.LayoutInflater v5_1;
        android.view.LayoutInflater v5_8 = v5_0.ak.getAdapter();
        if (!(v5_8 instanceof com.alightcreative.app.motion.activities.mediabrowser.A)) {
            v5_1 = 0;
        } else {
            v5_1 = ((com.alightcreative.app.motion.activities.mediabrowser.A) v5_8);
        }
        if (v5_1 != null) {
            v5_1.w();
            android.view.LayoutInflater v5_4 = tI.Y.x1(new FKt.Sq(p4), v5_1.cLW(v5_1.w()).f(), 0, 4, 0);
            if ((v5_4 instanceof tI.qfV)) {
                v0_0 = ((tI.qfV) v5_4);
            }
            if (v0_0 != null) {
                android.view.LayoutInflater v5_5 = p4.getLayoutInflater();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v5_5, "getLayoutInflater(...)");
                FKt.Tn.f(p4, v0_0, v5_5);
                return;
            }
        }
        return;
    }

    private static final void VJy(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p9, com.alightcreative.app.motion.activities.mediabrowser.A p10, tI.Gc p11, kotlin.jvm.internal.Ref$LongRef p12)
    {
        androidx.media3.exoplayer.ExoPlayer v0_2;
        androidx.media3.exoplayer.ExoPlayer v0_0 = p9.cv;
        nVu.Y v1 = 0;
        if (v0_0 == null) {
            v0_2 = 0;
        } else {
            v0_2 = Long.valueOf(v0_0.getCurrentPosition());
        }
        com.alightcreative.app.motion.activities.mediabrowser.VideoTrimView v10_3 = ((kotlin.Pair) p10.ah().get(p11.f()));
        if (v10_3 == null) {
            if ((v0_2 != null) && (v0_2.longValue() >= p11.l())) {
                com.alightcreative.app.motion.activities.mediabrowser.VideoTrimView v10_5 = p11.l();
                p12.element = v10_5;
                androidx.media3.exoplayer.ExoPlayer v0_1 = p9.cv;
                if (v0_1 != null) {
                    v0_1.e(v10_5);
                }
                com.alightcreative.app.motion.activities.mediabrowser.VideoTrimView v10_6 = p9.H;
                if (v10_6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v10_6 = 0;
                }
                v10_6.d.db(p12.element);
                com.alightcreative.app.motion.activities.mediabrowser.VideoTrimView v9_1 = p9.H;
                if (v9_1 != null) {
                    v1 = v9_1;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                v1.d.invalidate();
            }
        } else {
            long v3_3 = ((Number) v10_3.component1()).longValue();
            long v5_1 = ((Number) v10_3.component2()).longValue();
            if ((v0_2 != null) && (v0_2.longValue() >= (p11.l() - v5_1))) {
                p12.element = v3_3;
                com.alightcreative.app.motion.activities.mediabrowser.VideoTrimView v10_13 = p9.cv;
                if (v10_13 != null) {
                    v10_13.e(v3_3);
                }
                com.alightcreative.app.motion.activities.mediabrowser.VideoTrimView v10_14 = p9.H;
                if (v10_14 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v10_14 = 0;
                }
                v10_14.d.db(p12.element);
                com.alightcreative.app.motion.activities.mediabrowser.VideoTrimView v9_3 = p9.H;
                if (v9_3 != null) {
                    v1 = v9_3;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                v1.d.invalidate();
                return;
            }
        }
        return;
    }

    private static final void W(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, kotlin.jvm.internal.Ref$LongRef p1, com.alightcreative.app.motion.activities.mediabrowser.A p2, tI.Gc p3, android.view.View p4)
    {
        int v4_1;
        int v4_0 = p0.cv;
        if (v4_0 == 0) {
            v4_1 = 0;
        } else {
            v4_1 = v4_0.isPlaying();
        }
        if (v4_1 == 0) {
            com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.VJy(p0, p2, p3, p1);
            p0.b();
            return;
        } else {
            long v2_1;
            long v2_2 = p0.cv;
            if (v2_2 == 0) {
                v2_1 = 0;
            } else {
                v2_1 = v2_2.getCurrentPosition();
            }
            p1.element = v2_1;
            p0.A();
            return;
        }
    }

    public static final synthetic void W3V(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, tI.Gc p1)
    {
        p0.ygC(p1);
        return;
    }

    private static final kotlin.Unit WJ(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        p0.C4W();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit Y(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.s(p0);
    }

    public static final synthetic void YU(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, tI.Gc p1, boolean p2)
    {
        p0.u(p1, p2);
        return;
    }

    public static synthetic void Z(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.p(p0, p1);
        return;
    }

    public static synthetic kotlin.Unit Z0(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, com.alightcreative.app.motion.activities.mediabrowser.A p1, tI.Gc p2, long p3, long p5)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.C0b(p0, p1, p2, p3, p5);
    }

    public static synthetic kotlin.Unit Zk()
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.MTr();
    }

    private static final void Zm(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        p0.En(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$xfY.cD);
        return;
    }

    private static final void a9(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p4, android.animation.ValueAnimator p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "it");
        android.view.ViewGroup$LayoutParams v0_2 = p4.H;
        nVu.Y v1 = 0;
        if (v0_2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_2 = 0;
        }
        android.view.ViewGroup$LayoutParams v0_1 = v0_2.ak.getLayoutParams();
        int v5_1 = p5.getAnimatedValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(v5_1, "null cannot be cast to non-null type kotlin.Int");
        v0_1.height = ((Integer) v5_1).intValue();
        androidx.recyclerview.widget.RecyclerView v4_1 = p4.H;
        if (v4_1 != null) {
            v1 = v4_1;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1.ak.requestLayout();
        return;
    }

    private final void b()
    {
        this.z.removeCallbacks(this.d);
        this.z.postDelayed(this.d, 100);
        ref.WeakReference v0_1 = this.H;
        androidx.media3.ui.PlayerView v1_1 = 0;
        if (v0_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_1 = 0;
        }
        v0_1.Z5u.setImageDrawable(this.getResources().getDrawable(2131231951, this.getTheme()));
        ref.WeakReference v0_3 = this.H;
        if (v0_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_3 = 0;
        }
        v0_3.Z5u.postDelayed(new jn.N5W(this), 500);
        ref.WeakReference v0_6 = this.cv;
        if (v0_6 != null) {
            v0_6.cD();
        }
        nVu.Y v3_4 = this.H;
        if (v3_4 != null) {
            v1_1 = v3_4;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.e = new ref.WeakReference(v1_1.z);
        return;
    }

    private static final void b1(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        androidx.constraintlayout.widget.ConstraintLayout v0_1 = p0.H;
        if (v0_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_1 = 0;
        }
        v0_1.H.performClick();
        return;
    }

    public static synthetic kotlin.Unit b9Y(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, int p1)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.MMm(p0, p1);
    }

    public static synthetic boolean cKj(android.view.View p0, android.view.MotionEvent p1)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.vy(p0, p1);
    }

    public static synthetic kotlin.Unit cak(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, kotlin.Pair p1)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.q9c(p0, p1);
    }

    private static final kotlin.Unit dDX(boolean p2, com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p3, int p4, int p5, boolean p6)
    {
        androidx.recyclerview.widget.RecyclerView$c v0 = 0;
        if (p2 != 0) {
            int v2_7 = p3.H;
            if (v2_7 == 0) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v2_7 = 0;
            }
            int v2_2;
            int v2_1 = v2_7.ak.getAdapter();
            if (!(v2_1 instanceof com.alightcreative.app.motion.activities.mediabrowser.A)) {
                v2_2 = 0;
            } else {
                v2_2 = ((com.alightcreative.app.motion.activities.mediabrowser.A) v2_1);
            }
            if (v2_2 != 0) {
                androidx.recyclerview.widget.RecyclerView v1_1 = p3.H;
                if (v1_1 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v1_1 = 0;
                }
                v1_1.ak.smoothScrollToPosition(v2_2.w());
            }
        }
        int v2_4 = p3.H;
        if (v2_4 != 0) {
            v0 = v2_4;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        int v3_1;
        if (p4 != p5) {
            v3_1 = 0;
        } else {
            v3_1 = 8;
        }
        v0.T.setVisibility(v3_1);
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void dav(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.animation.ValueAnimator p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.a9(p0, p1);
        return;
    }

    public static synthetic void e4D(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.lka(p0, p1);
        return;
    }

    private final boolean fdD()
    {
        int v0_0 = this.H;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        if (v0_0.ak.getHeight() == this.l) {
            return 0;
        } else {
            return 1;
        }
    }

    public static synthetic kotlin.Unit g(boolean p0, com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p1, int p2, int p3, boolean p4)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.dDX(p0, p1, p2, p3, p4);
    }

    public static synthetic boolean g2(android.view.View p0, android.view.MotionEvent p1)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.Ehf(p0, p1);
    }

    private static final void hk(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p18, android.view.View p19)
    {
        Number v1_0 = p18.H;
        int v2_3 = 0;
        if (v1_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_0 = 0;
        }
        Number v1_5;
        Number v1_15 = v1_0.ak.getAdapter();
        if (!(v1_15 instanceof com.alightcreative.app.motion.activities.mediabrowser.A)) {
            v1_5 = 0;
        } else {
            v1_5 = ((com.alightcreative.app.motion.activities.mediabrowser.A) v1_15);
        }
        if ((v1_5 != null) && (v1_5.FT().size() > 0)) {
            if (!p18.jfW()) {
                String v4_0 = 1;
                if (v1_5.FT().size() == 1) {
                    TV.xfY$c v3_12 = ((tI.Gc) kotlin.collections.CollectionsKt.first(v1_5.FT()));
                    Number v1_9 = ((kotlin.Pair) v1_5.ah().get(v3_12.f()));
                    tI.nn v5_10 = com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$CU.$EnumSwitchMapping$0[v3_12.ak().ordinal()];
                    if (v5_10 == 1) {
                        v2_3 = new com.alightcreative.app.motion.activities.mediabrowser.AddVisualMediaInfo(v3_12.f(), v3_12.ak().name(), p18.JHw(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser v0.ak), 0, 0, 24, 0);
                    } else {
                        if (v5_10 == 2) {
                            long v11_1;
                            android.net.Uri v8_2 = v3_12.f();
                            String v9_1 = v3_12.ak().name();
                            int v10_1 = ((int) v3_12.l());
                            tI.nn v5_12 = 0;
                            if (v1_9 == null) {
                                v11_1 = 0;
                            } else {
                                v11_1 = ((Number) v1_9.getFirst()).longValue();
                            }
                            if (v1_9 != null) {
                                v5_12 = ((Number) v1_9.getSecond()).longValue();
                            }
                            v2_3 = new com.alightcreative.app.motion.activities.mediabrowser.AddVisualMediaInfo(v8_2, v9_1, v10_1, v11_1, v5_12);
                        }
                    }
                    if (v2_3 != 0) {
                        p18.setResult(-1, new android.content.Intent().putExtra("selectedUri", v3_12.f()).putExtra("mediaType", v3_12.ak().name()).putExtra("AddSingleMedia", v2_3));
                    }
                    tI.nn v5_5;
                    Number v1_4 = p18.CB();
                    int v2_2 = new android.os.Bundle();
                    v2_2.putString("type", "single");
                    if (v3_12.ak() != tI.nn.q) {
                        v5_5 = 0;
                    } else {
                        v5_5 = 1;
                    }
                    v2_2.putInt("image_count", v5_5);
                    if (v3_12.ak() != tI.nn.H) {
                        v4_0 = 0;
                    }
                    v2_2.putInt("video_count", v4_0);
                    v1_4.hUw(new TV.xfY$c("add_media", v2_2));
                }
            }
            p18.finish();
        }
        return;
    }

    public static synthetic void hsj(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.hk(p0, p1);
        return;
    }

    public static final synthetic void i2(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, int p1)
    {
        p0.l = p1;
        return;
    }

    private final int iM(int p3)
    {
        int v0_0 = this.Q;
        if (p3 > v0_0) {
            return (v0_0 + ((p3 - v0_0) / this.E));
        } else {
            return p3;
        }
    }

    public static final synthetic androidx.media3.exoplayer.ExoPlayer jV(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        return p0.cv;
    }

    private final boolean jfW()
    {
        int v0_0 = this.H;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        if (v0_0.Bb.getVisibility() != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    private static final kotlin.Unit jj(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p4)
    {
        int v0_0 = p4.H;
        nVu.Y v2 = 0;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        if (v0_0.l.isActivated()) {
            int v0_1 = p4.H;
            if (v0_1 == 0) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_1 = 0;
            }
            int v0_4;
            int v0_3 = v0_1.ak.getAdapter();
            if (!(v0_3 instanceof com.alightcreative.app.motion.activities.mediabrowser.A)) {
                v0_4 = 0;
            } else {
                v0_4 = ((com.alightcreative.app.motion.activities.mediabrowser.A) v0_3);
            }
            if (v0_4 != 0) {
                nVu.Y v3_1 = p4.H;
                if (v3_1 != null) {
                    v2 = v3_1;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                v0_4.Bb(v2.l.isActivated(), p4.f);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    private final void kBB(Integer p5)
    {
        int v0_0 = 0;
        int v1_0 = 0;
        if ((p5 == null) && (this.jfW())) {
            this.u(0, 0);
        }
        if (!this.jfW()) {
            String v5_1 = this.H;
            if (v5_1 != null) {
                v1_0 = v5_1;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            int v0_3;
            String v5_2 = v1_0.q;
            int v0_1 = this.w;
            if ((v0_1 != 0) && (!kotlin.text.StringsKt.isBlank(v0_1))) {
                v0_3 = this.w;
            } else {
                v0_3 = this.getResources().getString(2132017291);
            }
            v5_2.setText(v0_3);
            return;
        } else {
            android.content.res.Resources v2_1 = this.H;
            if (v2_1 != null) {
                v1_0 = v2_1;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            String v3_1;
            int v1_2 = v1_0.x1;
            android.content.res.Resources v2_2 = this.getResources();
            if (p5 == null) {
                v3_1 = 0;
            } else {
                v3_1 = p5.intValue();
            }
            if (p5 != null) {
                v0_0 = p5.intValue();
            }
            v1_2.setText(v2_2.getQuantityString(2131886122, v3_1, new Object[] {Integer.valueOf(v0_0)})));
            return;
        }
    }

    public static synthetic void lU(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.Kpz(p0, p1);
        return;
    }

    private static final void lka(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        p0.finish();
        return;
    }

    public static synthetic void m(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.O9(p0, p1);
        return;
    }

    public static synthetic void m0(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, kotlin.jvm.internal.Ref$LongRef p1, com.alightcreative.app.motion.activities.mediabrowser.A p2, tI.Gc p3, android.view.View p4)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.W(p0, p1, p2, p3, p4);
        return;
    }

    public static synthetic void nG(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.y3P(p0, p1);
        return;
    }

    public static synthetic void o(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.b1(p0);
        return;
    }

    private static final void p(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p7, android.view.View p8)
    {
        FKt.h.cLW(p7, X7.xfY$h.X, 0, 0, new jn.kh(p7), 6, 0);
        return;
    }

    private static final void pL(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p1, android.view.View p2)
    {
        p1.u(0, 1);
        return;
    }

    private static final kotlin.Unit q9c(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p11, kotlin.Pair p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "<destruct>");
        java.util.List v3_1 = ((java.util.List) p12.component1());
        com.alightcreative.app.motion.persist.xfY v12_49 = ((java.util.List) p12.component2());
        nVu.Y v9 = 0;
        if (!fx.c.l(p11)) {
            com.alightcreative.app.motion.persist.xfY v12_12 = p11.H;
            if (v12_12 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v12_12 = 0;
            }
            v12_12.Hm.setVisibility(0);
            com.alightcreative.app.motion.persist.xfY v12_25 = p11.H;
            if (v12_25 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v12_25 = 0;
            }
            v12_25.cv.setVisibility(4);
            void v11_3 = p11.H;
            if (v11_3 != 0) {
                v9 = v11_3;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v9.db.setVisibility(4);
        } else {
            androidx.appcompat.widget.AppCompatTextView v0_32 = p11.H;
            if (v0_32 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_32 = 0;
            }
            v0_32.Hm.setVisibility(4);
            androidx.appcompat.widget.AppCompatTextView v0_34 = p11.H;
            if (v0_34 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_34 = 0;
            }
            v0_34.cv.setVisibility(0);
            androidx.appcompat.widget.AppCompatTextView v0_36 = p11.H;
            if (v0_36 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_36 = 0;
            }
            v0_36.db.setVisibility(0);
            if (v12_49.isEmpty()) {
                androidx.appcompat.widget.AppCompatTextView v0_39 = p11.H;
                if (v0_39 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v0_39 = 0;
                }
                v0_39.nvG.setVisibility(0);
                androidx.appcompat.widget.AppCompatTextView v0_41 = p11.H;
                if (v0_41 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v0_41 = 0;
                }
                v0_41.f.setEnabled(0);
                androidx.appcompat.widget.AppCompatTextView v0_43 = p11.H;
                if (v0_43 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v0_43 = 0;
                }
                v0_43.x.setEnabled(0);
                p11.K = v12_49;
                com.alightcreative.app.motion.persist.xfY v12_47 = p11.H;
                if (v12_47 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v12_47 = 0;
                }
                v12_47.ak.setAdapter(0);
                com.alightcreative.app.motion.persist.xfY v12_50 = p11.H;
                if (v12_50 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v12_50 = 0;
                }
                v12_50.z.setVisibility(8);
                com.alightcreative.app.motion.persist.xfY v12_52 = p11.H;
                if (v12_52 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v12_52 = 0;
                }
                v12_52.Z5u.setVisibility(8);
                com.alightcreative.app.motion.persist.xfY v12_54 = p11.H;
                if (v12_54 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v12_54 = 0;
                }
                v12_54.FT.setVisibility(8);
                com.alightcreative.app.motion.persist.xfY v12_1 = p11.H;
                if (v12_1 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v12_1 = 0;
                }
                v12_1.F.setVisibility(4);
                com.alightcreative.app.motion.persist.xfY v12_3 = p11.H;
                if (v12_3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v12_3 = 0;
                }
                v12_3.pM1.setVisibility(4);
                p11.kBB(0);
            } else {
                androidx.appcompat.widget.AppCompatTextView v0_2 = p11.H;
                if (v0_2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v0_2 = 0;
                }
                v0_2.nvG.setVisibility(4);
                androidx.appcompat.widget.AppCompatTextView v0_4 = p11.H;
                if (v0_4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v0_4 = 0;
                }
                v0_4.f.setEnabled((p11.R ^ 1));
                androidx.appcompat.widget.AppCompatTextView v0_6 = p11.H;
                if (v0_6 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v0_6 = 0;
                }
                v0_6.x.setEnabled(1);
                p11.K = v12_49;
                if (!v3_1.isEmpty()) {
                    com.alightcreative.app.motion.persist.xfY v12_6 = p11.H;
                    if (v12_6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v12_6 = 0;
                    }
                    v12_6.ak.setBackgroundColor(p11.getResources().getColor(17170445, p11.getTheme()));
                    com.alightcreative.app.motion.persist.xfY v12_8 = p11.H;
                    if (v12_8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v12_8 = 0;
                    }
                    if (v12_8.ak.getAdapter() == null) {
                        String v1_5 = new com.alightcreative.app.motion.activities.mediabrowser.A(p11.db, v3_1, new com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$V(p11), new com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$cY(p11), p11.R);
                        com.alightcreative.app.motion.persist.xfY v12_11 = p11.H;
                        if (v12_11 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            v12_11 = 0;
                        }
                        v12_11.ak.setAdapter(v1_5);
                        v1_5.FT().add(kotlin.collections.CollectionsKt.first(v3_1));
                        p11 = p11.ygC(((tI.Gc) kotlin.collections.CollectionsKt.first(v3_1))).kBB(Integer.valueOf(v1_5.FT().size()));
                    } else {
                        com.alightcreative.app.motion.persist.xfY v12_20 = p11.H;
                        if (v12_20 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            v12_20 = 0;
                        }
                        com.alightcreative.app.motion.persist.xfY v12_22 = v12_20.ak.getAdapter();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v12_22, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.mediabrowser.VisualMediaListRecyclerAdapter");
                        com.alightcreative.app.motion.persist.xfY v12_23 = ((com.alightcreative.app.motion.activities.mediabrowser.A) v12_22);
                        if (kotlin.jvm.internal.Intrinsics.areEqual(v12_23.db(), p11.db)) {
                            if ((v3_1.size() != v12_23.l().size()) || (v3_1.containsAll(v12_23.l()))) {
                                v12_23.K(v3_1);
                                v12_23.T();
                                if (v12_23.w() != -1) {
                                    p11 = p11.ygC(v12_23.cLW(v12_23.w()));
                                }
                                v12_23.notifyDataSetChanged();
                                p11 = p11.kBB(Integer.valueOf(v12_23.FT().size()));
                            }
                        } else {
                            com.alightcreative.app.motion.persist.xfY v12_29 = p11.H;
                            if (v12_29 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                v12_29 = 0;
                            }
                            v12_29.ak.setAdapter(new com.alightcreative.app.motion.activities.mediabrowser.A(p11.db, v3_1, new com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$h(p11), new com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$XSt(p11), p11.R));
                            com.alightcreative.app.motion.persist.xfY v12_31 = p11.H;
                            if (v12_31 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                v12_31 = 0;
                            }
                            com.alightcreative.app.motion.persist.xfY v12_33 = v12_31.ak.getAdapter();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(v12_33, "null cannot be cast to non-null type com.alightcreative.app.motion.activities.mediabrowser.VisualMediaListRecyclerAdapter");
                            ((com.alightcreative.app.motion.activities.mediabrowser.A) v12_33).FT().add(kotlin.collections.CollectionsKt.first(v3_1));
                            p11 = p11.ygC(((tI.Gc) kotlin.collections.CollectionsKt.first(v3_1))).kBB(0);
                        }
                    }
                    com.alightcreative.app.motion.persist.xfY v12_41 = ((Iterable) com.alightcreative.app.motion.persist.xfY.INSTANCE.getInstalledAppVersions());
                    if ((!(v12_41 instanceof java.util.Collection)) || (!((java.util.Collection) v12_41).isEmpty())) {
                        com.alightcreative.app.motion.persist.xfY v12_42 = v12_41.iterator();
                        while (v12_42.hasNext()) {
                            if (kotlin.text.StringsKt.startsWith$default(((String) v12_42.next()), "3.", 0, 2, 0)) {
                                if (!kotlin.text.StringsKt.startsWith$default("5.0.273.1028417", "4.", 0, 2, 0)) {
                                    break;
                                }
                                com.alightcreative.app.motion.persist.xfY v12_45 = com.alightcreative.app.motion.persist.xfY.INSTANCE;
                                if (v12_45.getShowMBTooltip()) {
                                    break;
                                }
                                androidx.appcompat.widget.AppCompatTextView v0_30 = p11.H;
                                if (v0_30 != null) {
                                    v9 = v0_30;
                                } else {
                                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                }
                                androidx.appcompat.widget.AppCompatTextView v0_31 = v9.q;
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_31, "albumTitle");
                                String v1_16 = p11.getString(2132020416);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_16, "getString(...)");
                                FKt.pD.cLW(v0_31, p11, v1_16);
                                v12_45.setShowMBTooltip(1);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void qQf(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p6, android.view.View p7)
    {
        p7.setActivated((p7.isActivated() ^ 1));
        if (p7.isActivated()) {
            p6.f = p6.ak;
        }
        com.alightcreative.app.motion.activities.mediabrowser.A v2_0 = 0;
        if (!p7.isActivated()) {
            androidx.recyclerview.widget.RecyclerView$c v0_2 = p6.H;
            if (v0_2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_2 = 0;
            }
            v0_2.IB.setText(com.alightcreative.app.motion.scene.TimeKt.formatFrameNumber(p6.ak, (p6.E * 100), "mm:ss:ff"));
        }
        androidx.recyclerview.widget.RecyclerView$c v0_5 = p6.H;
        if (v0_5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_5 = 0;
        }
        androidx.recyclerview.widget.RecyclerView$c v0_7 = v0_5.ak.getAdapter();
        if ((v0_7 instanceof com.alightcreative.app.motion.activities.mediabrowser.A)) {
            v2_0 = ((com.alightcreative.app.motion.activities.mediabrowser.A) v0_7);
        }
        if (v2_0 != null) {
            v2_0.Bb(p7.isActivated(), p6.f);
        }
        return;
    }

    private static final void qxC(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p1, android.view.View p2)
    {
        if (p1.fdD()) {
            p1.jE(-1082130432, 1, 1, 1);
        }
        return;
    }

    public static synthetic kotlin.Unit r7(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.rPC(p0);
    }

    private static final kotlin.Unit rPC(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p2)
    {
        p2.z.removeCallbacks(p2.d);
        p2.A();
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit s(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        p0.A();
        return kotlin.Unit.INSTANCE;
    }

    private final void sw(android.animation.Animator p2, kotlin.jvm.functions.Function1 p3)
    {
        p2.addListener(new com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$K(p3));
        return;
    }

    public static synthetic void tEh(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.widget.ListPopupWindow p1, android.widget.AdapterView p2, android.view.View p3, int p4, long p5)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.TT1(p0, p1, p2, p3, p4, p5);
        return;
    }

    private final void u(tI.Gc p8, boolean p9)
    {
        int v0_0 = this.H;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        nVu.yOQ v4_0;
        int v3_0 = 0;
        if (p9 == null) {
            v4_0 = 8;
        } else {
            v4_0 = 0;
        }
        v0_0.Bb.setVisibility(v4_0);
        int v0_1 = this.H;
        if (v0_1 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_1 = 0;
        }
        if (p9 == null) {
            v3_0 = 4;
        }
        v0_1.l.setVisibility(v3_0);
        int v0_3 = this.H;
        if (v0_3 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_3 = 0;
        }
        int v0_6;
        int v0_5 = v0_3.ak.getAdapter();
        if (!(v0_5 instanceof com.alightcreative.app.motion.activities.mediabrowser.A)) {
            v0_6 = 0;
        } else {
            v0_6 = ((com.alightcreative.app.motion.activities.mediabrowser.A) v0_5);
        }
        if (v0_6 != 0) {
            int v3_2 = this.H;
            if (v3_2 == 0) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v3_2 = 0;
            }
            int v3_4 = v3_2.ak.getLayoutManager();
            kotlin.jvm.internal.Intrinsics.checkNotNull(v3_4, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            int v3_6 = ((androidx.recyclerview.widget.GridLayoutManager) v3_4).LQ();
            androidx.recyclerview.widget.GridLayoutManager v6_0 = this.H;
            if (v6_0 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v6_0 = 0;
            }
            androidx.recyclerview.widget.GridLayoutManager v6_2 = v6_0.ak.getLayoutManager();
            kotlin.jvm.internal.Intrinsics.checkNotNull(v6_2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            int v5_1 = ((androidx.recyclerview.widget.GridLayoutManager) v6_2).mk();
            v0_6.x1(p9);
            if (v3_6 >= 4) {
                v3_6 -= 4;
            }
            if (v5_1 < (v0_6.l().size() - 4)) {
                v5_1 += 4;
            }
            if (v3_6 <= v5_1) {
                while(true) {
                    Integer v9_4 = v0_6.cLW(v3_6);
                    nVu.yOQ v4_2 = this.H;
                    if (v4_2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v4_2 = 0;
                    }
                    nVu.yOQ v4_4 = v4_2.ak.findViewHolderForAdapterPosition(v3_6);
                    if (v4_4 != null) {
                        v0_6.nvG(((com.alightcreative.app.motion.activities.mediabrowser.A$xfY) v4_4).pM1(), v3_6, v9_4);
                    } else {
                        v0_6.notifyItemChanged(v3_6);
                    }
                    if (v3_6 == v5_1) {
                        break;
                    }
                    v3_6++;
                }
            }
            this.kBB(Integer.valueOf(v0_6.FT().size()));
            if (p8 != null) {
                this.ygC(p8);
            }
        }
        return;
    }

    public static synthetic kotlin.Pair uM(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.S6(p0);
    }

    public static synthetic void uq6(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.pL(p0, p1);
        return;
    }

    private static final kotlin.Unit v9(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        p0.C4W();
        return kotlin.Unit.INSTANCE;
    }

    private static final boolean vy(android.view.View p0, android.view.MotionEvent p1)
    {
        return 1;
    }

    private static final w9w.a9t wH(android.view.View p4, w9w.a9t p5)
    {
        int v0_1 = p5.q(w9w.a9t$Zv9.ojl());
        kotlin.jvm.internal.Intrinsics.checkNotNull(p4);
        p4.setPadding(p4.getPaddingLeft(), v0_1.j, p4.getPaddingRight(), v0_1.x);
        return p5;
    }

    private static final void wll(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p3, android.view.View p4)
    {
        nVu.Y v0 = 0;
        androidx.recyclerview.widget.RecyclerView v3_3 = p3.u(0, 0);
        int v4_4 = v3_3.H;
        if (v4_4 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v4_4 = 0;
        }
        int v4_2;
        int v4_1 = v4_4.ak.getAdapter();
        if (!(v4_1 instanceof com.alightcreative.app.motion.activities.mediabrowser.A)) {
            v4_2 = 0;
        } else {
            v4_2 = ((com.alightcreative.app.motion.activities.mediabrowser.A) v4_1);
        }
        if (v4_2 != 0) {
            androidx.recyclerview.widget.RecyclerView v3_1 = v3_3.H;
            if (v3_1 != null) {
                v0 = v3_1;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v0.ak.smoothScrollToPosition(v4_2.w());
            return;
        } else {
            return;
        }
    }

    public static synthetic void wx(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.V(p0, p1);
        return;
    }

    private static final void y3P(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p7, android.view.View p8)
    {
        FKt.h.cLW(p7, X7.xfY$h.X, 0, 0, new jn.d(p7), 6, 0);
        return;
    }

    private final void ygC(tI.Gc p24)
    {
        androidx.appcompat.widget.AppCompatTextView v2_25 = this.cv;
        if (v2_25 != null) {
            v2_25.pause();
        }
        androidx.appcompat.widget.AppCompatTextView v2_1 = this.H;
        nVu.Y v4_0 = 0;
        if (v2_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v2_1 = 0;
        }
        v2_1.z.GO();
        if (this.fdD()) {
            this.jE(-1082130432, 1, 1, 1);
        }
        androidx.appcompat.widget.AppCompatTextView v2_26 = this.H;
        if (v2_26 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v2_26 = 0;
        }
        androidx.appcompat.widget.AppCompatTextView v2_42;
        androidx.appcompat.widget.AppCompatTextView v2_41 = v2_26.ak.getAdapter();
        if (!(v2_41 instanceof com.alightcreative.app.motion.activities.mediabrowser.A)) {
            v2_42 = 0;
        } else {
            v2_42 = ((com.alightcreative.app.motion.activities.mediabrowser.A) v2_41);
        }
        if (v2_42 != null) {
            void v0_1 = this.kBB(Integer.valueOf(v2_42.FT().size()));
            if (v0_1.jfW()) {
                jn.KLa v6_19 = v0_1.H;
                if (v6_19 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v6_19 = 0;
                }
                long v8_11;
                if (v2_42.FT().size() <= 0) {
                    v8_11 = 0;
                } else {
                    v8_11 = 1;
                }
                v6_19.j.setEnabled(v8_11);
                jn.KLa v6_37 = v0_1.H;
                if (v6_37 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v6_37 = 0;
                }
                long v8_16;
                if (v2_42.FT().size() <= 0) {
                    v8_16 = 0;
                } else {
                    v8_16 = 1;
                }
                v6_37.cD.setEnabled(v8_16);
                jn.KLa v6_40 = v2_42.FT().iterator();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v6_40, "iterator(...)");
                while (v6_40.hasNext()) {
                    long v8_12 = v6_40.next();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v8_12, "next(...)");
                    long v8_13 = ((tI.Gc) v8_12);
                    int v9_7 = v2_42.pM1(v8_13);
                    nVu.yOQ v10_10 = v0_1.H;
                    if (v10_10 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v10_10 = 0;
                    }
                    nVu.yOQ v10_12 = v10_10.ak.findViewHolderForAdapterPosition(v9_7);
                    if (v10_12 != null) {
                        v2_42.nvG(((com.alightcreative.app.motion.activities.mediabrowser.A$xfY) v10_12).pM1(), v9_7, v8_13);
                    }
                }
            }
            jn.KLa v6_43 = com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$CU.$EnumSwitchMapping$0[p24.ak().ordinal()];
            long v8_0 = 4;
            if (v6_43 == 1) {
                androidx.appcompat.widget.AppCompatTextView v2_52 = ((Integer) v2_42.F0().get(v2_42.cLW(v2_42.w()).f()));
                androidx.appcompat.widget.AppCompatImageButton v5_0 = v0_1.H;
                if (v5_0 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v5_0 = 0;
                }
                com.alightcreative.app.motion.activities.mediabrowser.VideoTrimView v14_0;
                if (v2_52 == null) {
                    v14_0 = 0;
                } else {
                    v14_0 = 1;
                }
                v5_0.l.setActivated(v14_0);
                if (v2_52 == null) {
                    androidx.appcompat.widget.AppCompatTextView v2_0 = v0_1.H;
                    if (v2_0 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v2_0 = 0;
                    }
                    v2_0.E.setValue(v0_1.iM(v0_1.ak));
                    androidx.appcompat.widget.AppCompatTextView v2_3 = v0_1.H;
                    if (v2_3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v2_3 = 0;
                    }
                    v2_3.IB.setText(com.alightcreative.app.motion.scene.TimeKt.formatFrameNumber(v0_1.ak, (v0_1.E * 100), "mm:ss:ff"));
                } else {
                    jn.KLa v6_3 = v0_1.H;
                    if (v6_3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v6_3 = 0;
                    }
                    v6_3.E.setValue(v0_1.iM(v2_52.intValue()));
                    jn.KLa v6_5 = v0_1.H;
                    if (v6_5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v6_5 = 0;
                    }
                    v6_5.IB.setText(com.alightcreative.app.motion.scene.TimeKt.formatFrameNumber(v2_52.intValue(), (v0_1.E * 100), "mm:ss:ff"));
                }
                androidx.appcompat.widget.AppCompatTextView v2_9 = v0_1.H;
                if (v2_9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v2_9 = 0;
                }
                v2_9.F.setVisibility(4);
                androidx.appcompat.widget.AppCompatTextView v2_11 = v0_1.H;
                if (v2_11 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v2_11 = 0;
                }
                v2_11.pM1.setVisibility(0);
                androidx.appcompat.widget.AppCompatTextView v2_13 = v0_1.H;
                if (v2_13 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v2_13 = 0;
                }
                v2_13.Z5u.setVisibility(8);
                androidx.appcompat.widget.AppCompatTextView v2_15 = v0_1.H;
                if (v2_15 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v2_15 = 0;
                }
                if (v0_1.jfW()) {
                    v8_0 = 0;
                }
                v2_15.l.setVisibility(v8_0);
                androidx.appcompat.widget.AppCompatImageButton v5_6 = nk.c.hUw;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(p24.f().getScheme(), v5_6.j())) {
                    androidx.appcompat.widget.AppCompatTextView v2_21 = v0_1.H;
                    if (v2_21 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v2_21 = 0;
                    }
                    v2_21.X.setVisibility(8);
                    androidx.appcompat.widget.AppCompatTextView v2_23 = v0_1.H;
                    if (v2_23 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v2_23 = 0;
                    }
                    v2_23.FT.setVisibility(0);
                    androidx.appcompat.widget.AppCompatTextView v2_28 = com.facebook.imagepipeline.request.ImageRequestBuilder.Q(p24.f());
                    v2_28.R(1);
                    androidx.appcompat.widget.AppCompatTextView v2_29 = v2_28.hUw();
                    androidx.appcompat.widget.AppCompatImageButton v5_7 = v0_1.H;
                    if (v5_7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_7 = 0;
                    }
                    v5_7.FT.setImageRequest(v2_29);
                } else {
                    androidx.appcompat.widget.AppCompatTextView v2_30 = v0_1.H;
                    if (v2_30 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v2_30 = 0;
                    }
                    v2_30.X.setVisibility(0);
                    androidx.appcompat.widget.AppCompatTextView v2_32 = v0_1.H;
                    if (v2_32 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v2_32 = 0;
                    }
                    v2_32.FT.setVisibility(8);
                    androidx.appcompat.widget.AppCompatTextView v2_34 = v0_1.H;
                    if (v2_34 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v2_34 = 0;
                    }
                    v2_34.X.setImageBitmap(v5_6.H(p24.f()));
                }
                androidx.appcompat.widget.AppCompatTextView v2_36 = v0_1.H;
                if (v2_36 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v2_36 = 0;
                }
                v2_36.LV.setVisibility(0);
                androidx.appcompat.widget.AppCompatTextView v2_39 = v0_1.H;
                if (v2_39 != null) {
                    v4_0 = v2_39;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                v4_0.Q.setText(String.valueOf(p24.pM1()));
                return;
            } else {
                if (v6_43 == 2) {
                    aQP.MY v13_0;
                    jn.KLa v6_11 = ((kotlin.Pair) v2_42.ah().get(p24.f()));
                    nVu.yOQ v10_9 = new kotlin.jvm.internal.Ref$LongRef();
                    long v11 = 0;
                    if (v6_11 == null) {
                        v13_0 = 0;
                    } else {
                        v13_0 = ((Number) v6_11.getFirst()).longValue();
                    }
                    v10_9.element = v13_0;
                    aQP.MY v13_4 = aQP.MY.j(p24.f());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v13_4, "fromUri(...)");
                    com.alightcreative.app.motion.activities.mediabrowser.VideoTrimView v14_3 = v0_1.H;
                    if (v14_3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v14_3 = 0;
                    }
                    v14_3.F.setVisibility(0);
                    com.alightcreative.app.motion.activities.mediabrowser.VideoTrimView v14_5 = v0_1.H;
                    if (v14_5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v14_5 = 0;
                    }
                    v14_5.pM1.setVisibility(8);
                    com.alightcreative.app.motion.activities.mediabrowser.VideoTrimView v14_7 = v0_1.H;
                    if (v14_7 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v14_7 = 0;
                    }
                    v14_7.Z5u.setVisibility(4);
                    long v8_1 = v0_1.H;
                    if (v8_1 == 0) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v8_1 = 0;
                    }
                    v8_1.Z5u.setImageDrawable(v0_1.getResources().getDrawable(2131231966, v0_1.getTheme()));
                    androidx.appcompat.widget.AppCompatImageButton v5_12 = v0_1.H;
                    if (v5_12 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_12 = 0;
                    }
                    v5_12.X.setVisibility(8);
                    androidx.appcompat.widget.AppCompatImageButton v5_14 = v0_1.H;
                    if (v5_14 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_14 = 0;
                    }
                    v5_14.FT.setVisibility(8);
                    androidx.appcompat.widget.AppCompatImageButton v5_16 = v0_1.H;
                    if (v5_16 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_16 = 0;
                    }
                    v5_16.z.setVisibility(0);
                    androidx.appcompat.widget.AppCompatImageButton v5_18 = v0_1.H;
                    if (v5_18 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_18 = 0;
                    }
                    v5_18.MgY.setInTime(0);
                    androidx.appcompat.widget.AppCompatImageButton v5_20 = v0_1.H;
                    if (v5_20 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_20 = 0;
                    }
                    v5_20.MgY.setOutTime(p24.l());
                    androidx.appcompat.widget.AppCompatImageButton v5_22 = v0_1.H;
                    if (v5_22 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_22 = 0;
                    }
                    v5_22.MgY.setImageUri(0);
                    androidx.appcompat.widget.AppCompatImageButton v5_24 = v0_1.H;
                    if (v5_24 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_24 = 0;
                    }
                    v5_24.MgY.setVideoUri(p24.f());
                    androidx.appcompat.widget.AppCompatImageButton v5_26 = v0_1.H;
                    if (v5_26 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_26 = 0;
                    }
                    androidx.appcompat.widget.AppCompatImageButton v5_27 = v5_26.MgY;
                    long v8_6 = ((int) p24.l());
                    int v9_0 = v0_1.H;
                    if (v9_0 == 0) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v9_0 = 0;
                    }
                    v5_27.j(0, 0, v8_6, 0, Math.max(((int) (((float) v9_0.MgY.getWidth()) / (((float) p24.l()) / 1148846080))), 1));
                    androidx.appcompat.widget.AppCompatImageButton v5_28 = v0_1.H;
                    if (v5_28 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_28 = 0;
                    }
                    long v17_1;
                    com.alightcreative.app.motion.activities.mediabrowser.VideoTrimView v14_14 = v5_28.d;
                    long v15_2 = p24.l();
                    if (v6_11 == null) {
                        v17_1 = 0;
                    } else {
                        v17_1 = ((Number) v6_11.getFirst()).longValue();
                    }
                    if (v6_11 != null) {
                        v11 = ((Number) v6_11.getSecond()).longValue();
                    }
                    v14_14.uKP(v15_2, v17_1, v11);
                    androidx.appcompat.widget.AppCompatImageButton v5_33 = v0_1.H;
                    if (v5_33 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_33 = 0;
                    }
                    v5_33.d.invalidate();
                    androidx.appcompat.widget.AppCompatImageButton v5_35 = v0_1.H;
                    if (v5_35 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_35 = 0;
                    }
                    v5_35.d.setOnBeginTouch(new jn.Uk(v0_1));
                    androidx.appcompat.widget.AppCompatImageButton v5_37 = v0_1.H;
                    if (v5_37 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_37 = 0;
                    }
                    v5_37.d.setOnTrimming(new jn.VI(v2_42, v10_9, v0_1));
                    androidx.appcompat.widget.AppCompatImageButton v5_39 = v0_1.H;
                    if (v5_39 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_39 = 0;
                    }
                    v5_39.d.setOnStopTouch(new jn.BM(v0_1, v2_42, p24));
                    androidx.appcompat.widget.AppCompatImageButton v5_41 = v0_1.H;
                    if (v5_41 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_41 = 0;
                    }
                    v5_41.d.setOnDonePlay(new jn.Ep(v0_1));
                    if (v0_1.cv != null) {
                        v0_1 = v0_1.zO();
                    }
                    androidx.appcompat.widget.AppCompatImageButton v5_46 = new androidx.media3.exoplayer.ExoPlayer$A(v0_1).R6();
                    v0_1.cv = v5_46;
                    if (v5_46 != null) {
                        v5_46.ak(new com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$Zv9(v0_1));
                    }
                    androidx.appcompat.widget.AppCompatImageButton v5_47 = v0_1.cv;
                    if (v5_47 != null) {
                        v5_47.hUw(oxn.kh.cD);
                    }
                    androidx.appcompat.widget.AppCompatImageButton v5_48 = v0_1.H;
                    if (v5_48 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_48 = 0;
                    }
                    v5_48.z.setPlayer(v0_1.cv);
                    androidx.appcompat.widget.AppCompatImageButton v5_50 = v0_1.cv;
                    if (v5_50 != null) {
                        v5_50.uKP();
                    }
                    androidx.appcompat.widget.AppCompatImageButton v5_51 = v0_1.cv;
                    if (v5_51 != null) {
                        v5_51.AI(v13_4);
                    }
                    androidx.appcompat.widget.AppCompatImageButton v5_52 = v0_1.cv;
                    if (v5_52 != null) {
                        v5_52.H();
                    }
                    androidx.appcompat.widget.AppCompatImageButton v5_53 = v0_1.cv;
                    if (v5_53 != null) {
                        v5_53.e(v10_9.element);
                    }
                    androidx.appcompat.widget.AppCompatImageButton v5_54 = v0_1.H;
                    if (v5_54 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_54 = 0;
                    }
                    v5_54.z.setOnTouchListener(new jn.uS());
                    androidx.appcompat.widget.AppCompatImageButton v5_56 = v0_1.H;
                    if (v5_56 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_56 = 0;
                    }
                    v5_56.z.setOnClickListener(new jn.LxM(v0_1, v10_9, v2_42, p24));
                    androidx.appcompat.widget.AppCompatImageButton v5_58 = v0_1.H;
                    if (v5_58 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v5_58 = 0;
                    }
                    v5_58.Z5u.setOnClickListener(new jn.KLa(v0_1, v2_42, p24, v10_9));
                    androidx.appcompat.widget.AppCompatTextView v2_43 = v0_1.H;
                    if (v2_43 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v2_43 = 0;
                    }
                    v2_43.LV.setVisibility(0);
                    androidx.appcompat.widget.AppCompatTextView v2_45 = v0_1.H;
                    if (v2_45 != null) {
                        v4_0 = v2_45;
                    } else {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    }
                    v4_0.Q.setText(String.valueOf(p24.pM1()));
                    return;
                } else {
                    if (v6_43 == 3) {
                        androidx.appcompat.widget.AppCompatTextView v2_48 = p24.X();
                        if (v2_48 != null) {
                            kotlin.Unit v1_5 = p24.H();
                            if (v1_5 == null) {
                                v1_5 = "?";
                            }
                            com.alightcreative.app.motion.persist.xfY v3_1 = v0_1.getResources().getString(2132017291);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v3_1, "getString(...)");
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(v2_48, "All")) {
                                v0_1.db = v2_48;
                                v0_1.w = v1_5;
                                com.alightcreative.app.motion.persist.xfY v3_2 = com.alightcreative.app.motion.persist.xfY.INSTANCE;
                                v3_2.setMediaBucketID(v2_48);
                                v3_2.setMediaBucketName(v1_5);
                            } else {
                                v0_1.db = "All";
                                v0_1.w = v3_1;
                                kotlin.Unit v1_6 = com.alightcreative.app.motion.persist.xfY.INSTANCE;
                                v1_6.setMediaBucketID("All");
                                v1_6.setMediaBucketName(v3_1);
                            }
                            v0_1.C4W();
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        return;
    }

    public static synthetic kotlin.Unit yy(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0)
    {
        return com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.WJ(p0);
    }

    public static synthetic void z2f(com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.qQf(p0, p1);
        return;
    }

    private static final kotlin.Unit z8(com.alightcreative.app.motion.activities.mediabrowser.A p1, kotlin.jvm.internal.Ref$LongRef p2, com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser p3, long p4)
    {
        if (p1.cLW(p1.w()).ak() == tI.nn.H) {
            p2.element = p4;
            kotlin.Unit v1_4 = p3.cv;
            if (v1_4 != null) {
                v1_4.e(p4);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    private final void zO()
    {
        android.os.Handler v0_0 = this.cv;
        if (v0_0 != null) {
            if (v0_0 != null) {
                v0_0.release();
            }
            this.cv = 0;
            com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$AWD v1_0 = this.H;
            if (v1_0 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v1_0 = 0;
            }
            v1_0.z.GO();
            com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser.e = 0;
            this.z.removeCallbacks(this.d);
        }
        return;
    }

    public final TV.n CB()
    {
        int v0_0 = this.X;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
            return 0;
        } else {
            return v0_0;
        }
    }

    public void jE(float p7, boolean p8, boolean p9, boolean p10)
    {
        int v0 = this.l;
        int v1_0 = this.H;
        long v2_1 = 0;
        if (v1_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_0 = 0;
        }
        int v1_1 = (v1_0.FT.getHeight() + this.l);
        if (p9 != 0) {
            long v4_2 = this.H;
            if (v4_2 == 0) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v4_2 = 0;
            }
            if (v4_2.ak.getHeight() == v0) {
                return;
            }
        }
        long v4_5 = this.l;
        int v5_0 = this.H;
        if (v5_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v5_0 = 0;
        }
        long v4_6 = (v4_5 + (v5_0.FT.getHeight() / 3));
        if (p8 == null) {
            jn.Z v8_6 = this.H;
            if (v8_6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v8_6 = 0;
            }
            jn.Z v8_8 = v8_6.ak.getLayoutParams();
            int v9_1 = this.H;
            if (v9_1 == 0) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v9_1 = 0;
            }
            v8_8.height = (v9_1.ak.getHeight() - ((int) p7));
            androidx.recyclerview.widget.RecyclerView v7_2 = this.H;
            if (v7_2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v7_2 = 0;
            }
            v7_2.ak.setLayoutParams(v8_8);
            androidx.recyclerview.widget.RecyclerView v7_4 = this.H;
            if (v7_4 != null) {
                v2_1 = v7_4;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v2_1.ak.requestLayout();
            return;
        } else {
            if ((!p10) || (p9 == 0)) {
                if (!p10) {
                    androidx.recyclerview.widget.RecyclerView v7_6 = this.H;
                    if (v7_6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v7_6 = 0;
                    }
                    if ((v7_6.ak.getHeight() - v4_6) < 0) {
                        v1_1 = v0;
                    }
                }
            }
            androidx.recyclerview.widget.RecyclerView v7_10 = this.H;
            if (v7_10 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v7_10 = 0;
            }
            androidx.recyclerview.widget.RecyclerView v7_14 = android.animation.ValueAnimator.ofInt(new int[] {v7_10.ak.getHeight(), v1_1}));
            v7_14.setInterpolator(new android.view.animation.OvershootInterpolator());
            jn.Z v8_11 = this.H;
            if (v8_11 != null) {
                v2_1 = v8_11;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v7_14.setDuration((((long) Math.abs((v2_1.ak.getHeight() - v1_1))) / ((long) 2)));
            v7_14.addUpdateListener(new jn.eWj(this));
            kotlin.jvm.internal.Intrinsics.checkNotNull(v7_14);
            this.sw(v7_14, new jn.Z(p9, this, v1_1, v0));
            v7_14.start();
            return;
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

    public void onBackPressed()
    {
        if (!this.jfW()) {
            super.onBackPressed();
            return;
        } else {
            this.u(0, 0);
            return;
        }
    }

    protected void onCreate(android.os.Bundle p9)
    {
        super.onCreate(p9);
        android.widget.TextView v9_3 = nVu.Y.cD(this.getLayoutInflater());
        this.H = v9_3;
        nVu.Y v1 = 0;
        if (v9_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_3 = 0;
        }
        this.setContentView(v9_3.j());
        android.widget.TextView v9_15 = this.H;
        if (v9_15 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_15 = 0;
        }
        android.widget.TextView v9_52;
        w9w.Xo.If(v9_15.j(), new jn.Tn());
        android.widget.TextView v9_44 = this.getIntent();
        int v2_2 = 0;
        if (v9_44 == null) {
            v9_52 = 0;
        } else {
            v9_52 = v9_44.getBooleanExtra("MediaFillMode", 0);
        }
        this.R = v9_52;
        android.widget.TextView v9_61 = this.getIntent();
        boolean v3_10 = 30;
        if (v9_61 != null) {
            v3_10 = v9_61.getIntExtra("projectFPS", 30);
        }
        android.widget.TextView v9_63;
        this.E = v3_10;
        android.widget.TextView v9_62 = this.getIntent();
        if (v9_62 == null) {
            v9_63 = 0;
        } else {
            v9_63 = v9_62.getStringExtra("projectId");
        }
        this.ah = v9_63;
        this.Q = (this.E * 10);
        android.widget.TextView v9_66 = this.H;
        if (v9_66 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_66 = 0;
        }
        v9_66.uKP.setOnClickListener(new jn.MY(this));
        android.widget.TextView v9_68 = this.H;
        if (v9_68 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_68 = 0;
        }
        v9_68.R.setOnClickListener(new jn.hz8(this));
        android.widget.TextView v9_70 = this.H;
        if (v9_70 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_70 = 0;
        }
        v9_70.x.setOnClickListener(new jn.q(this));
        android.widget.TextView v9_72 = this.H;
        if (v9_72 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_72 = 0;
        }
        v9_72.cD.setOnClickListener(new jn.Ki(this));
        android.widget.TextView v9_74 = this.H;
        if (v9_74 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_74 = 0;
        }
        v9_74.j.setOnClickListener(new jn.Sq(this));
        android.widget.TextView v9_76 = this.H;
        if (v9_76 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_76 = 0;
        }
        v9_76.f.setEnabled((this.R ^ 1));
        android.widget.TextView v9_1 = this.H;
        if (v9_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_1 = 0;
        }
        v9_1.f.setOnClickListener(new jn.Y(this));
        android.widget.TextView v9_4 = this.H;
        if (v9_4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_4 = 0;
        }
        v9_4.K.setOnClickListener(new jn.soy(this));
        android.widget.TextView v9_6 = this.H;
        if (v9_6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_6 = 0;
        }
        android.widget.TextView v9_7 = v9_6.ak;
        v9_7.getViewTreeObserver().addOnGlobalLayoutListener(new com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$qfV(v9_7, this));
        android.widget.TextView v9_8 = this.H;
        if (v9_8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_8 = 0;
        }
        v9_8.ak.addOnItemTouchListener(new jn.WHS(this, this));
        this.kBB(0);
        android.widget.TextView v9_11 = this.H;
        if (v9_11 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_11 = 0;
        }
        v9_11.H.setOnClickListener(new jn.uZ5(this));
        android.widget.TextView v9_13 = this.H;
        if (v9_13 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_13 = 0;
        }
        v9_13.T.setOnClickListener(new jn.s(this));
        android.widget.TextView v9_16 = this.H;
        if (v9_16 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_16 = 0;
        }
        v9_16.l.setOnClickListener(new jn.g(this));
        this.ak = kotlin.math.MathKt.roundToInt(((((float) com.alightcreative.app.motion.activities.ReB.hUw()) / 1148846080) * ((float) this.E)));
        android.widget.TextView v9_23 = this.H;
        if (v9_23 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_23 = 0;
        }
        v9_23.E.setMinValue(1);
        android.widget.TextView v9_25 = this.H;
        if (v9_25 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_25 = 0;
        }
        v9_25.E.setMaxValue(((this.E * 10) + 50));
        android.widget.TextView v9_27 = this.H;
        if (v9_27 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_27 = 0;
        }
        v9_27.E.setValue(this.ak);
        android.widget.TextView v9_29 = this.H;
        if (v9_29 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_29 = 0;
        }
        v9_29.IB.setText(com.alightcreative.app.motion.scene.TimeKt.formatFrameNumber(this.ak, (this.E * 100), "mm:ss:ff"));
        android.widget.TextView v9_33 = this.H;
        if (v9_33 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_33 = 0;
        }
        v9_33.E.setLimitRange(1);
        android.widget.TextView v9_35 = this.H;
        if (v9_35 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_35 = 0;
        }
        v9_35.E.setOnStartTrackingTouch(new jn.vp());
        android.widget.TextView v9_37 = this.H;
        if (v9_37 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_37 = 0;
        }
        v9_37.E.setOnStopTrackingTouch(new jn.PA(this));
        android.widget.TextView v9_39 = this.H;
        if (v9_39 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_39 = 0;
        }
        v9_39.E.setOnSpinAbs(new jn.tqK(this));
        android.widget.TextView v9_41 = this.H;
        if (v9_41 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_41 = 0;
        }
        android.widget.TextView v9_42 = v9_41.MgY;
        v9_42.getViewTreeObserver().addOnGlobalLayoutListener(new com.alightcreative.app.motion.activities.mediabrowser.MediaBrowser$Enc(v9_42, this));
        android.widget.TextView v9_43 = this.H;
        if (v9_43 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_43 = 0;
        }
        v9_43.ojl.setOnClickListener(new jn.n(this));
        android.widget.TextView v9_46 = this.H;
        if (v9_46 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_46 = 0;
        }
        android.widget.TextView v9_47 = v9_46.ak;
        int v4_33 = new androidx.recyclerview.widget.GridLayoutManager(this, 4);
        v4_33.ss(10);
        v4_33.rPC(1);
        v9_47.setLayoutManager(v4_33);
        android.widget.TextView v9_48 = this.H;
        if (v9_48 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_48 = 0;
        }
        v9_48.LV.setOnClickListener(new jn.Bt(this));
        android.widget.TextView v9_50 = this.H;
        if (v9_50 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_50 = 0;
        }
        v9_50.FT.setOnClickListener(new jn.aW8(this));
        android.widget.TextView v9_53 = this.H;
        if (v9_53 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_53 = 0;
        }
        boolean v3_5;
        if (!this.R) {
            v3_5 = 8;
        } else {
            v3_5 = 0;
        }
        v9_53.cLW.setVisibility(v3_5);
        android.widget.TextView v9_55 = this.H;
        if (v9_55 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_55 = 0;
        }
        v9_55.cLW.setOnTouchListener(new jn.go());
        android.widget.TextView v9_57 = this.H;
        if (v9_57 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_57 = 0;
        }
        if (fx.c.pM1(this)) {
            v2_2 = 8;
        }
        v9_57.jE.setVisibility(v2_2);
        android.widget.TextView v9_59 = this.H;
        if (v9_59 != null) {
            v1 = v9_59;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1.F0.setOnClickListener(new jn.x(this));
        return;
    }

    protected void onPause()
    {
        this.zO();
        com.alightcreative.app.motion.activities.ReB.R6(this.JHw(this.ak));
        super.onPause();
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
            TV.n v1 = this.CB();
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
            String v11_4 = this.ah;
            if (v11_4 == null) {
                v13_1 = 0;
            } else {
                v13_1 = new String[1];
                v13_1[0] = v11_4;
            }
            FKt.vp.cD(v1, v2, oqG.c.x, v13_1, 0, 0, new jn.m(this), 48, 0);
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        this.F.x();
        W9R.m.LV();
        return;
    }

    public final Vbv.c v()
    {
        int v0_0 = this.T;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("iapManager");
            return 0;
        } else {
            return v0_0;
        }
    }
}
