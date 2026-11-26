package com.alightcreative.monetization.ui;
public final class PaywallActivity extends com.alightcreative.monetization.ui.xfY {
    public static final com.alightcreative.monetization.ui.PaywallActivity$xfY T;
    public static final int db;
    public com.alightcreative.monetization.ui.XSt$A H;
    private com.alightcreative.monetization.ui.XSt X;

    static PaywallActivity()
    {
        com.alightcreative.monetization.ui.PaywallActivity.T = new com.alightcreative.monetization.ui.PaywallActivity$xfY(0);
        com.alightcreative.monetization.ui.PaywallActivity.db = 8;
        return;
    }

    public PaywallActivity()
    {
        return;
    }

    private static final kotlin.Unit B(com.alightcreative.monetization.ui.XSt p0, android.app.Activity p1)
    {
        p0.jgN(p1);
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit Frn(com.alightcreative.monetization.ui.PaywallActivity p3, xW7.A p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "action");
        if (!(p4 instanceof xW7.A$CU)) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(p4, xW7.A$xfY.hUw)) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(p4, xW7.A$XSt.hUw)) {
                    if (!(p4 instanceof xW7.A$A)) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(p4, xW7.A$h.hUw)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        } else {
                            p3.YU();
                        }
                    } else {
                        boolean v4_3 = ((xW7.A$A) p4).hUw();
                        String v1_1 = new StringBuilder();
                        v1_1.append("https://play.google.com/store/account/subscriptions?sku=");
                        v1_1.append(v4_3);
                        v1_1.append("&package=com.alightcreative.motion");
                        p3.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(v1_1.toString())), 0);
                    }
                } else {
                    p3.setResult(-3);
                    p3.finish();
                }
            } else {
                p3.setResult(-2);
                p3.finish();
            }
        } else {
            p3.setResult(-1, new android.content.Intent().putExtra("benefits", ((xW7.A$CU) p4).hUw()));
            p3.finish();
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit Ie(com.alightcreative.monetization.ui.XSt p6, QdR.d p7, com.alightcreative.monetization.ui.PaywallActivity p8, Q.N p9, int p10)
    {
        p6.QR(p10);
        QdR.K.x(p7, 0, 0, new com.alightcreative.monetization.ui.PaywallActivity$cY(p8, p9, 0), 3, 0);
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit If(com.alightcreative.monetization.ui.PaywallActivity p0, com.alightcreative.monetization.ui.XSt p1, android.app.Activity p2, int p3, S1F.Enc p4, int p5)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.wx(p0, p1, p2, p3, p4, p5);
    }

    private static final kotlin.Unit Jju(com.alightcreative.monetization.ui.XSt p0, android.app.Activity p1)
    {
        p0.jgN(p1);
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit Jm(com.alightcreative.monetization.ui.XSt p0, androidx.activity.BM p1)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.m0(p0, p1);
    }

    public static final synthetic void KE(com.alightcreative.monetization.ui.PaywallActivity p0, com.alightcreative.monetization.ui.XSt p1)
    {
        p0.X = p1;
        return;
    }

    public static synthetic kotlin.Unit N(com.alightcreative.monetization.ui.XSt p0, QdR.d p1, com.alightcreative.monetization.ui.PaywallActivity p2, Q.N p3, int p4)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.dav(p0, p1, p2, p3, p4);
    }

    public static final synthetic Object Odv(com.alightcreative.monetization.ui.PaywallActivity p0, Q.N p1, int p2, kotlin.coroutines.Continuation p3)
    {
        return p0.W3V(p1, p2, p3);
    }

    private static final kotlin.Unit PC0(com.alightcreative.monetization.ui.XSt p0, android.app.Activity p1)
    {
        p0.jgN(p1);
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit Pg(com.alightcreative.monetization.ui.XSt p6, QdR.d p7, GuB.bV p8)
    {
        p6.r8t();
        QdR.K.x(p7, 0, 0, new com.alightcreative.monetization.ui.PaywallActivity$A(p8, 0), 3, 0);
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit QR(com.alightcreative.monetization.ui.XSt p0, android.app.Activity p1)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.Jju(p0, p1);
    }

    public static synthetic boolean S(com.alightcreative.monetization.ui.XSt p0, GuB.WHS p1)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.cKj(p0, p1);
    }

    public static synthetic kotlin.Unit ST5(com.alightcreative.monetization.ui.XSt p0, QdR.d p1, com.alightcreative.monetization.ui.PaywallActivity p2, Q.N p3, int p4)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.Ie(p0, p1, p2, p3, p4);
    }

    private final Object W3V(Q.N p3, int p4, kotlin.coroutines.Continuation p5)
    {
        kotlin.Unit v3_2 = p3.T(2147483647, u.qfV.ojl(1000, p4, u.kh.x()), p5);
        if (v3_2 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v3_2;
        }
    }

    public static final synthetic com.alightcreative.monetization.ui.XSt Y(com.alightcreative.monetization.ui.PaywallActivity p0)
    {
        return p0.X;
    }

    private final void YU()
    {
        new qS.A(this).n(2132019941).Z5u(2132019940).GO(2132017454, 0).F0();
        return;
    }

    public static synthetic kotlin.Unit Z(com.alightcreative.monetization.ui.XSt p0, QdR.d p1, com.alightcreative.monetization.ui.PaywallActivity p2, Q.N p3)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.uq6(p0, p1, p2, p3);
    }

    private static final kotlin.Unit Z0(QdR.d p6, com.alightcreative.monetization.ui.XSt p7, GuB.bV p8)
    {
        QdR.K.x(p6, 0, 0, new com.alightcreative.monetization.ui.PaywallActivity$q(p7, p8, 0), 3, 0);
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit Zk(QdR.d p0, com.alightcreative.monetization.ui.XSt p1, GuB.bV p2)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.Z0(p0, p1, p2);
    }

    public static synthetic kotlin.Unit b9Y(com.alightcreative.monetization.ui.XSt p0, android.app.Activity p1)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.PC0(p0, p1);
    }

    private static final boolean cKj(com.alightcreative.monetization.ui.XSt p1, GuB.WHS p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        if (p2 == GuB.WHS.j) {
            p1.oiZ();
        }
        return 1;
    }

    public static synthetic kotlin.Unit cak(com.alightcreative.monetization.ui.XSt p0, QdR.d p1, com.alightcreative.monetization.ui.PaywallActivity p2, Q.N p3, int p4)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.m(p0, p1, p2, p3, p4);
    }

    private static final kotlin.Unit dav(com.alightcreative.monetization.ui.XSt p6, QdR.d p7, com.alightcreative.monetization.ui.PaywallActivity p8, Q.N p9, int p10)
    {
        p6.Z(p10);
        QdR.K.x(p7, 0, 0, new com.alightcreative.monetization.ui.PaywallActivity$V(p8, p9, 0), 3, 0);
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit e4D(com.alightcreative.monetization.ui.XSt p0, QdR.d p1, GuB.bV p2)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.Pg(p0, p1, p2);
    }

    public static synthetic kotlin.Unit g(QdR.d p0, com.alightcreative.monetization.ui.XSt p1, GuB.bV p2)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.r7(p0, p1, p2);
    }

    public static synthetic kotlin.Unit g2(com.alightcreative.monetization.ui.XSt p0, QdR.d p1, com.alightcreative.monetization.ui.PaywallActivity p2, Q.N p3)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.nG(p0, p1, p2, p3);
    }

    public static synthetic kotlin.Unit hsj(com.alightcreative.monetization.ui.XSt p0, android.app.Activity p1)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.B(p0, p1);
    }

    static synthetic Object i2(com.alightcreative.monetization.ui.PaywallActivity p0, Q.N p1, int p2, kotlin.coroutines.Continuation p3, int p4, Object p5)
    {
        if ((p4 & 2) != 0) {
            p2 = 0;
        }
        return p0.W3V(p1, p2, p3);
    }

    public static synthetic kotlin.Unit lU(com.alightcreative.monetization.ui.XSt p0, android.app.Activity p1)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.o(p0, p1);
    }

    private static final kotlin.Unit m(com.alightcreative.monetization.ui.XSt p6, QdR.d p7, com.alightcreative.monetization.ui.PaywallActivity p8, Q.N p9, int p10)
    {
        p6.Z(p10);
        QdR.K.x(p7, 0, 0, new com.alightcreative.monetization.ui.PaywallActivity$uZ5(p8, p9, 0), 3, 0);
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit m0(com.alightcreative.monetization.ui.XSt p1, androidx.activity.BM p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "$this$BackPressHandler");
        p1.Yd();
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit nG(com.alightcreative.monetization.ui.XSt p6, QdR.d p7, com.alightcreative.monetization.ui.PaywallActivity p8, Q.N p9)
    {
        p6.iVU();
        QdR.K.x(p7, 0, 0, new com.alightcreative.monetization.ui.PaywallActivity$XSt(p8, p9, 0), 3, 0);
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit o(com.alightcreative.monetization.ui.XSt p0, android.app.Activity p1)
    {
        p0.jgN(p1);
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit r7(QdR.d p6, com.alightcreative.monetization.ui.XSt p7, GuB.bV p8)
    {
        QdR.K.x(p6, 0, 0, new com.alightcreative.monetization.ui.PaywallActivity$x(p7, p8, 0), 3, 0);
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit tEh(com.alightcreative.monetization.ui.PaywallActivity p0, xW7.A p1)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.Frn(p0, p1);
    }

    public static synthetic kotlin.Unit uM(QdR.d p0, GuB.bV p1, com.alightcreative.monetization.ui.XSt p2, androidx.activity.BM p3)
    {
        return com.alightcreative.monetization.ui.PaywallActivity.yy(p0, p1, p2, p3);
    }

    private static final kotlin.Unit uq6(com.alightcreative.monetization.ui.XSt p6, QdR.d p7, com.alightcreative.monetization.ui.PaywallActivity p8, Q.N p9)
    {
        p6.iVU();
        QdR.K.x(p7, 0, 0, new com.alightcreative.monetization.ui.PaywallActivity$soy(p8, p9, 0), 3, 0);
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit wx(com.alightcreative.monetization.ui.PaywallActivity p0, com.alightcreative.monetization.ui.XSt p1, android.app.Activity p2, int p3, S1F.Enc p4, int p5)
    {
        p0.z2f(p1, p2, p4, S1F.lX.hUw((p3 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit yy(QdR.d p7, GuB.bV p8, com.alightcreative.monetization.ui.XSt p9, androidx.activity.BM p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "$this$BackPressHandler");
        QdR.K.x(p7, 0, 0, new com.alightcreative.monetization.ui.PaywallActivity$Ki(p8, p9, 0), 3, 0);
        return kotlin.Unit.INSTANCE;
    }

    public final com.alightcreative.monetization.ui.XSt$A jV()
    {
        int v0_0 = this.H;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
            return 0;
        } else {
            return v0_0;
        }
    }

    protected void onCreate(android.os.Bundle p8)
    {
        this.getWindow().setBackgroundDrawableResource(2131099819);
        super.onCreate(p8);
        w9w.j.j(this.getWindow(), 0);
        int v1_0 = this.getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_0, "getWindow(...)");
        FKt.Nrb.j(v1_0, 0, this.getColor(2131099665), 0, 4, 0);
        int v1_2 = 1;
        m.xfY.j(this, 0, R.h.j(-1426641600, v1_2, new com.alightcreative.monetization.ui.PaywallActivity$Gc(this)), v1_2, 0);
        return;
    }

    protected void onResume()
    {
        super.onResume();
        int v0_0 = this.X;
        if (v0_0 != 0) {
            if (v0_0 == 0) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                v0_0 = 0;
            }
            v0_0.b9Y();
        }
        return;
    }

    public final void z2f(com.alightcreative.monetization.ui.XSt p24, android.app.Activity p25, S1F.Enc p26, int p27)
    {
        int v2_3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p24, "viewModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p25, "activity");
        S1F.Enc v12_0 = p26.ojl(752776545);
        if ((p27 & 6) != 0) {
            v2_3 = p27;
        } else {
            int v2_7;
            if (!v12_0.nvG(p24)) {
                v2_7 = 2;
            } else {
                v2_7 = 4;
            }
            v2_3 = (v2_7 | p27);
        }
        if ((p27 & 48) == 0) {
            kotlin.jvm.functions.Function2 v6_2;
            if (!v12_0.nvG(p25)) {
                v6_2 = 16;
            } else {
                v6_2 = 32;
            }
            v2_3 |= v6_2;
        }
        if ((p27 & 384) == 0) {
            kotlin.jvm.functions.Function2 v6_5;
            if (!v12_0.nvG(this)) {
                v6_5 = 128;
            } else {
                v6_5 = 256;
            }
            v2_3 |= v6_5;
        }
        if (((v2_3 & 147) == 146) && (v12_0.uKP())) {
            v12_0.cv();
        } else {
            if (S1F.Zv9.X9x()) {
                S1F.Zv9.AM(752776545, v2_3, -1, "com.alightcreative.monetization.ui.PaywallActivity.PaywallActivityContent (PaywallActivity.kt:117)");
            }
            int v1_56 = v12_0.x1();
            S1F.Enc$xfY v22 = S1F.Enc.hUw;
            if (v1_56 == v22.hUw()) {
                v1_56 = S1F.d.ojl(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, v12_0);
                v12_0.FT(v1_56);
            }
            kotlin.jvm.functions.Function2 v6_25 = ((QdR.d) v1_56);
            kotlin.jvm.functions.Function1 v8_22 = Q.N5W.cD(0, v12_0, 0, 1);
            S1F.Enc v16_12 = c.xfY.hUw(this, v12_0, ((v2_3 >> 6) & 14));
            kotlin.jvm.functions.Function2 v9_8 = v8_22;
            v12_0.AI(-1952074277);
            Object v10_41 = v12_0.nvG(p24);
            boolean v11_42 = v12_0.x1();
            if ((v10_41 != null) || (v11_42 == v22.hUw())) {
                v11_42 = new qY.xfY(p24);
                v12_0.FT(v11_42);
            }
            Object v10_44 = ((kotlin.jvm.functions.Function1) v11_42);
            v12_0.d();
            int v4_53 = v9_8;
            kotlin.jvm.functions.Function2 v9_14 = GuB.t.uKP(GuB.WHS.j, 0, v10_44, 1, v12_0, 3078, 2);
            v12_0.AI(-1952067928);
            kotlin.jvm.functions.Function1 v8_0 = v12_0.nvG(p24);
            Object v10_0 = v12_0.x1();
            if ((v8_0 != null) || (v10_0 == v22.hUw())) {
                v10_0 = new qY.et(p24);
                v12_0.FT(v10_0);
            }
            kotlin.jvm.functions.Function0 v15_0;
            Object v10_2 = ((kotlin.jvm.functions.Function1) v10_0);
            v12_0.d();
            oU.XSt.R6(0, v10_2, v12_0, 0, 1);
            Object v10_6 = ((xW7.h) oD.A.hUw(p24.cD(), v12_0, 0).getValue());
            if (!(v10_6 instanceof xW7.h$CU)) {
                if (!(v10_6 instanceof xW7.h$A)) {
                    if (!(v10_6 instanceof xW7.h$xfY$XSt)) {
                        S1F.Enc v19 = 3;
                        boolean v11_3 = v16_12;
                        kotlin.jvm.functions.Function1 v8_3 = v4_53;
                        if (!(v10_6 instanceof xW7.h$xfY$xfY)) {
                            if (!(v10_6 instanceof xW7.h$xfY$A)) {
                                if (!(v10_6 instanceof xW7.h$xfY$CU)) {
                                    if (!(v10_6 instanceof xW7.h$xfY$h)) {
                                        v15_0 = v2_3;
                                        if (v10_6 != null) {
                                            v12_0.AI(-1952057704);
                                            v12_0.d();
                                            throw new kotlin.NoWhenBranchMatchedException();
                                        } else {
                                            v12_0.AI(-376213028);
                                            v12_0.d();
                                        }
                                    } else {
                                        v12_0.AI(-378672382);
                                        v15_0 = v2_3;
                                        fE2.h.hUw(fE2.t.cD(androidx.compose.foundation.layout.hz8.q(androidx.compose.ui.h.hUw, 0, 1, 0)), 0, 0, R.h.x(-234826097, 1, new com.alightcreative.monetization.ui.PaywallActivity$Sq(v10_6, p24, v9_14, p25, v6_25), v12_0, 54), v12_0, 3072, 6);
                                        v12_0.d();
                                    }
                                } else {
                                    v12_0.AI(-380173185);
                                    kotlin.jvm.functions.Function1 v8_9 = ((xW7.h$xfY$CU) v10_6);
                                    v12_0.AI(-1951922074);
                                    int v1_12 = (v12_0.nvG(p24) | v12_0.nvG(p25));
                                    int v4_7 = v12_0.x1();
                                    if ((v1_12 != 0) || (v4_7 == v22.hUw())) {
                                        v4_7 = new qY.qfV(p24, p25);
                                        v12_0.FT(v4_7);
                                    }
                                    Object v10_9 = ((kotlin.jvm.functions.Function0) v4_7);
                                    v12_0.d();
                                    v12_0.AI(-1951918915);
                                    int v1_15 = v12_0.nvG(p24);
                                    int v4_9 = v12_0.x1();
                                    if ((v1_15 != 0) || (v4_9 == v22.hUw())) {
                                        v4_9 = new com.alightcreative.monetization.ui.PaywallActivity$et(p24);
                                        v12_0.FT(v4_9);
                                    }
                                    int v4_11 = ((kotlin.reflect.KFunction) v4_9);
                                    v12_0.d();
                                    boolean v11_6 = ((kotlin.jvm.functions.Function0) v4_11);
                                    v12_0.AI(-1951916233);
                                    int v1_18 = v12_0.nvG(p24);
                                    int v4_12 = v12_0.x1();
                                    if ((v1_18 != 0) || (v4_12 == v22.hUw())) {
                                        v4_12 = new com.alightcreative.monetization.ui.PaywallActivity$m(p24);
                                        v12_0.FT(v4_12);
                                    }
                                    int v4_14 = ((kotlin.reflect.KFunction) v4_12);
                                    v12_0.d();
                                    int v4_15 = ((kotlin.jvm.functions.Function1) v4_14);
                                    v12_0.AI(-1951913765);
                                    int v1_23 = ((v12_0.nvG(v6_25) | v12_0.nvG(p24)) | v12_0.nvG(v9_14));
                                    int v13_4 = v12_0.x1();
                                    if ((v1_23 != 0) || (v13_4 == v22.hUw())) {
                                        v13_4 = new qY.Enc(v6_25, p24, v9_14);
                                        v12_0.FT(v13_4);
                                    }
                                    int v13_6 = ((kotlin.jvm.functions.Function0) v13_4);
                                    v12_0.d();
                                    v12_0.AI(-1951906119);
                                    int v1_26 = v12_0.nvG(p24);
                                    kotlin.jvm.functions.Function0 v14_2 = v12_0.x1();
                                    if ((v1_26 != 0) || (v14_2 == v22.hUw())) {
                                        v14_2 = new com.alightcreative.monetization.ui.PaywallActivity$MY(p24);
                                        v12_0.FT(v14_2);
                                    }
                                    kotlin.jvm.functions.Function0 v14_4 = ((kotlin.reflect.KFunction) v14_2);
                                    v12_0.d();
                                    kotlin.jvm.functions.Function0 v14_5 = ((kotlin.jvm.functions.Function0) v14_4);
                                    v12_0.AI(-1951903361);
                                    int v1_31 = ((v12_0.nvG(v6_25) | v12_0.nvG(p24)) | v12_0.nvG(v9_14));
                                    kotlin.jvm.functions.Function0 v15_2 = v12_0.x1();
                                    if ((v1_31 != 0) || (v15_2 == v22.hUw())) {
                                        v15_2 = new qY.F(v6_25, p24, v9_14);
                                        v12_0.FT(v15_2);
                                    }
                                    kotlin.jvm.functions.Function0 v15_4 = ((kotlin.jvm.functions.Function0) v15_2);
                                    v12_0.d();
                                    S1F.Enc v16_2 = v12_0;
                                    hbP.Ki.j(v8_9, v9_14, v10_9, v11_6, v4_15, v13_6, v14_5, v15_4, v16_2, (GuB.bV.R6 << 3));
                                    v12_0 = v16_2;
                                    v12_0.AI(-1951895067);
                                    int v4_19 = ((v12_0.nvG(v6_25) | v12_0.nvG(v9_14)) | v12_0.nvG(p24));
                                    kotlin.jvm.functions.Function1 v8_12 = v12_0.x1();
                                    if ((v4_19 != 0) || (v8_12 == v22.hUw())) {
                                        v8_12 = new qY.D(v6_25, v9_14, p24);
                                        v12_0.FT(v8_12);
                                    }
                                    kotlin.jvm.functions.Function1 v8_14 = ((kotlin.jvm.functions.Function1) v8_12);
                                    v12_0.d();
                                    oU.XSt.R6(0, v8_14, v12_0, 0, 1);
                                    v12_0.d();
                                    v15_0 = v2_3;
                                }
                            } else {
                                v12_0.AI(-380862687);
                                kotlin.jvm.functions.Function1 v8_16 = ((xW7.h$xfY$A) v10_6);
                                v12_0.AI(-1951944890);
                                int v1_38 = (v12_0.nvG(p24) | v12_0.nvG(p25));
                                int v4_23 = v12_0.x1();
                                if ((v1_38 != 0) || (v4_23 == v22.hUw())) {
                                    v4_23 = new qY.K(p24, p25);
                                    v12_0.FT(v4_23);
                                }
                                kotlin.jvm.functions.Function2 v9_3 = ((kotlin.jvm.functions.Function0) v4_23);
                                v12_0.d();
                                v12_0.AI(-1951941731);
                                int v1_41 = v12_0.nvG(p24);
                                int v4_25 = v12_0.x1();
                                if ((v1_41 != 0) || (v4_25 == v22.hUw())) {
                                    v4_25 = new com.alightcreative.monetization.ui.PaywallActivity$Enc(p24);
                                    v12_0.FT(v4_25);
                                }
                                int v4_27 = ((kotlin.reflect.KFunction) v4_25);
                                v12_0.d();
                                Object v10_11 = ((kotlin.jvm.functions.Function0) v4_27);
                                v12_0.AI(-1951939049);
                                int v1_44 = v12_0.nvG(p24);
                                int v4_28 = v12_0.x1();
                                if ((v1_44 != 0) || (v4_28 == v22.hUw())) {
                                    v4_28 = new com.alightcreative.monetization.ui.PaywallActivity$F(p24);
                                    v12_0.FT(v4_28);
                                }
                                int v4_30 = ((kotlin.reflect.KFunction) v4_28);
                                v12_0.d();
                                boolean v11_8 = ((kotlin.jvm.functions.Function1) v4_30);
                                v12_0.AI(-1951936650);
                                int v1_47 = v12_0.nvG(p24);
                                int v4_31 = v12_0.x1();
                                if ((v1_47 != 0) || (v4_31 == v22.hUw())) {
                                    v4_31 = new com.alightcreative.monetization.ui.PaywallActivity$D(p24);
                                    v12_0.FT(v4_31);
                                }
                                int v4_33 = ((kotlin.reflect.KFunction) v4_31);
                                v12_0.d();
                                int v4_34 = ((kotlin.jvm.functions.Function0) v4_33);
                                v12_0.AI(-1951934119);
                                int v1_51 = v12_0.nvG(p24);
                                kotlin.jvm.functions.Function2 v6_7 = v12_0.x1();
                                if ((v1_51 != 0) || (v6_7 == v22.hUw())) {
                                    v6_7 = new com.alightcreative.monetization.ui.PaywallActivity$Zv9(p24);
                                    v12_0.FT(v6_7);
                                }
                                kotlin.jvm.functions.Function2 v6_9 = ((kotlin.reflect.KFunction) v6_7);
                                v12_0.d();
                                int v13_9 = ((kotlin.jvm.functions.Function0) v6_9);
                                v12_0.AI(-1951931495);
                                int v1_54 = v12_0.nvG(p24);
                                kotlin.jvm.functions.Function2 v6_11 = v12_0.x1();
                                if ((v1_54 != 0) || (v6_11 == v22.hUw())) {
                                    v6_11 = new com.alightcreative.monetization.ui.PaywallActivity$AWD(p24);
                                    v12_0.FT(v6_11);
                                }
                                kotlin.jvm.functions.Function2 v6_13 = ((kotlin.reflect.KFunction) v6_11);
                                v12_0.d();
                                kotlin.jvm.functions.Function0 v15_5 = v12_0;
                                hbP.h.cD(v8_16, v9_3, v10_11, v11_8, v4_34, v13_9, ((kotlin.jvm.functions.Function0) v6_13), v15_5, 0);
                                v12_0 = v15_5;
                                v12_0.d();
                            }
                        } else {
                            v12_0.AI(-382496077);
                            kotlin.jvm.functions.Function2 v9_5 = ((xW7.h$xfY$xfY) v10_6);
                            int v4_37 = KQ.Gc.j(v9_5.H(), 0, v12_0, 0, 2);
                            v12_0.AI(-1951987034);
                            Object v10_15 = (v12_0.nvG(p24) | v12_0.nvG(p25));
                            int v13_12 = v12_0.x1();
                            if ((v10_15 != null) || (v13_12 == v22.hUw())) {
                                v13_12 = new qY.XSt(p24, p25);
                                v12_0.FT(v13_12);
                            }
                            int v13_14 = ((kotlin.jvm.functions.Function0) v13_12);
                            v12_0.d();
                            v12_0.AI(-1951983875);
                            Object v10_18 = v12_0.nvG(p24);
                            kotlin.jvm.functions.Function0 v14_8 = v12_0.x1();
                            if ((v10_18 != null) || (v14_8 == v22.hUw())) {
                                v14_8 = new com.alightcreative.monetization.ui.PaywallActivity$h(p24);
                                v12_0.FT(v14_8);
                            }
                            kotlin.jvm.functions.Function0 v14_10 = ((kotlin.reflect.KFunction) v14_8);
                            v12_0.d();
                            kotlin.jvm.functions.Function0 v14_11 = ((kotlin.jvm.functions.Function0) v14_10);
                            v12_0.AI(-1951980853);
                            Object v10_24 = (((v12_0.nvG(p24) | v12_0.nvG(v6_25)) | v12_0.nvG(this)) | v12_0.w0(v8_3));
                            kotlin.jvm.functions.Function0 v15_9 = v12_0.x1();
                            if ((v10_24 != null) || (v15_9 == v22.hUw())) {
                                v15_9 = new qY.V(p24, v6_25, this, v8_3);
                                v12_0.FT(v15_9);
                            }
                            kotlin.jvm.functions.Function0 v15_11 = ((kotlin.jvm.functions.Function0) v15_9);
                            v12_0.d();
                            v12_0.AI(-1951972600);
                            Object v10_30 = (((v12_0.nvG(p24) | v12_0.nvG(v6_25)) | v12_0.nvG(this)) | v12_0.w0(v8_3));
                            int v1_57 = v12_0.x1();
                            if ((v10_30 != null) || (v1_57 == v22.hUw())) {
                                v1_57 = new qY.cY(p24, v6_25, this, v8_3);
                                v12_0.FT(v1_57);
                            }
                            int v1_59 = ((kotlin.jvm.functions.Function1) v1_57);
                            v12_0.d();
                            v12_0.AI(-1951964671);
                            Object v10_36 = (((v12_0.nvG(p24) | v12_0.nvG(v6_25)) | v12_0.nvG(this)) | v12_0.w0(v8_3));
                            kotlin.jvm.functions.Function0 v26_1 = v1_59;
                            int v1_60 = v12_0.x1();
                            if ((v10_36 != null) || (v1_60 == v22.hUw())) {
                                v1_60 = new qY.c(p24, v6_25, this, v8_3);
                                v12_0.FT(v1_60);
                            }
                            S1F.Enc v16_11 = ((kotlin.jvm.functions.Function1) v1_60);
                            v12_0.d();
                            v12_0.AI(-1951957002);
                            int v1_63 = v12_0.nvG(p24);
                            kotlin.jvm.functions.Function2 v6_17 = v12_0.x1();
                            if ((v1_63 != 0) || (v6_17 == v22.hUw())) {
                                v6_17 = new com.alightcreative.monetization.ui.PaywallActivity$c(p24);
                                v12_0.FT(v6_17);
                            }
                            kotlin.jvm.functions.Function2 v6_19 = ((kotlin.reflect.KFunction) v6_17);
                            v12_0.d();
                            kotlin.jvm.functions.Function0 v18_0 = v12_0;
                            hj.F.j(v8_3, v9_5, v11_3, v4_37, v13_14, v14_11, v15_11, v26_1, v16_11, ((kotlin.jvm.functions.Function0) v6_19), v18_0, 0);
                            v12_0 = v18_0;
                            v12_0.AI(-1951953879);
                            int v4_40 = (v12_0.nvG(this) | v12_0.w0(v8_3));
                            kotlin.jvm.functions.Function2 v6_21 = v12_0.x1();
                            if ((v4_40 != 0) || (v6_21 == v22.hUw())) {
                                v6_21 = new com.alightcreative.monetization.ui.PaywallActivity$K(this, v8_3, 0);
                                v12_0.FT(v6_21);
                            }
                            kotlin.jvm.functions.Function2 v6_23 = ((kotlin.jvm.functions.Function2) v6_21);
                            v12_0.d();
                            S1F.d.R6(kotlin.Unit.INSTANCE, v6_23, v12_0, 6);
                            v12_0.d();
                        }
                    } else {
                        v12_0.AI(-384028066);
                        Object v10_39 = ((xW7.h$xfY$XSt) v10_6);
                        v12_0.AI(-1952043450);
                        boolean v11_13 = (v12_0.nvG(p24) | v12_0.nvG(p25));
                        int v13_17 = v12_0.x1();
                        if ((v11_13) || (v13_17 == v22.hUw())) {
                            v13_17 = new qY.m(p24, p25);
                            v12_0.FT(v13_17);
                        }
                        int v13_19 = ((kotlin.jvm.functions.Function0) v13_17);
                        v12_0.d();
                        v12_0.AI(-1952040291);
                        boolean v11_16 = v12_0.nvG(p24);
                        kotlin.jvm.functions.Function0 v15_13 = v12_0.x1();
                        if ((v11_16) || (v15_13 == v22.hUw())) {
                            v15_13 = new com.alightcreative.monetization.ui.PaywallActivity$Y(p24);
                            v12_0.FT(v15_13);
                        }
                        kotlin.jvm.functions.Function0 v15_15 = ((kotlin.reflect.KFunction) v15_13);
                        v12_0.d();
                        kotlin.jvm.functions.Function0 v15_16 = ((kotlin.jvm.functions.Function0) v15_15);
                        v12_0.AI(-1952037269);
                        boolean v11_22 = (((v12_0.nvG(p24) | v12_0.nvG(v6_25)) | v12_0.nvG(this)) | v12_0.w0(v4_53));
                        kotlin.jvm.functions.Function1 v8_19 = v12_0.x1();
                        if ((v11_22) || (v8_19 == v22.hUw())) {
                            v8_19 = new qY.A(p24, v6_25, this, v4_53);
                            v12_0.FT(v8_19);
                        }
                        kotlin.jvm.functions.Function1 v8_21 = ((kotlin.jvm.functions.Function0) v8_19);
                        v12_0.d();
                        v12_0.AI(-1952029016);
                        boolean v11_28 = (((v12_0.nvG(p24) | v12_0.nvG(v6_25)) | v12_0.nvG(this)) | v12_0.w0(v4_53));
                        kotlin.jvm.functions.Function0 v14_13 = v12_0.x1();
                        if ((v11_28) || (v14_13 == v22.hUw())) {
                            v14_13 = new qY.CU(p24, v6_25, this, v4_53);
                            v12_0.FT(v14_13);
                        }
                        kotlin.jvm.functions.Function0 v14_15 = ((kotlin.jvm.functions.Function1) v14_13);
                        v12_0.d();
                        v12_0.AI(-1952021130);
                        boolean v11_31 = v12_0.nvG(p24);
                        int v1_69 = v12_0.x1();
                        if ((v11_31) || (v1_69 == v22.hUw())) {
                            v1_69 = new com.alightcreative.monetization.ui.PaywallActivity$s(p24);
                            v12_0.FT(v1_69);
                        }
                        int v1_71 = ((kotlin.reflect.KFunction) v1_69);
                        v12_0.d();
                        int v1_72 = ((kotlin.jvm.functions.Function0) v1_71);
                        v12_0.AI(-1952018764);
                        boolean v11_34 = v12_0.nvG(p24);
                        kotlin.jvm.functions.Function0 v26_2 = v1_72;
                        int v1_73 = v12_0.x1();
                        if ((v11_34) || (v1_73 == v22.hUw())) {
                            v1_73 = new com.alightcreative.monetization.ui.PaywallActivity$Tn(p24);
                            v12_0.FT(v1_73);
                        }
                        int v1_75 = ((kotlin.reflect.KFunction) v1_73);
                        v12_0.d();
                        int v1_76 = ((kotlin.jvm.functions.Function0) v1_75);
                        v12_0.AI(-1952016186);
                        boolean v11_39 = ((v12_0.nvG(p24) | v12_0.nvG(v6_25)) | v12_0.nvG(v9_14));
                        kotlin.jvm.functions.Function0 v18_6 = v1_76;
                        int v1_77 = v12_0.x1();
                        if ((v11_39) || (v1_77 == v22.hUw())) {
                            v1_77 = new qY.h(p24, v6_25, v9_14);
                            v12_0.FT(v1_77);
                        }
                        int v1_79 = ((kotlin.jvm.functions.Function0) v1_77);
                        v12_0.d();
                        S1F.Enc v19_1 = v12_0;
                        kotlin.jvm.functions.Function1 v8_24 = v4_53;
                        Kr.CU.j(v8_24, v9_14, v10_39, v16_12, v13_19, v15_16, v8_21, v14_15, v26_2, v18_6, v1_79, v19_1, (GuB.bV.R6 << 3), 0);
                        v12_0 = v19_1;
                        v12_0.AI(-1952007607);
                        kotlin.jvm.functions.Function2 v6_29 = (v12_0.nvG(this) | v12_0.w0(v8_24));
                        kotlin.jvm.functions.Function2 v9_10 = v12_0.x1();
                        if ((v6_29 != null) || (v9_10 == v22.hUw())) {
                            v9_10 = new com.alightcreative.monetization.ui.PaywallActivity$CU(this, v8_24, 0);
                            v12_0.FT(v9_10);
                        }
                        kotlin.jvm.functions.Function2 v9_12 = ((kotlin.jvm.functions.Function2) v9_10);
                        v12_0.d();
                        S1F.d.R6(kotlin.Unit.INSTANCE, v9_12, v12_0, 6);
                        v12_0.d();
                    }
                } else {
                    v12_0.AI(-1952059446);
                    v12_0.AI(-1952057673);
                    int v4_47 = v12_0.nvG(p24);
                    kotlin.jvm.functions.Function2 v6_31 = v12_0.x1();
                    if ((v4_47 != 0) || (v6_31 == v22.hUw())) {
                        v6_31 = new com.alightcreative.monetization.ui.PaywallActivity$qfV(p24);
                        v12_0.FT(v6_31);
                    }
                    kotlin.jvm.functions.Function2 v6_33 = ((kotlin.reflect.KFunction) v6_31);
                    v12_0.d();
                    kotlin.jvm.functions.Function2 v6_34 = ((kotlin.jvm.functions.Function0) v6_33);
                    v12_0.AI(-1952055338);
                    int v4_50 = v12_0.nvG(p24);
                    kotlin.jvm.functions.Function1 v8_25 = v12_0.x1();
                    if ((v4_50 != 0) || (v8_25 == v22.hUw())) {
                        v8_25 = new com.alightcreative.monetization.ui.PaywallActivity$hz8(p24);
                        v12_0.FT(v8_25);
                    }
                    kotlin.jvm.functions.Function1 v8_27 = ((kotlin.reflect.KFunction) v8_25);
                    v12_0.d();
                    Oo.Enc.j(v6_34, ((kotlin.jvm.functions.Function0) v8_27), v12_0, 0);
                    v12_0.d();
                }
            } else {
                v12_0.AI(-1952062098);
                Kr.XSt.j(0, 0, v12_0, 0, 3);
                v12_0.d();
            }
            v12_0.AI(-1951795393);
            int v1_83 = v12_0.nvG(this);
            int v2_8 = v12_0.x1();
            if ((v1_83 != 0) || (v2_8 == v22.hUw())) {
                v2_8 = new qY.Zv9(this);
                v12_0.FT(v2_8);
            }
            int v2_10 = ((kotlin.jvm.functions.Function1) v2_8);
            v12_0.d();
            VVv.XSt.j(p24, v2_10, v12_0, (v15_0 & 14));
            if (S1F.Zv9.X9x()) {
                S1F.Zv9.GO();
            }
        }
        int v1_87 = v12_0.db();
        if (v1_87 != 0) {
            v1_87.hUw(new qY.AWD(this, p24, p25, p27));
        }
        return;
    }
}
