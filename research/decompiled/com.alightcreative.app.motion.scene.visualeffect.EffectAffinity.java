package com.alightcreative.app.motion.scene.visualeffect;
public final class EffectAffinity {
    public static final int $stable;
    public static final com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Companion Companion;
    private final com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength strength;
    private final com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type type;

    static EffectAffinity()
    {
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity.Companion = new com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Companion(0);
        return;
    }

    public EffectAffinity(com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type p2, com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "strength");
        this.type = p2;
        this.strength = p3;
        return;
    }

    public static synthetic com.alightcreative.app.motion.scene.visualeffect.EffectAffinity copy$default(com.alightcreative.app.motion.scene.visualeffect.EffectAffinity p0, com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type p1, com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength p2, int p3, Object p4)
    {
        if ((p3 & 1) != 0) {
            p1 = p0.type;
        }
        if ((p3 & 2) != 0) {
            p2 = p0.strength;
        }
        return p0.copy(p1, p2);
    }

    public final com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type component1()
    {
        return this.type;
    }

    public final com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength component2()
    {
        return this.strength;
    }

    public final com.alightcreative.app.motion.scene.visualeffect.EffectAffinity copy(com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type p2, com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "strength");
        return new com.alightcreative.app.motion.scene.visualeffect.EffectAffinity(p2, p3);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.app.motion.scene.visualeffect.EffectAffinity)) {
                if (this.type == ((com.alightcreative.app.motion.scene.visualeffect.EffectAffinity) p5).type) {
                    if (this.strength == ((com.alightcreative.app.motion.scene.visualeffect.EffectAffinity) p5).strength) {
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

    public final com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength getStrength()
    {
        return this.strength;
    }

    public final com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Type getType()
    {
        return this.type;
    }

    public int hashCode()
    {
        return ((this.type.hashCode() * 31) + this.strength.hashCode());
    }

    public String toString()
    {
        String v0_0 = this.type;
        com.alightcreative.app.motion.scene.visualeffect.EffectAffinity$Strength v1 = this.strength;
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("EffectAffinity(type=");
        v2_1.append(v0_0);
        v2_1.append(", strength=");
        v2_1.append(v1);
        v2_1.append(")");
        return v2_1.toString();
    }
}
