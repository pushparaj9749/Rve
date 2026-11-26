package com.alightcreative.monorepo.settings;
public final class AlightSettingsEntity {
    public static final int $stable = 8;
    private final String adMediationProvider;
    private final Boolean admobCmpEnabled;
    private final String admobInterstitialAdUnitId;
    private final String admobRewardedAdUnitId;
    private final String adsExperience;
    private final Boolean analyticsLogsEnabled;
    private final Boolean creatorProgramEnabled;
    private final java.util.List creatorProgramRewardList;
    private final Boolean creatorProgramStandby;
    private final Boolean creatorRankingEnabled;
    private final Boolean creatorRankingStandby;
    private final String crisperScript;
    private final Integer defaultResolutionProjectCreation;
    private final java.util.List exportMenuItems;
    private final java.util.List exportMenuItemsMultishare;
    private final String exportedVideoAttachment;
    private final java.util.List featuresWithNewBadge;
    private final String injetVersioningFileUrl;
    private final Boolean isInjetEnabled;
    private final Boolean isNewTemplatesExperienceEnabled;
    private final Boolean isTryItFirstAvailable;
    private final Boolean koreanOnboardingFlowEnabled;
    private final String landingTab;
    private final Boolean mdtContentLibraryEnabled;
    private final Boolean mdtContentLibraryRandomized;
    private final String navigationBar;
    private final Boolean newWatermarkDesign;
    private final Boolean onboardingShowCards;
    private final Boolean onboardingShowSkipButton;
    private final Boolean paywallCardsPriceInCards;
    private final Boolean paywallCardsUsePremiumLiteNames;
    private final Boolean playfulUnlockCanDismissEarly;
    private final String playfulUnlockDesign;
    private final Boolean presetSavePreviewApplyExportEnabled;
    private final java.util.List profilingEvents;
    private final Integer shareEligibilityWatchAdsCap;
    private final Boolean shareEligibilityWatchAdsEnabled;
    private final Boolean shouldHideHomepageUntilFirstHook;
    private final Boolean signInDisabledPPImport;
    private final Boolean specialEventLicensesEnabled;
    private final com.alightcreative.monorepo.settings.StackedIntroOffersEntity stackedIntroOffers;
    private final java.util.List technicalEvents;
    private final Boolean templateExportToggleEnabled;
    private final Boolean templateRevampedImportFlowEnabled;
    private final Boolean upsellPaywallShowPriceDifferences;
    private final Boolean watermarkV2Enabled;
    private final Boolean xmlImportEnabled;

    static AlightSettingsEntity()
    {
        return;
    }

    public AlightSettingsEntity(String p1, Boolean p2, Boolean p3, Boolean p4, String p5, String p6, String p7, java.util.List p8, java.util.List p9, java.util.List p10, Boolean p11, Boolean p12, Integer p13, Boolean p14, String p15, Integer p16, Boolean p17, Boolean p18, Boolean p19, Boolean p20, Boolean p21, Boolean p22, Boolean p23, java.util.List p24, Boolean p25, Boolean p26, Boolean p27, Boolean p28, java.util.List p29, java.util.List p30, Boolean p31, Boolean p32, Boolean p33, String p34, Boolean p35, Boolean p36, Boolean p37, Boolean p38, Boolean p39, com.alightcreative.monorepo.settings.StackedIntroOffersEntity p40, String p41, String p42, String p43, Boolean p44, String p45, Boolean p46, Boolean p47)
    {
        this.crisperScript = p1;
        this.onboardingShowCards = p2;
        this.onboardingShowSkipButton = p3;
        this.isTryItFirstAvailable = p4;
        this.adsExperience = p5;
        this.landingTab = p6;
        this.navigationBar = p7;
        this.exportMenuItems = p8;
        this.exportMenuItemsMultishare = p9;
        this.featuresWithNewBadge = p10;
        this.signInDisabledPPImport = p11;
        this.shareEligibilityWatchAdsEnabled = p12;
        this.shareEligibilityWatchAdsCap = p13;
        this.templateExportToggleEnabled = p14;
        this.exportedVideoAttachment = p15;
        this.defaultResolutionProjectCreation = p16;
        this.templateRevampedImportFlowEnabled = p17;
        this.xmlImportEnabled = p18;
        this.newWatermarkDesign = p19;
        this.watermarkV2Enabled = p20;
        this.presetSavePreviewApplyExportEnabled = p21;
        this.creatorProgramEnabled = p22;
        this.creatorProgramStandby = p23;
        this.creatorProgramRewardList = p24;
        this.mdtContentLibraryEnabled = p25;
        this.mdtContentLibraryRandomized = p26;
        this.creatorRankingEnabled = p27;
        this.creatorRankingStandby = p28;
        this.technicalEvents = p29;
        this.profilingEvents = p30;
        this.upsellPaywallShowPriceDifferences = p31;
        this.analyticsLogsEnabled = p32;
        this.paywallCardsUsePremiumLiteNames = p33;
        this.playfulUnlockDesign = p34;
        this.playfulUnlockCanDismissEarly = p35;
        this.paywallCardsPriceInCards = p36;
        this.shouldHideHomepageUntilFirstHook = p37;
        this.specialEventLicensesEnabled = p38;
        this.admobCmpEnabled = p39;
        this.stackedIntroOffers = p40;
        this.adMediationProvider = p41;
        this.admobInterstitialAdUnitId = p42;
        this.admobRewardedAdUnitId = p43;
        this.isInjetEnabled = p44;
        this.injetVersioningFileUrl = p45;
        this.isNewTemplatesExperienceEnabled = p46;
        this.koreanOnboardingFlowEnabled = p47;
        return;
    }

