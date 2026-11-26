package com.alightcreative.template.importpreview.ui;
public final class TemplateImportPreviewActivity extends com.alightcreative.template.importpreview.ui.A {
    public static final com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity$xfY Q;
    public static final int ak;
    private String E;
    public com.alightcreative.template.importpreview.ui.K$A H;
    public TV.n T;
    private com.alightcreative.template.importpreview.ui.K X;
    private final vg.A ah;
    private final AVl.V db;
    private XmC.xfY l;
    private GuB.bV w;

    static TemplateImportPreviewActivity()
    {
        com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.Q = new com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity$xfY(0);
        com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.ak = 8;
        return;
    }

    public TemplateImportPreviewActivity()
    {
        this.db = new AVl.V(this);
        this.ah = this.registerForActivityResult(new M.V(), new XmC.A(this));
        return;
    }

    private final void Frn()
    {
        new android.app.AlertDialog$Builder(this).setTitle(2132020385).setMessage(2132020384).setPositiveButton(2132017454, new XmC.V()).create().show();
        return;
    }

    private static final kotlin.Unit Ie(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0)
    {
        p0.m0();
        return kotlin.Unit.INSTANCE;
    }

    public static final synthetic XmC.xfY If(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0)
    {
        return p0.l;
    }

    private static final void Jju(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p7, android.net.Uri p8)
    {
        if (p8 == null) {
            return;
        } else {
            android.content.Context v1_0 = p7.X;
            long v3_0 = 0;
            if (v1_0 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                v1_0 = 0;
            }
            android.content.Context v1_5 = v1_0.l(p7, p8);
            if (!(v1_5 instanceof com.alightcreative.template.importpreview.ui.CU$xfY)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v1_5, com.alightcreative.template.importpreview.ui.CU$CU.hUw)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(v1_5, com.alightcreative.template.importpreview.ui.CU$A.hUw)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    } else {
                        long v0_6 = p7.X;
                        if (v0_6 == 0) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            v0_6 = 0;
                        }
                        android.content.Context v1_1 = p7.getApplicationContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_1, "getApplicationContext(...)");
                        com.alightcreative.template.importpreview.ui.K.Jd(v0_6, v1_1, p8, 0, 4, 0);
                        return;
                    }
                } else {
                    void v7_1 = p7.Frn();
                    long v0_7 = v7_1.X;
                    if (v0_7 == 0) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        v0_7 = 0;
                    }
                    android.content.Context v1_2 = v7_1.getApplicationContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_2, "getApplicationContext(...)");
                    com.alightcreative.template.importpreview.ui.K.Jd(v0_7, v1_2, p8, 0, 4, 0);
                    return;
                }
            } else {
                int v5_3 = p7.X;
                if (v5_3 != 0) {
                    v3_0 = v5_3;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                }
                long v4_1 = ((com.alightcreative.template.importpreview.ui.CU$xfY) v1_5);
                android.content.Context v1_4 = v4_1.j();
                long v0_8 = v3_0;
                long v3_3 = v4_1.hUw();
                int v5_4 = p7.getApplicationContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v5_4, "getApplicationContext(...)");
                v0_8.X9x(v1_4, v3_3, v5_4, p8);
                return;
            }
        }
    }

    public static final synthetic AVl.V Jm(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0)
    {
        return p0.db;
    }

    private static final kotlin.Unit N(android.content.Context p16, com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p17, QdR.d p18, GuB.bV p19, com.alightcreative.template.importpreview.ui.cY p20)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p20, "action");
        if (!(p20 instanceof com.alightcreative.template.importpreview.ui.cY$XSt)) {
            if (!(p20 instanceof com.alightcreative.template.importpreview.ui.cY$V)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(p20, com.alightcreative.template.importpreview.ui.cY$K.hUw)) {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(p20, com.alightcreative.template.importpreview.ui.cY$h.hUw)) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(p20, com.alightcreative.template.importpreview.ui.cY$cY.hUw)) {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(p20, com.alightcreative.template.importpreview.ui.cY$CU.hUw)) {
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(p20, com.alightcreative.template.importpreview.ui.cY$A.hUw)) {
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(p20, com.alightcreative.template.importpreview.ui.cY$c.hUw)) {
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(p20, com.alightcreative.template.importpreview.ui.cY$xfY.hUw)) {
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        } else {
                                            p17.uq6();
                                        }
                                    } else {
                                        p17.r7();
                                    }
                                } else {
                                    QdR.K.x(p18, 0, 0, new com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity$XSt(p19, 0), 3, 0);
                                }
                            } else {
                                QdR.K.x(p18, 0, 0, new com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity$h(p19, 0), 3, 0);
                            }
                        } else {
                            p17.o();
                        }
                    } else {
                        p17.nG();
                    }
                } else {
                    p17.PC0();
                }
            } else {
                p17.m0();
            }
        } else {
            FKt.Tn.Bb(p16, 0, 1, 0);
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void Odv(android.content.DialogInterface p0, int p1)
    {
        p0.dismiss();
        return;
    }

    private final void PC0()
    {
        new android.app.AlertDialog$Builder(this).setTitle(2132020378).setMessage(2132020375).setPositiveButton(2132020376, new XmC.K()).setNegativeButton(2132020377, new XmC.qfV(this)).create().show();
        return;
    }

    public static synthetic void QR(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0, android.content.DialogInterface p1, int p2)
    {
        com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.yy(p0, p1, p2);
        return;
    }

    public static synthetic void S(android.content.DialogInterface p0, int p1)
    {
        com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.wx(p0, p1);
        return;
    }

    public static synthetic void ST5(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0, android.net.Uri p1)
    {
        com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.Jju(p0, p1);
        return;
    }

    private static final void Y(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0, android.content.DialogInterface p1, int p2)
    {
        p1.dismiss();
        p0.o();
        return;
    }

    public static synthetic kotlin.Unit Z(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0, com.alightcreative.template.importpreview.ui.K p1, GuB.bV p2, int p3, S1F.Enc p4, int p5)
    {
        return com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.g(p0, p1, p2, p3, p4, p5);
    }

    private static final void Z0(android.content.DialogInterface p0, int p1)
    {
        p0.dismiss();
        return;
    }

    public static synthetic kotlin.Unit Zk(android.content.Context p0, com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p1, QdR.d p2, GuB.bV p3, com.alightcreative.template.importpreview.ui.cY p4)
    {
        return com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.N(p0, p1, p2, p3, p4);
    }

    public static synthetic void b9Y(android.content.DialogInterface p0, int p1)
    {
        com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.Odv(p0, p1);
        return;
    }

    public static final synthetic void cKj(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0, com.alightcreative.template.importpreview.ui.K p1)
    {
        p0.X = p1;
        return;
    }

    public static final synthetic com.alightcreative.template.importpreview.ui.K cak(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0)
    {
        return p0.X;
    }

    private final void dav()
    {
        if (this.X != null) {
            com.alightcreative.template.importpreview.ui.K v0_3 = this.w;
            com.alightcreative.template.importpreview.ui.K v1 = 0;
            if ((v0_3 == null) || (v0_3.T() != 1)) {
                com.alightcreative.template.importpreview.ui.K v0_1 = this.X;
                if (v0_1 != null) {
                    v1 = v0_1;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                }
                v1.FT();
                return;
            } else {
                com.alightcreative.template.importpreview.ui.K v0_2 = this.X;
                if (v0_2 != null) {
                    v1 = v0_2;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                }
                v1.ah();
                return;
            }
        } else {
            this.m();
            return;
        }
    }

    public static final synthetic String e4D(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0)
    {
        return p0.E;
    }

    private static final kotlin.Unit g(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0, com.alightcreative.template.importpreview.ui.K p1, GuB.bV p2, int p3, S1F.Enc p4, int p5)
    {
        p0.lU(p1, p2, p4, S1F.lX.hUw((p3 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void g2(android.content.DialogInterface p0, int p1)
    {
        com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.Z0(p0, p1);
        return;
    }

    public static synthetic kotlin.Unit hsj(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0)
    {
        return com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.Ie(p0);
    }

    private final void m()
    {
        this.setResult(0);
        this.finish();
        return;
    }

    private final void m0()
    {
        this.ah.hUw(vg.cY.j(M.V$CU.hUw, 0, 0, 0, 14, 0));
        return;
    }

    private final void nG()
    {
        android.content.Intent v0_0 = this.X;
        int v1_0 = 0;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            v0_0 = 0;
        }
        v0_0.K();
        android.content.Intent v0_4 = new android.content.Intent();
        kotlin.Pair v2_3 = kotlin.TuplesKt.to("projectID", this.db.H().toString());
        String v3_1 = this.E;
        if (v3_1 != null) {
            v1_0 = v3_1;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("projectPackageId");
        }
        this.setResult(-1, v0_4.putExtras(PYr.h.hUw(new kotlin.Pair[] {v2_3, kotlin.TuplesKt.to("projectPackageID", v1_0)}))));
        this.finish();
        return;
    }

    private final void o()
    {
        android.content.Intent v0_0 = this.X;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            v0_0 = 0;
        }
        v0_0.K();
        android.content.Intent v0_3 = new kotlin.Pair[] {kotlin.TuplesKt.to("projectID", this.db.H().toString())});
        String v1_2 = new android.content.Intent(this, com.alightcreative.app.motion.activities.EditActivity);
        v1_2.putExtras(PYr.h.hUw(((kotlin.Pair[]) java.util.Arrays.copyOf(v0_3, 1))));
        android.content.Intent v0_9 = v1_2.addFlags(335544320);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_9, "addFlags(...)");
        this.startActivity(v0_9);
        this.finish();
        return;
    }

    private final void r7()
    {
        new android.app.AlertDialog$Builder(this).setTitle(2132020374).setMessage(2132020371).setPositiveButton(2132020372, new XmC.cY()).setNegativeButton(2132020373, new XmC.c(this)).create().show();
        return;
    }

    public static synthetic void tEh(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0, android.content.DialogInterface p1, int p2)
    {
        com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.Y(p0, p1, p2);
        return;
    }

    public static final synthetic void uM(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0)
    {
        p0.dav();
        return;
    }

    private final void uq6()
    {
        int v0_4 = this.db.H().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_4, "toString(...)");
        FQ.xfY.cD(this, v0_4);
        int v0_2 = this.X;
        if (v0_2 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            v0_2 = 0;
        }
        v0_2.F0();
        this.m();
        return;
    }

    private static final void wx(android.content.DialogInterface p0, int p1)
    {
        p0.dismiss();
        return;
    }

    private static final void yy(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0, android.content.DialogInterface p1, int p2)
    {
        p0.uq6();
        p1.dismiss();
        return;
    }

    public static final synthetic void z2f(com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity p0, GuB.bV p1)
    {
        p0.w = p1;
        return;
    }

    public final com.alightcreative.template.importpreview.ui.K$A B()
    {
        int v0_0 = this.H;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final TV.n Pg()
    {
        int v0_0 = this.T;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
            return 0;
        } else {
            return v0_0;
        }
    }

    public void finish()
    {
        int v0_0 = this.X;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            v0_0 = 0;
        }
        v0_0.Q();
        super.finish();
        return;
    }

    public final void lU(com.alightcreative.template.importpreview.ui.K p27, GuB.bV p28, S1F.Enc p29, int p30)
    {
        int v5_3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p27, "viewModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p28, "sheetState");
        S1F.Enc v15 = p29.ojl(480797912);
        if ((p30 & 6) != 0) {
            v5_3 = p30;
        } else {
            int v5_7;
            if (!v15.nvG(p27)) {
                v5_7 = 2;
            } else {
                v5_7 = 4;
            }
            v5_3 = (v5_7 | p30);
        }
        if ((p30 & 48) == 0) {
            Y2.V v6_4;
            if ((p30 & 64) != 0) {
                v6_4 = v15.nvG(p28);
            } else {
                v6_4 = v15.w0(p28);
            }
            Y2.V v6_5;
            if (v6_4 == null) {
                v6_5 = 16;
            } else {
                v6_5 = 32;
            }
            v5_3 |= v6_5;
        }
        if ((p30 & 384) == 0) {
            Y2.V v6_8;
            if (!v15.nvG(this)) {
                v6_8 = 128;
            } else {
                v6_8 = 256;
            }
            v5_3 |= v6_8;
        }
        if (((v5_3 & 147) == 146) && (v15.uKP())) {
            v15.cv();
            com.alightcreative.template.importpreview.ui.K v2_7 = p27;
        } else {
            if (S1F.Zv9.X9x()) {
                S1F.Zv9.AM(480797912, v5_3, -1, "com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity.TemplateImportPreviewActivityContent (TemplateImportPreviewActivity.kt:163)");
            }
            kotlin.jvm.functions.Function1 v3_15 = ((android.content.Context) v15.Zq(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.H()));
            Y2.V v6_13 = v15.x1();
            S1F.Enc$xfY v18 = S1F.Enc.hUw;
            if (v6_13 == v18.hUw()) {
                v6_13 = S1F.d.ojl(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, v15);
                v15.FT(v6_13);
            }
            int v22_0;
            Y2.V v25;
            boolean v1_1;
            XmC.XSt v21_0;
            int v19_0;
            Y2.V v6_15 = ((QdR.d) v6_13);
            long v8_12 = ((com.alightcreative.template.importpreview.ui.Enc) oD.A.hUw(p27.cD(), v15, 0).getValue());
            v15.AI(-501703459);
            if (!(v8_12 instanceof com.alightcreative.template.importpreview.ui.Enc$xfY)) {
                v1_1 = v3_15;
                v19_0 = v5_3;
                v25 = v6_15;
                v21_0 = 0;
                v22_0 = 1;
            } else {
                v19_0 = v5_3;
                v21_0 = 0;
                v22_0 = 1;
                v1_1 = v3_15;
                v25 = v6_15;
                GuB.t.j(R.h.x(2112892926, 1, new com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity$A(v8_12, p27, this), v15, 54), 0, p28, 0, Y2.cY.R6(Uaz.c.H(((float) 20)), Uaz.c.H(((float) 20)), 0, 0, 12, 0), 0, 0, 0, IRH.CU.Bb(), R.h.x(897364407, 1, new com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity$CU(v8_12, p27), v15, 54), v15, (((GuB.bV.R6 << 6) | 905969670) | ((v5_3 << 3) & 896)), 234);
            }
            XmC.XSt v9_5;
            v15.d();
            v15.AI(-501655803);
            Y2.V v6_1 = v25;
            com.alightcreative.template.importpreview.ui.K v2_4 = ((v15.nvG(v1_1) | v15.nvG(this)) | v15.nvG(v6_1));
            if (((v19_0 & 112) != 32) && (((v19_0 & 64) == 0) || (!v15.nvG(p28)))) {
                v9_5 = v21_0;
            } else {
                v9_5 = v22_0;
            }
            com.alightcreative.template.importpreview.ui.K v2_5 = (v2_4 | v9_5);
            kotlin.jvm.functions.Function1 v3_6 = v15.x1();
            if ((v2_5 != null) || (v3_6 == v18.hUw())) {
                v3_6 = new XmC.h(v1_1, this, v6_1, p28);
                v15.FT(v3_6);
            }
            kotlin.jvm.functions.Function1 v3_8 = ((kotlin.jvm.functions.Function1) v3_6);
            v15.d();
            v2_7 = p27;
            VVv.XSt.j(p27, v3_8, v15, (v19_0 & 14));
            if (S1F.Zv9.X9x()) {
                S1F.Zv9.GO();
            }
        }
        boolean v1_4 = v15.db();
        if (v1_4) {
            v1_4.hUw(new XmC.XSt(this, v2_7, p28, p30));
        }
        return;
    }

    protected void onCreate(android.os.Bundle p5)
    {
        super.onCreate(p5);
        this.db.uKP(p5, this.getIntent());
        QdR.K.q(0, new com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity$V(this, 0), 1, 0);
        R.A v5_1 = this.getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v5_1, "getIntent(...)");
        R.A v5_3 = ((XmC.xfY) FKt.LxM.hUw(v5_1, "template_editor_origin", XmC.xfY));
        if (v5_3 == null) {
            throw new IllegalArgumentException("Intent to open TemplateImportPreviewActivity missing TEMPLATE_EDITOR_ORIGIN_TAG extra.");
        } else {
            this.l = v5_3;
            R.A v5_7 = this.getIntent().getStringExtra("projectPackageID");
            if (v5_7 == null) {
                v5_7 = "lost_template_pp_id";
            }
            this.E = v5_7;
            w9w.j.j(this.getWindow(), 0);
            R.A v5_9 = this.getWindow();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v5_9, "getWindow(...)");
            FKt.Nrb.hUw(v5_9, 0, this.getColor(2131099665), 1);
            m.xfY.j(this, 0, R.h.j(-375141428, 1, new com.alightcreative.template.importpreview.ui.TemplateImportPreviewActivity$cY(this)), 1, 0);
            return;
        }
    }

    protected void onPause()
    {
        int v0_0 = this.X;
        if (v0_0 != 0) {
            if (v0_0 == 0) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                v0_0 = 0;
            }
            v0_0.x1();
        }
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
            TV.n v1 = this.Pg();
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
            FKt.vp.cD(v1, v2, oqG.c.H, new String[] {this.db.H().toString()}), 0, 0, new XmC.CU(this), 48, 0);
            return;
        }
    }

    protected void onSaveInstanceState(android.os.Bundle p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "outState");
        this.db.T(p3, this.isFinishing());
        super.onSaveInstanceState(p3);
        return;
    }
}
