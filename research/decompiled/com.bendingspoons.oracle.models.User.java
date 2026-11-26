package com.bendingspoons.oracle.models;
public final class User {
    private static final sn2.h[] $childSerializers;
    public static final int $stable;
    public static final com.bendingspoons.oracle.models.User$A Companion;
    private final java.util.List activeBundleSubscriptions;
    private final java.util.List activeSubscriptions;
    private final java.util.List activeSubscriptionsIds;
    private final com.bendingspoons.oracle.models.User$AuthenticationResponse authentication;
    private final java.util.Map availableConsumableCredits;
    private final String id;
    private final java.util.List nonConsumablesIds;
    private final com.bendingspoons.oracle.models.User$PrivacyNotice privacyNotice;
    private final com.bendingspoons.oracle.models.User$TermsOfService termsOfService;

    static User()
    {
        com.bendingspoons.oracle.models.User.Companion = new com.bendingspoons.oracle.models.User$A(0);
        com.bendingspoons.oracle.models.User.$stable = 8;
        yz.V v3_2 = yz.OuM.hUw;
        int v2_7 = new yz.V(v3_2);
        yz.HLZ v4_0 = new yz.HLZ(v3_2, yz.n.hUw);
        yz.V v5_2 = new yz.V(v3_2);
        yz.V v3_1 = new yz.V(com.bendingspoons.oracle.models.User$BundleSubscription$xfY.hUw);
        yz.V v6_2 = new yz.V(com.bendingspoons.oracle.models.User$ActiveSubscription$xfY.hUw);
        sn2.h[] v7_2 = new sn2.h[9];
        v7_2[0] = 0;
        v7_2[1] = v2_7;
        v7_2[2] = 0;
        v7_2[3] = 0;
        v7_2[4] = v4_0;
        v7_2[5] = v5_2;
        v7_2[6] = v3_1;
        v7_2[7] = v6_2;
        v7_2[8] = 0;
        com.bendingspoons.oracle.models.User.$childSerializers = v7_2;
        return;
    }

