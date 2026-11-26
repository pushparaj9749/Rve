package com.alightcreative.app.motion.activities;
public final class ManageAccountActivity extends com.alightcreative.app.motion.activities.Eh1 {
    private android.net.Uri E;
    private nVu.Sq H;
    private java.util.ArrayList Q;
    public Vbv.c T;
    public TV.n X;
    private android.net.Uri ah;
    private boolean ak;
    private QdR.fS db;
    private String l;
    private com.facebook.K w;

    static ManageAccountActivity()
    {
        return;
    }

    public ManageAccountActivity()
    {
        this.Q = new java.util.ArrayList();
        return;
    }

    private static final kotlin.Unit A(com.alightcreative.app.motion.activities.ManageAccountActivity p1, com.google.firebase.auth.FirebaseUser p2, com.google.firebase.auth.AuthResult p3)
    {
        p1.TT1().hUw(TV.xfY$TQ.hUw);
        p2.s().addOnCompleteListener(new com.alightcreative.app.motion.activities.Vo(p1));
        return kotlin.Unit.INSTANCE;
    }

    private final boolean AX()
    {
        int v0_0 = this.l;
        android.net.Uri v1_0 = this.H;
        String v2 = 0;
        if (v1_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_0 = 0;
        }
        android.net.Uri v1_4 = v1_0.LV.getText();
        if (v1_4 != null) {
            v2 = v1_4.toString();
        }
        if ((kotlin.jvm.internal.Intrinsics.areEqual(v0_0, v2)) && (kotlin.jvm.internal.Intrinsics.areEqual(this.E, this.ah))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static synthetic boolean B(android.view.View p0, android.view.MotionEvent p1)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.Zm(p0, p1);
    }

    private static final kotlin.Unit C0b(com.alightcreative.app.motion.activities.ManageAccountActivity p4, android.view.MotionEvent p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "motionEvent");
        nVu.Sq v2 = 0;
        if (p5.getAction() == 1) {
            com.alightcreative.widget.SettingEditText v0_1 = p4.H;
            if (v0_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_1 = 0;
            }
            com.alightcreative.widget.SettingEditText v0_2 = v0_1.LV;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_2, "userNameEditText");
            FKt.pD.l(v0_2);
        }
        if (p5.getAction() == 0) {
            com.alightcreative.widget.SettingEditText v5_2 = p4.H;
            if (v5_2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v5_2 = 0;
            }
            v5_2.LV.requestFocus();
            com.alightcreative.widget.SettingEditText v5_4 = p4.H;
            if (v5_4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v5_4 = 0;
            }
            com.alightcreative.widget.SettingEditText v5_5 = v5_4.LV;
            int v4_1 = p4.H;
            if (v4_1 != 0) {
                v2 = v4_1;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v5_5.setSelection(v2.LV.length());
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void C4W(com.alightcreative.app.motion.activities.ManageAccountActivity p1, com.google.android.gms.tasks.Task p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        p1.u();
        return;
    }

    private final void C8(android.net.Uri p4)
    {
        this.ah = p4;
        androidx.appcompat.widget.AppCompatButton v4_1 = this.H;
        nVu.Sq v1 = 0;
        if (v4_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v4_1 = 0;
        }
        v4_1.ak.T(this.ah, 0);
        androidx.appcompat.widget.AppCompatButton v4_2 = this.H;
        if (v4_2 != null) {
            v1 = v4_2;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1.w.setEnabled(this.AX());
        return;
    }

    public static final synthetic void CB(com.alightcreative.app.motion.activities.ManageAccountActivity p0, String p1)
    {
        p0.Ehf(p1);
        return;
    }

    private static final kotlin.Unit CYw(com.alightcreative.widget.c p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        p1.FT();
        return kotlin.Unit.INSTANCE;
    }

    private final void EMD(com.google.firebase.auth.FirebaseAuth p1)
    {
        if (p1.uKP() == null) {
            this.finish();
        }
        return;
    }

    private static final kotlin.Unit Ear(com.alightcreative.widget.c p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "failureDialog");
        p1.FT();
        return kotlin.Unit.INSTANCE;
    }

    private final void Ehf(String p6)
    {
        com.alightcreative.app.motion.activities.lty v0_1 = com.google.firebase.auth.FirebaseAuth.getInstance().uKP();
        if ((v0_1 == null) || (v0_1.r8t())) {
            String v2_4;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(p6, "google.com")) {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(p6, "facebook.com")) {
                    v2_4 = this.getString(2132019023);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(v2_4);
                } else {
                    v2_4 = "Facebook";
                }
            } else {
                v2_4 = "Google";
            }
            new com.alightcreative.widget.c$xfY(this).X(v2_4).cD(2132020448).R6(2132017472, new com.alightcreative.app.motion.activities.rYW()).q(2132017454, new com.alightcreative.app.motion.activities.dCc(v0_1, p6, this)).hUw().z();
            return;
        } else {
            new com.alightcreative.widget.c$xfY(this).H(2132020450).cD(2132020449).q(2132017454, new com.alightcreative.app.motion.activities.lty()).hUw().z();
            return;
        }
    }

    public static final synthetic android.net.Uri En(com.alightcreative.app.motion.activities.ManageAccountActivity p0)
    {
        return p0.ah;
    }

