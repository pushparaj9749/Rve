package com.alightcreative.app.motion.feed;
public final class FeedContentRequest {
    public static final int $stable = 8;
    private final java.util.List abTestTags;
    private final String appPackage;
    private final int appday;
    private final java.util.List benefits;
    private final String cachedFeedHash;
    private final String debugMode;
    private final String deviceCategory;
    private final String deviceModel;
    private final String deviceProduct;
    private final int elementCount;
    private final int exportCount;
    private final long installDate;
    private final String language;
    private final String osver;
    private final String platform;
    private final int projectCount;
    private final String sig;
    private final int versionCode;
    private final String versionName;

    static FeedContentRequest()
    {
        return;
    }

    public FeedContentRequest(String p11, String p12, String p13, int p14, String p15, String p16, String p17, String p18, String p19, int p20, java.util.List p21, String p22, String p23, int p24, int p25, int p26, long p27, java.util.List p29, String p30)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "platform");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "appPackage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "versionName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "deviceProduct");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "deviceModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "deviceCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "language");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "osver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p21, "benefits");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p23, "debugMode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p29, "abTestTags");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p30, "cachedFeedHash");
        this.platform = p11;
        this.appPackage = p12;
        this.versionName = p13;
        this.versionCode = p14;
        this.deviceProduct = p15;
        this.deviceModel = p16;
        this.deviceCategory = p17;
        this.language = p18;
        this.osver = p19;
        this.appday = p20;
        this.benefits = p21;
        this.sig = p22;
        this.debugMode = p23;
        this.projectCount = p24;
        this.elementCount = p25;
        this.exportCount = p26;
        this.installDate = p27;
        this.abTestTags = p29;
        this.cachedFeedHash = p30;
        return;
    }

    public static synthetic com.alightcreative.app.motion.feed.FeedContentRequest copy$default(com.alightcreative.app.motion.feed.FeedContentRequest p17, String p18, String p19, String p20, int p21, String p22, String p23, String p24, String p25, String p26, int p27, java.util.List p28, String p29, String p30, int p31, int p32, int p33, long p34, java.util.List p36, String p37, int p38, Object p39)
    {
        String v2_1;
        if ((p38 & 1) == 0) {
            v2_1 = p18;
        } else {
            v2_1 = p17.platform;
        }
        String v3_1;
        if ((p38 & 2) == 0) {
            v3_1 = p19;
        } else {
            v3_1 = p17.appPackage;
        }
        String v4_1;
        if ((p38 & 4) == 0) {
            v4_1 = p20;
        } else {
            v4_1 = p17.versionName;
        }
        int v5_1;
        if ((p38 & 8) == 0) {
            v5_1 = p21;
        } else {
            v5_1 = p17.versionCode;
        }
        String v6_1;
        if ((p38 & 16) == 0) {
            v6_1 = p22;
        } else {
            v6_1 = p17.deviceProduct;
        }
        String v7_1;
        if ((p38 & 32) == 0) {
            v7_1 = p23;
        } else {
            v7_1 = p17.deviceModel;
        }
        String v8_1;
        if ((p38 & 64) == 0) {
            v8_1 = p24;
        } else {
            v8_1 = p17.deviceCategory;
        }
        String v9_1;
        if ((p38 & 128) == 0) {
            v9_1 = p25;
        } else {
            v9_1 = p17.language;
        }
        String v10_1;
        if ((p38 & 256) == 0) {
            v10_1 = p26;
        } else {
            v10_1 = p17.osver;
        }
        int v11_1;
        if ((p38 & 512) == 0) {
            v11_1 = p27;
        } else {
            v11_1 = p17.appday;
        }
        java.util.List v12_1;
        if ((p38 & 1024) == 0) {
            v12_1 = p28;
        } else {
            v12_1 = p17.benefits;
        }
        String v13_1;
        if ((p38 & 2048) == 0) {
            v13_1 = p29;
        } else {
            v13_1 = p17.sig;
        }
        String v14_1;
        if ((p38 & 4096) == 0) {
            v14_1 = p30;
        } else {
            v14_1 = p17.debugMode;
        }
        int v15_1;
        if ((p38 & 8192) == 0) {
            v15_1 = p31;
        } else {
            v15_1 = p17.projectCount;
        }
        String v2_3;
        if ((p38 & 16384) == 0) {
            v2_3 = p32;
        } else {
            v2_3 = p17.elementCount;
        }
        java.util.List v1_1;
        if ((p38 & 32768) == 0) {
            v1_1 = p33;
        } else {
            v1_1 = p17.exportCount;
        }
        java.util.List v1_2;
        if ((p38 & 65536) == 0) {
            v1_2 = p34;
        } else {
            v1_2 = p17.installDate;
        }
        java.util.List v1_3;
        if ((p38 & 131072) == 0) {
            v1_3 = p36;
        } else {
            v1_3 = p17.abTestTags;
        }
        String v38_1;
        if ((p38 & 262144) == 0) {
            v38_1 = p37;
        } else {
            v38_1 = p17.cachedFeedHash;
        }
        return p17.copy(v2_1, v3_1, v4_1, v5_1, v6_1, v7_1, v8_1, v9_1, v10_1, v11_1, v12_1, v13_1, v14_1, v15_1, v2_3, v1_1, v1_2, v1_3, v38_1);
    }

    public final String component1()
    {
        return this.platform;
    }

    public final int component10()
    {
        return this.appday;
    }

    public final java.util.List component11()
    {
        return this.benefits;
    }

    public final String component12()
    {
        return this.sig;
    }

    public final String component13()
    {
        return this.debugMode;
    }

    public final int component14()
    {
        return this.projectCount;
    }

    public final int component15()
    {
        return this.elementCount;
    }

    public final int component16()
    {
        return this.exportCount;
    }

    public final long component17()
    {
        return this.installDate;
    }

    public final java.util.List component18()
    {
        return this.abTestTags;
    }

    public final String component19()
    {
        return this.cachedFeedHash;
    }

    public final String component2()
    {
        return this.appPackage;
    }

    public final String component3()
    {
        return this.versionName;
    }

    public final int component4()
    {
        return this.versionCode;
    }

    public final String component5()
    {
        return this.deviceProduct;
    }

    public final String component6()
    {
        return this.deviceModel;
    }

    public final String component7()
    {
        return this.deviceCategory;
    }

    public final String component8()
    {
        return this.language;
    }

    public final String component9()
    {
        return this.osver;
    }

    public final com.alightcreative.app.motion.feed.FeedContentRequest copy(String p23, String p24, String p25, int p26, String p27, String p28, String p29, String p30, String p31, int p32, java.util.List p33, String p34, String p35, int p36, int p37, int p38, long p39, java.util.List p41, String p42)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p23, "platform");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p24, "appPackage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p25, "versionName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p27, "deviceProduct");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p28, "deviceModel");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p29, "deviceCategory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p30, "language");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p31, "osver");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p33, "benefits");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p35, "debugMode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p41, "abTestTags");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p42, "cachedFeedHash");
        return new com.alightcreative.app.motion.feed.FeedContentRequest(p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p41, p42);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.alightcreative.app.motion.feed.FeedContentRequest)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.platform, ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).platform)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.appPackage, ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).appPackage)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.versionName, ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).versionName)) {
                            if (this.versionCode == ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).versionCode) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.deviceProduct, ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).deviceProduct)) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.deviceModel, ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).deviceModel)) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.deviceCategory, ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).deviceCategory)) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.language, ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).language)) {
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.osver, ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).osver)) {
                                                    if (this.appday == ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).appday) {
                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.benefits, ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).benefits)) {
                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.sig, ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).sig)) {
                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.debugMode, ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).debugMode)) {
                                                                    if (this.projectCount == ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).projectCount) {
                                                                        if (this.elementCount == ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).elementCount) {
                                                                            if (this.exportCount == ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).exportCount) {
                                                                                if (this.installDate == ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).installDate) {
                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.abTestTags, ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).abTestTags)) {
                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.cachedFeedHash, ((com.alightcreative.app.motion.feed.FeedContentRequest) p8).cachedFeedHash)) {
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
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final java.util.List getAbTestTags()
    {
        return this.abTestTags;
    }

    public final String getAppPackage()
    {
        return this.appPackage;
    }

    public final int getAppday()
    {
        return this.appday;
    }

    public final java.util.List getBenefits()
    {
        return this.benefits;
    }

    public final String getCachedFeedHash()
    {
        return this.cachedFeedHash;
    }

    public final String getDebugMode()
    {
        return this.debugMode;
    }

    public final String getDeviceCategory()
    {
        return this.deviceCategory;
    }

    public final String getDeviceModel()
    {
        return this.deviceModel;
    }

    public final String getDeviceProduct()
    {
        return this.deviceProduct;
    }

    public final int getElementCount()
    {
        return this.elementCount;
    }

    public final int getExportCount()
    {
        return this.exportCount;
    }

    public final long getInstallDate()
    {
        return this.installDate;
    }

    public final String getLanguage()
    {
        return this.language;
    }

    public final String getOsver()
    {
        return this.osver;
    }

    public final String getPlatform()
    {
        return this.platform;
    }

    public final int getProjectCount()
    {
        return this.projectCount;
    }

    public final String getSig()
    {
        return this.sig;
    }

    public final int getVersionCode()
    {
        return this.versionCode;
    }

    public final String getVersionName()
    {
        return this.versionName;
    }

    public int hashCode()
    {
        int v1_19;
        int v0_20 = (((((((((((((((((((((this.platform.hashCode() * 31) + this.appPackage.hashCode()) * 31) + this.versionName.hashCode()) * 31) + Integer.hashCode(this.versionCode)) * 31) + this.deviceProduct.hashCode()) * 31) + this.deviceModel.hashCode()) * 31) + this.deviceCategory.hashCode()) * 31) + this.language.hashCode()) * 31) + this.osver.hashCode()) * 31) + Integer.hashCode(this.appday)) * 31) + this.benefits.hashCode()) * 31);
        int v1_18 = this.sig;
        if (v1_18 != 0) {
            v1_19 = v1_18.hashCode();
        } else {
            v1_19 = 0;
        }
        return (((((((((((((((v0_20 + v1_19) * 31) + this.debugMode.hashCode()) * 31) + Integer.hashCode(this.projectCount)) * 31) + Integer.hashCode(this.elementCount)) * 31) + Integer.hashCode(this.exportCount)) * 31) + Long.hashCode(this.installDate)) * 31) + this.abTestTags.hashCode()) * 31) + this.cachedFeedHash.hashCode());
    }

    public String toString()
    {
        String v1_0 = this.platform;
        String v2 = this.appPackage;
        String v3 = this.versionName;
        int v4 = this.versionCode;
        String v5 = this.deviceProduct;
        String v6 = this.deviceModel;
        String v7 = this.deviceCategory;
        String v8 = this.language;
        String v9 = this.osver;
        int v10 = this.appday;
        java.util.List v11 = this.benefits;
        String v12 = this.sig;
        String v13 = this.debugMode;
        int v16 = this.elementCount;
        int v17 = this.projectCount;
        int v18 = this.exportCount;
        long v19 = this.installDate;
        java.util.List v14_2 = this.abTestTags;
        String v15_2 = this.cachedFeedHash;
        String v0_2 = new StringBuilder();
        String v21 = v15_2;
        v0_2.append("FeedContentRequest(platform=");
        v0_2.append(v1_0);
        v0_2.append(", appPackage=");
        v0_2.append(v2);
        v0_2.append(", versionName=");
        v0_2.append(v3);
        v0_2.append(", versionCode=");
        v0_2.append(v4);
        v0_2.append(", deviceProduct=");
        v0_2.append(v5);
        v0_2.append(", deviceModel=");
        v0_2.append(v6);
        v0_2.append(", deviceCategory=");
        v0_2.append(v7);
        v0_2.append(", language=");
        v0_2.append(v8);
        v0_2.append(", osver=");
        v0_2.append(v9);
        v0_2.append(", appday=");
        v0_2.append(v10);
        v0_2.append(", benefits=");
        v0_2.append(v11);
        v0_2.append(", sig=");
        v0_2.append(v12);
        v0_2.append(", debugMode=");
        v0_2.append(v13);
        v0_2.append(", projectCount=");
        v0_2.append(v17);
        v0_2.append(", elementCount=");
        v0_2.append(v16);
        v0_2.append(", exportCount=");
        v0_2.append(v18);
        v0_2.append(", installDate=");
        v0_2.append(v19);
        v0_2.append(", abTestTags=");
        v0_2.append(v14_2);
        v0_2.append(", cachedFeedHash=");
        v0_2.append(v21);
        v0_2.append(")");
        return v0_2.toString();
    }
}
