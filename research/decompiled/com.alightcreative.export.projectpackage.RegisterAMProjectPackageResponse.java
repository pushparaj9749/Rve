package com.alightcreative.export.projectpackage;
public final class RegisterAMProjectPackageResponse {
    public static final int $stable;
    private final String result;

    static RegisterAMProjectPackageResponse()
    {
        return;
    }

    public RegisterAMProjectPackageResponse(String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "result");
        this.result = p2;
        return;
    }

    public static synthetic com.alightcreative.export.projectpackage.RegisterAMProjectPackageResponse copy$default(com.alightcreative.export.projectpackage.RegisterAMProjectPackageResponse p0, String p1, int p2, Object p3)
    {
        if ((p2 & 1) != 0) {
            p1 = p0.result;
        }
        return p0.copy(p1);
    }

    public final String component1()
    {
        return this.result;
    }

    public final com.alightcreative.export.projectpackage.RegisterAMProjectPackageResponse copy(String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "result");
        return new com.alightcreative.export.projectpackage.RegisterAMProjectPackageResponse(p2);
    }

    public boolean equals(Object p4)
    {
        if (this != p4) {
            if ((p4 instanceof com.alightcreative.export.projectpackage.RegisterAMProjectPackageResponse)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.alightcreative.export.projectpackage.RegisterAMProjectPackageResponse) p4).result)) {
                    return 1;
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

    public final String getResult()
    {
        return this.result;
    }

    public int hashCode()
    {
        return this.result.hashCode();
    }

    public String toString()
    {
        String v0_0 = this.result;
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("RegisterAMProjectPackageResponse(result=");
        v1_1.append(v0_0);
        v1_1.append(")");
        return v1_1.toString();
    }
}