    public static synthetic com.alightcreative.monorepo.settings.AlightSettingsEntity copy$default(com.alightcreative.monorepo.settings.AlightSettingsEntity p17, String p18, Boolean p19, Boolean p20, Boolean p21, String p22, String p23, String p24, java.util.List p25, java.util.List p26, java.util.List p27, Boolean p28, Boolean p29, Integer p30, Boolean p31, String p32, Integer p33, Boolean p34, Boolean p35, Boolean p36, Boolean p37, Boolean p38, Boolean p39, Boolean p40, java.util.List p41, Boolean p42, Boolean p43, Boolean p44, Boolean p45, java.util.List p46, java.util.List p47, Boolean p48, Boolean p49, Boolean p50, String p51, Boolean p52, Boolean p53, Boolean p54, Boolean p55, Boolean p56, com.alightcreative.monorepo.settings.StackedIntroOffersEntity p57, String p58, String p59, String p60, Boolean p61, String p62, Boolean p63, Boolean p64, int p65, int p66, Object p67)
    {
        String v3_1;
        if ((p65 & 1) == 0) {
            v3_1 = p18;
        } else {
            v3_1 = p17.crisperScript;
        }
        Boolean v4_0;
        if ((p65 & 2) == 0) {
            v4_0 = p19;
        } else {
            v4_0 = p17.onboardingShowCards;
        }
        Boolean v5_1;
        if ((p65 & 4) == 0) {
            v5_1 = p20;
        } else {
            v5_1 = p17.onboardingShowSkipButton;
        }
        Boolean v6_1;
        if ((p65 & 8) == 0) {
            v6_1 = p21;
        } else {
            v6_1 = p17.isTryItFirstAvailable;
        }
        String v7_1;
        if ((p65 & 16) == 0) {
            v7_1 = p22;
        } else {
            v7_1 = p17.adsExperience;
        }
        String v8_1;
        if ((p65 & 32) == 0) {
            v8_1 = p23;
        } else {
            v8_1 = p17.landingTab;
        }
        String v9_1;
        if ((p65 & 64) == 0) {
            v9_1 = p24;
        } else {
            v9_1 = p17.navigationBar;
        }
        java.util.List v10_1;
        if ((p65 & 128) == 0) {
            v10_1 = p25;
        } else {
            v10_1 = p17.exportMenuItems;
        }
        java.util.List v11_1;
        if ((p65 & 256) == 0) {
            v11_1 = p26;
        } else {
            v11_1 = p17.exportMenuItemsMultishare;
        }
        java.util.List v12_1;
        if ((p65 & 512) == 0) {
            v12_1 = p27;
        } else {
            v12_1 = p17.featuresWithNewBadge;
        }
        Boolean v13_1;
        if ((p65 & 1024) == 0) {
            v13_1 = p28;
        } else {
            v13_1 = p17.signInDisabledPPImport;
        }
        Boolean v14_1;
        if ((p65 & 2048) == 0) {
            v14_1 = p29;
        } else {
            v14_1 = p17.shareEligibilityWatchAdsEnabled;
        }
        Integer v15_1;
        if ((p65 & 4096) == 0) {
            v15_1 = p30;
        } else {
            v15_1 = p17.shareEligibilityWatchAdsCap;
        }
        String v3_3;
        if ((p65 & 8192) == 0) {
            v3_3 = p31;
        } else {
            v3_3 = p17.templateExportToggleEnabled;
        }
        String v3_5;
        if ((p65 & 16384) == 0) {
            v3_5 = p32;
        } else {
            v3_5 = p17.exportedVideoAttachment;
        }
        Boolean v1_33;
        if ((p65 & 32768) == 0) {
            v1_33 = p33;
        } else {
            v1_33 = p17.defaultResolutionProjectCreation;
        }
        Boolean v1_34;
        if ((p65 & 65536) == 0) {
            v1_34 = p34;
        } else {
            v1_34 = p17.templateRevampedImportFlowEnabled;
        }
        Boolean v1_35;
        if ((p65 & 131072) == 0) {
            v1_35 = p35;
        } else {
            v1_35 = p17.xmlImportEnabled;
        }
        Boolean v1_36;
        if ((p65 & 262144) == 0) {
            v1_36 = p36;
        } else {
            v1_36 = p17.newWatermarkDesign;
        }
        Boolean v1_37;
        if ((p65 & 524288) == 0) {
            v1_37 = p37;
        } else {
            v1_37 = p17.watermarkV2Enabled;
        }
        Boolean v1_38;
        if ((p65 & 1048576) == 0) {
            v1_38 = p38;
        } else {
            v1_38 = p17.presetSavePreviewApplyExportEnabled;
        }
        Boolean v1_1;
        if ((p65 & 2097152) == 0) {
            v1_1 = p39;
        } else {
            v1_1 = p17.creatorProgramEnabled;
        }
        Boolean v1_2;
        if ((p65 & 4194304) == 0) {
            v1_2 = p40;
        } else {
            v1_2 = p17.creatorProgramStandby;
        }
        Boolean v1_3;
        if ((p65 & 8388608) == 0) {
            v1_3 = p41;
        } else {
            v1_3 = p17.creatorProgramRewardList;
        }
        Boolean v1_4;
        if ((p65 & 16777216) == 0) {
            v1_4 = p42;
        } else {
            v1_4 = p17.mdtContentLibraryEnabled;
        }
        Boolean v1_5;
        if ((p65 & 33554432) == 0) {
            v1_5 = p43;
        } else {
            v1_5 = p17.mdtContentLibraryRandomized;
        }
        Boolean v1_6;
        if ((p65 & 67108864) == 0) {
            v1_6 = p44;
        } else {
            v1_6 = p17.creatorRankingEnabled;
        }
        Boolean v1_7;
        if ((p65 & 134217728) == 0) {
            v1_7 = p45;
        } else {
            v1_7 = p17.creatorRankingStandby;
        }
        Boolean v1_8;
        if ((p65 & 268435456) == 0) {
            v1_8 = p46;
        } else {
            v1_8 = p17.technicalEvents;
        }
        Boolean v1_9;
        if ((p65 & 536870912) == 0) {
            v1_9 = p47;
        } else {
            v1_9 = p17.profilingEvents;
        }
        Boolean v1_10;
        if ((p65 & 1073741824) == 0) {
            v1_10 = p48;
        } else {
            v1_10 = p17.upsellPaywallShowPriceDifferences;
        }
        Boolean v1_11;
        if ((p65 & -2147483648) == 0) {
            v1_11 = p49;
        } else {
            v1_11 = p17.analyticsLogsEnabled;
        }
        Boolean v1_12;
        if ((p66 & 1) == 0) {
            v1_12 = p50;
        } else {
            v1_12 = p17.paywallCardsUsePremiumLiteNames;
        }
        Boolean v1_13;
        if ((p66 & 2) == 0) {
            v1_13 = p51;
        } else {
            v1_13 = p17.playfulUnlockDesign;
        }
        Boolean v1_14;
        if ((p66 & 4) == 0) {
            v1_14 = p52;
        } else {
            v1_14 = p17.playfulUnlockCanDismissEarly;
        }
        Boolean v1_15;
        if ((p66 & 8) == 0) {
            v1_15 = p53;
        } else {
            v1_15 = p17.paywallCardsPriceInCards;
        }
        Boolean v1_16;
        if ((p66 & 16) == 0) {
            v1_16 = p54;
        } else {
            v1_16 = p17.shouldHideHomepageUntilFirstHook;
        }
        Boolean v1_17;
        if ((p66 & 32) == 0) {
            v1_17 = p55;
        } else {
            v1_17 = p17.specialEventLicensesEnabled;
        }
        Boolean v1_18;
        if ((p66 & 64) == 0) {
            v1_18 = p56;
        } else {
            v1_18 = p17.admobCmpEnabled;
        }
        Boolean v1_20;
        if ((p66 & 128) == 0) {
            v1_20 = p57;
        } else {
            v1_20 = p17.stackedIntroOffers;
        }
        Boolean v1_22;
        if ((p66 & 256) == 0) {
            v1_22 = p58;
        } else {
            v1_22 = p17.adMediationProvider;
        }
        Boolean v1_24;
        if ((p66 & 512) == 0) {
            v1_24 = p59;
        } else {
            v1_24 = p17.admobInterstitialAdUnitId;
        }
        Boolean v1_26;
        if ((p66 & 1024) == 0) {
            v1_26 = p60;
        } else {
            v1_26 = p17.admobRewardedAdUnitId;
        }
        Boolean v1_28;
        if ((p66 & 2048) == 0) {
            v1_28 = p61;
        } else {
            v1_28 = p17.isInjetEnabled;
        }
        Boolean v1_30;
        if ((p66 & 4096) == 0) {
            v1_30 = p62;
        } else {
            v1_30 = p17.injetVersioningFileUrl;
        }
        Boolean v1_32;
        if ((p66 & 8192) == 0) {
            v1_32 = p63;
        } else {
            v1_32 = p17.isNewTemplatesExperienceEnabled;
        }
        Boolean v65_1;
        if ((p66 & 16384) == 0) {
            v65_1 = p64;
        } else {
            v65_1 = p17.koreanOnboardingFlowEnabled;
        }
        return p17.copy(v3_1, v4_0, v5_1, v6_1, v7_1, v8_1, v9_1, v10_1, v11_1, v12_1, v13_1, v14_1, v15_1, v3_3, v3_5, v1_33, v1_34, v1_35, v1_36, v1_37, v1_38, v1_1, v1_2, v1_3, v1_4, v1_5, v1_6, v1_7, v1_8, v1_9, v1_10, v1_11, v1_12, v1_13, v1_14, v1_15, v1_16, v1_17, v1_18, v1_20, v1_22, v1_24, v1_26, v1_28, v1_30, v1_32, v65_1);
    }