    public static synthetic kotlin.Unit Frn(vg.A p0, com.alightcreative.app.motion.activities.ManageAccountActivity p1, int p2)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.O9(p0, p1, p2);
    }

    public static synthetic void Ie(com.alightcreative.app.motion.activities.ManageAccountActivity p0, androidx.activity.result.ActivityResult p1)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.v9(p0, p1);
        return;
    }

    public static synthetic kotlin.Unit If(com.alightcreative.widget.c p0)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.ygC(p0);
    }

    public static final synthetic void JHw(com.alightcreative.app.motion.activities.ManageAccountActivity p0, android.net.Uri p1)
    {
        p0.E = p1;
        return;
    }

    public static synthetic w9w.a9t Jju(android.view.View p0, w9w.a9t p1)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.MTr(p0, p1);
    }

    public static synthetic kotlin.Unit Jm(com.alightcreative.app.motion.activities.ManageAccountActivity p0, com.alightcreative.widget.c p1)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.y3P(p0, p1);
    }

    public static synthetic void KE(com.alightcreative.app.motion.activities.ManageAccountActivity p0, android.view.View p1, boolean p2)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.s(p0, p1, p2);
        return;
    }

    private static final void Kpz(com.alightcreative.app.motion.activities.ManageAccountActivity p3, android.view.View p4)
    {
        int v4_0 = p3.db;
        nVu.Sq v0 = 0;
        if (v4_0 != 0) {
            QdR.fS$xfY.j(v4_0, 0, 1, 0);
        }
        p3.ak = 0;
        int v4_1 = p3.H;
        if (v4_1 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v4_1 = 0;
        }
        v4_1.w.setEnabled(p3.AX());
        androidx.constraintlayout.widget.ConstraintLayout v3_1 = p3.H;
        if (v3_1 != null) {
            v0 = v3_1;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v0.T.setVisibility(8);
        return;
    }

    private static final kotlin.Unit MMm(com.alightcreative.app.motion.activities.ManageAccountActivity p2, int p3)
    {
        if (p3 == 2131361897) {
            new com.alightcreative.widget.c$xfY(p2).H(2132017727).cD(2132017732).R6(2132017472, new com.alightcreative.app.motion.activities.tTL()).q(2132020095, new com.alightcreative.app.motion.activities.q3o(p2)).hUw().z();
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final w9w.a9t MTr(android.view.View p3, w9w.a9t p4)
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

    public static synthetic void N(com.alightcreative.app.motion.activities.ManageAccountActivity p0, Exception p1)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.b(p0, p1);
        return;
    }

    private static final kotlin.Unit O9(vg.A p1, com.alightcreative.app.motion.activities.ManageAccountActivity p2, int p3)
    {
        if (p3 == 2131361887) {
            void v2_2 = new android.content.Intent("android.intent.action.OPEN_DOCUMENT");
            v2_2.setType("image/*");
            p1.hUw(v2_2);
        } else {
            if (p3 == 2131361955) {
                p2.C8(0);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit Odv(com.alightcreative.app.motion.activities.ManageAccountActivity p0, int p1)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.MMm(p0, p1);
    }

    public static synthetic void PC0(kotlin.jvm.functions.Function1 p0, Object p1)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.q9c(p0, p1);
        return;
    }

    public static synthetic void Pg(com.alightcreative.app.motion.activities.ManageAccountActivity p0, Exception p1)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.a9(p0, p1);
        return;
    }

    private static final kotlin.Unit QP(com.alightcreative.app.motion.activities.ManageAccountActivity p2, com.alightcreative.widget.c p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "it");
        String v1 = "google.com";
        if (!p2.Q.contains("google.com")) {
            v1 = "facebook.com";
            if (!p2.Q.contains("facebook.com")) {
                v1 = "password";
            }
        }
        p2.fdD(v1, com.alightcreative.app.motion.activities.g.cD);
        p3.FT();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void QR(com.alightcreative.app.motion.activities.ManageAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.VJy(p0, p1);
        return;
    }

    public static final synthetic android.net.Uri RF(com.alightcreative.app.motion.activities.ManageAccountActivity p0)
    {
        return p0.E;
    }

    public static synthetic void S(com.alightcreative.app.motion.activities.ManageAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.p(p0, p1);
        return;
    }

    private static final kotlin.Unit S6(com.alightcreative.widget.c p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        p1.FT();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit ST5(com.alightcreative.app.motion.activities.ManageAccountActivity p0, com.alightcreative.widget.c p1)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.wll(p0, p1);
    }

    private static final void V(com.alightcreative.app.motion.activities.ManageAccountActivity p8, vg.A p9, android.view.View p10)
    {
        com.alightcreative.widget.Uk v0_1 = new com.alightcreative.widget.Uk(p8, p8.b1(), 0);
        com.alightcreative.widget.Uk.cLW(v0_1, 2132017497, 2131361887, 0, 0, 0, 28, 0);
        com.alightcreative.widget.Uk.cLW(v0_1, 2132020111, 2131361955, 0, 0, 0, 28, 0);
        v0_1.nvG(new com.alightcreative.app.motion.activities.Mzr(p9, p8));
        v0_1.R(p8.getResources().getDimensionPixelSize(2131166311));
        String v8_1 = p8.H;
        if (v8_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_1 = 0;
        }
        androidx.cardview.widget.CardView v1_1 = v8_1.X;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_1, "profileImageHolder");
        com.alightcreative.widget.Uk.Hm(v0_1, v1_1, 0, 0, 0, 14, 0);
        return;
    }

    private static final void VJy(com.alightcreative.app.motion.activities.ManageAccountActivity p3, android.view.View p4)
    {
        androidx.constraintlayout.widget.ConstraintLayout v4_0 = p3.H;
        int v0_0 = 0;
        if (v4_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v4_0 = 0;
        }
        androidx.constraintlayout.widget.ConstraintLayout v4_5 = v4_0.LV;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_5, "userNameEditText");
        FKt.pD.X(v4_5);
        androidx.constraintlayout.widget.ConstraintLayout v4_1 = p3.H;
        if (v4_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v4_1 = 0;
        }
        v4_1.LV.clearFocus();
        androidx.constraintlayout.widget.ConstraintLayout v4_3 = p3.H;
        if (v4_3 != null) {
            v0_0 = v4_3;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v0_0.T.setVisibility(0);
        p3.kBB();
        return;
    }

    private static final kotlin.Unit W(com.alightcreative.widget.c p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        p1.FT();
        return kotlin.Unit.INSTANCE;
    }

    public static final synthetic void W3V(com.alightcreative.app.motion.activities.ManageAccountActivity p0)
    {
        p0.wH();
        return;
    }

    private static final kotlin.Unit WJ(com.google.firebase.auth.FirebaseUser p1, String p2, com.alightcreative.app.motion.activities.ManageAccountActivity p3, com.alightcreative.widget.c p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "dialog");
        if (p1 != null) {
            com.alightcreative.app.motion.activities.WAM v2_3 = p1.W(p2);
            if (v2_3 != null) {
                com.google.android.gms.tasks.Task v1_1 = v2_3.addOnSuccessListener(new com.alightcreative.app.motion.activities.VZ(new com.alightcreative.app.motion.activities.Wt(p3, p1)));
                if (v1_1 != null) {
                    v1_1.addOnFailureListener(new com.alightcreative.app.motion.activities.WAM(p3));
                }
            }
        }
        p4.FT();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit Y(com.alightcreative.widget.c p0)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.S6(p0);
    }

    public static final synthetic nVu.Sq YU(com.alightcreative.app.motion.activities.ManageAccountActivity p0)
    {
        return p0.H;
    }

    public static synthetic kotlin.Unit Z(com.alightcreative.app.motion.activities.ManageAccountActivity p0, com.google.firebase.auth.FirebaseUser p1, com.google.firebase.auth.AuthResult p2)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.A(p0, p1, p2);
    }

    public static synthetic void Z0(com.alightcreative.app.motion.activities.ManageAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.jj(p0, p1);
        return;
    }

    public static synthetic void Zk(com.alightcreative.app.motion.activities.ManageAccountActivity p0, vg.A p1, android.view.View p2)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.V(p0, p1, p2);
        return;
    }

    private static final boolean Zm(android.view.View p0, android.view.MotionEvent p1)
    {
        return 1;
    }

    private static final void a9(com.alightcreative.app.motion.activities.ManageAccountActivity p1, Exception p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        int v0_3 = new com.alightcreative.widget.c$xfY(p1);
        com.alightcreative.widget.c v1_3 = p2.getLocalizedMessage();
        if (v1_3 == null) {
            v1_3 = "";
        }
        v0_3.x(v1_3).q(2132017454, new com.alightcreative.app.motion.activities.Pi()).hUw().z();
        return;
    }

    private static final void b(com.alightcreative.app.motion.activities.ManageAccountActivity p2, Exception p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "it");
        p2.TT1().hUw(new TV.xfY$p(p3));
        int v0_4 = new com.alightcreative.widget.c$xfY(p2);
        com.alightcreative.widget.c v2_1 = p3.getLocalizedMessage();
        if (v2_1 == null) {
            v2_1 = "";
        }
        v0_4.x(v2_1).q(2132017454, new com.alightcreative.app.motion.activities.UN()).hUw().z();
        return;
    }

    public static synthetic kotlin.Unit b9Y(com.alightcreative.widget.c p0)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.qxC(p0);
    }

    public static synthetic void cKj(com.alightcreative.app.motion.activities.ManageAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.pL(p0, p1);
        return;
    }

    public static synthetic kotlin.Unit cak(com.alightcreative.app.motion.activities.ManageAccountActivity p0, com.alightcreative.widget.c p1)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.QP(p0, p1);
    }

    private static final kotlin.Unit dDX(com.alightcreative.widget.c p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "dialog");
        p1.FT();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void dav(com.alightcreative.app.motion.activities.ManageAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.Kpz(p0, p1);
        return;
    }

    public static synthetic kotlin.Unit e4D(com.alightcreative.app.motion.activities.ManageAccountActivity p0, android.view.MotionEvent p1)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.C0b(p0, p1);
    }

    private final void fdD(String p4, com.alightcreative.app.motion.activities.g p5)
    {
        if (p4 != null) {
            com.alightcreative.app.motion.activities.ZT v0_3 = com.google.firebase.auth.FirebaseAuth.getInstance();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_3, "getInstance(...)");
            com.alightcreative.app.motion.activities.ZT v0_11 = v0_3.uKP();
            if (v0_11 != null) {
                String v1_9 = p4.hashCode();
                if (v1_9 == -1536293812) {
                    if (p4.equals("google.com")) {
                        com.alightcreative.app.motion.activities.elW v5_3;
                        com.google.android.gms.tasks.Task v4_8 = new com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder(com.google.android.gms.auth.api.signin.GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken("414370328124-4uocihe36cclhhtm4nr62trnd223ekr0.apps.googleusercontent.com").requestEmail().build();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_8, "build(...)");
                        com.google.android.gms.tasks.Task v4_9 = com.google.android.gms.auth.api.signin.GoogleSignIn.getClient(this, v4_8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_9, "getClient(...)");
                        com.google.android.gms.tasks.Task v4_10 = v4_9.getSignInIntent();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_10, "getSignInIntent(...)");
                        v4_10.putExtra("accountManagerAction", p5.j());
                        if (p5 != com.alightcreative.app.motion.activities.g.x) {
                            v5_3 = 13002;
                        } else {
                            v5_3 = 13001;
                        }
                        this.startActivityForResult(v4_10, v5_3);
                        return;
                    }
                } else {
                    if (v1_9 == -364826023) {
                        if (p4.equals("facebook.com")) {
                            this.w = com.facebook.K$xfY.hUw();
                            com.google.android.gms.tasks.Task v4_13 = com.facebook.login.LoginManager.uKP;
                            v4_13.cD().db(this, kotlin.collections.CollectionsKt.listOf(new String[] {"email", "public_profile"})));
                            v4_13.cD().l(this.w, new com.alightcreative.app.motion.activities.ManageAccountActivity$xfY(this, p5));
                            return;
                        }
                    } else {
                        if ((v1_9 == 1216985755) && (p4.equals("password"))) {
                            com.google.android.gms.tasks.Task v4_16 = v0_11.getEmail();
                            if (v4_16 != null) {
                                com.alightcreative.app.motion.activities.elW v5_4 = p5.j();
                                com.alightcreative.app.motion.activities.ZT v0_14 = new StringBuilder();
                                v0_14.append("actions=");
                                v0_14.append(v5_4);
                                com.google.firebase.auth.FirebaseAuth.getInstance().F0(v4_16, dD0.VI.oiZ(this, v0_14.toString())).addOnSuccessListener(new com.alightcreative.app.motion.activities.oe(new com.alightcreative.app.motion.activities.ZT(this, v4_16))).addOnFailureListener(new com.alightcreative.app.motion.activities.elW(this));
                                return;
                            }
                        }
                    }
                }
            }
        }
        return;
    }

    public static synthetic kotlin.Unit g(com.alightcreative.widget.c p0)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.lka(p0);
    }

    public static synthetic kotlin.Unit g2(com.alightcreative.app.motion.activities.ManageAccountActivity p0, android.widget.EditText p1)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.z8(p0, p1);
    }

    private static final kotlin.Unit hk(com.alightcreative.widget.c p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        p1.FT();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit hsj(com.alightcreative.widget.c p0)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.dDX(p0);
    }

    public static final synthetic boolean i2(com.alightcreative.app.motion.activities.ManageAccountActivity p0)
    {
        return p0.AX();
    }

    public static final synthetic void iM(com.alightcreative.app.motion.activities.ManageAccountActivity p0, String p1)
    {
        p0.l = p1;
        return;
    }

    public static final synthetic void jV(com.alightcreative.app.motion.activities.ManageAccountActivity p0)
    {
        p0.sw();
        return;
    }

    private static final kotlin.Unit jfW(com.alightcreative.app.motion.activities.ManageAccountActivity p0, String p1, Void p2)
    {
        new com.alightcreative.widget.c$xfY(p0).X(p1).cD(2132020252).q(2132017454, new com.alightcreative.app.motion.activities.NQL()).hUw().z();
        return kotlin.Unit.INSTANCE;
    }

    private static final void jj(com.alightcreative.app.motion.activities.ManageAccountActivity p8, android.view.View p9)
    {
        com.alightcreative.widget.Uk v0_1 = new com.alightcreative.widget.Uk(p8, p8.b1(), 0);
        com.alightcreative.widget.Uk.cLW(v0_1, 2132017727, 2131361897, 0, 0, 0, 28, 0);
        v0_1.nvG(new com.alightcreative.app.motion.activities.mDh(p8));
        v0_1.R(p8.getResources().getDimensionPixelSize(2131166311));
        String v8_1 = p8.H;
        if (v8_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_1 = 0;
        }
        android.widget.ImageButton v1_1 = v8_1.H;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_1, "overflowButton");
        com.alightcreative.widget.Uk.Hm(v0_1, v1_1, 0, 0, 0, 14, 0);
        return;
    }

    private final void kBB()
    {
        if (this.AX()) {
            this.ak = 1;
            com.google.firebase.auth.FirebaseUser v5 = com.google.firebase.auth.FirebaseAuth.getInstance().uKP();
            if (v5 != null) {
                QdR.fS v0_2 = com.google.firebase.storage.XSt.q();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_2, "getInstance(...)");
                com.google.firebase.auth.UserProfileChangeRequest$xfY v4_1 = new com.google.firebase.auth.UserProfileChangeRequest$xfY();
                com.alightcreative.app.motion.activities.ManageAccountActivity v1_10 = this.l;
                com.google.firebase.storage.F v2_3 = this.H;
                com.alightcreative.app.motion.activities.ManageAccountActivity v6_4 = 0;
                if (v2_3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v2_3 = 0;
                }
                com.google.firebase.storage.F v2_6;
                com.google.firebase.storage.F v2_5 = v2_3.LV.getText();
                if (v2_5 == null) {
                    v2_6 = 0;
                } else {
                    v2_6 = v2_5.toString();
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v1_10, v2_6)) {
                    com.alightcreative.app.motion.activities.ManageAccountActivity v1_12 = this.H;
                    if (v1_12 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v1_12 = 0;
                    }
                    com.alightcreative.app.motion.activities.ManageAccountActivity v1_15;
                    com.alightcreative.app.motion.activities.ManageAccountActivity v1_14 = v1_12.LV.getText();
                    if (v1_14 == null) {
                        v1_15 = 0;
                    } else {
                        v1_15 = v1_14.toString();
                    }
                    v4_1.j(v1_15);
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(this.E, this.ah)) {
                    com.alightcreative.app.motion.activities.ManageAccountActivity v1_18 = this.ah;
                    if (v1_18 != null) {
                        if (v1_18 != null) {
                            com.google.firebase.storage.F v2_8 = this.getContentResolver();
                            if (v2_8 != null) {
                                v6_4 = v2_8.openInputStream(v1_18);
                            }
                            com.alightcreative.app.motion.activities.ManageAccountActivity v1_20 = android.graphics.BitmapFactory.decodeStream(v6_4);
                            com.google.firebase.storage.F v2_10 = Math.max(v1_20.getWidth(), v1_20.getHeight());
                            byte[] v3_5 = (1140850688 / ((float) v2_10));
                            if (v2_10 > 512) {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(v1_20);
                                v1_20 = FKt.hz8.cD(v1_20, ((int) (((float) v1_20.getWidth()) * v3_5)), ((int) (((float) v1_20.getHeight()) * v3_5)));
                            }
                            com.google.firebase.storage.F v2_1 = new java.io.ByteArrayOutputStream();
                            v1_20.compress(android.graphics.Bitmap$CompressFormat.JPEG, 90, v2_1);
                            byte[] v3_1 = v2_1.toByteArray();
                            com.alightcreative.app.motion.activities.ManageAccountActivity v1_0 = System.currentTimeMillis();
                            com.alightcreative.app.motion.activities.ManageAccountActivity v6_2 = new StringBuilder();
                            v6_2.append(v1_0);
                            v6_2.append(".jpg");
                            String v7_0 = v6_2.toString();
                            com.google.firebase.storage.F v2_2 = v0_2.cLW().j("user").j("p").j(v5.ygC()).j("photo").j(v7_0);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_2, "child(...)");
                            this.db = QdR.K.x(androidx.lifecycle.Sq.hUw(this.getLifecycle()), 0, 0, new com.alightcreative.app.motion.activities.ManageAccountActivity$cY(v2_2, v3_1, v4_1, v5, this, v7_0, 0), 3, 0);
                            return;
                        } else {
                            return;
                        }
                    }
                }
                this.db = QdR.K.x(androidx.lifecycle.Sq.hUw(this.getLifecycle()), 0, 0, new com.alightcreative.app.motion.activities.ManageAccountActivity$c(this, v4_1, v5, 0), 3, 0);
                return;
            }
        }
        return;
    }

    public static synthetic void lU(com.alightcreative.app.motion.activities.ManageAccountActivity p0, com.google.firebase.auth.FirebaseAuth p1)
    {
        p0.EMD(p1);
        return;
    }

    private static final kotlin.Unit lka(com.alightcreative.widget.c p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "dialog");
        p1.FT();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit m(com.google.firebase.auth.FirebaseUser p0, String p1, com.alightcreative.app.motion.activities.ManageAccountActivity p2, com.alightcreative.widget.c p3)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.WJ(p0, p1, p2, p3);
    }

    public static synthetic void m0(com.alightcreative.app.motion.activities.ManageAccountActivity p0, com.google.android.gms.tasks.Task p1)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.C4W(p0, p1);
        return;
    }

    public static synthetic boolean nG(com.alightcreative.app.motion.activities.ManageAccountActivity p0, android.widget.TextView p1, int p2, android.view.KeyEvent p3)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.rPC(p0, p1, p2, p3);
    }

    public static synthetic kotlin.Unit o(com.alightcreative.widget.c p0)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.hk(p0);
    }

    private static final void p(com.alightcreative.app.motion.activities.ManageAccountActivity p1, android.view.View p2)
    {
        new com.alightcreative.widget.c$xfY(p1).H(2132017492).cD(2132017494).q(2132020095, new com.alightcreative.app.motion.activities.Z93(p1)).R6(2132017472, new com.alightcreative.app.motion.activities.TQH()).hUw().z();
        return;
    }

    private static final void pL(com.alightcreative.app.motion.activities.ManageAccountActivity p1, android.view.View p2)
    {
        if (!p1.AX()) {
            p1.finish();
            return;
        } else {
            new com.alightcreative.widget.c$xfY(p1).H(2132020453).cD(2132020452).ojl(1).q(2132020451, new com.alightcreative.app.motion.activities.h6w(p1)).R6(2132017472, new com.alightcreative.app.motion.activities.rTU()).hUw().z();
            return;
        }
    }

    private static final void q9c(kotlin.jvm.functions.Function1 p0, Object p1)
    {
        p0.invoke(p1);
        return;
    }

    private static final kotlin.Unit qQf(com.alightcreative.widget.c p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "dialog");
        p1.FT();
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit qxC(com.alightcreative.widget.c p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "dialog");
        p1.FT();
        return kotlin.Unit.INSTANCE;
    }

    private static final void r(com.alightcreative.app.motion.activities.ManageAccountActivity p4)
    {
        p4.ak = 0;
        int v0_3 = p4.H;
        nVu.Sq v1 = 0;
        if (v0_3 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_3 = 0;
        }
        v0_3.w.setEnabled(p4.AX());
        androidx.constraintlayout.widget.ConstraintLayout v4_1 = p4.H;
        if (v4_1 != null) {
            v1 = v4_1;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1.T.setVisibility(8);
        return;
    }

    public static synthetic kotlin.Unit r7(com.alightcreative.widget.c p0)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.W(p0);
    }

    private static final boolean rPC(com.alightcreative.app.motion.activities.ManageAccountActivity p1, android.widget.TextView p2, int p3, android.view.KeyEvent p4)
    {
        if (p3 == 6) {
            com.alightcreative.widget.SettingEditText v2_1 = p1.H;
            nVu.Sq v3_1 = 0;
            if (v2_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v2_1 = 0;
            }
            com.alightcreative.widget.SettingEditText v2_2 = v2_1.LV;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_2, "userNameEditText");
            FKt.pD.X(v2_2);
            com.alightcreative.widget.SettingEditText v1_1 = p1.H;
            if (v1_1 != null) {
                v3_1 = v1_1;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v3_1.LV.clearFocus();
        }
        return 1;
    }

    private static final void s(com.alightcreative.app.motion.activities.ManageAccountActivity p1, android.view.View p2, boolean p3)
    {
        com.alightcreative.widget.SettingEditText v2_0 = p1.H;
        if (v2_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v2_0 = 0;
        }
        int v1_1;
        com.alightcreative.widget.SettingEditText v2_2 = v2_0.LV;
        if (p3 == 0) {
            v1_1 = 0;
        } else {
            v1_1 = tIS.xfY.j(p1, 2131231782);
        }
        v2_2.setCompoundDrawablesWithIntrinsicBounds(0, 0, v1_1, 0);
        return;
    }

    private final void sw()
    {
        android.widget.Toast.makeText(this, 2132020494, 0).show();
        dD0.VI.iVU(this);
        return;
    }

    public static synthetic kotlin.Unit tEh(com.alightcreative.widget.c p0)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.CYw(p0);
    }

    private final void u()
    {
        com.alightcreative.app.motion.activities.dRz v1_7;
        androidx.recyclerview.widget.RecyclerView v0_5 = com.google.firebase.auth.FirebaseAuth.getInstance().uKP();
        if (v0_5 == null) {
            v1_7 = "";
        } else {
            v1_7 = v0_5.getDisplayName();
            if (v1_7 == null) {
            }
        }
        java.util.List v2_3 = this.H;
        androidx.recyclerview.widget.RecyclerView v4 = 0;
        if (v2_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v2_3 = 0;
        }
        int v5_0;
        java.util.List v2_4 = v2_3.ak;
        if (v0_5 == null) {
            v5_0 = 0;
        } else {
            v5_0 = v0_5.getPhotoUrl();
        }
        v2_4.T(v5_0, 0);
        java.util.List v2_5 = this.H;
        if (v2_5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v2_5 = 0;
        }
        v2_5.LV.setText(v1_7);
        com.alightcreative.app.motion.activities.dRz v1_1 = this.H;
        if (v1_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_1 = 0;
        }
        java.util.List v2_7;
        com.alightcreative.app.motion.activities.dRz v1_2 = v1_1.jE;
        if (v0_5 == null) {
            v2_7 = this.getString(2132019822);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_7, "getString(...)");
        } else {
            v2_7 = v0_5.getEmail();
            if (v2_7 == null) {
            }
        }
        v1_2.setText(v2_7);
        com.alightcreative.app.motion.activities.dRz v1_3 = this.H;
        if (v1_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_3 = 0;
        }
        if ((v0_5 == null) || (v0_5.r8t() != 1)) {
            com.google.firebase.auth.x v6_2 = 0;
        } else {
            v6_2 = 8;
        }
        v1_3.F0.setVisibility(v6_2);
        this.Q.clear();
        com.alightcreative.app.motion.activities.dRz v1_8 = new java.util.ArrayList();
        if (v0_5 == null) {
            androidx.recyclerview.widget.RecyclerView v0_6 = this.H;
            if (v0_6 != null) {
                v4 = v0_6;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v4.IB.setVisibility(8);
            return;
        } else {
            androidx.recyclerview.widget.RecyclerView v0_9 = v0_5.pL().iterator();
            com.google.firebase.auth.x v6_0 = 0;
            while (v0_9.hasNext()) {
                com.google.firebase.auth.x v7_1 = ((com.google.firebase.auth.x) v0_9.next());
                this.Q.add(v7_1.jV());
                boolean v8_1 = v7_1.jV();
                String v9_1 = v8_1.hashCode();
                if (v9_1 == -1536293812) {
                    if (!v8_1.equals("google.com")) {
                    }
                } else {
                    if (v9_1 == -364826023) {
                        if (!v8_1.equals("facebook.com")) {
                        }
                    } else {
                        if ((v9_1 == 1216985755) && (v8_1.equals("password"))) {
                            v6_0 = v7_1;
                        }
                    }
                }
                v1_8.add(v7_1);
            }
            if (v1_8.isEmpty()) {
                if (v6_0 == null) {
                    androidx.recyclerview.widget.RecyclerView v0_11 = this.H;
                    if (v0_11 != null) {
                        v4 = v0_11;
                    } else {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    }
                    v4.IB.setVisibility(8);
                    return;
                } else {
                    androidx.recyclerview.widget.RecyclerView v0_13 = this.H;
                    if (v0_13 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v0_13 = 0;
                    }
                    v0_13.IB.setVisibility(0);
                    androidx.recyclerview.widget.RecyclerView v0_15 = this.H;
                    if (v0_15 != null) {
                        v4 = v0_15;
                    } else {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    }
                    v4.l.setAdapter(new com.alightcreative.app.motion.activities.dRz(kotlin.collections.CollectionsKt.listOf(v6_0), new com.alightcreative.app.motion.activities.ManageAccountActivity$V(this)));
                    return;
                }
            } else {
                androidx.recyclerview.widget.RecyclerView v0_1 = this.H;
                if (v0_1 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v0_1 = 0;
                }
                v0_1.IB.setVisibility(0);
                androidx.recyclerview.widget.RecyclerView v0_3 = this.H;
                if (v0_3 != null) {
                    v4 = v0_3;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                v4.l.setAdapter(new com.alightcreative.app.motion.activities.dRz(v1_8, new com.alightcreative.app.motion.activities.ManageAccountActivity$XSt(this)));
                return;
            }
        }
    }

    public static synthetic kotlin.Unit uM(com.alightcreative.app.motion.activities.ManageAccountActivity p0, String p1, Void p2)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.jfW(p0, p1, p2);
    }

    public static synthetic void uq6(kotlin.jvm.functions.Function1 p0, Object p1)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.zO(p0, p1);
        return;
    }

    public static final synthetic void v(com.alightcreative.app.motion.activities.ManageAccountActivity p0)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.r(p0);
        return;
    }

    private static final void v9(com.alightcreative.app.motion.activities.ManageAccountActivity p2, androidx.activity.result.ActivityResult p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "result");
        if (p3.j() == -1) {
            android.net.Uri v3_2 = p3.hUw();
            if (v3_2 != null) {
                android.net.Uri v3_1 = v3_2.getData();
                if (v3_1 != null) {
                    p2.C8(v3_1);
                }
            }
        }
        return;
    }

    private static final void vy(com.alightcreative.app.motion.activities.ManageAccountActivity p1, android.view.View p2)
    {
        TV.n v2_0 = p1.H;
        if (v2_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v2_0 = 0;
        }
        TV.n v2_3 = v2_0.T;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_3, "progressBarHolder");
        if (v2_3.getVisibility() != 0) {
            dD0.VI.X9x(p1.TT1());
            p1.finish();
            return;
        } else {
            return;
        }
    }

    private final void wH()
    {
        android.widget.Toast.makeText(this, 2132020494, 0).show();
        android.os.Bundle v0_5 = new kotlin.Pair[0];
        android.os.Bundle v0_7 = ((kotlin.Pair[]) java.util.Arrays.copyOf(v0_5, 0));
        android.content.Intent v1_1 = new android.content.Intent(this, com.alightcreative.app.motion.activities.AgreeDeleteAccountActivity);
        v1_1.putExtras(PYr.h.hUw(((kotlin.Pair[]) java.util.Arrays.copyOf(v0_7, v0_7.length))));
        this.startActivity(v1_1);
        return;
    }

    private static final kotlin.Unit wll(com.alightcreative.app.motion.activities.ManageAccountActivity p1, com.alightcreative.widget.c p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        p1.finish();
        p2.FT();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit wx(com.alightcreative.widget.c p0)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.Ear(p0);
    }

    private static final kotlin.Unit y3P(com.alightcreative.app.motion.activities.ManageAccountActivity p2, com.alightcreative.widget.c p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "dialog");
        String v1 = "google.com";
        if (!p2.Q.contains("google.com")) {
            v1 = "facebook.com";
            if (!p2.Q.contains("facebook.com")) {
                v1 = "password";
            }
        }
        p2.fdD(v1, com.alightcreative.app.motion.activities.g.x);
        p3.FT();
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit ygC(com.alightcreative.widget.c p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        p1.FT();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void yy(com.alightcreative.app.motion.activities.ManageAccountActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.ManageAccountActivity.vy(p0, p1);
        return;
    }

    public static synthetic kotlin.Unit z2f(com.alightcreative.widget.c p0)
    {
        return com.alightcreative.app.motion.activities.ManageAccountActivity.qQf(p0);
    }

    private static final kotlin.Unit z8(com.alightcreative.app.motion.activities.ManageAccountActivity p1, android.widget.EditText p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        p2.getText().clear();
        kotlin.Unit v1_3 = p1.H;
        if (v1_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_3 = 0;
        }
        kotlin.Unit v1_1 = v1_3.LV;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_1, "userNameEditText");
        FKt.pD.l(v1_1);
        return kotlin.Unit.INSTANCE;
    }

    private static final void zO(kotlin.jvm.functions.Function1 p0, Object p1)
    {
        p0.invoke(p1);
        return;
    }

    public final TV.n TT1()
    {
        int v0_0 = this.X;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final Vbv.c b1()
    {
        int v0_0 = this.T;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("iapManager");
            return 0;
        } else {
            return v0_0;
        }
    }

    protected void onActivityResult(int p7, int p8, android.content.Intent p9)
    {
        super.onActivityResult(p7, p8, p9);
        if (!dD0.VI.K(p7, p8, p9, this.TT1())) {
            com.alightcreative.app.motion.activities.Y1v v8_1;
            int v0_3 = this.w;
            if (v0_3 == 0) {
                v8_1 = 0;
            } else {
                v8_1 = v0_3.onActivityResult(p7, p8, p9);
            }
            if (v8_1 == null) {
                String v1 = "";
                if (p7 == 13001) {
                    com.alightcreative.widget.c v7_1 = com.google.android.gms.auth.api.signin.GoogleSignIn.getSignedInAccountFromIntent(p9);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_1, "getSignedInAccountFromIntent(...)");
                    try {
                        com.alightcreative.widget.c v7_2 = v7_1.getResult(com.google.android.gms.common.api.ApiException);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v7_2);
                        com.alightcreative.widget.c v7_5 = com.google.firebase.auth.qfV.hUw(((com.google.android.gms.auth.api.signin.GoogleSignInAccount) v7_2).getIdToken(), 0);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_5, "getCredential(...)");
                        dD0.VI.J(this, v7_5, new com.alightcreative.app.motion.activities.ManageAccountActivity$A(this));
                        return;
                    } catch (com.alightcreative.widget.c v7_6) {
                        com.alightcreative.app.motion.activities.Y1v v8_6 = new com.alightcreative.widget.c$xfY(this);
                        com.alightcreative.widget.c v7_7 = v7_6.getLocalizedMessage();
                        if (v7_7 != null) {
                            v1 = v7_7;
                        }
                        v8_6.x(v1).q(2132017454, new com.alightcreative.app.motion.activities.B3()).hUw().z();
                    }
                } else {
                    if (p7 == 13002) {
                        com.alightcreative.widget.c v7_11 = com.google.android.gms.auth.api.signin.GoogleSignIn.getSignedInAccountFromIntent(p9);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_11, "getSignedInAccountFromIntent(...)");
                        try {
                            com.alightcreative.widget.c v7_12 = v7_11.getResult(com.google.android.gms.common.api.ApiException);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(v7_12);
                            com.alightcreative.widget.c v7_15 = com.google.firebase.auth.qfV.hUw(((com.google.android.gms.auth.api.signin.GoogleSignInAccount) v7_12).getIdToken(), 0);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_15, "getCredential(...)");
                            dD0.VI.J(this, v7_15, new com.alightcreative.app.motion.activities.ManageAccountActivity$CU(this));
                            return;
                        } catch (com.alightcreative.widget.c v7_16) {
                            com.alightcreative.app.motion.activities.Y1v v8_13 = new com.alightcreative.widget.c$xfY(this);
                            com.alightcreative.widget.c v7_17 = v7_16.getLocalizedMessage();
                            if (v7_17 != null) {
                                v1 = v7_17;
                            }
                            v8_13.x(v1).q(2132017454, new com.alightcreative.app.motion.activities.Y1v()).hUw().z();
                        }
                    }
                }
            }
        }
        return;
    }

    public void onBackPressed()
    {
        boolean v0_0 = this.H;
        if (!v0_0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        boolean v0_4 = v0_0.T;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_4, "progressBarHolder");
        if (v0_4.getVisibility() != 0) {
            if (!this.ak) {
                super.onBackPressed();
                return;
            } else {
                return;
            }
        } else {
            return;
        }
    }

    protected void onCreate(android.os.Bundle p6)
    {
        super.onCreate(p6);
        android.view.View v6_4 = nVu.Sq.cD(this.getLayoutInflater());
        this.H = v6_4;
        nVu.Sq v1 = 0;
        if (v6_4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_4 = 0;
        }
        this.setContentView(v6_4.j());
        android.view.View v6_16 = this.H;
        if (v6_16 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_16 = 0;
        }
        android.view.View v6_29;
        w9w.Xo.If(v6_16.j(), new com.alightcreative.app.motion.activities.xp());
        android.view.View v6_28 = com.google.firebase.auth.FirebaseAuth.getInstance().uKP();
        if (v6_28 == null) {
            v6_29 = 0;
        } else {
            v6_29 = v6_28.getDisplayName();
        }
        android.view.View v6_32;
        this.l = v6_29;
        android.view.View v6_31 = com.google.firebase.auth.FirebaseAuth.getInstance().uKP();
        if (v6_31 == null) {
            v6_32 = 0;
        } else {
            v6_32 = v6_31.getPhotoUrl();
        }
        android.view.View v6_35;
        this.E = v6_32;
        android.view.View v6_34 = com.google.firebase.auth.FirebaseAuth.getInstance().uKP();
        if (v6_34 == null) {
            v6_35 = 0;
        } else {
            v6_35 = v6_34.getPhotoUrl();
        }
        this.ah = v6_35;
        android.view.View v6_36 = this.H;
        if (v6_36 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_36 = 0;
        }
        com.alightcreative.app.motion.activities.Wc v2_25;
        android.view.View v6_37 = v6_36.LV;
        com.alightcreative.app.motion.activities.Wc v2_24 = com.google.firebase.auth.FirebaseAuth.getInstance().uKP();
        if (v2_24 == null) {
            v2_25 = "";
        } else {
            v2_25 = dD0.VI.XA(v2_24);
            if (v2_25 == null) {
            }
        }
        v6_37.setHint(v2_25);
        this.u();
        android.view.View v6_38 = this.H;
        if (v6_38 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_38 = 0;
        }
        v6_38.l.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 1, 0));
        android.view.View v6_40 = this.H;
        if (v6_40 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_40 = 0;
        }
        v6_40.cD.setOnClickListener(new com.alightcreative.app.motion.activities.Yo(this));
        android.view.View v6_42 = this.H;
        if (v6_42 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_42 = 0;
        }
        v6_42.w.setEnabled(0);
        android.view.View v6_44 = this.H;
        if (v6_44 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_44 = 0;
        }
        v6_44.w.setOnClickListener(new com.alightcreative.app.motion.activities.rq(this));
        android.view.View v6_1 = this.H;
        if (v6_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_1 = 0;
        }
        v6_1.LV.addTextChangedListener(new com.alightcreative.app.motion.activities.ManageAccountActivity$h(this));
        android.view.View v6_3 = this.H;
        if (v6_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_3 = 0;
        }
        v6_3.LV.setOnEditorActionListener(new com.alightcreative.app.motion.activities.nG(this));
        android.view.View v6_6 = this.H;
        if (v6_6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_6 = 0;
        }
        android.view.View v6_7 = v6_6.LV;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v6_7, "userNameEditText");
        Kq.WHS.j(v6_7, new com.alightcreative.app.motion.activities.Wyt(this), new com.alightcreative.app.motion.activities.UD(this));
        android.view.View v6_8 = this.H;
        if (v6_8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_8 = 0;
        }
        v6_8.LV.setOnFocusChangeListener(new com.alightcreative.app.motion.activities.ZM(this));
        android.view.View v6_11 = this.H;
        if (v6_11 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_11 = 0;
        }
        v6_11.H.setOnClickListener(new com.alightcreative.app.motion.activities.yU(this));
        android.view.View v6_15 = this.registerForActivityResult(new M.c(), new com.alightcreative.app.motion.activities.IMq(this));
        com.alightcreative.app.motion.activities.Wc v2_13 = this.H;
        if (v2_13 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v2_13 = 0;
        }
        v2_13.X.setOnClickListener(new com.alightcreative.app.motion.activities.a6(this, v6_15));
        android.view.View v6_17 = this.H;
        if (v6_17 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_17 = 0;
        }
        v6_17.pM1.setOnClickListener(new com.alightcreative.app.motion.activities.kUv(this));
        android.view.View v6_19 = this.H;
        if (v6_19 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_19 = 0;
        }
        v6_19.R6.setOnClickListener(new com.alightcreative.app.motion.activities.GKi(this));
        android.view.View v6_21 = this.H;
        if (v6_21 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_21 = 0;
        }
        v6_21.db.setOnClickListener(new com.alightcreative.app.motion.activities.Wc(this));
        android.view.View v6_23 = this.H;
        if (v6_23 != null) {
            v1 = v6_23;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1.ojl.setOnTouchListener(new com.alightcreative.app.motion.activities.GJ());
        return;
    }

    protected void onStart()
    {
        super.onStart();
        com.google.firebase.auth.FirebaseAuth.getInstance().x(new com.alightcreative.app.motion.activities.ED(this));
        return;
    }

    protected void onStop()
    {
        com.google.firebase.auth.FirebaseAuth.getInstance().IB(new com.alightcreative.app.motion.activities.ED(this));
        super.onStop();
        return;
    }
}
