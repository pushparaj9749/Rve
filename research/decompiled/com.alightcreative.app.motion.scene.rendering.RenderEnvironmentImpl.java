package com.alightcreative.app.motion.scene.rendering;
final class RenderEnvironmentImpl implements com.alightcreative.app.motion.scene.rendering.RenderEnvironment {
    private FKt.Sq _contentResolver;
    private W9R.Zv9 _videoThumbnails;
    public com.alightcreative.app.motion.scene.SceneElement activeCamera;
    private android.content.Context context;
    private int currentFrame;
    private double durationInSeconds;
    private int editMode;
    private com.alightcreative.app.motion.scene.ExportParams exportParams;
    private int framesPerHundredSeconds;
    private int optiRate;
    private java.util.Map overrideVideoTextures;
    private float previousFrameTime;
    private com.alightcreative.app.motion.scene.rendering.RenderMode renderMode;
    private int rootFPHS;
    private com.alightcreative.app.motion.scene.Scene scene;
    private com.alightcreative.app.motion.scene.SpoidEnv spoidEnv;
    private boolean targetHasAlpha;
    private float time;
    private com.alightcreative.app.motion.scene.UIColors uiColors;
    private java.util.Map userElementParamValues;
    private xT.yH userPreviewMode;
    private fV.a9t videoTextureCache;

    public RenderEnvironmentImpl()
    {
        this.overrideVideoTextures = kotlin.collections.MapsKt.emptyMap();
        this.scene = com.alightcreative.app.motion.scene.SceneKt.emptyScene$default(0, 0, 3, 0);
        this.renderMode = com.alightcreative.app.motion.scene.rendering.RenderMode.PAUSE;
        this.uiColors = com.alightcreative.app.motion.scene.UIColors.Companion.getDEFAULT();
        this.userElementParamValues = kotlin.collections.MapsKt.emptyMap();
        this.rootFPHS = 3000;
        this.userPreviewMode = xT.yH.l.hUw();
        this.spoidEnv = new com.alightcreative.app.motion.scene.SpoidEnv(0, 0, 0, 0, 15, 0);
        this.optiRate = 1;
        return;
    }

    public static synthetic String hUw(long p0, com.alightcreative.app.motion.scene.rendering.RenderEnvironmentImpl p2, int p3, android.net.Uri p4)
    {
        return com.alightcreative.app.motion.scene.rendering.RenderEnvironmentImpl.textureForVideoTrack$lambda$1(p0, p2, p3, p4);
    }

    public static synthetic String j(long p0, int p2, int p3, long p4, com.alightcreative.app.motion.scene.SceneElement p6, com.alightcreative.app.motion.scene.rendering.RenderEnvironmentImpl p7, fV.s p8)
    {
        return com.alightcreative.app.motion.scene.rendering.RenderEnvironmentImpl.textureForVideoTrack$lambda$0(p0, p2, p3, p4, p6, p7, p8);
    }

    private static final String textureForVideoTrack$lambda$0(long p3, int p5, int p6, long p7, com.alightcreative.app.motion.scene.SceneElement p9, com.alightcreative.app.motion.scene.rendering.RenderEnvironmentImpl p10, fV.s p11)
    {
        String v11_1;
        int v0 = p9.getInTime();
        int v9_1 = p9.getStartTime();
        int v10_1 = p10.getRootFPHS();
        if (p11 != null) {
            v11_1 = "OK";
        } else {
            v11_1 = "NOT-FOUND";
        }
        StringBuilder v1_0 = new StringBuilder();
        v1_0.append("VCACHEFRAME: textureForVideoTrack:");
        v1_0.append(p3);
        v1_0.append(" mediaTime=");
        v1_0.append(p5);
        v1_0.append(" >mediaFrame=");
        v1_0.append(p6);
        v1_0.append("  adjMediaTime=");
        v1_0.append(p7);
        v1_0.append(" inTime=");
        v1_0.append(v0);
        v1_0.append(" startTime=");
        v1_0.append(v9_1);
        v1_0.append(" rootFPHS=");
        v1_0.append(v10_1);
        v1_0.append(" ");
        v1_0.append(v11_1);
        return v1_0.toString();
    }

