package com.alightcreative.export.preview;
public final class ExportPreviewActivity extends com.alightcreative.export.preview.xfY {
    private final vg.A AI;
    private int AM;
    private final android.os.Handler E;
    private int F;
    private int GO;
    private nVu.Zv9 H;
    private android.net.Uri K;
    private int M;
    private androidx.media3.exoplayer.ExoPlayer Q;
    private java.util.List R;
    public Vbv.c T;
    public TV.n X;
    private boolean Zq;
    private ref.WeakReference ah;
    private String ak;
    private long cv;
    private int d;
    public EY.XSt db;
    private final com.alightcreative.export.preview.ExportPreviewActivity$cY e;
    private java.util.List f;
    public nwt.A l;
    private String n;
    public ns.h w;
    private final kotlin.Lazy w0;
    private androidx.media3.ui.PlayerView z;

    static ExportPreviewActivity()
    {
        return;
    }

    public ExportPreviewActivity()
    {
        this.E = new android.os.Handler();
        this.f = new java.util.ArrayList();
        this.R = new java.util.ArrayList();
        this.d = 2131558448;
        this.GO = -1;
        this.AM = -1;
        this.M = -1;
        this.e = new com.alightcreative.export.preview.ExportPreviewActivity$cY(this);
        this.w0 = kotlin.LazyKt.lazy(new KL.cY(this));
        this.AI = this.registerForActivityResult(new M.c(), new KL.c(this));
        return;
    }

    static synthetic void AX(com.alightcreative.export.preview.ExportPreviewActivity p0, int p1, int p2, int p3, Object p4)
    {
        if ((p3 & 2) != 0) {
            p2 = 2131558448;
        }
        p0.wH(p1, p2);
        return;
    }

    public static final synthetic void B(com.alightcreative.export.preview.ExportPreviewActivity p0, com.alightcreative.share.A p1)
    {
        p0.q9c(p1);
        return;
    }

    private final boolean CB()
    {
        return ((Boolean) this.w0.getValue()).booleanValue();
    }

    private static final void EMD(oqG.A p47, int p48, com.alightcreative.export.preview.ExportPreviewActivity p49, int p50, java.io.File p51, java.io.File p52, int p53, boolean p54, android.view.View p55)
    {
        boolean v5_0;
        if (p47 == null) {
            v5_0 = 2131558444;
        } else {
            if (p48 == 2131558444) {
                p49.yy().hUw(new TV.xfY$mh(oqG.A.j(p47, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, oqG.xfY.ojl(sp.VI.j), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2097153, 31, 0)));
            } else {
                if (p48 == 2131558446) {
                    p49.yy().hUw(new TV.xfY$mh(oqG.A.j(p47, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, oqG.xfY.ojl(sp.VI.cD), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2097153, 31, 0)));
                } else {
                    p49.yy().hUw(new TV.xfY$j(p47));
                }
            }
            v5_0 = 2131558444;
        }
        if (p48 != v5_0) {
            p49.qxC(p51, p52, ((String) p49.f.get(p53)), p50, p54, p47);
            return;
        } else {
            FKt.Tn.R6(p49).setPrimaryClip(android.content.ClipData.newPlainText("Alight Motion Project Link", p49.getIntent().getStringExtra("TEMPLATE_LINK")));
            android.widget.Toast.makeText(p49, p50, 0).show();
            return;
        }
    }

    private static final void En(com.alightcreative.export.preview.ExportPreviewActivity$CU p0, com.alightcreative.export.preview.ExportPreviewActivity p1, androidx.recyclerview.widget.LinearLayoutManager p2, android.view.View p3)
    {
        p0.l((p1.F + 1));
        p2.zO(p0);
        return;
    }

    public static final synthetic void Ie(com.alightcreative.export.preview.ExportPreviewActivity p0, int p1)
    {
        p0.F = p1;
        return;
    }

    public static synthetic void If(com.alightcreative.export.preview.ExportPreviewActivity p0, android.view.View p1)
    {
        com.alightcreative.export.preview.ExportPreviewActivity.jfW(p0, p1);
        return;
    }

    private static final boolean JHw(com.alightcreative.export.preview.ExportPreviewActivity p0, android.view.View p1, android.view.MotionEvent p2)
    {
        if (p2.getAction() == 1) {
            android.widget.ImageButton v0_1 = p0.H;
            if (v0_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_1 = 0;
            }
            v0_1.IB.performClick();
        }
        return 1;
    }

    public static final synthetic void Jju(com.alightcreative.export.preview.ExportPreviewActivity p0, long p1)
    {
        p0.cv = p1;
        return;
    }

    public static synthetic void Jm(int p0, oqG.A p1, com.alightcreative.export.preview.ExportPreviewActivity p2, int p3, String p4, android.view.View p5)
    {
        com.alightcreative.export.preview.ExportPreviewActivity.TT1(p0, p1, p2, p3, p4, p5);
        return;
    }

