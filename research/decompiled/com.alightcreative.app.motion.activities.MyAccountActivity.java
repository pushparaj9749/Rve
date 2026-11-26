package com.alightcreative.app.motion.activities;
public final class MyAccountActivity extends com.alightcreative.app.motion.activities.FQ implements dD0.XSt {
    public static final int F;
    public static final com.alightcreative.app.motion.activities.MyAccountActivity$xfY cv;
    public nwt.A E;
    private nVu.soy H;
    private final S1F.j K;
    private com.google.firebase.firestore.q Q;
    private final com.alightcreative.app.motion.activities.MyAccountActivity$CU R;
    public TV.n T;
    public Vbv.c X;
    public dD0.h ah;
    private final kotlin.Lazy ak;
    public EY.XSt db;
    private final kotlin.Lazy f;
    public EZ.xfY l;
    public ns.h w;
    private final Vbv.HLZ z;

    static MyAccountActivity()
    {
        com.alightcreative.app.motion.activities.MyAccountActivity.cv = new com.alightcreative.app.motion.activities.MyAccountActivity$xfY(0);
        com.alightcreative.app.motion.activities.MyAccountActivity.F = 8;
        return;
    }

    public MyAccountActivity()
    {
        this.ak = new androidx.lifecycle.bV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(RWW.A), new com.alightcreative.app.motion.activities.MyAccountActivity$F(this), new com.alightcreative.app.motion.activities.MyAccountActivity$Enc(this), new com.alightcreative.app.motion.activities.MyAccountActivity$D(0, this));
        this.f = new androidx.lifecycle.bV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(qY.BM), new com.alightcreative.app.motion.activities.MyAccountActivity$AWD(this), new com.alightcreative.app.motion.activities.MyAccountActivity$Zv9(this), new com.alightcreative.app.motion.activities.MyAccountActivity$et(0, this));
        this.K = S1F.T.ojl(0, 0, 2, 0);
        this.R = new com.alightcreative.app.motion.activities.MyAccountActivity$CU(this);
        this.z = new com.alightcreative.app.motion.activities.Pl(this);
        return;
    }

    private static final String B(com.google.firebase.auth.FirebaseUser p2)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("TESTTEST :: firebaseAuthStateChanged :: ");
        v0_1.append(p2);
        return v0_1.toString();
    }

    private final void CB()
    {
        androidx.compose.ui.platform.ComposeView v0_0 = this.H;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.ojl.setContent(R.h.j(-15285550, 1, new com.alightcreative.app.motion.activities.MyAccountActivity$c(this)));
        return;
    }

    private static final kotlin.Unit En(com.alightcreative.app.motion.activities.MyAccountActivity p9)
    {
        EY.c v0_2 = p9.Jju().invoke();
        if ((v0_2 == null) || (v0_2.d() != 1)) {
            EY.XSt.FT(p9.Ie(), EY.c.hUw, 0, 2, 0);
        } else {
            QdR.K.x(androidx.lifecycle.uZ5.hUw(p9), 0, 0, new com.alightcreative.app.motion.activities.MyAccountActivity$XSt(p9, 0), 3, 0);
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void Frn(com.alightcreative.app.motion.activities.MyAccountActivity p2, android.view.View p3)
    {
        if (com.google.firebase.auth.FirebaseAuth.getInstance().uKP() != null) {
            android.content.Intent v0_2 = new kotlin.Pair[0];
            android.os.Bundle v3_7 = ((kotlin.Pair[]) java.util.Arrays.copyOf(v0_2, 0));
            android.content.Intent v0_1 = new android.content.Intent(p2, com.alightcreative.app.motion.activities.ManageAccountActivity);
            v0_1.putExtras(PYr.h.hUw(((kotlin.Pair[]) java.util.Arrays.copyOf(v3_7, v3_7.length))));
            p2.startActivity(v0_1);
        }
        return;
    }

    public static synthetic kotlin.Unit If(com.alightcreative.app.motion.activities.MyAccountActivity p0)
    {
        return com.alightcreative.app.motion.activities.MyAccountActivity.KE(p0);
    }

    private final void JHw()
    {
        androidx.compose.ui.platform.ComposeView v0_0 = this.H;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.x.setContent(R.h.j(1455651394, 1, new com.alightcreative.app.motion.activities.MyAccountActivity$V(this)));
        return;
    }

    public static synthetic void Jm(com.alightcreative.app.motion.activities.MyAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.MyAccountActivity.Y(p0, p1);
        return;
    }

    private static final kotlin.Unit KE(com.alightcreative.app.motion.activities.MyAccountActivity p6)
    {
        yaL.h.j(yaL.h.hUw, p6, "https://play.google.com/store/account/subscriptions", 0, 4, 0);
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit N(android.content.DialogInterface p0)
    {
        return com.alightcreative.app.motion.activities.MyAccountActivity.S6(p0);
    }

    private static final void Odv(com.alightcreative.app.motion.activities.MyAccountActivity p6, android.view.View p7)
    {
        qY.Uk.R6(p6, new com.alightcreative.app.motion.activities.LzT(p6), new com.alightcreative.app.motion.activities.CNI(p6), 0, 4, 0);
        return;
    }

    private static final void PC0(com.alightcreative.app.motion.activities.MyAccountActivity p0, android.view.View p1)
    {
        p0.finish();
        return;
    }

    private final void Pg(com.google.firebase.auth.FirebaseAuth p14)
    {
        com.google.firebase.firestore.q v14_16 = p14.uKP();
        fx.Enc.H(this, new com.alightcreative.app.motion.activities.aJ(v14_16));
        if (v14_16 != null) {
            android.widget.TextView v8_1 = this.Q;
            if (v8_1 != null) {
                v8_1.remove();
            }
            this.Q = 0;
            android.widget.TextView v8_6 = this.H;
            if (v8_6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v8_6 = 0;
            }
            android.widget.TextView v8_10 = v8_6.K;
            com.facebook.drawee.view.SimpleDraweeView v9_6 = this.H;
            if (v9_6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v9_6 = 0;
            }
            com.facebook.drawee.view.SimpleDraweeView v9_7 = v9_6.x1;
            androidx.appcompat.widget.AppCompatImageButton v10_4 = this.H;
            if (v10_4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v10_4 = 0;
            }
            androidx.appcompat.widget.AppCompatImageButton v10_5 = v10_4.Bb;
            android.view.View[] v11_1 = this.H;
            if (v11_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v11_1 = 0;
            }
            android.view.View[] v11_2 = v11_1.f;
            android.view.View[] v12 = new android.view.View[4];
            v12[0] = v8_10;
            v12[1] = v9_7;
            v12[2] = v10_5;
            v12[3] = v11_2;
            android.widget.TextView v8_12 = kotlin.collections.CollectionsKt.listOf(v12).iterator();
            while (v8_12.hasNext()) {
                ((android.view.View) v8_12.next()).setVisibility(8);
            }
            android.widget.TextView v4_1 = this.H;
            if (v4_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v4_1 = 0;
            }
            android.widget.TextView v4_2 = v4_1.Jd;
            android.widget.TextView v8_13 = this.H;
            if (v8_13 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v8_13 = 0;
            }
            android.widget.TextView v8_14 = v8_13.R;
            com.facebook.drawee.view.SimpleDraweeView v9_9 = this.H;
            if (v9_9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v9_9 = 0;
            }
            com.facebook.drawee.view.SimpleDraweeView v9_10 = v9_9.X9x;
            androidx.appcompat.widget.AppCompatImageButton v10_6 = this.H;
            if (v10_6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v10_6 = 0;
            }
            androidx.appcompat.widget.AppCompatImageButton v10_7 = v10_6.jE;
            android.view.View[] v3_2 = new android.view.View[4];
            v3_2[0] = v4_2;
            v3_2[1] = v8_14;
            v3_2[2] = v9_10;
            v3_2[3] = v10_7;
            com.alightcreative.app.motion.activities.yQ v0_11 = kotlin.collections.CollectionsKt.listOf(v3_2).iterator();
            while (v0_11.hasNext()) {
                ((android.view.View) v0_11.next()).setVisibility(0);
            }
            com.alightcreative.app.motion.activities.yQ v0_12 = this.H;
            if (v0_12 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_12 = 0;
            }
            android.net.Uri v1_1;
            com.alightcreative.app.motion.activities.yQ v0_13 = v0_12.Jd;
            android.net.Uri v1_8 = v14_16.getDisplayName();
            if ((v1_8 != null) && (!kotlin.text.StringsKt.isBlank(v1_8))) {
                v1_1 = v14_16.getDisplayName();
            } else {
                v1_1 = dD0.VI.XA(v14_16);
            }
            v0_13.setText(v1_1);
            com.alightcreative.app.motion.activities.yQ v0_1 = this.H;
            if (v0_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_1 = 0;
            }
            com.alightcreative.app.motion.activities.yQ v0_2 = v0_1.R;
            android.net.Uri v1_2 = v14_16.getEmail();
            if (v1_2 == null) {
                v1_2 = dD0.VI.XA(v14_16);
            }
            v0_2.setText(v1_2);
            com.alightcreative.app.motion.activities.yQ v0_3 = this.H;
            if (v0_3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_3 = 0;
            }
            v0_3.X9x.T(v14_16.getPhotoUrl(), 0);
            fx.Enc.H(this, new com.alightcreative.app.motion.activities.yQ(v14_16, this));
            return;
        } else {
            com.google.firebase.firestore.q v14_1 = this.H;
            if (v14_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v14_1 = 0;
            }
            v14_1.Jd.setText("");
            com.google.firebase.firestore.q v14_3 = this.H;
            if (v14_3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v14_3 = 0;
            }
            v14_3.R.setText("");
            com.google.firebase.firestore.q v14_5 = this.H;
            if (v14_5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v14_5 = 0;
            }
            com.google.firebase.firestore.q v14_6 = v14_5.K;
            android.widget.TextView v8_2 = this.H;
            if (v8_2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v8_2 = 0;
            }
            android.widget.TextView v8_3 = v8_2.x1;
            com.facebook.drawee.view.SimpleDraweeView v9_2 = this.H;
            if (v9_2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v9_2 = 0;
            }
            com.facebook.drawee.view.SimpleDraweeView v9_3 = v9_2.Bb;
            androidx.appcompat.widget.AppCompatImageButton v10_0 = this.H;
            if (v10_0 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v10_0 = 0;
            }
            androidx.appcompat.widget.AppCompatImageButton v10_1 = v10_0.f;
            android.view.View[] v11_0 = new android.view.View[4];
            v11_0[0] = v14_6;
            v11_0[1] = v8_3;
            v11_0[2] = v9_3;
            v11_0[3] = v10_1;
            com.google.firebase.firestore.q v14_8 = kotlin.collections.CollectionsKt.listOf(v11_0).iterator();
            while (v14_8.hasNext()) {
                ((android.view.View) v14_8.next()).setVisibility(0);
            }
            com.google.firebase.firestore.q v14_9 = this.H;
            if (v14_9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v14_9 = 0;
            }
            com.google.firebase.firestore.q v14_10 = v14_9.Jd;
            android.widget.TextView v8_5 = this.H;
            if (v8_5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v8_5 = 0;
            }
            android.widget.TextView v8_7 = v8_5.R;
            com.facebook.drawee.view.SimpleDraweeView v9_4 = this.H;
            if (v9_4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v9_4 = 0;
            }
            com.facebook.drawee.view.SimpleDraweeView v9_5 = v9_4.X9x;
            androidx.appcompat.widget.AppCompatImageButton v10_2 = this.H;
            if (v10_2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v10_2 = 0;
            }
            androidx.appcompat.widget.AppCompatImageButton v10_3 = v10_2.jE;
            android.view.View[] v3_0 = new android.view.View[4];
            v3_0[0] = v14_10;
            v3_0[1] = v8_7;
            v3_0[2] = v9_5;
            v3_0[3] = v10_3;
            com.google.firebase.firestore.q v14_12 = kotlin.collections.CollectionsKt.listOf(v3_0).iterator();
            while (v14_12.hasNext()) {
                ((android.view.View) v14_12.next()).setVisibility(8);
            }
            com.google.firebase.firestore.q v14_13 = this.H;
            if (v14_13 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v14_13 = 0;
            }
            v14_13.X9x.setImageURI(0);
            com.google.firebase.firestore.q v14_15 = this.Q;
            if (v14_15 != null) {
                v14_15.remove();
            }
            this.Q = 0;
            return;
        }
    }

    public static synthetic String QR(com.google.firebase.auth.FirebaseUser p0)
    {
        return com.alightcreative.app.motion.activities.MyAccountActivity.B(p0);
    }

    public static synthetic String S(com.google.firebase.auth.FirebaseUser p0, com.alightcreative.app.motion.activities.MyAccountActivity p1)
    {
        return com.alightcreative.app.motion.activities.MyAccountActivity.nG(p0, p1);
    }

    private static final kotlin.Unit S6(android.content.DialogInterface p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        p1.dismiss();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit ST5(com.alightcreative.app.motion.activities.MyAccountActivity p0, int p1)
    {
        return com.alightcreative.app.motion.activities.MyAccountActivity.i2(p0, p1);
    }

    private static final void W3V(com.alightcreative.app.motion.activities.MyAccountActivity p10, android.view.View p11)
    {
        com.alightcreative.widget.Uk v0_1 = new com.alightcreative.widget.Uk(p10, p10.o(), 0);
        long v8 = ((System.nanoTime() - com.alightcreative.app.motion.activities.Hw.hUw()) / 1000000);
        if (v8 > 120000) {
            com.alightcreative.app.motion.activities.Hw.x(0);
        }
        com.alightcreative.widget.Uk.cLW(v0_1, 2132020108, 2131361954, 0, 0, 0, 28, 0);
        if ((v8 <= 5000) || (com.alightcreative.app.motion.activities.Hw.j() >= 5)) {
            v0_1.f();
        }
        v0_1.nvG(new com.alightcreative.app.motion.activities.zt(p10));
        v0_1.R(p10.getResources().getDimensionPixelSize(2131166311));
        kotlin.jvm.internal.Intrinsics.checkNotNull(p11);
        com.alightcreative.widget.Uk.Hm(v0_1, p11, 0, 0, 0, 14, 0);
        return;
    }

    private static final void Y(com.alightcreative.app.motion.activities.MyAccountActivity p0, android.view.View p1)
    {
        p0.o().w();
        return;
    }

    private static final void YU(com.alightcreative.app.motion.activities.MyAccountActivity p7, com.alightcreative.account.F p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "purchaseState");
        android.widget.TextView v0_16 = p7.H;
        nVu.soy v2_0 = 0;
        if (v0_16 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_16 = 0;
        }
        v0_16.R6.setVisibility(4);
        android.widget.TextView v0_2 = p7.H;
        if (v0_2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_2 = 0;
        }
        v0_2.db.setVisibility(4);
        android.widget.TextView v0_15 = p7.H;
        if (v0_15 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_15 = 0;
        }
        v0_15.T.setVisibility(4);
        android.widget.TextView v0_28 = p7.H;
        if (v0_28 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_28 = 0;
        }
        v0_28.q.setVisibility(4);
        android.widget.TextView v0_30 = p7.H;
        if (v0_30 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_30 = 0;
        }
        v0_30.FT.setVisibility(4);
        android.widget.TextView v0_32 = p7.H;
        if (v0_32 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_32 = 0;
        }
        v0_32.H.setVisibility(4);
        android.widget.TextView v0_34 = p7.H;
        if (v0_34 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_34 = 0;
        }
        v0_34.X.setVisibility(4);
        android.widget.TextView v0_36 = p7.H;
        if (v0_36 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_36 = 0;
        }
        v0_36.uKP.setVisibility(4);
        android.widget.TextView v0_38 = p7.H;
        if (v0_38 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_38 = 0;
        }
        v0_38.cLW.setVisibility(4);
        android.widget.TextView v0_40 = p7.H;
        if (v0_40 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_40 = 0;
        }
        v0_40.w.setVisibility(4);
        android.widget.TextView v0_44 = com.alightcreative.app.motion.activities.MyAccountActivity$A.$EnumSwitchMapping$0[p8.ojl().ordinal()];
        if (v0_44 == 1) {
            android.widget.TextView v8_10 = p7.H;
            if (v8_10 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v8_10 = 0;
            }
            v8_10.H.setVisibility(0);
            android.widget.TextView v7_9 = p7.H;
            if (v7_9 != null) {
                v2_0 = v7_9;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v2_0.X.setVisibility(0);
            return;
        } else {
            if (v0_44 == 2) {
                android.widget.TextView v7_1 = p7.H;
                if (v7_1 != null) {
                    v2_0 = v7_1;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                v2_0.R6.setVisibility(0);
                return;
            } else {
                if (v0_44 == 3) {
                    if (!fx.c.E(p7)) {
                        android.widget.TextView v8_1 = p7.H;
                        if (v8_1 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            v8_1 = 0;
                        }
                        v8_1.cLW.setVisibility(0);
                        android.widget.TextView v8_3 = p7.H;
                        if (v8_3 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            v8_3 = 0;
                        }
                        v8_3.w.setVisibility(0);
                        android.widget.TextView v7_3 = p7.H;
                        if (v7_3 != null) {
                            v2_0 = v7_3;
                        } else {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        }
                        v2_0.LV.setVisibility(4);
                        return;
                    } else {
                        try {
                            android.widget.TextView v0_5 = kotlin.Result.constructor-impl(p7.getPackageManager().getApplicationInfo("com.android.vending", 128));
                        } catch (android.widget.TextView v0_6) {
                            v0_5 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(v0_6));
                        }
                        if (kotlin.Result.isFailure-impl(v0_5)) {
                            v0_5 = 0;
                        }
                        android.widget.TextView v0_9;
                        android.widget.TextView v0_8 = ((android.content.pm.ApplicationInfo) v0_5);
                        if (v0_8 == null) {
                            v0_9 = 0;
                        } else {
                            v0_9 = p7.getPackageManager().getApplicationLabel(v0_8);
                        }
                        TV.n v3_4 = p7.H;
                        if (v3_4 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            v3_4 = 0;
                        }
                        TV.n v3_5 = v3_4.T;
                        ns.h v4_1 = p7.getResources();
                        if (v0_9 == null) {
                            v0_9 = "Play Store";
                        }
                        v3_5.setText(v4_1.getString(2132020072, new Object[] {v0_9})));
                        android.widget.TextView v0_13 = p7.H;
                        if (v0_13 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            v0_13 = 0;
                        }
                        v0_13.uKP.setText(Vbv.Xo.X(p8, p7));
                        android.widget.TextView v8_6 = p7.H;
                        if (v8_6 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            v8_6 = 0;
                        }
                        v8_6.db.setVisibility(0);
                        android.widget.TextView v8_8 = p7.H;
                        if (v8_8 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            v8_8 = 0;
                        }
                        v8_8.T.setVisibility(0);
                        android.widget.TextView v7_5 = p7.H;
                        if (v7_5 != null) {
                            v2_0 = v7_5;
                        } else {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        }
                        v2_0.uKP.setVisibility(0);
                        return;
                    }
                } else {
                    if (v0_44 != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    } else {
                        android.widget.TextView v0_17 = p7.H;
                        if (v0_17 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            v0_17 = 0;
                        }
                        v0_17.FT.setVisibility(0);
                        android.widget.TextView v0_19 = p7.H;
                        if (v0_19 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            v0_19 = 0;
                        }
                        v0_19.H.setVisibility(0);
                        android.widget.TextView v0_21 = p7.H;
                        if (v0_21 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            v0_21 = 0;
                        }
                        v0_21.X.setVisibility(0);
                        android.widget.TextView v0_23 = p7.H;
                        if (v0_23 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                            v0_23 = 0;
                        }
                        v0_23.FT.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(p7, 1, 0));
                        android.widget.TextView v0_26 = p7.H;
                        if (v0_26 != null) {
                            v2_0 = v0_26;
                        } else {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        }
                        v2_0.FT.setAdapter(new com.alightcreative.app.motion.activities.sur(p8, p7.m0(), p7.Jju(), p7.o(), new com.alightcreative.app.motion.activities.Zo(p7)));
                        return;
                    }
                }
            }
        }
    }

    public static synthetic w9w.a9t Z(android.view.View p0, w9w.a9t p1)
    {
        return com.alightcreative.app.motion.activities.MyAccountActivity.yy(p0, p1);
    }

    private final qY.BM Z0()
    {
        return ((qY.BM) this.f.getValue());
    }

    public static synthetic void Zk(com.alightcreative.app.motion.activities.MyAccountActivity p0, com.google.firebase.auth.FirebaseAuth p1)
    {
        p0.Pg(p1);
        return;
    }

    public static synthetic void b9Y(com.alightcreative.app.motion.activities.MyAccountActivity p0, com.alightcreative.account.F p1)
    {
        com.alightcreative.app.motion.activities.MyAccountActivity.YU(p0, p1);
        return;
    }

    public static final synthetic S1F.j cKj(com.alightcreative.app.motion.activities.MyAccountActivity p0)
    {
        return p0.K;
    }

    public static synthetic void cak(com.alightcreative.app.motion.activities.MyAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.MyAccountActivity.wx(p0, p1);
        return;
    }

    private final RWW.A dav()
    {
        return ((RWW.A) this.ak.getValue());
    }

    public static synthetic void e4D(com.alightcreative.app.motion.activities.MyAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.MyAccountActivity.W3V(p0, p1);
        return;
    }

    private final void fdD()
    {
        androidx.compose.ui.platform.ComposeView v0_0 = this.H;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.Z5u.setContent(R.h.j(396048521, 1, new com.alightcreative.app.motion.activities.MyAccountActivity$qfV(this)));
        return;
    }

    public static synthetic kotlin.Unit g(com.alightcreative.app.motion.activities.MyAccountActivity p0)
    {
        return com.alightcreative.app.motion.activities.MyAccountActivity.jV(p0);
    }

    public static synthetic void g2(com.alightcreative.app.motion.activities.MyAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.MyAccountActivity.PC0(p0, p1);
        return;
    }

    public static synthetic void hsj(com.alightcreative.app.motion.activities.MyAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.MyAccountActivity.Frn(p0, p1);
        return;
    }

    private static final kotlin.Unit i2(com.alightcreative.app.motion.activities.MyAccountActivity p2, int p3)
    {
        if (p3 == 2131361954) {
            com.alightcreative.app.motion.activities.Hw.cD(System.nanoTime());
            com.alightcreative.app.motion.activities.Hw.x((com.alightcreative.app.motion.activities.Hw.j() + 1));
            p2.o().uKP();
        }
        return kotlin.Unit.INSTANCE;
    }

    private final void iM()
    {
        androidx.compose.ui.platform.ComposeView v0_0 = this.H;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.H.setContent(R.h.j(76316515, 1, new com.alightcreative.app.motion.activities.MyAccountActivity$cY(this)));
        return;
    }

    private static final kotlin.Unit jV(com.alightcreative.app.motion.activities.MyAccountActivity p6)
    {
        yaL.h.j(yaL.h.hUw, p6, "https://play.google.com/", 0, 4, 0);
        return kotlin.Unit.INSTANCE;
    }

    private final void jfW()
    {
        new com.alightcreative.app.motion.activities.pQK(this).uKP(2132019931).x(2132017679).H(2132017454, new com.alightcreative.app.motion.activities.FWP()).T();
        return;
    }

    public static synthetic void lU(com.alightcreative.app.motion.activities.MyAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.MyAccountActivity.Odv(p0, p1);
        return;
    }

    public static final synthetic void m(com.alightcreative.app.motion.activities.MyAccountActivity p0)
    {
        p0.jfW();
        return;
    }

    private static final String nG(com.google.firebase.auth.FirebaseUser p2, com.alightcreative.app.motion.activities.MyAccountActivity p3)
    {
        String v2_1 = p2.getPhotoUrl();
        int v3_1 = p3.H;
        if (v3_1 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v3_1 = 0;
        }
        int v3_4 = v3_1.X9x.getVisibility();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("TESTTEST :: BB :: ");
        v0_1.append(v2_1);
        v0_1.append(", ");
        v0_1.append(v3_4);
        v0_1.append(" out --");
        return v0_1.toString();
    }

    public static synthetic kotlin.Unit tEh(com.alightcreative.app.motion.activities.MyAccountActivity p0)
    {
        return com.alightcreative.app.motion.activities.MyAccountActivity.En(p0);
    }

    public static final synthetic nVu.soy uM(com.alightcreative.app.motion.activities.MyAccountActivity p0)
    {
        return p0.H;
    }

    public static final synthetic qY.BM uq6(com.alightcreative.app.motion.activities.MyAccountActivity p0)
    {
        return p0.Z0();
    }

    private final void v()
    {
        androidx.compose.ui.platform.ComposeView v0_0 = this.H;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.X.setContent(R.h.j(841022193, 1, new com.alightcreative.app.motion.activities.MyAccountActivity$K(this)));
        return;
    }

    private static final void wx(com.alightcreative.app.motion.activities.MyAccountActivity p2, android.view.View p3)
    {
        if (com.google.firebase.auth.FirebaseAuth.getInstance().uKP() != null) {
            android.content.Intent v0_2 = new kotlin.Pair[0];
            android.os.Bundle v3_7 = ((kotlin.Pair[]) java.util.Arrays.copyOf(v0_2, 0));
            android.content.Intent v0_1 = new android.content.Intent(p2, com.alightcreative.app.motion.activities.ManageAccountActivity);
            v0_1.putExtras(PYr.h.hUw(((kotlin.Pair[]) java.util.Arrays.copyOf(v3_7, v3_7.length))));
            p2.startActivity(v0_1);
        }
        return;
    }

    private static final w9w.a9t yy(android.view.View p3, w9w.a9t p4)
    {
        int v0_2 = p4.q(w9w.a9t$Zv9.ojl());
        kotlin.jvm.internal.Intrinsics.checkNotNull(p3);
        android.view.ViewGroup$MarginLayoutParams v1_1 = p3.getLayoutParams();
        if (v1_1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        } else {
            android.view.ViewGroup$MarginLayoutParams v1_0 = ((android.view.ViewGroup$MarginLayoutParams) v1_1);
            v1_0.topMargin = v0_2.j;
            v1_0.bottomMargin = v0_2.x;
            p3.setLayoutParams(v1_0);
            return p4;
        }
    }

    public static final synthetic RWW.A z2f(com.alightcreative.app.motion.activities.MyAccountActivity p0)
    {
        return p0.dav();
    }

    public final EY.XSt Ie()
    {
        int v0_0 = this.db;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final ns.h Jju()
    {
        int v0_0 = this.w;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
            return 0;
        } else {
            return v0_0;
        }
    }

    public void RF(dD0.h p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.ah = p2;
        return;
    }

    public final TV.n m0()
    {
        int v0_0 = this.T;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final Vbv.c o()
    {
        int v0_0 = this.X;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("iapManager");
            return 0;
        } else {
            return v0_0;
        }
    }

    protected void onCreate(android.os.Bundle p12)
    {
        super.onCreate(p12);
        this.RF(new dD0.h(this, this.m0()));
        android.widget.TextView v12_10 = nVu.soy.cD(this.getLayoutInflater());
        this.H = v12_10;
        nVu.soy v5_1 = 0;
        if (v12_10 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v12_10 = 0;
        }
        this.setContentView(v12_10.j());
        android.widget.TextView v12_25 = this.H;
        if (v12_25 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v12_25 = 0;
        }
        w9w.Xo.If(v12_25.j(), new com.alightcreative.app.motion.activities.glJ());
        this.Ie().E(this);
        android.widget.TextView v12_28 = this.H;
        if (v12_28 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v12_28 = 0;
        }
        v12_28.cD.setOnClickListener(new com.alightcreative.app.motion.activities.Kb7(this));
        android.widget.TextView v12_30 = this.H;
        if (v12_30 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v12_30 = 0;
        }
        v12_30.q.setOnClickListener(new com.alightcreative.app.motion.activities.Bed(this));
        android.widget.TextView v12_32 = this.H;
        if (v12_32 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v12_32 = 0;
        }
        v12_32.nvG.setOnClickListener(new com.alightcreative.app.motion.activities.QbK(this));
        android.widget.TextView v12_34 = this.H;
        if (v12_34 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v12_34 = 0;
        }
        v12_34.FT.setNestedScrollingEnabled(0);
        android.widget.TextView v12_36 = this.H;
        if (v12_36 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v12_36 = 0;
        }
        v12_36.Q.setOnClickListener(new com.alightcreative.app.motion.activities.NA(this));
        android.widget.TextView v12_39 = this.H;
        if (v12_39 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v12_39 = 0;
        }
        android.widget.TextView v12_40 = v12_39.K;
        android.widget.TextView v7_15 = this.H;
        if (v7_15 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v7_15 = 0;
        }
        android.widget.TextView v7_16 = v7_15.x1;
        int v8_2 = this.H;
        if (v8_2 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_2 = 0;
        }
        int v8_0 = v8_2.Bb;
        com.facebook.drawee.view.SimpleDraweeView v9_0 = this.H;
        if (v9_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_0 = 0;
        }
        com.facebook.drawee.view.SimpleDraweeView v9_1 = v9_0.f;
        androidx.appcompat.widget.AppCompatImageButton v10_0 = new android.view.View[4];
        v10_0[0] = v12_40;
        v10_0[1] = v7_16;
        v10_0[2] = v8_0;
        v10_0[3] = v9_1;
        android.widget.TextView v12_3 = kotlin.collections.CollectionsKt.listOf(v10_0).iterator();
        while (v12_3.hasNext()) {
            ((android.view.View) v12_3.next()).setVisibility(8);
        }
        android.widget.TextView v12_4 = this.H;
        if (v12_4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v12_4 = 0;
        }
        android.widget.TextView v12_5 = v12_4.Jd;
        android.widget.TextView v7_1 = this.H;
        if (v7_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v7_1 = 0;
        }
        android.widget.TextView v7_2 = v7_1.R;
        com.facebook.drawee.view.SimpleDraweeView v9_2 = this.H;
        if (v9_2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v9_2 = 0;
        }
        com.facebook.drawee.view.SimpleDraweeView v9_3 = v9_2.X9x;
        androidx.appcompat.widget.AppCompatImageButton v10_1 = this.H;
        if (v10_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v10_1 = 0;
        }
        androidx.appcompat.widget.AppCompatImageButton v10_2 = v10_1.jE;
        android.view.View[] v2_0 = new android.view.View[4];
        v2_0[0] = v12_5;
        v2_0[1] = v7_2;
        v2_0[2] = v9_3;
        v2_0[3] = v10_2;
        android.widget.TextView v12_8 = kotlin.collections.CollectionsKt.listOf(v2_0).iterator();
        while (v12_8.hasNext()) {
            ((android.view.View) v12_8.next()).setVisibility(8);
        }
        android.widget.TextView v12_9 = this.H;
        if (v12_9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v12_9 = 0;
        }
        v12_9.ah.setOnClickListener(new com.alightcreative.app.motion.activities.HtD(this));
        android.widget.TextView v12_12 = this.H;
        if (v12_12 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v12_12 = 0;
        }
        v12_12.jE.setOnClickListener(new com.alightcreative.app.motion.activities.J0d(this));
        android.widget.TextView v12_14 = this.H;
        if (v12_14 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v12_14 = 0;
        }
        v12_14.f.setContent(R.h.j(-268723296, 1, new com.alightcreative.app.motion.activities.MyAccountActivity$h(this)));
        fx.c.LV(this, this.R);
        this.o().j();
        this.o().LV();
        Vbv.Xo.T(this.z);
        this.o().w();
        if (!fx.c.E(this)) {
            android.widget.TextView v12_22 = this.H;
            if (v12_22 != null) {
                v5_1 = v12_22;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v5_1.LV.setVisibility(0);
        }
        this.iM();
        this.v();
        this.fdD();
        this.CB();
        this.JHw();
        return;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        Vbv.Xo.cLW(this.z);
        fx.c.x1(this, this.R);
        return;
    }

    protected void onResume()
    {
        super.onResume();
        this.o().ojl();
        this.Z0().pM1();
        return;
    }

    protected void onStart()
    {
        super.onStart();
        com.google.firebase.auth.FirebaseAuth.getInstance().x(new com.alightcreative.app.motion.activities.mb(this));
        com.google.firebase.auth.FirebaseAuth.getInstance().x(new com.alightcreative.app.motion.activities.n7M(this.o()));
        return;
    }

    protected void onStop()
    {
        com.google.firebase.auth.FirebaseAuth.getInstance().IB(new com.alightcreative.app.motion.activities.mb(this));
        com.google.firebase.auth.FirebaseAuth.getInstance().IB(new com.alightcreative.app.motion.activities.n7M(this.o()));
        super.onStop();
        return;
    }

    public final nwt.A r7()
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
        int v0_0 = this.ah;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("signInLauncher");
            return 0;
        } else {
            return v0_0;
        }
    }
}
