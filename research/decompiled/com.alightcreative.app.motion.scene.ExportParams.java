package com.alightcreative.app.motion.scene;
public final class ExportParams {
    public static final int $stable;
    private final boolean audio;
    private final int audioBitrate;
    private final int audioChannelCount;
    private final String audioMime;
    private final int audioSampleRate;
    private final int durationOfNoWatermarkPeriod;
    private final int endFrame;
    private final com.alightcreative.app.motion.scene.ExportFormat format;
    private final int fphs;
    private final int height;
    private final int idrInterval;
    private final int imageQuality;
    private final boolean opaque;
    private final int startFrame;
    private final int startOfNoWatermarkPeriod;
    private final boolean video;
    private final int videoBitrate;
    private final String videoMime;
    private final int width;

    static ExportParams()
    {
        return;
    }

    public ExportParams(int p3, int p4, int p5, int p6, int p7, int p8, com.alightcreative.app.motion.scene.ExportFormat p9, boolean p10, boolean p11, int p12, int p13, String p14, String p15, int p16, int p17, int p18, int p19, int p20, boolean p21)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "videoMime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p15, "audioMime");
        this.width = p3;
        this.height = p4;
        this.audioBitrate = p5;
        this.videoBitrate = p6;
        this.idrInterval = p7;
        this.fphs = p8;
        this.format = p9;
        this.audio = p10;
        this.video = p11;
        this.startFrame = p12;
        this.endFrame = p13;
        this.videoMime = p14;
        this.audioMime = p15;
        this.audioSampleRate = p16;
        this.audioChannelCount = p17;
        this.startOfNoWatermarkPeriod = p18;
        this.durationOfNoWatermarkPeriod = p19;
        this.imageQuality = p20;
        this.opaque = p21;
        return;
    }

    public synthetic ExportParams(int p23, int p24, int p25, int p26, int p27, int p28, com.alightcreative.app.motion.scene.ExportFormat p29, boolean p30, boolean p31, int p32, int p33, String p34, String p35, int p36, int p37, int p38, int p39, int p40, boolean p41, int p42, kotlin.jvm.internal.DefaultConstructorMarker p43)
    {
        int v18;
        if ((p42 & 32768) == 0) {
            v18 = p38;
        } else {
            v18 = 0;
        }
        int v19;
        if ((p42 & 65536) == 0) {
            v19 = p39;
        } else {
            v19 = 0;
        }
        int v20;
        if ((p42 & 131072) == 0) {
            v20 = p40;
        } else {
            v20 = 100;
        }
        this(p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, v18, v19, v20, p41);
        return;
    }

    public static synthetic com.alightcreative.app.motion.scene.ExportParams copy$default(com.alightcreative.app.motion.scene.ExportParams p17, int p18, int p19, int p20, int p21, int p22, int p23, com.alightcreative.app.motion.scene.ExportFormat p24, boolean p25, boolean p26, int p27, int p28, String p29, String p30, int p31, int p32, int p33, int p34, int p35, boolean p36, int p37, Object p38)
    {
        int v2_1;
        if ((p37 & 1) == 0) {
            v2_1 = p18;
        } else {
            v2_1 = p17.width;
        }
        int v3_1;
        if ((p37 & 2) == 0) {
            v3_1 = p19;
        } else {
            v3_1 = p17.height;
        }
        int v4_1;
        if ((p37 & 4) == 0) {
            v4_1 = p20;
        } else {
            v4_1 = p17.audioBitrate;
        }
        int v5_1;
        if ((p37 & 8) == 0) {
            v5_1 = p21;
        } else {
            v5_1 = p17.videoBitrate;
        }
        int v6_1;
        if ((p37 & 16) == 0) {
            v6_1 = p22;
        } else {
            v6_1 = p17.idrInterval;
        }
        int v7_1;
        if ((p37 & 32) == 0) {
            v7_1 = p23;
        } else {
            v7_1 = p17.fphs;
        }
        com.alightcreative.app.motion.scene.ExportFormat v8_1;
        if ((p37 & 64) == 0) {
            v8_1 = p24;
        } else {
            v8_1 = p17.format;
        }
        boolean v9_1;
        if ((p37 & 128) == 0) {
            v9_1 = p25;
        } else {
            v9_1 = p17.audio;
        }
        boolean v10_1;
        if ((p37 & 256) == 0) {
            v10_1 = p26;
        } else {
            v10_1 = p17.video;
        }
        int v11_1;
        if ((p37 & 512) == 0) {
            v11_1 = p27;
        } else {
            v11_1 = p17.startFrame;
        }
        int v12_1;
        if ((p37 & 1024) == 0) {
            v12_1 = p28;
        } else {
            v12_1 = p17.endFrame;
        }
        String v13_1;
        if ((p37 & 2048) == 0) {
            v13_1 = p29;
        } else {
            v13_1 = p17.videoMime;
        }
        String v14_1;
        if ((p37 & 4096) == 0) {
            v14_1 = p30;
        } else {
            v14_1 = p17.audioMime;
        }
        int v15_1;
        if ((p37 & 8192) == 0) {
            v15_1 = p31;
        } else {
            v15_1 = p17.audioSampleRate;
        }
        int v2_3;
        if ((p37 & 16384) == 0) {
            v2_3 = p32;
        } else {
            v2_3 = p17.audioChannelCount;
        }
        boolean v1_1;
        if ((p37 & 32768) == 0) {
            v1_1 = p33;
        } else {
            v1_1 = p17.startOfNoWatermarkPeriod;
        }
        boolean v1_2;
        if ((p37 & 65536) == 0) {
            v1_2 = p34;
        } else {
            v1_2 = p17.durationOfNoWatermarkPeriod;
        }
        boolean v1_3;
        if ((p37 & 131072) == 0) {
            v1_3 = p35;
        } else {
            v1_3 = p17.imageQuality;
        }
        boolean v36_1;
        int v37_1;
        if ((p37 & 262144) == 0) {
            v37_1 = p36;
            v36_1 = v1_3;
        } else {
            v36_1 = v1_3;
            v37_1 = p17.opaque;
        }
        return p17.copy(v2_1, v3_1, v4_1, v5_1, v6_1, v7_1, v8_1, v9_1, v10_1, v11_1, v12_1, v13_1, v14_1, v15_1, v2_3, v1_1, v1_2, v36_1, v37_1);
    }

    public final int component1()
    {
        return this.width;
    }

    public final int component10()
    {
        return this.startFrame;
    }

    public final int component11()
    {
        return this.endFrame;
    }

    public final String component12()
    {
        return this.videoMime;
    }

    public final String component13()
    {
        return this.audioMime;
    }

    public final int component14()
    {
        return this.audioSampleRate;
    }

    public final int component15()
    {
        return this.audioChannelCount;
    }

    public final int component16()
    {
        return this.startOfNoWatermarkPeriod;
    }

    public final int component17()
    {
        return this.durationOfNoWatermarkPeriod;
    }

    public final int component18()
    {
        return this.imageQuality;
    }

    public final boolean component19()
    {
        return this.opaque;
    }

    public final int component2()
    {
        return this.height;
    }

    public final int component3()
    {
        return this.audioBitrate;
    }

    public final int component4()
    {
        return this.videoBitrate;
    }

    public final int component5()
    {
        return this.idrInterval;
    }

    public final int component6()
    {
        return this.fphs;
    }

    public final com.alightcreative.app.motion.scene.ExportFormat component7()
    {
        return this.format;
    }

    public final boolean component8()
    {
        return this.audio;
    }

    public final boolean component9()
    {
        return this.video;
    }

    public final com.alightcreative.app.motion.scene.ExportParams copy(int p22, int p23, int p24, int p25, int p26, int p27, com.alightcreative.app.motion.scene.ExportFormat p28, boolean p29, boolean p30, int p31, int p32, String p33, String p34, int p35, int p36, int p37, int p38, int p39, boolean p40)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p28, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p33, "videoMime");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p34, "audioMime");
        return new com.alightcreative.app.motion.scene.ExportParams(p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.alightcreative.app.motion.scene.ExportParams)) {
                if (this.width == ((com.alightcreative.app.motion.scene.ExportParams) p5).width) {
                    if (this.height == ((com.alightcreative.app.motion.scene.ExportParams) p5).height) {
                        if (this.audioBitrate == ((com.alightcreative.app.motion.scene.ExportParams) p5).audioBitrate) {
                            if (this.videoBitrate == ((com.alightcreative.app.motion.scene.ExportParams) p5).videoBitrate) {
                                if (this.idrInterval == ((com.alightcreative.app.motion.scene.ExportParams) p5).idrInterval) {
                                    if (this.fphs == ((com.alightcreative.app.motion.scene.ExportParams) p5).fphs) {
                                        if (this.format == ((com.alightcreative.app.motion.scene.ExportParams) p5).format) {
                                            if (this.audio == ((com.alightcreative.app.motion.scene.ExportParams) p5).audio) {
                                                if (this.video == ((com.alightcreative.app.motion.scene.ExportParams) p5).video) {
                                                    if (this.startFrame == ((com.alightcreative.app.motion.scene.ExportParams) p5).startFrame) {
                                                        if (this.endFrame == ((com.alightcreative.app.motion.scene.ExportParams) p5).endFrame) {
                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.videoMime, ((com.alightcreative.app.motion.scene.ExportParams) p5).videoMime)) {
                                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.audioMime, ((com.alightcreative.app.motion.scene.ExportParams) p5).audioMime)) {
                                                                    if (this.audioSampleRate == ((com.alightcreative.app.motion.scene.ExportParams) p5).audioSampleRate) {
                                                                        if (this.audioChannelCount == ((com.alightcreative.app.motion.scene.ExportParams) p5).audioChannelCount) {
                                                                            if (this.startOfNoWatermarkPeriod == ((com.alightcreative.app.motion.scene.ExportParams) p5).startOfNoWatermarkPeriod) {
                                                                                if (this.durationOfNoWatermarkPeriod == ((com.alightcreative.app.motion.scene.ExportParams) p5).durationOfNoWatermarkPeriod) {
                                                                                    if (this.imageQuality == ((com.alightcreative.app.motion.scene.ExportParams) p5).imageQuality) {
                                                                                        if (this.opaque == ((com.alightcreative.app.motion.scene.ExportParams) p5).opaque) {
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

    public final boolean getAudio()
    {
        return this.audio;
    }

    public final int getAudioBitrate()
    {
        return this.audioBitrate;
    }

    public final int getAudioChannelCount()
    {
        return this.audioChannelCount;
    }

    public final String getAudioMime()
    {
        return this.audioMime;
    }

    public final int getAudioSampleRate()
    {
        return this.audioSampleRate;
    }

    public final int getDurationOfNoWatermarkPeriod()
    {
        return this.durationOfNoWatermarkPeriod;
    }

    public final int getEndFrame()
    {
        return this.endFrame;
    }

    public final com.alightcreative.app.motion.scene.ExportFormat getFormat()
    {
        return this.format;
    }

    public final int getFphs()
    {
        return this.fphs;
    }

    public final int getHeight()
    {
        return this.height;
    }

    public final int getIdrInterval()
    {
        return this.idrInterval;
    }

    public final int getImageQuality()
    {
        return this.imageQuality;
    }

    public final boolean getOpaque()
    {
        return this.opaque;
    }

    public final int getStartFrame()
    {
        return this.startFrame;
    }

    public final int getStartOfNoWatermarkPeriod()
    {
        return this.startOfNoWatermarkPeriod;
    }

    public final boolean getVideo()
    {
        return this.video;
    }

    public final int getVideoBitrate()
    {
        return this.videoBitrate;
    }

    public final String getVideoMime()
    {
        return this.videoMime;
    }

    public final int getWidth()
    {
        return this.width;
    }

    public int hashCode()
    {
        return ((((((((((((((((((((((((((((((((((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.audioBitrate)) * 31) + Integer.hashCode(this.videoBitrate)) * 31) + Integer.hashCode(this.idrInterval)) * 31) + Integer.hashCode(this.fphs)) * 31) + this.format.hashCode()) * 31) + Boolean.hashCode(this.audio)) * 31) + Boolean.hashCode(this.video)) * 31) + Integer.hashCode(this.startFrame)) * 31) + Integer.hashCode(this.endFrame)) * 31) + this.videoMime.hashCode()) * 31) + this.audioMime.hashCode()) * 31) + Integer.hashCode(this.audioSampleRate)) * 31) + Integer.hashCode(this.audioChannelCount)) * 31) + Integer.hashCode(this.startOfNoWatermarkPeriod)) * 31) + Integer.hashCode(this.durationOfNoWatermarkPeriod)) * 31) + Integer.hashCode(this.imageQuality)) * 31) + Boolean.hashCode(this.opaque));
    }

    public String toString()
    {
        String v1_0 = this.width;
        int v2 = this.height;
        int v3 = this.audioBitrate;
        int v4 = this.videoBitrate;
        int v5 = this.idrInterval;
        int v6 = this.fphs;
        com.alightcreative.app.motion.scene.ExportFormat v7 = this.format;
        boolean v8 = this.audio;
        boolean v9 = this.video;
        int v10 = this.startFrame;
        int v11 = this.endFrame;
        String v12 = this.videoMime;
        String v13 = this.audioMime;
        int v14 = this.audioSampleRate;
        int v16 = this.audioChannelCount;
        int v17 = this.startOfNoWatermarkPeriod;
        int v18 = this.durationOfNoWatermarkPeriod;
        int v19 = this.imageQuality;
        String v15_4 = this.opaque;
        String v0_2 = new StringBuilder();
        boolean v20 = v15_4;
        v0_2.append("ExportParams(width=");
        v0_2.append(v1_0);
        v0_2.append(", height=");
        v0_2.append(v2);
        v0_2.append(", audioBitrate=");
        v0_2.append(v3);
        v0_2.append(", videoBitrate=");
        v0_2.append(v4);
        v0_2.append(", idrInterval=");
        v0_2.append(v5);
        v0_2.append(", fphs=");
        v0_2.append(v6);
        v0_2.append(", format=");
        v0_2.append(v7);
        v0_2.append(", audio=");
        v0_2.append(v8);
        v0_2.append(", video=");
        v0_2.append(v9);
        v0_2.append(", startFrame=");
        v0_2.append(v10);
        v0_2.append(", endFrame=");
        v0_2.append(v11);
        v0_2.append(", videoMime=");
        v0_2.append(v12);
        v0_2.append(", audioMime=");
        v0_2.append(v13);
        v0_2.append(", audioSampleRate=");
        v0_2.append(v14);
        v0_2.append(unu.QWS.ksRAQQYmrswm.ZlSCLvTqN);
        v0_2.append(v16);
        v0_2.append(", startOfNoWatermarkPeriod=");
        v0_2.append(v17);
        v0_2.append(", durationOfNoWatermarkPeriod=");
        v0_2.append(v18);
        v0_2.append(", imageQuality=");
        v0_2.append(v19);
        v0_2.append(", opaque=");
        v0_2.append(v20);
        v0_2.append(")");
        return v0_2.toString();
    }
}
