package com.alightcreative.app.motion.tutorial;
public final class TutorialActivity extends com.alightcreative.app.motion.tutorial.xfY implements dD0.XSt {
    private static final String AM;
    private static final String F;
    private static final String GO;
    private static final String M;
    public static final int cv;
    private static final String d;
    private static final String e;
    public static final com.alightcreative.app.motion.tutorial.TutorialActivity$xfY z;
    public dD0.h E;
    private nVu.s H;
    private boolean K;
    private final java.util.ArrayList Q;
    private boolean R;
    public Vbv.c T;
    public TV.n X;
    private final java.util.ArrayList ah;
    private final java.util.ArrayList ak;
    public EY.XSt db;
    private boolean f;
    public nwt.A l;
    public ns.h w;

    static TutorialActivity()
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.z = new com.alightcreative.app.motion.tutorial.TutorialActivity$xfY(0);
        com.alightcreative.app.motion.tutorial.TutorialActivity.cv = 8;
        com.alightcreative.app.motion.tutorial.TutorialActivity.F = LJ8.lgIq.hqZxzeY.BxsjlyjggVjEjh;
        com.alightcreative.app.motion.tutorial.TutorialActivity.d = "https://alightcreative.com/appdata/am/tutorial-data/android.json";
        com.alightcreative.app.motion.tutorial.TutorialActivity.GO = "https://www.youtube.com/channel/UCjObfxm37TU7zwqmuNXuamg";
        com.alightcreative.app.motion.tutorial.TutorialActivity.AM = "https://alightcreative.com/amhelpcenter";
        com.alightcreative.app.motion.tutorial.TutorialActivity.M = "https://alightcreative.com/amuserguide";
        com.alightcreative.app.motion.tutorial.TutorialActivity.e = "https://alightcreative.com/amsampleprojects";
        return;
    }

    public TutorialActivity()
    {
        this.ah = new java.util.ArrayList();
        this.Q = new java.util.ArrayList();
        this.ak = new java.util.ArrayList();
        this.K = 1;
        return;
    }

    private static final void En(com.alightcreative.app.motion.tutorial.TutorialActivity p6, String p7)
    {
        int v0_1 = new org.json.JSONObject(p7);
        p6.ah.clear();
        zO.CU v7_12 = v0_1.getJSONArray(MYJ.dj.ksSQij.pnwFUYVtfBo);
        int v1_2 = v7_12.length();
        java.util.ArrayList v3_0 = 0;
        while (v3_0 < v1_2) {
            com.alightcreative.app.motion.tutorial.entities.SampleProjectInfo v4_4 = v7_12.getJSONObject(v3_0);
            kotlin.jvm.internal.Intrinsics.checkNotNull(v4_4);
            p6.ah.add(new com.alightcreative.app.motion.tutorial.entities.TutorialInfo(v4_4));
            v3_0++;
        }
        p6.Q.clear();
        zO.CU v7_3 = v0_1.getJSONArray("tips");
        int v1_0 = v7_3.length();
        java.util.ArrayList v3_1 = 0;
        while (v3_1 < v1_0) {
            com.alightcreative.app.motion.tutorial.entities.SampleProjectInfo v4_2 = v7_3.getJSONObject(v3_1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(v4_2);
            p6.Q.add(new com.alightcreative.app.motion.tutorial.entities.TipInfo(v4_2));
            v3_1++;
        }
        p6.ak.clear();
        zO.CU v7_7 = v0_1.getJSONArray("sampleProjects");
        int v0_2 = v7_7.length();
        int v1_1 = 0;
        while (v1_1 < v0_2) {
            java.util.ArrayList v3_2 = v7_7.getJSONObject(v1_1);
            kotlin.jvm.internal.Intrinsics.checkNotNull(v3_2);
            p6.ak.add(new com.alightcreative.app.motion.tutorial.entities.SampleProjectInfo(v3_2));
            v1_1++;
        }
        p6.f = 0;
        p6.R = 1;
        p6.runOnUiThread(new zO.CU(p6));
        return;
    }

    private static final void Frn(com.alightcreative.app.motion.tutorial.TutorialActivity p1, android.view.View p2)
    {
        p1.nG().hUw(TV.xfY$qWo.hUw);
        FKt.h.q(p1, com.alightcreative.app.motion.tutorial.TutorialActivity.GO);
        return;
    }

    public static synthetic void If(com.alightcreative.app.motion.tutorial.TutorialActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.Z0(p0, p1);
        return;
    }

    private final com.android.volley.V Jju()
    {
        return KU.A.hUw();
    }

    public static synthetic kotlin.Unit Jm(com.alightcreative.app.motion.tutorial.TutorialActivity p0)
    {
        return com.alightcreative.app.motion.tutorial.TutorialActivity.r7(p0);
    }

    private static final void KE(com.alightcreative.app.motion.tutorial.TutorialActivity p0, android.view.View p1)
    {
        p0.finish();
        return;
    }

    public static synthetic void N(boolean p0, com.alightcreative.app.motion.tutorial.TutorialActivity p1)
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.YU(p0, p1);
        return;
    }

    private static final void Odv(com.alightcreative.app.motion.tutorial.TutorialActivity p1, android.view.View p2)
    {
        p1.nG().hUw(TV.xfY$Bn.hUw);
        FKt.h.q(p1, com.alightcreative.app.motion.tutorial.TutorialActivity.AM);
        return;
    }

    private static final void PC0(com.alightcreative.app.motion.tutorial.TutorialActivity p1, android.view.View p2)
    {
        p1.nG().hUw(TV.xfY$pH.hUw);
        FKt.h.q(p1, com.alightcreative.app.motion.tutorial.TutorialActivity.M);
        return;
    }

    private static final void Pg(com.alightcreative.app.motion.tutorial.TutorialActivity p2, com.android.volley.VolleyError p3)
    {
        String v3_2 = mF.xfY.T.j();
        int v0_2 = new StringBuilder();
        v0_2.append("Element Download Failed (");
        v0_2.append(v3_2);
        v0_2.append(")");
        android.widget.Toast.makeText(p2, v0_2.toString(), 1).show();
        return;
    }

    public static synthetic void QR(com.alightcreative.app.motion.tutorial.TutorialActivity p0)
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.RF(p0);
        return;
    }

    private static final void RF(com.alightcreative.app.motion.tutorial.TutorialActivity p4)
    {
        android.widget.LinearLayout v0_0 = p4.H;
        int v1_0 = 0;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.Q.setVisibility(0);
        android.widget.LinearLayout v0_1 = p4.H;
        if (v0_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_1 = 0;
        }
        v0_1.FT.setVisibility(0);
        android.widget.LinearLayout v0_3 = p4.H;
        if (v0_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_3 = 0;
        }
        v0_3.l.setVisibility(0);
        android.widget.LinearLayout v0_5 = p4.H;
        if (v0_5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_5 = 0;
        }
        v0_5.cD.setVisibility(0);
        android.widget.LinearLayout v0_7 = p4.H;
        if (v0_7 != null) {
            v1_0 = v0_7;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1_0.cLW.setVisibility(8);
        p4.o();
        return;
    }

    public static synthetic void S(com.alightcreative.app.motion.tutorial.TutorialActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.wx(p0, p1);
        return;
    }

    public static synthetic void ST5(com.alightcreative.app.motion.tutorial.TutorialActivity p0, com.android.volley.VolleyError p1)
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.i2(p0, p1);
        return;
    }

    private final void W3V()
    {
        if (!this.f) {
            com.android.volley.V v0_5;
            this.f = 1;
            if (!com.alightcreative.app.motion.persist.xfY.INSTANCE.getStagingFeed()) {
                v0_5 = com.alightcreative.app.motion.tutorial.TutorialActivity.d;
            } else {
                v0_5 = com.alightcreative.app.motion.tutorial.TutorialActivity.F;
            }
            if (!this.K) {
                this.Jju().x().hUw(v0_5, 0);
            }
            this.K = 0;
            this.Jju().hUw(new com.alightcreative.app.motion.tutorial.TutorialActivity$h(v0_5, new zO.AWD(this), new zO.et(this)));
            return;
        } else {
            return;
        }
    }

    private static final void Y(com.alightcreative.app.motion.tutorial.TutorialActivity p1, android.view.View p2)
    {
        p1.nG().hUw(TV.xfY$pH.hUw);
        FKt.h.q(p1, com.alightcreative.app.motion.tutorial.TutorialActivity.M);
        return;
    }

    private static final void YU(boolean p3, com.alightcreative.app.motion.tutorial.TutorialActivity p4)
    {
        if (p3 == null) {
            android.widget.LinearLayout v3_1 = p4.H;
            nVu.s v0 = 0;
            if (v3_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v3_1 = 0;
            }
            v3_1.Q.setVisibility(8);
            android.widget.LinearLayout v3_2 = p4.H;
            if (v3_2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v3_2 = 0;
            }
            v3_2.FT.setVisibility(8);
            android.widget.LinearLayout v3_4 = p4.H;
            if (v3_4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v3_4 = 0;
            }
            v3_4.l.setVisibility(8);
            android.widget.LinearLayout v3_6 = p4.H;
            if (v3_6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v3_6 = 0;
            }
            v3_6.cD.setVisibility(8);
            if (!fx.c.E(p4)) {
                android.widget.LinearLayout v3_9 = p4.H;
                if (v3_9 != null) {
                    v0 = v3_9;
                } else {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                }
                v0.cLW.setVisibility(0);
            }
        }
        return;
    }

    public static synthetic void Z(com.alightcreative.app.motion.tutorial.TutorialActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.Y(p0, p1);
        return;
    }

    private static final void Z0(com.alightcreative.app.motion.tutorial.TutorialActivity p1, android.view.View p2)
    {
        p1.nG().hUw(TV.xfY$TX.hUw);
        androidx.fragment.app.eWj v1_4 = p1.getSupportFragmentManager().FT();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_4, "beginTransaction(...)");
        v1_4.j(16908290, new iq.Uk()).X("GettingStarted").uKP();
        return;
    }

    public static synthetic void Zk(com.alightcreative.app.motion.tutorial.TutorialActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.KE(p0, p1);
        return;
    }

    public static synthetic void b9Y(com.alightcreative.app.motion.tutorial.TutorialActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.yy(p0, p1);
        return;
    }

    private final void cKj(String p14)
    {
        com.android.volley.V v1_0 = android.net.Uri.parse(p14);
        com.alightcreative.app.motion.tutorial.TutorialActivity v0_3 = v1_0.getHost();
        if ((v0_3 == null) || (kotlin.text.StringsKt.endsWith$default(v0_3, ".link", 0, 2, 0) != 1)) {
            com.alightcreative.app.motion.tutorial.TutorialActivity v0_1 = v1_0.getPath();
            if ((v0_1 == null) || (kotlin.text.StringsKt.startsWith$default(v0_1, "/am/share/u/", 0, 2, 0) != 1)) {
                android.widget.Toast.makeText(this, 2132020176, 0).show();
                this.Jju().hUw(new Ro.Enc(0, p14, new zO.V(this), new zO.cY(this)));
                return;
            }
        }
        zO.cY v2_3;
        kotlin.jvm.internal.Intrinsics.checkNotNull(v1_0);
        boolean v14_2 = this.dav().invoke();
        if ((!v14_2) || (v14_2.Z5u() != 1)) {
            v2_3 = 0;
        } else {
            v2_3 = 1;
        }
        zO.cY v3_3;
        boolean v14_5 = this.dav().invoke();
        if ((!v14_5) || (v14_5.f() != 1)) {
            v3_3 = 0;
        } else {
            v3_3 = 1;
        }
        pg.Tn.t(this, v1_0, v2_3, v3_3, this.nG(), this.Ie(), this.B(), 0, this.m0(), this.dav(), new zO.XSt(this), 64, 0);
        return;
    }

    public static synthetic void cak(com.alightcreative.app.motion.tutorial.TutorialActivity p0, com.android.volley.VolleyError p1)
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.Pg(p0, p1);
        return;
    }

    public static synthetic void e4D(com.alightcreative.app.motion.tutorial.TutorialActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.Odv(p0, p1);
        return;
    }

    public static synthetic kotlin.Unit g(com.alightcreative.app.motion.tutorial.TutorialActivity p0, String p1, AVl.qfV p2)
    {
        return com.alightcreative.app.motion.tutorial.TutorialActivity.uq6(p0, p1, p2);
    }

    public static synthetic void g2(com.alightcreative.app.motion.tutorial.TutorialActivity p0, String p1)
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.m(p0, p1);
        return;
    }

    public static synthetic void hsj(com.alightcreative.app.motion.tutorial.TutorialActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.Frn(p0, p1);
        return;
    }

    private static final void i2(com.alightcreative.app.motion.tutorial.TutorialActivity p1, com.android.volley.VolleyError p2)
    {
        p1.f = 0;
        p1.runOnUiThread(new zO.A(p1.R, p1));
        return;
    }

    private final void jV(String p3)
    {
        this.nG().hUw(new TV.xfY$hu(p3));
        FKt.h.q(this, p3);
        return;
    }

    public static synthetic void lU(com.alightcreative.app.motion.tutorial.TutorialActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.PC0(p0, p1);
        return;
    }

    private static final void m(com.alightcreative.app.motion.tutorial.TutorialActivity p35, String p36)
    {
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNull(p36);
            String v3_0 = com.alightcreative.app.motion.scene.serializer.SceneSerializerKt.unserializeScene$default(p36, 0, 0, 0, 14, 0);
        } catch (com.alightcreative.app.motion.scene.serializer.MalformedSceneException) {
            v3_0 = 0;
        }
        if (v3_0 == null) {
            String v1_2 = mF.xfY.X.j();
            int v2_2 = new StringBuilder();
            v2_2.append("Element Save Failed (");
            v2_2.append(v1_2);
            v2_2.append(")");
            android.widget.Toast.makeText(p35, v2_2.toString(), 1).show();
        } else {
            int v4_0 = java.util.UUID.randomUUID();
            kotlin.jvm.internal.Intrinsics.checkNotNull(v4_0);
            kotlin.io.FilesKt.writeText$default(FKt.Tn.ah(p35, v4_0), com.alightcreative.app.motion.scene.serializer.SceneSerializerKt.serializeScene$default(com.alightcreative.app.motion.scene.Scene.copy$default(v3_0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.SceneType.ELEMENT, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1047551, 0), 0, 0, 0, 0, 0, 62, 0), 0, 2, 0);
            android.widget.Toast.makeText(p35, 2132020172, 1).show();
            p35.finish();
        }
        return;
    }

    private final void o()
    {
        com.alightcreative.widget.RecyclerViewEx v0_7 = new zO.soy(this.ah, new com.alightcreative.app.motion.tutorial.TutorialActivity$CU(this));
        zO.h v1_1 = this.H;
        nVu.s v2_1 = 0;
        if (v1_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_1 = 0;
        }
        v1_1.ak.setAdapter(v0_7);
        com.alightcreative.widget.RecyclerViewEx v0_2 = new iq.j4(this.Q);
        zO.h v1_4 = this.H;
        if (v1_4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_4 = 0;
        }
        v1_4.ah.setAdapter(v0_2);
        if (this.ak.size() >= 4) {
            com.alightcreative.widget.RecyclerViewEx v0_5 = this.H;
            if (v0_5 != null) {
                v2_1 = v0_5;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            com.alightcreative.widget.RecyclerViewEx v0_6 = v2_1.E;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_6, "sampleProjectRecyclerView");
            FKt.pD.uKP(v0_6, new zO.h(this));
        }
        return;
    }

    private static final kotlin.Unit r7(com.alightcreative.app.motion.tutorial.TutorialActivity p8)
    {
        int v0_0 = p8.H;
        nVu.s v1 = 0;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        int v0_3 = (((v0_0.l.getWidth() - (p8.getResources().getDimensionPixelOffset(2131166376) * 2)) - p8.getResources().getDimensionPixelOffset(2131166377)) / 2);
        iq.H v3_5 = p8.H;
        if (v3_5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v3_5 = 0;
        }
        iq.H v3_12 = new iq.H(new java.util.ArrayList(p8.ak.subList(0, 4)), Math.min(v0_3, (((v3_5.E.getHeight() - (p8.getResources().getDimensionPixelOffset(2131166378) * 2)) - p8.getResources().getDimensionPixelOffset(2131166377)) / 2)), new com.alightcreative.app.motion.tutorial.TutorialActivity$A(p8));
        kotlin.Unit v8_1 = p8.H;
        if (v8_1 != null) {
            v1 = v8_1;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v1.E.setAdapter(v3_12);
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void tEh(com.alightcreative.app.motion.tutorial.TutorialActivity p0, String p1)
    {
        com.alightcreative.app.motion.tutorial.TutorialActivity.En(p0, p1);
        return;
    }

    public static final synthetic void uM(com.alightcreative.app.motion.tutorial.TutorialActivity p0, String p1)
    {
        p0.cKj(p1);
        return;
    }

    private static final kotlin.Unit uq6(com.alightcreative.app.motion.tutorial.TutorialActivity p1, String p2, AVl.qfV p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<unused var>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<unused var>");
        p1.finish();
        return kotlin.Unit.INSTANCE;
    }

    private static final void wx(com.alightcreative.app.motion.tutorial.TutorialActivity p1, android.view.View p2)
    {
        p1.nG().hUw(TV.xfY$IF.hUw);
        FKt.h.q(p1, com.alightcreative.app.motion.tutorial.TutorialActivity.e);
        return;
    }

    private static final void yy(com.alightcreative.app.motion.tutorial.TutorialActivity p1, android.view.View p2)
    {
        p1.nG().hUw(TV.xfY$dQl.hUw);
        androidx.fragment.app.eWj v1_4 = p1.getSupportFragmentManager().FT();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_4, "beginTransaction(...)");
        v1_4.j(16908290, new iq.tjF()).X("GettingStarted").uKP();
        return;
    }

    public static final synthetic void z2f(com.alightcreative.app.motion.tutorial.TutorialActivity p0, String p1)
    {
        p0.jV(p1);
        return;
    }

    public final EY.XSt B()
    {
        int v0_0 = this.db;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final Vbv.c Ie()
    {
        int v0_0 = this.T;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("iapManager");
            return 0;
        } else {
            return v0_0;
        }
    }

    public void JHw(dD0.h p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.E = p2;
        return;
    }

    public final ns.h dav()
    {
        int v0_0 = this.w;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final nwt.A m0()
    {
        int v0_0 = this.l;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("injet");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final TV.n nG()
    {
        int v0_0 = this.X;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
            return 0;
        } else {
            return v0_0;
        }
    }

    protected void onCreate(android.os.Bundle p8)
    {
        super.onCreate(p8);
        this.JHw(new dD0.h(this, this.nG()));
        android.widget.Button v8_15 = nVu.s.cD(this.getLayoutInflater());
        this.H = v8_15;
        zO.Zv9 v0_0 = 0;
        if (v8_15 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_15 = 0;
        }
        this.setContentView(v8_15.j());
        this.W3V();
        android.widget.Button v8_20 = this.H;
        if (v8_20 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_20 = 0;
        }
        v8_20.ak.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 0, 0));
        android.widget.Button v8_23 = this.getResources().getDimensionPixelOffset(2131166456);
        zO.D v2_18 = this.getResources().getDimensionPixelOffset(2131166455);
        int v4_1 = this.H;
        if (v4_1 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v4_1 = 0;
        }
        v4_1.ak.addItemDecoration(new xT.sXL(0, v8_23, 0, v2_18));
        android.widget.Button v8_25 = this.H;
        if (v8_25 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_25 = 0;
        }
        v8_25.ah.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this, 0, 0));
        android.widget.Button v8_27 = this.H;
        if (v8_27 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_27 = 0;
        }
        v8_27.ah.addItemDecoration(new xT.sXL(0, this.getResources().getDimensionPixelOffset(2131166437), 0, this.getResources().getDimensionPixelOffset(2131166436)));
        android.widget.Button v8_30 = this.H;
        if (v8_30 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_30 = 0;
        }
        v8_30.E.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(this, 2));
        android.widget.Button v8_32 = this.H;
        if (v8_32 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_32 = 0;
        }
        v8_32.E.addItemDecoration(new xT.sXL(0, this.getResources().getDimensionPixelOffset(2131166377), 0, this.getResources().getDimensionPixelOffset(2131166377)));
        android.widget.Button v8_2 = this.H;
        if (v8_2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_2 = 0;
        }
        v8_2.ojl.setOnClickListener(new zO.xfY(this));
        android.widget.Button v8_4 = this.H;
        if (v8_4 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_4 = 0;
        }
        v8_4.pM1.setOnClickListener(new zO.c(this));
        android.widget.Button v8_6 = this.H;
        if (v8_6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_6 = 0;
        }
        v8_6.Z5u.setOnClickListener(new zO.K(this));
        android.widget.Button v8_8 = this.H;
        if (v8_8 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_8 = 0;
        }
        v8_8.w.setOnClickListener(new zO.qfV(this));
        android.widget.Button v8_10 = this.H;
        if (v8_10 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_10 = 0;
        }
        v8_10.Bb.setOnClickListener(new zO.Enc(this));
        android.widget.Button v8_12 = this.H;
        if (v8_12 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_12 = 0;
        }
        v8_12.x.setOnClickListener(new zO.F(this));
        android.widget.Button v8_14 = this.H;
        if (v8_14 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v8_14 = 0;
        }
        v8_14.j.setOnClickListener(new zO.D(this));
        android.widget.Button v8_17 = this.H;
        if (v8_17 != null) {
            v0_0 = v8_17;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v0_0.R6.setOnClickListener(new zO.Zv9(this));
        return;
    }

    protected void onPause()
    {
        FKt.h.x(this);
        super.onPause();
        return;
    }

    public dD0.h x1()
    {
        int v0_0 = this.E;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("signInLauncher");
            return 0;
        } else {
            return v0_0;
        }
    }
}
