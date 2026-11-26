package com.bendingspoons.injet.ui;
public final class InjetPresenterActivity extends androidx.activity.qfV {
    private static com.bendingspoons.injet.ui.InjetPresenterActivity H;
    private static boolean T;
    private static BD.h X;
    public static final com.bendingspoons.injet.ui.InjetPresenterActivity$A cD;
    private static boolean db;
    private static kotlin.jvm.functions.Function0 l;
    private static y4.cY q;
    private static nwt.XSt w;
    public static final int x;
    private QdR.Y j;

    static InjetPresenterActivity()
    {
        com.bendingspoons.injet.ui.InjetPresenterActivity.cD = new com.bendingspoons.injet.ui.InjetPresenterActivity$A(0);
        com.bendingspoons.injet.ui.InjetPresenterActivity.x = 8;
        com.bendingspoons.injet.ui.InjetPresenterActivity.w = nwt.XSt.j;
        com.bendingspoons.injet.ui.InjetPresenterActivity.l = com.bendingspoons.injet.ui.InjetPresenterActivity$xfY.j;
        return;
    }

    public InjetPresenterActivity()
    {
        return;
    }

    public static final synthetic void C(nwt.XSt p0)
    {
        com.bendingspoons.injet.ui.InjetPresenterActivity.w = p0;
        return;
    }

    public static synthetic String J(IllegalStateException p0)
    {
        return com.bendingspoons.injet.ui.InjetPresenterActivity.Z(p0);
    }

    public static synthetic w9w.a9t ToE(android.view.View p0, w9w.a9t p1)
    {
        return com.bendingspoons.injet.ui.InjetPresenterActivity.tEh(p0, p1);
    }

    private static final String Z(IllegalStateException p2)
    {
        String v2_1 = p2.getMessage();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("[Error] ");
        v0_1.append(v2_1);
        return v0_1.toString();
    }

    private static final String Zk()
    {
        return "[Error] WebView is null";
    }

    public static final synthetic void b9Y(y4.cY p0)
    {
        com.bendingspoons.injet.ui.InjetPresenterActivity.q = p0;
        return;
    }

    public static final synthetic void h(boolean p0)
    {
        com.bendingspoons.injet.ui.InjetPresenterActivity.T = p0;
        return;
    }

    public static final synthetic void hP(BD.h p0)
    {
        com.bendingspoons.injet.ui.InjetPresenterActivity.X = p0;
        return;
    }

    public static final synthetic void i6(kotlin.jvm.functions.Function0 p0)
    {
        com.bendingspoons.injet.ui.InjetPresenterActivity.l = p0;
        return;
    }

    public static final synthetic void iVU(com.bendingspoons.injet.ui.InjetPresenterActivity p0, QdR.Y p1)
    {
        p0.j = p1;
        return;
    }

    public static final synthetic com.bendingspoons.injet.ui.InjetPresenterActivity jgN()
    {
        return com.bendingspoons.injet.ui.InjetPresenterActivity.H;
    }

    public static final synthetic void r8t(boolean p0)
    {
        com.bendingspoons.injet.ui.InjetPresenterActivity.db = p0;
        return;
    }

