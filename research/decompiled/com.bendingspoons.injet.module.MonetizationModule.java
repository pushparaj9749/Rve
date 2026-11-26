package com.bendingspoons.injet.module;
public abstract class MonetizationModule implements HX.xfY {
    public static final int hUw;

    static MonetizationModule()
    {
        return;
    }

    public MonetizationModule()
    {
        return;
    }

    public abstract Object H(kotlin.coroutines.Continuation p0);

    public abstract Object R6(kotlin.coroutines.Continuation p0);

    public abstract Object X(kotlin.coroutines.Continuation p0);

    public abstract Object cD(kotlin.coroutines.Continuation p0);

    public void hUw(com.bendingspoons.injet.webbridge.XSt p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "scope");
        p4.hUw("purchase", new com.bendingspoons.injet.module.MonetizationModule$K(new com.bendingspoons.injet.module.MonetizationModule$xfY(this, 0), 0));
        p4.hUw("restore", new com.bendingspoons.injet.module.MonetizationModule$qfV(new com.bendingspoons.injet.module.MonetizationModule$A(this, 0), 0));
        p4.hUw("getProducts", new com.bendingspoons.injet.module.MonetizationModule$Enc(new com.bendingspoons.injet.module.MonetizationModule$CU(this, 0), 0));
        p4.hUw("getActiveProductId", new com.bendingspoons.injet.module.MonetizationModule$F(new com.bendingspoons.injet.module.MonetizationModule$h(this, 0), 0));
        p4.hUw("getIsUserPro", new com.bendingspoons.injet.module.MonetizationModule$D(new com.bendingspoons.injet.module.MonetizationModule$XSt(this, 0), 0));
        p4.hUw("getIsUserEligibleForFreeTrial", new com.bendingspoons.injet.module.MonetizationModule$Zv9(new com.bendingspoons.injet.module.MonetizationModule$V(this, 0), 0));
        p4.hUw("getPaywallHits", new com.bendingspoons.injet.module.MonetizationModule$AWD(new com.bendingspoons.injet.module.MonetizationModule$cY(this, 0), 0));
        p4.hUw("incrementPaywallHits", new com.bendingspoons.injet.module.MonetizationModule$et(new com.bendingspoons.injet.module.MonetizationModule$c(this, 0), 0));
        return;
    }

    public String j()
    {
        return "Monetization";
    }

    public abstract Object ojl(String p0, kotlin.coroutines.Continuation p1);

    public abstract Object q(kotlin.coroutines.Continuation p0);

    public abstract Object uKP(kotlin.coroutines.Continuation p0);

    public abstract Object x(kotlin.coroutines.Continuation p0);
}