    public final String component1()
    {
        return this.crisperScript;
    }

    public final java.util.List component10()
    {
        return this.featuresWithNewBadge;
    }

    public final Boolean component11()
    {
        return this.signInDisabledPPImport;
    }

    public final Boolean component12()
    {
        return this.shareEligibilityWatchAdsEnabled;
    }

    public final Integer component13()
    {
        return this.shareEligibilityWatchAdsCap;
    }

    public final Boolean component14()
    {
        return this.templateExportToggleEnabled;
    }

    public final String component15()
    {
        return this.exportedVideoAttachment;
    }

    public final Integer component16()
    {
        return this.defaultResolutionProjectCreation;
    }

    public final Boolean component17()
    {
        return this.templateRevampedImportFlowEnabled;
    }

    public final Boolean component18()
    {
        return this.xmlImportEnabled;
    }

    public final Boolean component19()
    {
        return this.newWatermarkDesign;
    }

    public final Boolean component2()
    {
        return this.onboardingShowCards;
    }

    public final Boolean component20()
    {
        return this.watermarkV2Enabled;
    }

    public final Boolean component21()
    {
        return this.presetSavePreviewApplyExportEnabled;
    }

    public final Boolean component22()
    {
        return this.creatorProgramEnabled;
    }

    public final Boolean component23()
    {
        return this.creatorProgramStandby;
    }

    public final java.util.List component24()
    {
        return this.creatorProgramRewardList;
    }

    public final Boolean component25()
    {
        return this.mdtContentLibraryEnabled;
    }

    public final Boolean component26()
    {
        return this.mdtContentLibraryRandomized;
    }

    public final Boolean component27()
    {
        return this.creatorRankingEnabled;
    }

    public final Boolean component28()
    {
        return this.creatorRankingStandby;
    }

    public final java.util.List component29()
    {
        return this.technicalEvents;
    }

    public final Boolean component3()
    {
        return this.onboardingShowSkipButton;
    }

    public final java.util.List component30()
    {
        return this.profilingEvents;
    }

    public final Boolean component31()
    {
        return this.upsellPaywallShowPriceDifferences;
    }

    public final Boolean component32()
    {
        return this.analyticsLogsEnabled;
    }

    public final Boolean component33()
    {
        return this.paywallCardsUsePremiumLiteNames;
    }

    public final String component34()
    {
        return this.playfulUnlockDesign;
    }

    public final Boolean component35()
    {
        return this.playfulUnlockCanDismissEarly;
    }

    public final Boolean component36()
    {
        return this.paywallCardsPriceInCards;
    }

    public final Boolean component37()
    {
        return this.shouldHideHomepageUntilFirstHook;
    }

    public final Boolean component38()
    {
        return this.specialEventLicensesEnabled;
    }

    public final Boolean component39()
    {
        return this.admobCmpEnabled;
    }

    public final Boolean component4()
    {
        return this.isTryItFirstAvailable;
    }

    public final com.alightcreative.monorepo.settings.StackedIntroOffersEntity component40()
    {
        return this.stackedIntroOffers;
    }

    public final String component41()
    {
        return this.adMediationProvider;
    }

    public final String component42()
    {
        return this.admobInterstitialAdUnitId;
    }

    public final String component43()
    {
        return this.admobRewardedAdUnitId;
    }

    public final Boolean component44()
    {
        return this.isInjetEnabled;
    }

