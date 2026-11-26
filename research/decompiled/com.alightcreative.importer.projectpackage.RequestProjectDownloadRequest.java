package com.alightcreative.importer.projectpackage;
public final class RequestProjectDownloadRequest {
    public static final int $stable;
    private final String acctTestMode;
    private final int appBuild;
    private final boolean liteVersion;
    private final String pid;
    private final String platform;
    private final String uid;

    static RequestProjectDownloadRequest()
    {
        return;
    }

    public RequestProjectDownloadRequest(String p2, String p3, String p4, int p5, boolean p6, String p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "pid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "platform");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "acctTestMode");
        this.uid = p2;
        this.pid = p3;
        this.platform = p4;
        this.appBuild = p5;
        this.liteVersion = p6;
        this.acctTestMode = p7;
        return;
    }

    public static synthetic com.alightcreative.importer.projectpackage.RequestProjectDownloadRequest copy$default(com.alightcreative.importer.projectpackage.RequestProjectDownloadRequest p0, String p1, String p2, String p3, int p4, boolean p5, String p6, int p7, Object p8)
    {
        if ((p7 & 1) != 0) {
            p1 = p0.uid;
        }
        if ((p7 & 2) != 0) {
            p2 = p0.pid;
        }
        if ((p7 & 4) != 0) {
            p3 = p0.platform;
        }
        if ((p7 & 8) != 0) {
            p4 = p0.appBuild;
        }
        if ((p7 & 16) != 0) {
            p5 = p0.liteVersion;
        }
        if ((p7 & 32) != 0) {
            p6 = p0.acctTestMode;
        }
        return p0.copy(p1, p2, p3, p4, p5, p6);
    }

    public final String component1()
    {
        return this.uid;
    }

    public final String component2()
    {
        return this.pid;
    }

    public final String component3()
    {
        return this.platform;
    }

    public final int component4()
    {
        return this.appBuild;
    }

    public final boolean component5()
    {
        return this.liteVersion;
    }

    public final String component6()
    {
        return this.acctTestMode;
    }

    public final com.alightcreative.importer.projectpackage.RequestProjectDownloadRequest copy(String p9, String p10, String p11, int p12, boolean p13, String p14)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "pid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "platform");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "acctTestMode");
        return new com.alightcreative.importer.projectpackage.RequestProjectDownloadRequest(p9, p10, p11, p12, p13, p14);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.importer.projectpackage.RequestProjectDownloadRequest)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.uid, ((com.alightcreative.importer.projectpackage.RequestProjectDownloadRequest) p5).uid)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.pid, ((com.alightcreative.importer.projectpackage.RequestProjectDownloadRequest) p5).pid)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.platform, ((com.alightcreative.importer.projectpackage.RequestProjectDownloadRequest) p5).platform)) {
                            if (this.appBuild == ((com.alightcreative.importer.projectpackage.RequestProjectDownloadRequest) p5).appBuild) {
                                if (this.liteVersion == ((com.alightcreative.importer.projectpackage.RequestProjectDownloadRequest) p5).liteVersion) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.acctTestMode, ((com.alightcreative.importer.projectpackage.RequestProjectDownloadRequest) p5).acctTestMode)) {
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
            return 1;
        }
    }

    public final String getAcctTestMode()
    {
        return this.acctTestMode;
    }

    public final int getAppBuild()
    {
        return this.appBuild;
    }

    public final boolean getLiteVersion()
    {
        return this.liteVersion;
    }

    public final String getPid()
    {
        return this.pid;
    }

    public final String getPlatform()
    {
        return this.platform;
    }

    public final String getUid()
    {
        return this.uid;
    }

    public int hashCode()
    {
        return ((((((((((this.uid.hashCode() * 31) + this.pid.hashCode()) * 31) + this.platform.hashCode()) * 31) + Integer.hashCode(this.appBuild)) * 31) + Boolean.hashCode(this.liteVersion)) * 31) + this.acctTestMode.hashCode());
    }

    public String toString()
    {
        String v0_0 = this.uid;
        String v1 = this.pid;
        String v2 = this.platform;
        int v3 = this.appBuild;
        boolean v4 = this.liteVersion;
        String v5 = this.acctTestMode;
        StringBuilder v6_1 = new StringBuilder();
        v6_1.append("RequestProjectDownloadRequest(uid=");
        v6_1.append(v0_0);
        v6_1.append(", pid=");
        v6_1.append(v1);
        v6_1.append(", platform=");
        v6_1.append(v2);
        v6_1.append(", appBuild=");
        v6_1.append(v3);
        v6_1.append(", liteVersion=");
        v6_1.append(v4);
        v6_1.append(", acctTestMode=");
        v6_1.append(v5);
        v6_1.append(")");
        return v6_1.toString();
    }
}
