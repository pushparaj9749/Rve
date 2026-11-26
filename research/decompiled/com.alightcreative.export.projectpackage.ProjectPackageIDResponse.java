package com.alightcreative.export.projectpackage;
public final class ProjectPackageIDResponse {
    public static final int $stable;
    private final String errorCode;
    private final String errorMessage;
    private final Long freeUserMaxDownloadSize;
    private final String packageId;
    private final String result;

    static ProjectPackageIDResponse()
    {
        return;
    }

    public ProjectPackageIDResponse(String p2, String p3, String p4, String p5, Long p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "result");
        this.result = p2;
        this.packageId = p3;
        this.errorCode = p4;
        this.errorMessage = p5;
        this.freeUserMaxDownloadSize = p6;
        return;
    }

    public static synthetic com.alightcreative.export.projectpackage.ProjectPackageIDResponse copy$default(com.alightcreative.export.projectpackage.ProjectPackageIDResponse p0, String p1, String p2, String p3, String p4, Long p5, int p6, Object p7)
    {
        if ((p6 & 1) != 0) {
            p1 = p0.result;
        }
        if ((p6 & 2) != 0) {
            p2 = p0.packageId;
        }
        if ((p6 & 4) != 0) {
            p3 = p0.errorCode;
        }
        if ((p6 & 8) != 0) {
            p4 = p0.errorMessage;
        }
        if ((p6 & 16) != 0) {
            p5 = p0.freeUserMaxDownloadSize;
        }
        return p0.copy(p1, p2, p3, p4, p5);
    }

    public final String component1()
    {
        return this.result;
    }

    public final String component2()
    {
        return this.packageId;
    }

    public final String component3()
    {
        return this.errorCode;
    }

    public final String component4()
    {
        return this.errorMessage;
    }

    public final Long component5()
    {
        return this.freeUserMaxDownloadSize;
    }

    public final com.alightcreative.export.projectpackage.ProjectPackageIDResponse copy(String p8, String p9, String p10, String p11, Long p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "result");
        return new com.alightcreative.export.projectpackage.ProjectPackageIDResponse(p8, p9, p10, p11, p12);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.export.projectpackage.ProjectPackageIDResponse)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.alightcreative.export.projectpackage.ProjectPackageIDResponse) p5).result)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.packageId, ((com.alightcreative.export.projectpackage.ProjectPackageIDResponse) p5).packageId)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, ((com.alightcreative.export.projectpackage.ProjectPackageIDResponse) p5).errorCode)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.alightcreative.export.projectpackage.ProjectPackageIDResponse) p5).errorMessage)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.freeUserMaxDownloadSize, ((com.alightcreative.export.projectpackage.ProjectPackageIDResponse) p5).freeUserMaxDownloadSize)) {
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
            return 1;
        }
    }

    public final String getErrorCode()
    {
        return this.errorCode;
    }

    public final String getErrorMessage()
    {
        return this.errorMessage;
    }

    public final Long getFreeUserMaxDownloadSize()
    {
        return this.freeUserMaxDownloadSize;
    }

    public final String getPackageId()
    {
        return this.packageId;
    }

    public final String getResult()
    {
        return this.result;
    }

    public int hashCode()
    {
        Long v1_6;
        int v0_8 = (this.result.hashCode() * 31);
        Long v1_5 = this.packageId;
        int v2 = 0;
        if (v1_5 != null) {
            v1_6 = v1_5.hashCode();
        } else {
            v1_6 = 0;
        }
        Long v1_1;
        int v0_2 = ((v0_8 + v1_6) * 31);
        Long v1_0 = this.errorCode;
        if (v1_0 != null) {
            v1_1 = v1_0.hashCode();
        } else {
            v1_1 = 0;
        }
        Long v1_3;
        int v0_4 = ((v0_2 + v1_1) * 31);
        Long v1_2 = this.errorMessage;
        if (v1_2 != null) {
            v1_3 = v1_2.hashCode();
        } else {
            v1_3 = 0;
        }
        int v0_7 = ((v0_4 + v1_3) * 31);
        Long v1_4 = this.freeUserMaxDownloadSize;
        if (v1_4 != null) {
            v2 = v1_4.hashCode();
        }
        return (v0_7 + v2);
    }

    public String toString()
    {
        String v0_0 = this.result;
        String v1 = this.packageId;
        String v2 = this.errorCode;
        String v3 = this.errorMessage;
        Long v4 = this.freeUserMaxDownloadSize;
        StringBuilder v5_1 = new StringBuilder();
        v5_1.append("ProjectPackageIDResponse(result=");
        v5_1.append(v0_0);
        v5_1.append(", packageId=");
        v5_1.append(v1);
        v5_1.append(", errorCode=");
        v5_1.append(v2);
        v5_1.append(", errorMessage=");
        v5_1.append(v3);
        v5_1.append(", freeUserMaxDownloadSize=");
        v5_1.append(v4);
        v5_1.append(")");
        return v5_1.toString();
    }
}