    private static final String textureForVideoTrack$lambda$1(long p3, com.alightcreative.app.motion.scene.rendering.RenderEnvironmentImpl p5, int p6, android.net.Uri p7)
    {
        int v0 = p5.getCurrentFrame();
        fV.a9t v5_1 = p5.getVideoTextureCache();
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("Texture not found for trackId=");
        v1_1.append(p3);
        v1_1.append(" currentFrame=");
        v1_1.append(v0);
        v1_1.append(" cache=");
        v1_1.append(v5_1);
        v1_1.append(" mediaFrame=");
        v1_1.append(p6);
        v1_1.append(" uri=");
        v1_1.append(p7);
        return v1_1.toString();
    }

    public com.alightcreative.app.motion.scene.SolidColor colorFromAttr(int p4, com.alightcreative.app.motion.scene.SolidColor p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "default");
        android.content.res.Resources$Theme v0_1 = this.context;
        if (v0_1 != null) {
            android.content.res.Resources$Theme v0_2 = v0_1.getTheme();
            if (v0_2 != null) {
                android.util.TypedValue v1_1 = new android.util.TypedValue();
                if (v0_2.resolveAttribute(p4, v1_1, 1)) {
                    return FKt.Ep.cD(v1_1.data);
                }
            }
        }
        return p5;
    }

    public com.alightcreative.app.motion.scene.SceneElement getActiveCamera()
    {
        int v0_0 = this.activeCamera;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("activeCamera");
            return 0;
        } else {
            return v0_0;
        }
    }

    public FKt.Sq getContentResolver()
    {
        kotlin.UninitializedPropertyAccessException v0_0 = this._contentResolver;
        if (v0_0 == null) {
            throw new kotlin.UninitializedPropertyAccessException();
        } else {
            return v0_0;
        }
    }

    public final android.content.Context getContext()
    {
        return this.context;
    }

    public int getCurrentFrame()
    {
        return this.currentFrame;
    }

    public double getDurationInSeconds()
    {
        return this.durationInSeconds;
    }

    public int getEditMode()
    {
        return this.editMode;
    }

    public com.alightcreative.app.motion.scene.ExportParams getExportParams()
    {
        return this.exportParams;
    }

    public int getFramesPerHundredSeconds()
    {
        return this.framesPerHundredSeconds;
    }

    public int getOptiRate()
    {
        return this.optiRate;
    }

    public java.util.Map getOverrideVideoTextures()
    {
        return this.overrideVideoTextures;
    }

    public float getPreviousFrameTime()
    {
        return this.previousFrameTime;
    }

    public com.alightcreative.app.motion.scene.rendering.RenderMode getRenderMode()
    {
        return this.renderMode;
    }

    public int getRootFPHS()
    {
        return this.rootFPHS;
    }

    public com.alightcreative.app.motion.scene.Scene getScene()
    {
        return this.scene;
    }

    public com.alightcreative.app.motion.scene.SpoidEnv getSpoidEnv()
    {
        return this.spoidEnv;
    }

    public boolean getTargetHasAlpha()
    {
        return this.targetHasAlpha;
    }

    public float getTime()
    {
        return this.time;
    }

    public com.alightcreative.app.motion.scene.UIColors getUiColors()
    {
        return this.uiColors;
    }

    public java.util.Map getUserElementParamValues()
    {
        return this.userElementParamValues;
    }

    public xT.yH getUserPreviewMode()
    {
        return this.userPreviewMode;
    }

    public fV.a9t getVideoTextureCache()
    {
        return this.videoTextureCache;
    }

    public W9R.Zv9 getVideoThumbnails()
    {
        W9R.Zv9 v0 = this._videoThumbnails;
        kotlin.jvm.internal.Intrinsics.checkNotNull(v0);
        return v0;
    }

    public final FKt.Sq get_contentResolver()
    {
        return this._contentResolver;
    }

    public final W9R.Zv9 get_videoThumbnails()
    {
        return this._videoThumbnails;
    }

    public final void reset()
    {
        this.context = 0;
        this._contentResolver = 0;
        this.setEditMode(0);
        this.setSpoidEnv(new com.alightcreative.app.motion.scene.SpoidEnv(0, 0, 0, 0, 15, 0));
        this.setCurrentFrame(0);
        this.setFramesPerHundredSeconds(0);
        this.setVideoTextureCache(0);
        this.setRenderMode(com.alightcreative.app.motion.scene.rendering.RenderMode.PAUSE);
        this.setUiColors(com.alightcreative.app.motion.scene.UIColors.Companion.getDEFAULT());
        this.setTargetHasAlpha(0);
        this._videoThumbnails = 0;
        this.setUserElementParamValues(kotlin.collections.MapsKt.emptyMap());
        this.setScene(com.alightcreative.app.motion.scene.SceneKt.getEMPTY_SCENE());
        this.setExportParams(0);
        this.setOptiRate(1);
        return;
    }

    public void setActiveCamera(com.alightcreative.app.motion.scene.SceneElement p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.activeCamera = p2;
        return;
    }

    public final void setContext(android.content.Context p1)
    {
        this.context = p1;
        return;
    }

    public void setCurrentFrame(int p1)
    {
        this.currentFrame = p1;
        return;
    }

    public void setDurationInSeconds(double p1)
    {
        this.durationInSeconds = p1;
        return;
    }

    public void setEditMode(int p8)
    {
        this.editMode = p8;
        this.setSpoidEnv(new com.alightcreative.app.motion.scene.SpoidEnv(0, 0, 0, 0, 15, 0));
        return;
    }

    public void setExportParams(com.alightcreative.app.motion.scene.ExportParams p1)
    {
        this.exportParams = p1;
        return;
    }

    public void setFramesPerHundredSeconds(int p1)
    {
        this.framesPerHundredSeconds = p1;
        return;
    }

    public void setOptiRate(int p1)
    {
        this.optiRate = p1;
        return;
    }

    public void setOverrideVideoTextures(java.util.Map p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.overrideVideoTextures = p2;
        return;
    }

    public void setPreviousFrameTime(float p1)
    {
        this.previousFrameTime = p1;
        return;
    }

    public void setRenderMode(com.alightcreative.app.motion.scene.rendering.RenderMode p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.renderMode = p2;
        return;
    }

    public void setRootFPHS(int p1)
    {
        this.rootFPHS = p1;
        return;
    }

    public void setScene(com.alightcreative.app.motion.scene.Scene p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.scene = p2;
        return;
    }

    public void setSpoidEnv(com.alightcreative.app.motion.scene.SpoidEnv p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.spoidEnv = p2;
        return;
    }

    public void setTargetHasAlpha(boolean p1)
    {
        this.targetHasAlpha = p1;
        return;
    }

    public void setTime(float p1)
    {
        this.time = p1;
        return;
    }

    public void setUiColors(com.alightcreative.app.motion.scene.UIColors p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.uiColors = p2;
        return;
    }

    public void setUserElementParamValues(java.util.Map p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.userElementParamValues = p2;
        return;
    }

    public void setUserPreviewMode(xT.yH p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.userPreviewMode = p2;
        return;
    }

    public void setVideoTextureCache(fV.a9t p1)
    {
        this.videoTextureCache = p1;
        return;
    }

    public final void set_contentResolver(FKt.Sq p1)
    {
        this._contentResolver = p1;
        return;
    }

    public final void set_videoThumbnails(W9R.Zv9 p1)
    {
        this._videoThumbnails = p1;
        return;
    }

    public fV.Gc textureForVideoTrack(long p19)
    {
        fV.s v0_9 = ((fV.Gc) this.getOverrideVideoTextures().get(Long.valueOf(p19)));
        if (v0_9 == null) {
            com.alightcreative.app.motion.scene.SceneElement v7 = com.alightcreative.app.motion.scene.SceneKt.nestedElementByTrackId(this.getScene(), Long.valueOf(p19));
            fV.s v0_2 = 0;
            if (v7 != null) {
                android.net.Uri v10 = v7.getFillVideo();
                if (v10 != null) {
                    int v4_5;
                    com.alightcreative.app.motion.scene.rendering.RenderEnvironmentImpl v3_3 = com.alightcreative.app.motion.scene.SceneElementKt.sceneFrameToMediaTimeMillis(v7, this.getCurrentFrame(), this.getFramesPerHundredSeconds(), 0);
                    long v12 = (((long) v3_3) * 1000);
                    int v4_4 = com.alightcreative.app.motion.scene.rendering.SceneRenderingKt.getCachedVideoPtsLessOrEqual(v10, (v12 - 500));
                    if (v4_4 == 0) {
                        v4_5 = hvJ.qfV.j(v7.getFillVideo(), v12, 0, 4, 0);
                    } else {
                        v4_5 = v4_4.longValue();
                    }
                    android.net.Uri v5_2 = v4_5;
                    int v4_7;
                    if (v5_2 < 0) {
                        v4_7 = v3_3;
                    } else {
                        v4_7 = ((int) (v5_2 / 1000));
                    }
                    int v9_4;
                    int v4_8 = com.alightcreative.app.motion.scene.TimeKt.frameNumberFromPTSTime(v4_7, this.getRootFPHS());
                    fV.a9t v8_11 = com.alightcreative.app.motion.scene.rendering.RenderEnvironmentImpl$WhenMappings.$EnumSwitchMapping$0[this.getRenderMode().ordinal()];
                    if ((v8_11 == 1) || ((v8_11 == 2) || (v8_11 == 3))) {
                        fV.a9t v8_12 = this.getVideoTextureCache();
                        if (v8_12 == null) {
                            v9_4 = v0_2;
                        } else {
                            v0_2 = v8_12.hUw(v10, p19, v4_8);
                        }
                    } else {
                        fV.a9t v8_0;
                        if (v8_11 == 4) {
                            fV.a9t v8_13 = this.getVideoTextureCache();
                            if (v8_13 != null) {
                                v8_0 = v8_13.hUw(v10, p19, v4_8);
                                if (v8_0 != null) {
                                    v9_4 = v8_0;
                                    fx.Enc.H(this, new com.alightcreative.app.motion.scene.rendering.xfY(p19, v3_3, v4_8, v5_2, v7, this, v9_4));
                                    if (v9_4 == 0) {
                                        fx.Enc.pM1(this, new com.alightcreative.app.motion.scene.rendering.A(p19, this, v4_8, v10));
                                    }
                                    return v9_4;
                                }
                            }
                            fV.a9t v8_14 = this.getVideoTextureCache();
                            if (v8_14 == null) {
                            } else {
                                v0_2 = v8_14.hUw(v10, p19, (v4_8 - 1));
                            }
                        } else {
                            if (v8_11 != 5) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            } else {
                                fV.a9t v8_15 = this.getVideoTextureCache();
                                if (v8_15 != null) {
                                    v8_0 = v8_15.hUw(v10, p19, v4_8);
                                    if (v8_0 != null) {
                                    }
                                }
                                fV.a9t v8_16 = this.getVideoTextureCache();
                                if (v8_16 == null) {
                                    v8_0 = 0;
                                } else {
                                    v8_0 = v8_16.hUw(v10, p19, (v4_8 - 1));
                                }
                                if (v8_0 == null) {
                                    fV.a9t v8_1 = this.getVideoTextureCache();
                                    if (v8_1 == null) {
                                        v8_0 = 0;
                                    } else {
                                        v8_0 = v8_1.hUw(v10, p19, (v4_8 - 2));
                                    }
                                    if (v8_0 == null) {
                                        fV.a9t v8_2 = this.getVideoTextureCache();
                                        if (v8_2 == null) {
                                            v8_0 = 0;
                                        } else {
                                            v8_0 = v8_2.hUw(v10, p19, (v4_8 - 3));
                                        }
                                        if (v8_0 == null) {
                                            fV.a9t v8_3 = this.getVideoTextureCache();
                                            if (v8_3 == null) {
                                                v8_0 = 0;
                                            } else {
                                                v8_0 = v8_3.hUw(v10, p19, (v4_8 - 4));
                                            }
                                            if (v8_0 == null) {
                                                fV.a9t v8_4 = this.getVideoTextureCache();
                                                if (v8_4 == null) {
                                                } else {
                                                    v0_2 = v8_4.hUw(v10, p19, (v4_8 - 5));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return v0_9;
        }
    }
}
