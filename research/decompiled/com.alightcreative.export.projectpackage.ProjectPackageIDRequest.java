package com.alightcreative.export.projectpackage;
public final class ProjectPackageIDRequest {
    public static final int $stable;
    private final String acctTestMode;
    private final long packageSize;

    static ProjectPackageIDRequest()
    {
        return;
    }

    public ProjectPackageIDRequest(long p2, String p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "acctTestMode");
        this.packageSize = p2;
        this.acctTestMode = p4;
        return;
    }

    public static synthetic com.alightcreative.export.projectpackage.ProjectPackageIDRequest copy$default(com.alightcreative.export.projectpackage.ProjectPackageIDRequest p0, long p1, String p3, int p4, Object p5)
    {
        if ((p4 & 1) != 0) {
            p1 = p0.packageSize;
        }
        if ((p4 & 2) != 0) {
            p3 = p0.acctTestMode;
        }
        return p0.copy(p1, p3);
    }

    public final long component1()
    {
        return this.packageSize;
    }

    public final String component2()
    {
        return this.acctTestMode;
    }

    public final com.alightcreative.export.projectpackage.ProjectPackageIDRequest copy(long p2, String p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "acctTestMode");
        return new com.alightcreative.export.projectpackage.ProjectPackageIDRequest(p2, p4);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.alightcreative.export.projectpackage.ProjectPackageIDRequest)) {
                if (this.packageSize == ((com.alightcreative.export.projectpackage.ProjectPackageIDRequest) p8).packageSize) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.acctTestMode, ((com.alightcreative.export.projectpackage.ProjectPackageIDRequest) p8).acctTestMode)) {
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
            return 1;
        }
    }

    public final String getAcctTestMode()
    {
        return this.acctTestMode;
    }

    public final long getPackageSize()
    {
        return this.packageSize;
    }

    public int hashCode()
    {
        return ((Long.hashCode(this.packageSize) * 31) + this.acctTestMode.hashCode());
    }

    public String toString()
    {
        String v0_0 = this.packageSize;
        String v2 = this.acctTestMode;
        StringBuilder v3_1 = new StringBuilder();
        v3_1.append("ProjectPackageIDRequest(packageSize=");
        v3_1.append(v0_0);
        v3_1.append(", acctTestMode=");
        v3_1.append(v2);
        v3_1.append(")");
        return v3_1.toString();
    }
}
