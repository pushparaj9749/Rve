package com.alightcreative.app.motion.activities.creatorprogram.redeem;
public final class RedeemTokensActivity extends com.alightcreative.app.motion.activities.creatorprogram.redeem.xfY {
    public static final int T;
    public static final com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity$xfY X;
    public com.alightcreative.app.motion.activities.creatorprogram.redeem.qfV$A H;

    static RedeemTokensActivity()
    {
        com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity.X = new com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity$xfY(0);
        com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity.T = 8;
        return;
    }

    public RedeemTokensActivity()
    {
        return;
    }

    private final JmI.F$Enc S()
    {
        JmI.F$Enc v0_0 = this.getIntent();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_0, "getIntent(...)");
        return ((JmI.F$Enc) FKt.LxM.hUw(v0_0, "reward-type-extra", JmI.F$Enc));
    }

    private final void ST5(int p2, int p3, kotlin.jvm.functions.Function0 p4)
    {
        new com.alightcreative.app.motion.activities.pQK(this).uKP(p2).x(p3).H(2132017454, new pLm.xfY()).X(new pLm.A(p4)).T();
        return;
    }

    public static final synthetic void Z(com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity p0, int p1, int p2, kotlin.jvm.functions.Function0 p3)
    {
        p0.ST5(p1, p2, p3);
        return;
    }

    public static synthetic void Zk(kotlin.jvm.functions.Function0 p0, android.content.DialogInterface p1)
    {
        com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity.g2(p0, p1);
        return;
    }

    public static synthetic kotlin.Unit b9Y(android.content.DialogInterface p0)
    {
        return com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity.hsj(p0);
    }

    private static final void g2(kotlin.jvm.functions.Function0 p0, android.content.DialogInterface p1)
    {
        p0.invoke();
        return;
    }

    private static final kotlin.Unit hsj(android.content.DialogInterface p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        p1.dismiss();
        return kotlin.Unit.INSTANCE;
    }

    public static final synthetic JmI.F$Enc tEh(com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity p0)
    {
        return p0.S();
    }

    public final com.alightcreative.app.motion.activities.creatorprogram.redeem.qfV$A QR()
    {
        int v0_0 = this.H;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
            return 0;
        } else {
            return v0_0;
        }
    }

    protected void onCreate(android.os.Bundle p3)
    {
        super.onCreate(p3);
        m.xfY.j(this, 0, R.h.j(1232312099, 1, new com.alightcreative.app.motion.activities.creatorprogram.redeem.RedeemTokensActivity$A(this)), 1, 0);
        return;
    }
}
