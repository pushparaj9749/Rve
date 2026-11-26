package com.bendingspoons.oracle.models;
public final class Products {
    private static final sn2.h[] $childSerializers;
    public static final int $stable;
    public static final com.bendingspoons.oracle.models.Products$A Companion;
    private java.util.List consumables;
    private java.util.List nonConsumables;
    private java.util.List subscriptions;

    static Products()
    {
        com.bendingspoons.oracle.models.Products.Companion = new com.bendingspoons.oracle.models.Products$A(0);
        com.bendingspoons.oracle.models.Products.$stable = 8;
        int v0_6 = new yz.V(com.bendingspoons.oracle.models.Consumable$xfY.hUw);
        yz.V v1_1 = new yz.V(com.bendingspoons.oracle.models.NonConsumable$xfY.hUw);
        yz.V v2_2 = new yz.V(com.bendingspoons.oracle.models.Subscription$xfY.hUw);
        sn2.h[] v3_2 = new sn2.h[3];
        v3_2[0] = v0_6;
        v3_2[1] = v1_1;
        v3_2[2] = v2_2;
        com.bendingspoons.oracle.models.Products.$childSerializers = v3_2;
        return;
    }

    public Products()
    {
        this(0, 0, 0, 7, 0);
        return;
    }

    public synthetic Products(int p1, java.util.List p2, java.util.List p3, java.util.List p4, yz.E4F p5)
    {
        if ((p1 & 1) == 0) {
            p2 = kotlin.collections.CollectionsKt.emptyList();
        }
        this.consumables = p2;
        if ((p1 & 2) != 0) {
            this.nonConsumables = p3;
        } else {
            this.nonConsumables = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((p1 & 4) != 0) {
            this.subscriptions = p4;
            return;
        } else {
            this.subscriptions = kotlin.collections.CollectionsKt.emptyList();
            return;
        }
    }

    public Products(java.util.List p2, java.util.List p3, java.util.List p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "consumables");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "nonConsumables");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "subscriptions");
        this.consumables = p2;
        this.nonConsumables = p3;
        this.subscriptions = p4;
        return;
    }

    public synthetic Products(java.util.List p1, java.util.List p2, java.util.List p3, int p4, kotlin.jvm.internal.DefaultConstructorMarker p5)
    {
        if ((p4 & 1) != 0) {
            p1 = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((p4 & 2) != 0) {
            p2 = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((p4 & 4) != 0) {
            p3 = kotlin.collections.CollectionsKt.emptyList();
        }
        this(p1, p2, p3);
        return;
    }

    public static final synthetic sn2.h[] access$get$childSerializers$cp()
    {
        return com.bendingspoons.oracle.models.Products.$childSerializers;
    }

    public static synthetic com.bendingspoons.oracle.models.Products copy$default(com.bendingspoons.oracle.models.Products p0, java.util.List p1, java.util.List p2, java.util.List p3, int p4, Object p5)
    {
        if ((p4 & 1) != 0) {
            p1 = p0.consumables;
        }
        if ((p4 & 2) != 0) {
            p2 = p0.nonConsumables;
        }
        if ((p4 & 4) != 0) {
            p3 = p0.subscriptions;
        }
        return p0.copy(p1, p2, p3);
    }

    public static synthetic void getConsumables$annotations()
    {
        return;
    }

    public static synthetic void getNonConsumables$annotations()
    {
        return;
    }

    public static synthetic void getSubscriptions$annotations()
    {
        return;
    }

    public static final synthetic void write$Self$oracle_release(com.bendingspoons.oracle.models.Products p4, UP.h p5, Jt4.V p6)
    {
        sn2.h v0_0 = com.bendingspoons.oracle.models.Products.$childSerializers;
        if ((p5.x1(p6, 0)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p4.consumables, kotlin.collections.CollectionsKt.emptyList()))) {
            p5.uKP(p6, 0, v0_0[0], p4.consumables);
        }
        if ((p5.x1(p6, 1)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p4.nonConsumables, kotlin.collections.CollectionsKt.emptyList()))) {
            p5.uKP(p6, 1, v0_0[1], p4.nonConsumables);
        }
        if ((p5.x1(p6, 2)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p4.subscriptions, kotlin.collections.CollectionsKt.emptyList()))) {
            p5.uKP(p6, 2, v0_0[2], p4.subscriptions);
        }
        return;
    }

    public final java.util.List component1()
    {
        return this.consumables;
    }

    public final java.util.List component2()
    {
        return this.nonConsumables;
    }

    public final java.util.List component3()
    {
        return this.subscriptions;
    }

    public final com.bendingspoons.oracle.models.Products copy(java.util.List p2, java.util.List p3, java.util.List p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, com.fyber.inneractive.sdk.config.enums.omu.kpIGB.jUEShtPjDOwR);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "nonConsumables");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "subscriptions");
        return new com.bendingspoons.oracle.models.Products(p2, p3, p4);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.bendingspoons.oracle.models.Products)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.consumables, ((com.bendingspoons.oracle.models.Products) p5).consumables)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.nonConsumables, ((com.bendingspoons.oracle.models.Products) p5).nonConsumables)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.subscriptions, ((com.bendingspoons.oracle.models.Products) p5).subscriptions)) {
                            return 1;
                        } else {
                            return 0;
                        }
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final java.util.List getConsumables()
    {
        return this.consumables;
    }

    public final java.util.List getNonConsumables()
    {
        return this.nonConsumables;
    }

    public final java.util.List getSubscriptions()
    {
        return this.subscriptions;
    }

    public int hashCode()
    {
        return ((((this.consumables.hashCode() * 31) + this.nonConsumables.hashCode()) * 31) + this.subscriptions.hashCode());
    }

    public final void setConsumables(java.util.List p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.consumables = p2;
        return;
    }

    public final void setNonConsumables(java.util.List p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.nonConsumables = p2;
        return;
    }

    public final void setSubscriptions(java.util.List p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.subscriptions = p2;
        return;
    }

    public String toString()
    {
        String v0_0 = this.consumables;
        java.util.List v1 = this.nonConsumables;
        java.util.List v2 = this.subscriptions;
        StringBuilder v3_1 = new StringBuilder();
        v3_1.append("Products(consumables=");
        v3_1.append(v0_0);
        v3_1.append(", nonConsumables=");
        v3_1.append(v1);
        v3_1.append(", subscriptions=");
        v3_1.append(v2);
        v3_1.append(")");
        return v3_1.toString();
    }
}
