package com.alightcreative.importer.projectpackage;
public final class RequestProjectDownloadResponse {
    public static final int $stable;
    private final String downloadUri;
    private final String result;

    static RequestProjectDownloadResponse()
    {
        return;
    }

    public RequestProjectDownloadResponse(String p2, String p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "result");
        this.result = p2;
        this.downloadUri = p3;
        return;
    }

    public static synthetic com.alightcreative.importer.projectpackage.RequestProjectDownloadResponse copy$default(com.alightcreative.importer.projectpackage.RequestProjectDownloadResponse p0, String p1, String p2, int p3, Object p4)
    {
        if ((p3 & 1) != 0) {
            p1 = p0.result;
        }
        if ((p3 & 2) != 0) {
            p2 = p0.downloadUri;
        }
        return p0.copy(p1, p2);
    }

    public final String component1()
    {
        return this.result;
    }

    public final String component2()
    {
        return this.downloadUri;
    }

    public final com.alightcreative.importer.projectpackage.RequestProjectDownloadResponse copy(String p2, String p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "result");
        return new com.alightcreative.importer.projectpackage.RequestProjectDownloadResponse(p2, p3);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.importer.projectpackage.RequestProjectDownloadResponse)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.result, ((com.alightcreative.importer.projectpackage.RequestProjectDownloadResponse) p5).result)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.downloadUri, ((com.alightcreative.importer.projectpackage.RequestProjectDownloadResponse) p5).downloadUri)) {
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

    public final String getDownloadUri()
    {
        return this.downloadUri;
    }

    public final String getResult()
    {
        return this.result;
    }

    public int hashCode()
    {
        int v1_1;
        int v0_2 = (this.result.hashCode() * 31);
        int v1_0 = this.downloadUri;
        if (v1_0 != 0) {
            v1_1 = v1_0.hashCode();
        } else {
            v1_1 = 0;
        }
        return (v0_2 + v1_1);
    }

    public String toString()
    {
        String v0_0 = this.result;
        String v1 = this.downloadUri;
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("RequestProjectDownloadResponse(result=");
        v2_1.append(v0_0);
        v2_1.append(", downloadUri=");
        v2_1.append(v1);
        v2_1.append(")");
        return v2_1.toString();
    }
}
