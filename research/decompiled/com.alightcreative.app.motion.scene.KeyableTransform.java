package com.alightcreative.app.motion.scene;
public final class KeyableTransform {
    public static final int $stable = 8;
    private final com.alightcreative.app.motion.scene.Keyable location;
    private final boolean lockAspectRatio;
    private final com.alightcreative.app.motion.scene.Keyable opacity;
    private final float orientation;
    private final com.alightcreative.app.motion.scene.Keyable pivot;
    private final com.alightcreative.app.motion.scene.Keyable rotation;
    private final com.alightcreative.app.motion.scene.Keyable scale;
    private final float size;
    private final com.alightcreative.app.motion.scene.Keyable skew;
    private com.alightcreative.app.motion.scene.Transform valueAtTimeCache0Tf;
    private float valueAtTimeCache0Time;
    private com.alightcreative.app.motion.scene.Transform valueAtTimeCache1Tf;
    private float valueAtTimeCache1Time;
    private com.alightcreative.app.motion.scene.Transform valueAtTimeCache2Tf;
    private float valueAtTimeCache2Time;

    static KeyableTransform()
    {
        return;
    }

    public KeyableTransform(com.alightcreative.app.motion.scene.Keyable p2, com.alightcreative.app.motion.scene.Keyable p3, com.alightcreative.app.motion.scene.Keyable p4, com.alightcreative.app.motion.scene.Keyable p5, float p6, float p7, com.alightcreative.app.motion.scene.Keyable p8, com.alightcreative.app.motion.scene.Keyable p9, boolean p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "location");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "pivot");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "scale");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "rotation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "opacity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "skew");
        this.location = p2;
        this.pivot = p3;
        this.scale = p4;
        this.rotation = p5;
        this.orientation = p6;
        this.size = p7;
        this.opacity = p8;
        this.skew = p9;
        this.lockAspectRatio = p10;
        return;
    }

    public synthetic KeyableTransform(com.alightcreative.app.motion.scene.Keyable p9, com.alightcreative.app.motion.scene.Keyable p10, com.alightcreative.app.motion.scene.Keyable p11, com.alightcreative.app.motion.scene.Keyable p12, float p13, float p14, com.alightcreative.app.motion.scene.Keyable p15, com.alightcreative.app.motion.scene.Keyable p16, boolean p17, int p18, kotlin.jvm.internal.DefaultConstructorMarker p19)
    {
        com.alightcreative.app.motion.scene.Keyable v1_1;
        if ((p18 & 2) == 0) {
            v1_1 = p10;
        } else {
            v1_1 = com.alightcreative.app.motion.scene.KeyableVector2D.Companion.getZERO();
        }
        com.alightcreative.app.motion.scene.Keyable v2_1;
        if ((p18 & 4) == 0) {
            v2_1 = p11;
        } else {
            v2_1 = com.alightcreative.app.motion.scene.KeyableVector2D.Companion.getONE();
        }
        com.alightcreative.app.motion.scene.Keyable v3_1;
        if ((p18 & 8) == 0) {
            v3_1 = p12;
        } else {
            v3_1 = com.alightcreative.app.motion.scene.KeyableFloat.Companion.getZERO();
        }
        float v4_1;
        if ((p18 & 16) == 0) {
            v4_1 = p13;
        } else {
            v4_1 = 0;
        }
        float v5_1;
        if ((p18 & 32) == 0) {
            v5_1 = p14;
        } else {
            v5_1 = 1065353216;
        }
        com.alightcreative.app.motion.scene.Keyable v6_1;
        if ((p18 & 64) == 0) {
            v6_1 = p15;
        } else {
            v6_1 = com.alightcreative.app.motion.scene.KeyableFloat.Companion.getONE();
        }
        com.alightcreative.app.motion.scene.Keyable v7_1;
        if ((p18 & 128) == 0) {
            v7_1 = p16;
        } else {
            v7_1 = com.alightcreative.app.motion.scene.KeyableVector2D.Companion.getZERO();
        }
        if ((p18 & 256) == 0) {
            p19 = p17;
        } else {
            p19 = 1;
        }
        this(p9, v1_1, v2_1, v3_1, v4_1, v5_1, v6_1, v7_1, p19);
        return;
    }

    public static synthetic com.alightcreative.app.motion.scene.KeyableTransform copy$default(com.alightcreative.app.motion.scene.KeyableTransform p0, com.alightcreative.app.motion.scene.Keyable p1, com.alightcreative.app.motion.scene.Keyable p2, com.alightcreative.app.motion.scene.Keyable p3, com.alightcreative.app.motion.scene.Keyable p4, float p5, float p6, com.alightcreative.app.motion.scene.Keyable p7, com.alightcreative.app.motion.scene.Keyable p8, boolean p9, int p10, Object p11)
    {
        if ((p10 & 1) != 0) {
            p1 = p0.location;
        }
        if ((p10 & 2) != 0) {
            p2 = p0.pivot;
        }
        if ((p10 & 4) != 0) {
            p3 = p0.scale;
        }
        if ((p10 & 8) != 0) {
            p4 = p0.rotation;
        }
        if ((p10 & 16) != 0) {
            p5 = p0.orientation;
        }
        if ((p10 & 32) != 0) {
            p6 = p0.size;
        }
        if ((p10 & 64) != 0) {
            p7 = p0.opacity;
        }
        if ((p10 & 128) != 0) {
            p8 = p0.skew;
        }
        if ((p10 & 256) != 0) {
            p9 = p0.lockAspectRatio;
        }
        return p0.copy(p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final com.alightcreative.app.motion.scene.Keyable component1()
    {
        return this.location;
    }

    public final com.alightcreative.app.motion.scene.Keyable component2()
    {
        return this.pivot;
    }

    public final com.alightcreative.app.motion.scene.Keyable component3()
    {
        return this.scale;
    }

    public final com.alightcreative.app.motion.scene.Keyable component4()
    {
        return this.rotation;
    }

    public final float component5()
    {
        return this.orientation;
    }

    public final float component6()
    {
        return this.size;
    }

    public final com.alightcreative.app.motion.scene.Keyable component7()
    {
        return this.opacity;
    }

    public final com.alightcreative.app.motion.scene.Keyable component8()
    {
        return this.skew;
    }

    public final boolean component9()
    {
        return this.lockAspectRatio;
    }

    public final com.alightcreative.app.motion.scene.KeyableTransform copy(com.alightcreative.app.motion.scene.Keyable p12, com.alightcreative.app.motion.scene.Keyable p13, com.alightcreative.app.motion.scene.Keyable p14, com.alightcreative.app.motion.scene.Keyable p15, float p16, float p17, com.alightcreative.app.motion.scene.Keyable p18, com.alightcreative.app.motion.scene.Keyable p19, boolean p20)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "location");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "pivot");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "scale");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "rotation");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "opacity");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "skew");
        return new com.alightcreative.app.motion.scene.KeyableTransform(p12, p13, p14, p15, p16, p17, p18, p19, p20);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.app.motion.scene.KeyableTransform)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.location, ((com.alightcreative.app.motion.scene.KeyableTransform) p5).location)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.pivot, ((com.alightcreative.app.motion.scene.KeyableTransform) p5).pivot)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.scale, ((com.alightcreative.app.motion.scene.KeyableTransform) p5).scale)) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.rotation, ((com.alightcreative.app.motion.scene.KeyableTransform) p5).rotation)) {
                                if (Float.compare(this.orientation, ((com.alightcreative.app.motion.scene.KeyableTransform) p5).orientation) == 0) {
                                    if (Float.compare(this.size, ((com.alightcreative.app.motion.scene.KeyableTransform) p5).size) == 0) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.opacity, ((com.alightcreative.app.motion.scene.KeyableTransform) p5).opacity)) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.skew, ((com.alightcreative.app.motion.scene.KeyableTransform) p5).skew)) {
                                                if (this.lockAspectRatio == ((com.alightcreative.app.motion.scene.KeyableTransform) p5).lockAspectRatio) {
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

    public final com.alightcreative.app.motion.scene.Keyable getLocation()
    {
        return this.location;
    }

    public final boolean getLockAspectRatio()
    {
        return this.lockAspectRatio;
    }

    public final com.alightcreative.app.motion.scene.Keyable getOpacity()
    {
        return this.opacity;
    }

    public final float getOrientation()
    {
        return this.orientation;
    }

    public final com.alightcreative.app.motion.scene.Keyable getPivot()
    {
        return this.pivot;
    }

    public final com.alightcreative.app.motion.scene.Keyable getRotation()
    {
        return this.rotation;
    }

    public final com.alightcreative.app.motion.scene.Keyable getScale()
    {
        return this.scale;
    }

    public final float getSize()
    {
        return this.size;
    }

    public final com.alightcreative.app.motion.scene.Keyable getSkew()
    {
        return this.skew;
    }

    public int hashCode()
    {
        return ((((((((((((((((this.location.hashCode() * 31) + this.pivot.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.rotation.hashCode()) * 31) + Float.hashCode(this.orientation)) * 31) + Float.hashCode(this.size)) * 31) + this.opacity.hashCode()) * 31) + this.skew.hashCode()) * 31) + Boolean.hashCode(this.lockAspectRatio));
    }

    public String toString()
    {
        String v0_0 = this.location;
        com.alightcreative.app.motion.scene.Keyable v1 = this.pivot;
        com.alightcreative.app.motion.scene.Keyable v2 = this.scale;
        com.alightcreative.app.motion.scene.Keyable v3 = this.rotation;
        float v4 = this.orientation;
        float v5 = this.size;
        com.alightcreative.app.motion.scene.Keyable v6 = this.opacity;
        com.alightcreative.app.motion.scene.Keyable v7 = this.skew;
        boolean v8 = this.lockAspectRatio;
        StringBuilder v9_0 = new StringBuilder();
        v9_0.append("KeyableTransform(location=");
        v9_0.append(v0_0);
        v9_0.append(", pivot=");
        v9_0.append(v1);
        v9_0.append(", scale=");
        v9_0.append(v2);
        v9_0.append(", rotation=");
        v9_0.append(v3);
        v9_0.append(", orientation=");
        v9_0.append(v4);
        v9_0.append(", size=");
        v9_0.append(v5);
        v9_0.append(", opacity=");
        v9_0.append(v6);
        v9_0.append(", skew=");
        v9_0.append(v7);
        v9_0.append(", lockAspectRatio=");
        v9_0.append(v8);
        v9_0.append(")");
        return v9_0.toString();
    }

    public final com.alightcreative.app.motion.scene.Transform valueAtTime(float p14)
    {
        float v0_0 = this.valueAtTimeCache0Tf;
        if ((v0_0 == 0) || (this.valueAtTimeCache0Time != p14)) {
            float v0_16 = this.valueAtTimeCache1Tf;
            if ((v0_16 == 0) || (this.valueAtTimeCache1Time != p14)) {
                float v0_1 = this.valueAtTimeCache2Tf;
                if ((v0_1 == 0) || (this.valueAtTimeCache2Time != p14)) {
                    com.alightcreative.app.motion.scene.Transform v1_5 = new com.alightcreative.app.motion.scene.Transform(((com.alightcreative.app.motion.scene.Vector3D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(this.location, p14)), ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(this.pivot, p14)), ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(this.scale, p14)), this.orientation, this.size, ((Number) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(this.rotation, p14)).floatValue(), ((Number) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(this.opacity, p14)).floatValue(), ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(this.skew, p14)), 0, 256, 0);
                    this.valueAtTimeCache2Tf = this.valueAtTimeCache1Tf;
                    this.valueAtTimeCache2Time = this.valueAtTimeCache1Time;
                    this.valueAtTimeCache1Tf = this.valueAtTimeCache0Tf;
                    this.valueAtTimeCache1Time = this.valueAtTimeCache0Time;
                    this.valueAtTimeCache0Tf = v1_5;
                    this.valueAtTimeCache0Time = p14;
                    return v1_5;
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(v0_1);
                    return v0_1;
                }
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(v0_16);
                return v0_16;
            }
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(v0_0);
            return v0_0;
        }
    }

    public final com.alightcreative.app.motion.scene.Transform valueAtTime(com.alightcreative.app.motion.scene.animators.AnimatorEnvironment p14)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "env");
        return new com.alightcreative.app.motion.scene.Transform(((com.alightcreative.app.motion.scene.Vector3D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(this.location, p14)), ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(this.pivot, p14)), ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(this.scale, p14)), this.orientation, this.size, ((Number) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(this.rotation, p14)).floatValue(), ((Number) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(this.opacity, p14)).floatValue(), ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTime(this.skew, p14)), 0, 256, 0);
    }

    public final com.alightcreative.app.motion.scene.Transform valueAtTimeOneFrameEarlier(com.alightcreative.app.motion.scene.animators.AnimatorEnvironment p14)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "env");
        return new com.alightcreative.app.motion.scene.Transform(((com.alightcreative.app.motion.scene.Vector3D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTimeOneFrameEarlier(this.location, p14)), ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTimeOneFrameEarlier(this.pivot, p14)), ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTimeOneFrameEarlier(this.scale, p14)), this.orientation, this.size, ((Number) com.alightcreative.app.motion.scene.KeyableKt.valueAtTimeOneFrameEarlier(this.rotation, p14)).floatValue(), ((Number) com.alightcreative.app.motion.scene.KeyableKt.valueAtTimeOneFrameEarlier(this.opacity, p14)).floatValue(), ((com.alightcreative.app.motion.scene.Vector2D) com.alightcreative.app.motion.scene.KeyableKt.valueAtTimeOneFrameEarlier(this.skew, p14)), 0, 256, 0);
    }
}
