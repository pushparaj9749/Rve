package com.alightcreative.app.motion.scene.visualeffect;
public final class VisualEffectRef {
    public static final int $stable = 8;
    private final java.util.Set disabledRenderGroups;
    private final String id;
    private final java.util.Map parameters;
    private final int renderGroup;

    static VisualEffectRef()
    {
        return;
    }

    public VisualEffectRef(String p2, java.util.Map p3, int p4, java.util.Set p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "disabledRenderGroups");
        this.id = p2;
        this.parameters = p3;
        this.renderGroup = p4;
        this.disabledRenderGroups = p5;
        return;
    }

    public synthetic VisualEffectRef(String p1, java.util.Map p2, int p3, java.util.Set p4, int p5, kotlin.jvm.internal.DefaultConstructorMarker p6)
    {
        if ((p5 & 2) != 0) {
            p2 = kotlin.collections.MapsKt.emptyMap();
        }
        this(p1, p2, p3, p4);
        return;
    }

    public static synthetic com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef copy$default(com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef p0, String p1, java.util.Map p2, int p3, java.util.Set p4, int p5, Object p6)
    {
        if ((p5 & 1) != 0) {
            p1 = p0.id;
        }
        if ((p5 & 2) != 0) {
            p2 = p0.parameters;
        }
        if ((p5 & 4) != 0) {
            p3 = p0.renderGroup;
        }
        if ((p5 & 8) != 0) {
            p4 = p0.disabledRenderGroups;
        }
        return p0.copy(p1, p2, p3, p4);
    }

    public final String component1()
    {
        return this.id;
    }

    public final java.util.Map component2()
    {
        return this.parameters;
    }

    public final int component3()
    {
        return this.renderGroup;
    }

    public final java.util.Set component4()
    {
        return this.disabledRenderGroups;
    }

    public final com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef copy(String p2, java.util.Map p3, int p4, java.util.Set p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "parameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "disabledRenderGroups");
        return new com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef(p2, p3, p4, p5);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef) p5).id)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.parameters, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef) p5).parameters)) {
                        if (this.renderGroup == ((com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef) p5).renderGroup) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.disabledRenderGroups, ((com.alightcreative.app.motion.scene.visualeffect.VisualEffectRef) p5).disabledRenderGroups)) {
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
            return 1;
        }
    }

    public final java.util.Set getDisabledRenderGroups()
    {
        return this.disabledRenderGroups;
    }

    public final String getId()
    {
        return this.id;
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
        return ((((((this.id.hashCode() * 31) + this.parameters.hashCode()) * 31) + Integer.hashCode(this.renderGroup)) * 31) + this.disabledRenderGroups.hashCode());
    }

    public String toString()
    {
        String v0_0 = this.id;
        java.util.Map v1 = this.parameters;
        int v2 = this.renderGroup;
        java.util.Set v3 = this.disabledRenderGroups;
        StringBuilder v4_1 = new StringBuilder();
        v4_1.append("VisualEffectRef(id=");
        v4_1.append(v0_0);
        v4_1.append(", parameters=");
        v4_1.append(v1);
        v4_1.append(", renderGroup=");
        v4_1.append(v2);
        v4_1.append(", disabledRenderGroups=");
        v4_1.append(v3);
        v4_1.append(")");
        return v4_1.toString();
    }
}
