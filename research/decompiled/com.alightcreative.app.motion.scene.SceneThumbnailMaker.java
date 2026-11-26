package com.alightcreative.app.motion.scene;
public final class SceneThumbnailMaker extends com.alightcreative.mediacore.naxyasync.F {
    static final synthetic kotlin.reflect.KProperty[] $$delegatedProperties;
    public static final int $stable;
    private final long AUTO_RELEASE_TIMEOUT;
    private final android.content.Context appContext;
    private final FKt.Sq contentResolver;
    private final String contextTag;
    private final FKt.nAU convertArray$delegate;
    private final java.util.WeakHashMap elementThumbnailCache;
    private final FKt.nAU emptyBitmap$delegate;
    private fV.HLZ gctx;
    private final int height;
    private final FKt.nAU pixelArray$delegate;
    private final FKt.nAU pixels$delegate;
    private final Runnable releaseResourcesRunnable;
    private final FKt.sKo rmgr;
    private final java.util.WeakHashMap sceneOpaqueThumbnailCache;
    private final java.util.WeakHashMap sceneThumbnailCache;
    private fV.f8r textureCache;
    private final android.os.Handler uiThreadHandler;
    private final int width;

    static SceneThumbnailMaker()
    {
        int v0_6 = kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.alightcreative.app.motion.scene.SceneThumbnailMaker, "emptyBitmap", "getEmptyBitmap()Landroid/graphics/Bitmap;", 0));
        kotlin.reflect.KProperty1 v2_1 = kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.alightcreative.app.motion.scene.SceneThumbnailMaker, "pixels", "getPixels()Ljava/nio/IntBuffer;", 0));
        kotlin.reflect.KProperty1 v3_2 = kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.alightcreative.app.motion.scene.SceneThumbnailMaker, "pixelArray", "getPixelArray()[I", 0));
        kotlin.reflect.KProperty1 v1_1 = kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.alightcreative.app.motion.scene.SceneThumbnailMaker, "convertArray", "getConvertArray()[I", 0));
        kotlin.reflect.KProperty[] v5_5 = new kotlin.reflect.KProperty[4];
        v5_5[0] = v0_6;
        v5_5[1] = v2_1;
        v5_5[2] = v3_2;
        v5_5[3] = v1_1;
        com.alightcreative.app.motion.scene.SceneThumbnailMaker.$$delegatedProperties = v5_5;
        com.alightcreative.app.motion.scene.SceneThumbnailMaker.$stable = 8;
        return;
    }

    public SceneThumbnailMaker(String p8, android.content.Context p9, int p10, int p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "contextTag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "context");
        com.alightcreative.app.motion.scene.SceneThumbnailMaker v1_1 = super(0, 0, 3, 0);
        v1_1.contextTag = p8;
        v1_1.width = p10;
        v1_1.height = p11;
        java.util.WeakHashMap v8_2 = new FKt.sKo();
        v1_1.rmgr = v8_2;
        v1_1.AUTO_RELEASE_TIMEOUT = 2000;
        v1_1.appContext = p9.getApplicationContext();
        v1_1.contentResolver = new FKt.Sq(p9);
        v1_1.uiThreadHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        v1_1.emptyBitmap$delegate = new FKt.nAU(v8_2, new com.alightcreative.app.motion.scene.jd(super));
        v1_1.pixels$delegate = new FKt.nAU(v8_2, new com.alightcreative.app.motion.scene.y3Q(super));
        v1_1.pixelArray$delegate = new FKt.nAU(v8_2, new com.alightcreative.app.motion.scene.CgS(super));
        v1_1.convertArray$delegate = new FKt.nAU(v8_2, new com.alightcreative.app.motion.scene.DW(super));
        super.startWorker();
        v1_1.releaseResourcesRunnable = new com.alightcreative.app.motion.scene.f8r(super);
        v1_1.sceneThumbnailCache = new java.util.WeakHashMap();
        v1_1.elementThumbnailCache = new java.util.WeakHashMap();
        v1_1.sceneOpaqueThumbnailCache = new java.util.WeakHashMap();
        return;
    }

    public static synthetic int[] Bb(com.alightcreative.app.motion.scene.SceneThumbnailMaker p0)
    {
        return com.alightcreative.app.motion.scene.SceneThumbnailMaker.pixelArray_delegate$lambda$2(p0);
    }

    public static synthetic String Hm()
    {
        return com.alightcreative.app.motion.scene.SceneThumbnailMaker.releaseResources$lambda$5$lambda$4();
    }

    public static synthetic String Jd()
    {
        return com.alightcreative.app.motion.scene.SceneThumbnailMaker.makeThumbnailInternal$lambda$10();
    }

    public static synthetic String K()
    {
        return com.alightcreative.app.motion.scene.SceneThumbnailMaker.makeThumbnailInternal$lambda$14();
    }

    public static synthetic void Q(com.alightcreative.app.motion.scene.SceneThumbnailMaker p0)
    {
        com.alightcreative.app.motion.scene.SceneThumbnailMaker.releaseResourcesRunnable$lambda$6(p0);
        return;
    }

    public static synthetic String R(com.alightcreative.app.motion.scene.SceneElement p0, Integer p1, int p2, int p3, int p4, Long p5, com.alightcreative.app.motion.scene.Scene p6, com.alightcreative.app.motion.scene.SceneThumbnailMaker p7, int p8, int p9)
    {
        return com.alightcreative.app.motion.scene.SceneThumbnailMaker.makeThumbnailInternal$lambda$13(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public static synthetic kotlin.Unit X9x(com.alightcreative.app.motion.scene.SceneThumbnailMaker p0)
    {
        return com.alightcreative.app.motion.scene.SceneThumbnailMaker.releaseResources$lambda$5(p0);
    }

    public static synthetic java.nio.IntBuffer Z5u(com.alightcreative.app.motion.scene.SceneThumbnailMaker p0)
    {
        return com.alightcreative.app.motion.scene.SceneThumbnailMaker.pixels_delegate$lambda$1(p0);
    }

    public static synthetic kotlin.Unit ak(kotlin.jvm.internal.Ref$ObjectRef p0, com.alightcreative.app.motion.scene.SceneThumbnailMaker p1, com.alightcreative.app.motion.scene.Scene p2, Long p3, Integer p4, java.util.concurrent.CountDownLatch p5, java.util.concurrent.atomic.AtomicBoolean p6, kotlin.jvm.functions.Function1 p7)
    {
        return com.alightcreative.app.motion.scene.SceneThumbnailMaker.makeThumbnailAsync$lambda$22(p0, p1, p2, p3, p4, p5, p6, p7);
    }

    private static final int[] convertArray_delegate$lambda$3(com.alightcreative.app.motion.scene.SceneThumbnailMaker p1)
    {
        int[] v1_2 = new int[(p1.width * p1.height)];
        return v1_2;
    }

    public static synthetic CharSequence cv(com.alightcreative.app.motion.scene.SceneElement p0)
    {
        return com.alightcreative.app.motion.scene.SceneThumbnailMaker.makeThumbnailInternal$lambda$13$lambda$12(p0);
    }

    private static final android.graphics.Bitmap emptyBitmap_delegate$lambda$0(com.alightcreative.app.motion.scene.SceneThumbnailMaker p2)
    {
        return android.graphics.Bitmap.createBitmap(p2.width, p2.height, android.graphics.Bitmap$Config.ARGB_8888);
    }

    public static synthetic int[] f(com.alightcreative.app.motion.scene.SceneThumbnailMaker p0)
    {
        return com.alightcreative.app.motion.scene.SceneThumbnailMaker.convertArray_delegate$lambda$3(p0);
    }

    private final int[] getConvertArray()
    {
        return ((int[]) this.convertArray$delegate.hUw(this, com.alightcreative.app.motion.scene.SceneThumbnailMaker.$$delegatedProperties[3]));
    }

    private final android.graphics.Bitmap getEmptyBitmap()
    {
        return ((android.graphics.Bitmap) this.emptyBitmap$delegate.hUw(this, com.alightcreative.app.motion.scene.SceneThumbnailMaker.$$delegatedProperties[0]));
    }

    private final int[] getPixelArray()
    {
        return ((int[]) this.pixelArray$delegate.hUw(this, com.alightcreative.app.motion.scene.SceneThumbnailMaker.$$delegatedProperties[2]));
    }

    private final java.nio.IntBuffer getPixels()
    {
        return ((java.nio.IntBuffer) this.pixels$delegate.hUw(this, com.alightcreative.app.motion.scene.SceneThumbnailMaker.$$delegatedProperties[1]));
    }

    public static synthetic android.graphics.Bitmap makeThumbnail$default(com.alightcreative.app.motion.scene.SceneThumbnailMaker p1, com.alightcreative.app.motion.scene.Scene p2, Long p3, Integer p4, boolean p5, int p6, Object p7)
    {
        if ((p6 & 2) != 0) {
            p3 = 0;
        }
        if ((p6 & 4) != 0) {
            p4 = 0;
        }
        if ((p6 & 8) != 0) {
            p5 = 0;
        }
        return p1.makeThumbnail(p2, p3, p4, p5);
    }

    private static final kotlin.Unit makeThumbnail$lambda$23(kotlin.jvm.internal.Ref$ObjectRef p0, com.alightcreative.app.motion.scene.SceneThumbnailMaker p1, com.alightcreative.app.motion.scene.Scene p2, Long p3, Integer p4, boolean p5, java.util.concurrent.CountDownLatch p6)
    {
        p0.element = p1.makeThumbnailInternal(p2, p3, p4, p5);
        p6.countDown();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void makeThumbnailAsync$default(com.alightcreative.app.motion.scene.SceneThumbnailMaker p1, com.alightcreative.app.motion.scene.Scene p2, Long p3, Integer p4, kotlin.jvm.functions.Function1 p5, int p6, Object p7)
    {
        if ((p6 & 2) != 0) {
            p3 = 0;
        }
        if ((p6 & 4) != 0) {
            p4 = 0;
        }
        p1.makeThumbnailAsync(p2, p3, p4, p5);
        return;
    }

    private static final kotlin.Unit makeThumbnailAsync$lambda$22(kotlin.jvm.internal.Ref$ObjectRef p7, com.alightcreative.app.motion.scene.SceneThumbnailMaker p8, com.alightcreative.app.motion.scene.Scene p9, Long p10, Integer p11, java.util.concurrent.CountDownLatch p12, java.util.concurrent.atomic.AtomicBoolean p13, kotlin.jvm.functions.Function1 p14)
    {
        p7.element = com.alightcreative.app.motion.scene.SceneThumbnailMaker.makeThumbnailInternal$default(p8, p9, p10, p11, 0, 8, 0);
        p8.uiThreadHandler.post(new com.alightcreative.app.motion.scene.uPt(p7, p13, p14));
        p12.countDown();
        return kotlin.Unit.INSTANCE;
    }

    private static final void makeThumbnailAsync$lambda$22$lambda$21(kotlin.jvm.internal.Ref$ObjectRef p1, java.util.concurrent.atomic.AtomicBoolean p2, kotlin.jvm.functions.Function1 p3)
    {
        android.graphics.Bitmap v1_2 = ((android.graphics.Bitmap) p1.element);
        if ((v1_2 != null) && (!p2.getAndSet(1))) {
            p3.invoke(v1_2);
        }
        return;
    }

    private final android.graphics.Bitmap makeThumbnailInternal(com.alightcreative.app.motion.scene.Scene p35, Long p36, Integer p37, boolean p38)
    {
        com.alightcreative.app.motion.scene.Scene v1_0 = p35;
        android.graphics.Bitmap v0_0 = EgU.xfY.H(p35.getWidth(), p35.getHeight(), this.width, this.height);
        int[] v5_0 = ((Number) v0_0.component1()).intValue();
        int v6_4 = ((Number) v0_0.component2()).intValue();
        android.graphics.Bitmap$Config v2_3 = com.alightcreative.app.motion.scene.SceneKt.elementById(p35, p36);
        if ((v2_3 != null) || (p36 == null)) {
            if ((v5_0 >= 1) && (v6_4 >= 1)) {
                if (v2_3 == null) {
                    if (!p38) {
                        try {
                            android.graphics.Bitmap v0_32 = ((android.graphics.Bitmap) this.sceneThumbnailCache.get(p35));
                        } catch (android.graphics.Bitmap v0_35) {
                            throw v0_35;
                        }
                        if (v0_32 == null) {
                        } else {
                            return v0_32;
                        }
                    } else {
                        try {
                            android.graphics.Bitmap v0_45 = ((android.graphics.Bitmap) this.sceneThumbnailCache.get(p35));
                        } catch (android.graphics.Bitmap v0_46) {
                            throw v0_46;
                        }
                        if (v0_45 == null) {
                        } else {
                            return v0_45;
                        }
                    }
                } else {
                    if (p38) {
                        throw new IllegalArgumentException("Failed requirement.");
                    } else {
                        try {
                            android.graphics.Bitmap v0_50 = ((android.graphics.Bitmap) this.elementThumbnailCache.get(v2_3));
                        } catch (android.graphics.Bitmap v0_51) {
                            throw v0_51;
                        }
                        if (v0_50 == null) {
                        } else {
                            return v0_50;
                        }
                    }
                }
                android.graphics.Bitmap v0_52 = this.gctx;
                com.alightcreative.app.motion.scene.SceneSelection v12_0 = 0;
                if (v0_52 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
                    v0_52 = 0;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(v0_52.FT(), fV.Xo.hUw)) {
                    fx.Enc.H(this, new com.alightcreative.app.motion.scene.i());
                    android.graphics.Bitmap v0_5 = this.gctx;
                    if (v0_5 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
                        v0_5 = 0;
                    }
                    v0_5.F(new fV.sKo(v5_0, v6_4));
                } else {
                    android.graphics.Bitmap v0_56 = this.gctx;
                    if (v0_56 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
                        v0_56 = 0;
                    }
                    android.graphics.Bitmap v0_59;
                    android.graphics.Bitmap v0_58 = v0_56.FT();
                    if (!(v0_58 instanceof fV.sKo)) {
                        v0_59 = 0;
                    } else {
                        v0_59 = ((fV.sKo) v0_58);
                    }
                    if ((v0_59 == null) || (v0_59.j() != v5_0)) {
                    } else {
                        android.graphics.Bitmap v0_61 = this.gctx;
                        if (v0_61 == null) {
                            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
                            v0_61 = 0;
                        }
                        android.graphics.Bitmap v0_1;
                        android.graphics.Bitmap v0_63 = v0_61.FT();
                        if (!(v0_63 instanceof fV.sKo)) {
                            v0_1 = 0;
                        } else {
                            v0_1 = ((fV.sKo) v0_63);
                        }
                        if ((v0_1 == null) || (v0_1.hUw() != v6_4)) {
                        } else {
                        }
                    }
                }
                android.graphics.Bitmap v0_7;
                if (v2_3 == null) {
                    v0_7 = 0;
                } else {
                    v0_7 = v2_3.getType();
                }
                if ((v0_7 != com.alightcreative.app.motion.scene.SceneElementType.Scene) || (v2_3.getNestedScene().getThumbnailTime() < 0)) {
                    int v3_3 = 0;
                } else {
                    v3_3 = v2_3.getNestedScene().getThumbnailTime();
                }
                android.graphics.Bitmap v0_15;
                if (p37 == null) {
                    android.graphics.Bitmap v0_12;
                    if (v2_3 == null) {
                        v0_12 = 0;
                    } else {
                        v0_12 = Integer.valueOf((v2_3.getStartTime() + (200000 / p35.getFramesPerHundredSeconds())));
                    }
                    if (v0_12 == null) {
                        v0_15 = 0;
                    } else {
                        v0_15 = v0_12.intValue();
                    }
                } else {
                    v0_15 = p37.intValue();
                }
                int v4_1 = (v0_15 + v3_3);
                Exception v9_0 = v5_0;
                int[] v5_1 = com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(v4_1, p35.getFramesPerHundredSeconds());
                com.alightcreative.app.motion.scene.Scene v1_1 = v2_3;
                com.alightcreative.app.motion.scene.SceneThumbnailMaker v10_0 = v6_4;
                try {
                    v2_3 = v1_1;
                    v1_0 = this;
                    android.graphics.Bitmap v0_20 = v9_0;
                    int v31 = v10_0;
                    try {
                        fx.Enc.H(this, new com.alightcreative.app.motion.scene.Xat(v1_1, p37, v3_3, v4_1, v5_1, p36, p35, this, v9_0, v10_0));
                        int v3_5 = v2_3;
                    } catch (android.graphics.Bitmap v0_22) {
                        com.alightcreative.app.motion.scene.SceneThumbnailMaker v10_1 = this;
                        int v32 = v2_3;
                        v1_0 = p35;
                        com.google.firebase.crashlytics.FirebaseCrashlytics.getInstance().recordException(v0_22);
                        android.graphics.Bitmap v0_34 = android.graphics.Bitmap.createBitmap(v10_1.width, v10_1.height, android.graphics.Bitmap$Config.ARGB_8888);
                        v0_34.eraseColor(-65536);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v0_34);
                        int v15_2 = v32;
                        if (v15_2 == 0) {
                            if (!p38) {
                                try {
                                    v10_1.sceneThumbnailCache.put(v1_0, v0_34);
                                } catch (android.graphics.Bitmap v0_37) {
                                    throw v0_37;
                                }
                            } else {
                                try {
                                    v10_1.sceneOpaqueThumbnailCache.put(v1_0, v0_34);
                                } catch (android.graphics.Bitmap v0_38) {
                                    throw v0_38;
                                }
                            }
                        } else {
                            try {
                                v10_1.elementThumbnailCache.put(v15_2, v0_34);
                            } catch (android.graphics.Bitmap v0_39) {
                                throw v0_39;
                            }
                        }
                        return v0_34;
                    }
                    android.graphics.Bitmap$Config v2_4 = this.contentResolver;
                    int v4_2 = this.gctx;
                    if (v4_2 == 0) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
                        v4_2 = 0;
                    }
                    int v4_4 = v4_2.x();
                    int v6_1 = this.gctx;
                    if (v6_1 == 0) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
                        v6_1 = 0;
                    }
                    int v6_3 = v6_1.R6();
                    int v7_3 = this.gctx;
                    if (v7_3 == 0) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
                        v7_3 = 0;
                    }
                    int v7_5 = v7_3.x();
                    int v8_1 = this.gctx;
                    if (v8_1 == 0) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
                        v8_1 = 0;
                    }
                    int v8_3 = v8_1.R6();
                    Exception v9_1 = this.gctx;
                    if (v9_1 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
                        v9_1 = 0;
                    }
                    Exception v9_3 = v9_1.hUw();
                    com.alightcreative.app.motion.scene.SceneThumbnailMaker v10_2 = this.textureCache;
                    if (v10_2 != null) {
                        v12_0 = v10_2;
                    } else {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("textureCache");
                    }
                    int v14_0;
                    com.alightcreative.app.motion.scene.SceneThumbnailMaker v10_4 = kotlin.collections.MapsKt.emptyMap();
                    if (p36 != null) {
                        v14_0 = com.alightcreative.app.motion.scene.rendering.RenderMode.THUMB;
                    } else {
                        v14_0 = com.alightcreative.app.motion.scene.rendering.RenderMode.SCENE_THUMB;
                    }
                    int v15_0 = v3_5;
                    v3_5 = v5_1;
                    try {
                        Exception v37_1 = v0_20;
                        v1_0 = 0;
                        try {
                            v32 = v15_0;
                            v1_0 = p35;
                            try {
                                com.alightcreative.app.motion.scene.rendering.SceneRenderingKt.renderWithGpu$default(p35, v2_4, v3_5, v4_4, v6_3, v7_5, v8_3, v9_3, v12_0, v10_4, v14_0, com.alightcreative.app.motion.scene.SceneKt.getEMPTY_SCENE_SELECTION(), 0, 0, 0, p38, p36, 0, 0, 0, 0, new com.alightcreative.app.motion.scene.Rectangle(0, 0, ((float) p35.getWidth()), ((float) p35.getHeight())), 0, 0, 0, new g7.xfY(1, 0), 0, 0, 107952128, 0);
                                v10_1 = this;
                            } catch (android.graphics.Bitmap v0_22) {
                                v10_1 = this;
                            }
                            android.graphics.Bitmap$Config v2_12;
                            fx.Enc.H(this, new com.alightcreative.app.motion.scene.E4F());
                            this.getPixels().rewind();
                            int[] v5_3 = v37_1;
                            int v6_6 = v31;
                            android.opengl.GLES20.glReadPixels(0, 0, v5_3, v6_6, 6408, 5121, this.getPixels());
                            Exception v9_6 = v5_3;
                            if (!this.getPixels().hasArray()) {
                                this.getPixels().rewind();
                                this.getPixels().get(this.getPixelArray());
                                v2_12 = this.getPixelArray();
                            } else {
                                v2_12 = this.getPixels().array();
                            }
                            int v13_4 = 0;
                            while (v13_4 < v6_6) {
                                int v3_8 = 0;
                                while (v3_8 < v9_6) {
                                    this.getConvertArray()[((v13_4 * v9_6) + v3_8)] = FKt.Ep.hUw(v2_12[((((v6_6 - 1) - v13_4) * v9_6) + v3_8)]);
                                    v3_8++;
                                }
                                v13_4++;
                            }
                            v0_34 = android.graphics.Bitmap.createBitmap(this.getConvertArray(), v9_6, v6_6, android.graphics.Bitmap$Config.ARGB_8888);
                        } catch (android.graphics.Bitmap v0_22) {
                            v10_1 = this;
                            v1_0 = p35;
                            v32 = 0;
                        } catch (android.graphics.Bitmap v0_23) {
                            throw v0_23;
                        }
                    } catch (android.graphics.Bitmap v0_22) {
                        v10_1 = 0;
                        v32 = v15_0;
                    }
                } catch (android.graphics.Bitmap v0_22) {
                    v32 = this;
                    v1_0 = p35;
                    v10_1 = this;
                }
            } else {
                return this.getEmptyBitmap();
            }
        } else {
            return this.getEmptyBitmap();
        }
    }

    static synthetic android.graphics.Bitmap makeThumbnailInternal$default(com.alightcreative.app.motion.scene.SceneThumbnailMaker p0, com.alightcreative.app.motion.scene.Scene p1, Long p2, Integer p3, boolean p4, int p5, Object p6)
    {
        if ((p5 & 8) != 0) {
            p4 = 0;
        }
        return p0.makeThumbnailInternal(p1, p2, p3, p4);
    }

    private static final String makeThumbnailInternal$lambda$10()
    {
        return "SceneThumbnailMaker:recreateRenderer";
    }

    private static final String makeThumbnailInternal$lambda$13(com.alightcreative.app.motion.scene.SceneElement p14, Integer p15, int p16, int p17, int p18, Long p19, com.alightcreative.app.motion.scene.Scene p20, com.alightcreative.app.motion.scene.SceneThumbnailMaker p21, int p22, int p23)
    {
        String v14_1;
        String v1_0 = 0;
        if (p14 == null) {
            v14_1 = 0;
        } else {
            v14_1 = p14.getType();
        }
        int v2 = p20.getTotalTime();
        String v3 = p20.getTitle();
        int v4_0 = p21.gctx;
        if (v4_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
            v4_0 = 0;
        }
        int v4_1 = v4_0.x();
        int v0_1 = p21.gctx;
        if (v0_1 != 0) {
            v1_0 = v0_1;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
        }
        int v0_2 = v1_0.R6();
        String v1_1 = kotlin.collections.CollectionsKt.joinToString$default(p20.getElements(), ",", 0, 0, 0, 0, new com.alightcreative.app.motion.scene.oc(), 30, 0);
        String v5_2 = p20.getTitle();
        StringBuilder v6_2 = new StringBuilder();
        v6_2.append("SceneThumbnailMaker:MAKE_THUMB type=");
        v6_2.append(v14_1);
        v6_2.append(" time=");
        v6_2.append(p15);
        v6_2.append(" offsetTime=");
        v6_2.append(p16);
        v6_2.append(" actualTime=");
        v6_2.append(p17);
        v6_2.append(" renderFrame=");
        v6_2.append(p18);
        v6_2.append(" elementId=");
        v6_2.append(p19);
        v6_2.append(" totalTime=");
        v6_2.append(v2);
        v6_2.append("  title=");
        v6_2.append(v3);
        v6_2.append(" gctx.w,h=");
        v6_2.append(v4_1);
        v6_2.append(",");
        v6_2.append(v0_2);
        v6_2.append(" actualW,H=");
        v6_2.append(p22);
        v6_2.append(",");
        v6_2.append(p23);
        v6_2.append(" e=");
        v6_2.append(v1_1);
        v6_2.append(" scene=");
        v6_2.append(v5_2);
        return v6_2.toString();
    }

    private static final CharSequence makeThumbnailInternal$lambda$13$lambda$12(com.alightcreative.app.motion.scene.SceneElement p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "it");
        String v0_1 = p2.getStartTime();
        String v2_2 = p2.getEndTime();
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append(v0_1);
        v1_1.append("-");
        v1_1.append(v2_2);
        return v1_1.toString();
    }

    private static final String makeThumbnailInternal$lambda$14()
    {
        return "SceneThumbnailMaker:MAKE_THUMB DONE";
    }

    public static synthetic void nvG(kotlin.jvm.internal.Ref$ObjectRef p0, java.util.concurrent.atomic.AtomicBoolean p1, kotlin.jvm.functions.Function1 p2)
    {
        com.alightcreative.app.motion.scene.SceneThumbnailMaker.makeThumbnailAsync$lambda$22$lambda$21(p0, p1, p2);
        return;
    }

    private static final int[] pixelArray_delegate$lambda$2(com.alightcreative.app.motion.scene.SceneThumbnailMaker p1)
    {
        int[] v1_2 = new int[(p1.width * p1.height)];
        return v1_2;
    }

    private static final java.nio.IntBuffer pixels_delegate$lambda$1(com.alightcreative.app.motion.scene.SceneThumbnailMaker p1)
    {
        return java.nio.IntBuffer.allocate((p1.width * p1.height));
    }

    private static final kotlin.Unit releaseResources$lambda$5(com.alightcreative.app.motion.scene.SceneThumbnailMaker p3)
    {
        com.alightcreative.app.motion.scene.g9j v0_0 = p3.gctx;
        String v1 = 0;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
            v0_0 = 0;
        }
        v0_0.F(fV.Xo.hUw);
        p3.rmgr.j();
        com.alightcreative.app.motion.scene.g9j v0_1 = p3.textureCache;
        if (v0_1 != null) {
            v1 = v0_1;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("textureCache");
        }
        v1.j();
        fx.Enc.H(p3, new com.alightcreative.app.motion.scene.g9j());
        return kotlin.Unit.INSTANCE;
    }

    private static final String releaseResources$lambda$5$lambda$4()
    {
        return "SceneThumbnailMaker:releaseResources";
    }

    private static final void releaseResourcesRunnable$lambda$6(com.alightcreative.app.motion.scene.SceneThumbnailMaker p0)
    {
        p0.releaseResources();
        return;
    }

    public static synthetic android.graphics.Bitmap x1(com.alightcreative.app.motion.scene.SceneThumbnailMaker p0)
    {
        return com.alightcreative.app.motion.scene.SceneThumbnailMaker.emptyBitmap_delegate$lambda$0(p0);
    }

    public static synthetic kotlin.Unit z(kotlin.jvm.internal.Ref$ObjectRef p0, com.alightcreative.app.motion.scene.SceneThumbnailMaker p1, com.alightcreative.app.motion.scene.Scene p2, Long p3, Integer p4, boolean p5, java.util.concurrent.CountDownLatch p6)
    {
        return com.alightcreative.app.motion.scene.SceneThumbnailMaker.makeThumbnail$lambda$23(p0, p1, p2, p3, p4, p5, p6);
    }

    protected void doWork()
    {
        this.allowSleepUntilCommand();
        return;
    }

    public final String getContextTag()
    {
        return this.contextTag;
    }

    public final int getHeight()
    {
        return this.height;
    }

    public final int getWidth()
    {
        return this.width;
    }

    public final android.graphics.Bitmap makeThumbnail(com.alightcreative.app.motion.scene.Scene p9, Long p10, Integer p11, boolean p12)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "scene");
        this.uiThreadHandler.removeCallbacks(this.releaseResourcesRunnable);
        this.uiThreadHandler.postDelayed(this.releaseResourcesRunnable, this.AUTO_RELEASE_TIMEOUT);
        java.util.concurrent.CountDownLatch v7_0 = new java.util.concurrent.CountDownLatch(1);
        kotlin.jvm.internal.Ref$ObjectRef v1_1 = new kotlin.jvm.internal.Ref$ObjectRef();
        this.runInWorker(new com.alightcreative.app.motion.scene.u(v1_1, this, p9, p10, p11, p12, v7_0));
        v7_0.await();
        android.graphics.Bitmap v0_5 = v1_1.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(v0_5);
        return ((android.graphics.Bitmap) v0_5);
    }

    public final void makeThumbnailAsync(com.alightcreative.app.motion.scene.Scene p12, Long p13, Integer p14, kotlin.jvm.functions.Function1 p15)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "scene");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "completion");
        this.uiThreadHandler.removeCallbacks(this.releaseResourcesRunnable);
        this.uiThreadHandler.postDelayed(this.releaseResourcesRunnable, this.AUTO_RELEASE_TIMEOUT);
        Throwable v0_1 = com.alightcreative.app.motion.scene.SceneKt.elementById(p12, p13);
        if ((v0_1 != null) || (!p13)) {
            if (v0_1 == null) {
                try {
                    Throwable v0_5 = ((android.graphics.Bitmap) this.sceneThumbnailCache.get(p12));
                } catch (Throwable v0_6) {
                    android.graphics.Bitmap v12_1 = v0_6;
                    throw v12_1;
                }
                if (v0_5 == null) {
                } else {
                    try {
                        p15.invoke(v0_5);
                        return;
                    } catch (Throwable v0_7) {
                        v12_1 = v0_7;
                    }
                }
            } else {
                try {
                    Throwable v0_9 = ((android.graphics.Bitmap) this.elementThumbnailCache.get(v0_1));
                } catch (Throwable v0_10) {
                    throw v0_10;
                }
                if (v0_9 == null) {
                } else {
                    p15.invoke(v0_9);
                    return;
                }
            }
            java.util.concurrent.CountDownLatch v8_1 = new java.util.concurrent.CountDownLatch(1);
            java.util.concurrent.atomic.AtomicBoolean v9_1 = new java.util.concurrent.atomic.AtomicBoolean(0);
            kotlin.jvm.internal.Ref$ObjectRef v3_1 = new kotlin.jvm.internal.Ref$ObjectRef();
            this.runInWorker(new com.alightcreative.app.motion.scene.lX(v3_1, this, p12, p13, p14, v8_1, v9_1, p15));
            if (v8_1.await(3, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                android.graphics.Bitmap v12_6 = ((android.graphics.Bitmap) v3_1.element);
                if ((v12_6 != null) && (!v9_1.getAndSet(1))) {
                    p15.invoke(v12_6);
                }
            }
            return;
        } else {
            p15.invoke(this.getEmptyBitmap());
            return;
        }
    }

    protected void onStart()
    {
        int v0_0 = this.appContext;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_0, "appContext");
        int v0_1 = UPt.CU.j(v0_0, this.contextTag, 0, 0, 12, 0);
        this.gctx = v0_1;
        int v1_1 = 0;
        if (v0_1 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
            v0_1 = 0;
        }
        v0_1.X9x();
        int v0_2 = this.gctx;
        if (v0_2 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
            v0_2 = 0;
        }
        fV.HLZ v7;
        v0_2.F(new fV.sKo(this.width, this.height));
        int v0_3 = this.gctx;
        if (v0_3 != 0) {
            v7 = v0_3;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
            v7 = 0;
        }
        int v0_4 = this.gctx;
        if (v0_4 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
            v0_4 = 0;
        }
        int v8 = v0_4.x();
        int v0_5 = this.gctx;
        if (v0_5 != 0) {
            v1_1 = v0_5;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
        }
        this.textureCache = new fV.f8r(v7, v8, v1_1.R6(), ((this.width * this.height) * 16), fV.u.w, 0);
        return;
    }

    protected void onStop()
    {
        int v0_0 = this.gctx;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("gctx");
            v0_0 = 0;
        }
        v0_0.release();
        return;
    }

    public final void release()
    {
        this.stopWorkerThread();
        return;
    }

    public final void releaseResources()
    {
        this.runInWorker(new com.alightcreative.app.motion.scene.etR(this));
        return;
    }
}
