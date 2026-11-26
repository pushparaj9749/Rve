package com.alightcreative.app.motion.scene;
public final class GeometryKt {

    public static final com.alightcreative.app.motion.scene.Vector2D Vector2D()
    {
        return com.alightcreative.app.motion.scene.Vector2D.Companion.getZERO();
    }

    public static final com.alightcreative.app.motion.scene.Vector2D Vector2D(float p1)
    {
        return new com.alightcreative.app.motion.scene.Vector2D(p1, p1);
    }

    public static final com.alightcreative.app.motion.scene.Vector3D Vector3D()
    {
        return com.alightcreative.app.motion.scene.Vector3D.Companion.getZERO();
    }

    public static final com.alightcreative.app.motion.scene.Vector4D Vector4D()
    {
        return com.alightcreative.app.motion.scene.Vector4D.Companion.getZERO();
    }

    public static final com.alightcreative.app.motion.scene.Vector4D Vector4D(com.alightcreative.app.motion.scene.Vector3D p3, float p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "v");
        return new com.alightcreative.app.motion.scene.Vector4D(p3.getX(), p3.getY(), p3.getZ(), p4);
    }

    public static final float angleDegrees(com.alightcreative.app.motion.scene.Vector2D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return (((float) Math.atan2(((double) p4.getX()), ((double) p4.getY()))) * 1113927398);
    }

    public static final android.graphics.Path asPath(com.alightcreative.app.motion.scene.Rectangle p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        android.graphics.Path v0_2 = new android.graphics.Path();
        v0_2.moveTo(p3.getLeft(), p3.getTop());
        v0_2.lineTo(p3.getRight(), p3.getTop());
        v0_2.lineTo(p3.getRight(), p3.getBottom());
        v0_2.lineTo(p3.getLeft(), p3.getBottom());
        v0_2.close();
        return v0_2;
    }

    public static final com.alightcreative.app.motion.scene.Vector2D coerceAtLeast(com.alightcreative.app.motion.scene.Vector2D p2, float p3, float p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(Math.max(p3, p2.getX()), Math.max(p4, p2.getY()));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D coerceAtLeastAbs(com.alightcreative.app.motion.scene.Vector2D p2, float p3, float p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        if (Math.abs(p2.getX()) > p3) {
            p3 = p2.getX();
        }
        if (Math.abs(p2.getY()) > p4) {
            p4 = p2.getY();
        }
        return new com.alightcreative.app.motion.scene.Vector2D(p3, p4);
    }

    public static final com.alightcreative.app.motion.scene.Vector2D coerceAtLeastX(com.alightcreative.app.motion.scene.Vector2D p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(Math.max(p3, p2.getX()), p2.getY());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D coerceAtLeastY(com.alightcreative.app.motion.scene.Vector2D p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getX(), Math.max(p3, p2.getY()));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D coerceIn(com.alightcreative.app.motion.scene.Vector2D p4, com.alightcreative.app.motion.scene.Vector2D p5, com.alightcreative.app.motion.scene.Vector2D p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "min");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "max");
        return new com.alightcreative.app.motion.scene.Vector2D(kotlin.ranges.RangesKt.coerceIn(p4.getX(), p5.getX(), p6.getX()), kotlin.ranges.RangesKt.coerceIn(p4.getY(), p5.getY(), p6.getY()));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D coerceIn(com.alightcreative.app.motion.scene.Vector3D p5, com.alightcreative.app.motion.scene.Vector3D p6, com.alightcreative.app.motion.scene.Vector3D p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "min");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "max");
        return new com.alightcreative.app.motion.scene.Vector3D(kotlin.ranges.RangesKt.coerceIn(p5.getX(), p6.getX(), p7.getX()), kotlin.ranges.RangesKt.coerceIn(p5.getY(), p6.getY(), p7.getY()), kotlin.ranges.RangesKt.coerceIn(p5.getZ(), p6.getZ(), p7.getZ()));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D coerceIn(com.alightcreative.app.motion.scene.Vector4D p6, com.alightcreative.app.motion.scene.Vector4D p7, com.alightcreative.app.motion.scene.Vector4D p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "min");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "max");
        return new com.alightcreative.app.motion.scene.Vector4D(kotlin.ranges.RangesKt.coerceIn(p6.getX(), p7.getX(), p8.getX()), kotlin.ranges.RangesKt.coerceIn(p6.getY(), p7.getY(), p8.getY()), kotlin.ranges.RangesKt.coerceIn(p6.getZ(), p7.getZ(), p8.getZ()), kotlin.ranges.RangesKt.coerceIn(p6.getW(), p7.getW(), p8.getW()));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D copyWithAxis(com.alightcreative.app.motion.scene.Vector2D p1, com.alightcreative.app.motion.scene.Axis2D p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "axis");
        com.alightcreative.app.motion.scene.Vector2D v2_6 = com.alightcreative.app.motion.scene.GeometryKt$WhenMappings.$EnumSwitchMapping$0[p2.ordinal()];
        if (v2_6 == 1) {
            return new com.alightcreative.app.motion.scene.Vector2D(p3, p1.getY());
        } else {
            if (v2_6 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                return new com.alightcreative.app.motion.scene.Vector2D(p1.getX(), p3);
            }
        }
    }

    public static final com.alightcreative.app.motion.scene.Vector3D cross(com.alightcreative.app.motion.scene.Vector3D p5, com.alightcreative.app.motion.scene.Vector3D p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "a");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "b");
        return new com.alightcreative.app.motion.scene.Vector3D(((p5.getY() * p6.getZ()) - (p5.getZ() * p6.getY())), ((p5.getZ() * p6.getX()) - (p5.getX() * p6.getZ())), ((p5.getX() * p6.getY()) - (p5.getY() * p6.getX())));
    }

    public static final com.alightcreative.app.motion.scene.OptionalVector2D div(com.alightcreative.app.motion.scene.OptionalVector2D p1, double p2)
    {
        com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            v1_2 = 0;
        } else {
            v1_2 = ((com.alightcreative.app.motion.scene.Vector2D) p1);
        }
        if (v1_2 != null) {
            com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_3 = com.alightcreative.app.motion.scene.GeometryKt.div(v1_2, p2);
            if (v1_3 != null) {
                return v1_3;
            }
        }
        return com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
    }

    public static final com.alightcreative.app.motion.scene.OptionalVector2D div(com.alightcreative.app.motion.scene.OptionalVector2D p1, float p2)
    {
        com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            v1_2 = 0;
        } else {
            v1_2 = ((com.alightcreative.app.motion.scene.Vector2D) p1);
        }
        if (v1_2 != null) {
            com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_3 = com.alightcreative.app.motion.scene.GeometryKt.div(v1_2, p2);
            if (v1_3 != null) {
                return v1_3;
            }
        }
        return com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
    }

    public static final com.alightcreative.app.motion.scene.OptionalVector2D div(com.alightcreative.app.motion.scene.OptionalVector2D p1, int p2)
    {
        com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            v1_2 = 0;
        } else {
            v1_2 = ((com.alightcreative.app.motion.scene.Vector2D) p1);
        }
        if (v1_2 != null) {
            com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_3 = com.alightcreative.app.motion.scene.GeometryKt.div(v1_2, p2);
            if (v1_3 != null) {
                return v1_3;
            }
        }
        return com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
    }

    public static final com.alightcreative.app.motion.scene.OptionalVector2D div(com.alightcreative.app.motion.scene.OptionalVector2D p1, long p2)
    {
        com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            v1_2 = 0;
        } else {
            v1_2 = ((com.alightcreative.app.motion.scene.Vector2D) p1);
        }
        if (v1_2 != null) {
            com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_3 = com.alightcreative.app.motion.scene.GeometryKt.div(v1_2, p2);
            if (v1_3 != null) {
                return v1_3;
            }
        }
        return com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
    }

    public static final com.alightcreative.app.motion.scene.Vector2D div(com.alightcreative.app.motion.scene.Vector2D p4, double p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(((float) (((double) p4.getX()) / p5)), ((float) (((double) p4.getY()) / p5)));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D div(com.alightcreative.app.motion.scene.Vector2D p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D((p2.getX() / p3), (p2.getY() / p3));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D div(com.alightcreative.app.motion.scene.Vector2D p2, int p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D((p2.getX() / ((float) p3)), (p2.getY() / ((float) p3)));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D div(com.alightcreative.app.motion.scene.Vector2D p2, long p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D((p2.getX() / ((float) p3)), (p2.getY() / ((float) p3)));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D div(com.alightcreative.app.motion.scene.Vector2D p3, com.alightcreative.app.motion.scene.Vector2D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "other");
        return new com.alightcreative.app.motion.scene.Vector2D((p3.getX() / p4.getX()), (p3.getY() / p4.getY()));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D div(com.alightcreative.app.motion.scene.Vector3D p5, double p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(((float) (((double) p5.getX()) / p6)), ((float) (((double) p5.getY()) / p6)), ((float) (((double) p5.getZ()) / p6)));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D div(com.alightcreative.app.motion.scene.Vector3D p3, float p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D((p3.getX() / p4), (p3.getY() / p4), (p3.getZ() / p4));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D div(com.alightcreative.app.motion.scene.Vector3D p3, int p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D((p3.getX() / ((float) p4)), (p3.getY() / ((float) p4)), (p3.getZ() / ((float) p4)));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D div(com.alightcreative.app.motion.scene.Vector3D p2, long p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D((p2.getX() / ((float) p3)), (p2.getY() / ((float) p3)), (p2.getZ() / ((float) p3)));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D div(com.alightcreative.app.motion.scene.Vector3D p4, com.alightcreative.app.motion.scene.Vector3D p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        com.alightcreative.app.motion.scene.Vector3D v0 = 0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, bQ.JU.TvlDCJwG.HtIyGAjJj);
        return new com.alightcreative.app.motion.scene.Vector3D((p4.getX() / p5.getX()), (p4.getY() / p5.getY()), (p4.getZ() / p5.getZ()));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D div(com.alightcreative.app.motion.scene.Vector4D p5, double p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        return new com.alightcreative.app.motion.scene.Vector4D(((float) (((double) p5.getX()) / p6)), ((float) (((double) p5.getY()) / p6)), ((float) (((double) p5.getZ()) / p6)), ((float) (((double) 2) / p6)));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D div(com.alightcreative.app.motion.scene.Vector4D p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Vector4D((p4.getX() / p5), (p4.getY() / p5), (p4.getZ() / p5), (p4.getW() / p5));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D div(com.alightcreative.app.motion.scene.Vector4D p4, int p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Vector4D((p4.getX() / ((float) p5)), (p4.getY() / ((float) p5)), (p4.getZ() / ((float) p5)), (p4.getW() / ((float) p5)));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D div(com.alightcreative.app.motion.scene.Vector4D p3, long p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector4D((p3.getX() / ((float) p4)), (p3.getY() / ((float) p4)), (p3.getZ() / ((float) p4)), (p3.getW() / ((float) p4)));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D div(com.alightcreative.app.motion.scene.Vector4D p5, com.alightcreative.app.motion.scene.Vector4D p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "other");
        return new com.alightcreative.app.motion.scene.Vector4D((p5.getX() / p6.getX()), (p5.getY() / p6.getY()), (p5.getZ() / p6.getZ()), (p5.getW() / p6.getW()));
    }

    public static final float dot(com.alightcreative.app.motion.scene.Vector2D p2, com.alightcreative.app.motion.scene.Vector2D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "a");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "b");
        return ((p2.getX() * p3.getX()) + (p2.getY() * p3.getY()));
    }

    public static final float dot(com.alightcreative.app.motion.scene.Vector3D p3, com.alightcreative.app.motion.scene.Vector3D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "a");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "b");
        return (((p3.getX() * p4.getX()) + (p3.getY() * p4.getY())) + (p3.getZ() * p4.getZ()));
    }

    public static final float dot(com.alightcreative.app.motion.scene.Vector4D p3, com.alightcreative.app.motion.scene.Vector4D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "a");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "b");
        return ((((p3.getX() * p4.getX()) + (p3.getY() * p4.getY())) + (p3.getZ() * p4.getZ())) + (p3.getW() * p4.getW()));
    }

    public static final String dump(android.graphics.Matrix p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "<this>");
        float[] v1 = new float[9];
        p11.getValues(v1);
        Float v2 = Float.valueOf(v1[0]);
        Float.valueOf(v1[1]);
        Float.valueOf(v1[2]);
        Float.valueOf(v1[3]);
        Float.valueOf(v1[4]);
        Float.valueOf(v1[5]);
        Float.valueOf(v1[6]);
        Float.valueOf(v1[6]);
        String v11_17 = String.format("\n%08.5f %5.2f %08.5f\n%08.5f %08.5f %5.2f\n%08.5f %08.5f %08.5f", java.util.Arrays.copyOf(new Object[] {v2, Float.valueOf(v1[8])}), 9));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v11_17, "format(...)");
        return v11_17;
    }

    public static final com.alightcreative.app.motion.scene.Rectangle enclosingTransform(com.alightcreative.app.motion.scene.Rectangle p11, android.graphics.Matrix p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "matrix");
        com.alightcreative.app.motion.scene.Zv9 v0_11 = p11.getLeft();
        float v1 = p11.getTop();
        float v2 = p11.getRight();
        float v3 = p11.getTop();
        float v4 = p11.getRight();
        float v5 = p11.getBottom();
        float v6 = p11.getLeft();
        float v7 = p11.getBottom();
        float[] v9 = new float[8];
        v9[0] = v0_11;
        v9[1] = v1;
        v9[2] = v2;
        v9[3] = v3;
        v9[4] = v4;
        v9[5] = v5;
        v9[6] = v6;
        v9[7] = v7;
        fx.Enc.H(p11, new com.alightcreative.app.motion.scene.Zv9(v9));
        p12.mapPoints(v9);
        fx.Enc.H(p11, new com.alightcreative.app.motion.scene.AWD(v9));
        return com.alightcreative.app.motion.scene.Rectangle.Companion.enclosing(java.util.Arrays.copyOf(v9, 8));
    }

    public static final com.alightcreative.app.motion.scene.Rectangle enclosingTransform(com.alightcreative.app.motion.scene.Rectangle p1, com.alightcreative.app.motion.scene.Transform p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "transform");
        return com.alightcreative.app.motion.scene.GeometryKt.enclosingTransform(p1, p2.getMatrix());
    }

    private static final String enclosingTransform$lambda$1(float[] p9)
    {
        String v9_1 = kotlin.collections.ArraysKt.joinToString$default(p9, ",", 0, 0, 0, 0, 0, 62, 0);
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("Rectangle.enclosingTransform: before map: ");
        v0_1.append(v9_1);
        return v0_1.toString();
    }

    private static final String enclosingTransform$lambda$2(float[] p9)
    {
        String v9_1 = kotlin.collections.ArraysKt.joinToString$default(p9, ",", 0, 0, 0, 0, 0, 62, 0);
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("Rectangle.enclosingTransform: after map: ");
        v0_1.append(v9_1);
        return v0_1.toString();
    }

    public static final com.alightcreative.app.motion.scene.Rectangle expand(com.alightcreative.app.motion.scene.Rectangle p1, float p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return com.alightcreative.app.motion.scene.GeometryKt.expand(p1, p2, p2);
    }

    public static final com.alightcreative.app.motion.scene.Rectangle expand(com.alightcreative.app.motion.scene.Rectangle p4, float p5, float p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Rectangle((p4.getLeft() - p5), (p4.getTop() - p6), (p4.getRight() + p5), (p4.getBottom() + p6));
    }

    public static final float get(com.alightcreative.app.motion.scene.Vector2D p1, com.alightcreative.app.motion.scene.Axis2D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "axis");
        if (p2 != com.alightcreative.app.motion.scene.Axis2D.X) {
            return p1.getY();
        } else {
            return p1.getX();
        }
    }

    public static final float getAvg(com.alightcreative.app.motion.scene.Vector2D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return ((p1.getX() + p1.getY()) / 1073741824);
    }

    public static final float getLength(com.alightcreative.app.motion.scene.Vector2D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return ((float) Math.hypot(((double) p4.getX()), ((double) p4.getY())));
    }

    public static final float getLength(com.alightcreative.app.motion.scene.Vector3D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return ((float) Math.sqrt(((double) (((p3.getX() * p3.getX()) + (p3.getY() * p3.getY())) + (p3.getZ() * p3.getZ())))));
    }

    public static final float getLength(com.alightcreative.app.motion.scene.Vector4D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return ((float) Math.sqrt(((double) ((((p3.getX() * p3.getX()) + (p3.getY() * p3.getY())) + (p3.getZ() * p3.getZ())) + (p3.getW() * p3.getW())))));
    }

    public static final float getLengthSquared(com.alightcreative.app.motion.scene.Vector2D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return ((p2.getX() * p2.getX()) + (p2.getY() * p2.getY()));
    }

    public static final float getMax(com.alightcreative.app.motion.scene.Vector2D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return Math.max(p1.getX(), p1.getY());
    }

    public static final float getMin(com.alightcreative.app.motion.scene.Vector2D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return Math.min(p1.getX(), p1.getY());
    }

    public static final float getScale(android.graphics.Matrix p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        com.alightcreative.app.motion.scene.Vector2D v0_1 = com.alightcreative.app.motion.scene.Vector2D.Companion;
        return com.alightcreative.app.motion.scene.GeometryKt.getLength(com.alightcreative.app.motion.scene.GeometryKt.minus(com.alightcreative.app.motion.scene.GeometryKt.times(v0_1.getUNIT(), p2), com.alightcreative.app.motion.scene.GeometryKt.times(v0_1.getZERO(), p2)));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getViewRect(com.alightcreative.app.motion.scene.Rectangle p9, android.graphics.Matrix p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "matrix");
        float v0_6 = p9.getLeft();
        float v1_2 = p9.getTop();
        float v2_2 = p9.getRight();
        com.alightcreative.app.motion.scene.Vector2D v3_0 = p9.getTop();
        float v4_0 = p9.getRight();
        com.alightcreative.app.motion.scene.Vector2D v9_1 = p9.getBottom();
        float[] v5_1 = new float[6];
        v5_1[0] = v0_6;
        v5_1[1] = v1_2;
        v5_1[2] = v2_2;
        v5_1[3] = v3_0;
        v5_1[4] = v4_0;
        v5_1[5] = v9_1;
        p10.mapPoints(v5_1);
        return new com.alightcreative.app.motion.scene.Vector2D(com.alightcreative.app.motion.scene.GeometryKt.getLength(com.alightcreative.app.motion.scene.GeometryKt.minus(new com.alightcreative.app.motion.scene.Vector2D(v5_1[2], v5_1[3]), new com.alightcreative.app.motion.scene.Vector2D(v5_1[0], v5_1[1]))), com.alightcreative.app.motion.scene.GeometryKt.getLength(com.alightcreative.app.motion.scene.GeometryKt.minus(new com.alightcreative.app.motion.scene.Vector2D(v5_1[4], v5_1[5]), new com.alightcreative.app.motion.scene.Vector2D(v5_1[2], v5_1[3]))));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getXx(com.alightcreative.app.motion.scene.Vector3D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getX(), p2.getX());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getXx(com.alightcreative.app.motion.scene.Vector4D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getX(), p2.getX());
    }

    public static final com.alightcreative.app.motion.scene.Vector3D getXxx(com.alightcreative.app.motion.scene.Vector4D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(p3.getX(), p3.getX(), p3.getX());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getXy(com.alightcreative.app.motion.scene.Vector3D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getX(), p2.getY());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getXy(com.alightcreative.app.motion.scene.Vector4D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getX(), p2.getY());
    }

    public static final com.alightcreative.app.motion.scene.Vector3D getXy0(com.alightcreative.app.motion.scene.Vector2D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(p3.getX(), p3.getY(), 0);
    }

    public static final com.alightcreative.app.motion.scene.Vector3D getXy0(com.alightcreative.app.motion.scene.Vector3D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(p3.getX(), p3.getY(), 0);
    }

    public static final com.alightcreative.app.motion.scene.Vector3D getXyz(com.alightcreative.app.motion.scene.Vector4D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(p3.getX(), p3.getY(), p3.getZ());
    }

    public static final com.alightcreative.app.motion.scene.Vector4D getXyz0(com.alightcreative.app.motion.scene.Vector3D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Vector4D(p4.getX(), p4.getY(), p4.getZ(), 0);
    }

    public static final com.alightcreative.app.motion.scene.Vector4D getXyz1(com.alightcreative.app.motion.scene.Vector3D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Vector4D(p4.getX(), p4.getY(), p4.getZ(), 1065353216);
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getXz(com.alightcreative.app.motion.scene.Vector3D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getX(), p2.getZ());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getXz(com.alightcreative.app.motion.scene.Vector4D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getX(), p2.getZ());
    }

    public static final com.alightcreative.app.motion.scene.Vector3D getXzy(com.alightcreative.app.motion.scene.Vector4D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(p3.getX(), p3.getZ(), p3.getY());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getYx(com.alightcreative.app.motion.scene.Vector3D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getY(), p2.getX());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getYx(com.alightcreative.app.motion.scene.Vector4D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getY(), p2.getX());
    }

    public static final com.alightcreative.app.motion.scene.Vector3D getYxz(com.alightcreative.app.motion.scene.Vector4D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(p3.getY(), p3.getX(), p3.getZ());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getYy(com.alightcreative.app.motion.scene.Vector3D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getY(), p2.getY());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getYy(com.alightcreative.app.motion.scene.Vector4D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getY(), p2.getY());
    }

    public static final com.alightcreative.app.motion.scene.Vector3D getYyy(com.alightcreative.app.motion.scene.Vector4D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(p3.getY(), p3.getY(), p3.getY());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getYz(com.alightcreative.app.motion.scene.Vector3D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getY(), p2.getZ());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getYz(com.alightcreative.app.motion.scene.Vector4D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getY(), p2.getZ());
    }

    public static final com.alightcreative.app.motion.scene.Vector3D getYzx(com.alightcreative.app.motion.scene.Vector4D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(p3.getY(), p3.getZ(), p3.getX());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getZx(com.alightcreative.app.motion.scene.Vector3D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getZ(), p2.getX());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getZx(com.alightcreative.app.motion.scene.Vector4D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getZ(), p2.getX());
    }

    public static final com.alightcreative.app.motion.scene.Vector3D getZxy(com.alightcreative.app.motion.scene.Vector4D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(p3.getZ(), p3.getX(), p3.getY());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getZy(com.alightcreative.app.motion.scene.Vector3D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getZ(), p2.getY());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getZy(com.alightcreative.app.motion.scene.Vector4D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getZ(), p2.getY());
    }

    public static final com.alightcreative.app.motion.scene.Vector3D getZyx(com.alightcreative.app.motion.scene.Vector4D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(p3.getZ(), p3.getY(), p3.getX());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getZz(com.alightcreative.app.motion.scene.Vector3D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getZ(), p2.getZ());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D getZz(com.alightcreative.app.motion.scene.Vector4D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getZ(), p2.getZ());
    }

    public static final com.alightcreative.app.motion.scene.Vector3D getZzz(com.alightcreative.app.motion.scene.Vector4D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(p3.getZ(), p3.getZ(), p3.getZ());
    }

    public static synthetic String hUw(float[] p0)
    {
        return com.alightcreative.app.motion.scene.GeometryKt.enclosingTransform$lambda$2(p0);
    }

    public static final com.alightcreative.app.motion.scene.Rectangle intersect(com.alightcreative.app.motion.scene.Rectangle p2, float p3, float p4, float p5, float p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        if (!com.alightcreative.app.motion.scene.GeometryKt.intersects(p2, p3, p4, p5, p6)) {
            return com.alightcreative.app.motion.scene.Rectangle.Companion.getEMPTY();
        } else {
            return new com.alightcreative.app.motion.scene.Rectangle(Math.max(p3, p2.getLeft()), Math.max(p4, p2.getTop()), Math.min(p5, p2.getRight()), Math.min(p6, p2.getBottom()));
        }
    }

    public static final com.alightcreative.app.motion.scene.Rectangle intersect(com.alightcreative.app.motion.scene.Rectangle p3, com.alightcreative.app.motion.scene.Rectangle p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "other");
        return com.alightcreative.app.motion.scene.GeometryKt.intersect(p3, p4.getLeft(), p4.getTop(), p4.getRight(), p4.getBottom());
    }

    public static final com.alightcreative.app.motion.scene.Rectangle intersect(com.alightcreative.app.motion.scene.Rectangle p1, com.alightcreative.app.motion.scene.Rectangle p2, android.graphics.Matrix p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "other");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "transform");
        com.alightcreative.app.motion.scene.Rectangle v2_1 = com.alightcreative.app.motion.scene.GeometryKt.enclosingTransform(p2, p3);
        android.graphics.Matrix v0_4 = new android.graphics.Matrix();
        p3.invert(v0_4);
        return com.alightcreative.app.motion.scene.GeometryKt.enclosingTransform(com.alightcreative.app.motion.scene.GeometryKt.intersect(p1, v2_1), v0_4);
    }

    public static final boolean intersects(com.alightcreative.app.motion.scene.Rectangle p1, float p2, float p3, float p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if ((p1.getLeft() >= p4) || ((p2 >= p1.getRight()) || ((p1.getTop() >= p5) || (p3 >= p1.getBottom())))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final boolean intersects(com.alightcreative.app.motion.scene.Rectangle p2, com.alightcreative.app.motion.scene.Rectangle p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "other");
        if ((p2.getLeft() >= p3.getRight()) || ((p3.getLeft() >= p2.getRight()) || ((p2.getTop() >= p3.getBottom()) || (p3.getTop() >= p2.getBottom())))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final com.alightcreative.app.motion.scene.Vector2D invertY(com.alightcreative.app.motion.scene.Vector2D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getX(), (- p2.getY()));
    }

    public static final boolean isFinite(com.alightcreative.app.motion.scene.Rectangle p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        boolean v0_6 = p2.getLeft();
        if ((!Float.isInfinite(v0_6)) && (!Float.isNaN(v0_6))) {
            boolean v0_1 = p2.getTop();
            if ((!Float.isInfinite(v0_1)) && (!Float.isNaN(v0_1))) {
                boolean v0_3 = p2.getRight();
                if ((!Float.isInfinite(v0_3)) && (!Float.isNaN(v0_3))) {
                    int v2_1 = p2.getBottom();
                    if ((!Float.isInfinite(v2_1)) && (!Float.isNaN(v2_1))) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public static final boolean isFinite(com.alightcreative.app.motion.scene.Vector2D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        boolean v0_2 = p2.getX();
        if ((!Float.isInfinite(v0_2)) && (!Float.isNaN(v0_2))) {
            int v2_1 = p2.getY();
            if ((!Float.isInfinite(v2_1)) && (!Float.isNaN(v2_1))) {
                return 1;
            }
        }
        return 0;
    }

    public static final boolean isFinite(com.alightcreative.app.motion.scene.Vector3D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        boolean v0_4 = p2.getX();
        if ((!Float.isInfinite(v0_4)) && (!Float.isNaN(v0_4))) {
            boolean v0_1 = p2.getY();
            if ((!Float.isInfinite(v0_1)) && (!Float.isNaN(v0_1))) {
                int v2_1 = p2.getZ();
                if ((!Float.isInfinite(v2_1)) && (!Float.isNaN(v2_1))) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static final boolean isFinite(com.alightcreative.app.motion.scene.Vector4D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        boolean v0_6 = p2.getX();
        if ((!Float.isInfinite(v0_6)) && (!Float.isNaN(v0_6))) {
            boolean v0_1 = p2.getY();
            if ((!Float.isInfinite(v0_1)) && (!Float.isNaN(v0_1))) {
                boolean v0_3 = p2.getZ();
                if ((!Float.isInfinite(v0_3)) && (!Float.isNaN(v0_3))) {
                    int v2_1 = p2.getW();
                    if ((!Float.isInfinite(v2_1)) && (!Float.isNaN(v2_1))) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public static final boolean isNaN(com.alightcreative.app.motion.scene.Vector2D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if ((!Float.isNaN(p1.getX())) && (!Float.isNaN(p1.getY()))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final boolean isNaN(com.alightcreative.app.motion.scene.Vector3D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if ((!Float.isNaN(p1.getX())) && ((!Float.isNaN(p1.getY())) && (!Float.isNaN(p1.getZ())))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static final boolean isNaN(com.alightcreative.app.motion.scene.Vector4D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if ((!Float.isNaN(p1.getX())) && ((!Float.isNaN(p1.getY())) && ((!Float.isNaN(p1.getZ())) && (!Float.isNaN(p1.getW()))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static synthetic String j(float[] p0)
    {
        return com.alightcreative.app.motion.scene.GeometryKt.enclosingTransform$lambda$1(p0);
    }

    public static final com.alightcreative.app.motion.scene.OptionalVector2D minus(com.alightcreative.app.motion.scene.OptionalVector2D p1, com.alightcreative.app.motion.scene.Vector2D p2)
    {
        com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "other");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            v1_3 = 0;
        } else {
            v1_3 = ((com.alightcreative.app.motion.scene.Vector2D) p1);
        }
        if (v1_3 != null) {
            com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_1 = com.alightcreative.app.motion.scene.GeometryKt.minus(v1_3, p2);
            if (v1_1 != null) {
                return v1_1;
            }
        }
        return com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
    }

    public static final com.alightcreative.app.motion.scene.Rectangle minus(com.alightcreative.app.motion.scene.Rectangle p1, com.alightcreative.app.motion.scene.Vector2D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "v");
        return com.alightcreative.app.motion.scene.GeometryKt.offset(p1, (- p2.getX()), (- p2.getY()));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D minus(com.alightcreative.app.motion.scene.Vector2D p4, double p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(((float) (((double) p4.getX()) - p5)), ((float) (((double) p4.getY()) - p5)));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D minus(com.alightcreative.app.motion.scene.Vector2D p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D((p2.getX() - p3), (p2.getY() - p3));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D minus(com.alightcreative.app.motion.scene.Vector2D p3, com.alightcreative.app.motion.scene.Vector2D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "other");
        return new com.alightcreative.app.motion.scene.Vector2D((p3.getX() - p4.getX()), (p3.getY() - p4.getY()));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D minus(com.alightcreative.app.motion.scene.Vector3D p5, double p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(((float) (((double) p5.getX()) - p6)), ((float) (((double) p5.getY()) - p6)), ((float) (((double) p5.getZ()) - p6)));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D minus(com.alightcreative.app.motion.scene.Vector3D p3, float p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D((p3.getX() - p4), (p3.getY() - p4), (p3.getZ() - p4));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D minus(com.alightcreative.app.motion.scene.Vector3D p3, com.alightcreative.app.motion.scene.Vector2D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "other");
        return new com.alightcreative.app.motion.scene.Vector3D((p3.getX() - p4.getX()), (p3.getY() - p4.getY()), p3.getZ());
    }

    public static final com.alightcreative.app.motion.scene.Vector3D minus(com.alightcreative.app.motion.scene.Vector3D p4, com.alightcreative.app.motion.scene.Vector3D p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "other");
        return new com.alightcreative.app.motion.scene.Vector3D((p4.getX() - p5.getX()), (p4.getY() - p5.getY()), (p4.getZ() - p5.getZ()));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D minus(com.alightcreative.app.motion.scene.Vector4D p6, double p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        return new com.alightcreative.app.motion.scene.Vector4D(((float) (((double) p6.getX()) - p7)), ((float) (((double) p6.getY()) - p7)), ((float) (((double) p6.getZ()) - p7)), ((float) (((double) p6.getW()) - p7)));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D minus(com.alightcreative.app.motion.scene.Vector4D p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Vector4D((p4.getX() - p5), (p4.getY() - p5), (p4.getZ() - p5), (p4.getW() - p5));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D minus(com.alightcreative.app.motion.scene.Vector4D p5, com.alightcreative.app.motion.scene.Vector4D p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "other");
        return new com.alightcreative.app.motion.scene.Vector4D((p5.getX() - p6.getX()), (p5.getY() - p6.getY()), (p5.getZ() - p6.getZ()), (p5.getW() - p6.getW()));
    }

    public static final com.alightcreative.app.motion.scene.SolidColor mix(com.alightcreative.app.motion.scene.SolidColor p1, com.alightcreative.app.motion.scene.SolidColor p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "x");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "y");
        return com.alightcreative.app.motion.scene.ColorKt.plus(com.alightcreative.app.motion.scene.ColorKt.times(p1, (1065353216 - p3)), com.alightcreative.app.motion.scene.ColorKt.times(p2, p3));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D mix(com.alightcreative.app.motion.scene.Vector2D p1, com.alightcreative.app.motion.scene.Vector2D p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "x");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "y");
        return com.alightcreative.app.motion.scene.GeometryKt.plus(com.alightcreative.app.motion.scene.GeometryKt.times(p1, (1065353216 - p3)), com.alightcreative.app.motion.scene.GeometryKt.times(p2, p3));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D mix(com.alightcreative.app.motion.scene.Vector3D p1, com.alightcreative.app.motion.scene.Vector3D p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "x");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "y");
        return com.alightcreative.app.motion.scene.GeometryKt.plus(com.alightcreative.app.motion.scene.GeometryKt.times(p1, (1065353216 - p3)), com.alightcreative.app.motion.scene.GeometryKt.times(p2, p3));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D mix(com.alightcreative.app.motion.scene.Vector4D p1, com.alightcreative.app.motion.scene.Vector4D p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "x");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "y");
        return com.alightcreative.app.motion.scene.GeometryKt.plus(com.alightcreative.app.motion.scene.GeometryKt.times(p1, (1065353216 - p3)), com.alightcreative.app.motion.scene.GeometryKt.times(p2, p3));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D normalize(com.alightcreative.app.motion.scene.Vector2D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return com.alightcreative.app.motion.scene.GeometryKt.div(p1, com.alightcreative.app.motion.scene.GeometryKt.getLength(p1));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D normalize(com.alightcreative.app.motion.scene.Vector3D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return com.alightcreative.app.motion.scene.GeometryKt.div(p1, com.alightcreative.app.motion.scene.GeometryKt.getLength(p1));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D normalize(com.alightcreative.app.motion.scene.Vector4D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return com.alightcreative.app.motion.scene.GeometryKt.div(p1, com.alightcreative.app.motion.scene.GeometryKt.getLength(p1));
    }

    public static final com.alightcreative.app.motion.scene.Rectangle offset(com.alightcreative.app.motion.scene.Rectangle p4, float p5, float p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Rectangle((p4.getLeft() + p5), (p4.getTop() + p6), (p4.getRight() + p5), (p4.getBottom() + p6));
    }

    public static final com.alightcreative.app.motion.scene.Rectangle offset(com.alightcreative.app.motion.scene.Rectangle p5, com.alightcreative.app.motion.scene.Vector2D p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "v");
        return new com.alightcreative.app.motion.scene.Rectangle((p5.getLeft() + p6.getX()), (p5.getTop() + p6.getY()), (p5.getRight() + p6.getX()), (p5.getBottom() + p6.getY()));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D orElse(com.alightcreative.app.motion.scene.OptionalVector2D p1, com.alightcreative.app.motion.scene.Vector2D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "default");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.OptionalVector2D$NONE)) {
            if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                return ((com.alightcreative.app.motion.scene.Vector2D) p1);
            }
        } else {
            return p2;
        }
    }

    public static final com.alightcreative.app.motion.scene.Vector3D orElse(com.alightcreative.app.motion.scene.OptionalVector3D p1, com.alightcreative.app.motion.scene.Vector3D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "default");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.OptionalVector3D$NONE)) {
            if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector3D)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                return ((com.alightcreative.app.motion.scene.Vector3D) p1);
            }
        } else {
            return p2;
        }
    }

    public static final com.alightcreative.app.motion.scene.Vector4D orElse(com.alightcreative.app.motion.scene.OptionalVector4D p1, com.alightcreative.app.motion.scene.Vector4D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "default");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.OptionalVector4D$NONE)) {
            if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector4D)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                return ((com.alightcreative.app.motion.scene.Vector4D) p1);
            }
        } else {
            return p2;
        }
    }

    public static final com.alightcreative.app.motion.scene.Vector2D orNull(com.alightcreative.app.motion.scene.OptionalVector2D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.OptionalVector2D$NONE)) {
            if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                return ((com.alightcreative.app.motion.scene.Vector2D) p1);
            }
        } else {
            return 0;
        }
    }

    public static final com.alightcreative.app.motion.scene.Vector3D orNull(com.alightcreative.app.motion.scene.OptionalVector3D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.OptionalVector3D$NONE)) {
            if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector3D)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                return ((com.alightcreative.app.motion.scene.Vector3D) p1);
            }
        } else {
            return 0;
        }
    }

    public static final com.alightcreative.app.motion.scene.Vector4D orNull(com.alightcreative.app.motion.scene.OptionalVector4D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.OptionalVector4D$NONE)) {
            if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector4D)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                return ((com.alightcreative.app.motion.scene.Vector4D) p1);
            }
        } else {
            return 0;
        }
    }

    public static final com.alightcreative.app.motion.scene.Vector2D perpCCw(com.alightcreative.app.motion.scene.Vector2D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(p2.getY(), (- p2.getX()));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D perpCw(com.alightcreative.app.motion.scene.Vector2D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D((- p2.getY()), p2.getX());
    }

    public static final com.alightcreative.app.motion.scene.OptionalVector2D plus(com.alightcreative.app.motion.scene.OptionalVector2D p1, com.alightcreative.app.motion.scene.Vector2D p2)
    {
        com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "other");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            v1_3 = 0;
        } else {
            v1_3 = ((com.alightcreative.app.motion.scene.Vector2D) p1);
        }
        if (v1_3 != null) {
            com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_1 = com.alightcreative.app.motion.scene.GeometryKt.plus(v1_3, p2);
            if (v1_1 != null) {
                return v1_1;
            }
        }
        return com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
    }

    public static final com.alightcreative.app.motion.scene.Rectangle plus(com.alightcreative.app.motion.scene.Rectangle p1, com.alightcreative.app.motion.scene.Vector2D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "v");
        return com.alightcreative.app.motion.scene.GeometryKt.offset(p1, p2.getX(), p2.getY());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D plus(com.alightcreative.app.motion.scene.Vector2D p4, double p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(((float) (((double) p4.getX()) + p5)), ((float) (((double) p4.getY()) + p5)));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D plus(com.alightcreative.app.motion.scene.Vector2D p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D((p2.getX() + p3), (p2.getY() + p3));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D plus(com.alightcreative.app.motion.scene.Vector2D p3, com.alightcreative.app.motion.scene.Vector2D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "other");
        return new com.alightcreative.app.motion.scene.Vector2D((p3.getX() + p4.getX()), (p3.getY() + p4.getY()));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D plus(com.alightcreative.app.motion.scene.Vector3D p5, double p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(((float) (((double) p5.getX()) + p6)), ((float) (((double) p5.getY()) + p6)), ((float) (((double) p5.getZ()) + p6)));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D plus(com.alightcreative.app.motion.scene.Vector3D p3, float p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D((p3.getX() + p4), (p3.getY() + p4), (p3.getZ() + p4));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D plus(com.alightcreative.app.motion.scene.Vector3D p3, com.alightcreative.app.motion.scene.Vector2D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "other");
        return new com.alightcreative.app.motion.scene.Vector3D((p3.getX() + p4.getX()), (p3.getY() + p4.getY()), p3.getZ());
    }

    public static final com.alightcreative.app.motion.scene.Vector3D plus(com.alightcreative.app.motion.scene.Vector3D p4, com.alightcreative.app.motion.scene.Vector3D p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "other");
        return new com.alightcreative.app.motion.scene.Vector3D((p4.getX() + p5.getX()), (p4.getY() + p5.getY()), (p4.getZ() + p5.getZ()));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D plus(com.alightcreative.app.motion.scene.Vector4D p6, double p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "<this>");
        return new com.alightcreative.app.motion.scene.Vector4D(((float) (((double) p6.getX()) + p7)), ((float) (((double) p6.getY()) + p7)), ((float) (((double) p6.getZ()) + p7)), ((float) (((double) p6.getW()) + p7)));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D plus(com.alightcreative.app.motion.scene.Vector4D p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Vector4D((p4.getX() + p5), (p4.getY() + p5), (p4.getZ() + p5), (p4.getW() + p5));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D plus(com.alightcreative.app.motion.scene.Vector4D p5, com.alightcreative.app.motion.scene.Vector4D p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "other");
        return new com.alightcreative.app.motion.scene.Vector4D((p5.getX() + p6.getX()), (p5.getY() + p6.getY()), (p5.getZ() + p6.getZ()), (p5.getW() + p6.getW()));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D recip(com.alightcreative.app.motion.scene.Vector2D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D((((float) 1) / p3.getX()), (((float) 1) / p3.getY()));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D recip(com.alightcreative.app.motion.scene.Vector3D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D((((float) 1) / p4.getX()), (((float) 1) / p4.getY()), (((float) 1) / p4.getZ()));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D recip(com.alightcreative.app.motion.scene.Vector4D p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        return new com.alightcreative.app.motion.scene.Vector4D((((float) 1) / p5.getX()), (((float) 1) / p5.getY()), (((float) 1) / p5.getZ()), (((float) 1) / p5.getW()));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D require(com.alightcreative.app.motion.scene.OptionalVector2D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            throw new com.alightcreative.app.motion.scene.MissingVectorException();
        } else {
            return ((com.alightcreative.app.motion.scene.Vector2D) p1);
        }
    }

    public static final com.alightcreative.app.motion.scene.Vector3D require(com.alightcreative.app.motion.scene.OptionalVector3D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector3D)) {
            throw new com.alightcreative.app.motion.scene.MissingVectorException();
        } else {
            return ((com.alightcreative.app.motion.scene.Vector3D) p1);
        }
    }

    public static final com.alightcreative.app.motion.scene.Vector4D require(com.alightcreative.app.motion.scene.OptionalVector4D p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector4D)) {
            throw new com.alightcreative.app.motion.scene.MissingVectorException();
        } else {
            return ((com.alightcreative.app.motion.scene.Vector4D) p1);
        }
    }

    public static final com.alightcreative.app.motion.scene.Vector2D rot(com.alightcreative.app.motion.scene.Vector2D p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        float v0_3 = (((double) p5) * 4580687790476549393);
        float v5_1 = ((float) Math.cos(v0_3));
        float v0_1 = ((float) Math.sin(v0_3));
        return new com.alightcreative.app.motion.scene.Vector2D(((p4.getX() * v5_1) - (p4.getY() * v0_1)), ((p4.getX() * v0_1) + (p4.getY() * v5_1)));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D rot2D(com.alightcreative.app.motion.scene.Vector3D p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        float v0_5 = (((double) p5) * 4580687790476549393);
        float v5_1 = ((float) Math.cos(v0_5));
        float v0_1 = ((float) Math.sin(v0_5));
        return new com.alightcreative.app.motion.scene.Vector3D(((p4.getX() * v5_1) - (p4.getY() * v0_1)), ((p4.getX() * v0_1) + (p4.getY() * v5_1)), p4.getZ());
    }

    public static final com.alightcreative.app.motion.scene.Vector2D rotRadians(com.alightcreative.app.motion.scene.Vector2D p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        float v5_1 = ((float) Math.sin(((double) p5)));
        float v0_3 = ((float) Math.cos(((double) p5)));
        return new com.alightcreative.app.motion.scene.Vector2D(((p4.getX() * v0_3) - (p4.getY() * v5_1)), ((p4.getX() * v5_1) + (p4.getY() * v0_3)));
    }

    public static final com.alightcreative.app.motion.scene.Rectangle scale(com.alightcreative.app.motion.scene.Rectangle p1, float p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return com.alightcreative.app.motion.scene.GeometryKt.scale(p1, p2, p2);
    }

    public static final com.alightcreative.app.motion.scene.Rectangle scale(com.alightcreative.app.motion.scene.Rectangle p4, float p5, float p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Rectangle((p4.getLeft() * p5), (p4.getTop() * p6), (p4.getRight() * p5), (p4.getBottom() * p6));
    }

    public static final com.alightcreative.app.motion.scene.Rectangle scaleAroundCenter(com.alightcreative.app.motion.scene.Rectangle p5, float p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        float v0_3 = ((p5.getWidth() * p6) / 1073741824);
        float v2_0 = ((p5.getHeight() * p6) / 1073741824);
        return new com.alightcreative.app.motion.scene.Rectangle((p5.getCx() - v0_3), (p5.getCy() - v2_0), (p5.getCx() + v0_3), (p5.getCy() + v2_0));
    }

    public static final android.graphics.Matrix times(android.graphics.Matrix p1, android.graphics.Matrix p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "other");
        android.graphics.Matrix v0_3 = new android.graphics.Matrix(p1);
        v0_3.postConcat(p2);
        return v0_3;
    }

    public static final com.alightcreative.app.motion.scene.OptionalVector2D times(com.alightcreative.app.motion.scene.OptionalVector2D p1, double p2)
    {
        com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            v1_2 = 0;
        } else {
            v1_2 = ((com.alightcreative.app.motion.scene.Vector2D) p1);
        }
        if (v1_2 != null) {
            com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_3 = com.alightcreative.app.motion.scene.GeometryKt.times(v1_2, p2);
            if (v1_3 != null) {
                return v1_3;
            }
        }
        return com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
    }

    public static final com.alightcreative.app.motion.scene.OptionalVector2D times(com.alightcreative.app.motion.scene.OptionalVector2D p1, float p2)
    {
        com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            v1_2 = 0;
        } else {
            v1_2 = ((com.alightcreative.app.motion.scene.Vector2D) p1);
        }
        if (v1_2 != null) {
            com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_3 = com.alightcreative.app.motion.scene.GeometryKt.times(v1_2, p2);
            if (v1_3 != null) {
                return v1_3;
            }
        }
        return com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
    }

    public static final com.alightcreative.app.motion.scene.OptionalVector2D times(com.alightcreative.app.motion.scene.OptionalVector2D p1, int p2)
    {
        com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        if (!(p1 instanceof com.alightcreative.app.motion.scene.Vector2D)) {
            v1_2 = 0;
        } else {
            v1_2 = ((com.alightcreative.app.motion.scene.Vector2D) p1);
        }
        if (v1_2 != null) {
            com.alightcreative.app.motion.scene.OptionalVector2D$NONE v1_3 = com.alightcreative.app.motion.scene.GeometryKt.times(v1_2, p2);
            if (v1_3 != null) {
                return v1_3;
            }
        }
        return com.alightcreative.app.motion.scene.OptionalVector2D$NONE.INSTANCE;
    }

    public static final com.alightcreative.app.motion.scene.Vector2D times(com.alightcreative.app.motion.scene.Vector2D p4, double p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D(((float) (((double) p4.getX()) * p5)), ((float) (((double) p4.getY()) * p5)));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D times(com.alightcreative.app.motion.scene.Vector2D p2, float p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D((p2.getX() * p3), (p2.getY() * p3));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D times(com.alightcreative.app.motion.scene.Vector2D p2, int p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D((p2.getX() * ((float) p3)), (p2.getY() * ((float) p3)));
    }

    public static final com.alightcreative.app.motion.scene.Vector2D times(com.alightcreative.app.motion.scene.Vector2D p3, android.graphics.Matrix p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "other");
        float v0_4 = p3.getX();
        com.alightcreative.app.motion.scene.Vector2D v3_3 = p3.getY();
        float[] v1_0 = new float[2];
        v1_0[0] = v0_4;
        v1_0[1] = v3_3;
        p4.mapPoints(v1_0);
        return new com.alightcreative.app.motion.scene.Vector2D(v1_0[0], v1_0[1]);
    }

    public static final com.alightcreative.app.motion.scene.Vector2D times(com.alightcreative.app.motion.scene.Vector2D p3, com.alightcreative.app.motion.scene.Vector2D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "other");
        return new com.alightcreative.app.motion.scene.Vector2D((p3.getX() * p4.getX()), (p3.getY() * p4.getY()));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D times(com.alightcreative.app.motion.scene.Vector3D p5, double p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(((float) (((double) p5.getX()) * p6)), ((float) (((double) p5.getY()) * p6)), ((float) (((double) p5.getZ()) * p6)));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D times(com.alightcreative.app.motion.scene.Vector3D p3, float p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D((p3.getX() * p4), (p3.getY() * p4), (p3.getZ() * p4));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D times(com.alightcreative.app.motion.scene.Vector3D p3, int p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D((p3.getX() * ((float) p4)), (p3.getY() * ((float) p4)), (p3.getZ() * ((float) p4)));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D times(com.alightcreative.app.motion.scene.Vector3D p3, com.alightcreative.app.motion.scene.Vector2D p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "other");
        return new com.alightcreative.app.motion.scene.Vector3D((p3.getX() * p4.getX()), (p3.getY() * p4.getY()), p3.getZ());
    }

    public static final com.alightcreative.app.motion.scene.Vector3D times(com.alightcreative.app.motion.scene.Vector3D p4, com.alightcreative.app.motion.scene.Vector3D p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "other");
        return new com.alightcreative.app.motion.scene.Vector3D((p4.getX() * p5.getX()), (p4.getY() * p5.getY()), (p4.getZ() * p5.getZ()));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D times(com.alightcreative.app.motion.scene.Vector4D p5, double p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        return new com.alightcreative.app.motion.scene.Vector4D(((float) (((double) p5.getX()) * p6)), ((float) (((double) p5.getY()) * p6)), ((float) (((double) p5.getZ()) * p6)), ((float) (((double) 2) * p6)));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D times(com.alightcreative.app.motion.scene.Vector4D p4, float p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Vector4D((p4.getX() * p5), (p4.getY() * p5), (p4.getZ() * p5), (p4.getW() * p5));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D times(com.alightcreative.app.motion.scene.Vector4D p4, int p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Vector4D((p4.getX() * ((float) p5)), (p4.getY() * ((float) p5)), (p4.getZ() * ((float) p5)), ((float) (p5 * 2)));
    }

    public static final com.alightcreative.app.motion.scene.Vector4D times(com.alightcreative.app.motion.scene.Vector4D p5, com.alightcreative.app.motion.scene.Vector4D p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "other");
        return new com.alightcreative.app.motion.scene.Vector4D((p5.getX() * p6.getX()), (p5.getY() * p6.getY()), (p5.getZ() * p6.getZ()), (p5.getW() * p6.getW()));
    }

    public static final float[] toGLMat4(android.graphics.Matrix p19)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "<this>");
        float v2_1 = new float[9];
        p19.getValues(v2_1);
        float v5 = v2_1[1];
        float v7 = v2_1[2];
        float v9 = v2_1[3];
        float v11 = v2_1[4];
        float v13 = v2_1[5];
        float v15 = v2_1[6];
        float v17 = v2_1[7];
        float v2_0 = v2_1[8];
        float[] v0_2 = new float[16];
        v0_2[0] = v2_1[0];
        v0_2[1] = v5;
        v0_2[2] = 0;
        v0_2[3] = v7;
        v0_2[4] = v9;
        v0_2[5] = v11;
        v0_2[6] = 0;
        v0_2[7] = v13;
        v0_2[8] = 0;
        v0_2[9] = 0;
        v0_2[10] = 1065353216;
        v0_2[11] = 0;
        v0_2[12] = v15;
        v0_2[13] = v17;
        v0_2[14] = 0;
        v0_2[15] = v2_0;
        return v0_2;
    }

    public static final android.graphics.RectF toRectF(com.alightcreative.app.motion.scene.Rectangle p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new android.graphics.RectF(p4.getLeft(), p4.getTop(), p4.getRight(), p4.getBottom());
    }

    public static final com.alightcreative.app.motion.scene.Rectangle toRectangle(android.graphics.RectF p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        return new com.alightcreative.app.motion.scene.Rectangle(p4.left, p4.top, p4.right, p4.bottom);
    }

    public static final com.alightcreative.app.motion.scene.Vector2D toVector2DOrNull(String p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "<this>");
        if (p12.length() >= 2) {
            float v12_1 = kotlin.text.StringsKt.indexOf$default(p12, 44, 0, 0, 6, 0);
            if (v12_1 >= 0) {
                String v5_1 = (v12_1 + 1);
                float v0_1 = kotlin.text.StringsKt.indexOf$default(p12, 44, v5_1, 0, 4, 0);
                if (v0_1 <= v12_1) {
                    float v12_2 = p12.substring(0, v12_1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v12_2, "substring(...)");
                    float v12_3 = kotlin.text.StringsKt.toFloatOrNull(v12_2);
                    float v0_4 = p12.substring(v5_1, p12.length());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_4, "substring(...)");
                    float v0_5 = kotlin.text.StringsKt.toFloatOrNull(v0_4);
                    if ((v12_3 != 0) && (v0_5 != 0)) {
                        return new com.alightcreative.app.motion.scene.Vector2D(v12_3.floatValue(), v0_5.floatValue());
                    } else {
                        return 0;
                    }
                } else {
                    String v6_2 = p12.substring(0, v0_1);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v6_2, "substring(...)");
                    float v12_6 = kotlin.text.StringsKt.toFloatOrNull(kotlin.text.StringsKt.replace$default(v6_2, ",", ".", 0, 4, 0));
                    String v5_2 = p12.substring((v0_1 + 1), p12.length());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v5_2, "substring(...)");
                    float v0_9 = kotlin.text.StringsKt.toFloatOrNull(kotlin.text.StringsKt.replace$default(v5_2, ",", ".", 0, 4, 0));
                    if ((v12_6 != 0) && (v0_9 != 0)) {
                        return new com.alightcreative.app.motion.scene.Vector2D(v12_6.floatValue(), v0_9.floatValue());
                    } else {
                        return 0;
                    }
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static final com.alightcreative.app.motion.scene.Vector3D toVector3D(com.alightcreative.app.motion.scene.Vector2D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D(p3.getX(), p3.getY(), 0);
    }

    public static final com.alightcreative.app.motion.scene.Vector3D toVector3DOrNull(String p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "<this>");
        float v8_6 = kotlin.text.StringsKt.indexOf$default(p8, 44, 0, 0, 6, 0);
        float v0_1 = p8;
        float v2_0 = (v8_6 + 1);
        int v6_0 = kotlin.text.StringsKt.indexOf$default(p8, 44, v2_0, 0, 4, 0);
        int v7 = v2_0;
        float v2_1 = (v6_0 + 1);
        int vtmp3 = kotlin.text.StringsKt.indexOf$default(p8, 44, v2_1, 0, 4, 0);
        if (v8_6 >= 0) {
            if (v6_0 >= 0) {
                if (vtmp3 < 0) {
                    float v8_1 = p8.substring(0, v8_6);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v8_1, "substring(...)");
                    float v8_2 = kotlin.text.StringsKt.toFloatOrNull(v8_1);
                    Float v4_1 = p8.substring(v7, v6_0);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_1, "substring(...)");
                    Float v4_2 = kotlin.text.StringsKt.toFloatOrNull(v4_1);
                    float v0_2 = v0_1.substring(v2_1, v0_1.length());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_2, "substring(...)");
                    float v0_3 = kotlin.text.StringsKt.toFloatOrNull(v0_2);
                    if ((v8_2 != 0) && ((v4_2 != null) && (v0_3 != 0))) {
                        return new com.alightcreative.app.motion.scene.Vector3D(v8_2.floatValue(), v4_2.floatValue(), v0_3.floatValue());
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                float v8_4 = com.alightcreative.app.motion.scene.GeometryKt.toVector2DOrNull(p8);
                if (v8_4 == 0) {
                    return 0;
                } else {
                    return new com.alightcreative.app.motion.scene.Vector3D(v8_4.getX(), v8_4.getY(), 0);
                }
            }
        } else {
            return 0;
        }
    }

    public static final com.alightcreative.app.motion.scene.Vector4D toVector4DOrNull(String p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "<this>");
        float v10_4 = kotlin.text.StringsKt.indexOf$default(p10, 44, 0, 0, 6, 0);
        float v0_1 = p10;
        float v2_0 = (v10_4 + 1);
        int v6_0 = kotlin.text.StringsKt.indexOf$default(p10, 44, v2_0, 0, 4, 0);
        int v7 = v2_0;
        float v2_1 = (v6_0 + 1);
        int v8 = kotlin.text.StringsKt.indexOf$default(p10, 44, v2_1, 0, 4, 0);
        int v9 = v2_1;
        float v2_2 = (v8 + 1);
        int vtmp4 = kotlin.text.StringsKt.indexOf$default(p10, 44, v2_2, 0, 4, 0);
        if (v10_4 >= 0) {
            if (v6_0 >= 0) {
                if (v8 >= 0) {
                    if (vtmp4 < 0) {
                        float v10_1 = p10.substring(0, v10_4);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v10_1, "substring(...)");
                        float v10_2 = kotlin.text.StringsKt.toFloatOrNull(v10_1);
                        Float v4_1 = p10.substring(v7, v6_0);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_1, "substring(...)");
                        Float v4_2 = kotlin.text.StringsKt.toFloatOrNull(v4_1);
                        Float v5_2 = p10.substring(v9, v8);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v5_2, "substring(...)");
                        Float v5_3 = kotlin.text.StringsKt.toFloatOrNull(v5_2);
                        float v0_2 = v0_1.substring(v2_2, v0_1.length());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_2, "substring(...)");
                        float v0_3 = kotlin.text.StringsKt.toFloatOrNull(v0_2);
                        if ((v10_2 != 0) && ((v4_2 != null) && ((v5_3 != null) && (v0_3 != 0)))) {
                            return new com.alightcreative.app.motion.scene.Vector4D(v10_2.floatValue(), v4_2.floatValue(), v5_3.floatValue(), v0_3.floatValue());
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
    }

    public static final com.alightcreative.app.motion.scene.Vector2D unaryMinus(com.alightcreative.app.motion.scene.Vector2D p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        return new com.alightcreative.app.motion.scene.Vector2D((- p2.getX()), (- p2.getY()));
    }

    public static final com.alightcreative.app.motion.scene.Vector3D unaryMinus(com.alightcreative.app.motion.scene.Vector3D p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        return new com.alightcreative.app.motion.scene.Vector3D((- p3.getX()), (- p3.getY()), (- p3.getZ()));
    }

    public static final com.alightcreative.app.motion.scene.Rectangle union(com.alightcreative.app.motion.scene.Rectangle p4, float p5, float p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<this>");
        if (!p4.isEmpty()) {
            return new com.alightcreative.app.motion.scene.Rectangle(Math.min(p4.getLeft(), p5), Math.min(p6, p4.getTop()), Math.max(p4.getRight(), p5), Math.max(p6, p4.getBottom()));
        } else {
            return p4;
        }
    }

    public static final com.alightcreative.app.motion.scene.Rectangle union(com.alightcreative.app.motion.scene.Rectangle p2, float p3, float p4, float p5, float p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<this>");
        if ((p3 < p5) && (p4 < p6)) {
            if ((p2.getLeft() >= p2.getRight()) || (p2.getTop() >= p2.getBottom())) {
                p2 = new com.alightcreative.app.motion.scene.Rectangle(p3, p4, p5, p6);
            } else {
                return new com.alightcreative.app.motion.scene.Rectangle(Math.min(p2.getLeft(), p3), Math.min(p2.getTop(), p4), Math.max(p2.getRight(), p5), Math.max(p2.getBottom(), p6));
            }
        }
        return p2;
    }

    public static final com.alightcreative.app.motion.scene.Rectangle union(com.alightcreative.app.motion.scene.Rectangle p3, com.alightcreative.app.motion.scene.Rectangle p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "other");
        return com.alightcreative.app.motion.scene.GeometryKt.union(p3, p4.getLeft(), p4.getTop(), p4.getRight(), p4.getBottom());
    }

    public static final com.alightcreative.app.motion.scene.Rectangle union(com.alightcreative.app.motion.scene.Rectangle p5, com.alightcreative.app.motion.scene.Vector2D p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "p");
        if (!p5.isEmpty()) {
            return new com.alightcreative.app.motion.scene.Rectangle(Math.min(p5.getLeft(), p6.getX()), Math.min(p6.getY(), p5.getTop()), Math.max(p5.getRight(), p6.getX()), Math.max(p6.getY(), p5.getBottom()));
        } else {
            return p5;
        }
    }
}