    public User()
    {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, 0);
        return;
    }

    public synthetic User(int p7, String p8, java.util.List p9, com.bendingspoons.oracle.models.User$PrivacyNotice p10, com.bendingspoons.oracle.models.User$TermsOfService p11, java.util.Map p12, java.util.List p13, java.util.List p14, java.util.List p15, com.bendingspoons.oracle.models.User$AuthenticationResponse p16, yz.E4F p17)
    {
        if ((p7 & 1) == 0) {
            p8 = "";
        }
        this.id = p8;
        if ((p7 & 2) != 0) {
            this.activeSubscriptionsIds = p9;
        } else {
            this.activeSubscriptionsIds = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((p7 & 4) != 0) {
            this.privacyNotice = p10;
        } else {
            this.privacyNotice = new com.bendingspoons.oracle.models.User$PrivacyNotice(0, 0, 0, 7, 0);
        }
        if ((p7 & 8) != 0) {
            this.termsOfService = p11;
        } else {
            this.termsOfService = new com.bendingspoons.oracle.models.User$TermsOfService(0, 1, 0);
        }
        if ((p7 & 16) != 0) {
            this.availableConsumableCredits = p12;
        } else {
            this.availableConsumableCredits = kotlin.collections.MapsKt.emptyMap();
        }
        if ((p7 & 32) != 0) {
            this.nonConsumablesIds = p13;
        } else {
            this.nonConsumablesIds = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((p7 & 64) != 0) {
            this.activeBundleSubscriptions = p14;
        } else {
            this.activeBundleSubscriptions = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((p7 & 128) != 0) {
            this.activeSubscriptions = p15;
        } else {
            this.activeSubscriptions = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((p7 & 256) != 0) {
            this.authentication = p16;
            return;
        } else {
            this.authentication = 0;
            return;
        }
    }

    public User(String p2, java.util.List p3, com.bendingspoons.oracle.models.User$PrivacyNotice p4, com.bendingspoons.oracle.models.User$TermsOfService p5, java.util.Map p6, java.util.List p7, java.util.List p8, java.util.List p9, com.bendingspoons.oracle.models.User$AuthenticationResponse p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "activeSubscriptionsIds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "privacyNotice");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "termsOfService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "availableConsumableCredits");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "nonConsumablesIds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "activeBundleSubscriptions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "activeSubscriptions");
        this.id = p2;
        this.activeSubscriptionsIds = p3;
        this.privacyNotice = p4;
        this.termsOfService = p5;
        this.availableConsumableCredits = p6;
        this.nonConsumablesIds = p7;
        this.activeBundleSubscriptions = p8;
        this.activeSubscriptions = p9;
        this.authentication = p10;
        return;
    }

    public synthetic User(String p9, java.util.List p10, com.bendingspoons.oracle.models.User$PrivacyNotice p11, com.bendingspoons.oracle.models.User$TermsOfService p12, java.util.Map p13, java.util.List p14, java.util.List p15, java.util.List p16, com.bendingspoons.oracle.models.User$AuthenticationResponse p17, int p18, kotlin.jvm.internal.DefaultConstructorMarker p19)
    {
        if ((p18 & 1) != 0) {
            p9 = "";
        }
        if ((p18 & 2) != 0) {
            p10 = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((p18 & 4) != 0) {
            p11 = new com.bendingspoons.oracle.models.User$PrivacyNotice(0, 0, 0, 7, 0);
        }
        if ((p18 & 8) != 0) {
            p12 = new com.bendingspoons.oracle.models.User$TermsOfService(0, 1, 0);
        }
        if ((p18 & 16) != 0) {
            p13 = kotlin.collections.MapsKt.emptyMap();
        }
        java.util.List v1_5;
        if ((p18 & 32) == 0) {
            v1_5 = p14;
        } else {
            v1_5 = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List v3_2;
        if ((p18 & 64) == 0) {
            v3_2 = p15;
        } else {
            v3_2 = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List v4_2;
        if ((p18 & 128) == 0) {
            v4_2 = p16;
        } else {
            v4_2 = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((p18 & 256) == 0) {
            p19 = p17;
        } else {
            p19 = 0;
        }
        this(p9, p10, p11, p12, p13, v1_5, v3_2, v4_2, p19);
        return;
    }

    public static final synthetic sn2.h[] access$get$childSerializers$cp()
    {
        return com.bendingspoons.oracle.models.User.$childSerializers;
    }

    public static synthetic com.bendingspoons.oracle.models.User copy$default(com.bendingspoons.oracle.models.User p0, String p1, java.util.List p2, com.bendingspoons.oracle.models.User$PrivacyNotice p3, com.bendingspoons.oracle.models.User$TermsOfService p4, java.util.Map p5, java.util.List p6, java.util.List p7, java.util.List p8, com.bendingspoons.oracle.models.User$AuthenticationResponse p9, int p10, Object p11)
    {
        if ((p10 & 1) != 0) {
            p1 = p0.id;
        }
        if ((p10 & 2) != 0) {
            p2 = p0.activeSubscriptionsIds;
        }
        if ((p10 & 4) != 0) {
            p3 = p0.privacyNotice;
        }
        if ((p10 & 8) != 0) {
            p4 = p0.termsOfService;
        }
        if ((p10 & 16) != 0) {
            p5 = p0.availableConsumableCredits;
        }
        if ((p10 & 32) != 0) {
            p6 = p0.nonConsumablesIds;
        }
        if ((p10 & 64) != 0) {
            p7 = p0.activeBundleSubscriptions;
        }
        if ((p10 & 128) != 0) {
            p8 = p0.activeSubscriptions;
        }
        if ((p10 & 256) != 0) {
            p9 = p0.authentication;
        }
        return p0.copy(p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public static synthetic void getActiveBundleSubscriptions$annotations()
    {
        return;
    }

    public static synthetic void getActiveSubscriptions$annotations()
    {
        return;
    }

    public static synthetic void getActiveSubscriptionsIds$annotations()
    {
        return;
    }

    public static synthetic void getAuthentication$annotations()
    {
        return;
    }

    public static synthetic void getAvailableConsumableCredits$annotations()
    {
        return;
    }

    public static synthetic void getId$annotations()
    {
        return;
    }

    public static synthetic void getNonConsumablesIds$annotations()
    {
        return;
    }

    public static synthetic void getPrivacyNotice$annotations()
    {
        return;
    }

    public static synthetic void getTermsOfService$annotations()
    {
        return;
    }

    public static final synthetic void write$Self$oracle_release(com.bendingspoons.oracle.models.User p10, UP.h p11, Jt4.V p12)
    {
        int v0_0 = com.bendingspoons.oracle.models.User.$childSerializers;
        if ((p11.x1(p12, 0)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p10.id, ""))) {
            p11.T(p12, 0, p10.id);
        }
        if ((p11.x1(p12, 1)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p10.activeSubscriptionsIds, kotlin.collections.CollectionsKt.emptyList()))) {
            p11.uKP(p12, 1, v0_0[1], p10.activeSubscriptionsIds);
        }
        if ((p11.x1(p12, 2)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p10.privacyNotice, new com.bendingspoons.oracle.models.User$PrivacyNotice(0, 0, 0, 7, 0)))) {
            p11.uKP(p12, 2, com.bendingspoons.oracle.models.User$PrivacyNotice$xfY.hUw, p10.privacyNotice);
        }
        if ((p11.x1(p12, 3)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p10.termsOfService, new com.bendingspoons.oracle.models.User$TermsOfService(0, 1, 0)))) {
            p11.uKP(p12, 3, com.bendingspoons.oracle.models.User$TermsOfService$xfY.hUw, p10.termsOfService);
        }
        if ((p11.x1(p12, 4)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p10.availableConsumableCredits, kotlin.collections.MapsKt.emptyMap()))) {
            p11.uKP(p12, 4, v0_0[4], p10.availableConsumableCredits);
        }
        if ((p11.x1(p12, 5)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p10.nonConsumablesIds, kotlin.collections.CollectionsKt.emptyList()))) {
            p11.uKP(p12, 5, v0_0[5], p10.nonConsumablesIds);
        }
        if ((p11.x1(p12, 6)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p10.activeBundleSubscriptions, kotlin.collections.CollectionsKt.emptyList()))) {
            p11.uKP(p12, 6, v0_0[6], p10.activeBundleSubscriptions);
        }
        if ((p11.x1(p12, 7)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p10.activeSubscriptions, kotlin.collections.CollectionsKt.emptyList()))) {
            p11.uKP(p12, 7, v0_0[7], p10.activeSubscriptions);
        }
        if ((p11.x1(p12, 8)) || (p10.authentication != null)) {
            p11.ak(p12, 8, com.bendingspoons.oracle.models.User$AuthenticationResponse$xfY.hUw, p10.authentication);
        }
        return;
    }

    public final String component1()
    {
        return this.id;
    }

    public final java.util.List component2()
    {
        return this.activeSubscriptionsIds;
    }

    public final com.bendingspoons.oracle.models.User$PrivacyNotice component3()
    {
        return this.privacyNotice;
    }

    public final com.bendingspoons.oracle.models.User$TermsOfService component4()
    {
        return this.termsOfService;
    }

    public final java.util.Map component5()
    {
        return this.availableConsumableCredits;
    }

    public final java.util.List component6()
    {
        return this.nonConsumablesIds;
    }

    public final java.util.List component7()
    {
        return this.activeBundleSubscriptions;
    }

    public final java.util.List component8()
    {
        return this.activeSubscriptions;
    }

    public final com.bendingspoons.oracle.models.User$AuthenticationResponse component9()
    {
        return this.authentication;
    }

    public final com.bendingspoons.oracle.models.User copy(String p12, java.util.List p13, com.bendingspoons.oracle.models.User$PrivacyNotice p14, com.bendingspoons.oracle.models.User$TermsOfService p15, java.util.Map p16, java.util.List p17, java.util.List p18, java.util.List p19, com.bendingspoons.oracle.models.User$AuthenticationResponse p20)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "activeSubscriptionsIds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "privacyNotice");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "termsOfService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "availableConsumableCredits");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "nonConsumablesIds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "activeBundleSubscriptions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "activeSubscriptions");
        return new com.bendingspoons.oracle.models.User(p12, p13, p14, p15, p16, p17, p18, p19, p20);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.bendingspoons.oracle.models.User)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.bendingspoons.oracle.models.User) p5).id)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.activeSubscriptionsIds, ((com.bendingspoons.oracle.models.User) p5).activeSubscriptionsIds)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.privacyNotice, ((com.bendingspoons.oracle.models.User) p5).privacyNotice)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.termsOfService, ((com.bendingspoons.oracle.models.User) p5).termsOfService)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.availableConsumableCredits, ((com.bendingspoons.oracle.models.User) p5).availableConsumableCredits)) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.nonConsumablesIds, ((com.bendingspoons.oracle.models.User) p5).nonConsumablesIds)) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.activeBundleSubscriptions, ((com.bendingspoons.oracle.models.User) p5).activeBundleSubscriptions)) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.activeSubscriptions, ((com.bendingspoons.oracle.models.User) p5).activeSubscriptions)) {
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.authentication, ((com.bendingspoons.oracle.models.User) p5).authentication)) {
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
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final java.util.List getActiveBundleSubscriptions()
    {
        return this.activeBundleSubscriptions;
    }

    public final java.util.List getActiveSubscriptions()
    {
        return this.activeSubscriptions;
    }

    public final java.util.List getActiveSubscriptionsIds()
    {
        return this.activeSubscriptionsIds;
    }

    public final com.bendingspoons.oracle.models.User$AuthenticationResponse getAuthentication()
    {
        return this.authentication;
    }

    public final java.util.Map getAvailableConsumableCredits()
    {
        return this.availableConsumableCredits;
    }

    public final String getId()
    {
        return this.id;
    }

    public final java.util.List getNonConsumablesIds()
    {
        return this.nonConsumablesIds;
    }

    public final com.bendingspoons.oracle.models.User$PrivacyNotice getPrivacyNotice()
    {
        return this.privacyNotice;
    }

    public final com.bendingspoons.oracle.models.User$TermsOfService getTermsOfService()
    {
        return this.termsOfService;
    }

    public int hashCode()
    {
        int v1_13;
        int v0_14 = (((((((((((((((this.id.hashCode() * 31) + this.activeSubscriptionsIds.hashCode()) * 31) + this.privacyNotice.hashCode()) * 31) + this.termsOfService.hashCode()) * 31) + this.availableConsumableCredits.hashCode()) * 31) + this.nonConsumablesIds.hashCode()) * 31) + this.activeBundleSubscriptions.hashCode()) * 31) + this.activeSubscriptions.hashCode()) * 31);
        int v1_11 = this.authentication;
        if (v1_11 != 0) {
            v1_13 = v1_11.hashCode();
        } else {
            v1_13 = 0;
        }
        return (v0_14 + v1_13);
    }

    public String toString()
    {
        String v0_0 = this.id;
        java.util.List v1 = this.activeSubscriptionsIds;
        com.bendingspoons.oracle.models.User$PrivacyNotice v2 = this.privacyNotice;
        com.bendingspoons.oracle.models.User$TermsOfService v3 = this.termsOfService;
        java.util.Map v4 = this.availableConsumableCredits;
        java.util.List v5 = this.nonConsumablesIds;
        java.util.List v6 = this.activeBundleSubscriptions;
        java.util.List v7 = this.activeSubscriptions;
        com.bendingspoons.oracle.models.User$AuthenticationResponse v8 = this.authentication;
        StringBuilder v9_0 = new StringBuilder();
        v9_0.append("User(id=");
        v9_0.append(v0_0);
        v9_0.append(", activeSubscriptionsIds=");
        v9_0.append(v1);
        v9_0.append(", privacyNotice=");
        v9_0.append(v2);
        v9_0.append(", termsOfService=");
        v9_0.append(v3);
        v9_0.append(", availableConsumableCredits=");
        v9_0.append(v4);
        v9_0.append(", nonConsumablesIds=");
        v9_0.append(v5);
        v9_0.append(", activeBundleSubscriptions=");
        v9_0.append(v6);
        v9_0.append(", activeSubscriptions=");
        v9_0.append(v7);
        v9_0.append(", authentication=");
        v9_0.append(v8);
        v9_0.append(")");
        return v9_0.toString();
    }
}