    private static final w9w.a9t tEh(android.view.View p3, w9w.a9t p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "v");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "windowInsets");
        int v4_2 = p4.q(w9w.a9t$Zv9.ojl());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_2, "getInsets(...)");
        p3.setPadding(v4_2.hUw, v4_2.j, v4_2.cD, v4_2.x);
        return w9w.a9t.j;
    }

    public static final synthetic y4.cY za()
    {
        return com.bendingspoons.injet.ui.InjetPresenterActivity.q;
    }

    public static synthetic String zm()
    {
        return com.bendingspoons.injet.ui.InjetPresenterActivity.Zk();
    }

    protected void onCreate(android.os.Bundle p8)
    {
        com.bendingspoons.injet.ui.InjetPresenterActivity.H = this;
        long v0_12 = com.bendingspoons.injet.ui.InjetPresenterActivity$CU.$EnumSwitchMapping$0[com.bendingspoons.injet.ui.InjetPresenterActivity.w.ordinal()];
        if (v0_12 == 1) {
            this.setTheme(nwt.c.j);
        } else {
            if (v0_12 == 2) {
                this.setTheme(nwt.c.hUw);
            } else {
                if (v0_12 != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        super.onCreate(p8);
        if (com.bendingspoons.injet.ui.InjetPresenterActivity.q != null) {
            this.setContentView(nwt.cY.hUw);
            android.view.ViewPropertyAnimator v8_18 = nwt.V.hUw;
            android.webkit.WebView v3_3 = ((android.widget.FrameLayout) this.findViewById(v8_18));
            boolean v4_2 = ((Integer) com.bendingspoons.injet.ui.InjetPresenterActivity.l.invoke());
            if (v4_2) {
                boolean v4_3 = v4_2.intValue();
                v3_3.setBackgroundColor(v4_3);
                if (android.os.Build$VERSION.SDK_INT <= 34) {
                    this.getWindow().getDecorView().setBackgroundColor(v4_3);
                }
            }
            if (!com.bendingspoons.injet.ui.InjetPresenterActivity.T) {
                w9w.Xo.If(v3_3, new Pj9.A());
            } else {
                w9w.j.j(this.getWindow(), 0);
                android.webkit.WebView v3_6 = new w9w.EsR(this.getWindow(), this.getWindow().getDecorView());
                v3_6.hUw((w9w.a9t$Zv9.X() | w9w.a9t$Zv9.H()));
                v3_6.x(2);
                if (android.os.Build$VERSION.SDK_INT >= 28) {
                    androidx.activity.Ki.hUw(this.getWindow().getAttributes(), 1);
                }
            }
            if (!com.bendingspoons.injet.ui.InjetPresenterActivity.db) {
                this.getOnBackPressedDispatcher().ojl(this, new com.bendingspoons.injet.ui.InjetPresenterActivity$XSt(this));
            } else {
                this.getOnBackPressedDispatcher().ojl(this, new com.bendingspoons.injet.ui.InjetPresenterActivity$h());
            }
            int v1_17 = com.bendingspoons.injet.ui.InjetPresenterActivity.q;
            android.webkit.WebView v2_0 = 0;
            if (v1_17 != 0) {
                int v1_18 = v1_17.q();
                if (v1_18 != 0) {
                    android.webkit.WebView v3_0;
                    android.webkit.WebView v3_8 = v1_18.getParent();
                    if (!(v3_8 instanceof android.view.ViewGroup)) {
                        v3_0 = 0;
                    } else {
                        v3_0 = ((android.view.ViewGroup) v3_8);
                    }
                    if (v3_0 != null) {
                        v3_0.removeView(v1_18);
                    }
                }
            }
            android.view.ViewPropertyAnimator v8_2 = ((android.widget.FrameLayout) this.findViewById(v8_18));
            int v1_0 = com.bendingspoons.injet.ui.InjetPresenterActivity.q;
            if (v1_0 != 0) {
                v2_0 = v1_0.q();
            }
            v8_2.addView(v2_0);
            android.view.ViewPropertyAnimator v8_4 = com.bendingspoons.injet.ui.InjetPresenterActivity.q;
            if (v8_4 != null) {
                android.view.ViewPropertyAnimator v8_5 = v8_4.q();
                if (v8_5 != null) {
                    v8_5.setLayoutParams(new android.widget.FrameLayout$LayoutParams(-1, -1));
                }
            }
            android.view.ViewPropertyAnimator v8_6 = com.bendingspoons.injet.ui.InjetPresenterActivity.q;
            if (v8_6 != null) {
                android.view.ViewPropertyAnimator v8_7 = v8_6.q();
                if (v8_7 != null) {
                    v8_7.setAlpha(0);
                    v8_7.animate().alpha(1065353216).setDuration(200).setStartDelay(100).start();
                }
            }
            return;
        } else {
            GQ.xfY.hUw.hUw("InjetPresenterActivity", new Pj9.xfY());
            android.view.ViewPropertyAnimator v8_13 = com.bendingspoons.injet.ui.InjetPresenterActivity.X;
            if (v8_13 != null) {
                GQ.CU.hUw(v8_13, GQ.A$xfY$XSt.R6);
            }
            this.finish();
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        com.bendingspoons.injet.ui.InjetPresenterActivity.q = 0;
        com.bendingspoons.injet.ui.InjetPresenterActivity.H = 0;
        return;
    }

    protected void onStop()
    {
        super.onStop();
        int v0_0 = this.j;
        if (v0_0 != 0) {
            v0_0.ToE(kotlin.Unit.INSTANCE);
        }
        this.j = 0;
        return;
    }
}
