package com.alightcreative.app.motion.activities;
public final class FontBrowserActivity extends com.alightcreative.app.motion.activities.JB9 {
    private java.util.List E;
    private nVu.q H;
    public Vbv.c T;
    public TV.n X;
    private final fx.Zv9 ah;
    private java.util.Set db;
    private final java.util.Set l;
    private String w;

    static FontBrowserActivity()
    {
        return;
    }

    public FontBrowserActivity()
    {
        this.db = kotlin.collections.SetsKt.emptySet();
        this.w = "";
        fx.Zv9 v0_8 = ((Iterable) com.alightcreative.app.motion.persist.xfY.INSTANCE.getFavoriteFonts());
        com.alightcreative.app.motion.activities.xF7 v1_1 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v0_8, 10));
        fx.Zv9 v0_0 = v0_8.iterator();
        while (v0_0.hasNext()) {
            v1_1.add(com.alightcreative.app.motion.fonts.CU.cD.j(((String) v0_0.next())));
        }
        this.l = kotlin.collections.CollectionsKt.toMutableSet(v1_1);
        this.ah = new fx.Zv9(new com.alightcreative.app.motion.activities.xF7(this));
        return;
    }

    private static final void AX(com.alightcreative.app.motion.activities.FontBrowserActivity p0, android.view.View p1)
    {
        androidx.drawerlayout.widget.DrawerLayout v0_1 = p0.H;
        if (v0_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_1 = 0;
        }
        v0_1.q.X9x(8388611);
        return;
    }

    public static synthetic void B(androidx.appcompat.app.CU p0, com.alightcreative.app.motion.activities.FontBrowserActivity p1, android.content.DialogInterface p2, int p3)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.RF(p0, p1, p2, p3);
        return;
    }

    private static final kotlin.Unit CB(com.alightcreative.app.motion.activities.FontBrowserActivity p2, boolean p3)
    {
        android.widget.LinearLayout v0_0 = p2.H;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.uKP.post(new com.alightcreative.app.motion.activities.wT(p3, p2));
        return kotlin.Unit.INSTANCE;
    }

    private static final void EMD(nVu.y3Q p1)
    {
        p1.R6.setVisibility(0);
        return;
    }

    private static final void En(androidx.appcompat.app.CU p0, com.alightcreative.app.motion.activities.FontBrowserActivity p1, android.content.DialogInterface p2)
    {
        p2.dismiss();
        p0.dismiss();
        p1.setResult(-1);
        p1.finish();
        return;
    }

    public static final synthetic void Frn(com.alightcreative.app.motion.activities.FontBrowserActivity p0)
    {
        p0.Odv();
        return;
    }

    public static synthetic kotlin.Unit Ie(kotlin.jvm.internal.Ref$BooleanRef p0, com.alightcreative.app.motion.activities.FontBrowserActivity p1, kotlin.jvm.functions.Function1 p2, kotlin.Result p3)
    {
        return com.alightcreative.app.motion.activities.FontBrowserActivity.qQf(p0, p1, p2, p3);
    }

    public static synthetic void If(com.alightcreative.app.motion.activities.FontBrowserActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.wH(p0, p1);
        return;
    }

    public static synthetic String Jju(Exception p0)
    {
        return com.alightcreative.app.motion.activities.FontBrowserActivity.W3V(p0);
    }

    public static synthetic kotlin.Unit Jm(com.alightcreative.app.motion.activities.FontBrowserActivity p0, com.alightcreative.app.motion.fonts.CU p1)
    {
        return com.alightcreative.app.motion.activities.FontBrowserActivity.MMm(p0, p1);
    }

    private final void KE(java.util.List p12)
    {
        Throwable v0_1 = new java.util.ArrayList();
        Throwable v12_7 = p12.iterator();
        while (v12_7.hasNext()) {
            long v6_1 = ((android.net.Uri) v12_7.next());
            java.util.ArrayList v1_5 = this.getContentResolver().query(v6_1, 0, 0, 0, 0);
            if (v1_5 != null) {
                if (v1_5.moveToFirst()) {
                    v0_1.add(new com.alightcreative.app.motion.activities.DxL(v1_5.getLong(0), v6_1, v1_5.getString(2), v1_5.getString(1)));
                }
                kotlin.io.CloseableKt.closeFinally(v1_5, 0);
            }
        }
        if (!v0_1.isEmpty()) {
            Throwable v12_6 = new androidx.appcompat.app.CU$xfY(this).H(2132019487).j(0).create();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v12_6, "create(...)");
            v12_6.show();
            Throwable v0_2 = kotlin.collections.CollectionsKt.toList(v0_1);
            java.util.ArrayList v1_3 = new java.util.ArrayList();
            FKt.D.x(0, new com.alightcreative.app.motion.activities.dpY(this, v0_2, v1_3), 1, 0).H(new com.alightcreative.app.motion.activities.KW(v1_3, this, v12_6));
        }
        return;
    }

    private static final kotlin.Unit MMm(com.alightcreative.app.motion.activities.FontBrowserActivity p5, com.alightcreative.app.motion.fonts.CU p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "amTypeface");
        kotlin.jvm.internal.Ref$BooleanRef v0_2 = new kotlin.jvm.internal.Ref$BooleanRef();
        v0_2.element = 1;
        com.alightcreative.app.motion.activities.U9z v1_0 = p5.H;
        if (v1_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_0 = 0;
        }
        v1_0.X.postDelayed(new com.alightcreative.app.motion.activities.tku(p5, v0_2), 30);
        com.alightcreative.app.motion.fonts.cY.ah(p6, new com.alightcreative.app.motion.activities.U9z(p5, v0_2, p6));
        return kotlin.Unit.INSTANCE;
    }

    private static final void MTr(com.alightcreative.app.motion.activities.FontBrowserActivity p2, kotlin.Result p3, kotlin.jvm.functions.Function1 p4)
    {
        int v0_0 = p2.H;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.X.setVisibility(8);
        com.alightcreative.app.motion.activities.xX v3_1 = kotlin.Result.exceptionOrNull-impl(p3.unbox-impl());
        if (v3_1 == null) {
            p4.invoke(Boolean.TRUE);
            return;
        } else {
            int v0_4 = new android.app.AlertDialog$Builder(p2).setTitle(2132019177);
            Boolean v2_2 = p2.getString(2132019178);
            com.alightcreative.app.motion.activities.xX v3_2 = v3_1.getMessage();
            StringBuilder v1_3 = new StringBuilder();
            v1_3.append(v2_2);
            v1_3.append("\n\n");
            v1_3.append(v3_2);
            v0_4.setMessage(v1_3.toString()).setPositiveButton(2132017454, new com.alightcreative.app.motion.activities.xX()).show();
            p4.invoke(Boolean.FALSE);
            return;
        }
    }

    public static synthetic void N(android.content.DialogInterface p0, int p1)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.O9(p0, p1);
        return;
    }

    private static final void O9(android.content.DialogInterface p0, int p1)
    {
        p0.dismiss();
        return;
    }

    private final void Odv()
    {
        android.widget.ImageButton v0_0 = this.H;
        nVu.q v1 = 0;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        if ((v0_0.db.getVisibility() != 0) && (this.w.length() <= 0)) {
            return;
        } else {
            android.widget.ImageButton v0_3 = this.H;
            if (v0_3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_3 = 0;
            }
            android.widget.ImageButton v0_4 = v0_3.db;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_4, "searchText");
            FKt.pD.X(v0_4);
            android.widget.ImageButton v0_5 = this.H;
            if (v0_5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_5 = 0;
            }
            v0_5.T.setVisibility(0);
            android.widget.ImageButton v0_7 = this.H;
            if (v0_7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_7 = 0;
            }
            v0_7.db.setVisibility(4);
            android.widget.ImageButton v0_9 = this.H;
            if (v0_9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_9 = 0;
            }
            v0_9.db.setText("");
            this.w = "";
            android.widget.ImageButton v0_11 = this.H;
            if (v0_11 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_11 = 0;
            }
            v0_11.j.setVisibility(4);
            android.widget.ImageButton v0_13 = this.H;
            if (v0_13 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v0_13 = 0;
            }
            v0_13.cD.setVisibility(0);
            android.widget.ImageButton v0_15 = this.H;
            if (v0_15 != null) {
                v1 = v0_15;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v1.x.setVisibility(0);
            return;
        }
    }

    public static final synthetic void PC0(com.alightcreative.app.motion.activities.FontBrowserActivity p0)
    {
        p0.TT1();
        return;
    }

    public static synthetic boolean Pg(com.alightcreative.app.motion.activities.FontBrowserActivity p0, android.view.MenuItem p1)
    {
        return com.alightcreative.app.motion.activities.FontBrowserActivity.a9(p0, p1);
    }

    private final void QP(kotlin.reflect.KMutableProperty0 p2, android.widget.CheckBox p3, n9.CU p4)
    {
        p3.setChecked(((Boolean) p2.get()).booleanValue());
        if (p3.isChecked()) {
            this.db = kotlin.collections.SetsKt.plus(this.db, p4);
        }
        p3.setOnCheckedChangeListener(new com.alightcreative.app.motion.activities.pd(p2, this, p4));
        return;
    }

    public static synthetic String QR(Exception p0)
    {
        return com.alightcreative.app.motion.activities.FontBrowserActivity.i2(p0);
    }

    private static final void RF(androidx.appcompat.app.CU p0, com.alightcreative.app.motion.activities.FontBrowserActivity p1, android.content.DialogInterface p2, int p3)
    {
        p2.dismiss();
        p0.dismiss();
        p1.setResult(-1);
        p1.finish();
        return;
    }

    public static synthetic void S(android.content.DialogInterface p0, int p1)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.V(p0, p1);
        return;
    }

    private static final void S6(com.alightcreative.app.motion.activities.FontBrowserActivity p10, nVu.y3Q p11, android.view.View p12)
    {
        com.alightcreative.widget.Uk v0_1 = new com.alightcreative.widget.Uk(p10, p10.iM(), 0, 4, 0);
        com.alightcreative.widget.Uk.cLW(v0_1, 2132017293, 0, 0, 0, 0, 28, 0);
        android.view.View v1_1 = p10.E;
        if (v1_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(kotlin.collections.unsigned.PgvQ.tdqJvzuev.hdNcE);
            v1_1 = 0;
        }
        java.util.Iterator v8 = v1_1.iterator();
        while (v8.hasNext()) {
            android.view.View v1_8 = ((com.alightcreative.app.motion.activities.FontBrowserActivity$xfY) v8.next());
            com.alightcreative.widget.Uk.cLW(v0_1, v1_8.j().cD(), v1_8.j().j(), 0, 0, 0, 28, 0);
        }
        v0_1.nvG(new com.alightcreative.app.motion.activities.se(p11, p10));
        v0_1.R(p12.getWidth());
        kotlin.jvm.internal.Intrinsics.checkNotNull(p12);
        com.alightcreative.widget.Uk.Hm(v0_1, p12, 0, 0, 0, 14, 0);
        return;
    }

    public static synthetic void ST5(kotlin.jvm.internal.Ref$BooleanRef p0, com.alightcreative.app.motion.activities.FontBrowserActivity p1, kotlin.Result p2, com.alightcreative.app.motion.fonts.CU p3)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.v9(p0, p1, p2, p3);
        return;
    }

    private final void TT1()
    {
        androidx.recyclerview.widget.RecyclerView v0_3 = com.alightcreative.app.motion.persist.xfY.INSTANCE.getFontLanguageFilter();
        java.util.Set v1_1 = n9.AWD.values();
        String v3_0 = 0;
        while(true) {
            n9.AWD v6_1;
            com.alightcreative.app.motion.activities.hy v4_2 = 0;
            if (v3_0 >= v1_1.length) {
                v6_1 = 0;
            } else {
                java.util.Set v5_0 = v1_1[v3_0];
                if (v5_0.j() == v0_3) {
                    break;
                }
                v3_0++;
            }
            java.util.Set v1_0 = -1;
            boolean v2_0 = 2132019211;
            if ((!this.db.isEmpty()) && (this.db.size() != n9.CU.values().length)) {
                if (v6_1 != null) {
                    androidx.recyclerview.widget.RecyclerView v0_6 = this.H;
                    if (v0_6 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v0_6 = 0;
                    }
                    v0_6.T.setText(2132019211);
                } else {
                    androidx.recyclerview.widget.RecyclerView v0_8 = this.H;
                    if (v0_8 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                        v0_8 = 0;
                    }
                    java.util.Set v5_7 = ((n9.CU) kotlin.collections.CollectionsKt.singleOrNull(((Iterable) this.db)));
                    if (v5_7 != null) {
                        v1_0 = com.alightcreative.app.motion.activities.FontBrowserActivity$A.$EnumSwitchMapping$2[v5_7.ordinal()];
                    }
                    switch (v1_0) {
                        case -1:
                            break;
                        case 0:
                        default:
                            throw new kotlin.NoWhenBranchMatchedException();
                            break;
                        case 1:
                            v2_0 = 2132020158;
                            break;
                        case 2:
                            v2_0 = 2132020191;
                            break;
                        case 3:
                            v2_0 = 2132017768;
                            break;
                        case 4:
                            v2_0 = 2132019448;
                            break;
                        case 5:
                            v2_0 = 2132019708;
                            break;
                        case 6:
                            v2_0 = 2132019484;
                            break;
                        case 7:
                            v2_0 = 2132019148;
                            break;
                    }
                    v0_8.T.setText(v2_0);
                }
            } else {
                androidx.recyclerview.widget.RecyclerView v0_12 = this.H;
                if (v0_12 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v0_12 = 0;
                }
                if (v6_1 != null) {
                    v1_0 = com.alightcreative.app.motion.activities.FontBrowserActivity$A.$EnumSwitchMapping$1[v6_1.ordinal()];
                }
                switch (v1_0) {
                    case -1:
                        v2_0 = 2132017292;
                        break;
                    case 0:
                    default:
                        break;
                    case 1:
                        v2_0 = 2132019534;
                        break;
                    case 2:
                        v2_0 = 2132019422;
                        break;
                    case 3:
                        v2_0 = 2132019450;
                        break;
                    case 4:
                        v2_0 = 2132017719;
                        break;
                    case 5:
                        v2_0 = 2132017352;
                        break;
                    case 6:
                        v2_0 = 2132020397;
                        break;
                    case 7:
                        v2_0 = 2132019524;
                        break;
                    case 8:
                        v2_0 = 2132019521;
                        break;
                }
                v0_12.T.setText(v2_0);
            }
            androidx.recyclerview.widget.RecyclerView v0_14 = this.H;
            if (v0_14 != null) {
                v4_2 = v0_14;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            androidx.recyclerview.widget.RecyclerView v0_15 = v4_2.H;
            java.util.Set v1_5 = ((java.util.Collection) this.db);
            if (v1_5.isEmpty()) {
                v1_5 = kotlin.collections.ArraysKt.toSet(n9.CU.values());
            }
            v0_15.setAdapter(new com.alightcreative.app.motion.activities.hy(((java.util.Set) v1_5), v6_1, this.w, this.l, new com.alightcreative.app.motion.activities.pP(this), new com.alightcreative.app.motion.activities.L9(this), new com.alightcreative.app.motion.activities.sVQ(this), this.JHw()));
            return;
        }
        v6_1 = v5_0;
    }

    private static final void V(android.content.DialogInterface p0, int p1)
    {
        p0.dismiss();
        return;
    }

    private static final String W3V(Exception p2)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("Import Font File error : openInputStream.sha1 : ");
        v0_1.append(p2);
        return v0_1.toString();
    }

    public static final synthetic void Y(com.alightcreative.app.motion.activities.FontBrowserActivity p0, String p1)
    {
        p0.w = p1;
        return;
    }

    private static final kotlin.Unit YU(java.util.List p10, com.alightcreative.app.motion.activities.FontBrowserActivity p11, androidx.appcompat.app.CU p12, kotlin.Unit p13)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p13, "it");
        if (p10.isEmpty()) {
            p12.dismiss();
            if (com.alightcreative.app.motion.fonts.cY.FT() > 0) {
                android.widget.CheckBox v10_2 = p11.H;
                if (v10_2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                    v10_2 = 0;
                }
                android.widget.CheckBox v10_5 = nVu.y3Q.hUw(v10_2.ojl.cLW(0));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v10_5, "bind(...)");
                v10_5.R6.setVisibility(0);
            }
            p11.TT1();
        } else {
            String v13_4 = new androidx.appcompat.app.CU$xfY(p11).FT(2132019478);
            String v0_3 = p11.getString(2132019175);
            android.widget.CheckBox v10_7 = kotlin.collections.CollectionsKt.joinToString$default(p10, ", ", 0, 0, 0, 0, 0, 62, 0);
            StringBuilder v1_2 = new StringBuilder();
            v1_2.append(v0_3);
            v1_2.append("\n\n");
            v1_2.append(v10_7);
            v13_4.X(v1_2.toString()).w(new com.alightcreative.app.motion.activities.g0(p12, p11)).setPositiveButton(2132017454, new com.alightcreative.app.motion.activities.i8S(p12, p11)).F0();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit Z(com.alightcreative.app.motion.activities.FontBrowserActivity p0, boolean p1)
    {
        return com.alightcreative.app.motion.activities.FontBrowserActivity.CB(p0, p1);
    }

    public static synthetic void Z0(com.alightcreative.app.motion.activities.FontBrowserActivity p0)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.p(p0);
        return;
    }

    public static synthetic void Zk(com.alightcreative.app.motion.activities.FontBrowserActivity p0, kotlin.Result p1, kotlin.jvm.functions.Function1 p2)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.MTr(p0, p1, p2);
        return;
    }

    private static final boolean a9(com.alightcreative.app.motion.activities.FontBrowserActivity p7, android.view.MenuItem p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "item");
        if (p8.getItemId() != 2131363058) {
            return 0;
        } else {
            android.content.Intent v8_1 = new android.content.Intent("android.intent.action.OPEN_DOCUMENT");
            v8_1.addCategory("android.intent.category.OPENABLE");
            v8_1.setType("*/*");
            String v3 = "application/x-font-ttf";
            v8_1.putExtra("android.intent.extra.ALLOW_MULTIPLE", 1);
            v8_1.putExtra("android.intent.extra.MIME_TYPES", new String[] {"font/ttf", "application/font-sfnt"}));
            p7.startActivityForResult(v8_1, 2);
            return 1;
        }
    }

    private static final kotlin.Unit b1(com.alightcreative.app.motion.activities.FontBrowserActivity p5, com.alightcreative.app.motion.fonts.CU p6, kotlin.jvm.functions.Function1 p7)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "amTypeface");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "completion");
        kotlin.jvm.internal.Ref$BooleanRef v0_3 = new kotlin.jvm.internal.Ref$BooleanRef();
        v0_3.element = 1;
        com.alightcreative.app.motion.activities.Lvj v1_1 = p5.H;
        if (v1_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_1 = 0;
        }
        v1_1.X.postDelayed(new com.alightcreative.app.motion.activities.ZP(p5, v0_3), 30);
        com.alightcreative.app.motion.fonts.cY.ah(p6, new com.alightcreative.app.motion.activities.Lvj(v0_3, p5, p7));
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void b9Y(androidx.appcompat.app.CU p0, com.alightcreative.app.motion.activities.FontBrowserActivity p1, android.content.DialogInterface p2)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.En(p0, p1, p2);
        return;
    }

    public static synthetic kotlin.Unit cKj(nVu.y3Q p0, com.alightcreative.app.motion.activities.FontBrowserActivity p1, int p2)
    {
        return com.alightcreative.app.motion.activities.FontBrowserActivity.jfW(p0, p1, p2);
    }

    public static synthetic void cak(com.alightcreative.app.motion.activities.FontBrowserActivity p0, kotlin.jvm.internal.Ref$BooleanRef p1)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.lka(p0, p1);
        return;
    }

    private static final void dDX(com.alightcreative.app.motion.activities.FontBrowserActivity p5, android.view.View p6)
    {
        android.widget.ImageButton v6_0 = p5.H;
        nVu.q v0 = 0;
        if (v6_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_0 = 0;
        }
        v6_0.T.setVisibility(4);
        android.widget.ImageButton v6_1 = p5.H;
        if (v6_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_1 = 0;
        }
        v6_1.db.setVisibility(0);
        android.widget.ImageButton v6_3 = p5.H;
        if (v6_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_3 = 0;
        }
        v6_3.db.setText("");
        android.widget.ImageButton v6_5 = p5.H;
        if (v6_5 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_5 = 0;
        }
        v6_5.db.requestFocus();
        android.widget.ImageButton v6_7 = p5.H;
        if (v6_7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_7 = 0;
        }
        android.widget.ImageButton v6_8 = v6_7.db;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v6_8, "searchText");
        FKt.pD.l(v6_8);
        android.widget.ImageButton v6_9 = p5.H;
        if (v6_9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_9 = 0;
        }
        v6_9.j.setVisibility(0);
        android.widget.ImageButton v6_11 = p5.H;
        if (v6_11 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v6_11 = 0;
        }
        v6_11.cD.setVisibility(4);
        android.widget.ImageButton v5_1 = p5.H;
        if (v5_1 != null) {
            v0 = v5_1;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v0.x.setVisibility(4);
        return;
    }

    public static synthetic kotlin.Unit dav(com.alightcreative.app.motion.activities.FontBrowserActivity p0, com.alightcreative.app.motion.fonts.CU p1, kotlin.jvm.functions.Function1 p2)
    {
        return com.alightcreative.app.motion.activities.FontBrowserActivity.b1(p0, p1, p2);
    }

    public static synthetic kotlin.Unit e4D(com.alightcreative.app.motion.activities.FontBrowserActivity p0, java.util.List p1, java.util.List p2)
    {
        return com.alightcreative.app.motion.activities.FontBrowserActivity.jV(p0, p1, p2);
    }

    private static final void fdD(com.alightcreative.app.motion.activities.FontBrowserActivity p8, nVu.y3Q p9, android.view.View p10)
    {
        com.alightcreative.widget.Uk v0_1 = new com.alightcreative.widget.Uk(p8, p8.iM(), 0, 4, 0);
        com.alightcreative.widget.Uk.cLW(v0_1, 2132020263, 0, 0, 0, 0, 28, 0);
        com.alightcreative.widget.Uk.cLW(v0_1, 2132020258, 1, 0, 0, 0, 28, 0);
        v0_1.nvG(new com.alightcreative.app.motion.activities.aml(p9, p8));
        v0_1.R(p10.getWidth());
        kotlin.jvm.internal.Intrinsics.checkNotNull(p10);
        com.alightcreative.widget.Uk.Hm(v0_1, p10, 0, 0, 0, 14, 0);
        return;
    }

    public static synthetic kotlin.Unit g(com.alightcreative.app.motion.activities.FontBrowserActivity p0, kotlin.jvm.internal.Ref$BooleanRef p1, com.alightcreative.app.motion.fonts.CU p2, kotlin.Result p3)
    {
        return com.alightcreative.app.motion.activities.FontBrowserActivity.y3P(p0, p1, p2, p3);
    }

    public static synthetic void g2(boolean p0, com.alightcreative.app.motion.activities.FontBrowserActivity p1)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.v(p0, p1);
        return;
    }

    private static final void hk(kotlin.reflect.KMutableProperty0 p1, com.alightcreative.app.motion.activities.FontBrowserActivity p2, n9.CU p3, android.widget.CompoundButton p4, boolean p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "<unused var>");
        p1.set(Boolean.valueOf(p5));
        if (!p5) {
            p2.db = kotlin.collections.SetsKt.minus(p2.db, p3);
        } else {
            p2.db = kotlin.collections.SetsKt.plus(p2.db, p3);
        }
        p2.TT1();
        return;
    }

    public static synthetic void hsj(com.alightcreative.app.motion.activities.FontBrowserActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.AX(p0, p1);
        return;
    }

    private static final String i2(Exception p2)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("Import Font File error : ");
        v0_1.append(p2);
        return v0_1.toString();
    }

    private static final kotlin.Unit jV(com.alightcreative.app.motion.activities.FontBrowserActivity p9, java.util.List p10, java.util.List p11)
    {
        String v0_0 = FKt.Tn.ojl(p9);
        java.util.Iterator v1 = p10.iterator();
        while (v1.hasNext()) {
            Exception v2_2 = ((com.alightcreative.app.motion.activities.DxL) v1.next());
            com.alightcreative.app.motion.activities.wj v4_3 = v2_2.j().getPath();
            kotlin.jvm.internal.Intrinsics.checkNotNull(v4_3);
            Throwable v3_1 = new java.io.File(v4_3);
            com.alightcreative.app.motion.activities.wj v4_4 = kotlin.io.FilesKt.getExtension(v3_1);
            if ((!kotlin.jvm.internal.Intrinsics.areEqual(v4_4, "ttf")) && (!kotlin.jvm.internal.Intrinsics.areEqual(v4_4, "otf"))) {
                v4_4 = "ttf";
            }
            String v5_2;
            String v5_1 = v2_2.hUw();
            if (v5_1 == null) {
                String v5_4 = p9.getContentResolver().openInputStream(v2_2.j());
                if (v5_4 == null) {
                    v5_2 = v3_1.getName();
                } else {
                    try {
                        Throwable v3_3 = FKt.bV.FT(FKt.Uk.hUw(v5_4));
                    } catch (Exception v2_4) {
                        try {
                            throw v2_4;
                        } catch (Throwable v3_4) {
                            kotlin.io.CloseableKt.closeFinally(v5_4, v2_4);
                            throw v3_4;
                        }
                    }
                    kotlin.io.CloseableKt.closeFinally(v5_4, 0);
                    v5_2 = v3_3;
                }
            } else {
                v5_2 = kotlin.text.StringsKt.substringBeforeLast$default(v5_1, 46, 0, 2, 0);
                if (v5_2 == null) {
                }
            }
            Throwable v3_8 = new StringBuilder();
            v3_8.append(v5_2);
            v3_8.append(".");
            v3_8.append(v4_4);
            Throwable v3_10 = kotlin.io.FilesKt.resolve(v0_0, v3_8.toString());
            if (v3_10.exists()) {
            } else {
                Exception v2_7 = p9.getContentResolver().openInputStream(v2_2.j());
                if (v2_7 != null) {
                    kotlin.io.ByteStreamsKt.copyTo$default(v2_7, new java.io.FileOutputStream(v3_10), 0, 2, 0);
                }
                if (v2_7 == null) {
                    try {
                    } catch (RuntimeException) {
                    }
                    if (android.graphics.Typeface.createFromFile(v3_10) != null) {
                    } else {
                        v3_10.delete();
                        p11.add(v5_2);
                    }
                } else {
                    v2_7.close();
                }
            }
        }
        kotlin.Unit v9_2 = p9.JHw();
        android.os.Bundle v11_1 = new android.os.Bundle();
        v11_1.putInt("count", p10.size());
        v9_2.hUw(new TV.xfY$c("font_install", v11_1));
        com.alightcreative.app.motion.fonts.cY.R();
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit jfW(nVu.y3Q p2, com.alightcreative.app.motion.activities.FontBrowserActivity p3, int p4)
    {
        int v4_5;
        int v0_0 = com.alightcreative.app.motion.persist.xfY.INSTANCE;
        if (p4 == 0) {
            v4_5 = com.alightcreative.app.motion.persist.xfY$CU.cD;
        } else {
            if (p4 == 1) {
                v4_5 = com.alightcreative.app.motion.persist.xfY$CU.j;
            } else {
                v4_5 = com.alightcreative.app.motion.persist.xfY$CU.cD;
            }
        }
        int v4_4;
        v0_0.setFontSorting(v4_5);
        int v4_3 = com.alightcreative.app.motion.activities.FontBrowserActivity$A.$EnumSwitchMapping$0[v0_0.getFontSorting().ordinal()];
        if (v4_3 == 1) {
            v4_4 = 2132020258;
        } else {
            if (v4_3 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                v4_4 = 2132020263;
            }
        }
        p2.cLW.setText(v4_4);
        p3.TT1();
        return kotlin.Unit.INSTANCE;
    }

    private static final void jj(android.content.DialogInterface p0, int p1)
    {
        p0.dismiss();
        return;
    }

    public static synthetic void lU(com.alightcreative.app.motion.activities.FontBrowserActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.dDX(p0, p1);
        return;
    }

    private static final void lka(com.alightcreative.app.motion.activities.FontBrowserActivity p0, kotlin.jvm.internal.Ref$BooleanRef p1)
    {
        android.widget.LinearLayout v0_1 = p0.H;
        if (v0_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_1 = 0;
        }
        int v1_2;
        if (!p1.element) {
            v1_2 = 8;
        } else {
            v1_2 = 0;
        }
        v0_1.X.setVisibility(v1_2);
        return;
    }

    public static synthetic kotlin.Unit m(nVu.y3Q p0, com.alightcreative.app.motion.activities.FontBrowserActivity p1, int p2)
    {
        return com.alightcreative.app.motion.activities.FontBrowserActivity.q9c(p0, p1, p2);
    }

    public static synthetic kotlin.Unit m0(com.alightcreative.app.motion.activities.FontBrowserActivity p0, com.alightcreative.app.motion.fonts.CU p1)
    {
        return com.alightcreative.app.motion.activities.FontBrowserActivity.vy(p0, p1);
    }

    public static synthetic void nG(nVu.y3Q p0)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.EMD(p0);
        return;
    }

    public static synthetic w9w.a9t o(android.view.View p0, w9w.a9t p1)
    {
        return com.alightcreative.app.motion.activities.FontBrowserActivity.sw(p0, p1);
    }

    private static final void p(com.alightcreative.app.motion.activities.FontBrowserActivity p0)
    {
        p0.TT1();
        return;
    }

    private static final kotlin.Unit q9c(nVu.y3Q p4, com.alightcreative.app.motion.activities.FontBrowserActivity p5, int p6)
    {
        com.alightcreative.app.motion.persist.xfY.INSTANCE.setFontLanguageFilter(p6);
        kotlin.Unit v4_1 = p4.db;
        String v0_2 = p5.E;
        Object v1_0 = 0;
        if (v0_2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("fontLanguages");
            v0_2 = 0;
        }
        String v0_1 = v0_2.iterator();
        while (v0_1.hasNext()) {
            Object v2_1 = v0_1.next();
            if (((com.alightcreative.app.motion.activities.FontBrowserActivity$xfY) v2_1).j().j() == p6) {
                v1_0 = v2_1;
                break;
            }
        }
        String v6_1;
        Object v1_1 = ((com.alightcreative.app.motion.activities.FontBrowserActivity$xfY) v1_0);
        if (v1_1 == null) {
            v6_1 = p5.getString(2132017293);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v6_1, "getString(...)");
        } else {
            v6_1 = v1_1.hUw();
            if (v6_1 == null) {
            }
        }
        v4_1.setText(v6_1);
        p5.TT1();
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit qQf(kotlin.jvm.internal.Ref$BooleanRef p1, com.alightcreative.app.motion.activities.FontBrowserActivity p2, kotlin.jvm.functions.Function1 p3, kotlin.Result p4)
    {
        p1.element = 0;
        kotlin.Unit v1_2 = p2.H;
        if (v1_2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v1_2 = 0;
        }
        v1_2.X.post(new com.alightcreative.app.motion.activities.zn(p2, p4, p3));
        return kotlin.Unit.INSTANCE;
    }

    private static final void qxC(com.alightcreative.app.motion.activities.FontBrowserActivity p0, kotlin.jvm.internal.Ref$BooleanRef p1)
    {
        android.widget.LinearLayout v0_1 = p0.H;
        if (v0_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_1 = 0;
        }
        int v1_2;
        if (!p1.element) {
            v1_2 = 8;
        } else {
            v1_2 = 0;
        }
        v0_1.X.setVisibility(v1_2);
        return;
    }

    public static synthetic kotlin.Unit r7(java.util.List p0, com.alightcreative.app.motion.activities.FontBrowserActivity p1, androidx.appcompat.app.CU p2, kotlin.Unit p3)
    {
        return com.alightcreative.app.motion.activities.FontBrowserActivity.YU(p0, p1, p2, p3);
    }

    private static final w9w.a9t sw(android.view.View p3, w9w.a9t p4)
    {
        int v0_2 = p4.q(w9w.a9t$Zv9.ojl());
        kotlin.jvm.internal.Intrinsics.checkNotNull(p3);
        android.view.ViewGroup$MarginLayoutParams v1_1 = p3.getLayoutParams();
        if (v1_1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        } else {
            android.view.ViewGroup$MarginLayoutParams v1_0 = ((android.view.ViewGroup$MarginLayoutParams) v1_1);
            v1_0.topMargin = v0_2.j;
            v1_0.bottomMargin = v0_2.x;
            p3.setLayoutParams(v1_0);
            return p4;
        }
    }

    public static synthetic void tEh(com.alightcreative.app.motion.activities.FontBrowserActivity p0, nVu.y3Q p1, android.view.View p2)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.S6(p0, p1, p2);
        return;
    }

    public static synthetic void uM(com.alightcreative.app.motion.activities.FontBrowserActivity p0, nVu.y3Q p1, android.view.View p2)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.fdD(p0, p1, p2);
        return;
    }

    public static synthetic void uq6(com.alightcreative.app.motion.activities.FontBrowserActivity p0, kotlin.jvm.internal.Ref$BooleanRef p1)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.qxC(p0, p1);
        return;
    }

    private static final void v(boolean p2, com.alightcreative.app.motion.activities.FontBrowserActivity p3)
    {
        nVu.q v0 = 0;
        if (p2 == null) {
            android.widget.LinearLayout v2_3 = p3.H;
            if (v2_3 != null) {
                v0 = v2_3;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v0.uKP.setVisibility(0);
            return;
        } else {
            android.widget.LinearLayout v2_1 = p3.H;
            if (v2_1 != null) {
                v0 = v2_1;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v0.uKP.setVisibility(8);
            return;
        }
    }

    private static final void v9(kotlin.jvm.internal.Ref$BooleanRef p2, com.alightcreative.app.motion.activities.FontBrowserActivity p3, kotlin.Result p4, com.alightcreative.app.motion.fonts.CU p5)
    {
        p2.element = 0;
        kotlin.NoWhenBranchMatchedException v2_6 = p3.H;
        if (v2_6 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v2_6 = 0;
        }
        v2_6.X.setVisibility(8);
        kotlin.NoWhenBranchMatchedException v2_5 = kotlin.Result.exceptionOrNull-impl(p4.unbox-impl());
        if (!kotlin.jvm.internal.Intrinsics.areEqual(v2_5, com.alightcreative.app.motion.fonts.AMTypefaceError.j.X())) {
            if (v2_5 == null) {
                String v0_5;
                kotlin.NoWhenBranchMatchedException v2_7 = p3.JHw();
                int v4_5 = new android.os.Bundle();
                String v0_3 = p5.hUw().cD();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(v0_3, n9.D.hUw)) {
                    if (!(v0_3 instanceof n9.Zv9)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    } else {
                        v0_5 = "UserFont";
                    }
                } else {
                    v0_5 = com.alightcreative.app.motion.fonts.cY.pM1(p5);
                }
                v4_5.putString("font", v0_5);
                v4_5.putInt("weight", p5.j().cD());
                v4_5.putBoolean("italic", p5.j().j());
                v2_7.hUw(new TV.xfY$c("font_browser_select_font", v4_5));
                p3.setResult(-1, new android.content.Intent().putExtra("selectedFont", p5.toString()));
                p3.finish();
                return;
            } else {
                int v4_10 = new android.app.AlertDialog$Builder(p3).setTitle(2132019177);
                com.alightcreative.app.motion.activities.KOB v3_4 = p3.getString(2132019178);
                kotlin.NoWhenBranchMatchedException v2_15 = v2_5.getMessage();
                String v5_4 = new StringBuilder();
                v5_4.append(v3_4);
                v5_4.append("\n\n");
                v5_4.append(v2_15);
                v4_10.setMessage(v5_4.toString()).setPositiveButton(2132017454, new com.alightcreative.app.motion.activities.KOB()).show();
                return;
            }
        } else {
            new android.app.AlertDialog$Builder(p3).setTitle(2132019177).setMessage(2132019832).setPositiveButton(2132017454, new com.alightcreative.app.motion.activities.b7()).show();
            return;
        }
    }

    private static final kotlin.Unit vy(com.alightcreative.app.motion.activities.FontBrowserActivity p3, com.alightcreative.app.motion.fonts.CU p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "it");
        if (com.alightcreative.app.motion.fonts.cY.FT() <= 1) {
            android.widget.CheckBox v4_1 = p3.H;
            if (v4_1 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v4_1 = 0;
            }
            android.widget.CheckBox v4_4 = nVu.y3Q.hUw(v4_1.ojl.cLW(0));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_4, "bind(...)");
            v4_4.R6.setVisibility(8);
            long v1_2 = com.alightcreative.app.motion.persist.xfY.INSTANCE;
            if (v1_2.getFontFilterImported()) {
                v1_2.setFontFilterImported(0);
                v4_4.R6.setChecked(0);
                v4_4.R6.postDelayed(new com.alightcreative.app.motion.activities.zXT(p3), 15);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final void wH(com.alightcreative.app.motion.activities.FontBrowserActivity p0, android.view.View p1)
    {
        p0.Odv();
        return;
    }

    public static final synthetic nVu.q wx(com.alightcreative.app.motion.activities.FontBrowserActivity p0)
    {
        return p0.H;
    }

    private static final kotlin.Unit y3P(com.alightcreative.app.motion.activities.FontBrowserActivity p2, kotlin.jvm.internal.Ref$BooleanRef p3, com.alightcreative.app.motion.fonts.CU p4, kotlin.Result p5)
    {
        android.widget.LinearLayout v0_0 = p2.H;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_0 = 0;
        }
        v0_0.X.post(new com.alightcreative.app.motion.activities.kk(p3, p2, p5, p4));
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void yy(android.content.DialogInterface p0, int p1)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.jj(p0, p1);
        return;
    }

    public static synthetic void z2f(kotlin.reflect.KMutableProperty0 p0, com.alightcreative.app.motion.activities.FontBrowserActivity p1, n9.CU p2, android.widget.CompoundButton p3, boolean p4)
    {
        com.alightcreative.app.motion.activities.FontBrowserActivity.hk(p0, p1, p2, p3, p4);
        return;
    }

    public final TV.n JHw()
    {
        int v0_0 = this.X;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final Vbv.c iM()
    {
        int v0_0 = this.T;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("iapManager");
            return 0;
        } else {
            return v0_0;
        }
    }

    protected void onActivityResult(int p3, int p4, android.content.Intent p5)
    {
        if (p3 == 1) {
            this.TT1();
            return;
        } else {
            if (p3 == 2) {
                if (p5 != 0) {
                    java.util.List v3_4 = p5.getClipData();
                    if (v3_4 != null) {
                        java.util.ArrayList v4_2 = new java.util.ArrayList();
                        int v5_1 = v3_4.getItemCount();
                        int v0_1 = 0;
                        while (v0_1 < v5_1) {
                            v4_2.add(v3_4.getItemAt(v0_1).getUri());
                            v0_1++;
                        }
                        this.KE(v4_2);
                        return;
                    }
                }
                if (p5 != 0) {
                    java.util.List v3_1 = p5.getData();
                    if (v3_1 != null) {
                        this.KE(kotlin.collections.CollectionsKt.mutableListOf(new android.net.Uri[] {v3_1})));
                    }
                }
                return;
            } else {
                super.onActivityResult(p3, p4, p5);
                return;
            }
        }
    }

    protected void onCreate(android.os.Bundle p11)
    {
        super.onCreate(p11);
        kotlin.jvm.functions.Function1 v11_1 = nVu.q.cD(this.getLayoutInflater());
        this.H = v11_1;
        nVu.q v1 = 0;
        if (v11_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v11_1 = 0;
        }
        this.setContentView(v11_1.j());
        kotlin.jvm.functions.Function1 v11_3 = this.H;
        if (v11_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v11_3 = 0;
        }
        w9w.Xo.If(v11_3.j(), new com.alightcreative.app.motion.activities.Xkx());
        kotlin.jvm.functions.Function1 v11_20 = n9.AWD.values();
        com.alightcreative.app.motion.activities.iz v2_28 = new java.util.ArrayList(v11_20.length);
        com.alightcreative.app.motion.activities.BX v3_5 = v11_20.length;
        int v5_5 = 0;
        while (v5_5 < v3_5) {
            com.alightcreative.app.motion.activities.FontBrowserActivity$xfY v7_5 = v11_20[v5_5];
            String v9_1 = this.getString(v7_5.cD());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v9_1, "getString(...)");
            v2_28.add(new com.alightcreative.app.motion.activities.FontBrowserActivity$xfY(v9_1, v7_5));
            v5_5++;
        }
        this.E = kotlin.collections.CollectionsKt.sortedWith(v2_28, new com.alightcreative.app.motion.activities.FontBrowserActivity$CU());
        kotlin.jvm.functions.Function1 v11_24 = this.H;
        if (v11_24 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v11_24 = 0;
        }
        v11_24.H.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(this, 2));
        kotlin.jvm.functions.Function1 v11_26 = this.H;
        if (v11_26 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v11_26 = 0;
        }
        v11_26.x.setOnClickListener(new com.alightcreative.app.motion.activities.DAL(this));
        kotlin.jvm.functions.Function1 v11_28 = this.H;
        if (v11_28 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v11_28 = 0;
        }
        kotlin.jvm.functions.Function1 v11_31 = nVu.y3Q.hUw(v11_28.ojl.cLW(0));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v11_31, "bind(...)");
        int v5_6 = com.alightcreative.app.motion.persist.xfY.INSTANCE;
        com.alightcreative.app.motion.activities.iz v2_35 = new com.alightcreative.app.motion.activities.FontBrowserActivity$c(v5_6);
        com.alightcreative.app.motion.activities.FontBrowserActivity$xfY v7_6 = v11_31.X;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_6, "checkboxSerif");
        this.QP(v2_35, v7_6, n9.CU.q);
        com.alightcreative.app.motion.activities.iz v2_37 = new com.alightcreative.app.motion.activities.FontBrowserActivity$K(v5_6);
        com.alightcreative.app.motion.activities.FontBrowserActivity$xfY v7_7 = v11_31.H;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_7, "checkboxSansSerif");
        this.QP(v2_37, v7_7, n9.CU.x);
        com.alightcreative.app.motion.activities.iz v2_39 = new com.alightcreative.app.motion.activities.FontBrowserActivity$qfV(v5_6);
        com.alightcreative.app.motion.activities.FontBrowserActivity$xfY v7_8 = v11_31.j;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_8, "checkboxDisplay");
        this.QP(v2_39, v7_8, n9.CU.H);
        com.alightcreative.app.motion.activities.iz v2_41 = new com.alightcreative.app.motion.activities.FontBrowserActivity$Enc(v5_6);
        com.alightcreative.app.motion.activities.FontBrowserActivity$xfY v7_9 = v11_31.x;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_9, "checkboxHandwriting");
        this.QP(v2_41, v7_9, n9.CU.X);
        com.alightcreative.app.motion.activities.iz v2_43 = new com.alightcreative.app.motion.activities.FontBrowserActivity$F(v5_6);
        com.alightcreative.app.motion.activities.FontBrowserActivity$xfY v7_10 = v11_31.q;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_10, "checkboxMonospace");
        this.QP(v2_43, v7_10, n9.CU.T);
        com.alightcreative.app.motion.activities.iz v2_1 = new com.alightcreative.app.motion.activities.FontBrowserActivity$h(v5_6);
        com.alightcreative.app.motion.activities.FontBrowserActivity$xfY v7_0 = v11_31.R6;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_0, "checkboxImported");
        this.QP(v2_1, v7_0, n9.CU.db);
        com.alightcreative.app.motion.activities.iz v2_3 = new com.alightcreative.app.motion.activities.FontBrowserActivity$XSt(v5_6);
        com.alightcreative.app.motion.activities.FontBrowserActivity$xfY v7_1 = v11_31.cD;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_1, "checkboxFavorite");
        this.QP(v2_3, v7_1, n9.CU.w);
        if (com.alightcreative.app.motion.fonts.cY.FT() <= 0) {
            v11_31.R6.setVisibility(8);
        } else {
            v11_31.R6.setVisibility(0);
        }
        com.alightcreative.app.motion.activities.iz v2_7 = v5_6.getFontLanguageFilter();
        android.widget.TextView v4_1 = v11_31.db;
        int v5_0 = this.E;
        if (v5_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("fontLanguages");
            v5_0 = 0;
        }
        int v5_2 = v5_0.iterator();
        while (v5_2.hasNext()) {
            com.alightcreative.app.motion.activities.FontBrowserActivity$xfY v7_3 = v5_2.next();
            if (((com.alightcreative.app.motion.activities.FontBrowserActivity$xfY) v7_3).j().j() == v2_7) {
            }
            com.alightcreative.app.motion.activities.iz v2_8;
            com.alightcreative.app.motion.activities.FontBrowserActivity$xfY v7_4 = ((com.alightcreative.app.motion.activities.FontBrowserActivity$xfY) v7_3);
            if (v7_4 == null) {
                v2_8 = this.getString(2132017293);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2_8, "getString(...)");
            } else {
                v2_8 = v7_4.hUw();
                if (v2_8 == null) {
                }
            }
            com.alightcreative.app.motion.activities.iz v2_14;
            v4_1.setText(v2_8);
            com.alightcreative.app.motion.activities.iz v2_13 = com.alightcreative.app.motion.activities.FontBrowserActivity$A.$EnumSwitchMapping$0[com.alightcreative.app.motion.persist.xfY.INSTANCE.getFontSorting().ordinal()];
            if (v2_13 == 1) {
                v2_14 = 2132020258;
            } else {
                if (v2_13 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                } else {
                    v2_14 = 2132020263;
                }
            }
            v11_31.cLW.setText(v2_14);
            v11_31.cLW.setOnClickListener(new com.alightcreative.app.motion.activities.ab5(this, v11_31));
            v11_31.db.setOnClickListener(new com.alightcreative.app.motion.activities.BX(this, v11_31));
            kotlin.jvm.functions.Function1 v11_6 = this.H;
            if (v11_6 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v11_6 = 0;
            }
            v11_6.ojl.setNavigationItemSelectedListener(new com.alightcreative.app.motion.activities.Ku(this));
            kotlin.jvm.functions.Function1 v11_9 = this.H;
            if (v11_9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v11_9 = 0;
            }
            v11_9.q.hUw(new com.alightcreative.app.motion.activities.FontBrowserActivity$V(this));
            kotlin.jvm.functions.Function1 v11_11 = this.H;
            if (v11_11 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v11_11 = 0;
            }
            v11_11.cD.setOnClickListener(new com.alightcreative.app.motion.activities.W4j(this));
            kotlin.jvm.functions.Function1 v11_14 = this.H;
            if (v11_14 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v11_14 = 0;
            }
            v11_14.j.setOnClickListener(new com.alightcreative.app.motion.activities.iz(this));
            kotlin.jvm.functions.Function1 v11_16 = this.H;
            if (v11_16 != null) {
                v1 = v11_16;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v1.db.addTextChangedListener(new com.alightcreative.app.motion.activities.FontBrowserActivity$cY(this));
            this.TT1();
            this.ah.hUw().invoke(Boolean.valueOf(fx.c.E(this)));
            return;
        }
        v7_3 = 0;
    }

    protected void onPause()
    {
        super.onPause();
        fx.c.Bb(this, this.ah);
        return;
    }

    protected void onResume()
    {
        super.onResume();
        fx.c.Q(this, this.ah);
        nVu.y3Q v0_3 = this.H;
        if (v0_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_3 = 0;
        }
        nVu.y3Q v0_2 = nVu.y3Q.hUw(v0_3.ojl.cLW(0));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v0_2, "bind(...)");
        if ((v0_2.R6.getVisibility() != 0) && (com.alightcreative.app.motion.fonts.cY.FT() > 0)) {
            v0_2.R6.postDelayed(new com.alightcreative.app.motion.activities.WyD(v0_2), 300);
        }
        return;
    }
}
