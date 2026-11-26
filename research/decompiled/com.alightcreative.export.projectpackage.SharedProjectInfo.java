package com.alightcreative.export.projectpackage;
public final class SharedProjectInfo {
    public static final int $stable;
    private final long size;
    private final String title;
    private final String type;

    static SharedProjectInfo()
    {
        return;
    }

    public SharedProjectInfo(String p2, long p3, String p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "type");
        this.title = p2;
        this.size = p3;
        this.type = p5;
        return;
    }

    public static synthetic com.alightcreative.export.projectpackage.SharedProjectInfo copy$default(com.alightcreative.export.projectpackage.SharedProjectInfo p0, String p1, long p2, String p4, int p5, Object p6)
    {
        if ((p5 & 1) != 0) {
            p1 = p0.title;
        }
        if ((p5 & 2) != 0) {
            p2 = p0.size;
        }
        if ((p5 & 4) != 0) {
            p4 = p0.type;
        }
        return p0.copy(p1, p2, p4);
    }

    public final String component1()
    {
        return this.title;
    }

    public final long component2()
    {
        return this.size;
    }

    public final String component3()
    {
        return this.type;
    }

    public final com.alightcreative.export.projectpackage.SharedProjectInfo copy(String p2, long p3, String p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "type");
        return new com.alightcreative.export.projectpackage.SharedProjectInfo(p2, p3, p5);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.alightcreative.export.projectpackage.SharedProjectInfo)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.title, ((com.alightcreative.export.projectpackage.SharedProjectInfo) p8).title)) {
                    if (this.size == ((com.alightcreative.export.projectpackage.SharedProjectInfo) p8).size) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.type, ((com.alightcreative.export.projectpackage.SharedProjectInfo) p8).type)) {
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

    public final long getSize()
    {
        return this.size;
    }

    public final String getTitle()
    {
        return this.title;
    }

    public final String getType()
    {
        return this.type;
    }

    public int hashCode()
    {
        return ((((this.title.hashCode() * 31) + Long.hashCode(this.size)) * 31) + this.type.hashCode());
    }

    public String toString()
    {
        String v0_0 = this.title;
        long v1 = this.size;
        String v3 = this.type;
        StringBuilder v4_1 = new StringBuilder();
        v4_1.append("SharedProjectInfo(title=");
        v4_1.append(v0_0);
        v4_1.append(", size=");
        v4_1.append(v1);
        v4_1.append(", type=");
        v4_1.append(v3);
        v4_1.append(")");
        return v4_1.toString();
    }
}