    public final String component45()
    {
        return this.injetVersioningFileUrl;
    }

    public final Boolean component46()
    {
        return this.isNewTemplatesExperienceEnabled;
    }

    public final Boolean component47()
    {
        return this.koreanOnboardingFlowEnabled;
    }

    public final String component5()
    {
        return this.adsExperience;
    }

    public final String component6()
    {
        return this.landingTab;
    }

    public final String component7()
    {
        return this.navigationBar;
    }

    public final java.util.List component8()
    {
        return this.exportMenuItems;
    }

    public final java.util.List component9()
    {
        return this.exportMenuItemsMultishare;
    }

    public final com.alightcreative.monorepo.settings.AlightSettingsEntity copy(String p49, Boolean p50, Boolean p51, Boolean p52, String p53, String p54, String p55, java.util.List p56, java.util.List p57, java.util.List p58, Boolean p59, Boolean p60, Integer p61, Boolean p62, String p63, Integer p64, Boolean p65, Boolean p66, Boolean p67, Boolean p68, Boolean p69, Boolean p70, Boolean p71, java.util.List p72, Boolean p73, Boolean p74, Boolean p75, Boolean p76, java.util.List p77, java.util.List p78, Boolean p79, Boolean p80, Boolean p81, String p82, Boolean p83, Boolean p84, Boolean p85, Boolean p86, Boolean p87, com.alightcreative.monorepo.settings.StackedIntroOffersEntity p88, String p89, String p90, String p91, Boolean p92, String p93, Boolean p94, Boolean p95)
    {
        return new com.alightcreative.monorepo.settings.AlightSettingsEntity(p49, p50, p51, p52, p53, p54, p55, p56, p57, p58, p59, p60, p61, p62, p63, p64, p65, p66, p67, p68, p69, p70, p71, p72, p73, p74, p75, p76, p77, p78, p79, p80, p81, p82, p83, p84, p85, p86, p87, p88, p89, p90, p91, p92, p93, p94, p95);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.monorepo.settings.AlightSettingsEntity)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.crisperScript, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).crisperScript)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.onboardingShowCards, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).onboardingShowCards)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.onboardingShowSkipButton, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).onboardingShowSkipButton)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.isTryItFirstAvailable, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).isTryItFirstAvailable)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.adsExperience, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).adsExperience)) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.landingTab, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).landingTab)) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.navigationBar, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).navigationBar)) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.exportMenuItems, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).exportMenuItems)) {
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.exportMenuItemsMultishare, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).exportMenuItemsMultishare)) {
                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.featuresWithNewBadge, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).featuresWithNewBadge)) {
                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.signInDisabledPPImport, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).signInDisabledPPImport)) {
                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.shareEligibilityWatchAdsEnabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).shareEligibilityWatchAdsEnabled)) {
                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.shareEligibilityWatchAdsCap, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).shareEligibilityWatchAdsCap)) {
                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.templateExportToggleEnabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).templateExportToggleEnabled)) {
                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.exportedVideoAttachment, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).exportedVideoAttachment)) {
                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.defaultResolutionProjectCreation, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).defaultResolutionProjectCreation)) {
                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.templateRevampedImportFlowEnabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).templateRevampedImportFlowEnabled)) {
                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.xmlImportEnabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).xmlImportEnabled)) {
                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.newWatermarkDesign, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).newWatermarkDesign)) {
                                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.watermarkV2Enabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).watermarkV2Enabled)) {
                                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.presetSavePreviewApplyExportEnabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).presetSavePreviewApplyExportEnabled)) {
                                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.creatorProgramEnabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).creatorProgramEnabled)) {
                                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.creatorProgramStandby, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).creatorProgramStandby)) {
                                                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.creatorProgramRewardList, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).creatorProgramRewardList)) {
                                                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.mdtContentLibraryEnabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).mdtContentLibraryEnabled)) {
                                                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.mdtContentLibraryRandomized, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).mdtContentLibraryRandomized)) {
                                                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.creatorRankingEnabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).creatorRankingEnabled)) {
                                                                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.creatorRankingStandby, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).creatorRankingStandby)) {
                                                                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.technicalEvents, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).technicalEvents)) {
                                                                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.profilingEvents, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).profilingEvents)) {
                                                                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.upsellPaywallShowPriceDifferences, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).upsellPaywallShowPriceDifferences)) {
                                                                                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.analyticsLogsEnabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).analyticsLogsEnabled)) {
                                                                                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.paywallCardsUsePremiumLiteNames, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).paywallCardsUsePremiumLiteNames)) {
                                                                                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.playfulUnlockDesign, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).playfulUnlockDesign)) {
                                                                                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.playfulUnlockCanDismissEarly, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).playfulUnlockCanDismissEarly)) {
                                                                                                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.paywallCardsPriceInCards, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).paywallCardsPriceInCards)) {
                                                                                                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.shouldHideHomepageUntilFirstHook, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).shouldHideHomepageUntilFirstHook)) {
                                                                                                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.specialEventLicensesEnabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).specialEventLicensesEnabled)) {
                                                                                                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.admobCmpEnabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).admobCmpEnabled)) {
                                                                                                                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.stackedIntroOffers, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).stackedIntroOffers)) {
                                                                                                                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.adMediationProvider, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).adMediationProvider)) {
                                                                                                                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.admobInterstitialAdUnitId, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).admobInterstitialAdUnitId)) {
                                                                                                                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.admobRewardedAdUnitId, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).admobRewardedAdUnitId)) {
                                                                                                                                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.isInjetEnabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).isInjetEnabled)) {
                                                                                                                                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.injetVersioningFileUrl, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).injetVersioningFileUrl)) {
                                                                                                                                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.isNewTemplatesExperienceEnabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).isNewTemplatesExperienceEnabled)) {
                                                                                                                                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.koreanOnboardingFlowEnabled, ((com.alightcreative.monorepo.settings.AlightSettingsEntity) p5).koreanOnboardingFlowEnabled)) {
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

    public final String getAdMediationProvider()
    {
        return this.adMediationProvider;
    }

    public final Boolean getAdmobCmpEnabled()
    {
        return this.admobCmpEnabled;
    }

    public final String getAdmobInterstitialAdUnitId()
    {
        return this.admobInterstitialAdUnitId;
    }

    public final String getAdmobRewardedAdUnitId()
    {
        return this.admobRewardedAdUnitId;
    }

    public final String getAdsExperience()
    {
        return this.adsExperience;
    }

    public final Boolean getAnalyticsLogsEnabled()
    {
        return this.analyticsLogsEnabled;
    }

    public final Boolean getCreatorProgramEnabled()
    {
        return this.creatorProgramEnabled;
    }

    public final java.util.List getCreatorProgramRewardList()
    {
        return this.creatorProgramRewardList;
    }

    public final Boolean getCreatorProgramStandby()
    {
        return this.creatorProgramStandby;
    }

    public final Boolean getCreatorRankingEnabled()
    {
        return this.creatorRankingEnabled;
    }

    public final Boolean getCreatorRankingStandby()
    {
        return this.creatorRankingStandby;
    }

    public final String getCrisperScript()
    {
        return this.crisperScript;
    }

    public final Integer getDefaultResolutionProjectCreation()
    {
        return this.defaultResolutionProjectCreation;
    }

    public final java.util.List getExportMenuItems()
    {
        return this.exportMenuItems;
    }

    public final java.util.List getExportMenuItemsMultishare()
    {
        return this.exportMenuItemsMultishare;
    }

    public final String getExportedVideoAttachment()
    {
        return this.exportedVideoAttachment;
    }

    public final java.util.List getFeaturesWithNewBadge()
    {
        return this.featuresWithNewBadge;
    }

    public final String getInjetVersioningFileUrl()
    {
        return this.injetVersioningFileUrl;
    }

    public final Boolean getKoreanOnboardingFlowEnabled()
    {
        return this.koreanOnboardingFlowEnabled;
    }

    public final String getLandingTab()
    {
        return this.landingTab;
    }

    public final Boolean getMdtContentLibraryEnabled()
    {
        return this.mdtContentLibraryEnabled;
    }

    public final Boolean getMdtContentLibraryRandomized()
    {
        return this.mdtContentLibraryRandomized;
    }

    public final String getNavigationBar()
    {
        return this.navigationBar;
    }

    public final Boolean getNewWatermarkDesign()
    {
        return this.newWatermarkDesign;
    }

    public final Boolean getOnboardingShowCards()
    {
        return this.onboardingShowCards;
    }

    public final Boolean getOnboardingShowSkipButton()
    {
        return this.onboardingShowSkipButton;
    }

    public final Boolean getPaywallCardsPriceInCards()
    {
        return this.paywallCardsPriceInCards;
    }

    public final Boolean getPaywallCardsUsePremiumLiteNames()
    {
        return this.paywallCardsUsePremiumLiteNames;
    }

    public final Boolean getPlayfulUnlockCanDismissEarly()
    {
        return this.playfulUnlockCanDismissEarly;
    }

    public final String getPlayfulUnlockDesign()
    {
        return this.playfulUnlockDesign;
    }

    public final Boolean getPresetSavePreviewApplyExportEnabled()
    {
        return this.presetSavePreviewApplyExportEnabled;
    }

    public final java.util.List getProfilingEvents()
    {
        return this.profilingEvents;
    }

    public final Integer getShareEligibilityWatchAdsCap()
    {
        return this.shareEligibilityWatchAdsCap;
    }

    public final Boolean getShareEligibilityWatchAdsEnabled()
    {
        return this.shareEligibilityWatchAdsEnabled;
    }

    public final Boolean getShouldHideHomepageUntilFirstHook()
    {
        return this.shouldHideHomepageUntilFirstHook;
    }

    public final Boolean getSignInDisabledPPImport()
    {
        return this.signInDisabledPPImport;
    }

    public final Boolean getSpecialEventLicensesEnabled()
    {
        return this.specialEventLicensesEnabled;
    }

    public final com.alightcreative.monorepo.settings.StackedIntroOffersEntity getStackedIntroOffers()
    {
        return this.stackedIntroOffers;
    }

    public final java.util.List getTechnicalEvents()
    {
        return this.technicalEvents;
    }

    public final Boolean getTemplateExportToggleEnabled()
    {
        return this.templateExportToggleEnabled;
    }

    public final Boolean getTemplateRevampedImportFlowEnabled()
    {
        return this.templateRevampedImportFlowEnabled;
    }

    public final Boolean getUpsellPaywallShowPriceDifferences()
    {
        return this.upsellPaywallShowPriceDifferences;
    }

    public final Boolean getWatermarkV2Enabled()
    {
        return this.watermarkV2Enabled;
    }

    public final Boolean getXmlImportEnabled()
    {
        return this.xmlImportEnabled;
    }

    public int hashCode()
    {
        int v0_74;
        int v0_0 = this.crisperScript;
        int v1 = 0;
        if (v0_0 != 0) {
            v0_74 = v0_0.hashCode();
        } else {
            v0_74 = 0;
        }
        Boolean v2_0;
        int v0_81 = (v0_74 * 31);
        Boolean v2_81 = this.onboardingShowCards;
        if (v2_81 != null) {
            v2_0 = v2_81.hashCode();
        } else {
            v2_0 = 0;
        }
        Boolean v2_22;
        int v0_10 = ((v0_81 + v2_0) * 31);
        Boolean v2_12 = this.onboardingShowSkipButton;
        if (v2_12 != null) {
            v2_22 = v2_12.hashCode();
        } else {
            v2_22 = 0;
        }
        Boolean v2_44;
        int v0_32 = ((v0_10 + v2_22) * 31);
        Boolean v2_34 = this.isTryItFirstAvailable;
        if (v2_34 != null) {
            v2_44 = v2_34.hashCode();
        } else {
            v2_44 = 0;
        }
        Boolean v2_66;
        int v0_54 = ((v0_32 + v2_44) * 31);
        Boolean v2_56 = this.adsExperience;
        if (v2_56 != null) {
            v2_66 = v2_56.hashCode();
        } else {
            v2_66 = 0;
        }
        Boolean v2_72;
        int v0_73 = ((v0_54 + v2_66) * 31);
        Boolean v2_71 = this.landingTab;
        if (v2_71 != null) {
            v2_72 = v2_71.hashCode();
        } else {
            v2_72 = 0;
        }
        Boolean v2_74;
        int v0_76 = ((v0_73 + v2_72) * 31);
        Boolean v2_73 = this.navigationBar;
        if (v2_73 != null) {
            v2_74 = v2_73.hashCode();
        } else {
            v2_74 = 0;
        }
        Boolean v2_76;
        int v0_78 = ((v0_76 + v2_74) * 31);
        Boolean v2_75 = this.exportMenuItems;
        if (v2_75 != null) {
            v2_76 = v2_75.hashCode();
        } else {
            v2_76 = 0;
        }
        Boolean v2_78;
        int v0_80 = ((v0_78 + v2_76) * 31);
        Boolean v2_77 = this.exportMenuItemsMultishare;
        if (v2_77 != null) {
            v2_78 = v2_77.hashCode();
        } else {
            v2_78 = 0;
        }
        Boolean v2_80;
        int v0_83 = ((v0_80 + v2_78) * 31);
        Boolean v2_79 = this.featuresWithNewBadge;
        if (v2_79 != null) {
            v2_80 = v2_79.hashCode();
        } else {
            v2_80 = 0;
        }
        Boolean v2_83;
        int v0_85 = ((v0_83 + v2_80) * 31);
        Boolean v2_82 = this.signInDisabledPPImport;
        if (v2_82 != null) {
            v2_83 = v2_82.hashCode();
        } else {
            v2_83 = 0;
        }
        Boolean v2_85;
        int v0_87 = ((v0_85 + v2_83) * 31);
        Boolean v2_84 = this.shareEligibilityWatchAdsEnabled;
        if (v2_84 != null) {
            v2_85 = v2_84.hashCode();
        } else {
            v2_85 = 0;
        }
        Boolean v2_87;
        int v0_89 = ((v0_87 + v2_85) * 31);
        Boolean v2_86 = this.shareEligibilityWatchAdsCap;
        if (v2_86 != null) {
            v2_87 = v2_86.hashCode();
        } else {
            v2_87 = 0;
        }
        Boolean v2_89;
        int v0_91 = ((v0_89 + v2_87) * 31);
        Boolean v2_88 = this.templateExportToggleEnabled;
        if (v2_88 != null) {
            v2_89 = v2_88.hashCode();
        } else {
            v2_89 = 0;
        }
        Boolean v2_1;
        int v0_93 = ((v0_91 + v2_89) * 31);
        Boolean v2_90 = this.exportedVideoAttachment;
        if (v2_90 != null) {
            v2_1 = v2_90.hashCode();
        } else {
            v2_1 = 0;
        }
        Boolean v2_3;
        int v0_2 = ((v0_93 + v2_1) * 31);
        Boolean v2_2 = this.defaultResolutionProjectCreation;
        if (v2_2 != null) {
            v2_3 = v2_2.hashCode();
        } else {
            v2_3 = 0;
        }
        Boolean v2_5;
        int v0_4 = ((v0_2 + v2_3) * 31);
        Boolean v2_4 = this.templateRevampedImportFlowEnabled;
        if (v2_4 != null) {
            v2_5 = v2_4.hashCode();
        } else {
            v2_5 = 0;
        }
        Boolean v2_7;
        int v0_6 = ((v0_4 + v2_5) * 31);
        Boolean v2_6 = this.xmlImportEnabled;
        if (v2_6 != null) {
            v2_7 = v2_6.hashCode();
        } else {
            v2_7 = 0;
        }
        Boolean v2_9;
        int v0_9 = ((v0_6 + v2_7) * 31);
        Boolean v2_8 = this.newWatermarkDesign;
        if (v2_8 != null) {
            v2_9 = v2_8.hashCode();
        } else {
            v2_9 = 0;
        }
        Boolean v2_11;
        int v0_12 = ((v0_9 + v2_9) * 31);
        Boolean v2_10 = this.watermarkV2Enabled;
        if (v2_10 != null) {
            v2_11 = v2_10.hashCode();
        } else {
            v2_11 = 0;
        }
        Boolean v2_14;
        int v0_14 = ((v0_12 + v2_11) * 31);
        Boolean v2_13 = this.presetSavePreviewApplyExportEnabled;
        if (v2_13 != null) {
            v2_14 = v2_13.hashCode();
        } else {
            v2_14 = 0;
        }
        Boolean v2_16;
        int v0_16 = ((v0_14 + v2_14) * 31);
        Boolean v2_15 = this.creatorProgramEnabled;
        if (v2_15 != null) {
            v2_16 = v2_15.hashCode();
        } else {
            v2_16 = 0;
        }
        Boolean v2_18;
        int v0_18 = ((v0_16 + v2_16) * 31);
        Boolean v2_17 = this.creatorProgramStandby;
        if (v2_17 != null) {
            v2_18 = v2_17.hashCode();
        } else {
            v2_18 = 0;
        }
        Boolean v2_20;
        int v0_20 = ((v0_18 + v2_18) * 31);
        Boolean v2_19 = this.creatorProgramRewardList;
        if (v2_19 != null) {
            v2_20 = v2_19.hashCode();
        } else {
            v2_20 = 0;
        }
        Boolean v2_23;
        int v0_22 = ((v0_20 + v2_20) * 31);
        Boolean v2_21 = this.mdtContentLibraryEnabled;
        if (v2_21 != null) {
            v2_23 = v2_21.hashCode();
        } else {
            v2_23 = 0;
        }
        Boolean v2_25;
        int v0_24 = ((v0_22 + v2_23) * 31);
        Boolean v2_24 = this.mdtContentLibraryRandomized;
        if (v2_24 != null) {
            v2_25 = v2_24.hashCode();
        } else {
            v2_25 = 0;
        }
        Boolean v2_27;
        int v0_26 = ((v0_24 + v2_25) * 31);
        Boolean v2_26 = this.creatorRankingEnabled;
        if (v2_26 != null) {
            v2_27 = v2_26.hashCode();
        } else {
            v2_27 = 0;
        }
        Boolean v2_29;
        int v0_28 = ((v0_26 + v2_27) * 31);
        Boolean v2_28 = this.creatorRankingStandby;
        if (v2_28 != null) {
            v2_29 = v2_28.hashCode();
        } else {
            v2_29 = 0;
        }
        Boolean v2_31;
        int v0_31 = ((v0_28 + v2_29) * 31);
        Boolean v2_30 = this.technicalEvents;
        if (v2_30 != null) {
            v2_31 = v2_30.hashCode();
        } else {
            v2_31 = 0;
        }
        Boolean v2_33;
        int v0_34 = ((v0_31 + v2_31) * 31);
        Boolean v2_32 = this.profilingEvents;
        if (v2_32 != null) {
            v2_33 = v2_32.hashCode();
        } else {
            v2_33 = 0;
        }
        Boolean v2_36;
        int v0_36 = ((v0_34 + v2_33) * 31);
        Boolean v2_35 = this.upsellPaywallShowPriceDifferences;
        if (v2_35 != null) {
            v2_36 = v2_35.hashCode();
        } else {
            v2_36 = 0;
        }
        Boolean v2_38;
        int v0_38 = ((v0_36 + v2_36) * 31);
        Boolean v2_37 = this.analyticsLogsEnabled;
        if (v2_37 != null) {
            v2_38 = v2_37.hashCode();
        } else {
            v2_38 = 0;
        }
        Boolean v2_40;
        int v0_40 = ((v0_38 + v2_38) * 31);
        Boolean v2_39 = this.paywallCardsUsePremiumLiteNames;
        if (v2_39 != null) {
            v2_40 = v2_39.hashCode();
        } else {
            v2_40 = 0;
        }
        Boolean v2_42;
        int v0_42 = ((v0_40 + v2_40) * 31);
        Boolean v2_41 = this.playfulUnlockDesign;
        if (v2_41 != null) {
            v2_42 = v2_41.hashCode();
        } else {
            v2_42 = 0;
        }
        Boolean v2_45;
        int v0_44 = ((v0_42 + v2_42) * 31);
        Boolean v2_43 = this.playfulUnlockCanDismissEarly;
        if (v2_43 != null) {
            v2_45 = v2_43.hashCode();
        } else {
            v2_45 = 0;
        }
        Boolean v2_47;
        int v0_46 = ((v0_44 + v2_45) * 31);
        Boolean v2_46 = this.paywallCardsPriceInCards;
        if (v2_46 != null) {
            v2_47 = v2_46.hashCode();
        } else {
            v2_47 = 0;
        }
        Boolean v2_49;
        int v0_48 = ((v0_46 + v2_47) * 31);
        Boolean v2_48 = this.shouldHideHomepageUntilFirstHook;
        if (v2_48 != null) {
            v2_49 = v2_48.hashCode();
        } else {
            v2_49 = 0;
        }
        Boolean v2_51;
        int v0_50 = ((v0_48 + v2_49) * 31);
        Boolean v2_50 = this.specialEventLicensesEnabled;
        if (v2_50 != null) {
            v2_51 = v2_50.hashCode();
        } else {
            v2_51 = 0;
        }
        Boolean v2_53;
        int v0_53 = ((v0_50 + v2_51) * 31);
        Boolean v2_52 = this.admobCmpEnabled;
        if (v2_52 != null) {
            v2_53 = v2_52.hashCode();
        } else {
            v2_53 = 0;
        }
        Boolean v2_55;
        int v0_56 = ((v0_53 + v2_53) * 31);
        Boolean v2_54 = this.stackedIntroOffers;
        if (v2_54 != null) {
            v2_55 = v2_54.hashCode();
        } else {
            v2_55 = 0;
        }
        Boolean v2_58;
        int v0_58 = ((v0_56 + v2_55) * 31);
        Boolean v2_57 = this.adMediationProvider;
        if (v2_57 != null) {
            v2_58 = v2_57.hashCode();
        } else {
            v2_58 = 0;
        }
        Boolean v2_60;
        int v0_60 = ((v0_58 + v2_58) * 31);
        Boolean v2_59 = this.admobInterstitialAdUnitId;
        if (v2_59 != null) {
            v2_60 = v2_59.hashCode();
        } else {
            v2_60 = 0;
        }
        Boolean v2_62;
        int v0_62 = ((v0_60 + v2_60) * 31);
        Boolean v2_61 = this.admobRewardedAdUnitId;
        if (v2_61 != null) {
            v2_62 = v2_61.hashCode();
        } else {
            v2_62 = 0;
        }
        Boolean v2_64;
        int v0_64 = ((v0_62 + v2_62) * 31);
        Boolean v2_63 = this.isInjetEnabled;
        if (v2_63 != null) {
            v2_64 = v2_63.hashCode();
        } else {
            v2_64 = 0;
        }
        Boolean v2_67;
        int v0_66 = ((v0_64 + v2_64) * 31);
        Boolean v2_65 = this.injetVersioningFileUrl;
        if (v2_65 != null) {
            v2_67 = v2_65.hashCode();
        } else {
            v2_67 = 0;
        }
        Boolean v2_69;
        int v0_68 = ((v0_66 + v2_67) * 31);
        Boolean v2_68 = this.isNewTemplatesExperienceEnabled;
        if (v2_68 != null) {
            v2_69 = v2_68.hashCode();
        } else {
            v2_69 = 0;
        }
        int v0_70 = ((v0_68 + v2_69) * 31);
        Boolean v2_70 = this.koreanOnboardingFlowEnabled;
        if (v2_70 != null) {
            v1 = v2_70.hashCode();
        }
        return (v0_70 + v1);
    }

    public final Boolean isInjetEnabled()
    {
        return Boolean.FALSE;
    }

    public final Boolean isNewTemplatesExperienceEnabled()
    {
        return this.isNewTemplatesExperienceEnabled;
    }

    public final Boolean isTryItFirstAvailable()
    {
        return this.isTryItFirstAvailable;
    }

    public String toString()
    {
        String v1_0 = this.crisperScript;
        Boolean v2 = this.onboardingShowCards;
        Boolean v3 = this.onboardingShowSkipButton;
        Boolean v4 = this.isTryItFirstAvailable;
        String v5 = this.adsExperience;
        String v6 = this.landingTab;
        String v7 = this.navigationBar;
        java.util.List v8 = this.exportMenuItems;
        java.util.List v9 = this.exportMenuItemsMultishare;
        java.util.List v10 = this.featuresWithNewBadge;
        Boolean v11 = this.signInDisabledPPImport;
        Boolean v12 = this.shareEligibilityWatchAdsEnabled;
        Integer v13 = this.shareEligibilityWatchAdsCap;
        Boolean v14 = this.templateExportToggleEnabled;
        String v16 = this.exportedVideoAttachment;
        Integer v17 = this.defaultResolutionProjectCreation;
        Boolean v18 = this.templateRevampedImportFlowEnabled;
        Boolean v19 = this.xmlImportEnabled;
        Boolean v20 = this.newWatermarkDesign;
        Boolean v21 = this.watermarkV2Enabled;
        Boolean v22 = this.presetSavePreviewApplyExportEnabled;
        Boolean v23 = this.creatorProgramEnabled;
        Boolean v24 = this.creatorProgramStandby;
        java.util.List v25 = this.creatorProgramRewardList;
        Boolean v26 = this.mdtContentLibraryEnabled;
        Boolean v27 = this.mdtContentLibraryRandomized;
        Boolean v28 = this.creatorRankingEnabled;
        Boolean v29 = this.creatorRankingStandby;
        java.util.List v30 = this.technicalEvents;
        java.util.List v31 = this.profilingEvents;
        Boolean v32 = this.upsellPaywallShowPriceDifferences;
        Boolean v33 = this.analyticsLogsEnabled;
        Boolean v34 = this.paywallCardsUsePremiumLiteNames;
        String v35 = this.playfulUnlockDesign;
        Boolean v36 = this.playfulUnlockCanDismissEarly;
        Boolean v37 = this.paywallCardsPriceInCards;
        Boolean v38 = this.shouldHideHomepageUntilFirstHook;
        Boolean v39 = this.specialEventLicensesEnabled;
        Boolean v40 = this.admobCmpEnabled;
        com.alightcreative.monorepo.settings.StackedIntroOffersEntity v41 = this.stackedIntroOffers;
        String v42 = this.adMediationProvider;
        String v43 = this.admobInterstitialAdUnitId;
        String v44 = this.admobRewardedAdUnitId;
        Boolean v45 = this.isInjetEnabled;
        String v46 = this.injetVersioningFileUrl;
        Boolean v47 = this.isNewTemplatesExperienceEnabled;
        String v15_32 = this.koreanOnboardingFlowEnabled;
        String v0_3 = new StringBuilder();
        Boolean v48 = v15_32;
        v0_3.append("AlightSettingsEntity(crisperScript=");
        v0_3.append(v1_0);
        v0_3.append(", onboardingShowCards=");
        v0_3.append(v2);
        v0_3.append(", onboardingShowSkipButton=");
        v0_3.append(v3);
        v0_3.append(", isTryItFirstAvailable=");
        v0_3.append(v4);
        v0_3.append(", adsExperience=");
        v0_3.append(v5);
        v0_3.append(", landingTab=");
        v0_3.append(v6);
        v0_3.append(", navigationBar=");
        v0_3.append(v7);
        v0_3.append(", exportMenuItems=");
        v0_3.append(v8);
        v0_3.append(", exportMenuItemsMultishare=");
        v0_3.append(v9);
        v0_3.append(", featuresWithNewBadge=");
        v0_3.append(v10);
        v0_3.append(", signInDisabledPPImport=");
        v0_3.append(v11);
        v0_3.append(", shareEligibilityWatchAdsEnabled=");
        v0_3.append(v12);
        v0_3.append(", shareEligibilityWatchAdsCap=");
        v0_3.append(v13);
        v0_3.append(", templateExportToggleEnabled=");
        v0_3.append(v14);
        v0_3.append(", exportedVideoAttachment=");
        v0_3.append(v16);
        v0_3.append(", defaultResolutionProjectCreation=");
        v0_3.append(v17);
        v0_3.append(", templateRevampedImportFlowEnabled=");
        v0_3.append(v18);
        v0_3.append(", xmlImportEnabled=");
        v0_3.append(v19);
        v0_3.append(", newWatermarkDesign=");
        v0_3.append(v20);
        v0_3.append(", watermarkV2Enabled=");
        v0_3.append(v21);
        v0_3.append(", presetSavePreviewApplyExportEnabled=");
        v0_3.append(v22);
        v0_3.append(", creatorProgramEnabled=");
        v0_3.append(v23);
        v0_3.append(", creatorProgramStandby=");
        v0_3.append(v24);
        v0_3.append(", creatorProgramRewardList=");
        v0_3.append(v25);
        v0_3.append(", mdtContentLibraryEnabled=");
        v0_3.append(v26);
        v0_3.append(", mdtContentLibraryRandomized=");
        v0_3.append(v27);
        v0_3.append(", creatorRankingEnabled=");
        v0_3.append(v28);
        v0_3.append(", creatorRankingStandby=");
        v0_3.append(v29);
        v0_3.append(", technicalEvents=");
        v0_3.append(v30);
        v0_3.append(", profilingEvents=");
        v0_3.append(v31);
        v0_3.append(", upsellPaywallShowPriceDifferences=");
        v0_3.append(v32);
        v0_3.append(", analyticsLogsEnabled=");
        v0_3.append(v33);
        v0_3.append(", paywallCardsUsePremiumLiteNames=");
        v0_3.append(v34);
        v0_3.append(", playfulUnlockDesign=");
        v0_3.append(v35);
        v0_3.append(", playfulUnlockCanDismissEarly=");
        v0_3.append(v36);
        v0_3.append(", paywallCardsPriceInCards=");
        v0_3.append(v37);
        v0_3.append(", shouldHideHomepageUntilFirstHook=");
        v0_3.append(v38);
        v0_3.append(", specialEventLicensesEnabled=");
        v0_3.append(v39);
        v0_3.append(", admobCmpEnabled=");
        v0_3.append(v40);
        v0_3.append(", stackedIntroOffers=");
        v0_3.append(v41);
        v0_3.append(", adMediationProvider=");
        v0_3.append(v42);
        v0_3.append(", admobInterstitialAdUnitId=");
        v0_3.append(v43);
        v0_3.append(", admobRewardedAdUnitId=");
        v0_3.append(v44);
        v0_3.append(", isInjetEnabled=");
        v0_3.append(v45);
        v0_3.append(", injetVersioningFileUrl=");
        v0_3.append(v46);
        v0_3.append(", isNewTemplatesExperienceEnabled=");
        v0_3.append(v47);
        v0_3.append(", koreanOnboardingFlowEnabled=");
        v0_3.append(v48);
        v0_3.append(")");
        return v0_3.toString();
    }
}
