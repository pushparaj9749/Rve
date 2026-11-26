package com.alightcreative.export.projectpackage;
public final class RegisterAMProjectPackageRequest {
    public static final int $stable = 8;
    private final String acctTestMode;
    private final String packageId;
    private final com.alightcreative.export.projectpackage.SharedProjectPackageInfo packageInfo;

    static RegisterAMProjectPackageRequest()
    {
        return;
    }

    public RegisterAMProjectPackageRequest(com.alightcreative.export.projectpackage.SharedProjectPackageInfo p2, String p3, String p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "packageInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "packageId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "acctTestMode");
        this.packageInfo = p2;
        this.packageId = p3;
        this.acctTestMode = p4;
        return;
    }

    public static synthetic com.alightcreative.export.projectpackage.RegisterAMProjectPackageRequest copy$default(com.alightcreative.export.projectpackage.RegisterAMProjectPackageRequest p0, com.alightcreative.export.projectpackage.SharedProjectPackageInfo p1, String p2, String p3, int p4, Object p5)
    {
        if ((p4 & 1) != 0) {
            p1 = p0.packageInfo;
        }
        if ((p4 & 2) != 0) {
            p2 = p0.packageId;
        }
        if ((p4 & 4) != 0) {
            p3 = p0.acctTestMode;
        }
        return p0.copy(p1, p2, p3);
    }

    public final com.alightcreative.export.projectpackage.SharedProjectPackageInfo component1()
    {
        return this.packageInfo;
    }

    public final String component2()
    {
        return this.packageId;
    }

    public final String component3()
    {
        return this.acctTestMode;
    }

    public final com.alightcreative.export.projectpackage.RegisterAMProjectPackageRequest copy(com.alightcreative.export.projectpackage.SharedProjectPackageInfo p2, String p3, String p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "packageInfo");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "packageId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "acctTestMode");
        return new com.alightcreative.export.projectpackage.RegisterAMProjectPackageRequest(p2, p3, p4);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.export.projectpackage.RegisterAMProjectPackageRequest)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.packageInfo, ((com.alightcreative.export.projectpackage.RegisterAMProjectPackageRequest) p5).packageInfo)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.packageId, ((com.alightcreative.export.projectpackage.RegisterAMProjectPackageRequest) p5).packageId)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.acctTestMode, ((com.alightcreative.export.projectpackage.RegisterAMProjectPackageRequest) p5).acctTestMode)) {
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

    public final String getAcctTestMode()
    {
        return this.acctTestMode;
    }

    public final String getPackageId()
    {
        return this.packageId;
    }

    public final com.alightcreative.export.projectpackage.SharedProjectPackageInfo getPackageInfo()
    {
        return this.packageInfo;
    }

    public int hashCode()
    {
        return ((((this.packageInfo.hashCode() * 31) + this.packageId.hashCode()) * 31) + this.acctTestMode.hashCode());
    }

    public String toString()
    {
        String v0_0 = this.packageInfo;
        String v1 = this.packageId;
        String v2 = this.acctTestMode;
        StringBuilder v3_1 = new StringBuilder();
        v3_1.append("RegisterAMProjectPackageRequest(packageInfo=");
        v3_1.append(v0_0);
        v3_1.append(", packageId=");
        v3_1.append(v1);
        v3_1.append(", acctTestMode=");
        v3_1.append(v2);
        v3_1.append(")");
        return v3_1.toString();
    }
}
