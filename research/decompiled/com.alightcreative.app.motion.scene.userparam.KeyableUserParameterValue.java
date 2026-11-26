package com.alightcreative.app.motion.scene.userparam;
public final class KeyableUserParameterValue {
    public static final int $stable = 8;
    private final boolean booleanValue;
    private final com.alightcreative.app.motion.scene.Keyable colorValue;
    private final com.alightcreative.app.motion.scene.userparam.DataType dataType;
    private final com.alightcreative.app.motion.scene.Keyable floatValue;
    private final int intValue;
    private final com.alightcreative.app.motion.scene.Keyable quatValue;
    private final String stringValue;
    private final android.net.Uri textureValue;
    private final com.alightcreative.app.motion.scene.Keyable vec2DValue;
    private final com.alightcreative.app.motion.scene.Keyable vec3DValue;
    private final com.alightcreative.app.motion.scene.Keyable vec4DValue;

    static KeyableUserParameterValue()
    {
        return;
    }

    public KeyableUserParameterValue(float p15)
    {
        this(com.alightcreative.app.motion.scene.userparam.DataType.FLOAT, com.alightcreative.app.motion.scene.KeyableKt.keyable(p15), 0, 0, 0, 0, 0, 0, 0, 0, 0, 2044, 0);
        return;
    }

    public KeyableUserParameterValue(int p15)
    {
        this(com.alightcreative.app.motion.scene.userparam.DataType.INT, 0, p15, 0, 0, 0, 0, 0, 0, 0, 0, 2042, 0);
        return;
    }

