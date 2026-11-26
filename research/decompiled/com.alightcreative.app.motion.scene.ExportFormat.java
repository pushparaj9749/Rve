package com.alightcreative.app.motion.scene;
public final enum class ExportFormat extends java.lang.Enum {
    private static final synthetic kotlin.enums.EnumEntries $ENTRIES;
    private static final synthetic com.alightcreative.app.motion.scene.ExportFormat[] $VALUES;
    public static final enum com.alightcreative.app.motion.scene.ExportFormat GIF;
    public static final enum com.alightcreative.app.motion.scene.ExportFormat JPEG_PLAIN;
    public static final enum com.alightcreative.app.motion.scene.ExportFormat JPEG_ZIP;
    public static final enum com.alightcreative.app.motion.scene.ExportFormat M4A;
    public static final enum com.alightcreative.app.motion.scene.ExportFormat PNG_PLAIN;
    public static final enum com.alightcreative.app.motion.scene.ExportFormat PNG_ZIP;
    public static final enum com.alightcreative.app.motion.scene.ExportFormat VIDEO_3GPP;
    public static final enum com.alightcreative.app.motion.scene.ExportFormat VIDEO_MPEG4;
    public static final enum com.alightcreative.app.motion.scene.ExportFormat VIDEO_WEBM;
    public static final enum com.alightcreative.app.motion.scene.ExportFormat WEBP_PLAIN;
    public static final enum com.alightcreative.app.motion.scene.ExportFormat WEBP_ZIP;
    private final String bitmapExt;
    private final android.graphics.Bitmap$CompressFormat bitmapFormat;
    private final boolean hasAudio;
    private final boolean hasVideo;
    private final Integer muxerOutputFormat;

