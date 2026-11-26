package com.bendingspoons.oracle.models;
public final class Settings {
    private static final sn2.h[] $childSerializers = None;
    public static final int $stable = 0;
    public static final com.bendingspoons.oracle.models.Settings$A Companion = None;
    private static final int ONE_MONTH = 2592000;
    private static final int TEN_MINUTES = 600;
    private final String encryptionAlgorithm;
    private final String encryptionKeyId;
    private final String encryptionPublicKey;
    private final java.util.Map experiments;
    private final int firstSoftReviewTriggersFactorDivider;
    private final int hardReviewTriggersFactor;
    private final boolean isBaselineUser;
    private boolean isFreeUser;
    private final boolean isSpoonerDevice;
    private final int maxReviewRequestsPerVersion;
    private final int minRequiredBuildNumber;
    private final int minSuggestedBuildNumber;
    private final int minTimeAfterAcceptedReviewRequest;
    private final int minTimeBetweenReviewRequests;
    private final String privacyRequestEmail;
    private final String privacyRequestEmailCC;
    private final String privacyRequestUrlTemplate;
    private final String privacyUrl;
    private final String privacyVersion;
    private final int softReviewTriggersFactor;
    private final String tosEffectiveDate;
    private final String tosUpdateMessage;
    private final String tosUrl;
    private final String tosVersion;

    static Settings()
    {
        com.bendingspoons.oracle.models.Settings.Companion = new com.bendingspoons.oracle.models.Settings$A(0);
        com.bendingspoons.oracle.models.Settings.$stable = 8;
        yz.HLZ v2_1 = new yz.HLZ(yz.OuM.hUw, yz.n.hUw);
        sn2.h[] v3_1 = new sn2.h[24];
        v3_1[0] = 0;
        v3_1[1] = 0;
        v3_1[2] = 0;
        v3_1[3] = 0;
        v3_1[4] = 0;
        v3_1[5] = 0;
        v3_1[6] = 0;
        v3_1[7] = 0;
        v3_1[8] = v2_1;
        v3_1[9] = 0;
        v3_1[10] = 0;
        v3_1[11] = 0;
        v3_1[12] = 0;
        v3_1[13] = 0;
        v3_1[14] = 0;
        v3_1[15] = 0;
        v3_1[16] = 0;
        v3_1[17] = 0;
        v3_1[18] = 0;
        v3_1[19] = 0;
        v3_1[20] = 0;
        v3_1[21] = 0;
        v3_1[22] = 0;
        v3_1[23] = 0;
        com.bendingspoons.oracle.models.Settings.$childSerializers = v3_1;
        return;
    }

