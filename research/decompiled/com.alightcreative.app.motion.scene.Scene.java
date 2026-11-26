package com.alightcreative.app.motion.scene;
public final class Scene {
    public static final int $stable = 8;
    private final com.alightcreative.app.motion.scene.SolidColor background;
    private final java.util.Map bookmarks;
    private final java.util.List elements;
    private final int exportHeight;
    private final int exportWidth;
    private final int formatVersion;
    private final int framesPerHundredSeconds;
    private final int height;
    private final java.util.Map mediaInfo;
    private final long modifiedTime;
    private final com.alightcreative.app.motion.scene.PrecomposeType precompose;
    private final boolean reTimingAdaptFrameRate;
    private final int reTimingInMark;
    private final com.alightcreative.app.motion.scene.ReTimingMethod reTimingMethod;
    private final int reTimingOutMark;
    private final String templateLink;
    private final int thumbnailTime;
    private final String title;
    private final int totalTime;
    private final com.alightcreative.app.motion.scene.SceneType type;
    private final int width;

    static Scene()
    {
        return;
    }

    public Scene(String p8, int p9, int p10, int p11, int p12, int p13, java.util.List p14, int p15, com.alightcreative.app.motion.scene.SolidColor p16, com.alightcreative.app.motion.scene.PrecomposeType p17, com.alightcreative.app.motion.scene.SceneType p18, java.util.Map p19, com.alightcreative.app.motion.scene.ReTimingMethod p20, int p21, int p22, int p23, boolean p24, long p25, java.util.Map p27, String p28)
    {
        int v8_9;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p14, "elements");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p16, "background");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "precompose");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "bookmarks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p20, "reTimingMethod");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p27, "mediaInfo");
        this.title = p8;
        this.formatVersion = p9;
        this.width = p10;
        this.height = p11;
        this.exportWidth = p12;
        this.exportHeight = p13;
        this.elements = p14;
        this.framesPerHundredSeconds = p15;
        this.background = p16;
        this.precompose = p17;
        this.type = p18;
        this.bookmarks = p19;
        this.reTimingMethod = p20;
        this.reTimingInMark = p21;
        this.reTimingOutMark = p22;
        this.thumbnailTime = p23;
        this.reTimingAdaptFrameRate = p24;
        this.modifiedTime = p25;
        this.mediaInfo = p27;
        this.templateLink = p28;
        int v8_8 = p14.iterator();
        if (v8_8.hasNext()) {
            Object v9_2 = v8_8.next();
            if (v8_8.hasNext()) {
                int v10_4 = ((com.alightcreative.app.motion.scene.SceneElement) v9_2).getEndTime();
                do {
                    boolean v11_1 = v8_8.next();
                    int v12_3 = ((com.alightcreative.app.motion.scene.SceneElement) v11_1).getEndTime();
                    if (v10_4 < v12_3) {
                        v9_2 = v11_1;
                        v10_4 = v12_3;
                    }
                } while(v8_8.hasNext());
            }
            v8_9 = v9_2;
        } else {
            v8_9 = 0;
        }
        int v8_11;
        int v8_10 = ((com.alightcreative.app.motion.scene.SceneElement) v8_9);
        if (v8_10 == 0) {
            v8_11 = 0;
        } else {
            v8_11 = v8_10.getEndTime();
        }
        this.totalTime = v8_11;
        return;
    }

    public synthetic Scene(String p25, int p26, int p27, int p28, int p29, int p30, java.util.List p31, int p32, com.alightcreative.app.motion.scene.SolidColor p33, com.alightcreative.app.motion.scene.PrecomposeType p34, com.alightcreative.app.motion.scene.SceneType p35, java.util.Map p36, com.alightcreative.app.motion.scene.ReTimingMethod p37, int p38, int p39, int p40, boolean p41, long p42, java.util.Map p44, String p45, int p46, kotlin.jvm.internal.DefaultConstructorMarker p47)
    {
        String v3;
        if ((p46 & 1) == 0) {
            v3 = p25;
        } else {
            v3 = "";
        }
        int v4;
        if ((p46 & 2) == 0) {
            v4 = p26;
        } else {
            v4 = 106;
        }
        java.util.List v9;
        if ((p46 & 64) == 0) {
            v9 = p31;
        } else {
            v9 = kotlin.collections.CollectionsKt.emptyList();
        }
        int v10;
        if ((p46 & 128) == 0) {
            v10 = p32;
        } else {
            v10 = 3000;
        }
        com.alightcreative.app.motion.scene.SolidColor v11;
        if ((p46 & 256) == 0) {
            v11 = p33;
        } else {
            v11 = com.alightcreative.app.motion.scene.SolidColor.Companion.getLIGHT_GRAY();
        }
        com.alightcreative.app.motion.scene.PrecomposeType v12;
        if ((p46 & 512) == 0) {
            v12 = p34;
        } else {
            v12 = com.alightcreative.app.motion.scene.PrecomposeType.DYNAMIC;
        }
        com.alightcreative.app.motion.scene.SceneType v13;
        if ((p46 & 1024) == 0) {
            v13 = p35;
        } else {
            v13 = com.alightcreative.app.motion.scene.SceneType.SCENE;
        }
        java.util.Map v14;
        if ((p46 & 2048) == 0) {
            v14 = p36;
        } else {
            v14 = kotlin.collections.MapsKt.emptyMap();
        }
        com.alightcreative.app.motion.scene.ReTimingMethod v15;
        if ((p46 & 4096) == 0) {
            v15 = p37;
        } else {
            v15 = com.alightcreative.app.motion.scene.ReTimingMethod.FREEZE;
        }
        int v16;
        if ((p46 & 8192) == 0) {
            v16 = p38;
        } else {
            v16 = 0;
        }
        int v17;
        if ((p46 & 16384) == 0) {
            v17 = p39;
        } else {
            v17 = 0;
        }
        int v18;
        if ((32768 & p46) == 0) {
            v18 = p40;
        } else {
            v18 = -1;
        }
        boolean v19;
        if ((65536 & p46) == 0) {
            v19 = p41;
        } else {
            v19 = 0;
        }
        long v20;
        if ((131072 & p46) == 0) {
            v20 = p42;
        } else {
            v20 = 0;
        }
        java.util.Map v22;
        if ((262144 & p46) == 0) {
            v22 = p44;
        } else {
            v22 = kotlin.collections.MapsKt.emptyMap();
        }
        String v23;
        if ((p46 & 524288) == 0) {
            v23 = p45;
        } else {
            v23 = 0;
        }
        this(v3, v4, p27, p28, p29, p30, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v22, v23);
        return;
    }

    public static synthetic com.alightcreative.app.motion.scene.Scene copy$default(com.alightcreative.app.motion.scene.Scene p17, String p18, int p19, int p20, int p21, int p22, int p23, java.util.List p24, int p25, com.alightcreative.app.motion.scene.SolidColor p26, com.alightcreative.app.motion.scene.PrecomposeType p27, com.alightcreative.app.motion.scene.SceneType p28, java.util.Map p29, com.alightcreative.app.motion.scene.ReTimingMethod p30, int p31, int p32, int p33, boolean p34, long p35, java.util.Map p37, String p38, int p39, Object p40)
    {
        String v2_1;
        if ((p39 & 1) == 0) {
            v2_1 = p18;
        } else {
            v2_1 = p17.title;
        }
        int v3_1;
        if ((p39 & 2) == 0) {
            v3_1 = p19;
        } else {
            v3_1 = p17.formatVersion;
        }
        int v4_1;
        if ((p39 & 4) == 0) {
            v4_1 = p20;
        } else {
            v4_1 = p17.width;
        }
        int v5_1;
        if ((p39 & 8) == 0) {
            v5_1 = p21;
        } else {
            v5_1 = p17.height;
        }
        int v6_1;
        if ((p39 & 16) == 0) {
            v6_1 = p22;
        } else {
            v6_1 = p17.exportWidth;
        }
        int v7_1;
        if ((p39 & 32) == 0) {
            v7_1 = p23;
        } else {
            v7_1 = p17.exportHeight;
        }
        java.util.List v8_1;
        if ((p39 & 64) == 0) {
            v8_1 = p24;
        } else {
            v8_1 = p17.elements;
        }
        int v9_1;
        if ((p39 & 128) == 0) {
            v9_1 = p25;
        } else {
            v9_1 = p17.framesPerHundredSeconds;
        }
        com.alightcreative.app.motion.scene.SolidColor v10_1;
        if ((p39 & 256) == 0) {
            v10_1 = p26;
        } else {
            v10_1 = p17.background;
        }
        com.alightcreative.app.motion.scene.PrecomposeType v11_1;
        if ((p39 & 512) == 0) {
            v11_1 = p27;
        } else {
            v11_1 = p17.precompose;
        }
        com.alightcreative.app.motion.scene.SceneType v12_1;
        if ((p39 & 1024) == 0) {
            v12_1 = p28;
        } else {
            v12_1 = p17.type;
        }
        java.util.Map v13_1;
        if ((p39 & 2048) == 0) {
            v13_1 = p29;
        } else {
            v13_1 = p17.bookmarks;
        }
        com.alightcreative.app.motion.scene.ReTimingMethod v14_1;
        if ((p39 & 4096) == 0) {
            v14_1 = p30;
        } else {
            v14_1 = p17.reTimingMethod;
        }
        int v15_1;
        if ((p39 & 8192) == 0) {
            v15_1 = p31;
        } else {
            v15_1 = p17.reTimingInMark;
        }
        String v2_3;
        if ((p39 & 16384) == 0) {
            v2_3 = p32;
        } else {
            v2_3 = p17.reTimingOutMark;
        }
        java.util.Map v1_1;
        if ((p39 & 32768) == 0) {
            v1_1 = p33;
        } else {
            v1_1 = p17.thumbnailTime;
        }
        java.util.Map v1_2;
        if ((p39 & 65536) == 0) {
            v1_2 = p34;
        } else {
            v1_2 = p17.reTimingAdaptFrameRate;
        }
        java.util.Map v1_3;
        if ((p39 & 131072) == 0) {
            v1_3 = p35;
        } else {
            v1_3 = p17.modifiedTime;
        }
        java.util.Map v1_4;
        if ((p39 & 262144) == 0) {
            v1_4 = p37;
        } else {
            v1_4 = p17.mediaInfo;
        }
        String v39_1;
        if ((p39 & 524288) == 0) {
            v39_1 = p38;
        } else {
            v39_1 = p17.templateLink;
        }
        return p17.copy(v2_1, v3_1, v4_1, v5_1, v6_1, v7_1, v8_1, v9_1, v10_1, v11_1, v12_1, v13_1, v14_1, v15_1, v2_3, v1_1, v1_2, v1_3, v1_4, v39_1);
    }

    public final String component1()
    {
        return this.title;
    }

    public final com.alightcreative.app.motion.scene.PrecomposeType component10()
    {
        return this.precompose;
    }

    public final com.alightcreative.app.motion.scene.SceneType component11()
    {
        return this.type;
    }

    public final java.util.Map component12()
    {
        return this.bookmarks;
    }

    public final com.alightcreative.app.motion.scene.ReTimingMethod component13()
    {
        return this.reTimingMethod;
    }

    public final int component14()
    {
        return this.reTimingInMark;
    }

    public final int component15()
    {
        return this.reTimingOutMark;
    }

    public final int component16()
    {
        return this.thumbnailTime;
    }

    public final boolean component17()
    {
        return this.reTimingAdaptFrameRate;
    }

    public final long component18()
    {
        return this.modifiedTime;
    }

    public final java.util.Map component19()
    {
        return this.mediaInfo;
    }

    public final int component2()
    {
        return this.formatVersion;
    }

    public final String component20()
    {
        return this.templateLink;
    }

    public final int component3()
    {
        return this.width;
    }

    public final int component4()
    {
        return this.height;
    }

    public final int component5()
    {
        return this.exportWidth;
    }

    public final int component6()
    {
        return this.exportHeight;
    }

    public final java.util.List component7()
    {
        return this.elements;
    }

    public final int component8()
    {
        return this.framesPerHundredSeconds;
    }

    public final com.alightcreative.app.motion.scene.SolidColor component9()
    {
        return this.background;
    }

    public final com.alightcreative.app.motion.scene.Scene copy(String p24, int p25, int p26, int p27, int p28, int p29, java.util.List p30, int p31, com.alightcreative.app.motion.scene.SolidColor p32, com.alightcreative.app.motion.scene.PrecomposeType p33, com.alightcreative.app.motion.scene.SceneType p34, java.util.Map p35, com.alightcreative.app.motion.scene.ReTimingMethod p36, int p37, int p38, int p39, boolean p40, long p41, java.util.Map p43, String p44)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p24, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p30, "elements");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p32, "background");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p33, "precompose");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p34, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p35, "bookmarks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p36, "reTimingMethod");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p43, "mediaInfo");
        return new com.alightcreative.app.motion.scene.Scene(p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p43, p44);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.alightcreative.app.motion.scene.Scene)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.title, ((com.alightcreative.app.motion.scene.Scene) p8).title)) {
                    if (this.formatVersion == ((com.alightcreative.app.motion.scene.Scene) p8).formatVersion) {
                        if (this.width == ((com.alightcreative.app.motion.scene.Scene) p8).width) {
                            if (this.height == ((com.alightcreative.app.motion.scene.Scene) p8).height) {
                                if (this.exportWidth == ((com.alightcreative.app.motion.scene.Scene) p8).exportWidth) {
                                    if (this.exportHeight == ((com.alightcreative.app.motion.scene.Scene) p8).exportHeight) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.elements, ((com.alightcreative.app.motion.scene.Scene) p8).elements)) {
                                            if (this.framesPerHundredSeconds == ((com.alightcreative.app.motion.scene.Scene) p8).framesPerHundredSeconds) {
                                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.background, ((com.alightcreative.app.motion.scene.Scene) p8).background)) {
                                                    if (this.precompose == ((com.alightcreative.app.motion.scene.Scene) p8).precompose) {
                                                        if (this.type == ((com.alightcreative.app.motion.scene.Scene) p8).type) {
                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.bookmarks, ((com.alightcreative.app.motion.scene.Scene) p8).bookmarks)) {
                                                                if (this.reTimingMethod == ((com.alightcreative.app.motion.scene.Scene) p8).reTimingMethod) {
                                                                    if (this.reTimingInMark == ((com.alightcreative.app.motion.scene.Scene) p8).reTimingInMark) {
                                                                        if (this.reTimingOutMark == ((com.alightcreative.app.motion.scene.Scene) p8).reTimingOutMark) {
                                                                            if (this.thumbnailTime == ((com.alightcreative.app.motion.scene.Scene) p8).thumbnailTime) {
                                                                                if (this.reTimingAdaptFrameRate == ((com.alightcreative.app.motion.scene.Scene) p8).reTimingAdaptFrameRate) {
                                                                                    if (this.modifiedTime == ((com.alightcreative.app.motion.scene.Scene) p8).modifiedTime) {
                                                                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.mediaInfo, ((com.alightcreative.app.motion.scene.Scene) p8).mediaInfo)) {
                                                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.templateLink, ((com.alightcreative.app.motion.scene.Scene) p8).templateLink)) {
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
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final com.alightcreative.app.motion.scene.SolidColor getBackground()
    {
        return this.background;
    }

    public final java.util.Map getBookmarks()
    {
        return this.bookmarks;
    }

    public final java.util.List getElements()
    {
        return this.elements;
    }

    public final int getExportHeight()
    {
        return this.exportHeight;
    }

    public final int getExportWidth()
    {
        return this.exportWidth;
    }

    public final int getFormatVersion()
    {
        return this.formatVersion;
    }

    public final int getFramesPerHundredSeconds()
    {
        return this.framesPerHundredSeconds;
    }

    public final int getHeight()
    {
        return this.height;
    }

    public final java.util.Map getMediaInfo()
    {
        return this.mediaInfo;
    }

    public final long getModifiedTime()
    {
        return this.modifiedTime;
    }

    public final com.alightcreative.app.motion.scene.PrecomposeType getPrecompose()
    {
        return this.precompose;
    }

    public final boolean getReTimingAdaptFrameRate()
    {
        return this.reTimingAdaptFrameRate;
    }

    public final int getReTimingInMark()
    {
        return this.reTimingInMark;
    }

    public final com.alightcreative.app.motion.scene.ReTimingMethod getReTimingMethod()
    {
        return this.reTimingMethod;
    }

    public final int getReTimingOutMark()
    {
        return this.reTimingOutMark;
    }

    public final String getTemplateLink()
    {
        return this.templateLink;
    }

    public final int getThumbnailTime()
    {
        return this.thumbnailTime;
    }

    public final String getTitle()
    {
        return this.title;
    }

    public final int getTotalTime()
    {
        return this.totalTime;
    }

    public final com.alightcreative.app.motion.scene.SceneType getType()
    {
        return this.type;
    }

    public final int getWidth()
    {
        return this.width;
    }

    public int hashCode()
    {
        int v1_37;
        int v0_38 = (((((((((((((((((((((((((((((((((((((this.title.hashCode() * 31) + Integer.hashCode(this.formatVersion)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.exportWidth)) * 31) + Integer.hashCode(this.exportHeight)) * 31) + this.elements.hashCode()) * 31) + Integer.hashCode(this.framesPerHundredSeconds)) * 31) + this.background.hashCode()) * 31) + this.precompose.hashCode()) * 31) + this.type.hashCode()) * 31) + this.bookmarks.hashCode()) * 31) + this.reTimingMethod.hashCode()) * 31) + Integer.hashCode(this.reTimingInMark)) * 31) + Integer.hashCode(this.reTimingOutMark)) * 31) + Integer.hashCode(this.thumbnailTime)) * 31) + Boolean.hashCode(this.reTimingAdaptFrameRate)) * 31) + Long.hashCode(this.modifiedTime)) * 31) + this.mediaInfo.hashCode()) * 31);
        int v1_36 = this.templateLink;
        if (v1_36 != 0) {
            v1_37 = v1_36.hashCode();
        } else {
            v1_37 = 0;
        }
        return (v0_38 + v1_37);
    }

    public String toString()
    {
        String v1_0 = this.title;
        int v2 = this.formatVersion;
        int v3 = this.width;
        int v4 = this.height;
        int v5 = this.exportWidth;
        int v6 = this.exportHeight;
        java.util.List v7 = this.elements;
        int v8 = this.framesPerHundredSeconds;
        com.alightcreative.app.motion.scene.SolidColor v9 = this.background;
        com.alightcreative.app.motion.scene.PrecomposeType v10 = this.precompose;
        com.alightcreative.app.motion.scene.SceneType v11 = this.type;
        java.util.Map v12 = this.bookmarks;
        com.alightcreative.app.motion.scene.ReTimingMethod v13 = this.reTimingMethod;
        int v16 = this.reTimingOutMark;
        int v17 = this.thumbnailTime;
        int v18 = this.reTimingInMark;
        boolean v19 = this.reTimingAdaptFrameRate;
        long v20 = this.modifiedTime;
        java.util.Map v14_2 = this.mediaInfo;
        String v15_3 = this.templateLink;
        String v0_2 = new StringBuilder();
        String v22 = v15_3;
        v0_2.append("Scene(title=");
        v0_2.append(v1_0);
        v0_2.append(", formatVersion=");
        v0_2.append(v2);
        v0_2.append(cj.lk.nLYoBK.mUmkEJfEIpF);
        v0_2.append(v3);
        v0_2.append(", height=");
        v0_2.append(v4);
        v0_2.append(", exportWidth=");
        v0_2.append(v5);
        v0_2.append(", exportHeight=");
        v0_2.append(v6);
        v0_2.append(", elements=");
        v0_2.append(v7);
        v0_2.append(", framesPerHundredSeconds=");
        v0_2.append(v8);
        v0_2.append(", background=");
        v0_2.append(v9);
        v0_2.append(", precompose=");
        v0_2.append(v10);
        v0_2.append(", type=");
        v0_2.append(v11);
        v0_2.append(", bookmarks=");
        v0_2.append(v12);
        v0_2.append(", reTimingMethod=");
        v0_2.append(v13);
        v0_2.append(", reTimingInMark=");
        v0_2.append(v18);
        v0_2.append(", reTimingOutMark=");
        v0_2.append(v16);
        v0_2.append(", thumbnailTime=");
        v0_2.append(v17);
        v0_2.append(", reTimingAdaptFrameRate=");
        v0_2.append(v19);
        v0_2.append(", modifiedTime=");
        v0_2.append(v20);
        v0_2.append(", mediaInfo=");
        v0_2.append(v14_2);
        v0_2.append(", templateLink=");
        v0_2.append(v22);
        v0_2.append(")");
        return v0_2.toString();
    }
}
