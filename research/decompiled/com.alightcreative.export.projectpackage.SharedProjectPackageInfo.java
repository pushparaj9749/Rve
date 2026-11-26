package com.alightcreative.export.projectpackage;
public final class SharedProjectPackageInfo {
    public static final int $stable = 8;
    private final String amPackageId;
    private final String amPackageVersion;
    private final String amPlatform;
    private final int amVersionCode;
    private final String amVersionString;
    private final String largeThumbUrl;
    private final Integer maxFFVer;
    private final String medThumbUrl;
    private final java.util.List projects;
    private final java.util.List requiredEffects;
    private final com.google.firebase.Timestamp shareDate;
    private final String shortLink;
    private final long size;
    private final String smallThumbUrl;
    private final String tinyThumbUrl;
    private final String title;
    private final String unavailableNotice;

    static SharedProjectPackageInfo()
    {
        return;
    }

    public SharedProjectPackageInfo(int p3, String p4, String p5, String p6, java.util.List p7, Integer p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, com.google.firebase.Timestamp p16, long p17, String p19, java.util.List p20)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "amVersionString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "amPackageVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p20, "projects");
        this.amVersionCode = p3;
        this.amVersionString = p4;
        this.amPackageVersion = p5;
        this.amPlatform = p6;
        this.requiredEffects = p7;
        this.maxFFVer = p8;
        this.title = p9;
        this.largeThumbUrl = p10;
        this.medThumbUrl = p11;
        this.smallThumbUrl = p12;
        this.tinyThumbUrl = p13;
        this.amPackageId = p14;
        this.shortLink = p15;
        this.shareDate = p16;
        this.size = p17;
        this.unavailableNotice = p19;
        this.projects = p20;
        return;
    }

    public static synthetic com.alightcreative.export.projectpackage.SharedProjectPackageInfo copy$default(com.alightcreative.export.projectpackage.SharedProjectPackageInfo p17, int p18, String p19, String p20, String p21, java.util.List p22, Integer p23, String p24, String p25, String p26, String p27, String p28, String p29, String p30, com.google.firebase.Timestamp p31, long p32, String p34, java.util.List p35, int p36, Object p37)
    {
        java.util.List v2_1;
        if ((p36 & 1) == 0) {
            v2_1 = p18;
        } else {
            v2_1 = p17.amVersionCode;
        }
        String v3_1;
        if ((p36 & 2) == 0) {
            v3_1 = p19;
        } else {
            v3_1 = p17.amVersionString;
        }
        String v4_1;
        if ((p36 & 4) == 0) {
            v4_1 = p20;
        } else {
            v4_1 = p17.amPackageVersion;
        }
        String v5_1;
        if ((p36 & 8) == 0) {
            v5_1 = p21;
        } else {
            v5_1 = p17.amPlatform;
        }
        java.util.List v6_1;
        if ((p36 & 16) == 0) {
            v6_1 = p22;
        } else {
            v6_1 = p17.requiredEffects;
        }
        Integer v7_1;
        if ((p36 & 32) == 0) {
            v7_1 = p23;
        } else {
            v7_1 = p17.maxFFVer;
        }
        String v8_1;
        if ((p36 & 64) == 0) {
            v8_1 = p24;
        } else {
            v8_1 = p17.title;
        }
        String v9_1;
        if ((p36 & 128) == 0) {
            v9_1 = p25;
        } else {
            v9_1 = p17.largeThumbUrl;
        }
        String v10_1;
        if ((p36 & 256) == 0) {
            v10_1 = p26;
        } else {
            v10_1 = p17.medThumbUrl;
        }
        String v11_1;
        if ((p36 & 512) == 0) {
            v11_1 = p27;
        } else {
            v11_1 = p17.smallThumbUrl;
        }
        String v12_1;
        if ((p36 & 1024) == 0) {
            v12_1 = p28;
        } else {
            v12_1 = p17.tinyThumbUrl;
        }
        String v13_1;
        if ((p36 & 2048) == 0) {
            v13_1 = p29;
        } else {
            v13_1 = p17.amPackageId;
        }
        String v14_1;
        if ((p36 & 4096) == 0) {
            v14_1 = p30;
        } else {
            v14_1 = p17.shortLink;
        }
        com.google.firebase.Timestamp v15_1;
        if ((p36 & 8192) == 0) {
            v15_1 = p31;
        } else {
            v15_1 = p17.shareDate;
        }
        String v1_1;
        if ((p36 & 16384) == 0) {
            v1_1 = p32;
        } else {
            v1_1 = p17.size;
        }
        String v1_2;
        if ((p36 & 32768) == 0) {
            v1_2 = p34;
        } else {
            v1_2 = p17.unavailableNotice;
        }
        java.util.List v36_1;
        if ((p36 & 65536) == 0) {
            v36_1 = p35;
        } else {
            v36_1 = p17.projects;
        }
        return p17.copy(v2_1, v3_1, v4_1, v5_1, v6_1, v7_1, v8_1, v9_1, v10_1, v11_1, v12_1, v13_1, v14_1, v15_1, v1_1, v1_2, v36_1);
    }

    public final int component1()
    {
        return this.amVersionCode;
    }

    public final String component10()
    {
        return this.smallThumbUrl;
    }

    public final String component11()
    {
        return this.tinyThumbUrl;
    }

    public final String component12()
    {
        return this.amPackageId;
    }

    public final String component13()
    {
        return this.shortLink;
    }

    public final com.google.firebase.Timestamp component14()
    {
        return this.shareDate;
    }

    public final long component15()
    {
        return this.size;
    }

    public final String component16()
    {
        return this.unavailableNotice;
    }

    public final java.util.List component17()
    {
        return this.projects;
    }

    public final String component2()
    {
        return this.amVersionString;
    }

    public final String component3()
    {
        return this.amPackageVersion;
    }

    public final String component4()
    {
        return this.amPlatform;
    }

    public final java.util.List component5()
    {
        return this.requiredEffects;
    }

    public final Integer component6()
    {
        return this.maxFFVer;
    }

    public final String component7()
    {
        return this.title;
    }

    public final String component8()
    {
        return this.largeThumbUrl;
    }

    public final String component9()
    {
        return this.medThumbUrl;
    }

    public final com.alightcreative.export.projectpackage.SharedProjectPackageInfo copy(int p21, String p22, String p23, String p24, java.util.List p25, Integer p26, String p27, String p28, String p29, String p30, String p31, String p32, String p33, com.google.firebase.Timestamp p34, long p35, String p37, java.util.List p38)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p22, "amVersionString");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p23, "amPackageVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p38, "projects");
        return new com.alightcreative.export.projectpackage.SharedProjectPackageInfo(p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p37, p38);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.alightcreative.export.projectpackage.SharedProjectPackageInfo)) {
                if (this.amVersionCode == ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).amVersionCode) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.amVersionString, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).amVersionString)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.amPackageVersion, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).amPackageVersion)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.amPlatform, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).amPlatform)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.requiredEffects, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).requiredEffects)) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.maxFFVer, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).maxFFVer)) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.title, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).title)) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.largeThumbUrl, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).largeThumbUrl)) {
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.medThumbUrl, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).medThumbUrl)) {
                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.smallThumbUrl, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).smallThumbUrl)) {
                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.tinyThumbUrl, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).tinyThumbUrl)) {
                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.amPackageId, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).amPackageId)) {
                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.shortLink, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).shortLink)) {
                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.shareDate, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).shareDate)) {
                                                                        if (this.size == ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).size) {
                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.unavailableNotice, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).unavailableNotice)) {
                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.projects, ((com.alightcreative.export.projectpackage.SharedProjectPackageInfo) p8).projects)) {
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

    public final String getAmPackageId()
    {
        return this.amPackageId;
    }

    public final String getAmPackageVersion()
    {
        return this.amPackageVersion;
    }

    public final String getAmPlatform()
    {
        return this.amPlatform;
    }

    public final int getAmVersionCode()
    {
        return this.amVersionCode;
    }

    public final String getAmVersionString()
    {
        return this.amVersionString;
    }

    public final String getLargeThumbUrl()
    {
        return this.largeThumbUrl;
    }

    public final Integer getMaxFFVer()
    {
        return this.maxFFVer;
    }

    public final String getMedThumbUrl()
    {
        return this.medThumbUrl;
    }

    public final java.util.List getProjects()
    {
        return this.projects;
    }

    public final java.util.List getRequiredEffects()
    {
        return this.requiredEffects;
    }

    public final com.google.firebase.Timestamp getShareDate()
    {
        return this.shareDate;
    }

    public final String getShortLink()
    {
        return this.shortLink;
    }

    public final long getSize()
    {
        return this.size;
    }

    public final String getSmallThumbUrl()
    {
        return this.smallThumbUrl;
    }

    public final String getTinyThumbUrl()
    {
        return this.tinyThumbUrl;
    }

    public final String getTitle()
    {
        return this.title;
    }

    public final String getUnavailableNotice()
    {
        return this.unavailableNotice;
    }

    public int hashCode()
    {
        int v1_4;
        int v0_5 = (((((Integer.hashCode(this.amVersionCode) * 31) + this.amVersionString.hashCode()) * 31) + this.amPackageVersion.hashCode()) * 31);
        int v1_3 = this.amPlatform;
        int v2 = 0;
        if (v1_3 != 0) {
            v1_4 = v1_3.hashCode();
        } else {
            v1_4 = 0;
        }
        int v1_6;
        int v0_8 = ((v0_5 + v1_4) * 31);
        int v1_5 = this.requiredEffects;
        if (v1_5 != 0) {
            v1_6 = v1_5.hashCode();
        } else {
            v1_6 = 0;
        }
        int v1_8;
        int v0_10 = ((v0_8 + v1_6) * 31);
        int v1_7 = this.maxFFVer;
        if (v1_7 != 0) {
            v1_8 = v1_7.hashCode();
        } else {
            v1_8 = 0;
        }
        int v1_10;
        int v0_13 = ((v0_10 + v1_8) * 31);
        int v1_9 = this.title;
        if (v1_9 != 0) {
            v1_10 = v1_9.hashCode();
        } else {
            v1_10 = 0;
        }
        int v1_13;
        int v0_15 = ((v0_13 + v1_10) * 31);
        int v1_12 = this.largeThumbUrl;
        if (v1_12 != 0) {
            v1_13 = v1_12.hashCode();
        } else {
            v1_13 = 0;
        }
        int v1_15;
        int v0_17 = ((v0_15 + v1_13) * 31);
        int v1_14 = this.medThumbUrl;
        if (v1_14 != 0) {
            v1_15 = v1_14.hashCode();
        } else {
            v1_15 = 0;
        }
        int v1_18;
        int v0_19 = ((v0_17 + v1_15) * 31);
        int v1_16 = this.smallThumbUrl;
        if (v1_16 != 0) {
            v1_18 = v1_16.hashCode();
        } else {
            v1_18 = 0;
        }
        int v1_20;
        int v0_21 = ((v0_19 + v1_18) * 31);
        int v1_19 = this.tinyThumbUrl;
        if (v1_19 != 0) {
            v1_20 = v1_19.hashCode();
        } else {
            v1_20 = 0;
        }
        int v1_22;
        int v0_24 = ((v0_21 + v1_20) * 31);
        int v1_21 = this.amPackageId;
        if (v1_21 != 0) {
            v1_22 = v1_21.hashCode();
        } else {
            v1_22 = 0;
        }
        int v1_24;
        int v0_26 = ((v0_24 + v1_22) * 31);
        int v1_23 = this.shortLink;
        if (v1_23 != 0) {
            v1_24 = v1_23.hashCode();
        } else {
            v1_24 = 0;
        }
        int v1_26;
        int v0_29 = ((v0_26 + v1_24) * 31);
        int v1_25 = this.shareDate;
        if (v1_25 != 0) {
            v1_26 = v1_25.hashCode();
        } else {
            v1_26 = 0;
        }
        int v0_33 = ((((v0_29 + v1_26) * 31) + Long.hashCode(this.size)) * 31);
        int v1_29 = this.unavailableNotice;
        if (v1_29 != 0) {
            v2 = v1_29.hashCode();
        }
        return (((v0_33 + v2) * 31) + this.projects.hashCode());
    }

    public String toString()
    {
        String v1_0 = this.amVersionCode;
        String v2 = this.amVersionString;
        String v3 = this.amPackageVersion;
        String v4 = this.amPlatform;
        java.util.List v5 = this.requiredEffects;
        Integer v6 = this.maxFFVer;
        String v7 = this.title;
        String v8 = this.largeThumbUrl;
        String v9 = this.medThumbUrl;
        String v10 = this.smallThumbUrl;
        String v11 = this.tinyThumbUrl;
        String v12 = this.amPackageId;
        String v13 = this.shortLink;
        com.google.firebase.Timestamp v16 = this.shareDate;
        long v17 = this.size;
        String v14_2 = this.unavailableNotice;
        String v15_0 = this.projects;
        String v0_2 = new StringBuilder();
        java.util.List v19 = v15_0;
        v0_2.append("SharedProjectPackageInfo(amVersionCode=");
        v0_2.append(v1_0);
        v0_2.append(", amVersionString=");
        v0_2.append(v2);
        v0_2.append(", amPackageVersion=");
        v0_2.append(v3);
        v0_2.append(", amPlatform=");
        v0_2.append(v4);
        v0_2.append(", requiredEffects=");
        v0_2.append(v5);
        v0_2.append(", maxFFVer=");
        v0_2.append(v6);
        v0_2.append(", title=");
        v0_2.append(v7);
        v0_2.append(", largeThumbUrl=");
        v0_2.append(v8);
        v0_2.append(", medThumbUrl=");
        v0_2.append(v9);
        v0_2.append(", smallThumbUrl=");
        v0_2.append(v10);
        v0_2.append(", tinyThumbUrl=");
        v0_2.append(v11);
        v0_2.append(", amPackageId=");
        v0_2.append(v12);
        v0_2.append(", shortLink=");
        v0_2.append(v13);
        v0_2.append(", shareDate=");
        v0_2.append(v16);
        v0_2.append(", size=");
        v0_2.append(v17);
        v0_2.append(", unavailableNotice=");
        v0_2.append(v14_2);
        v0_2.append(", projects=");
        v0_2.append(v19);
        v0_2.append(")");
        return v0_2.toString();
    }
}