    public KeyableUserParameterValue(android.net.Uri p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "value");
        this(com.alightcreative.app.motion.scene.userparam.DataType.TEXTURE, 0, 0, 0, 0, 0, 0, 0, 0, p16, 0, 1534, 0);
        return;
    }

    public KeyableUserParameterValue(com.alightcreative.app.motion.scene.KeyableFloat p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "value");
        this(com.alightcreative.app.motion.scene.userparam.DataType.FLOAT, p16, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2044, 0);
        return;
    }

    public KeyableUserParameterValue(com.alightcreative.app.motion.scene.KeyableQuaternion p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "value");
        this(com.alightcreative.app.motion.scene.userparam.DataType.QUAT, 0, 0, 0, 0, 0, 0, p16, 0, 0, 0, 1918, 0);
        return;
    }

    public KeyableUserParameterValue(com.alightcreative.app.motion.scene.KeyableSolidColor p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "value");
        this(com.alightcreative.app.motion.scene.userparam.DataType.SOLID_COLOR, 0, 0, p16, 0, 0, 0, 0, 0, 0, 0, 2038, 0);
        return;
    }

    public KeyableUserParameterValue(com.alightcreative.app.motion.scene.KeyableVector2D p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "value");
        this(com.alightcreative.app.motion.scene.userparam.DataType.VEC2, 0, 0, 0, p16, 0, 0, 0, 0, 0, 0, 2030, 0);
        return;
    }

    public KeyableUserParameterValue(com.alightcreative.app.motion.scene.KeyableVector3D p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "value");
        this(com.alightcreative.app.motion.scene.userparam.DataType.VEC3, 0, 0, 0, 0, p16, 0, 0, 0, 0, 0, 2014, 0);
        return;
    }

    public KeyableUserParameterValue(com.alightcreative.app.motion.scene.KeyableVector4D p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "value");
        this(com.alightcreative.app.motion.scene.userparam.DataType.VEC4, 0, 0, 0, 0, 0, p16, 0, 0, 0, 0, 1982, 0);
        return;
    }

    public KeyableUserParameterValue(com.alightcreative.app.motion.scene.Quaternion p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "value");
        this(com.alightcreative.app.motion.scene.userparam.DataType.QUAT, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.KeyableKt.keyable(p16), 0, 0, 0, 1918, 0);
        return;
    }

    public KeyableUserParameterValue(com.alightcreative.app.motion.scene.SolidColor p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "value");
        this(com.alightcreative.app.motion.scene.userparam.DataType.SOLID_COLOR, 0, 0, com.alightcreative.app.motion.scene.KeyableKt.keyable(p16), 0, 0, 0, 0, 0, 0, 0, 2038, 0);
        return;
    }

    public KeyableUserParameterValue(com.alightcreative.app.motion.scene.Vector2D p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "value");
        this(com.alightcreative.app.motion.scene.userparam.DataType.VEC2, 0, 0, 0, com.alightcreative.app.motion.scene.KeyableKt.keyable(p16), 0, 0, 0, 0, 0, 0, 2030, 0);
        return;
    }

    public KeyableUserParameterValue(com.alightcreative.app.motion.scene.Vector3D p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "value");
        this(com.alightcreative.app.motion.scene.userparam.DataType.VEC3, 0, 0, 0, 0, com.alightcreative.app.motion.scene.KeyableKt.keyable(p16), 0, 0, 0, 0, 0, 2014, 0);
        return;
    }

    public KeyableUserParameterValue(com.alightcreative.app.motion.scene.Vector4D p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "value");
        this(com.alightcreative.app.motion.scene.userparam.DataType.VEC4, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.KeyableKt.keyable(p16), 0, 0, 0, 0, 1982, 0);
        return;
    }

    public KeyableUserParameterValue(com.alightcreative.app.motion.scene.userparam.DataType p2, com.alightcreative.app.motion.scene.Keyable p3, int p4, com.alightcreative.app.motion.scene.Keyable p5, com.alightcreative.app.motion.scene.Keyable p6, com.alightcreative.app.motion.scene.Keyable p7, com.alightcreative.app.motion.scene.Keyable p8, com.alightcreative.app.motion.scene.Keyable p9, boolean p10, android.net.Uri p11, String p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "dataType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "floatValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "colorValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "vec2DValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "vec3DValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "vec4DValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "quatValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "textureValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "stringValue");
        this.dataType = p2;
        this.floatValue = p3;
        this.intValue = p4;
        this.colorValue = p5;
        this.vec2DValue = p6;
        this.vec3DValue = p7;
        this.vec4DValue = p8;
        this.quatValue = p9;
        this.booleanValue = p10;
        this.textureValue = p11;
        this.stringValue = p12;
        return;
    }

    public synthetic KeyableUserParameterValue(com.alightcreative.app.motion.scene.userparam.DataType p11, com.alightcreative.app.motion.scene.Keyable p12, int p13, com.alightcreative.app.motion.scene.Keyable p14, com.alightcreative.app.motion.scene.Keyable p15, com.alightcreative.app.motion.scene.Keyable p16, com.alightcreative.app.motion.scene.Keyable p17, com.alightcreative.app.motion.scene.Keyable p18, boolean p19, android.net.Uri p20, String p21, int p22, kotlin.jvm.internal.DefaultConstructorMarker p23)
    {
        com.alightcreative.app.motion.scene.Keyable v1_1;
        if ((p22 & 2) == 0) {
            v1_1 = p12;
        } else {
            v1_1 = com.alightcreative.app.motion.scene.KeyableKt.getKEYABLE_FLOAT_DEFAULT();
        }
        int v2_0;
        boolean v3 = 0;
        if ((p22 & 4) == 0) {
            v2_0 = p13;
        } else {
            v2_0 = 0;
        }
        com.alightcreative.app.motion.scene.Keyable v4_1;
        if ((p22 & 8) == 0) {
            v4_1 = p14;
        } else {
            v4_1 = com.alightcreative.app.motion.scene.KeyableKt.getKEYABLE_SOLID_COLOR_DEFAULT();
        }
        com.alightcreative.app.motion.scene.Keyable v5_1;
        if ((p22 & 16) == 0) {
            v5_1 = p15;
        } else {
            v5_1 = com.alightcreative.app.motion.scene.KeyableKt.getKEYABLE_VECTOR2D_DEFAULT();
        }
        com.alightcreative.app.motion.scene.Keyable v6_1;
        if ((p22 & 32) == 0) {
            v6_1 = p16;
        } else {
            v6_1 = com.alightcreative.app.motion.scene.KeyableKt.getKEYABLE_VECTOR3D_DEFAULT();
        }
        com.alightcreative.app.motion.scene.Keyable v7_1;
        if ((p22 & 64) == 0) {
            v7_1 = p17;
        } else {
            v7_1 = com.alightcreative.app.motion.scene.KeyableKt.getKEYABLE_VECTOR4D_DEFAULT();
        }
        com.alightcreative.app.motion.scene.Keyable v8_1;
        if ((p22 & 128) == 0) {
            v8_1 = p18;
        } else {
            v8_1 = com.alightcreative.app.motion.scene.KeyableQuaternion.Companion.getIDENTITY();
        }
        if ((p22 & 256) == 0) {
            v3 = p19;
        }
        android.net.Uri v9_2;
        if ((p22 & 512) == 0) {
            v9_2 = p20;
        } else {
            v9_2 = android.net.Uri.EMPTY;
        }
        if ((p22 & 1024) == 0) {
            p23 = p21;
        } else {
            p23 = "";
        }
        this(p11, v1_1, v2_0, v4_1, v5_1, v6_1, v7_1, v8_1, v3, v9_2, p23);
        return;
    }

    public KeyableUserParameterValue(String p16)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "value");
        this(com.alightcreative.app.motion.scene.userparam.DataType.STRING, 0, 0, 0, 0, 0, 0, 0, 0, 0, p16, 1022, 0);
        return;
    }

    public KeyableUserParameterValue(boolean p15)
    {
        this(com.alightcreative.app.motion.scene.userparam.DataType.BOOLEAN, 0, 0, 0, 0, 0, 0, 0, p15, 0, 0, 1790, 0);
        return;
    }

    public static synthetic com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue copy$default(com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue p0, com.alightcreative.app.motion.scene.userparam.DataType p1, com.alightcreative.app.motion.scene.Keyable p2, int p3, com.alightcreative.app.motion.scene.Keyable p4, com.alightcreative.app.motion.scene.Keyable p5, com.alightcreative.app.motion.scene.Keyable p6, com.alightcreative.app.motion.scene.Keyable p7, com.alightcreative.app.motion.scene.Keyable p8, boolean p9, android.net.Uri p10, String p11, int p12, Object p13)
    {
        if ((p12 & 1) != 0) {
            p1 = p0.dataType;
        }
        if ((p12 & 2) != 0) {
            p2 = p0.floatValue;
        }
        if ((p12 & 4) != 0) {
            p3 = p0.intValue;
        }
        if ((p12 & 8) != 0) {
            p4 = p0.colorValue;
        }
        if ((p12 & 16) != 0) {
            p5 = p0.vec2DValue;
        }
        if ((p12 & 32) != 0) {
            p6 = p0.vec3DValue;
        }
        if ((p12 & 64) != 0) {
            p7 = p0.vec4DValue;
        }
        if ((p12 & 128) != 0) {
            p8 = p0.quatValue;
        }
        if ((p12 & 256) != 0) {
            p9 = p0.booleanValue;
        }
        if ((p12 & 512) != 0) {
            p10 = p0.textureValue;
        }
        if ((p12 & 1024) != 0) {
            p11 = p0.stringValue;
        }
        return p0.copy(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    public final com.alightcreative.app.motion.scene.userparam.DataType component1()
    {
        return this.dataType;
    }

    public final android.net.Uri component10()
    {
        return this.textureValue;
    }

    public final String component11()
    {
        return this.stringValue;
    }

    public final com.alightcreative.app.motion.scene.Keyable component2()
    {
        return this.floatValue;
    }

    public final int component3()
    {
        return this.intValue;
    }

    public final com.alightcreative.app.motion.scene.Keyable component4()
    {
        return this.colorValue;
    }

    public final com.alightcreative.app.motion.scene.Keyable component5()
    {
        return this.vec2DValue;
    }

    public final com.alightcreative.app.motion.scene.Keyable component6()
    {
        return this.vec3DValue;
    }

    public final com.alightcreative.app.motion.scene.Keyable component7()
    {
        return this.vec4DValue;
    }

    public final com.alightcreative.app.motion.scene.Keyable component8()
    {
        return this.quatValue;
    }

    public final boolean component9()
    {
        return this.booleanValue;
    }

    public final com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue copy(com.alightcreative.app.motion.scene.userparam.DataType p14, com.alightcreative.app.motion.scene.Keyable p15, int p16, com.alightcreative.app.motion.scene.Keyable p17, com.alightcreative.app.motion.scene.Keyable p18, com.alightcreative.app.motion.scene.Keyable p19, com.alightcreative.app.motion.scene.Keyable p20, com.alightcreative.app.motion.scene.Keyable p21, boolean p22, android.net.Uri p23, String p24)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "dataType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "floatValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "colorValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "vec2DValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "vec3DValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p20, "vec4DValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p21, "quatValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p23, "textureValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p24, "stringValue");
        return new com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue(p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue)) {
                if (this.dataType == ((com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue) p5).dataType) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.floatValue, ((com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue) p5).floatValue)) {
                        if (this.intValue == ((com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue) p5).intValue) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.colorValue, ((com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue) p5).colorValue)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.vec2DValue, ((com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue) p5).vec2DValue)) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.vec3DValue, ((com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue) p5).vec3DValue)) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.vec4DValue, ((com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue) p5).vec4DValue)) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.quatValue, ((com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue) p5).quatValue)) {
                                                if (this.booleanValue == ((com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue) p5).booleanValue) {
                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.textureValue, ((com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue) p5).textureValue)) {
                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.stringValue, ((com.alightcreative.app.motion.scene.userparam.KeyableUserParameterValue) p5).stringValue)) {
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
            return 1;
        }
    }

    public final boolean getBooleanValue()
    {
        return this.booleanValue;
    }

    public final com.alightcreative.app.motion.scene.Keyable getColorValue()
    {
        return this.colorValue;
    }

    public final com.alightcreative.app.motion.scene.userparam.DataType getDataType()
    {
        return this.dataType;
    }

    public final com.alightcreative.app.motion.scene.Keyable getFloatValue()
    {
        return this.floatValue;
    }

    public final int getIntValue()
    {
        return this.intValue;
    }

    public final com.alightcreative.app.motion.scene.Keyable getQuatValue()
    {
        return this.quatValue;
    }

    public final String getStringValue()
    {
        return this.stringValue;
    }

    public final android.net.Uri getTextureValue()
    {
        return this.textureValue;
    }

    public final com.alightcreative.app.motion.scene.Keyable getVec2DValue()
    {
        return this.vec2DValue;
    }

    public final com.alightcreative.app.motion.scene.Keyable getVec3DValue()
    {
        return this.vec3DValue;
    }

    public final com.alightcreative.app.motion.scene.Keyable getVec4DValue()
    {
        return this.vec4DValue;
    }

    public int hashCode()
    {
        return ((((((((((((((((((((this.dataType.hashCode() * 31) + this.floatValue.hashCode()) * 31) + Integer.hashCode(this.intValue)) * 31) + this.colorValue.hashCode()) * 31) + this.vec2DValue.hashCode()) * 31) + this.vec3DValue.hashCode()) * 31) + this.vec4DValue.hashCode()) * 31) + this.quatValue.hashCode()) * 31) + Boolean.hashCode(this.booleanValue)) * 31) + this.textureValue.hashCode()) * 31) + this.stringValue.hashCode());
    }

    public String toString()
    {
        String v0_0 = this.dataType;
        com.alightcreative.app.motion.scene.Keyable v1 = this.floatValue;
        int v2 = this.intValue;
        com.alightcreative.app.motion.scene.Keyable v3 = this.colorValue;
        com.alightcreative.app.motion.scene.Keyable v4 = this.vec2DValue;
        com.alightcreative.app.motion.scene.Keyable v5 = this.vec3DValue;
        com.alightcreative.app.motion.scene.Keyable v6 = this.vec4DValue;
        com.alightcreative.app.motion.scene.Keyable v7 = this.quatValue;
        boolean v8 = this.booleanValue;
        android.net.Uri v9 = this.textureValue;
        String v10 = this.stringValue;
        StringBuilder v11_1 = new StringBuilder();
        v11_1.append("KeyableUserParameterValue(dataType=");
        v11_1.append(v0_0);
        v11_1.append(", floatValue=");
        v11_1.append(v1);
        v11_1.append(", intValue=");
        v11_1.append(v2);
        v11_1.append(LJ8.lgIq.hqZxzeY.DLPWbRM);
        v11_1.append(v3);
        v11_1.append(", vec2DValue=");
        v11_1.append(v4);
        v11_1.append(", vec3DValue=");
        v11_1.append(v5);
        v11_1.append(", vec4DValue=");
        v11_1.append(v6);
        v11_1.append(", quatValue=");
        v11_1.append(v7);
        v11_1.append(unu.QWS.ksRAQQYmrswm.MYYdTnzXdSUSD);
        v11_1.append(v8);
        v11_1.append(", textureValue=");
        v11_1.append(v9);
        v11_1.append(", stringValue=");
        v11_1.append(v10);
        v11_1.append(")");
        return v11_1.toString();
    }
}
