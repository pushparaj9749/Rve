package com.alightcreative.maineditor.presetpreview.ui;
public final class PresetPreviewActivity extends com.alightcreative.maineditor.presetpreview.ui.xfY implements dD0.XSt {
    public static final com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity$xfY ak;
    public static final int f;
    public nwt.A E;
    public com.alightcreative.maineditor.presetpreview.ui.c$A H;
    public dD0.h Q;
    public TV.n T;
    public Uyh.s$A X;
    private com.alightcreative.maineditor.presetpreview.ui.c ah;
    public Vbv.c db;
    public ns.h l;
    public EY.XSt w;

    static PresetPreviewActivity()
    {
        com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity.ak = new com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity$xfY(0);
        com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity.f = 8;
        return;
    }

    public PresetPreviewActivity()
    {
        return;
    }

    public static final synthetic void N(com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity p0, com.alightcreative.maineditor.presetpreview.ui.c p1)
    {
        p0.ah = p1;
        return;
    }

    public static synthetic kotlin.Unit S(com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity p0, com.alightcreative.maineditor.presetpreview.ui.c p1, int p2, S1F.Enc p3, int p4)
    {
        return com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity.g2(p0, p1, p2, p3, p4);
    }

    private static final kotlin.Unit ST5(GuB.bV p6, QdR.d p7, com.alightcreative.maineditor.presetpreview.ui.c p8, androidx.activity.BM p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "$this$BackPressHandler");
        if (!p6.T()) {
            p8.Hm();
        } else {
            QdR.K.x(p7, 0, 0, new com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity$A(p6, 0), 3, 0);
        }
        return kotlin.Unit.INSTANCE;
    }

    private final void X(android.net.Uri p2)
    {
        fx.c.f(this, new v2n.h(p2, this));
        return;
    }

    public static synthetic kotlin.Unit Z(com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity p0, String p1, AVl.qfV p2)
    {
        return com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity.m(p0, p1, p2);
    }

    public static synthetic kotlin.Unit Zk(GuB.bV p0, QdR.d p1, com.alightcreative.maineditor.presetpreview.ui.c p2, androidx.activity.BM p3)
    {
        return com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity.ST5(p0, p1, p2, p3);
    }

    public static synthetic kotlin.Unit b9Y(com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity p0, QdR.d p1, QB.XSt$A p2, GuB.bV p3, com.alightcreative.maineditor.presetpreview.ui.V p4)
    {
        return com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity.hsj(p0, p1, p2, p3, p4);
    }

    private final void g(String p3, boolean p4)
    {
        android.content.Intent v0_1 = new android.content.Intent();
        if (p4 != null) {
            v0_1.putExtra("showDeleteToast", 1);
        }
        if (p3 != 0) {
            v0_1.putExtra("selectedPresetID", p3);
        }
        this.setResult(-1, v0_1);
        this.finish();
        return;
    }

    private static final kotlin.Unit g2(com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity p0, com.alightcreative.maineditor.presetpreview.ui.c p1, int p2, S1F.Enc p3, int p4)
    {
        p0.QR(p1, p3, S1F.lX.hUw((p2 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit hsj(com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity p16, QdR.d p17, QB.XSt$A p18, GuB.bV p19, com.alightcreative.maineditor.presetpreview.ui.V p20)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p20, "action");
        if (!(p20 instanceof com.alightcreative.maineditor.presetpreview.ui.V$A)) {
            if (!(p20 instanceof com.alightcreative.maineditor.presetpreview.ui.V$CU)) {
                if (!(p20 instanceof com.alightcreative.maineditor.presetpreview.ui.V$h)) {
                    if (!(p20 instanceof com.alightcreative.maineditor.presetpreview.ui.V$V)) {
                        if (!(p20 instanceof com.alightcreative.maineditor.presetpreview.ui.V$xfY)) {
                            if (!(p20 instanceof com.alightcreative.maineditor.presetpreview.ui.V$XSt)) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            } else {
                                QdR.K.x(p17, 0, 0, new com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity$cY(p19, 0), 3, 0);
                            }
                        } else {
                            QdR.K.x(p17, 0, 0, new com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity$V(p19, 0), 3, 0);
                        }
                    } else {
                        QdR.K.x(p17, 0, 0, new com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity$XSt(p18, p19, 0), 3, 0);
                    }
                } else {
                    p16.X(((com.alightcreative.maineditor.presetpreview.ui.V$h) p20).hUw());
                }
            } else {
                sp.K.q(p16, ((com.alightcreative.maineditor.presetpreview.ui.V$CU) p20).j(), p16.Jm(), p16.cak(), kotlin.collections.CollectionsKt.toMutableList(((com.alightcreative.maineditor.presetpreview.ui.V$CU) p20).hUw()));
            }
        } else {
            p16.g(((com.alightcreative.maineditor.presetpreview.ui.V$A) p20).hUw(), ((com.alightcreative.maineditor.presetpreview.ui.V$A) p20).j());
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final synthetic com.alightcreative.maineditor.presetpreview.ui.c lU(com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity p0)
    {
        return p0.ah;
    }

    private static final kotlin.Unit m(com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity p2, String p3, AVl.qfV p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "projectImportResult");
        kotlin.Unit v2_2 = p2.ah;
        if (v2_2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            v2_2 = 0;
        }
        java.util.Iterator v3_1 = p4.x();
        java.util.ArrayList v4_2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v3_1, 10));
        java.util.Iterator v3_2 = v3_1.iterator();
        while (v3_2.hasNext()) {
            String v0_6 = ((java.util.UUID) v3_2.next()).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_6, "toString(...)");
            v4_2.add(v0_6);
        }
        v2_2.Zq(v4_2);
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit tEh(android.net.Uri p0, com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity p1)
    {
        return com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity.uq6(p0, p1);
    }

    private static final kotlin.Unit uq6(android.net.Uri p13, com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity p14)
    {
        int v3;
        android.content.Intent v1_1 = new android.content.Intent("android.intent.action.VIEW", p13);
        kotlin.Unit v13_4 = p14.e4D().invoke();
        if ((v13_4 == null) || (v13_4.f() != 1)) {
            v3 = 0;
        } else {
            v3 = 1;
        }
        pg.Tn.f(p14, v1_1, 1, v3, p14.Jm(), p14.cak(), p14.If(), 0, new v2n.XSt(p14), p14.uM(), p14.e4D(), 64, 0);
        return kotlin.Unit.INSTANCE;
    }

    public final EY.XSt If()
    {
        int v0_0 = this.w;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final TV.n Jm()
    {
        int v0_0 = this.T;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
            return 0;
        } else {
            return v0_0;
        }
    }

    public void Pg(dD0.h p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.Q = p2;
        return;
    }

    public final void QR(com.alightcreative.maineditor.presetpreview.ui.c p30, S1F.Enc p31, int p32)
    {
        Object v4_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p30, "viewModel");
        S1F.Enc v8_1 = p31.ojl(1009494120);
        if ((p32 & 6) != 0) {
            v4_2 = p32;
        } else {
            Object v4_6;
            if (!v8_1.nvG(p30)) {
                v4_6 = 2;
            } else {
                v4_6 = 4;
            }
            v4_2 = (p32 | v4_6);
        }
        if ((p32 & 48) == 0) {
            kotlin.jvm.functions.Function1 v5_12;
            if (!v8_1.nvG(this)) {
                v5_12 = 16;
            } else {
                v5_12 = 32;
            }
            v4_2 |= v5_12;
        }
        int v11 = v4_2;
        if (((v11 & 19) == 18) && (v8_1.uKP())) {
            v8_1.cv();
        } else {
            if (S1F.Zv9.X9x()) {
                S1F.Zv9.AM(1009494120, v11, -1, "com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity.PresetPreviewActivityContent (PresetPreviewActivity.kt:143)");
            }
            long v12_1 = QB.V.j(v8_1, 0);
            Object v4_18 = v8_1.x1();
            S1F.Enc$xfY v20 = S1F.Enc.hUw;
            if (v4_18 == v20.hUw()) {
                v4_18 = S1F.d.ojl(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, v8_1);
                v8_1.FT(v4_18);
            }
            QdR.d v13_1 = ((QdR.d) v4_18);
            GuB.bV v6_1 = GuB.t.uKP(GuB.WHS.j, 0, 0, 1, v8_1, 3078, 6);
            v8_1.AI(1556794407);
            Object v4_25 = ((v8_1.nvG(v6_1) | v8_1.nvG(v13_1)) | v8_1.nvG(p30));
            kotlin.jvm.functions.Function1 v5_19 = v8_1.x1();
            if ((v4_25 != null) || (v5_19 == v20.hUw())) {
                v5_19 = new v2n.xfY(v6_1, v13_1, p30);
                v8_1.FT(v5_19);
            }
            int v31_1;
            boolean v2_0;
            long v3_0;
            kotlin.jvm.functions.Function1 v5_21 = ((kotlin.jvm.functions.Function1) v5_19);
            v8_1.d();
            oU.XSt.R6(0, v5_21, v8_1, 0, 1);
            long v3_10 = ((com.alightcreative.maineditor.presetpreview.ui.qfV) oD.A.hUw(p30.cD(), v8_1, 0).getValue());
            v8_1.AI(1556804775);
            if (!(v3_10 instanceof com.alightcreative.maineditor.presetpreview.ui.qfV$xfY)) {
                v31_1 = v11;
                v3_0 = v12_1;
                v2_0 = v13_1;
            } else {
                S1F.Enc v17 = v8_1;
                v31_1 = v11;
                v2_0 = v13_1;
                v3_0 = v12_1;
                GuB.t.j(R.h.x(-1699603826, 1, new com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity$CU(this, p30), v8_1, 54), 0, v6_1, 0, Y2.cY.R6(Uaz.c.H(((float) 12)), Uaz.c.H(((float) 12)), 0, 0, 12, 0), 0, C.gR.j.R6(), 0, IRH.CU.Bb(), R.h.x(-109898041, 1, new com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity$h(v3_10, p30, v12_1, this), v8_1, 54), v17, ((GuB.bV.R6 << 6) | 907542534), 170);
                v8_1 = v17;
            }
            v8_1.d();
            v8_1.AI(1556897754);
            Object v4_11 = (((v8_1.nvG(this) | v8_1.nvG(v2_0)) | v8_1.w0(v3_0)) | v8_1.nvG(v6_1));
            kotlin.jvm.functions.Function1 v5_7 = v8_1.x1();
            if ((v4_11 != null) || (v5_7 == v20.hUw())) {
                v5_7 = new v2n.A(this, v2_0, v3_0, v6_1);
                v8_1.FT(v5_7);
            }
            kotlin.jvm.functions.Function1 v5_9 = ((kotlin.jvm.functions.Function1) v5_7);
            v8_1.d();
            VVv.XSt.j(p30, v5_9, v8_1, (v31_1 & 14));
            if (S1F.Zv9.X9x()) {
                S1F.Zv9.GO();
            }
        }
        boolean v2_3 = v8_1.db();
        if (v2_3) {
            v2_3.hUw(new v2n.CU(this, p30, p32));
        }
        return;
    }

    public final Uyh.s$A cKj()
    {
        int v0_0 = this.X;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModelFactoryPremadeContent");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final Vbv.c cak()
    {
        int v0_0 = this.db;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("iapManager");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final ns.h e4D()
    {
        int v0_0 = this.l;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
            return 0;
        } else {
            return v0_0;
        }
    }

    public void finish()
    {
        int v0_0 = this.ah;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            v0_0 = 0;
        }
        v0_0.w0();
        super.finish();
        return;
    }

    protected void onCreate(android.os.Bundle p15)
    {
        R.A v15_3;
        this.getWindow().setBackgroundDrawableResource(2131099819);
        super.onCreate(p15);
        this.Pg(new dD0.h(this, this.Jm()));
        R.A v15_2 = this.getIntent().getStringArrayExtra("presets");
        if (v15_2 == null) {
            v15_3 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            v15_3 = kotlin.collections.ArraysKt.toList(v15_2);
            if (v15_3 == null) {
            }
        }
        R.A v15_7;
        int v2_0 = v15_3;
        String v3 = this.getIntent().getStringExtra("projectID");
        R.A v15_6 = this.getIntent().getLongArrayExtra("nestedSceneIdPath");
        if (v15_6 == null) {
            v15_7 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            v15_7 = kotlin.collections.ArraysKt.toList(v15_6);
            if (v15_7 == null) {
            }
        }
        java.util.List v4 = v15_7;
        long v5_1 = this.getIntent().getLongExtra("sceneElementID", -1);
        boolean v7 = this.getIntent().getBooleanExtra("appliesFirstPreset", 0);
        w9w.j.j(this.getWindow(), 0);
        android.view.Window v8 = this.getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v8, "getWindow(...)");
        FKt.Nrb.j(v8, 0, this.getColor(2131099665), 0, 4, 0);
        m.xfY.j(this, 0, R.h.j(-1259903014, 1, new com.alightcreative.maineditor.presetpreview.ui.PresetPreviewActivity$c(this, v2_0, v3, v4, v5_1, v7)), 1, 0);
        return;
    }

    protected void onPause()
    {
        int v0_0 = this.ah;
        if (v0_0 != 0) {
            if (v0_0 == 0) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                v0_0 = 0;
            }
            v0_0.AI();
        }
        FKt.h.x(this);
        super.onPause();
        return;
    }

    public final nwt.A uM()
    {
        int v0_0 = this.E;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("injet");
            return 0;
        } else {
            return v0_0;
        }
    }

    public dD0.h x1()
    {
        int v0_0 = this.Q;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("signInLauncher");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final com.alightcreative.maineditor.presetpreview.ui.c$A z2f()
    {
        int v0_0 = this.H;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
            return 0;
        } else {
            return v0_0;
        }
    }
}
