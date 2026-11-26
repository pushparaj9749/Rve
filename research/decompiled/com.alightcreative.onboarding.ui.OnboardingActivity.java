package com.alightcreative.onboarding.ui;
public final class OnboardingActivity extends com.alightcreative.onboarding.ui.xfY {

    static OnboardingActivity()
    {
        return;
    }

    public OnboardingActivity()
    {
        return;
    }

    private static final int QR()
    {
        return Zlg.A.hUw().size();
    }

    private static final kotlin.Unit ST5(QdR.d p6, SX.cY p7)
    {
        QdR.K.x(p6, 0, 0, new com.alightcreative.onboarding.ui.OnboardingActivity$xfY(p7, 0), 3, 0);
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit Z(com.alightcreative.onboarding.ui.OnboardingActivity p0, com.alightcreative.onboarding.ui.A p1)
    {
        return com.alightcreative.onboarding.ui.OnboardingActivity.hsj(p0, p1);
    }

    public static synthetic kotlin.Unit Zk(com.alightcreative.onboarding.ui.OnboardingActivity p0, com.alightcreative.onboarding.ui.CU p1, int p2, S1F.Enc p3, int p4)
    {
        return com.alightcreative.onboarding.ui.OnboardingActivity.g2(p0, p1, p2, p3, p4);
    }

    public static synthetic int b9Y()
    {
        return com.alightcreative.onboarding.ui.OnboardingActivity.QR();
    }

    private static final kotlin.Unit g2(com.alightcreative.onboarding.ui.OnboardingActivity p0, com.alightcreative.onboarding.ui.CU p1, int p2, S1F.Enc p3, int p4)
    {
        p0.S(p1, p3, S1F.lX.hUw((p2 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit hsj(com.alightcreative.onboarding.ui.OnboardingActivity p1, com.alightcreative.onboarding.ui.A p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        if (!(p2 instanceof com.alightcreative.onboarding.ui.A$xfY)) {
            throw new kotlin.NoWhenBranchMatchedException();
        } else {
            p1.setResult(-1);
            p1.finish();
            return kotlin.Unit.INSTANCE;
        }
    }

    public static synthetic kotlin.Unit tEh(QdR.d p0, SX.cY p1)
    {
        return com.alightcreative.onboarding.ui.OnboardingActivity.ST5(p0, p1);
    }

    public final void S(com.alightcreative.onboarding.ui.CU p17, S1F.Enc p18, int p19)
    {
        int v4_1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "viewModel");
        S1F.Enc v7_1 = p18.ojl(1680326644);
        if ((p19 & 6) != 0) {
            v4_1 = p19;
        } else {
            int v4_3;
            if (!v7_1.nvG(p17)) {
                v4_3 = 2;
            } else {
                v4_3 = 4;
            }
            v4_1 = (v4_3 | p19);
        }
        if ((p19 & 48) == 0) {
            boolean v5_4;
            if (!v7_1.w0(this)) {
                v5_4 = 16;
            } else {
                v5_4 = 32;
            }
            v4_1 |= v5_4;
        }
        int v14 = v4_1;
        if (((v14 & 19) == 18) && (v7_1.uKP())) {
            v7_1.cv();
        } else {
            if (S1F.Zv9.X9x()) {
                S1F.Zv9.AM(1680326644, v14, -1, "com.alightcreative.onboarding.ui.OnboardingActivity.OnboardingActivityContent (OnboardingActivity.kt:77)");
            }
            boolean v3_16 = v7_1.x1();
            S1F.Enc$xfY v15 = S1F.Enc.hUw;
            if (v3_16 == v15.hUw()) {
                v3_16 = S1F.d.ojl(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, v7_1);
                v7_1.FT(v3_16);
            }
            boolean v3_18 = ((QdR.d) v3_16);
            kotlin.jvm.functions.Function1 v10_5 = Zlg.A.hUw();
            v7_1.AI(1934045070);
            int v4_16 = v7_1.x1();
            if (v4_16 == v15.hUw()) {
                v4_16 = new MNi.xfY();
                v7_1.FT(v4_16);
            }
            boolean v3_9;
            c.CU v6_1 = ((kotlin.jvm.functions.Function0) v4_16);
            v7_1.d();
            int v4_21 = SX.V.w(v10_5, PfX.nn.T(0, 0, v6_1, v7_1, 384, 3), v7_1, 0);
            c.CU v6_4 = c.xfY.hUw(this, v7_1, ((v14 >> 3) & 14));
            kotlin.jvm.functions.Function0 v8_5 = ((com.alightcreative.onboarding.ui.XSt) oD.A.hUw(p17.cD(), v7_1, 0).getValue());
            v7_1.AI(1934049319);
            if (!(v8_5 instanceof com.alightcreative.onboarding.ui.XSt$xfY)) {
                v3_9 = 0;
            } else {
                kotlin.jvm.functions.Function0 v8_7 = ((com.alightcreative.onboarding.ui.XSt$xfY) v8_5).hUw();
                v7_1.AI(1934060835);
                kotlin.jvm.functions.Function0 v9_1 = (v7_1.nvG(v3_18) | v7_1.nvG(v4_21));
                kotlin.jvm.functions.Function1 v10_1 = v7_1.x1();
                if ((v9_1 != null) || (v10_1 == v15.hUw())) {
                    v10_1 = new MNi.A(v3_18, v4_21);
                    v7_1.FT(v10_1);
                }
                kotlin.jvm.functions.Function1 v10_3 = ((kotlin.jvm.functions.Function0) v10_1);
                v7_1.d();
                v7_1.AI(1934063726);
                boolean v3_1 = v7_1.nvG(p17);
                kotlin.jvm.functions.Function0 v9_3 = v7_1.x1();
                if ((v3_1) || (v9_3 == v15.hUw())) {
                    v9_3 = new com.alightcreative.onboarding.ui.OnboardingActivity$A(p17);
                    v7_1.FT(v9_3);
                }
                kotlin.jvm.functions.Function0 v9_5 = ((kotlin.reflect.KFunction) v9_3);
                v7_1.d();
                kotlin.jvm.functions.Function0 v9_6 = ((kotlin.jvm.functions.Function0) v9_5);
                v7_1.AI(1934065933);
                boolean v3_4 = v7_1.nvG(p17);
                S1F.Enc v11_0 = v7_1.x1();
                if ((v3_4) || (v11_0 == v15.hUw())) {
                    v11_0 = new com.alightcreative.onboarding.ui.OnboardingActivity$CU(p17);
                    v7_1.FT(v11_0);
                }
                S1F.Enc v11_2 = ((kotlin.reflect.KFunction) v11_0);
                v7_1.d();
                S1F.Enc v11_3 = ((kotlin.jvm.functions.Function0) v11_2);
                v7_1.AI(1934068256);
                boolean v3_7 = v7_1.nvG(p17);
                int v12_0 = v7_1.x1();
                if ((v3_7) || (v12_0 == v15.hUw())) {
                    v12_0 = new com.alightcreative.onboarding.ui.OnboardingActivity$h(p17);
                    v7_1.FT(v12_0);
                }
                int v12_2 = ((kotlin.reflect.KFunction) v12_0);
                v7_1.d();
                v3_9 = 0;
                S1F.Enc v11_4 = v7_1;
                MNi.c.uKP(v4_21, v8_7, v6_4, v10_3, v9_6, v11_3, ((kotlin.jvm.functions.Function1) v12_2), v11_4, 0);
                v7_1 = v11_4;
            }
            boolean v5_1;
            v7_1.d();
            v7_1.AI(1934072226);
            if ((v14 & 112) != 32) {
                v5_1 = v3_9;
            } else {
                v5_1 = 1;
            }
            boolean v3_10 = v7_1.x1();
            if ((v5_1) || (v3_10 == v15.hUw())) {
                v3_10 = new MNi.CU(this);
                v7_1.FT(v3_10);
            }
            boolean v3_12 = ((kotlin.jvm.functions.Function1) v3_10);
            v7_1.d();
            VVv.XSt.j(p17, v3_12, v7_1, (v14 & 14));
            if (S1F.Zv9.X9x()) {
                S1F.Zv9.GO();
            }
        }
        boolean v3_14 = v7_1.db();
        if (v3_14) {
            v3_14.hUw(new MNi.h(this, p17, p19));
        }
        return;
    }

    protected void onCreate(android.os.Bundle p8)
    {
        super.onCreate(p8);
        w9w.j.j(this.getWindow(), 0);
        int v1_1 = this.getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_1, "getWindow(...)");
        FKt.Nrb.j(v1_1, 0, this.getColor(2131099665), 0, 4, 0);
        int v1_0 = 1;
        m.xfY.j(this, 0, R.h.j(1981964088, v1_0, new com.alightcreative.onboarding.ui.OnboardingActivity$XSt(this)), v1_0, 0);
        return;
    }
}
