package com.alightcreative.app.motion.scene.visualeffect;
public final class EffectPreset {
    public static final int $stable = 8;
    private final String effectId;
    private final String id;
    private final String label;
    private final java.util.List parseErrors;
    private final String presetSource;
    private final java.util.Map properties;
    private final String shortCode;
    private final int timescale;
    private final com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming timing;

    static EffectPreset()
    {
        return;
    }

    public EffectPreset(String p2, String p3, String p4, int p5, com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming p6, java.util.Map p7, String p8, java.util.List p9, String p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "label");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "shortCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "timing");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "properties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "effectId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "parseErrors");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "presetSource");
        this.id = p2;
        this.label = p3;
        this.shortCode = p4;
        this.timescale = p5;
        this.timing = p6;
        this.properties = p7;
        this.effectId = p8;
        this.parseErrors = p9;
        this.presetSource = p10;
        return;
    }

    public synthetic EffectPreset(String p13, String p14, String p15, int p16, com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming p17, java.util.Map p18, String p19, java.util.List p20, String p21, int p22, kotlin.jvm.internal.DefaultConstructorMarker p23)
    {
        java.util.List v10;
        if ((p22 & 128) == 0) {
            v10 = p20;
        } else {
            v10 = kotlin.collections.CollectionsKt.emptyList();
        }
        String v11;
        if ((p22 & 256) == 0) {
            v11 = p21;
        } else {
            v11 = "";
        }
        this(p13, p14, p15, p16, p17, p18, p19, v10, v11);
        return;
    }

    public static synthetic com.alightcreative.app.motion.scene.visualeffect.EffectPreset copy$default(com.alightcreative.app.motion.scene.visualeffect.EffectPreset p0, String p1, String p2, String p3, int p4, com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming p5, java.util.Map p6, String p7, java.util.List p8, String p9, int p10, Object p11)
    {
        if ((p10 & 1) != 0) {
            p1 = p0.id;
        }
        if ((p10 & 2) != 0) {
            p2 = p0.label;
        }
        if ((p10 & 4) != 0) {
            p3 = p0.shortCode;
        }
        if ((p10 & 8) != 0) {
            p4 = p0.timescale;
        }
        if ((p10 & 16) != 0) {
            p5 = p0.timing;
        }
        if ((p10 & 32) != 0) {
            p6 = p0.properties;
        }
        if ((p10 & 64) != 0) {
            p7 = p0.effectId;
        }
        if ((p10 & 128) != 0) {
            p8 = p0.parseErrors;
        }
        if ((p10 & 256) != 0) {
            p9 = p0.presetSource;
        }
        return p0.copy(p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final String component1()
    {
        return this.id;
    }

    public final String component2()
    {
        return this.label;
    }

    public final String component3()
    {
        return this.shortCode;
    }

    public final int component4()
    {
        return this.timescale;
    }

    public final com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming component5()
    {
        return this.timing;
    }

    public final java.util.Map component6()
    {
        return this.properties;
    }

    public final String component7()
    {
        return this.effectId;
    }

    public final java.util.List component8()
    {
        return this.parseErrors;
    }

    public final String component9()
    {
        return this.presetSource;
    }

    public final com.alightcreative.app.motion.scene.visualeffect.EffectPreset copy(String p12, String p13, String p14, int p15, com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming p16, java.util.Map p17, String p18, java.util.List p19, String p20)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "label");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "shortCode");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "timing");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "properties");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "effectId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "parseErrors");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p20, "presetSource");
        return new com.alightcreative.app.motion.scene.visualeffect.EffectPreset(p12, p13, p14, p15, p16, p17, p18, p19, p20);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.app.motion.scene.visualeffect.EffectPreset)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.alightcreative.app.motion.scene.visualeffect.EffectPreset) p5).id)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.label, ((com.alightcreative.app.motion.scene.visualeffect.EffectPreset) p5).label)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.shortCode, ((com.alightcreative.app.motion.scene.visualeffect.EffectPreset) p5).shortCode)) {
                            if (this.timescale == ((com.alightcreative.app.motion.scene.visualeffect.EffectPreset) p5).timescale) {
                                if (this.timing == ((com.alightcreative.app.motion.scene.visualeffect.EffectPreset) p5).timing) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.properties, ((com.alightcreative.app.motion.scene.visualeffect.EffectPreset) p5).properties)) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.effectId, ((com.alightcreative.app.motion.scene.visualeffect.EffectPreset) p5).effectId)) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.parseErrors, ((com.alightcreative.app.motion.scene.visualeffect.EffectPreset) p5).parseErrors)) {
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.presetSource, ((com.alightcreative.app.motion.scene.visualeffect.EffectPreset) p5).presetSource)) {
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
            return 1;
        }
    }

    public final String getEffectId()
    {
        return this.effectId;
    }

    public final String getId()
    {
        return this.id;
    }

    public final String getLabel()
    {
        return this.label;
    }

    public final java.util.List getParseErrors()
    {
        return this.parseErrors;
    }

    public final String getPresetSource()
    {
        return this.presetSource;
    }

    public final java.util.Map getProperties()
    {
        return this.properties;
    }

    public final String getShortCode()
    {
        return this.shortCode;
    }

    public final int getTimescale()
    {
        return this.timescale;
    }

    public final com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming getTiming()
    {
        return this.timing;
    }

    public int hashCode()
    {
        return ((((((((((((((((this.id.hashCode() * 31) + this.label.hashCode()) * 31) + this.shortCode.hashCode()) * 31) + Integer.hashCode(this.timescale)) * 31) + this.timing.hashCode()) * 31) + this.properties.hashCode()) * 31) + this.effectId.hashCode()) * 31) + this.parseErrors.hashCode()) * 31) + this.presetSource.hashCode());
    }

    public String toString()
    {
        String v0_0 = this.id;
        String v1 = this.label;
        String v2 = this.shortCode;
        int v3 = this.timescale;
        com.alightcreative.app.motion.scene.visualeffect.EffectPresetTiming v4 = this.timing;
        java.util.Map v5 = this.properties;
        String v6 = this.effectId;
        java.util.List v7 = this.parseErrors;
        String v8 = this.presetSource;
        StringBuilder v9_0 = new StringBuilder();
        v9_0.append("EffectPreset(id=");
        v9_0.append(v0_0);
        v9_0.append(", label=");
        v9_0.append(v1);
        v9_0.append(", shortCode=");
        v9_0.append(v2);
        v9_0.append(", timescale=");
        v9_0.append(v3);
        v9_0.append(", timing=");
        v9_0.append(v4);
        v9_0.append(", properties=");
        v9_0.append(v5);
        v9_0.append(", effectId=");
        v9_0.append(v6);
        v9_0.append(", parseErrors=");
        v9_0.append(v7);
        v9_0.append(", presetSource=");
        v9_0.append(v8);
        v9_0.append(")");
        return v9_0.toString();
    }
}