    private static final synthetic com.alightcreative.app.motion.scene.ExportFormat[] $values()
    {
        com.alightcreative.app.motion.scene.ExportFormat v2 = com.alightcreative.app.motion.scene.ExportFormat.VIDEO_WEBM;
        com.alightcreative.app.motion.scene.ExportFormat v4 = com.alightcreative.app.motion.scene.ExportFormat.PNG_ZIP;
        com.alightcreative.app.motion.scene.ExportFormat v6 = com.alightcreative.app.motion.scene.ExportFormat.WEBP_ZIP;
        com.alightcreative.app.motion.scene.ExportFormat v8 = com.alightcreative.app.motion.scene.ExportFormat.JPEG_PLAIN;
        return new com.alightcreative.app.motion.scene.ExportFormat[] {com.alightcreative.app.motion.scene.ExportFormat.VIDEO_MPEG4, com.alightcreative.app.motion.scene.ExportFormat.M4A});
    }

    static ExportFormat()
    {
        com.alightcreative.app.motion.scene.ExportFormat.VIDEO_MPEG4 = new com.alightcreative.app.motion.scene.ExportFormat("VIDEO_MPEG4", 0, 1, 1, Integer.valueOf(0), 0, 0, 24, 0);
        com.alightcreative.app.motion.scene.ExportFormat.VIDEO_3GPP = new com.alightcreative.app.motion.scene.ExportFormat("VIDEO_3GPP", 1, 1, 1, Integer.valueOf(2), 0, 0, 24, 0);
        com.alightcreative.app.motion.scene.ExportFormat.VIDEO_WEBM = new com.alightcreative.app.motion.scene.ExportFormat("VIDEO_WEBM", 2, 1, 1, Integer.valueOf(1), 0, 0, 24, 0);
        com.alightcreative.app.motion.scene.ExportFormat.GIF = new com.alightcreative.app.motion.scene.ExportFormat("GIF", 3, 0, 1, 0, 0, 0, 28, 0);
        int v10_3 = android.graphics.Bitmap$CompressFormat.PNG;
        com.alightcreative.app.motion.scene.ExportFormat.PNG_ZIP = new com.alightcreative.app.motion.scene.ExportFormat("PNG_ZIP", 4, 0, 1, 0, v10_3, "png", 4, 0);
        android.graphics.Bitmap$CompressFormat v17 = android.graphics.Bitmap$CompressFormat.JPEG;
        com.alightcreative.app.motion.scene.ExportFormat.JPEG_ZIP = new com.alightcreative.app.motion.scene.ExportFormat("JPEG_ZIP", 5, 0, 1, 0, v17, "jpeg", 4, 0);
        int v6_7 = android.graphics.Bitmap$CompressFormat.WEBP;
        android.graphics.Bitmap$CompressFormat v24 = v6_7;
        com.alightcreative.app.motion.scene.ExportFormat.WEBP_ZIP = new com.alightcreative.app.motion.scene.ExportFormat("WEBP_ZIP", 6, 0, 1, 0, v6_7, "webp", 4, 0);
        com.alightcreative.app.motion.scene.ExportFormat.PNG_PLAIN = new com.alightcreative.app.motion.scene.ExportFormat("PNG_PLAIN", 7, 0, 1, 0, v10_3, "png", 4, 0);
        com.alightcreative.app.motion.scene.ExportFormat.JPEG_PLAIN = new com.alightcreative.app.motion.scene.ExportFormat("JPEG_PLAIN", 8, 0, 1, 0, v17, "jpeg", 4, 0);
        com.alightcreative.app.motion.scene.ExportFormat.WEBP_PLAIN = new com.alightcreative.app.motion.scene.ExportFormat("WEBP_PLAIN", 9, 0, 1, 0, v24, "webp", 4, 0);
        com.alightcreative.app.motion.scene.ExportFormat.M4A = new com.alightcreative.app.motion.scene.ExportFormat("M4A", 10, 1, 0, 0, 0, 0, 28, 0);
        kotlin.enums.EnumEntries v0_5 = com.alightcreative.app.motion.scene.ExportFormat.$values();
        com.alightcreative.app.motion.scene.ExportFormat.$VALUES = v0_5;
        com.alightcreative.app.motion.scene.ExportFormat.$ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries(v0_5);
        return;
    }

    private ExportFormat(String p1, int p2, boolean p3, boolean p4, Integer p5, android.graphics.Bitmap$CompressFormat p6, String p7)
    {
        super(p1, p2);
        super.hasAudio = p3;
        super.hasVideo = p4;
        super.muxerOutputFormat = p5;
        super.bitmapFormat = p6;
        super.bitmapExt = p7;
        return;
    }

    synthetic ExportFormat(String p2, int p3, boolean p4, boolean p5, Integer p6, android.graphics.Bitmap$CompressFormat p7, String p8, int p9, kotlin.jvm.internal.DefaultConstructorMarker p10)
    {
        if ((p9 & 4) != 0) {
            p6 = 0;
        }
        if ((p9 & 8) != 0) {
            p7 = 0;
        }
        if ((p9 & 16) != 0) {
            p8 = "";
        }
        this(p2, p3, p4, p5, p6, p7, p8);
        return;
    }

    public static kotlin.enums.EnumEntries getEntries()
    {
        return com.alightcreative.app.motion.scene.ExportFormat.$ENTRIES;
    }

    public static com.alightcreative.app.motion.scene.ExportFormat valueOf(String p1)
    {
        return ((com.alightcreative.app.motion.scene.ExportFormat) Enum.valueOf(com.alightcreative.app.motion.scene.ExportFormat, p1));
    }

    public static com.alightcreative.app.motion.scene.ExportFormat[] values()
    {
        return ((com.alightcreative.app.motion.scene.ExportFormat[]) com.alightcreative.app.motion.scene.ExportFormat.$VALUES.clone());
    }

    public final String getBitmapExt()
    {
        return this.bitmapExt;
    }

    public final android.graphics.Bitmap$CompressFormat getBitmapFormat()
    {
        return this.bitmapFormat;
    }

    public final boolean getHasAudio()
    {
        return this.hasAudio;
    }

    public final boolean getHasVideo()
    {
        return this.hasVideo;
    }

    public final Integer getMuxerOutputFormat()
    {
        return this.muxerOutputFormat;
    }
}
