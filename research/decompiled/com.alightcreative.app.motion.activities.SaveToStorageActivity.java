package com.alightcreative.app.motion.activities;
public final class SaveToStorageActivity extends com.alightcreative.app.motion.activities.SDL {
    public static final int l;
    public static final com.alightcreative.app.motion.activities.SaveToStorageActivity$xfY w;
    public TV.n H;
    private String[] T;
    private Integer X;
    private final android.os.Handler db;

    static SaveToStorageActivity()
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.w = new com.alightcreative.app.motion.activities.SaveToStorageActivity$xfY(0);
        com.alightcreative.app.motion.activities.SaveToStorageActivity.l = 8;
        return;
    }

    public SaveToStorageActivity()
    {
        this.db = new android.os.Handler();
        return;
    }

    private static final String AX()
    {
        return "invoke mediascanner";
    }

    public static synthetic String B()
    {
        return com.alightcreative.app.motion.activities.SaveToStorageActivity.En();
    }

    private static final void CB(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, android.content.DialogInterface p1)
    {
        p0.setResult(0);
        p0.finish();
        return;
    }

    private static final void EMD(com.alightcreative.app.motion.activities.SaveToStorageActivity p1, String p2)
    {
        p1.setResult(-1);
        p1.Y(p2);
        return;
    }

    private static final String En()
    {
        return "internal path missing";
    }

    private static final kotlin.Unit Frn(com.alightcreative.app.motion.activities.SaveToStorageActivity p0)
    {
        p0.Odv();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void Ie(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, android.net.Uri p1, String p2)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.W3V(p0, p1, p2);
        return;
    }

    public static synthetic String If()
    {
        return com.alightcreative.app.motion.activities.SaveToStorageActivity.MTr();
    }

    private static final void JHw(java.io.IOException p6, com.alightcreative.app.motion.activities.SaveToStorageActivity p7, java.io.File p8)
    {
        android.content.res.Resources v0_0 = p6.getMessage();
        if ((v0_0 == null) || (kotlin.text.StringsKt.contains$default(v0_0, "ENOSPC", 0, 2, 0) != 1)) {
            new androidx.appcompat.app.CU$xfY(p7).FT(2132017474).X(p6.getLocalizedMessage()).setPositiveButton(2132017454, new com.alightcreative.app.motion.activities.T1k()).cLW(new com.alightcreative.app.motion.activities.m6(p7)).F0();
            return;
        } else {
            new androidx.appcompat.app.CU$xfY(p7).FT(2132019111).X(p7.getResources().getString(2132020115, new Object[] {FKt.bV.x(p8.length())}))).setPositiveButton(2132017454, new com.alightcreative.app.motion.activities.D2f()).cLW(new com.alightcreative.app.motion.activities.KAD(p7)).F0();
            return;
        }
    }

    public static synthetic void Jju(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, String p1)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.MMm(p0, p1);
        return;
    }

    public static synthetic String Jm()
    {
        return com.alightcreative.app.motion.activities.SaveToStorageActivity.b1();
    }

    private static final void KE(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, String p1, String p2, android.net.Uri p3)
    {
        fx.Enc.H(p0, new com.alightcreative.app.motion.activities.AE());
        p0.runOnUiThread(new com.alightcreative.app.motion.activities.Du(p0, p3, p1));
        return;
    }

    private static final void MMm(com.alightcreative.app.motion.activities.SaveToStorageActivity p1, String p2)
    {
        p1.setResult(-1);
        p1.Y(p2);
        return;
    }

    private static final String MTr()
    {
        return "target path missing";
    }

    public static synthetic void N(java.io.IOException p0, com.alightcreative.app.motion.activities.SaveToStorageActivity p1, java.io.File p2)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.q9c(p0, p1, p2);
        return;
    }

    private final void Odv()
    {
        com.alightcreative.app.motion.activities.GS v2_2 = this.getIntent().getStringExtra("mimeType");
        if (v2_2 != null) {
            boolean v7 = this.getIntent().getBooleanExtra("indexMedia", 0);
            com.alightcreative.app.motion.activities.xHV v0_11 = this.getIntent().getStringExtra("saveCompleteMessage");
            if (v0_11 == null) {
                com.alightcreative.app.motion.activities.xHV v0_13;
                if (!v7) {
                    v0_13 = 2132020174;
                } else {
                    v0_13 = 2132020171;
                }
                v0_11 = this.getString(v0_13);
                kotlin.jvm.internal.Intrinsics.checkNotNull(v0_11);
            }
            String v8 = v0_11;
            String v9 = this.getIntent().getStringExtra("internalPath");
            if ((v9 != null) && (v9.length() != 0)) {
                int v4_2 = new java.io.File(v9);
                if (v4_2.exists()) {
                    String v10 = this.getIntent().getStringExtra("targetPath");
                    if (v9.length() != 0) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v10);
                        String[] v1_6 = new java.io.File(v10);
                        if (!v1_6.exists()) {
                            java.util.List v13_1;
                            android.app.ProgressDialog v6_1 = new android.app.ProgressDialog(this);
                            v6_1.setMessage(this.getString(2132020175));
                            com.alightcreative.app.motion.activities.Yhl v5_1 = new com.alightcreative.app.motion.activities.Yhl(this, v6_1);
                            this.db.postDelayed(v5_1, 250);
                            com.alightcreative.app.motion.activities.xHV v0_23 = this.yy();
                            Integer v12 = this.X;
                            java.util.List v13_0 = this.T;
                            if (v13_0 == null) {
                                v13_1 = kotlin.collections.CollectionsKt.emptyList();
                            } else {
                                v13_1 = kotlin.collections.ArraysKt.toList(v13_0);
                                if (v13_1 == null) {
                                }
                            }
                            v0_23.hUw(new TV.Zv9(v12, v13_1));
                            kotlin.concurrent.ThreadsKt.thread$default(0, 0, 0, 0, 0, new com.alightcreative.app.motion.activities.xHV(v1_6, v2_2, this, v4_2, v5_1, v6_1, v7, v8, v9, v10), 31, 0);
                            return;
                        } else {
                            fx.Enc.H(this, new com.alightcreative.app.motion.activities.W4(v1_6));
                            if (v7) {
                                if (android.os.Build$VERSION.SDK_INT >= 29) {
                                    this.runOnUiThread(new com.alightcreative.app.motion.activities.jr(this, v8));
                                    return;
                                } else {
                                    android.media.MediaScannerConnection.scanFile(this, new String[] {v1_6.getAbsolutePath()}), new String[] {v2_2}), new com.alightcreative.app.motion.activities.GS(this, v8));
                                    return;
                                }
                            } else {
                                this.runOnUiThread(new com.alightcreative.app.motion.activities.ZL(this, v8));
                                return;
                            }
                        }
                    } else {
                        fx.Enc.H(this, new com.alightcreative.app.motion.activities.PI());
                        this.finish();
                        return;
                    }
                } else {
                    fx.Enc.H(this, new com.alightcreative.app.motion.activities.Ah(v4_2));
                    this.finish();
                    return;
                }
            } else {
                fx.Enc.H(this, new com.alightcreative.app.motion.activities.IP());
                this.finish();
                return;
            }
        } else {
            return;
        }
    }

    private static final kotlin.Unit PC0(com.alightcreative.app.motion.activities.SaveToStorageActivity p0)
    {
        p0.Odv();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic String Pg(java.io.File p0)
    {
        return com.alightcreative.app.motion.activities.SaveToStorageActivity.jj(p0);
    }

    public static synthetic void QR(android.content.DialogInterface p0, int p1)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.a9(p0, p1);
        return;
    }

    private static final kotlin.Unit RF(java.io.File p8, String p9, com.alightcreative.app.motion.activities.SaveToStorageActivity p10, java.io.File p11, Runnable p12, android.app.ProgressDialog p13, boolean p14, String p15, String p16, String p17)
    {
        String v1_0 = p8.getParentFile();
        if (v1_0 != null) {
            v1_0.mkdirs();
        }
        if (android.os.Build$VERSION.SDK_INT < 29) {
            fx.Enc.H(p10, new com.alightcreative.app.motion.activities.f4(p16, p17, p8));
            try {
                TV.D v3_4;
                kotlin.io.FilesKt.copyTo$default(p11, p8, 0, 0, 6, 0);
                fx.Enc.H(p10, new com.alightcreative.app.motion.activities.W2());
                com.alightcreative.app.motion.activities.Hz8 v11_3 = p10.yy();
                android.content.ContentResolver v2_11 = p10.X;
                TV.D v3_3 = p10.T;
            } catch (java.io.IOException v0_7) {
                android.os.Handler v8_12 = v0_7;
                android.os.Handler v9_6 = p10.yy();
                Integer v13_1 = p10.X;
                java.io.IOException v0_8 = p10.T;
                if (v0_8 == null) {
                    java.io.IOException v0_9 = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    v0_9 = kotlin.collections.ArraysKt.toList(v0_8);
                    if (v0_9 == null) {
                    }
                }
                v9_6.hUw(new TV.D(v13_1, v0_9, v8_12));
                p10.runOnUiThread(new com.alightcreative.app.motion.activities.f1v(v8_12, p10, v11_3));
                return kotlin.Unit.INSTANCE;
            }
            if (v3_3 == null) {
                v3_4 = kotlin.collections.CollectionsKt.emptyList();
            } else {
                v3_4 = kotlin.collections.ArraysKt.toList(v3_3);
                if (v3_4 == null) {
                }
            }
            v11_3.hUw(new TV.F(v2_11, v3_4));
            if (p14) {
                android.media.MediaScannerConnection.scanFile(p10, new String[] {p8.getAbsolutePath()}), new String[] {p9}), new com.alightcreative.app.motion.activities.Hz8(p10, p12, p13, p15));
            } else {
                p10.runOnUiThread(new com.alightcreative.app.motion.activities.D0(p10, p15));
                return kotlin.Unit.INSTANCE;
            }
        } else {
            android.content.ContentResolver v2_14;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(p9, "video/mp4")) {
                v2_14 = android.provider.MediaStore$Images$Media.EXTERNAL_CONTENT_URI;
            } else {
                v2_14 = android.provider.MediaStore$Video$Media.EXTERNAL_CONTENT_URI;
            }
            android.os.Handler v8_2;
            TV.D v3_6 = new android.content.ContentValues();
            v3_6.put("_display_name", p8.getName());
            v3_6.put("mime_type", p9);
            v3_6.put("is_pending", Integer.valueOf(1));
            if (!kotlin.jvm.internal.Intrinsics.areEqual(p9, "video/mp4")) {
                String v1_15 = new StringBuilder();
                v1_15.append(android.os.Environment.DIRECTORY_PICTURES);
                v1_15.append("/Alight Motion");
                v8_2 = v1_15.toString();
            } else {
                String v1_3 = new StringBuilder();
                v1_3.append(android.os.Environment.DIRECTORY_MOVIES);
                v1_3.append("/Alight Motion");
                v8_2 = v1_3.toString();
            }
            v3_6.put("relative_path", v8_2);
            android.os.Handler v8_4 = new kotlin.jvm.internal.Ref$ObjectRef();
            android.os.Handler v9_2 = 0;
            try {
                String v1_5 = p10.getContentResolver().insert(v2_14, v3_6);
                v8_4.element = v1_5;
            } catch (java.io.IOException v0_3) {
                String v1_7 = 0;
                android.content.ContentResolver v2_8 = p10.yy();
                android.net.Uri v4_3 = p10.X;
                java.util.List v5_2 = p10.T;
                if (v5_2 == null) {
                    java.util.List v5_3 = kotlin.collections.CollectionsKt.emptyList();
                } else {
                    v5_3 = kotlin.collections.ArraysKt.toList(v5_2);
                    if (v5_3 == null) {
                    }
                }
                v2_8.hUw(new TV.D(v4_3, v5_3, v0_3));
                android.os.Handler v8_7 = ((android.net.Uri) v8_4.element);
                if (v8_7 != null) {
                    p10.getContentResolver().delete(v8_7, v9_2, v9_2);
                }
                p10.runOnUiThread(new com.alightcreative.app.motion.activities.yVu(v0_3, p10, p11));
                if (v1_7 != null) {
                    v1_7.close();
                }
                p10.db.removeCallbacks(p12);
                p13.dismiss();
            } catch (java.io.IOException v0_2) {
                android.os.Handler v8_5 = v0_2;
                if (v9_2 != null) {
                    v9_2.close();
                }
                p10.db.removeCallbacks(p12);
                p13.dismiss();
                throw v8_5;
            } catch (java.io.IOException v0_6) {
                v8_5 = v0_6;
                v9_2 = v1_7;
            }
            if (v1_5 == null) {
                throw new java.io.IOException("Failed to create new MediaStore record.");
            } else {
                v1_7 = p10.getContentResolver().openOutputStream(((android.net.Uri) v8_4.element));
                try {
                    if (v1_7 == null) {
                        throw new java.io.IOException("Failed to get output stream.");
                    } else {
                        kotlin.io.ByteStreamsKt.copyTo(new java.io.FileInputStream(p11), v1_7, 1024);
                        v3_6.clear();
                        v3_6.put("is_pending", Integer.valueOf(0));
                        p10.getContentResolver().update(((android.net.Uri) v8_4.element), v3_6, 0, 0);
                        v1_7.close();
                        p10.db.removeCallbacks(p12);
                        p13.dismiss();
                        v9_2 = new com.alightcreative.app.motion.activities.Ya(p10, v8_4, p15);
                        p10.runOnUiThread(v9_2);
                    }
                } catch (java.io.IOException v0_3) {
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void S(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, android.content.DialogInterface p1)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.wH(p0, p1);
        return;
    }

    private static final String S6(String p3, String p4, java.io.File p5)
    {
        String v0 = p5.getAbsolutePath();
        String v5_1 = p5.getName();
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("copy ");
        v1_1.append(p3);
        v1_1.append(" -> ");
        v1_1.append(p4);
        v1_1.append(", Q :: ");
        v1_1.append(p4);
        v1_1.append(", ");
        v1_1.append(v0);
        v1_1.append(", ");
        v1_1.append(v5_1);
        return v1_1.toString();
    }

    public static synthetic void ST5(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, String p1)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.EMD(p0, p1);
        return;
    }

    private static final void TT1(com.alightcreative.app.motion.activities.SaveToStorageActivity p6, Runnable p7, android.app.ProgressDialog p8, String p9, String p10, android.net.Uri p11)
    {
        fx.Enc.H(p6, new com.alightcreative.app.motion.activities.RDH());
        p6.runOnUiThread(new com.alightcreative.app.motion.activities.ka(p6, p7, p8, p11, p9));
        return;
    }

    private static final void W3V(com.alightcreative.app.motion.activities.SaveToStorageActivity p2, android.net.Uri p3, String p4)
    {
        p2.setResult(-1, new android.content.Intent().putExtra("targetUri", p3.toString()));
        p2.Y(p4);
        return;
    }

    private final void Y(String p2)
    {
        android.widget.Toast.makeText(this, p2, 0).show();
        this.finish();
        return;
    }

    private static final void YU(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, android.app.ProgressDialog p1)
    {
        if (!p0.isFinishing()) {
            p1.show();
        }
        return;
    }

    public static synthetic kotlin.Unit Z(java.io.File p0, String p1, com.alightcreative.app.motion.activities.SaveToStorageActivity p2, java.io.File p3, Runnable p4, android.app.ProgressDialog p5, boolean p6, String p7, String p8, String p9)
    {
        return com.alightcreative.app.motion.activities.SaveToStorageActivity.RF(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public static synthetic void Z0(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, String p1)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.i2(p0, p1);
        return;
    }

    public static synthetic String Zk(java.io.File p0)
    {
        return com.alightcreative.app.motion.activities.SaveToStorageActivity.qQf(p0);
    }

    private static final void a9(android.content.DialogInterface p0, int p1)
    {
        p0.dismiss();
        return;
    }

    private static final String b1()
    {
        return "media scan done";
    }

    public static synthetic void b9Y(android.content.DialogInterface p0, int p1)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.sw(p0, p1);
        return;
    }

    public static synthetic void cKj(android.content.DialogInterface p0, int p1)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.iM(p0, p1);
        return;
    }

    public static synthetic String cak(String p0, String p1, java.io.File p2)
    {
        return com.alightcreative.app.motion.activities.SaveToStorageActivity.S6(p0, p1, p2);
    }

    private static final void dDX(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, android.content.DialogInterface p1)
    {
        p0.setResult(0);
        p0.finish();
        return;
    }

    public static synthetic String dav()
    {
        return com.alightcreative.app.motion.activities.SaveToStorageActivity.jV();
    }

    public static synthetic void e4D(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, android.content.DialogInterface p1)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.dDX(p0, p1);
        return;
    }

    private static final void fdD(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, android.content.DialogInterface p1)
    {
        p0.setResult(0);
        p0.finish();
        return;
    }

    public static synthetic kotlin.Unit g(com.alightcreative.app.motion.activities.SaveToStorageActivity p0)
    {
        return com.alightcreative.app.motion.activities.SaveToStorageActivity.PC0(p0);
    }

    public static synthetic void g2(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, Runnable p1, android.app.ProgressDialog p2, String p3, String p4, android.net.Uri p5)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.TT1(p0, p1, p2, p3, p4, p5);
        return;
    }

    public static synthetic void hsj(android.content.DialogInterface p0, int p1)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.v(p0, p1);
        return;
    }

    private static final void i2(com.alightcreative.app.motion.activities.SaveToStorageActivity p1, String p2)
    {
        p1.setResult(-1);
        p1.Y(p2);
        return;
    }

    private static final void iM(android.content.DialogInterface p0, int p1)
    {
        p0.dismiss();
        return;
    }

    private static final String jV()
    {
        return "media scan done";
    }

    private static final void jfW(com.alightcreative.app.motion.activities.SaveToStorageActivity p4, kotlin.jvm.internal.Ref$ObjectRef p5, String p6)
    {
        java.util.List v3_0;
        int v0_0 = p4.yy();
        Integer v2 = p4.X;
        java.util.List v3_1 = p4.T;
        if (v3_1 == null) {
            v3_0 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            v3_0 = kotlin.collections.ArraysKt.toList(v3_1);
            if (v3_0 == null) {
            }
        }
        v0_0.hUw(new TV.F(v2, v3_0));
        p4.setResult(-1, new android.content.Intent().putExtra("targetUri", String.valueOf(p5.element)));
        p4.Y(p6);
        return;
    }

    private static final String jj(java.io.File p2)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("already exists: ");
        v0_1.append(p2);
        return v0_1.toString();
    }

    public static synthetic void lU(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, android.content.DialogInterface p1)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.fdD(p0, p1);
        return;
    }

    public static synthetic void m(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, android.content.DialogInterface p1)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.CB(p0, p1);
        return;
    }

    public static synthetic kotlin.Unit m0(com.alightcreative.app.motion.activities.SaveToStorageActivity p0)
    {
        return com.alightcreative.app.motion.activities.SaveToStorageActivity.wx(p0);
    }

    public static synthetic void nG(java.io.IOException p0, com.alightcreative.app.motion.activities.SaveToStorageActivity p1, java.io.File p2)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.JHw(p0, p1, p2);
        return;
    }

    public static synthetic void o(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, String p1, String p2, android.net.Uri p3)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.KE(p0, p1, p2, p3);
        return;
    }

    private static final void q9c(java.io.IOException p6, com.alightcreative.app.motion.activities.SaveToStorageActivity p7, java.io.File p8)
    {
        android.content.res.Resources v0_0 = p6.getMessage();
        if ((v0_0 == null) || (kotlin.text.StringsKt.contains$default(v0_0, "ENOSPC", 0, 2, 0) != 1)) {
            new androidx.appcompat.app.CU$xfY(p7).FT(2132017474).X(p6.getLocalizedMessage()).setPositiveButton(2132017454, new com.alightcreative.app.motion.activities.zW()).cLW(new com.alightcreative.app.motion.activities.bT(p7)).F0();
            return;
        } else {
            new androidx.appcompat.app.CU$xfY(p7).FT(2132019111).X(p7.getResources().getString(2132020115, new Object[] {FKt.bV.x(p8.length())}))).setPositiveButton(2132017454, new com.alightcreative.app.motion.activities.lC()).cLW(new com.alightcreative.app.motion.activities.Fz(p7)).F0();
            return;
        }
    }

    private static final String qQf(java.io.File p2)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("does not exist: ");
        v0_1.append(p2);
        return v0_1.toString();
    }

    private static final void qxC(com.alightcreative.app.motion.activities.SaveToStorageActivity p1, Runnable p2, android.app.ProgressDialog p3, android.net.Uri p4, String p5)
    {
        p1.db.removeCallbacks(p2);
        p3.dismiss();
        p1.setResult(-1, new android.content.Intent().putExtra("targetUri", p4.toString()));
        p1.Y(p5);
        return;
    }

    public static synthetic void r7(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, android.app.ProgressDialog p1)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.YU(p0, p1);
        return;
    }

    private static final void sw(android.content.DialogInterface p0, int p1)
    {
        p0.dismiss();
        return;
    }

    public static synthetic String tEh()
    {
        return com.alightcreative.app.motion.activities.SaveToStorageActivity.AX();
    }

    public static synthetic kotlin.Unit uM(com.alightcreative.app.motion.activities.SaveToStorageActivity p0)
    {
        return com.alightcreative.app.motion.activities.SaveToStorageActivity.Frn(p0);
    }

    public static synthetic void uq6(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, Runnable p1, android.app.ProgressDialog p2, android.net.Uri p3, String p4)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.qxC(p0, p1, p2, p3, p4);
        return;
    }

    private static final void v(android.content.DialogInterface p0, int p1)
    {
        p0.dismiss();
        return;
    }

    private static final void wH(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, android.content.DialogInterface p1)
    {
        p0.setResult(0);
        p0.finish();
        return;
    }

    private static final kotlin.Unit wx(com.alightcreative.app.motion.activities.SaveToStorageActivity p0)
    {
        p0.finish();
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void z2f(com.alightcreative.app.motion.activities.SaveToStorageActivity p0, kotlin.jvm.internal.Ref$ObjectRef p1, String p2)
    {
        com.alightcreative.app.motion.activities.SaveToStorageActivity.jfW(p0, p1, p2);
        return;
    }

    protected void onCreate(android.os.Bundle p4)
    {
        X7.xfY$XSt v4_1;
        super.onCreate(p4);
        X7.xfY$XSt v4_3 = this.getIntent();
        X7.xfY$XSt v1_0 = 0;
        if (v4_3 == null) {
            v4_1 = 0;
        } else {
            v4_1 = Integer.valueOf(v4_3.getIntExtra("exportFormat", 0));
        }
        if ((v4_1 != null) && (v4_1.intValue() == 0)) {
            v4_1 = 0;
        }
        this.X = v4_1;
        X7.xfY$XSt v4_2 = this.getIntent();
        if (v4_2 != null) {
            X7.xfY$XSt v4_4 = v4_2.getStringArrayExtra("projectIds");
            if ((v4_4 != null) && (v4_4.length != 0)) {
                v1_0 = v4_4;
            }
        }
        this.T = v1_0;
        this.setResult(0);
        this.setContentView(2131558832);
        FKt.h.w(this, X7.xfY$XSt.X, 1, Integer.valueOf(2132020309), new com.alightcreative.app.motion.activities.oa(this));
        return;
    }

    public void onRequestPermissionsResult(int p9, String[] p10, int[] p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "permissions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "grantResults");
        if (p9 != 1) {
            super.onRequestPermissionsResult(p9, p10, p11);
            return;
        } else {
            int v9_2;
            TV.n v1 = this.yy();
            if (p11.length != 0) {
                v9_2 = 0;
            } else {
                v9_2 = 1;
            }
            if ((v9_2 != 0) || (p11[0] != 0)) {
                int v2 = 0;
            } else {
                v2 = 1;
            }
            FKt.vp.j(v1, v2, oqG.c.q, this.T, oqG.K.j, new com.alightcreative.app.motion.activities.SkD(this), new com.alightcreative.app.motion.activities.pBV(this));
            return;
        }
    }

    public final TV.n yy()
    {
        int v0_0 = this.H;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
            return 0;
        } else {
            return v0_0;
        }
    }
}
