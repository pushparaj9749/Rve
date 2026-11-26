package com.alightcreative.importer.projectpackage;
public final class AlightLinkMetadataRequest {
    public static final int $stable;
    private final String acctTestMode;
    private final int appBuild;
    private final String pid;
    private final String platform;
    private final String uid;

    static AlightLinkMetadataRequest()
    {
        return;
    }

    public AlightLinkMetadataRequest(String p2, String p3, String p4, int p5, String p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "pid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "platform");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "acctTestMode");
        this.uid = p2;
        this.pid = p3;
        this.platform = p4;
        this.appBuild = p5;
        this.acctTestMode = p6;
        return;
    }

    public static synthetic com.alightcreative.importer.projectpackage.AlightLinkMetadataRequest copy$default(com.alightcreative.importer.projectpackage.AlightLinkMetadataRequest p0, String p1, String p2, String p3, int p4, String p5, int p6, Object p7)
    {
        if ((p6 & 1) != 0) {
            p1 = p0.uid;
        }
        if ((p6 & 2) != 0) {
            p2 = p0.pid;
        }
        if ((p6 & 4) != 0) {
            p3 = p0.platform;
        }
        if ((p6 & 8) != 0) {
            p4 = p0.appBuild;
        }
        if ((p6 & 16) != 0) {
            p5 = p0.acctTestMode;
        }
        return p0.copy(p1, p2, p3, p4, p5);
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

    public final String component5()
    {
        return this.acctTestMode;
    }

    public final com.alightcreative.importer.projectpackage.AlightLinkMetadataRequest copy(String p8, String p9, String p10, int p11, String p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "uid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "pid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "platform");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "acctTestMode");
        return new com.alightcreative.importer.projectpackage.AlightLinkMetadataRequest(p8, p9, p10, p11, p12);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.importer.projectpackage.AlightLinkMetadataRequest)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.uid, ((com.alightcreative.importer.projectpackage.AlightLinkMetadataRequest) p5).uid)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.pid, ((com.alightcreative.importer.projectpackage.AlightLinkMetadataRequest) p5).pid)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.platform, ((com.alightcreative.importer.projectpackage.AlightLinkMetadataRequest) p5).platform)) {
                            if (this.appBuild == ((com.alightcreative.importer.projectpackage.AlightLinkMetadataRequest) p5).appBuild) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.acctTestMode, ((com.alightcreative.importer.projectpackage.AlightLinkMetadataRequest) p5).acctTestMode)) {
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

    public final String getAcctTestMode()
    {
        return this.acctTestMode;
    }

    public final int getAppBuild()
    {
        return this.appBuild;
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
        return ((((((((this.uid.hashCode() * 31) + this.pid.hashCode()) * 31) + this.platform.hashCode()) * 31) + Integer.hashCode(this.appBuild)) * 31) + this.acctTestMode.hashCode());
    }

    public String toString()
    {
        String v0_0 = this.uid;
        String v1 = this.pid;
        String v2 = this.platform;
        int v3 = this.appBuild;
        String v4 = this.acctTestMode;
        StringBuilder v5_1 = new StringBuilder();
        v5_1.append("AlightLinkMetadataRequest(uid=");
        v5_1.append(v0_0);
        v5_1.append(", pid=");
        v5_1.append(v1);
        v5_1.append(", platform=");
        v5_1.append(v2);
        v5_1.append(", appBuild=");
        v5_1.append(v3);
        v5_1.append(", acctTestMode=");
        v5_1.append(v4);
        v5_1.append(")");
        return v5_1.toString();
    }
}