    private static final void KE(kotlin.jvm.internal.Ref$IntRef p5, com.alightcreative.export.preview.ExportPreviewActivity p6, KL.MY p7, int p8, android.view.View p9)
    {
        p5.element = (p5.element - 1);
        int v9_4 = p6.H;
        nVu.Zv9 v0 = 0;
        if (v9_4 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_4 = 0;
        }
        v9_4.db.setImageBitmap(p7.hUw(p5.element));
        StringBuilder v7_2 = p6.H;
        if (v7_2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v7_2 = 0;
        }
        int v9_3;
        int v2_1 = 0;
        if (p5.element == 0) {
            v9_3 = 0;
        } else {
            v9_3 = 1;
        }
        v7_2.FT.setEnabled(v9_3);
        StringBuilder v7_4 = p6.H;
        if (v7_4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v7_4 = 0;
        }
        if (p5.element != (p8 - 1)) {
            v2_1 = 1;
        }
        v7_4.l.setEnabled(v2_1);
        android.widget.TextView v6_1 = p6.H;
        if (v6_1 != null) {
            v0 = v6_1;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        android.widget.TextView v6_2 = v0.w;
        String v5_2 = (p5.element + 1);
        StringBuilder v7_7 = new StringBuilder();
        v7_7.append(v5_2);
        v7_7.append("/");
        v7_7.append(p8);
        v6_2.setText(v7_7.toString());
        return;
    }

    private final void MMm()
    {
        android.widget.ProgressBar v0_0 = this.H;
        int v1_0 = 0;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.f.setVisibility(0);
        android.widget.ProgressBar v0_3 = this.H;
        if (v0_3 != null) {
            v1_0 = v0_3;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1_0.K.setVisibility(4);
        return;
    }

    public static synthetic void N(com.alightcreative.export.preview.ExportPreviewActivity p0, androidx.activity.result.ActivityResult p1)
    {
        com.alightcreative.export.preview.ExportPreviewActivity.qQf(p0, p1);
        return;
    }

    private final void Odv(java.io.File p10)
    {
        KL.MY v0_1 = new KL.MY(p10);
        int v10_1 = v0_1.j();
        if (v10_1 > 0) {
            kotlin.jvm.internal.Ref$IntRef v1_1 = new kotlin.jvm.internal.Ref$IntRef();
            android.widget.ImageButton v2_0 = this.H;
            KL.XSt v3_0 = 0;
            if (v2_0 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v2_0 = 0;
            }
            android.widget.ImageButton v2_1 = v2_0.w;
            int v6 = 1;
            KL.h v5_1 = (v1_1.element + 1);
            int v7_1 = new StringBuilder();
            v7_1.append(v5_1);
            v7_1.append("/");
            v7_1.append(v10_1);
            v2_1.setText(v7_1.toString());
            android.widget.ImageButton v2_2 = this.H;
            if (v2_2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v2_2 = 0;
            }
            v2_2.db.setImageBitmap(v0_1.hUw(0));
            android.widget.ImageButton v2_4 = this.H;
            if (v2_4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v2_4 = 0;
            }
            int v7_4;
            if (v1_1.element == 0) {
                v7_4 = 0;
            } else {
                v7_4 = 1;
            }
            v2_4.FT.setEnabled(v7_4);
            android.widget.ImageButton v2_6 = this.H;
            if (v2_6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v2_6 = 0;
            }
            if (v1_1.element == (v10_1 - 1)) {
                v6 = 0;
            }
            v2_6.l.setEnabled(v6);
            android.widget.ImageButton v2_8 = this.H;
            if (v2_8 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v2_8 = 0;
            }
            v2_8.FT.setOnClickListener(new KL.h(v1_1, this, v0_1, v10_1));
            android.widget.ImageButton v2_10 = this.H;
            if (v2_10 != null) {
                v3_0 = v2_10;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v3_0.l.setOnClickListener(new KL.XSt(v1_1, this, v0_1, v10_1));
            return;
        } else {
            return;
        }
    }

    private final void PC0()
    {
        this.yy().hUw(TV.xfY$pQK.hUw);
        int v0_5 = this.Frn().invoke();
        if ((v0_5 == 0) || (v0_5.d() != 1)) {
            this.Z0().IB(EY.Gc.hUw, new KL.Enc(this));
            return;
        } else {
            QdR.K.x(androidx.lifecycle.uZ5.hUw(this), 0, 0, new com.alightcreative.export.preview.ExportPreviewActivity$xfY(this, 0), 3, 0);
            return;
        }
    }

    public static final synthetic long Pg(com.alightcreative.export.preview.ExportPreviewActivity p2)
    {
        return p2.cv;
    }

    public static synthetic void QR(kotlin.jvm.internal.Ref$IntRef p0, com.alightcreative.export.preview.ExportPreviewActivity p1, KL.MY p2, int p3, android.view.View p4)
    {
        com.alightcreative.export.preview.ExportPreviewActivity.KE(p0, p1, p2, p3, p4);
        return;
    }

    public static synthetic void S(oqG.A p0, int p1, com.alightcreative.export.preview.ExportPreviewActivity p2, int p3, java.io.File p4, java.io.File p5, int p6, boolean p7, android.view.View p8)
    {
        com.alightcreative.export.preview.ExportPreviewActivity.EMD(p0, p1, p2, p3, p4, p5, p6, p7, p8);
        return;
    }

    private static final void S6(android.content.DialogInterface p0, int p1)
    {
        p0.dismiss();
        return;
    }

    public static synthetic boolean ST5(com.alightcreative.export.preview.ExportPreviewActivity p0, android.view.View p1, android.view.MotionEvent p2)
    {
        return com.alightcreative.export.preview.ExportPreviewActivity.JHw(p0, p1, p2);
    }

    private static final void TT1(int p48, oqG.A p49, com.alightcreative.export.preview.ExportPreviewActivity p50, int p51, String p52, android.view.View p53)
    {
        String v2_8;
        if (p48 != 2131558448) {
            v2_8 = SL3.A.x;
        } else {
            v2_8 = SL3.A.cD;
        }
        SL3.A v44 = v2_8;
        int v5_0;
        if (p49 == null) {
            v5_0 = 2131558444;
        } else {
            if (p48 == 2131558444) {
                p50.yy().hUw(new TV.xfY$PY(oqG.A.j(p49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, oqG.xfY.ojl(sp.VI.j), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2097153, 31, 0)));
            } else {
                if (p48 == 2131558446) {
                    p50.yy().hUw(new TV.xfY$PY(oqG.A.j(p49, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, oqG.xfY.ojl(sp.VI.cD), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2097153, 31, 0)));
                } else {
                    p50.yy().hUw(new TV.xfY$CN(p49));
                }
            }
            v5_0 = 2131558444;
        }
        if (p48 != v5_0) {
            com.alightcreative.share.xfY.Bb(p50, ((android.net.Uri) p50.R.get(p51)), ((String) p50.f.get(p51)), p52, p50.yy(), v44, new com.alightcreative.export.preview.ExportPreviewActivity$V(p50));
            return;
        } else {
            com.alightcreative.export.preview.ExportPreviewActivity v0_7 = p50.getIntent().getStringExtra("TEMPLATE_LINK");
            if (v0_7 == null) {
                v0_7 = "";
            }
            com.alightcreative.share.xfY.ak(p50, v0_7, p50.getResources().getText(2132020228).toString(), p50.yy(), 0, 0, 24, 0);
            return;
        }
    }

    private final void W3V(java.util.List p18, java.util.List p19, java.io.File p20)
    {
        int v4 = 1;
        int v6_5 = this.H;
        if (v6_5 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_5 = 0;
        }
        int v6_0 = v6_5.q;
        android.widget.LinearLayout v9_0 = this.H;
        if (v9_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_0 = 0;
        }
        android.widget.LinearLayout v9_1 = v9_0.F0;
        com.facebook.drawee.view.SimpleDraweeView v10_0 = this.H;
        if (v10_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v10_0 = 0;
        }
        com.facebook.drawee.view.SimpleDraweeView v10_1 = v10_0.uKP;
        androidx.constraintlayout.widget.ConstraintLayout v11_0 = this.H;
        if (v11_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v11_0 = 0;
        }
        androidx.constraintlayout.widget.ConstraintLayout v11_1 = v11_0.T;
        android.widget.ImageView v12_0 = this.H;
        if (v12_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v12_0 = 0;
        }
        android.widget.ImageView v12_1 = v12_0.db;
        androidx.recyclerview.widget.RecyclerView v13_0 = this.H;
        if (v13_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v13_0 = 0;
        }
        androidx.recyclerview.widget.RecyclerView v13_1 = v13_0.LV;
        androidx.recyclerview.widget.RecyclerView v14_0 = this.H;
        if (v14_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v14_0 = 0;
        }
        androidx.recyclerview.widget.RecyclerView v14_1 = v14_0.Q;
        android.widget.ImageButton v15_0 = this.H;
        if (v15_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v15_0 = 0;
        }
        android.widget.ImageButton v15_1 = v15_0.ah;
        nVu.Zv9 v7_6 = this.H;
        if (v7_6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v7_6 = 0;
        }
        nVu.Zv9 v7_7 = v7_6.E;
        android.widget.ImageButton v2_32 = new android.view.View[9];
        v2_32[0] = v6_0;
        v2_32[1] = v9_1;
        v2_32[2] = v10_1;
        v2_32[3] = v11_1;
        v2_32[4] = v12_1;
        v2_32[5] = v13_1;
        v2_32[6] = v14_1;
        v2_32[7] = v15_1;
        v2_32[8] = v7_7;
        android.widget.ImageButton v2_34 = kotlin.collections.CollectionsKt.listOf(v2_32).iterator();
        while (v2_34.hasNext()) {
            ((android.view.View) v2_34.next()).setVisibility(4);
        }
        android.widget.ImageButton v2_36 = ((String) p18.get(0));
        switch (v2_36.hashCode()) {
            case -1487394660:
                if (v2_36.equals("image/jpeg")) {
                    android.widget.ImageButton v2_27 = this.H;
                    if (v2_27 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v2_27 = 0;
                    }
                    nVu.Zv9 v7_5;
                    v2_27.uKP.setVisibility(0);
                    android.widget.ImageButton v2_29 = this.H;
                    if (v2_29 != null) {
                        v7_5 = v2_29;
                    } else {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v7_5 = 0;
                    }
                    v7_5.uKP.setImageURI(((android.net.Uri) p19.get(0)).toString());
                    return;
                } else {
                }
            case -1248325150:
                if (v2_36.equals("application/zip")) {
                    android.net.Uri v1_11 = this.H;
                    if (v1_11 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v1_11 = 0;
                    }
                    v1_11.T.setVisibility(0);
                    android.net.Uri v1_13 = this.H;
                    if (v1_13 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v1_13 = 0;
                    }
                    nVu.Zv9 v7_4;
                    v1_13.db.setVisibility(0);
                    android.net.Uri v1_16 = this.Odv(p20).H;
                    if (v1_16 != null) {
                        v7_4 = v1_16;
                    } else {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v7_4 = 0;
                    }
                    v7_4.ak.setVisibility(8);
                    return;
                } else {
                }
            case -879267568:
                if (v2_36.equals("image/gif")) {
                    android.widget.ImageButton v2_19 = this.H;
                    if (v2_19 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v2_19 = 0;
                    }
                    nVu.Zv9 v7_3;
                    v2_19.uKP.setVisibility(0);
                    android.net.Uri v1_8 = ((Ax8.XSt) Ax8.CU.H().cv(((android.net.Uri) p19.get(0))).f(1)).cD();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_8, "build(...)");
                    android.widget.ImageButton v2_23 = this.H;
                    if (v2_23 != null) {
                        v7_3 = v2_23;
                    } else {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v7_3 = 0;
                    }
                    v7_3.uKP.setController(v1_8);
                    return;
                } else {
                }
            case -879264467:
                if (v2_36.equals("image/jpg")) {
                } else {
                }
                break;
            case -879258763:
                if (v2_36.equals("image/png")) {
                } else {
                }
                break;
            case 1331848029:
                if (!v2_36.equals("video/mp4")) {
                } else {
                    android.widget.ImageButton v2_38 = this.H;
                    if (v2_38 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v2_38 = 0;
                    }
                    android.widget.ImageButton v2_39 = v2_38.F0;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_39, "previewBottomHolder");
                    v2_39.setVisibility(0);
                    if (p19.size() != 1) {
                        if (!this.CB()) {
                            android.widget.ImageButton v2_0 = this.H;
                            if (v2_0 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                v2_0 = 0;
                            }
                            android.widget.ImageButton v2_1 = v2_0.Q;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_1, "previewItemListTablet");
                            v2_1.setVisibility(0);
                            android.widget.ImageButton v2_2 = this.H;
                            if (v2_2 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                v2_2 = 0;
                            }
                            String v3_2;
                            if (this.F == 0) {
                                v3_2 = 0;
                            } else {
                                v3_2 = 1;
                            }
                            v2_2.ah.setEnabled(v3_2);
                            android.widget.ImageButton v2_4 = this.H;
                            if (v2_4 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                v2_4 = 0;
                            }
                            if (this.F == (p19.size() - 1)) {
                                v4 = 0;
                            }
                            v2_4.E.setEnabled(v4);
                            android.widget.ImageButton v2_6 = this.H;
                            if (v2_6 == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                v2_6 = 0;
                            }
                            nVu.Zv9 v7_0;
                            android.widget.ImageButton v2_7 = v2_6.ah;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_7, "prevItemButton");
                            v2_7.setVisibility(0);
                            android.widget.ImageButton v2_8 = this.H;
                            if (v2_8 != null) {
                                v7_0 = v2_8;
                            } else {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                v7_0 = 0;
                            }
                            android.widget.ImageButton v2_9 = v7_0.E;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_9, "nextItemButton");
                            v2_9.setVisibility(0);
                        } else {
                            nVu.Zv9 v7_1;
                            android.widget.ImageButton v2_10 = this.H;
                            if (v2_10 != null) {
                                v7_1 = v2_10;
                            } else {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                                v7_1 = 0;
                            }
                            android.widget.ImageButton v2_11 = v7_1.LV;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_11, "previewItemList");
                            v2_11.setVisibility(0);
                        }
                        this.i2(p19);
                        return;
                    } else {
                        android.widget.ImageButton v2_12 = this.H;
                        if (v2_12 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            v2_12 = 0;
                        }
                        nVu.Zv9 v7_2;
                        android.widget.ImageButton v2_13 = v2_12.q;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_13, "exportPlayerView");
                        v2_13.setVisibility(0);
                        android.widget.ImageButton v2_14 = this.H;
                        if (v2_14 != null) {
                            v7_2 = v2_14;
                        } else {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            v7_2 = 0;
                        }
                        this.z = v7_2.q;
                        this.RF(((android.net.Uri) p19.get(0)));
                        return;
                    }
                }
            default:
        }
        return;
    }

    private static final kotlin.Unit Y(com.alightcreative.export.preview.ExportPreviewActivity p1, androidx.activity.qfV p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        p1.finish();
        return kotlin.Unit.INSTANCE;
    }

    private static final void YU(com.alightcreative.export.preview.ExportPreviewActivity$CU p0, com.alightcreative.export.preview.ExportPreviewActivity p1, androidx.recyclerview.widget.LinearLayoutManager p2, android.view.View p3)
    {
        p0.l((p1.F - 1));
        p2.zO(p0);
        return;
    }

    public static synthetic void Z(com.alightcreative.export.preview.ExportPreviewActivity$CU p0, com.alightcreative.export.preview.ExportPreviewActivity p1, androidx.recyclerview.widget.LinearLayoutManager p2, android.view.View p3)
    {
        com.alightcreative.export.preview.ExportPreviewActivity.YU(p0, p1, p2, p3);
        return;
    }

    public static synthetic void Zk(com.alightcreative.export.preview.ExportPreviewActivity$CU p0, com.alightcreative.export.preview.ExportPreviewActivity p1, androidx.recyclerview.widget.LinearLayoutManager p2, android.view.View p3)
    {
        com.alightcreative.export.preview.ExportPreviewActivity.En(p0, p1, p2, p3);
        return;
    }

    private static final String a9(com.alightcreative.share.A p2)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("onShareResult shareInfo=");
        v0_1.append(p2);
        return v0_1.toString();
    }

    private final void b1()
    {
        this.E.removeCallbacks(this.e);
        android.widget.ImageButton v0_3 = this.Q;
        if (v0_3 != null) {
            this.cv = v0_3.getCurrentPosition();
            android.graphics.drawable.Drawable v1_1 = this.H;
            android.content.res.Resources$Theme v3_0 = 0;
            if (v1_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v1_1 = 0;
            }
            v1_1.Bb.setProgress(0);
            android.graphics.drawable.Drawable v1_3 = this.z;
            if (v1_3 != null) {
                v1_3.GO();
            }
            v0_3.release();
            this.Q = 0;
            this.ah = 0;
            android.widget.ImageButton v0_1 = this.H;
            if (v0_1 != null) {
                v3_0 = v0_1;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v3_0.IB.setImageDrawable(zEz.c.q(this.getResources(), 2131231964, this.getTheme()));
            return;
        } else {
            return;
        }
    }

    public static synthetic boolean b9Y(com.alightcreative.export.preview.ExportPreviewActivity p0)
    {
        return com.alightcreative.export.preview.ExportPreviewActivity.v(p0);
    }

    public static final synthetic int cKj(com.alightcreative.export.preview.ExportPreviewActivity p0)
    {
        return p0.F;
    }

    public static final synthetic nVu.Zv9 cak(com.alightcreative.export.preview.ExportPreviewActivity p0)
    {
        return p0.H;
    }

    private final void dDX(int p11, int p12)
    {
        CharSequence v0_0 = this.H;
        int v1_0 = 0;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.f.setImageDrawable(zEz.c.q(this.getResources(), 2131232051, this.getTheme()));
        this.MMm();
        switch (p12) {
            case 2131558448:
            case 2131558449:
                int v3_2 = this.H;
                if (v3_2 == 0) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v3_2 = 0;
                }
                android.widget.LinearLayout v4_0 = v3_2.F0;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_0, "previewBottomHolder");
                PY.qfV.H(v4_0, 200, 0, 2, 0);
                CharSequence v0_8 = this.Q;
                if (v0_8 != null) {
                    v0_8.e(this.cv);
                }
                CharSequence v0_9 = this.H;
                if (v0_9 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v0_9 = 0;
                }
                int v3_5;
                int v3_4 = this.Q;
                if (v3_4 == 0) {
                    v3_5 = 0;
                } else {
                    v3_5 = ((int) v3_4.getCurrentPosition());
                }
                v0_9.Bb.setProgress(v3_5);
                break;
            default:
                int v3_7 = this.H;
                if (v3_7 == 0) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v3_7 = 0;
                }
                android.widget.LinearLayout v4_1 = v3_7.F0;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_1, "previewBottomHolder");
                PY.qfV.x(v4_1, 200, 0, 2, 0);
                CharSequence v0_11 = this.Q;
                if ((v0_11 == null) || (!v0_11.isPlaying())) {
                } else {
                    this.sw();
                }
        }
        switch (p12) {
            case 2131558444:
            case 2131558445:
                int v12_3 = this.H;
                if (v12_3 == 0) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v12_3 = 0;
                }
                v12_3.x1.setText(this.getResources().getText(2132020161));
                int v12_5 = this.H;
                if (v12_5 != 0) {
                    v1_0 = v12_5;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                v1_0.Z5u.setText(this.getResources().getText(2132020222));
                this.wH(p11, 2131558444);
                return;
            case 2131558446:
            case 2131558447:
                int v12_13 = this.H;
                if (v12_13 == 0) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v12_13 = 0;
                }
                v12_13.x1.setText(this.getResources().getText(2132020162));
                int v12_15 = this.H;
                if (v12_15 != 0) {
                    v1_0 = v12_15;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                v1_0.Z5u.setText(this.getResources().getText(2132020223));
                this.wH(p11, 2131558446);
                return;
            case 2131558448:
            case 2131558449:
                int v12_8 = this.H;
                if (v12_8 == 0) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v12_8 = 0;
                }
                v12_8.x1.setText(this.getResources().getText(2132020163));
                int v12_10 = this.H;
                if (v12_10 != 0) {
                    v1_0 = v12_10;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                v1_0.Z5u.setText(this.getResources().getText(2132020224));
                this.wH(p11, 2131558448);
                return;
            default:
                return;
        }
    }

    public static final synthetic void dav(com.alightcreative.export.preview.ExportPreviewActivity p0)
    {
        p0.sw();
        return;
    }

    public static synthetic String e4D(com.alightcreative.share.A p0)
    {
        return com.alightcreative.export.preview.ExportPreviewActivity.a9(p0);
    }

    private static final w9w.a9t fdD(android.view.View p4, w9w.a9t p5)
    {
        int v0_1 = p5.q(w9w.a9t$Zv9.ojl());
        kotlin.jvm.internal.Intrinsics.checkNotNull(p4);
        p4.setPadding(p4.getPaddingLeft(), v0_1.j, p4.getPaddingRight(), v0_1.x);
        return p5;
    }

    public static synthetic kotlin.Unit g(com.alightcreative.export.preview.ExportPreviewActivity p0, androidx.activity.qfV p1)
    {
        return com.alightcreative.export.preview.ExportPreviewActivity.Y(p0, p1);
    }

    public static synthetic w9w.a9t g2(android.view.View p0, w9w.a9t p1)
    {
        return com.alightcreative.export.preview.ExportPreviewActivity.fdD(p0, p1);
    }

    public static synthetic void hsj(kotlin.jvm.internal.Ref$IntRef p0, com.alightcreative.export.preview.ExportPreviewActivity p1, KL.MY p2, int p3, android.view.View p4)
    {
        com.alightcreative.export.preview.ExportPreviewActivity.jV(p0, p1, p2, p3, p4);
        return;
    }

    private final void i2(java.util.List p7)
    {
        com.alightcreative.export.preview.ExportPreviewActivity$CU v0_2;
        KL.CU v1_0 = 0;
        if (!this.CB()) {
            com.alightcreative.export.preview.ExportPreviewActivity$CU v0_5 = this.H;
            if (v0_5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_5 = 0;
            }
            v0_2 = v0_5.Q;
        } else {
            com.alightcreative.export.preview.ExportPreviewActivity$CU v0_1 = this.H;
            if (v0_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_1 = 0;
            }
            v0_2 = v0_1.LV;
            v0_2.addItemDecoration(new eDd.xfY(Integer.valueOf(2131166003)));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(v0_2);
        androidx.recyclerview.widget.LinearLayoutManager v3_3 = new androidx.recyclerview.widget.LinearLayoutManager(this, 0, 0);
        v0_2.setLayoutManager(v3_3);
        KL.A v4_4 = new com.alightcreative.export.preview.A(p7, this, this.CB());
        v0_2.setAdapter(v4_4);
        new com.alightcreative.export.preview.ExportPreviewActivity$A(this, v0_2, v4_4, p7).j(v0_2);
        com.alightcreative.export.preview.ExportPreviewActivity$CU v0_4 = new com.alightcreative.export.preview.ExportPreviewActivity$CU(this.getApplicationContext());
        android.widget.ImageButton v7_2 = this.H;
        if (v7_2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v7_2 = 0;
        }
        v7_2.ah.setOnClickListener(new KL.A(v0_4, this, v3_3));
        android.widget.ImageButton v7_4 = this.H;
        if (v7_4 != null) {
            v1_0 = v7_4;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1_0.E.setOnClickListener(new KL.CU(v0_4, this, v3_3));
        return;
    }

    private static final void iM(com.alightcreative.export.preview.ExportPreviewActivity p2, android.view.View p3)
    {
        android.os.Handler v3_0 = p2.Q;
        if (v3_0 != null) {
            if (!v3_0.isPlaying()) {
                v3_0.e(p2.cv);
                p2.y3P();
                return;
            } else {
                void v2_2 = p2.sw();
                v2_2.E.removeCallbacks(v2_2.e);
                return;
            }
        } else {
            return;
        }
    }

    private static final void jV(kotlin.jvm.internal.Ref$IntRef p5, com.alightcreative.export.preview.ExportPreviewActivity p6, KL.MY p7, int p8, android.view.View p9)
    {
        p5.element = (p5.element + 1);
        int v9_6 = p6.H;
        nVu.Zv9 v1 = 0;
        if (v9_6 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_6 = 0;
        }
        v9_6.db.setImageBitmap(p7.hUw(p5.element));
        StringBuilder v7_2 = p6.H;
        if (v7_2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v7_2 = 0;
        }
        int v9_4;
        int v4 = 0;
        if (p5.element == (p8 - 1)) {
            v9_4 = 0;
        } else {
            v9_4 = 1;
        }
        v7_2.l.setEnabled(v9_4);
        StringBuilder v7_4 = p6.H;
        if (v7_4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v7_4 = 0;
        }
        if (p5.element != 0) {
            v4 = 1;
        }
        v7_4.FT.setEnabled(v4);
        android.widget.TextView v6_1 = p6.H;
        if (v6_1 != null) {
            v1 = v6_1;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        android.widget.TextView v6_2 = v1.w;
        String v5_2 = (p5.element + 1);
        StringBuilder v7_7 = new StringBuilder();
        v7_7.append(v5_2);
        v7_7.append("/");
        v7_7.append(p8);
        v6_2.setText(v7_7.toString());
        return;
    }

    private static final void jfW(com.alightcreative.export.preview.ExportPreviewActivity p0, android.view.View p1)
    {
        p0.PC0();
        return;
    }

    private final boolean jj()
    {
        if (!this.Zq) {
            int v0_8 = this.Frn().invoke();
            if ((v0_8 == 0) || (v0_8.Hm())) {
                int v0_3;
                int v0_2 = this.Frn().invoke();
                if (v0_2 == 0) {
                    v0_3 = 0;
                } else {
                    v0_3 = v0_2.pM1();
                }
                if ((v0_3 == com.alightcreative.monorepo.settings.ExportedVideoAttachment.QR_CODE_OUTRO) && (this.f.size() > 1)) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static synthetic void lU(com.alightcreative.export.preview.ExportPreviewActivity p0, android.view.View p1)
    {
        com.alightcreative.export.preview.ExportPreviewActivity.iM(p0, p1);
        return;
    }

    private final void lka()
    {
        android.widget.ProgressBar v0_0 = this.H;
        int v1_0 = 0;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.f.setVisibility(4);
        android.widget.ProgressBar v0_3 = this.H;
        if (v0_3 != null) {
            v1_0 = v0_3;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1_0.K.setVisibility(0);
        return;
    }

    public static final synthetic com.alightcreative.export.preview.ExportPreviewActivity$cY m(com.alightcreative.export.preview.ExportPreviewActivity p0)
    {
        return p0.e;
    }

    public static final synthetic void m0(com.alightcreative.export.preview.ExportPreviewActivity p0, int p1)
    {
        p0.d = p1;
        return;
    }

    public static final synthetic void nG(com.alightcreative.export.preview.ExportPreviewActivity p0, int p1, int p2)
    {
        p0.dDX(p1, p2);
        return;
    }

    public static final synthetic void o(com.alightcreative.export.preview.ExportPreviewActivity p0)
    {
        p0.y3P();
        return;
    }

    private final void q9c(com.alightcreative.share.A p5)
    {
        if ((p5 instanceof com.alightcreative.share.A$A)) {
            fx.Enc.H(this, new KL.V(p5));
            TV.n v0_4 = com.alightcreative.app.motion.persist.xfY.INSTANCE;
            v0_4.setProjectsShared((v0_4.getProjectsShared() + 1));
            TV.n v0_1 = this.yy();
            android.os.Bundle v1_1 = new android.os.Bundle();
            String v2_0 = this.ak;
            if (v2_0 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mimeType");
                v2_0 = 0;
            }
            v1_1.putString("format", v2_0);
            v1_1.putInt("duration_seconds", this.M);
            v1_1.putInt("width", this.GO);
            v1_1.putInt("height", this.AM);
            v1_1.putString("target", ((com.alightcreative.share.A$A) p5).hUw());
            v0_1.hUw(new TV.xfY$c("share_exportedmedia", v1_1));
            return;
        } else {
            return;
        }
    }

    private static final void qQf(com.alightcreative.export.preview.ExportPreviewActivity p2, androidx.activity.result.ActivityResult p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "result");
        android.graphics.drawable.Drawable v2_3 = p2.MMm();
        if (p3.j() == -1) {
            androidx.appcompat.widget.AppCompatImageView v3_1 = v2_3.H;
            if (v3_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v3_1 = 0;
            }
            v3_1.f.setImageDrawable(zEz.c.q(v2_3.getResources(), 2131231745, v2_3.getTheme()));
        }
        return;
    }

    private final void qxC(java.io.File p6, java.io.File p7, String p8, int p9, boolean p10, oqG.A p11)
    {
        if (p7 != null) {
            int v2_5;
            this.lka();
            vg.A v0_1 = this.yy();
            int v1_2 = new android.os.Bundle();
            v1_2.putString("format", p8);
            v1_2.putInt("duration_seconds", this.M);
            v1_2.putInt("width", this.GO);
            v1_2.putInt("height", this.AM);
            v1_2.putString("target", "save");
            v0_1.hUw(new TV.xfY$c("share_exportedmedia", v1_2));
            vg.A v0_0 = this.n;
            int v1_0 = 0;
            if (v0_0 == null) {
                v2_5 = 0;
            } else {
                v2_5 = new String[1];
                v2_5[0] = v0_0;
            }
            vg.A v0_2 = this.AI;
            android.content.Intent v6_6 = new android.content.Intent(this, com.alightcreative.app.motion.activities.SaveToStorageActivity).putExtra("internalPath", p6.getAbsolutePath()).putExtra("targetPath", p7.getAbsolutePath()).putExtra("mimeType", p8).putExtra("saveCompleteMessage", this.getString(p9)).putExtra("indexMedia", p10);
            if (p11 != null) {
                v1_0 = p11.X();
            }
            android.content.Intent v6_8 = v6_6.putExtra("exportFormat", v1_0).putExtra("projectIds", v2_5);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v6_8, "putExtra(...)");
            v0_2.hUw(v6_8);
        }
        return;
    }

    private final void r7(java.io.File p2, java.io.File p3)
    {
        java.util.List v2_3 = androidx.core.content.FileProvider.X(this, "com.alightcreative.app.motion.fileprovider", p2);
        android.net.Uri v3_1 = androidx.core.content.FileProvider.X(this, "com.alightcreative.app.motion.fileprovider", p3);
        String v0_1 = this.R;
        kotlin.jvm.internal.Intrinsics.checkNotNull(v2_3);
        v0_1.add(v2_3);
        this.f.add("image/png");
        java.util.List v2_1 = this.R;
        kotlin.jvm.internal.Intrinsics.checkNotNull(v3_1);
        v2_1.add(v3_1);
        this.f.add("image/png");
        return;
    }

    private final void sw()
    {
        this.E.removeCallbacks(this.e);
        android.widget.ImageButton v0_3 = this.Q;
        if (v0_3 != null) {
            this.cv = v0_3.getCurrentPosition();
            v0_3.pause();
            android.widget.ImageButton v0_1 = 0;
            this.ah = 0;
            android.graphics.drawable.Drawable v1_1 = this.H;
            if (v1_1 != null) {
                v0_1 = v1_1;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v0_1.IB.setImageDrawable(zEz.c.q(this.getResources(), 2131231964, this.getTheme()));
            return;
        } else {
            return;
        }
    }

    public static synthetic void tEh(android.content.DialogInterface p0, int p1)
    {
        com.alightcreative.export.preview.ExportPreviewActivity.S6(p0, p1);
        return;
    }

    public static final synthetic android.os.Handler uM(com.alightcreative.export.preview.ExportPreviewActivity p0)
    {
        return p0.E;
    }

    public static final synthetic int uq6(com.alightcreative.export.preview.ExportPreviewActivity p0)
    {
        return p0.d;
    }

    private static final boolean v(com.alightcreative.export.preview.ExportPreviewActivity p1)
    {
        if (((float) p1.getResources().getConfiguration().screenWidthDp) >= 1140457472) {
            return 0;
        } else {
            return 1;
        }
    }

    private final void wH(int p14, int p15)
    {
        String v5_1;
        String v9 = this.getIntent().getStringExtra("CHOOSE_DLG_TITLE");
        kotlin.jvm.internal.Intrinsics.checkNotNull(v9);
        boolean v8 = this.getIntent().getBooleanExtra("INDEX_MEDIA", 0);
        this.GO = this.getIntent().getIntExtra("EXPORT_WIDTH", -1);
        this.AM = this.getIntent().getIntExtra("EXPORT_HEIGHT", -1);
        this.M = this.getIntent().getIntExtra("SCENE_TOTAL_TIME", -1);
        KL.D v0_12 = this.getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_12, "getIntent(...)");
        if (p15 == 2131558444) {
            v5_1 = "TEMPLATE_LINK_DATA";
        } else {
            if (p15 == 2131558446) {
                v5_1 = "TEMPLATE_QR_DATA";
            } else {
                v5_1 = "DATA_FILE";
            }
        }
        nVu.Zv9 v10_1;
        KL.D v0_13 = FKt.LxM.hUw(v0_12, v5_1, java.io.File);
        kotlin.jvm.internal.Intrinsics.checkNotNull(v0_13);
        String v5_4 = ((java.io.File) v0_13);
        KL.D v0_14 = this.getIntent();
        if (p15 != 2131558448) {
            v10_1 = "TEMPLATE_TOGGLE_EXPORT_SNAPSHOT";
        } else {
            v10_1 = "EXPORT_SNAPSHOT";
        }
        KL.D v0_16;
        KL.D v0_15 = v0_14.getBundleExtra(v10_1);
        nVu.Zv9 v10_0 = 0;
        if (v0_15 == null) {
            v0_16 = 0;
        } else {
            v0_16 = oqG.CU.j(v0_15);
        }
        int v2_15;
        if (p15 != 2131558448) {
            int v2_12 = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_PICTURES);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_12, "let(...)");
            int v2_13 = kotlin.io.FilesKt.resolve(v2_12, "Alight Motion");
            android.widget.LinearLayout v6_5 = this.getIntent().getStringExtra("TEMPLATE_TITLE");
            String v11_1 = System.currentTimeMillis();
            int v7_4 = new StringBuilder();
            v7_4.append(v6_5);
            v7_4.append(" [");
            v7_4.append(v11_1);
            v7_4.append("v");
            v7_4.append(p14);
            v7_4.append("].jpg");
            v2_15 = kotlin.io.FilesKt.resolve(v2_13, v7_4.toString());
        } else {
            int v7_5 = this.getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_5, "getIntent(...)");
            v2_15 = ((java.io.File) FKt.LxM.hUw(v7_5, "SAVETOSTORAGETARGET", java.io.File));
        }
        android.widget.LinearLayout v6_10 = v2_15;
        int v2_1;
        if (p15 != 2131558444) {
            v2_1 = this.getIntent().getIntExtra("SAVE_COMPLETE_MSG", -1);
        } else {
            v2_1 = 2132017580;
        }
        int v4_1 = v2_1;
        int v2_2 = this.H;
        if (v2_2 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v2_2 = 0;
        }
        int v1_0 = v0_16;
        int v2_5 = v1_0;
        v2_2.ak.setOnClickListener(new KL.F(v1_0, p15, this, v4_1, v5_4, v6_10, p14, v8));
        KL.D v0_3 = this.H;
        if (v0_3 != null) {
            v10_0 = v0_3;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v10_0.nvG.setOnClickListener(new KL.D(p15, v2_5, this, p14, v9));
        return;
    }

    private final void y3P()
    {
        this.E.removeCallbacks(this.e);
        android.os.Handler v0_5 = this.Q;
        if (v0_5 != null) {
            v0_5.cD();
            this.ah = new ref.WeakReference(this.z);
            android.os.Handler v0_1 = this.H;
            if (v0_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_1 = 0;
            }
            v0_1.IB.setImageDrawable(zEz.c.q(this.getResources(), 2131231952, this.getTheme()));
            this.E.postDelayed(this.e, 100);
            return;
        } else {
            return;
        }
    }

    public static final synthetic androidx.media3.exoplayer.ExoPlayer z2f(com.alightcreative.export.preview.ExportPreviewActivity p0)
    {
        return p0.Q;
    }

    public final ns.h Frn()
    {
        int v0_0 = this.w;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final void MTr(androidx.media3.ui.PlayerView p1)
    {
        this.z = p1;
        return;
    }

    public final void RF(android.net.Uri p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "uri");
        com.alightcreative.export.preview.ExportPreviewActivity$XSt v0_5 = this.H;
        nVu.Zv9 v1 = 0;
        if (v0_5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_5 = 0;
        }
        v0_5.IB.setEnabled(0);
        androidx.appcompat.widget.AppCompatSeekBar v6_1 = aQP.MY.j(p6);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v6_1, "fromUri(...)");
        if (this.Q != null) {
            this.b1();
        }
        com.alightcreative.export.preview.ExportPreviewActivity$XSt v0_6 = new androidx.media3.exoplayer.ExoPlayer$A(this).R6();
        this.Q = v0_6;
        if (v0_6 != null) {
            v0_6.ak(new com.alightcreative.export.preview.ExportPreviewActivity$h(this, v0_6));
            v0_6.hUw(oxn.kh.cD);
            long v3_3 = this.z;
            if (v3_3 != 0) {
                v3_3.setPlayer(this.Q);
            }
            v0_6.uKP();
            v0_6.AI(v6_1);
            v0_6.H();
            v0_6.e(this.cv);
        }
        androidx.appcompat.widget.AppCompatSeekBar v6_2 = this.z;
        if (v6_2 != null) {
            v6_2.setOnTouchListener(new KL.Zv9(this));
        }
        androidx.appcompat.widget.AppCompatSeekBar v6_3 = this.H;
        if (v6_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_3 = 0;
        }
        v6_3.IB.setOnClickListener(new KL.AWD(this));
        androidx.appcompat.widget.AppCompatSeekBar v6_5 = this.H;
        if (v6_5 != null) {
            v1 = v6_5;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1.Bb.setOnSeekBarChangeListener(new com.alightcreative.export.preview.ExportPreviewActivity$XSt(this));
        return;
    }

    public final EY.XSt Z0()
    {
        int v0_0 = this.db;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
            return 0;
        } else {
            return v0_0;
        }
    }

    public void onBackPressed()
    {
        this.PC0();
        return;
    }

    protected void onCreate(android.os.Bundle p8)
    {
        super.onCreate(p8);
        androidx.constraintlayout.widget.ConstraintLayout v8_1 = nVu.Zv9.cD(this.getLayoutInflater());
        this.H = v8_1;
        nVu.Zv9 v1 = 0;
        if (v8_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_1 = 0;
        }
        this.setContentView(v8_1.j());
        androidx.constraintlayout.widget.ConstraintLayout v8_12 = this.H;
        if (v8_12 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_12 = 0;
        }
        w9w.Xo.If(v8_12.j(), new KL.K());
        this.Z0().E(this);
        androidx.constraintlayout.widget.ConstraintLayout v8_16 = this.getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v8_16, "getIntent(...)");
        androidx.constraintlayout.widget.ConstraintLayout v8_17 = FKt.LxM.hUw(v8_16, "DATA_FILE", java.io.File);
        kotlin.jvm.internal.Intrinsics.checkNotNull(v8_17);
        androidx.constraintlayout.widget.ConstraintLayout v8_18 = ((java.io.File) v8_17);
        int v3_3 = this.getIntent().getStringExtra("MIMETYPE");
        kotlin.jvm.internal.Intrinsics.checkNotNull(v3_3);
        this.ak = v3_3;
        int v3_5 = this.getIntent().getStringExtra("CHOOSE_DLG_TITLE");
        kotlin.jvm.internal.Intrinsics.checkNotNull(v3_5);
        java.io.File v5_3 = androidx.core.content.FileProvider.X(this, "com.alightcreative.app.motion.fileprovider", v8_18);
        this.K = v5_3;
        android.content.Intent v6_0 = this.R;
        if (v5_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("contentUri");
            v5_3 = 0;
        }
        v6_0.add(v5_3);
        java.io.File v5_5 = this.f;
        android.content.Intent v6_1 = this.ak;
        if (v6_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mimeType");
            v6_1 = 0;
        }
        v5_5.add(v6_1);
        java.io.File v5_6 = this.getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v5_6, "getIntent(...)");
        java.io.File v5_8 = ((java.io.File) FKt.LxM.hUw(v5_6, "TEMPLATE_LINK_DATA", java.io.File));
        android.content.Intent v6_4 = this.getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v6_4, "getIntent(...)");
        KL.qfV v2_8 = ((java.io.File) FKt.LxM.hUw(v6_4, "TEMPLATE_QR_DATA", java.io.File));
        if ((v5_8 != null) && (v2_8 != null)) {
            this.r7(v5_8, v2_8);
        }
        this.n = this.getIntent().getStringExtra("P_ID");
        this.W3V(this.f, this.R, v8_18);
        androidx.constraintlayout.widget.ConstraintLayout v8_19 = this.H;
        if (v8_19 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_19 = 0;
        }
        v8_19.ojl.setText(v3_5);
        if (this.f.size() != 1) {
            this.dDX(0, this.d);
        } else {
            com.alightcreative.export.preview.ExportPreviewActivity.AX(this, 0, 0, 2, 0);
        }
        androidx.constraintlayout.widget.ConstraintLayout v8_5 = this.H;
        if (v8_5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_5 = 0;
        }
        v8_5.R6.setOnClickListener(new KL.qfV(this));
        androidx.constraintlayout.widget.ConstraintLayout v8_7 = this.H;
        if (v8_7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_7 = 0;
        }
        v8_7.cLW.x();
        androidx.constraintlayout.widget.ConstraintLayout v8_10 = this.H;
        if (v8_10 != null) {
            v1 = v8_10;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1.pM1.setVisibility(8);
        return;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        this.b1();
        androidx.constraintlayout.widget.ConstraintLayout v0_2 = this.H;
        int v1_0 = 0;
        if (v0_2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_2 = 0;
        }
        v0_2.cLW.x();
        androidx.constraintlayout.widget.ConstraintLayout v0_0 = this.H;
        if (v0_0 != null) {
            v1_0 = v0_0;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1_0.pM1.setVisibility(8);
        return;
    }

    protected void onPause()
    {
        this.sw();
        super.onPause();
        return;
    }

    protected void onResume()
    {
        androidx.appcompat.app.CU v0_0 = this.ak;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("mimeType");
            v0_0 = 0;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(v0_0, "video/mp4")) {
            this.E.removeCallbacks(this.e);
            this.E.postDelayed(this.e, 100);
            androidx.appcompat.app.CU v0_2 = this.Q;
            if (v0_2 != null) {
                v0_2.e(this.cv);
            }
        }
        if (this.jj()) {
            this.Zq = 1;
            new androidx.appcompat.app.CU$xfY(this).FT(2132020002).H(2132020001).setPositiveButton(2132019853, new KL.xfY()).create().show();
        }
        super.onResume();
        return;
    }

    public final nwt.A wx()
    {
        int v0_0 = this.l;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("injet");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final TV.n yy()
    {
        int v0_0 = this.X;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
            return 0;
        } else {
            return v0_0;
        }
    }
}
