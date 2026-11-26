package com.alightcreative.share;
public abstract class xfY {
    private static ref.WeakReference hUw = None;
    private static String j = "";

    static xfY()
    {
        return;
    }

    private static final kotlin.Unit AI(com.alightcreative.share.A p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit AM(TV.n p1, SL3.A p2, kotlin.jvm.functions.Function1 p3, com.alightcreative.share.A p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "it");
        com.alightcreative.share.xfY.LV(p4, p1, p2, new SL3.h(p3, p4));
        return kotlin.Unit.INSTANCE;
    }

    public static final void Bb(android.app.Activity p9, android.net.Uri p10, String p11, String p12, TV.n p13, SL3.A p14, kotlin.jvm.functions.Function1 p15)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "contentUri");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "mimeType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "chooseDlgMsg");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "eventLogger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "shareEventLogType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "logOnFirebase");
        android.content.Intent v2_1 = new android.content.Intent();
        v2_1.setAction("android.intent.action.SEND");
        v2_1.putExtra("android.intent.extra.STREAM", p10);
        v2_1.setType(p11);
        com.alightcreative.share.xfY.hUw = new ref.WeakReference(new SL3.CU(p13, p14, p15));
        com.alightcreative.share.xfY.j = p11;
        com.alightcreative.share.xfY.F0(p9, v2_1, p12, p13, p14, 0, 16, 0);
        return;
    }

    public static synthetic android.content.Intent E(android.content.Intent p0)
    {
        return com.alightcreative.share.xfY.jE(p0);
    }

    public static synthetic void F(android.app.Activity p13, java.io.File p14, java.io.File p15, boolean p16, int p17, int p18, String p19, String p20, TV.n p21, SL3.A p22, kotlin.jvm.functions.Function1 p23, int p24, Object p25)
    {
        boolean v5;
        if ((p24 & 4) == 0) {
            v5 = p16;
        } else {
            v5 = 0;
        }
        SL3.A v11;
        if ((p24 & 256) == 0) {
            v11 = p22;
        } else {
            v11 = SL3.A.x;
        }
        kotlin.jvm.functions.Function1 v12;
        if ((p24 & 512) == 0) {
            v12 = p23;
        } else {
            v12 = new SL3.F();
        }
        com.alightcreative.share.xfY.X9x(p13, p14, p15, v5, p17, p18, p19, p20, p21, v11, v12);
        return;
    }

    static synthetic void F0(android.app.Activity p6, android.content.Intent p7, String p8, TV.n p9, SL3.A p10, kotlin.jvm.functions.Function1 p11, int p12, Object p13)
    {
        if ((p12 & 8) != 0) {
            p10 = SL3.A.x;
        }
        if ((p12 & 16) != 0) {
            p11 = new SL3.AWD();
        }
        com.alightcreative.share.xfY.ah(p6, p7, p8, p9, p10, p11);
        return;
    }

    public static final synthetic ref.WeakReference FT()
    {
        return com.alightcreative.share.xfY.hUw;
    }

    private static final kotlin.Unit GO(com.alightcreative.share.A p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit H(TV.n p0, SL3.A p1, kotlin.jvm.functions.Function1 p2, com.alightcreative.share.A p3)
    {
        return com.alightcreative.share.xfY.Jd(p0, p1, p2, p3);
    }

    public static final void Hm(android.app.Activity p9, java.io.File p10, String p11, String p12, TV.n p13, SL3.A p14, kotlin.jvm.functions.Function1 p15)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "mimeType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "chooseDialogTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "eventLogger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "shareEventLogType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "logOnFirebase");
        try {
            ref.WeakReference v10_2 = kotlin.Result.constructor-impl(androidx.core.content.FileProvider.X(p9, "com.alightcreative.app.motion.fileprovider", p10));
        } catch (SL3.c v0_5) {
            v10_2 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(v0_5));
        }
        SL3.c v0_6 = kotlin.Result.exceptionOrNull-impl(v10_2);
        if (v0_6 != null) {
            android.content.Intent v2_1 = com.alightcreative.share.xfY$xfY.$EnumSwitchMapping$0[p14.ordinal()];
            if (v2_1 == 1) {
                p13.hUw(new TV.xfY$Frs(0, v0_6.getMessage()));
            } else {
                if (v2_1 == 2) {
                    p13.hUw(new TV.xfY$AF(0, v0_6.getMessage()));
                } else {
                    if (v2_1 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
            }
        }
        if (kotlin.Result.isFailure-impl(v10_2)) {
            v10_2 = 0;
        }
        ref.WeakReference v10_5 = ((android.net.Uri) v10_2);
        if (v10_5 != null) {
            android.content.Intent v2_7 = new android.content.Intent();
            v2_7.setAction("android.intent.action.SEND");
            v2_7.putExtra("android.intent.extra.STREAM", v10_5);
            v2_7.setType(p11);
            com.alightcreative.share.xfY.hUw = new ref.WeakReference(new SL3.c(p13, p14, p15));
            com.alightcreative.share.xfY.j = p11;
            com.alightcreative.share.xfY.F0(p9, v2_7, p12, p13, p14, 0, 16, 0);
            return;
        } else {
            return;
        }
    }

    public static final synthetic String IB()
    {
        return com.alightcreative.share.xfY.j;
    }

    private static final kotlin.Unit Jd(TV.n p1, SL3.A p2, kotlin.jvm.functions.Function1 p3, com.alightcreative.share.A p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "it");
        com.alightcreative.share.xfY.LV(p4, p1, p2, new SL3.D(p3, p4));
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit K(TV.n p1, SL3.A p2, kotlin.jvm.functions.Function1 p3, com.alightcreative.share.A p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "it");
        com.alightcreative.share.xfY.LV(p4, p1, p2, new SL3.x(p3, p4));
        return kotlin.Unit.INSTANCE;
    }

    private static final void LV(com.alightcreative.share.A p5, TV.n p6, SL3.A p7, kotlin.jvm.functions.Function0 p8)
    {
        if (!(p5 instanceof com.alightcreative.share.A$A)) {
            if (!(p5 instanceof com.alightcreative.share.A$xfY)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                TV.xfY$AF v7_2 = com.alightcreative.share.xfY$xfY.$EnumSwitchMapping$0[p7.ordinal()];
                if (v7_2 == 1) {
                    p6.hUw(new TV.xfY$Frs(0, ((com.alightcreative.share.A$xfY) p5).hUw()));
                    return;
                } else {
                    if (v7_2 == 2) {
                        p6.hUw(new TV.xfY$AF(0, ((com.alightcreative.share.A$xfY) p5).hUw()));
                        return;
                    } else {
                        if (v7_2 != 3) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    }
                }
            }
        } else {
            p8.invoke();
            TV.xfY$AF v7_8 = com.alightcreative.share.xfY$xfY.$EnumSwitchMapping$0[p7.ordinal()];
            if (v7_8 == 1) {
                p6.hUw(new TV.xfY$Frs(((com.alightcreative.share.A$A) p5).j(), 0, 2, 0));
                return;
            } else {
                if (v7_8 == 2) {
                    p6.hUw(new TV.xfY$AF(((com.alightcreative.share.A$A) p5).j(), 0, 2, 0));
                    return;
                } else {
                    if (v7_8 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return;
    }

    private static final kotlin.Unit M(kotlin.jvm.functions.Function1 p0, com.alightcreative.share.A p1)
    {
        p0.invoke(p1);
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void MgY(android.app.Activity p7, java.io.File p8, String p9, String p10, TV.n p11, SL3.A p12, kotlin.jvm.functions.Function1 p13, int p14, Object p15)
    {
        if ((p14 & 16) != 0) {
            p12 = SL3.A.x;
        }
        if ((p14 & 32) != 0) {
            p13 = new SL3.XSt();
        }
        com.alightcreative.share.xfY.Hm(p7, p8, p9, p10, p11, p12, p13);
        return;
    }

    public static final void Q(android.app.Activity p9, String p10, String p11, TV.n p12, SL3.A p13, kotlin.jvm.functions.Function1 p14)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "text");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "chooseDialogTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "eventLogger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "shareEventLogType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "logOnFirebase");
        android.content.Intent v2_1 = new android.content.Intent();
        v2_1.setAction("android.intent.action.SEND");
        ref.WeakReference v0_4 = new StringBuilder();
        v0_4.append("Import Alight Motion Project: ");
        v0_4.append(p10);
        v2_1.putExtra("android.intent.extra.TEXT", v0_4.toString());
        v2_1.setType("text/plain");
        com.alightcreative.share.xfY.hUw = new ref.WeakReference(new SL3.Zv9(p12, p13, p14));
        com.alightcreative.share.xfY.j = "text/plain";
        com.alightcreative.share.xfY.F0(p9, v2_1, p11, p12, p13, 0, 16, 0);
        return;
    }

    private static final kotlin.Unit R(kotlin.jvm.functions.Function1 p0, com.alightcreative.share.A p1)
    {
        p0.invoke(p1);
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit R6(com.alightcreative.share.A p0)
    {
        return com.alightcreative.share.xfY.Z5u(p0);
    }

    public static synthetic kotlin.Unit T(kotlin.jvm.functions.Function1 p0, com.alightcreative.share.A p1)
    {
        return com.alightcreative.share.xfY.rs(p0, p1);
    }

    public static synthetic kotlin.Unit X(kotlin.jvm.functions.Function1 p0, com.alightcreative.share.A p1)
    {
        return com.alightcreative.share.xfY.M(p0, p1);
    }

    public static final void X9x(android.app.Activity p12, java.io.File p13, java.io.File p14, boolean p15, int p16, int p17, String p18, String p19, TV.n p20, SL3.A p21, kotlin.jvm.functions.Function1 p22)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "mimeType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "chooseDialogTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p20, "eventLogger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p21, "shareEventLogType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p22, "logOnFirebase");
        try {
            SL3.m v0_6 = kotlin.Result.constructor-impl(androidx.core.content.FileProvider.X(p12, "com.alightcreative.app.motion.fileprovider", p13));
        } catch (SL3.m v0_7) {
            v0_6 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(v0_7));
        }
        android.app.Activity v2_0 = kotlin.Result.exceptionOrNull-impl(v0_6);
        if (v2_0 != null) {
            int v5_1 = com.alightcreative.share.xfY$xfY.$EnumSwitchMapping$0[p21.ordinal()];
            if (v5_1 == 1) {
                p20.hUw(new TV.xfY$Frs(0, v2_0.getMessage()));
            } else {
                if (v5_1 == 2) {
                    p20.hUw(new TV.xfY$AF(0, v2_0.getMessage()));
                } else {
                    if (v5_1 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
            }
        }
        if (kotlin.Result.isFailure-impl(v0_6)) {
            v0_6 = 0;
        }
        SL3.m v0_11 = ((android.net.Uri) v0_6);
        if (v0_11 != null) {
            android.content.Intent v11_1 = new android.content.Intent();
            v11_1.setAction("android.intent.action.SEND");
            v11_1.putExtra("android.intent.extra.STREAM", v0_11);
            v11_1.setType(p18);
            com.alightcreative.share.xfY.hUw = new ref.WeakReference(new SL3.et(p20, p21, p22));
            com.alightcreative.share.xfY.j = p18;
            com.alightcreative.share.xfY.ah(p12, v11_1, p19, p20, p21, new SL3.m(p14, p12, p13, p18, p17, p15, p16));
            return;
        } else {
            return;
        }
    }

    private static final kotlin.Unit Z5u(com.alightcreative.share.A p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit Zq(kotlin.jvm.functions.Function1 p0, com.alightcreative.share.A p1)
    {
        p0.invoke(p1);
        return kotlin.Unit.INSTANCE;
    }

    private static final void ah(android.app.Activity p4, android.content.Intent p5, String p6, TV.n p7, SL3.A p8, kotlin.jvm.functions.Function1 p9)
    {
        int v1_2;
        android.content.IntentSender v0_3 = new android.content.Intent(p4, com.alightcreative.share.ChooserResultReceiver);
        if (android.os.Build$VERSION.SDK_INT < 31) {
            v1_2 = 134217728;
        } else {
            v1_2 = 33554432;
        }
        p5.addFlags(1);
        TV.xfY$AF v5_1 = android.content.Intent.createChooser(p5, p6, android.app.PendingIntent.getBroadcast(p4, 0, v0_3, v1_2).getIntentSender());
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNull(v5_1);
            p4.startActivity(((android.content.Intent) p9.invoke(v5_1)));
            kotlin.NoWhenBranchMatchedException v4_2 = kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE);
        } catch (kotlin.NoWhenBranchMatchedException v4_3) {
            v4_2 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(v4_3));
        }
        kotlin.NoWhenBranchMatchedException v4_5 = kotlin.Result.exceptionOrNull-impl(v4_2);
        if (v4_5 != null) {
            TV.xfY$AF v5_5 = com.alightcreative.share.xfY$xfY.$EnumSwitchMapping$0[p8.ordinal()];
            if (v5_5 == 1) {
                p7.hUw(new TV.xfY$Frs(0, v4_5.getMessage()));
            } else {
                if (v5_5 == 2) {
                    p7.hUw(new TV.xfY$AF(0, v4_5.getMessage()));
                } else {
                    if (v5_5 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return;
    }

    public static synthetic void ak(android.app.Activity p6, String p7, String p8, TV.n p9, SL3.A p10, kotlin.jvm.functions.Function1 p11, int p12, Object p13)
    {
        if ((p12 & 8) != 0) {
            p10 = SL3.A.x;
        }
        if ((p12 & 16) != 0) {
            p11 = new SL3.Enc();
        }
        com.alightcreative.share.xfY.Q(p6, p7, p8, p9, p10, p11);
        return;
    }

    public static synthetic kotlin.Unit cD(com.alightcreative.share.A p0)
    {
        return com.alightcreative.share.xfY.AI(p0);
    }

    public static synthetic kotlin.Unit cLW(TV.n p0, SL3.A p1, kotlin.jvm.functions.Function1 p2, com.alightcreative.share.A p3)
    {
        return com.alightcreative.share.xfY.w0(p0, p1, p2, p3);
    }

    public static final void cv(android.app.Activity p14, byte[] p15, String p16, String p17, String p18, TV.n p19, SL3.A p20, kotlin.jvm.functions.Function1 p21)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "mimeType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "filename");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "chooseDialogTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "eventLogger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p20, "shareEventLogType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p21, "logOnFirebase");
        int v8_0 = 0;
        if ((kotlin.text.StringsKt.contains$default(p17, "/", 0, 2, 0)) || (p17.length() <= 0)) {
            String v0_5 = new StringBuilder();
            v0_5.append("\'filename\' must be not be empty and may not contain slashes: \'");
            v0_5.append(p17);
            v0_5.append("\'");
            throw new IllegalArgumentException(v0_5.toString().toString());
        } else {
            int v9_4 = p14.getCacheDir();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v9_4, "getCacheDir(...)");
            int v9_5 = kotlin.io.FilesKt.resolve(v9_4, "share");
            int v10_3 = System.currentTimeMillis();
            StringBuilder v12_1 = new StringBuilder();
            v12_1.append("t");
            v12_1.append(v10_3);
            android.content.Intent v2_12 = kotlin.io.FilesKt.resolve(kotlin.io.FilesKt.resolve(v9_5, v12_1.toString()), p17);
            if (v2_12.exists()) {
                throw new IllegalStateException("Check failed.");
            } else {
                int v9_8 = v2_12.getParentFile();
                if (v9_8 != 0) {
                    v9_8.mkdirs();
                }
                kotlin.io.FilesKt.writeBytes(v2_12, p15);
                String v0_12 = kotlin.Result.constructor-impl(androidx.core.content.FileProvider.X(p14, "com.alightcreative.app.motion.fileprovider", v2_12));
            }
        }
        android.content.Intent v2_14 = kotlin.Result.exceptionOrNull-impl(v0_12);
        if (v2_14 != null) {
            int v9_10 = com.alightcreative.share.xfY$xfY.$EnumSwitchMapping$0[p20.ordinal()];
            if (v9_10 == 1) {
                p19.hUw(new TV.xfY$Frs(0, v2_14.getMessage()));
            } else {
                if (v9_10 == 2) {
                    p19.hUw(new TV.xfY$AF(0, v2_14.getMessage()));
                } else {
                    if (v9_10 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
            }
        }
        if (!kotlin.Result.isFailure-impl(v0_12)) {
            v8_0 = v0_12;
        }
        int v8_1 = ((android.net.Uri) v8_0);
        if (v8_1 != 0) {
            com.alightcreative.share.xfY.hUw = new ref.WeakReference(new SL3.cY(p19, p20, p21));
            com.alightcreative.share.xfY.j = p16;
            android.content.Intent v2_8 = new android.content.Intent();
            v2_8.setAction("android.intent.action.SEND");
            v2_8.putExtra("android.intent.extra.STREAM", v8_1);
            v2_8.setType(p16);
            com.alightcreative.share.xfY.F0(p14, v2_8, p18, p19, p20, 0, 16, 0);
            return;
        } else {
            return;
        }
    }

    public static synthetic void d(android.app.Activity p8, String p9, String p10, String p11, String p12, TV.n p13, SL3.A p14, kotlin.jvm.functions.Function1 p15, int p16, Object p17)
    {
        if ((p16 & 32) != 0) {
            p14 = SL3.A.x;
        }
        kotlin.jvm.functions.Function1 v7;
        if ((p16 & 64) == 0) {
            v7 = p15;
        } else {
            v7 = new SL3.MY();
        }
        com.alightcreative.share.xfY.z(p8, p9, p10, p11, p12, p13, p14, v7);
        return;
    }

    public static synthetic android.content.Intent db(java.io.File p0, android.app.Activity p1, java.io.File p2, String p3, int p4, boolean p5, int p6, android.content.Intent p7)
    {
        return com.alightcreative.share.xfY.e(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    private static final android.content.Intent e(java.io.File p4, android.app.Activity p5, java.io.File p6, String p7, int p8, boolean p9, int p10, android.content.Intent p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "$this$launchShareChooser");
        if (p4 == null) {
            return p11;
        } else {
            android.content.Intent v4_8 = p11.putExtra("android.intent.extra.INITIAL_INTENTS", ((android.os.Parcelable[]) new android.content.pm.LabeledIntent[] {new android.content.pm.LabeledIntent(new android.content.Intent(p5.getBaseContext(), com.alightcreative.app.motion.activities.SaveToStorageActivity).putExtra("internalPath", p6.getAbsolutePath()).putExtra("targetPath", p4.getAbsolutePath()).putExtra("mimeType", p7).putExtra("saveCompleteMessage", p5.getString(p8)).putExtra("indexMedia", p9), p5.getPackageName(), p10, 2131231823)})));
            kotlin.jvm.internal.Intrinsics.checkNotNull(v4_8);
            return v4_8;
        }
    }

    private static final kotlin.Unit f(com.alightcreative.share.A p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit hUw(TV.n p0, SL3.A p1, kotlin.jvm.functions.Function1 p2, com.alightcreative.share.A p3)
    {
        return com.alightcreative.share.xfY.AM(p0, p1, p2, p3);
    }

    public static synthetic kotlin.Unit j(TV.n p0, SL3.A p1, kotlin.jvm.functions.Function1 p2, com.alightcreative.share.A p3)
    {
        return com.alightcreative.share.xfY.K(p0, p1, p2, p3);
    }

    private static final android.content.Intent jE(android.content.Intent p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        return p1;
    }

    public static synthetic kotlin.Unit l(kotlin.jvm.functions.Function1 p0, com.alightcreative.share.A p1)
    {
        return com.alightcreative.share.xfY.Zq(p0, p1);
    }

    private static final kotlin.Unit n(com.alightcreative.share.A p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "it");
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void nvG(android.app.Activity p7, android.net.Uri p8, String p9, String p10, TV.n p11, SL3.A p12, kotlin.jvm.functions.Function1 p13, int p14, Object p15)
    {
        if ((p14 & 16) != 0) {
            p12 = SL3.A.x;
        }
        if ((p14 & 32) != 0) {
            p13 = new SL3.V();
        }
        com.alightcreative.share.xfY.Bb(p7, p8, p9, p10, p11, p12, p13);
        return;
    }

    public static synthetic kotlin.Unit ojl(com.alightcreative.share.A p0)
    {
        return com.alightcreative.share.xfY.GO(p0);
    }

    public static synthetic kotlin.Unit pM1(TV.n p0, SL3.A p1, kotlin.jvm.functions.Function1 p2, com.alightcreative.share.A p3)
    {
        return com.alightcreative.share.xfY.t(p0, p1, p2, p3);
    }

    public static synthetic kotlin.Unit q(com.alightcreative.share.A p0)
    {
        return com.alightcreative.share.xfY.n(p0);
    }

    private static final kotlin.Unit rs(kotlin.jvm.functions.Function1 p0, com.alightcreative.share.A p1)
    {
        p0.invoke(p1);
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit t(TV.n p1, SL3.A p2, kotlin.jvm.functions.Function1 p3, com.alightcreative.share.A p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "it");
        com.alightcreative.share.xfY.LV(p4, p1, p2, new SL3.qfV(p3, p4));
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit uKP(com.alightcreative.share.A p0)
    {
        return com.alightcreative.share.xfY.f(p0);
    }

    public static synthetic kotlin.Unit w(kotlin.jvm.functions.Function1 p0, com.alightcreative.share.A p1)
    {
        return com.alightcreative.share.xfY.x1(p0, p1);
    }

    private static final kotlin.Unit w0(TV.n p1, SL3.A p2, kotlin.jvm.functions.Function1 p3, com.alightcreative.share.A p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "it");
        com.alightcreative.share.xfY.LV(p4, p1, p2, new SL3.K(p3, p4));
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit x(kotlin.jvm.functions.Function1 p0, com.alightcreative.share.A p1)
    {
        return com.alightcreative.share.xfY.R(p0, p1);
    }

    private static final kotlin.Unit x1(kotlin.jvm.functions.Function1 p0, com.alightcreative.share.A p1)
    {
        p0.invoke(p1);
        return kotlin.Unit.INSTANCE;
    }

    public static final void z(android.app.Activity p1, String p2, String p3, String p4, String p5, TV.n p6, SL3.A p7, kotlin.jvm.functions.Function1 p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "mimeType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "filename");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "chooseDialogTitle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "eventLogger");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "shareEventLogType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "logOnFirebase");
        byte[] v2_1 = p2.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_1, "getBytes(...)");
        com.alightcreative.share.xfY.cv(p1, v2_1, p3, p4, p5, p6, p7, p8);
        return;
    }
}
