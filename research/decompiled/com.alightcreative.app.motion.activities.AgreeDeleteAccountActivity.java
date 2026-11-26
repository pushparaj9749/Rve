package com.alightcreative.app.motion.activities;
public final class AgreeDeleteAccountActivity extends com.alightcreative.app.motion.activities.LDK {
    public static final int E;
    public static final com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity$xfY l;
    private nVu.Tn H;
    public TV.n T;
    public Vbv.c X;
    private boolean db;
    private boolean w;

    static AgreeDeleteAccountActivity()
    {
        com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.l = new com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity$xfY(0);
        com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.E = 8;
        return;
    }

    public AgreeDeleteAccountActivity()
    {
        return;
    }

    private final void B()
    {
        this.db = 1;
        com.google.android.gms.tasks.Task v0_4 = this.H;
        com.alightcreative.app.motion.activities.PA v1_0 = 0;
        if (v0_4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_4 = 0;
        }
        v0_4.ojl.setVisibility(0);
        com.google.android.gms.tasks.Task v0_1 = this.H;
        if (v0_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_1 = 0;
        }
        v0_1.db.setVisibility(8);
        com.google.android.gms.tasks.Task v0_3 = this.H;
        if (v0_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_3 = 0;
        }
        v0_3.cLW.setVisibility(8);
        com.google.android.gms.tasks.Task v0_6 = this.H;
        if (v0_6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_6 = 0;
        }
        v0_6.cD.setVisibility(8);
        com.google.android.gms.tasks.Task v0_8 = this.H;
        if (v0_8 != null) {
            v1_0 = v0_8;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1_0.R6.setVisibility(8);
        com.google.firebase.functions.A.uKP.cD().l("getUploadedPackagesCount").hUw().addOnCompleteListener(new com.alightcreative.app.motion.activities.N(this)).addOnCanceledListener(new com.alightcreative.app.motion.activities.vp(this)).addOnFailureListener(new com.alightcreative.app.motion.activities.PA(this));
        return;
    }

    private static final void Ie(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p1)
    {
        p1.db = 0;
        com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.m0(p1);
        android.widget.FrameLayout v1_1 = p1.H;
        if (v1_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_1 = 0;
        }
        v1_1.ojl.setVisibility(8);
        return;
    }

    private static final void Jm(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p1, android.view.View p2)
    {
        p2.setActivated((p2.isActivated() ^ 1));
        p1.Pg();
        return;
    }

    public static synthetic void N(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p0, com.google.android.gms.tasks.Task p1)
    {
        com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.uM(p0, p1);
        return;
    }

    private final void Pg()
    {
        androidx.appcompat.widget.AppCompatButton v0_0 = this.H;
        int v1_0 = 0;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        androidx.appcompat.widget.AppCompatButton v0_1 = v0_0.x;
        int v3_0 = this.H;
        if (v3_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v3_0 = 0;
        }
        int v3_3;
        int v3_1 = v3_0.db;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v3_1, "willBeDeleteProjectHolder");
        int v4_1 = 0;
        if (v3_1.getVisibility() != 0) {
            v3_3 = 0;
        } else {
            v3_3 = 1;
        }
        nVu.Tn v6_0 = this.H;
        if (v6_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_0 = 0;
        }
        if ((v3_3 ^ v6_0.T.isActivated()) == 0) {
            int v3_5 = this.H;
            if (v3_5 == 0) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v3_5 = 0;
            }
            int v3_8;
            int v3_6 = v3_5.cLW;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v3_6, "willNotCancelHolder");
            if (v3_6.getVisibility() != 0) {
                v3_8 = 0;
            } else {
                v3_8 = 1;
            }
            nVu.Tn v6_4 = this.H;
            if (v6_4 != null) {
                v1_0 = v6_4;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            if ((v1_0.pM1.isActivated() ^ v3_8) == 0) {
                v4_1 = 1;
            }
        }
        v0_1.setEnabled(v4_1);
        return;
    }

    public static synthetic kotlin.Unit QR(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p0, com.alightcreative.widget.c p1)
    {
        return com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.uq6(p0, p1);
    }

    public static synthetic kotlin.Unit S(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p0, com.alightcreative.widget.c p1)
    {
        return com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.z2f(p0, p1);
    }

    public static synthetic void ST5(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.m(p0, p1);
        return;
    }

    public static synthetic void Z(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.Jm(p0, p1);
        return;
    }

    public static synthetic void Zk(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p0)
    {
        com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.Ie(p0);
        return;
    }

    public static synthetic void b9Y(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p0, Exception p1)
    {
        com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.nG(p0, p1);
        return;
    }

    private static final kotlin.Unit cKj(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p1, com.alightcreative.widget.c p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "dialog");
        p2.FT();
        p1.setResult(-1);
        p1.finish();
        return kotlin.Unit.INSTANCE;
    }

    private static final void cak(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p6, android.view.View p7)
    {
        if (!p6.db) {
            android.widget.FrameLayout v1_7 = p6.H;
            nVu.Tn v2 = 0;
            if (v1_7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v1_7 = 0;
            }
            android.widget.FrameLayout v1_0 = v1_7.pM1;
            int v4_0 = p6.H;
            if (v4_0 == 0) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v4_0 = 0;
            }
            int v4_1 = v4_0.T;
            String v5_1 = new android.widget.ImageView[2];
            v5_1[0] = v1_0;
            v5_1[1] = v4_1;
            android.widget.FrameLayout v1_3 = kotlin.collections.CollectionsKt.listOf(v5_1).iterator();
            while (v1_3.hasNext()) {
                int v4_5 = v1_3.next();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_5, "next(...)");
                ((android.widget.ImageView) v4_5).setActivated(1);
            }
            android.widget.FrameLayout v1_4 = p6.H;
            if (v1_4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v1_4 = 0;
            }
            v1_4.ojl.setBackgroundColor(p6.getColor(2131099673));
            android.widget.FrameLayout v1_6 = p6.H;
            if (v1_6 != null) {
                v2 = v1_6;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v2.ojl.setVisibility(0);
            p6.w = 1;
            com.google.firebase.functions.A.uKP.cD().l("deleteAccount").hUw().addOnCompleteListener(new com.alightcreative.app.motion.activities.tqK(p6));
            return;
        } else {
            return;
        }
    }

    private static final void dav(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p21, com.google.android.gms.tasks.Task p22)
    {
        String v2_1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p22, "it");
        p21.db = 0;
        String v2_11 = ((ifa.MY) p22.getResult());
        nVu.Tn v3 = 0;
        if (v2_11 == null) {
            v2_1 = 0;
        } else {
            String v2_0 = v2_11.hUw;
            if (v2_0 == null) {
            } else {
                v2_1 = IaL.xfY.x(v2_0);
            }
        }
        if (v2_1 != null) {
            String v2_4 = new com.alightcreative.app.motion.activities.G6(new org.json.JSONObject(v2_1));
            if (kotlin.jvm.internal.Intrinsics.areEqual(v2_4.j(), "success")) {
                androidx.appcompat.widget.AppCompatTextView v6_4 = p21.H;
                if (v6_4 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v6_4 = 0;
                }
                int v7_2;
                if (v2_4.hUw() <= 0) {
                    v7_2 = 8;
                } else {
                    v7_2 = 0;
                }
                v6_4.db.setVisibility(v7_2);
                String v9 = p21.getResources().getQuantityString(2131886088, v2_4.hUw(), new Object[] {Integer.valueOf(v2_4.hUw())}));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v9, "getQuantityString(...)");
                String v2_9 = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(v9, "[", "<", 0, 4, 0), "]", ">", 0, 4, 0);
                androidx.appcompat.widget.AppCompatTextView v6_7 = p21.H;
                if (v6_7 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v6_7 = 0;
                }
                v6_7.w.setText(android.text.Html.fromHtml(v2_9, 0));
            }
        }
        com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.m0(p21);
        android.widget.FrameLayout v0_1 = p21.H;
        if (v0_1 != null) {
            v3 = v0_1;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v3.ojl.setVisibility(8);
        return;
    }

    private static final void e4D(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p1, android.view.View p2)
    {
        p2.setActivated((p2.isActivated() ^ 1));
        p1.Pg();
        return;
    }

    public static synthetic void g2(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p0, com.google.android.gms.tasks.Task p1)
    {
        com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.dav(p0, p1);
        return;
    }

    public static synthetic void hsj(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.e4D(p0, p1);
        return;
    }

    public static synthetic void lU(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.cak(p0, p1);
        return;
    }

    private static final void m(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p0, android.view.View p1)
    {
        if (!p0.db) {
            p0.finish();
            return;
        } else {
            return;
        }
    }

    private static final void m0(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p6)
    {
        androidx.appcompat.widget.AppCompatTextView v0_0 = p6.H;
        int v1 = 0;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.R6.setVisibility(0);
        androidx.appcompat.widget.AppCompatTextView v0_1 = p6.H;
        if (v0_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_1 = 0;
        }
        String v4_3;
        if (!p6.If().X().contains(Vbv.mW.X)) {
            v4_3 = 8;
        } else {
            v4_3 = 0;
        }
        v0_1.cLW.setVisibility(v4_3);
        androidx.appcompat.widget.AppCompatTextView v0_3 = p6.H;
        if (v0_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_3 = 0;
        }
        androidx.appcompat.widget.AppCompatTextView v0_4 = v0_3.cLW;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_4, "willNotCancelHolder");
        if (v0_4.getVisibility() != 0) {
            androidx.appcompat.widget.AppCompatTextView v0_6 = p6.H;
            if (v0_6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_6 = 0;
            }
            androidx.appcompat.widget.AppCompatTextView v0_7 = v0_6.db;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_7, "willBeDeleteProjectHolder");
            if (v0_7.getVisibility() == 0) {
                androidx.appcompat.widget.AppCompatTextView v0_9 = p6.H;
                if (v0_9 != null) {
                    v1 = v0_9;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                v1.cD.setVisibility(0);
            }
        }
        p6.Pg();
        return;
    }

    private static final void nG(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p1, Exception p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        p1.db = 0;
        com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.m0(p1);
        android.widget.FrameLayout v1_2 = p1.H;
        if (v1_2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_2 = 0;
        }
        v1_2.ojl.setVisibility(8);
        return;
    }

    public static synthetic kotlin.Unit tEh(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p0, com.alightcreative.widget.c p1)
    {
        return com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity.cKj(p0, p1);
    }

    private static final void uM(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p4, com.google.android.gms.tasks.Task p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "it");
        com.alightcreative.app.motion.activities.eWj v0_3 = p4.H;
        String v1_0 = 0;
        if (v0_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_3 = 0;
        }
        com.alightcreative.app.motion.activities.eWj v0_5;
        v0_3.ojl.setVisibility(8);
        p4.w = 0;
        com.alightcreative.widget.c$xfY v5_4 = IaL.xfY.x(((ifa.MY) p5.getResult()).hUw);
        com.alightcreative.app.motion.activities.eWj v0_4 = v5_4.get("status");
        if (v0_4 == null) {
            v0_5 = 0;
        } else {
            v0_5 = v0_4.toString();
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(v0_5, "success")) {
            com.alightcreative.widget.c$xfY v5_5 = v5_4.get("errorMessage");
            if (v5_5 != null) {
                v1_0 = v5_5.toString();
            }
            p4.g().hUw(new TV.xfY$CU(new Exception(v1_0)));
            com.alightcreative.widget.c$xfY v5_9 = new com.alightcreative.widget.c$xfY(p4).H(2132017731);
            if (v1_0 == null) {
                v1_0 = p4.getString(2132017730);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_0, "getString(...)");
            }
            v5_9.x(v1_0).q(2132017454, new com.alightcreative.app.motion.activities.eWj(p4)).hUw().z();
            return;
        } else {
            p4.g().hUw(TV.xfY$A.hUw);
            dD0.VI.X9x(p4.g());
            new com.alightcreative.widget.c$xfY(p4).H(2132017744).cD(2132017745).R6(2132020013, new com.alightcreative.app.motion.activities.n(p4)).q(2132017454, new com.alightcreative.app.motion.activities.Bt(p4)).hUw().z();
            return;
        }
    }

    private static final kotlin.Unit uq6(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p1, com.alightcreative.widget.c p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "dialog");
        p2.FT();
        p1.setResult(0);
        p1.finish();
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit z2f(com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity p2, com.alightcreative.widget.c p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "it");
        p2.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://alightcreative.com/privacy/")));
        return kotlin.Unit.INSTANCE;
    }

    public final Vbv.c If()
    {
        int v0_0 = this.X;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("iapManager");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final TV.n g()
    {
        int v0_0 = this.T;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
            return 0;
        } else {
            return v0_0;
        }
    }

    public void onBackPressed()
    {
        if ((!this.db) && (!this.w)) {
            super.onBackPressed();
            return;
        } else {
            return;
        }
    }

    protected void onCreate(android.os.Bundle p18)
    {
        super.onCreate(p18);
        androidx.appcompat.widget.AppCompatButton v1_0 = nVu.Tn.cD(this.getLayoutInflater());
        this.H = v1_0;
        nVu.Tn v2 = 0;
        if (v1_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_0 = 0;
        }
        this.setContentView(v1_0.j());
        void v0_1 = this.B();
        androidx.appcompat.widget.AppCompatButton v1_2 = v0_1.H;
        if (v1_2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_2 = 0;
        }
        v1_2.R6.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        androidx.appcompat.widget.AppCompatButton v1_5 = v0_1.getString(2132017733);
        int v5_0 = v0_1.getString(2132017729);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v5_0, "getString(...)");
        com.alightcreative.app.motion.activities.mW v4_3 = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(v5_0, "[", "<", 0, 4, 0), "]", ">", 0, 4, 0);
        int v5_2 = new StringBuilder();
        v5_2.append(v1_5);
        v5_2.append(v4_3);
        androidx.appcompat.widget.AppCompatButton v1_7 = v5_2.toString();
        com.alightcreative.app.motion.activities.mW v4_4 = v0_1.H;
        if (v4_4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v4_4 = 0;
        }
        v4_4.R6.setText(android.text.Html.fromHtml(v1_7, 0));
        androidx.appcompat.widget.AppCompatButton v1_9 = v0_1.H;
        if (v1_9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_9 = 0;
        }
        v1_9.T.setOnClickListener(new com.alightcreative.app.motion.activities.d(v0_1));
        androidx.appcompat.widget.AppCompatButton v1_11 = v0_1.H;
        if (v1_11 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_11 = 0;
        }
        v1_11.pM1.setOnClickListener(new com.alightcreative.app.motion.activities.Z(v0_1));
        androidx.appcompat.widget.AppCompatButton v1_13 = v0_1.H;
        if (v1_13 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_13 = 0;
        }
        v1_13.x.setOnClickListener(new com.alightcreative.app.motion.activities.N5W(v0_1));
        androidx.appcompat.widget.AppCompatButton v1_15 = v0_1.H;
        if (v1_15 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_15 = 0;
        }
        v1_15.j.setOnClickListener(new com.alightcreative.app.motion.activities.mW(v0_1));
        androidx.appcompat.widget.AppCompatButton v1_17 = v0_1.H;
        if (v1_17 != null) {
            v2 = v1_17;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v2.x.setEnabled(0);
        return;
    }
}
