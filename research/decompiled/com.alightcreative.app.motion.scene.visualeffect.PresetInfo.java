package com.alightcreative.app.motion.scene.visualeffect;
final class PresetInfo {
    private final String code;
    private final com.alightcreative.app.motion.scene.visualeffect.EffectPreset preset;
    private final java.util.List words;

    public PresetInfo(com.alightcreative.app.motion.scene.visualeffect.EffectPreset p2, String p3, java.util.List p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "preset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "code");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "words");
        this.preset = p2;
        this.code = p3;
        this.words = p4;
        return;
    }

    public synthetic PresetInfo(com.alightcreative.app.motion.scene.visualeffect.EffectPreset p1, String p2, java.util.List p3, int p4, kotlin.jvm.internal.DefaultConstructorMarker p5)
    {
        if ((p4 & 2) != 0) {
            p2 = "";
        }
        this(p1, p2, p3);
        return;
    }

    public static synthetic com.alightcreative.app.motion.scene.visualeffect.PresetInfo copy$default(com.alightcreative.app.motion.scene.visualeffect.PresetInfo p0, com.alightcreative.app.motion.scene.visualeffect.EffectPreset p1, String p2, java.util.List p3, int p4, Object p5)
    {
        if ((p4 & 1) != 0) {
            p1 = p0.preset;
        }
        if ((p4 & 2) != 0) {
            p2 = p0.code;
        }
        if ((p4 & 4) != 0) {
            p3 = p0.words;
        }
        return p0.copy(p1, p2, p3);
    }

    public final com.alightcreative.app.motion.scene.visualeffect.EffectPreset component1()
    {
        return this.preset;
    }

    public final String component2()
    {
        return this.code;
    }

    public final java.util.List component3()
    {
        return this.words;
    }

    public final com.alightcreative.app.motion.scene.visualeffect.PresetInfo copy(com.alightcreative.app.motion.scene.visualeffect.EffectPreset p2, String p3, java.util.List p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "preset");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "code");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "words");
        return new com.alightcreative.app.motion.scene.visualeffect.PresetInfo(p2, p3, p4);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.app.motion.scene.visualeffect.PresetInfo)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.preset, ((com.alightcreative.app.motion.scene.visualeffect.PresetInfo) p5).preset)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.code, ((com.alightcreative.app.motion.scene.visualeffect.PresetInfo) p5).code)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.words, ((com.alightcreative.app.motion.scene.visualeffect.PresetInfo) p5).words)) {
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

    public final String getCode()
    {
        return this.code;
    }

    public final com.alightcreative.app.motion.scene.visualeffect.EffectPreset getPreset()
    {
        return this.preset;
    }

    public final java.util.List getWords()
    {
        return this.words;
    }

    public int hashCode()
    {
        return ((((this.preset.hashCode() * 31) + this.code.hashCode()) * 31) + this.words.hashCode());
    }

    public String toString()
    {
        String v0_0 = this.preset;
        String v1 = this.code;
        java.util.List v2 = this.words;
        StringBuilder v3_1 = new StringBuilder();
        v3_1.append("PresetInfo(preset=");
        v3_1.append(v0_0);
        v3_1.append(", code=");
        v3_1.append(v1);
        v3_1.append(", words=");
        v3_1.append(v2);
        v3_1.append(")");
        return v3_1.toString();
    }
}
