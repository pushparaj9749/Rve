package com.alightcreative.app.motion.scene.visualeffect;
public final class VisualEffect extends com.alightcreative.app.motion.scene.visualeffect.OptionalVisualEffect {
    public static final int $stable = 8;
    private final java.util.Set affinity;
    private final boolean autoTransform;
    private final android.net.Uri backgroundImage;
    private final java.util.List categories;
    private final String categoryId;
    private final boolean deprecated;
    private final String desc;
    private final boolean experimental;
    private final boolean hasOverdaw;
    private final String id;
    private final boolean internal;
    private final int iterCount;
    private final String iterParam;
    private final Rv.A localizedStrings;
    private final float maxOverdraw;
    private final String name;
    private final java.util.List packagedPresets;
    private final java.util.List parameters;
    private final kotlin.Lazy paramsById$delegate;
    private final java.util.List passes;
    private final java.util.List scripts;
    private final java.util.Map shaderGroups;
    private final java.util.List tags;
    private final android.net.Uri thumbnail;
    private final com.alightcreative.app.motion.scene.visualeffect.EffectType type;
    private final android.net.Uri uri;

    static VisualEffect()
    {
        return;
    }

    public VisualEffect(String p17, String p18, String p19, java.util.List p20, Rv.A p21, java.util.Map p22, java.util.List p23, java.util.List p24, android.net.Uri p25, com.alightcreative.app.motion.scene.visualeffect.EffectType p26, boolean p27, boolean p28, boolean p29, java.util.List p30, String p31, java.util.List p32, java.util.Set p33, java.util.List p34, android.net.Uri p35, android.net.Uri p36, int p37, String p38, boolean p39, float p40, boolean p41)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "desc");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p20, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p21, "localizedStrings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p22, "shaderGroups");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p23, "scripts");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p24, "passes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p25, "uri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p26, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p30, "packagedPresets");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p31, "categoryId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p32, "tags");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p33, "affinity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p34, "categories");
        com.alightcreative.app.motion.scene.visualeffect.VisualEffect v15_2 = super(0);
        v15_2.id = p17;
        v15_2.name = p18;
        v15_2.desc = p19;
        v15_2.parameters = p20;
        v15_2.localizedStrings = p21;
        v15_2.shaderGroups = p22;
        v15_2.scripts = p23;
        v15_2.passes = p24;
        v15_2.uri = p25;
        v15_2.type = p26;
        v15_2.internal = p27;
        v15_2.deprecated = p28;
        v15_2.experimental = p29;
        v15_2.packagedPresets = p30;
        v15_2.categoryId = p31;
        v15_2.tags = p32;
        v15_2.affinity = p33;
        v15_2.categories = p34;
        v15_2.thumbnail = p35;
        v15_2.backgroundImage = p36;
        v15_2.iterCount = p37;
        v15_2.iterParam = p38;
        v15_2.hasOverdaw = p39;
        v15_2.maxOverdraw = p40;
        v15_2.autoTransform = p41;
        v15_2.paramsById$delegate = kotlin.LazyKt.lazy(new com.alightcreative.app.motion.scene.visualeffect.xfY(v15_2));
        return;
    }

    public static synthetic com.alightcreative.app.motion.scene.visualeffect.VisualEffect copy$default(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p17, String p18, String p19, String p20, java.util.List p21, Rv.A p22, java.util.Map p23, java.util.List p24, java.util.List p25, android.net.Uri p26, com.alightcreative.app.motion.scene.visualeffect.EffectType p27, boolean p28, boolean p29, boolean p30, java.util.List p31, String p32, java.util.List p33, java.util.Set p34, java.util.List p35, android.net.Uri p36, android.net.Uri p37, int p38, String p39, boolean p40, float p41, boolean p42, int p43, Object p44)
    {
        String v2_1;
        if ((p43 & 1) == 0) {
            v2_1 = p18;
        } else {
            v2_1 = p17.id;
        }
        String v3_1;
        if ((p43 & 2) == 0) {
            v3_1 = p19;
        } else {
            v3_1 = p17.name;
        }
        String v4_1;
        if ((p43 & 4) == 0) {
            v4_1 = p20;
        } else {
            v4_1 = p17.desc;
        }
        java.util.List v5_1;
        if ((p43 & 8) == 0) {
            v5_1 = p21;
        } else {
            v5_1 = p17.parameters;
        }
        Rv.A v6_1;
        if ((p43 & 16) == 0) {
            v6_1 = p22;
        } else {
            v6_1 = p17.localizedStrings;
        }
        java.util.Map v7_1;
        if ((p43 & 32) == 0) {
            v7_1 = p23;
        } else {
            v7_1 = p17.shaderGroups;
        }
        java.util.List v8_1;
        if ((p43 & 64) == 0) {
            v8_1 = p24;
        } else {
            v8_1 = p17.scripts;
        }
        java.util.List v9_1;
        if ((p43 & 128) == 0) {
            v9_1 = p25;
        } else {
            v9_1 = p17.passes;
        }
        android.net.Uri v10_1;
        if ((p43 & 256) == 0) {
            v10_1 = p26;
        } else {
            v10_1 = p17.uri;
        }
        com.alightcreative.app.motion.scene.visualeffect.EffectType v11_1;
        if ((p43 & 512) == 0) {
            v11_1 = p27;
        } else {
            v11_1 = p17.type;
        }
        boolean v12_1;
        if ((p43 & 1024) == 0) {
            v12_1 = p28;
        } else {
            v12_1 = p17.internal;
        }
        boolean v13_1;
        if ((p43 & 2048) == 0) {
            v13_1 = p29;
        } else {
            v13_1 = p17.deprecated;
        }
        boolean v14_1;
        if ((p43 & 4096) == 0) {
            v14_1 = p30;
        } else {
            v14_1 = p17.experimental;
        }
        java.util.List v15_1;
        if ((p43 & 8192) == 0) {
            v15_1 = p31;
        } else {
            v15_1 = p17.packagedPresets;
        }
        String v2_3;
        if ((p43 & 16384) == 0) {
            v2_3 = p32;
        } else {
            v2_3 = p17.categoryId;
        }
        boolean v1_5;
        if ((p43 & 32768) == 0) {
            v1_5 = p33;
        } else {
            v1_5 = p17.tags;
        }
        boolean v1_6;
        if ((p43 & 65536) == 0) {
            v1_6 = p34;
        } else {
            v1_6 = p17.affinity;
        }
        boolean v1_7;
        if ((p43 & 131072) == 0) {
            v1_7 = p35;
        } else {
            v1_7 = p17.categories;
        }
        boolean v1_8;
        if ((p43 & 262144) == 0) {
            v1_8 = p36;
        } else {
            v1_8 = p17.thumbnail;
        }
        boolean v1_9;
        if ((p43 & 524288) == 0) {
            v1_9 = p37;
        } else {
            v1_9 = p17.backgroundImage;
        }
        boolean v1_10;
        if ((p43 & 1048576) == 0) {
            v1_10 = p38;
        } else {
            v1_10 = p17.iterCount;
        }
        boolean v1_1;
        if ((p43 & 2097152) == 0) {
            v1_1 = p39;
        } else {
            v1_1 = p17.iterParam;
        }
        boolean v1_2;
        if ((p43 & 4194304) == 0) {
            v1_2 = p40;
        } else {
            v1_2 = p17.hasOverdaw;
        }
        boolean v1_3;
        if ((p43 & 8388608) == 0) {
            v1_3 = p41;
        } else {
            v1_3 = p17.maxOverdraw;
        }
        boolean v42_1;
        float v43_1;
        if ((p43 & 16777216) == 0) {
            v43_1 = p42;
            v42_1 = v1_3;
        } else {
            v42_1 = v1_3;
            v43_1 = p17.autoTransform;
        }
        return p17.copy(v2_1, v3_1, v4_1, v5_1, v6_1, v7_1, v8_1, v9_1, v10_1, v11_1, v12_1, v13_1, v14_1, v15_1, v2_3, v1_5, v1_6, v1_7, v1_8, v1_9, v1_10, v1_1, v1_2, v42_1, v43_1);
    }

    public static synthetic java.util.Map hUw(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p0)
    {
        return com.alightcreative.app.motion.scene.visualeffect.VisualEffect.paramsById_delegate$lambda$1(p0);
    }

    private static final java.util.Map paramsById_delegate$lambda$1(com.alightcreative.app.motion.scene.visualeffect.VisualEffect p3)
    {
        java.util.Iterator v3_1 = p3.parameters;
        java.util.LinkedHashMap v1_0 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v3_1, 10)), 16));
        java.util.Iterator v3_2 = v3_1.iterator();
        while (v3_2.hasNext()) {
            Object v0_2 = v3_2.next();
            v1_0.put(((com.alightcreative.app.motion.scene.userparam.UserParameter) v0_2).getName(), v0_2);
        }
        return v1_0;
    }

    public final String component1()
    {
        return this.id;
    }

    public final com.alightcreative.app.motion.scene.visualeffect.EffectType component10()
    {
        return this.type;
    }

    public final boolean component11()
    {
        return this.internal;
    }

    public final boolean component12()
    {
        return this.deprecated;
    }

    public final boolean component13()
    {
        return this.experimental;
    }

    public final java.util.List component14()
    {
        return this.packagedPresets;
    }

    public final String component15()
    {
        return this.categoryId;
    }

    public final java.util.List component16()
    {
        return this.tags;
    }

    public final java.util.Set component17()
    {
        return this.affinity;
    }

    public final java.util.List component18()
    {
        return this.categories;
    }

    public final android.net.Uri component19()
    {
        return this.thumbnail;
    }

    public final String component2()
    {
        return this.name;
    }

    public final android.net.Uri component20()
    {
        return this.backgroundImage;
    }

    public final int component21()
    {
        return this.iterCount;
    }

    public final String component22()
    {
        return this.iterParam;
    }

    public final boolean component23()
    {
        return this.hasOverdaw;
    }

    public final float component24()
    {
        return this.maxOverdraw;
    }

    public final boolean component25()
    {
        return this.autoTransform;
    }

    public final String component3()
    {
        return this.desc;
    }

    public final java.util.List component4()
    {
        return this.parameters;
    }

    public final Rv.A component5()
    {
        return this.localizedStrings;
    }

    public final java.util.Map component6()
    {
        return this.shaderGroups;
    }

    public final java.util.List component7()
    {
        return this.scripts;
    }

    public final java.util.List component8()
    {
        return this.passes;
    }

    public final android.net.Uri component9()
    {
        return this.uri;
    }

    public final com.alightcreative.app.motion.scene.visualeffect.VisualEffect copy(String p28, String p29, String p30, java.util.List p31, Rv.A p32, java.util.Map p33, java.util.List p34, java.util.List p35, android.net.Uri p36, com.alightcreative.app.motion.scene.visualeffect.EffectType p37, boolean p38, boolean p39, boolean p40, java.util.List p41, String p42, java.util.List p43, java.util.Set p44, java.util.List p45, android.net.Uri p46, android.net.Uri p47, int p48, String p49, boolean p50, float p51, boolean p52)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p28, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p29, "name");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p30, "desc");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p31, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p32, "localizedStrings");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p33, "shaderGroups");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p34, "scripts");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p35, "passes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p36, "uri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p37, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p41, "packagedPresets");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p42, "categoryId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p43, "tags");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p44, "affinity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p45, "categories");
        return new com.alightcreative.app.motion.scene.visualeffect.VisualEffect(p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50, p51, p52);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.app.motion.scene.visualeffect.VisualEffect)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).id)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).name)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.desc, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).desc)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.parameters, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).parameters)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.localizedStrings, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).localizedStrings)) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.shaderGroups, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).shaderGroups)) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.scripts, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).scripts)) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.passes, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).passes)) {
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.uri, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).uri)) {
                                                    if (this.type == ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).type) {
                                                        if (this.internal == ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).internal) {
                                                            if (this.deprecated == ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).deprecated) {
                                                                if (this.experimental == ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).experimental) {
                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.packagedPresets, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).packagedPresets)) {
                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.categoryId, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).categoryId)) {
                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.tags, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).tags)) {
                                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.affinity, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).affinity)) {
                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.categories, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).categories)) {
                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnail, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).thumbnail)) {
                                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundImage, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).backgroundImage)) {
                                                                                                if (this.iterCount == ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).iterCount) {
                                                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.iterParam, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).iterParam)) {
                                                                                                        if (this.hasOverdaw == ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).hasOverdaw) {
                                                                                                            if (Float.compare(this.maxOverdraw, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).maxOverdraw) == 0) {
                                                                                                                if (this.autoTransform == ((com.alightcreative.app.motion.scene.visualeffect.VisualEffect) p5).autoTransform) {
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
            return 1;
        }
    }

    public final java.util.Set getAffinity()
    {
        return this.affinity;
    }

    public final boolean getAutoTransform()
    {
        return this.autoTransform;
    }

    public final android.net.Uri getBackgroundImage()
    {
        return this.backgroundImage;
    }

    public final java.util.List getCategories()
    {
        return this.categories;
    }

    public final String getCategoryId()
    {
        return this.categoryId;
    }

    public final boolean getDeprecated()
    {
        return this.deprecated;
    }

    public final String getDesc()
    {
        return this.desc;
    }

    public final boolean getExperimental()
    {
        return this.experimental;
    }

    public final boolean getHasOverdaw()
    {
        return this.hasOverdaw;
    }

    public final String getId()
    {
        return this.id;
    }

    public final boolean getInternal()
    {
        return this.internal;
    }

    public final int getIterCount()
    {
        return this.iterCount;
    }

    public final String getIterParam()
    {
        return this.iterParam;
    }

    public final Rv.A getLocalizedStrings()
    {
        return this.localizedStrings;
    }

    public final float getMaxOverdraw()
    {
        return this.maxOverdraw;
    }

    public final String getName()
    {
        return this.name;
    }

    public final java.util.List getPackagedPresets()
    {
        return this.packagedPresets;
    }

    public final java.util.List getParameters()
    {
        return this.parameters;
    }

    public final java.util.Map getParamsById()
    {
        return ((java.util.Map) this.paramsById$delegate.getValue());
    }

    public final java.util.List getPasses()
    {
        return this.passes;
    }

    public final java.util.List getScripts()
    {
        return this.scripts;
    }

    public final java.util.Map getShaderGroups()
    {
        return this.shaderGroups;
    }

    public final java.util.List getTags()
    {
        return this.tags;
    }

    public final android.net.Uri getThumbnail()
    {
        return this.thumbnail;
    }

    public final com.alightcreative.app.motion.scene.visualeffect.EffectType getType()
    {
        return this.type;
    }

    public final android.net.Uri getUri()
    {
        return this.uri;
    }

    public int hashCode()
    {
        int v1_45;
        int v0_47 = (((((((((((((((((((((((((((((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.localizedStrings.hashCode()) * 31) + this.shaderGroups.hashCode()) * 31) + this.scripts.hashCode()) * 31) + this.passes.hashCode()) * 31) + this.uri.hashCode()) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.internal)) * 31) + Boolean.hashCode(this.deprecated)) * 31) + Boolean.hashCode(this.experimental)) * 31) + this.packagedPresets.hashCode()) * 31) + this.categoryId.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.affinity.hashCode()) * 31) + this.categories.hashCode()) * 31);
        int v1_43 = this.thumbnail;
        int v2 = 0;
        if (v1_43 != 0) {
            v1_45 = v1_43.hashCode();
        } else {
            v1_45 = 0;
        }
        int v1_0;
        int v0_49 = ((v0_47 + v1_45) * 31);
        int v1_46 = this.backgroundImage;
        if (v1_46 != 0) {
            v1_0 = v1_46.hashCode();
        } else {
            v1_0 = 0;
        }
        int v0_4 = ((((v0_49 + v1_0) * 31) + Integer.hashCode(this.iterCount)) * 31);
        int v1_3 = this.iterParam;
        if (v1_3 != 0) {
            v2 = v1_3.hashCode();
        }
        return (((((((v0_4 + v2) * 31) + Boolean.hashCode(this.hasOverdaw)) * 31) + Float.hashCode(this.maxOverdraw)) * 31) + Boolean.hashCode(this.autoTransform));
    }

    public String toString()
    {
        String v1_0 = this.id;
        String v2 = this.name;
        String v3 = this.desc;
        java.util.List v4 = this.parameters;
        Rv.A v5 = this.localizedStrings;
        java.util.Map v6 = this.shaderGroups;
        java.util.List v7 = this.scripts;
        java.util.List v8 = this.passes;
        android.net.Uri v9 = this.uri;
        com.alightcreative.app.motion.scene.visualeffect.EffectType v10 = this.type;
        boolean v11 = this.internal;
        boolean v12 = this.deprecated;
        boolean v13 = this.experimental;
        java.util.List v14 = this.packagedPresets;
        String v16 = this.categoryId;
        java.util.List v17 = this.tags;
        java.util.Set v18 = this.affinity;
        java.util.List v19 = this.categories;
        android.net.Uri v20 = this.thumbnail;
        android.net.Uri v21 = this.backgroundImage;
        int v22 = this.iterCount;
        String v23 = this.iterParam;
        boolean v24 = this.hasOverdaw;
        float v25 = this.maxOverdraw;
        String v15_10 = this.autoTransform;
        String v0_3 = new StringBuilder();
        boolean v26 = v15_10;
        v0_3.append("VisualEffect(id=");
        v0_3.append(v1_0);
        v0_3.append(", name=");
        v0_3.append(v2);
        v0_3.append(", desc=");
        v0_3.append(v3);
        v0_3.append(", parameters=");
        v0_3.append(v4);
        v0_3.append(", localizedStrings=");
        v0_3.append(v5);
        v0_3.append(", shaderGroups=");
        v0_3.append(v6);
        v0_3.append(", scripts=");
        v0_3.append(v7);
        v0_3.append(", passes=");
        v0_3.append(v8);
        v0_3.append(", uri=");
        v0_3.append(v9);
        v0_3.append(", type=");
        v0_3.append(v10);
        v0_3.append(", internal=");
        v0_3.append(v11);
        v0_3.append(", deprecated=");
        v0_3.append(v12);
        v0_3.append(", experimental=");
        v0_3.append(v13);
        v0_3.append(", packagedPresets=");
        v0_3.append(v14);
        v0_3.append(", categoryId=");
        v0_3.append(v16);
        v0_3.append(", tags=");
        v0_3.append(v17);
        v0_3.append(", affinity=");
        v0_3.append(v18);
        v0_3.append(", categories=");
        v0_3.append(v19);
        v0_3.append(", thumbnail=");
        v0_3.append(v20);
        v0_3.append(", backgroundImage=");
        v0_3.append(v21);
        v0_3.append(", iterCount=");
        v0_3.append(v22);
        v0_3.append(", iterParam=");
        v0_3.append(v23);
        v0_3.append(", hasOverdaw=");
        v0_3.append(v24);
        v0_3.append(", maxOverdraw=");
        v0_3.append(v25);
        v0_3.append(", autoTransform=");
        v0_3.append(v26);
        v0_3.append(")");
        return v0_3.toString();
    }
}
