package com.alightcreative.app.motion.scene.visualeffect;
public final class KeyableVisualEffectRef {
    public static final int $stable = 8;
    private int _hashCode;
    private final java.util.Set disabledRenderGroups;
    private final boolean hidden;
    private final String id;
    private final long instanceId;
    private final boolean locallyApplied;
    private final java.util.Map parameters;
    private final int renderGroup;

    static KeyableVisualEffectRef()
    {
        return;
    }

    public KeyableVisualEffectRef(String p2, long p3, java.util.Map p5, int p6, boolean p7, boolean p8, java.util.Set p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "disabledRenderGroups");
        this.id = p2;
        this.instanceId = p3;
        this.parameters = p5;
        this.renderGroup = p6;
        this.hidden = p7;
        this.locallyApplied = p8;
        this.disabledRenderGroups = p9;
        return;
    }

    public synthetic KeyableVisualEffectRef(String p10, long p11, java.util.Map p13, int p14, boolean p15, boolean p16, java.util.Set p17, int p18, kotlin.jvm.internal.DefaultConstructorMarker p19)
    {
        if ((p18 & 4) != 0) {
            p13 = kotlin.collections.MapsKt.emptyMap();
        }
        int v5;
        if ((p18 & 8) == 0) {
            v5 = p14;
        } else {
            v5 = 0;
        }
        boolean v6;
        if ((p18 & 16) == 0) {
            v6 = p15;
        } else {
            v6 = 0;
        }
        boolean v7;
        if ((p18 & 32) == 0) {
            v7 = p16;
        } else {
            v7 = 0;
        }
        java.util.Set v8;
        if ((p18 & 64) == 0) {
            v8 = p17;
        } else {
            v8 = kotlin.collections.SetsKt.emptySet();
        }
        this(p10, p11, p13, v5, v6, v7, v8);
        return;
    }

    public static synthetic com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef copy$default(com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef p0, String p1, long p2, java.util.Map p4, int p5, boolean p6, boolean p7, java.util.Set p8, int p9, Object p10)
    {
        if ((p9 & 1) != 0) {
            p1 = p0.id;
        }
        if ((p9 & 2) != 0) {
            p2 = p0.instanceId;
        }
        if ((p9 & 4) != 0) {
            p4 = p0.parameters;
        }
        if ((p9 & 8) != 0) {
            p5 = p0.renderGroup;
        }
        if ((p9 & 16) != 0) {
            p6 = p0.hidden;
        }
        if ((p9 & 32) != 0) {
            p7 = p0.locallyApplied;
        }
        if ((p9 & 64) != 0) {
            p8 = p0.disabledRenderGroups;
        }
        return p0.copy(p1, p2, p4, p5, p6, p7, p8);
    }

    public final String component1()
    {
        return this.id;
    }

    public final long component2()
    {
        return this.instanceId;
    }

    public final java.util.Map component3()
    {
        return this.parameters;
    }

    public final int component4()
    {
        return this.renderGroup;
    }

    public final boolean component5()
    {
        return this.hidden;
    }

    public final boolean component6()
    {
        return this.locallyApplied;
    }

    public final java.util.Set component7()
    {
        return this.disabledRenderGroups;
    }

    public final com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef copy(String p11, long p12, java.util.Map p14, int p15, boolean p16, boolean p17, java.util.Set p18)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "disabledRenderGroups");
        return new com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef(p11, p12, p14, p15, p16, p17, p18);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            java.util.Set v1_7;
            if (!p8) {
                v1_7 = 0;
            } else {
                v1_7 = p8.getClass();
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef, v1_7)) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(p8, "null cannot be cast to non-null type com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef");
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) p8).id)) {
                    if (this.instanceId == ((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) p8).instanceId) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.parameters, ((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) p8).parameters)) {
                            if (this.renderGroup == ((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) p8).renderGroup) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.disabledRenderGroups, ((com.alightcreative.app.motion.scene.visualeffect.KeyableVisualEffectRef) p8).disabledRenderGroups)) {
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
            return 1;
        }
    }

    public final java.util.Set getDisabledRenderGroups()
    {
        return this.disabledRenderGroups;
    }

    public final boolean getHidden()
    {
        return this.hidden;
    }

    public final String getId()
    {
        return this.id;
    }

    public final long getInstanceId()
    {
        return this.instanceId;
    }

    public final boolean getLocallyApplied()
    {
        return this.locallyApplied;
    }

    public final java.util.Map getParameters()
    {
        return this.parameters;
    }

    public final int getRenderGroup()
    {
        return this.renderGroup;
    }

    public int hashCode()
    {
        int v0_0 = this._hashCode;
        if (v0_0 == 0) {
            int v0_7 = ((((((((this.id.hashCode() * 31) + Long.hashCode(this.instanceId)) * 31) + this.parameters.hashCode()) * 31) + this.renderGroup) * 31) + this.disabledRenderGroups.hashCode());
            this._hashCode = v0_7;
            return v0_7;
        } else {
            return v0_0;
        }
    }

    public String toString()
    {
        String v0_0 = this.id;
        long v1 = this.instanceId;
        java.util.Map v3 = this.parameters;
        int v4 = this.renderGroup;
        boolean v5 = this.hidden;
        boolean v6 = this.locallyApplied;
        java.util.Set v7 = this.disabledRenderGroups;
        StringBuilder v8_1 = new StringBuilder();
        v8_1.append("KeyableVisualEffectRef(id=");
        v8_1.append(v0_0);
        v8_1.append(", instanceId=");
        v8_1.append(v1);
        v8_1.append(", parameters=");
        v8_1.append(v3);
        v8_1.append(", renderGroup=");
        v8_1.append(v4);
        v8_1.append(", hidden=");
        v8_1.append(v5);
        v8_1.append(", locallyApplied=");
        v8_1.append(v6);
        v8_1.append(", disabledRenderGroups=");
        v8_1.append(v7);
        v8_1.append(")");
        return v8_1.toString();
    }
}