    public Settings()
    {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16777215, 0);
        return;
    }

    public synthetic Settings(int p3, String p4, String p5, String p6, String p7, String p8, String p9, boolean p10, boolean p11, java.util.Map p12, String p13, String p14, String p15, int p16, int p17, int p18, int p19, int p20, int p21, String p22, String p23, String p24, boolean p25, int p26, int p27, yz.E4F p28)
    {
        if ((p3 & 1) != 0) {
            this.tosUrl = p4;
        } else {
            this.tosUrl = "";
        }
        if ((p3 & 2) != 0) {
            this.privacyUrl = p5;
        } else {
            this.privacyUrl = "";
        }
        if ((p3 & 4) != 0) {
            this.tosVersion = p6;
        } else {
            this.tosVersion = "";
        }
        if ((p3 & 8) != 0) {
            this.privacyVersion = p7;
        } else {
            this.privacyVersion = "";
        }
        if ((p3 & 16) != 0) {
            this.tosEffectiveDate = p8;
        } else {
            this.tosEffectiveDate = "";
        }
        if ((p3 & 32) != 0) {
            this.tosUpdateMessage = p9;
        } else {
            this.tosUpdateMessage = 0;
        }
        if ((p3 & 64) != 0) {
            this.isFreeUser = p10;
        } else {
            this.isFreeUser = 0;
        }
        if ((p3 & 128) != 0) {
            this.isBaselineUser = p11;
        } else {
            this.isBaselineUser = 0;
        }
        if ((p3 & 256) != 0) {
            this.experiments = p12;
        } else {
            this.experiments = kotlin.collections.MapsKt.emptyMap();
        }
        if ((p3 & 512) != 0) {
            this.privacyRequestEmail = p13;
        } else {
            this.privacyRequestEmail = "";
        }
        if ((p3 & 1024) != 0) {
            this.privacyRequestEmailCC = p14;
        } else {
            this.privacyRequestEmailCC = "";
        }
        if ((p3 & 2048) != 0) {
            this.privacyRequestUrlTemplate = p15;
        } else {
            this.privacyRequestUrlTemplate = "";
        }
        int v4_24;
        if ((p3 & 4096) != 0) {
            v4_24 = p16;
        } else {
            v4_24 = 10;
        }
        this.softReviewTriggersFactor = v4_24;
        if ((p3 & 8192) != 0) {
            this.hardReviewTriggersFactor = p17;
        } else {
            this.hardReviewTriggersFactor = 1;
        }
        int v4_29;
        if ((p3 & 16384) != 0) {
            v4_29 = p18;
        } else {
            v4_29 = 5;
        }
        this.maxReviewRequestsPerVersion = v4_29;
        int v4_32;
        if ((32768 & p3) != 0) {
            v4_32 = p19;
        } else {
            v4_32 = 600;
        }
        this.minTimeBetweenReviewRequests = v4_32;
        if ((65536 & p3) != 0) {
            this.firstSoftReviewTriggersFactorDivider = p20;
        } else {
            this.firstSoftReviewTriggersFactorDivider = 1;
        }
        int v4_38;
        if ((131072 & p3) != 0) {
            v4_38 = p21;
        } else {
            v4_38 = 2592000;
        }
        this.minTimeAfterAcceptedReviewRequest = v4_38;
        if ((262144 & p3) != 0) {
            this.encryptionAlgorithm = p22;
        } else {
            this.encryptionAlgorithm = "";
        }
        if ((524288 & p3) != 0) {
            this.encryptionKeyId = p23;
        } else {
            this.encryptionKeyId = "";
        }
        if ((1048576 & p3) != 0) {
            this.encryptionPublicKey = p24;
        } else {
            this.encryptionPublicKey = "";
        }
        if ((2097152 & p3) != 0) {
            this.isSpoonerDevice = p25;
        } else {
            this.isSpoonerDevice = 0;
        }
        if ((4194304 & p3) != 0) {
            this.minRequiredBuildNumber = p26;
        } else {
            this.minRequiredBuildNumber = 0;
        }
        if ((p3 & 8388608) != 0) {
            this.minSuggestedBuildNumber = p27;
            return;
        } else {
            this.minSuggestedBuildNumber = 0;
            return;
        }
    }

    public Settings(String p10, String p11, String p12, String p13, String p14, String p15, boolean p16, boolean p17, java.util.Map p18, String p19, String p20, String p21, int p22, int p23, int p24, int p25, int p26, int p27, String p28, String p29, String p30, boolean p31, int p32, int p33)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "tosUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "privacyUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "tosVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "privacyVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "tosEffectiveDate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "experiments");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "privacyRequestEmail");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p20, "privacyRequestEmailCC");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p21, "privacyRequestUrlTemplate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p28, com.applovin.impl.sdk.utils.THau.LyBTwnHKFaQOu.oIvGOxp);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p29, "encryptionKeyId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p30, "encryptionPublicKey");
        this.tosUrl = p10;
        this.privacyUrl = p11;
        this.tosVersion = p12;
        this.privacyVersion = p13;
        this.tosEffectiveDate = p14;
        this.tosUpdateMessage = p15;
        this.isFreeUser = p16;
        this.isBaselineUser = p17;
        this.experiments = p18;
        this.privacyRequestEmail = p19;
        this.privacyRequestEmailCC = p20;
        this.privacyRequestUrlTemplate = p21;
        this.softReviewTriggersFactor = p22;
        this.hardReviewTriggersFactor = p23;
        this.maxReviewRequestsPerVersion = p24;
        this.minTimeBetweenReviewRequests = p25;
        this.firstSoftReviewTriggersFactorDivider = p26;
        this.minTimeAfterAcceptedReviewRequest = p27;
        this.encryptionAlgorithm = p28;
        this.encryptionKeyId = p29;
        this.encryptionPublicKey = p30;
        this.isSpoonerDevice = p31;
        this.minRequiredBuildNumber = p32;
        this.minSuggestedBuildNumber = p33;
        return;
    }

    public synthetic Settings(String p25, String p26, String p27, String p28, String p29, String p30, boolean p31, boolean p32, java.util.Map p33, String p34, String p35, String p36, int p37, int p38, int p39, int p40, int p41, int p42, String p43, String p44, String p45, boolean p46, int p47, int p48, int p49, kotlin.jvm.internal.DefaultConstructorMarker p50)
    {
        int v1_1;
        String v2 = "";
        if ((p49 & 1) == 0) {
            v1_1 = p25;
        } else {
            v1_1 = "";
        }
        String v3_1;
        if ((p49 & 2) == 0) {
            v3_1 = p26;
        } else {
            v3_1 = "";
        }
        String v4_1;
        if ((p49 & 4) == 0) {
            v4_1 = p27;
        } else {
            v4_1 = "";
        }
        String v5_1;
        if ((p49 & 8) == 0) {
            v5_1 = p28;
        } else {
            v5_1 = "";
        }
        String v6_1;
        if ((p49 & 16) == 0) {
            v6_1 = p29;
        } else {
            v6_1 = "";
        }
        String v7_1;
        if ((p49 & 32) == 0) {
            v7_1 = p30;
        } else {
            v7_1 = 0;
        }
        boolean v8_1;
        if ((p49 & 64) == 0) {
            v8_1 = p31;
        } else {
            v8_1 = 0;
        }
        boolean v10_1;
        if ((p49 & 128) == 0) {
            v10_1 = p32;
        } else {
            v10_1 = 0;
        }
        java.util.Map v11_1;
        if ((p49 & 256) == 0) {
            v11_1 = p33;
        } else {
            v11_1 = kotlin.collections.MapsKt.emptyMap();
        }
        String v12_1;
        if ((p49 & 512) == 0) {
            v12_1 = p34;
        } else {
            v12_1 = "";
        }
        String v13_1;
        if ((p49 & 1024) == 0) {
            v13_1 = p35;
        } else {
            v13_1 = "";
        }
        String v14_1;
        if ((p49 & 2048) == 0) {
            v14_1 = p36;
        } else {
            v14_1 = "";
        }
        int v15_1;
        if ((p49 & 4096) == 0) {
            v15_1 = p37;
        } else {
            v15_1 = 10;
        }
        int v9_1;
        int v16 = 1;
        if ((p49 & 8192) == 0) {
            v9_1 = p38;
        } else {
            v9_1 = 1;
        }
        int v1_3;
        if ((p49 & 16384) == 0) {
            v1_3 = p39;
        } else {
            v1_3 = 5;
        }
        int v17_2;
        if ((p49 & 32768) == 0) {
            v17_2 = p40;
        } else {
            v17_2 = 600;
        }
        if ((p49 & 65536) == 0) {
            v16 = p41;
        }
        int v18_4;
        if ((p49 & 131072) == 0) {
            v18_4 = p42;
        } else {
            v18_4 = 2592000;
        }
        String v19_2;
        if ((p49 & 262144) == 0) {
            v19_2 = p43;
        } else {
            v19_2 = "";
        }
        String v20_2;
        if ((p49 & 524288) == 0) {
            v20_2 = p44;
        } else {
            v20_2 = "";
        }
        if ((p49 & 1048576) == 0) {
            v2 = p45;
        }
        boolean v21_4;
        if ((p49 & 2097152) == 0) {
            v21_4 = p46;
        } else {
            v21_4 = 0;
        }
        int v22_0;
        if ((p49 & 4194304) == 0) {
            v22_0 = p47;
        } else {
            v22_0 = 0;
        }
        int v49_1;
        if ((p49 & 8388608) == 0) {
            v49_1 = p48;
        } else {
            v49_1 = 0;
        }
        this(v1_1, v3_1, v4_1, v5_1, v6_1, v7_1, v8_1, v10_1, v11_1, v12_1, v13_1, v14_1, v15_1, v9_1, v1_3, v17_2, v16, v18_4, v19_2, v20_2, v2, v21_4, v22_0, v49_1);
        return;
    }

    public static final synthetic sn2.h[] access$get$childSerializers$cp()
    {
        return com.bendingspoons.oracle.models.Settings.$childSerializers;
    }

    public static synthetic com.bendingspoons.oracle.models.Settings copy$default(com.bendingspoons.oracle.models.Settings p17, String p18, String p19, String p20, String p21, String p22, String p23, boolean p24, boolean p25, java.util.Map p26, String p27, String p28, String p29, int p30, int p31, int p32, int p33, int p34, int p35, String p36, String p37, String p38, boolean p39, int p40, int p41, int p42, Object p43)
    {
        int v2_1;
        if ((p42 & 1) == 0) {
            v2_1 = p18;
        } else {
            v2_1 = p17.tosUrl;
        }
        String v3_1;
        if ((p42 & 2) == 0) {
            v3_1 = p19;
        } else {
            v3_1 = p17.privacyUrl;
        }
        String v4_1;
        if ((p42 & 4) == 0) {
            v4_1 = p20;
        } else {
            v4_1 = p17.tosVersion;
        }
        String v5_1;
        if ((p42 & 8) == 0) {
            v5_1 = p21;
        } else {
            v5_1 = p17.privacyVersion;
        }
        String v6_1;
        if ((p42 & 16) == 0) {
            v6_1 = p22;
        } else {
            v6_1 = p17.tosEffectiveDate;
        }
        String v7_1;
        if ((p42 & 32) == 0) {
            v7_1 = p23;
        } else {
            v7_1 = p17.tosUpdateMessage;
        }
        boolean v8_1;
        if ((p42 & 64) == 0) {
            v8_1 = p24;
        } else {
            v8_1 = p17.isFreeUser;
        }
        boolean v9_1;
        if ((p42 & 128) == 0) {
            v9_1 = p25;
        } else {
            v9_1 = p17.isBaselineUser;
        }
        java.util.Map v10_1;
        if ((p42 & 256) == 0) {
            v10_1 = p26;
        } else {
            v10_1 = p17.experiments;
        }
        String v11_1;
        if ((p42 & 512) == 0) {
            v11_1 = p27;
        } else {
            v11_1 = p17.privacyRequestEmail;
        }
        String v12_1;
        if ((p42 & 1024) == 0) {
            v12_1 = p28;
        } else {
            v12_1 = p17.privacyRequestEmailCC;
        }
        String v13_1;
        if ((p42 & 2048) == 0) {
            v13_1 = p29;
        } else {
            v13_1 = p17.privacyRequestUrlTemplate;
        }
        int v14_1;
        if ((p42 & 4096) == 0) {
            v14_1 = p30;
        } else {
            v14_1 = p17.softReviewTriggersFactor;
        }
        int v15_1;
        if ((p42 & 8192) == 0) {
            v15_1 = p31;
        } else {
            v15_1 = p17.hardReviewTriggersFactor;
        }
        int v2_3;
        if ((p42 & 16384) == 0) {
            v2_3 = p32;
        } else {
            v2_3 = p17.maxReviewRequestsPerVersion;
        }
        int v1_4;
        if ((p42 & 32768) == 0) {
            v1_4 = p33;
        } else {
            v1_4 = p17.minTimeBetweenReviewRequests;
        }
        int v1_5;
        if ((p42 & 65536) == 0) {
            v1_5 = p34;
        } else {
            v1_5 = p17.firstSoftReviewTriggersFactorDivider;
        }
        int v1_6;
        if ((p42 & 131072) == 0) {
            v1_6 = p35;
        } else {
            v1_6 = p17.minTimeAfterAcceptedReviewRequest;
        }
        int v1_7;
        if ((p42 & 262144) == 0) {
            v1_7 = p36;
        } else {
            v1_7 = p17.encryptionAlgorithm;
        }
        int v1_8;
        if ((p42 & 524288) == 0) {
            v1_8 = p37;
        } else {
            v1_8 = p17.encryptionKeyId;
        }
        int v1_9;
        if ((p42 & 1048576) == 0) {
            v1_9 = p38;
        } else {
            v1_9 = p17.encryptionPublicKey;
        }
        int v1_1;
        if ((p42 & 2097152) == 0) {
            v1_1 = p39;
        } else {
            v1_1 = p17.isSpoonerDevice;
        }
        int v1_2;
        if ((p42 & 4194304) == 0) {
            v1_2 = p40;
        } else {
            v1_2 = p17.minRequiredBuildNumber;
        }
        int v41_1;
        int v42_1;
        if ((p42 & 8388608) == 0) {
            v42_1 = p41;
            v41_1 = v1_2;
        } else {
            v41_1 = v1_2;
            v42_1 = p17.minSuggestedBuildNumber;
        }
        return p17.copy(v2_1, v3_1, v4_1, v5_1, v6_1, v7_1, v8_1, v9_1, v10_1, v11_1, v12_1, v13_1, v14_1, v15_1, v2_3, v1_4, v1_5, v1_6, v1_7, v1_8, v1_9, v1_1, v41_1, v42_1);
    }

    public static synthetic void getEncryptionAlgorithm$annotations()
    {
        return;
    }

    public static synthetic void getEncryptionKeyId$annotations()
    {
        return;
    }

    public static synthetic void getEncryptionPublicKey$annotations()
    {
        return;
    }

    public static synthetic void getExperiments$annotations()
    {
        return;
    }

    public static synthetic void getFirstSoftReviewTriggersFactorDivider$annotations()
    {
        return;
    }

    public static synthetic void getHardReviewTriggersFactor$annotations()
    {
        return;
    }

    public static synthetic void getMaxReviewRequestsPerVersion$annotations()
    {
        return;
    }

    public static synthetic void getMinRequiredBuildNumber$annotations()
    {
        return;
    }

    public static synthetic void getMinSuggestedBuildNumber$annotations()
    {
        return;
    }

    public static synthetic void getMinTimeAfterAcceptedReviewRequest$annotations()
    {
        return;
    }

    public static synthetic void getMinTimeBetweenReviewRequests$annotations()
    {
        return;
    }

    public static synthetic void getPrivacyRequestEmail$annotations()
    {
        return;
    }

    public static synthetic void getPrivacyRequestEmailCC$annotations()
    {
        return;
    }

    public static synthetic void getPrivacyRequestUrlTemplate$annotations()
    {
        return;
    }

    public static synthetic void getPrivacyUrl$annotations()
    {
        return;
    }

    public static synthetic void getPrivacyVersion$annotations()
    {
        return;
    }

    public static synthetic void getSoftReviewTriggersFactor$annotations()
    {
        return;
    }

    public static synthetic void getTosEffectiveDate$annotations()
    {
        return;
    }

    public static synthetic void getTosUpdateMessage$annotations()
    {
        return;
    }

    public static synthetic void getTosUrl$annotations()
    {
        return;
    }

    public static synthetic void getTosVersion$annotations()
    {
        return;
    }

    public static synthetic void isBaselineUser$annotations()
    {
        return;
    }

    public static synthetic void isFreeUser$annotations()
    {
        return;
    }

    public static synthetic void isSpoonerDevice$annotations()
    {
        return;
    }

    public static final synthetic void write$Self$oracle_release(com.bendingspoons.oracle.models.Settings p7, UP.h p8, Jt4.V p9)
    {
        if ((p8.x1(p9, 0)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p7.tosUrl, ""))) {
            p8.T(p9, 0, p7.tosUrl);
        }
        if ((p8.x1(p9, 1)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p7.privacyUrl, ""))) {
            p8.T(p9, 1, p7.privacyUrl);
        }
        if ((p8.x1(p9, 2)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p7.tosVersion, ""))) {
            p8.T(p9, 2, p7.tosVersion);
        }
        if ((p8.x1(p9, 3)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p7.privacyVersion, ""))) {
            p8.T(p9, 3, p7.privacyVersion);
        }
        if ((p8.x1(p9, 4)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p7.tosEffectiveDate, ""))) {
            p8.T(p9, 4, p7.tosEffectiveDate);
        }
        if ((p8.x1(p9, 5)) || (p7.tosUpdateMessage != null)) {
            p8.ak(p9, 5, yz.OuM.hUw, p7.tosUpdateMessage);
        }
        if ((p8.x1(p9, 6)) || (p7.isFreeUser)) {
            p8.w(p9, 6, p7.isFreeUser);
        }
        if ((p8.x1(p9, 7)) || (p7.isBaselineUser)) {
            p8.w(p9, 7, p7.isBaselineUser);
        }
        if ((p8.x1(p9, 8)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p7.experiments, kotlin.collections.MapsKt.emptyMap()))) {
            p8.uKP(p9, 8, com.bendingspoons.oracle.models.Settings.$childSerializers[8], p7.experiments);
        }
        if ((p8.x1(p9, 9)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p7.privacyRequestEmail, ""))) {
            p8.T(p9, 9, p7.privacyRequestEmail);
        }
        if ((p8.x1(p9, 10)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p7.privacyRequestEmailCC, ""))) {
            p8.T(p9, 10, p7.privacyRequestEmailCC);
        }
        if ((p8.x1(p9, 11)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p7.privacyRequestUrlTemplate, ""))) {
            p8.T(p9, 11, p7.privacyRequestUrlTemplate);
        }
        if ((p8.x1(p9, 12)) || (p7.softReviewTriggersFactor != 10)) {
            p8.cLW(p9, 12, p7.softReviewTriggersFactor);
        }
        if ((p8.x1(p9, 13)) || (p7.hardReviewTriggersFactor != 1)) {
            p8.cLW(p9, 13, p7.hardReviewTriggersFactor);
        }
        if ((p8.x1(p9, 14)) || (p7.maxReviewRequestsPerVersion != 5)) {
            p8.cLW(p9, 14, p7.maxReviewRequestsPerVersion);
        }
        if ((p8.x1(p9, 15)) || (p7.minTimeBetweenReviewRequests != 600)) {
            p8.cLW(p9, 15, p7.minTimeBetweenReviewRequests);
        }
        if ((p8.x1(p9, 16)) || (p7.firstSoftReviewTriggersFactorDivider != 1)) {
            p8.cLW(p9, 16, p7.firstSoftReviewTriggersFactorDivider);
        }
        if ((p8.x1(p9, 17)) || (p7.minTimeAfterAcceptedReviewRequest != 2592000)) {
            p8.cLW(p9, 17, p7.minTimeAfterAcceptedReviewRequest);
        }
        if ((p8.x1(p9, 18)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p7.encryptionAlgorithm, ""))) {
            p8.T(p9, 18, p7.encryptionAlgorithm);
        }
        if ((p8.x1(p9, 19)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p7.encryptionKeyId, ""))) {
            p8.T(p9, 19, p7.encryptionKeyId);
        }
        if ((p8.x1(p9, 20)) || (!kotlin.jvm.internal.Intrinsics.areEqual(p7.encryptionPublicKey, ""))) {
            p8.T(p9, 20, p7.encryptionPublicKey);
        }
        if ((p8.x1(p9, 21)) || (p7.isSpoonerDevice)) {
            p8.w(p9, 21, p7.isSpoonerDevice);
        }
        if ((p8.x1(p9, 22)) || (p7.minRequiredBuildNumber != 0)) {
            p8.cLW(p9, 22, p7.minRequiredBuildNumber);
        }
        if ((p8.x1(p9, 23)) || (p7.minSuggestedBuildNumber != 0)) {
            p8.cLW(p9, 23, p7.minSuggestedBuildNumber);
        }
        return;
    }

    public final String component1()
    {
        return this.tosUrl;
    }

    public final String component10()
    {
        return this.privacyRequestEmail;
    }

    public final String component11()
    {
        return this.privacyRequestEmailCC;
    }

    public final String component12()
    {
        return this.privacyRequestUrlTemplate;
    }

    public final int component13()
    {
        return this.softReviewTriggersFactor;
    }

    public final int component14()
    {
        return this.hardReviewTriggersFactor;
    }

    public final int component15()
    {
        return this.maxReviewRequestsPerVersion;
    }

    public final int component16()
    {
        return this.minTimeBetweenReviewRequests;
    }

    public final int component17()
    {
        return this.firstSoftReviewTriggersFactorDivider;
    }

    public final int component18()
    {
        return this.minTimeAfterAcceptedReviewRequest;
    }

    public final String component19()
    {
        return this.encryptionAlgorithm;
    }

    public final String component2()
    {
        return this.privacyUrl;
    }

    public final String component20()
    {
        return this.encryptionKeyId;
    }

    public final String component21()
    {
        return this.encryptionPublicKey;
    }

    public final boolean component22()
    {
        return this.isSpoonerDevice;
    }

    public final int component23()
    {
        return this.minRequiredBuildNumber;
    }

    public final int component24()
    {
        return this.minSuggestedBuildNumber;
    }

    public final String component3()
    {
        return this.tosVersion;
    }

    public final String component4()
    {
        return this.privacyVersion;
    }

    public final String component5()
    {
        return this.tosEffectiveDate;
    }

    public final String component6()
    {
        return this.tosUpdateMessage;
    }

    public final boolean component7()
    {
        return this.isFreeUser;
    }

    public final boolean component8()
    {
        return this.isBaselineUser;
    }

    public final java.util.Map component9()
    {
        return this.experiments;
    }

    public final com.bendingspoons.oracle.models.Settings copy(String p27, String p28, String p29, String p30, String p31, String p32, boolean p33, boolean p34, java.util.Map p35, String p36, String p37, String p38, int p39, int p40, int p41, int p42, int p43, int p44, String p45, String p46, String p47, boolean p48, int p49, int p50)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p27, "tosUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p28, "privacyUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p29, "tosVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p30, "privacyVersion");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p31, tww.sY.sxbKR.aDMuhwKVChjbsyB);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p35, "experiments");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p36, "privacyRequestEmail");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p37, "privacyRequestEmailCC");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p38, "privacyRequestUrlTemplate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p45, "encryptionAlgorithm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p46, "encryptionKeyId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p47, "encryptionPublicKey");
        return new com.bendingspoons.oracle.models.Settings(p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.bendingspoons.oracle.models.Settings)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.tosUrl, ((com.bendingspoons.oracle.models.Settings) p5).tosUrl)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.privacyUrl, ((com.bendingspoons.oracle.models.Settings) p5).privacyUrl)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.tosVersion, ((com.bendingspoons.oracle.models.Settings) p5).tosVersion)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.privacyVersion, ((com.bendingspoons.oracle.models.Settings) p5).privacyVersion)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.tosEffectiveDate, ((com.bendingspoons.oracle.models.Settings) p5).tosEffectiveDate)) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.tosUpdateMessage, ((com.bendingspoons.oracle.models.Settings) p5).tosUpdateMessage)) {
                                        if (this.isFreeUser == ((com.bendingspoons.oracle.models.Settings) p5).isFreeUser) {
                                            if (this.isBaselineUser == ((com.bendingspoons.oracle.models.Settings) p5).isBaselineUser) {
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.experiments, ((com.bendingspoons.oracle.models.Settings) p5).experiments)) {
                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.privacyRequestEmail, ((com.bendingspoons.oracle.models.Settings) p5).privacyRequestEmail)) {
                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.privacyRequestEmailCC, ((com.bendingspoons.oracle.models.Settings) p5).privacyRequestEmailCC)) {
                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.privacyRequestUrlTemplate, ((com.bendingspoons.oracle.models.Settings) p5).privacyRequestUrlTemplate)) {
                                                                if (this.softReviewTriggersFactor == ((com.bendingspoons.oracle.models.Settings) p5).softReviewTriggersFactor) {
                                                                    if (this.hardReviewTriggersFactor == ((com.bendingspoons.oracle.models.Settings) p5).hardReviewTriggersFactor) {
                                                                        if (this.maxReviewRequestsPerVersion == ((com.bendingspoons.oracle.models.Settings) p5).maxReviewRequestsPerVersion) {
                                                                            if (this.minTimeBetweenReviewRequests == ((com.bendingspoons.oracle.models.Settings) p5).minTimeBetweenReviewRequests) {
                                                                                if (this.firstSoftReviewTriggersFactorDivider == ((com.bendingspoons.oracle.models.Settings) p5).firstSoftReviewTriggersFactorDivider) {
                                                                                    if (this.minTimeAfterAcceptedReviewRequest == ((com.bendingspoons.oracle.models.Settings) p5).minTimeAfterAcceptedReviewRequest) {
                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.encryptionAlgorithm, ((com.bendingspoons.oracle.models.Settings) p5).encryptionAlgorithm)) {
                                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.encryptionKeyId, ((com.bendingspoons.oracle.models.Settings) p5).encryptionKeyId)) {
                                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.encryptionPublicKey, ((com.bendingspoons.oracle.models.Settings) p5).encryptionPublicKey)) {
                                                                                                    if (this.isSpoonerDevice == ((com.bendingspoons.oracle.models.Settings) p5).isSpoonerDevice) {
                                                                                                        if (this.minRequiredBuildNumber == ((com.bendingspoons.oracle.models.Settings) p5).minRequiredBuildNumber) {
                                                                                                            if (this.minSuggestedBuildNumber == ((com.bendingspoons.oracle.models.Settings) p5).minSuggestedBuildNumber) {
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

    public final String getEncryptionAlgorithm()
    {
        return this.encryptionAlgorithm;
    }

    public final String getEncryptionKeyId()
    {
        return this.encryptionKeyId;
    }

    public final String getEncryptionPublicKey()
    {
        return this.encryptionPublicKey;
    }

    public final java.util.Map getExperiments()
    {
        return this.experiments;
    }

    public final int getFirstSoftReviewTriggersFactorDivider()
    {
        return this.firstSoftReviewTriggersFactorDivider;
    }

    public final int getHardReviewTriggersFactor()
    {
        return this.hardReviewTriggersFactor;
    }

    public final int getMaxReviewRequestsPerVersion()
    {
        return this.maxReviewRequestsPerVersion;
    }

    public final int getMinRequiredBuildNumber()
    {
        return this.minRequiredBuildNumber;
    }

    public final int getMinSuggestedBuildNumber()
    {
        return this.minSuggestedBuildNumber;
    }

    public final int getMinTimeAfterAcceptedReviewRequest()
    {
        return this.minTimeAfterAcceptedReviewRequest;
    }

    public final int getMinTimeBetweenReviewRequests()
    {
        return this.minTimeBetweenReviewRequests;
    }

    public final String getPrivacyRequestEmail()
    {
        return this.privacyRequestEmail;
    }

    public final String getPrivacyRequestEmailCC()
    {
        return this.privacyRequestEmailCC;
    }

    public final String getPrivacyRequestUrlTemplate()
    {
        return this.privacyRequestUrlTemplate;
    }

    public final String getPrivacyUrl()
    {
        return this.privacyUrl;
    }

    public final String getPrivacyVersion()
    {
        return this.privacyVersion;
    }

    public final int getSoftReviewTriggersFactor()
    {
        return this.softReviewTriggersFactor;
    }

    public final String getTosEffectiveDate()
    {
        return this.tosEffectiveDate;
    }

    public final String getTosUpdateMessage()
    {
        return this.tosUpdateMessage;
    }

    public final String getTosUrl()
    {
        return this.tosUrl;
    }

    public final String getTosVersion()
    {
        return this.tosVersion;
    }

    public int hashCode()
    {
        int v1_14;
        int v0_15 = (((((((((this.tosUrl.hashCode() * 31) + this.privacyUrl.hashCode()) * 31) + this.tosVersion.hashCode()) * 31) + this.privacyVersion.hashCode()) * 31) + this.tosEffectiveDate.hashCode()) * 31);
        int v1_13 = this.tosUpdateMessage;
        if (v1_13 != 0) {
            v1_14 = v1_13.hashCode();
        } else {
            v1_14 = 0;
        }
        return (((((((((((((((((((((((((((((((((((((v0_15 + v1_14) * 31) + Boolean.hashCode(this.isFreeUser)) * 31) + Boolean.hashCode(this.isBaselineUser)) * 31) + this.experiments.hashCode()) * 31) + this.privacyRequestEmail.hashCode()) * 31) + this.privacyRequestEmailCC.hashCode()) * 31) + this.privacyRequestUrlTemplate.hashCode()) * 31) + Integer.hashCode(this.softReviewTriggersFactor)) * 31) + Integer.hashCode(this.hardReviewTriggersFactor)) * 31) + Integer.hashCode(this.maxReviewRequestsPerVersion)) * 31) + Integer.hashCode(this.minTimeBetweenReviewRequests)) * 31) + Integer.hashCode(this.firstSoftReviewTriggersFactorDivider)) * 31) + Integer.hashCode(this.minTimeAfterAcceptedReviewRequest)) * 31) + this.encryptionAlgorithm.hashCode()) * 31) + this.encryptionKeyId.hashCode()) * 31) + this.encryptionPublicKey.hashCode()) * 31) + Boolean.hashCode(this.isSpoonerDevice)) * 31) + Integer.hashCode(this.minRequiredBuildNumber)) * 31) + Integer.hashCode(this.minSuggestedBuildNumber));
    }

    public final boolean isBaselineUser()
    {
        return this.isBaselineUser;
    }

    public final boolean isFreeUser()
    {
        return this.isFreeUser;
    }

    public final boolean isSpoonerDevice()
    {
        return this.isSpoonerDevice;
    }

    public final void setFreeUser(boolean p1)
    {
        this.isFreeUser = p1;
        return;
    }

    public String toString()
    {
        String v1_0 = this.tosUrl;
        String v2 = this.privacyUrl;
        String v3 = this.tosVersion;
        String v4 = this.privacyVersion;
        String v5 = this.tosEffectiveDate;
        String v6 = this.tosUpdateMessage;
        boolean v7 = this.isFreeUser;
        boolean v8 = this.isBaselineUser;
        java.util.Map v9 = this.experiments;
        String v10 = this.privacyRequestEmail;
        String v11 = this.privacyRequestEmailCC;
        String v12 = this.privacyRequestUrlTemplate;
        int v13 = this.softReviewTriggersFactor;
        int v14 = this.hardReviewTriggersFactor;
        int v16 = this.maxReviewRequestsPerVersion;
        int v17 = this.minTimeBetweenReviewRequests;
        int v18 = this.firstSoftReviewTriggersFactorDivider;
        int v19 = this.minTimeAfterAcceptedReviewRequest;
        String v20 = this.encryptionAlgorithm;
        String v21 = this.encryptionKeyId;
        String v22 = this.encryptionPublicKey;
        boolean v23 = this.isSpoonerDevice;
        int v24 = this.minRequiredBuildNumber;
        String v15_9 = this.minSuggestedBuildNumber;
        String v0_3 = new StringBuilder();
        int v25 = v15_9;
        v0_3.append("Settings(tosUrl=");
        v0_3.append(v1_0);
        v0_3.append(", privacyUrl=");
        v0_3.append(v2);
        v0_3.append(", tosVersion=");
        v0_3.append(v3);
        v0_3.append(", privacyVersion=");
        v0_3.append(v4);
        v0_3.append(", tosEffectiveDate=");
        v0_3.append(v5);
        v0_3.append(", tosUpdateMessage=");
        v0_3.append(v6);
        v0_3.append(", isFreeUser=");
        v0_3.append(v7);
        v0_3.append(", isBaselineUser=");
        v0_3.append(v8);
        v0_3.append(", experiments=");
        v0_3.append(v9);
        v0_3.append(", privacyRequestEmail=");
        v0_3.append(v10);
        v0_3.append(", privacyRequestEmailCC=");
        v0_3.append(v11);
        v0_3.append(", privacyRequestUrlTemplate=");
        v0_3.append(v12);
        v0_3.append(", softReviewTriggersFactor=");
        v0_3.append(v13);
        v0_3.append(", hardReviewTriggersFactor=");
        v0_3.append(v14);
        v0_3.append(", maxReviewRequestsPerVersion=");
        v0_3.append(v16);
        v0_3.append(", minTimeBetweenReviewRequests=");
        v0_3.append(v17);
        v0_3.append(", firstSoftReviewTriggersFactorDivider=");
        v0_3.append(v18);
        v0_3.append(", minTimeAfterAcceptedReviewRequest=");
        v0_3.append(v19);
        v0_3.append(", encryptionAlgorithm=");
        v0_3.append(v20);
        v0_3.append(", encryptionKeyId=");
        v0_3.append(v21);
        v0_3.append(", encryptionPublicKey=");
        v0_3.append(v22);
        v0_3.append(", isSpoonerDevice=");
        v0_3.append(v23);
        v0_3.append(", minRequiredBuildNumber=");
        v0_3.append(v24);
        v0_3.append(", minSuggestedBuildNumber=");
        v0_3.append(v25);
        v0_3.append(")");
        return v0_3.toString();
    }
}
