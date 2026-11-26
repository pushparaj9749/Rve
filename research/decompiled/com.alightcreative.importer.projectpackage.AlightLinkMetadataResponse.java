package com.alightcreative.importer.projectpackage;
public final class AlightLinkMetadataResponse {
    public static final int $stable = 8;
    private final String download;
    private final String errorCode;
    private final String errorMessage;
    private final Long freeUserMaxDownloadSize;
    private final com.alightcreative.export.projectpackage.SharedProjectPackageInfo info;
    private final Boolean liteVersionAvailable;
    private final String message;
    private final String result;

    static AlightLinkMetadataResponse()
    {
        return;
    }

    public AlightLinkMetadataResponse(String p2, com.alightcreative.export.projectpackage.SharedProjectPackageInfo p3, String p4, Boolean p5, Long p6, String p7, String p8, String p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "result");
        this.result = p2;
        this.info = p3;
        this.download = p4;
        this.liteVersionAvailable = p5;
        this.freeUserMaxDownloadSize = p6;
        this.message = p7;
        this.errorCode = p8;
        this.errorMessage = p9;
        return;
    }

    public static synthetic com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse copy$default(com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse p0, String p1, com.alightcreative.export.projectpackage.SharedProjectPackageInfo p2, String p3, Boolean p4, Long p5, String p6, String p7, String p8, int p9, Object p10)
    {
        if ((p9 & 1) != 0) {
            p1 = p0.result;
        }
        if ((p9 & 2) != 0) {
            p2 = p0.info;
        }
        if ((p9 & 4) != 0) {
            p3 = p0.download;
        }
        if ((p9 & 8) != 0) {
            p4 = p0.liteVersionAvailable;
        }
        if ((p9 & 16) != 0) {
            p5 = p0.freeUserMaxDownloadSize;
        }
        if ((p9 & 32) != 0) {
            p6 = p0.message;
        }
        if ((p9 & 64) != 0) {
            p7 = p0.errorCode;
        }
        if ((p9 & 128) != 0) {
            p8 = p0.errorMessage;
        }
        return p0.copy(p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final String component1()
    {
        return this.result;
    }

    public final com.alightcreative.export.projectpackage.SharedProjectPackageInfo component2()
    {
        return this.info;
    }

    public final String component3()
    {
        return this.download;
    }

    public final Boolean component4()
    {
        return this.liteVersionAvailable;
    }

    public final Long component5()
    {
        return this.freeUserMaxDownloadSize;
    }

    public final String component6()
    {
        return this.message;
    }

    public final String component7()
    {
        return this.errorCode;
    }

    public final String component8()
    {
        return this.errorMessage;
    }

    public final com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse copy(String p11, com.alightcreative.export.projectpackage.SharedProjectPackageInfo p12, String p13, Boolean p14, Long p15, String p16, String p17, String p18)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "result");
        return new com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse(p11, p12, p13, p14, p15, p16, p17, p18);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse) p5).result)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.info, ((com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse) p5).info)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.download, ((com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse) p5).download)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.liteVersionAvailable, ((com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse) p5).liteVersionAvailable)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.freeUserMaxDownloadSize, ((com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse) p5).freeUserMaxDownloadSize)) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse) p5).message)) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, ((com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse) p5).errorCode)) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.alightcreative.importer.projectpackage.AlightLinkMetadataResponse) p5).errorMessage)) {
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
            return 1;
        }
    }

    public final String getDownload()
    {
        return this.download;
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

    public final com.alightcreative.export.projectpackage.SharedProjectPackageInfo getInfo()
    {
        return this.info;
    }

    public final Boolean getLiteVersionAvailable()
    {
        return this.liteVersionAvailable;
    }

    public final String getMessage()
    {
        return this.message;
    }

    public final String getResult()
    {
        return this.result;
    }

    public int hashCode()
    {
        String v1_12;
        int v0_8 = (this.result.hashCode() * 31);
        String v1_8 = this.info;
        int v2 = 0;
        if (v1_8 != null) {
            v1_12 = v1_8.hashCode();
        } else {
            v1_12 = 0;
        }
        String v1_1;
        int v0_2 = ((v0_8 + v1_12) * 31);
        String v1_0 = this.download;
        if (v1_0 != null) {
            v1_1 = v1_0.hashCode();
        } else {
            v1_1 = 0;
        }
        String v1_3;
        int v0_4 = ((v0_2 + v1_1) * 31);
        String v1_2 = this.liteVersionAvailable;
        if (v1_2 != null) {
            v1_3 = v1_2.hashCode();
        } else {
            v1_3 = 0;
        }
        String v1_5;
        int v0_7 = ((v0_4 + v1_3) * 31);
        String v1_4 = this.freeUserMaxDownloadSize;
        if (v1_4 != null) {
            v1_5 = v1_4.hashCode();
        } else {
            v1_5 = 0;
        }
        String v1_7;
        int v0_10 = ((v0_7 + v1_5) * 31);
        String v1_6 = this.message;
        if (v1_6 != null) {
            v1_7 = v1_6.hashCode();
        } else {
            v1_7 = 0;
        }
        String v1_10;
        int v0_12 = ((v0_10 + v1_7) * 31);
        String v1_9 = this.errorCode;
        if (v1_9 != null) {
            v1_10 = v1_9.hashCode();
        } else {
            v1_10 = 0;
        }
        int v0_14 = ((v0_12 + v1_10) * 31);
        String v1_11 = this.errorMessage;
        if (v1_11 != null) {
            v2 = v1_11.hashCode();
        }
        return (v0_14 + v2);
    }

    public String toString()
    {
        String v0_0 = this.result;
        com.alightcreative.export.projectpackage.SharedProjectPackageInfo v1 = this.info;
        String v2 = this.download;
        Boolean v3 = this.liteVersionAvailable;
        Long v4 = this.freeUserMaxDownloadSize;
        String v5 = this.message;
        String v6 = this.errorCode;
        String v7 = this.errorMessage;
        StringBuilder v8_1 = new StringBuilder();
        v8_1.append("AlightLinkMetadataResponse(result=");
        v8_1.append(v0_0);
        v8_1.append(", info=");
        v8_1.append(v1);
        v8_1.append(", download=");
        v8_1.append(v2);
        v8_1.append(", liteVersionAvailable=");
        v8_1.append(v3);
        v8_1.append(", freeUserMaxDownloadSize=");
        v8_1.append(v4);
        v8_1.append(", message=");
        v8_1.append(v5);
        v8_1.append(", errorCode=");
        v8_1.append(v6);
        v8_1.append(", errorMessage=");
        v8_1.append(v7);
        v8_1.append(")");
        return v8_1.toString();
    }
}
