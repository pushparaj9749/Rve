package com.alightcreative.app.motion.activities.edit.widgets;
public final class TimelineLayoutManager extends androidx.recyclerview.widget.RecyclerView$m implements com.alightcreative.widget.RecyclerViewEx$xfY, com.alightcreative.widget.RecyclerViewEx$CU, com.alightcreative.widget.RecyclerViewEx$h, com.alightcreative.widget.RecyclerViewEx$A {
    public static final int cKj;
    static final synthetic kotlin.reflect.KProperty[] z2f;
    private com.alightcreative.app.motion.activities.edit.widgets.A AI;
    private boolean AM;
    private final int Bb;
    private Integer C;
    private final float D1;
    private int F;
    private final kotlin.properties.ReadWriteProperty F0;
    private final android.content.Context FT;
    private boolean GO;
    private int Hm;
    private final kotlin.Lazy If;
    private final int J;
    private float Jd;
    private android.graphics.LinearGradient Jm;
    private final int K;
    private final int LV;
    private java.util.Map M;
    private final android.os.Handler MgY;
    private final kotlin.Lazy N;
    private final int Q;
    private final kotlin.Lazy QR;
    private float R;
    private int[] S;
    private final android.graphics.Path ST5;
    private xT.WM ToE;
    private int X9x;
    private final float XA;
    private final float Yd;
    private final kotlin.Lazy Z;
    private float Z5u;
    private final kotlin.Lazy Zk;
    private final kotlin.properties.ReadWriteProperty Zq;
    private final android.util.AttributeSet ah;
    private final int ak;
    private final kotlin.Lazy b9Y;
    private float cak;
    private kotlin.jvm.functions.Function5 cv;
    private int d;
    private Integer e;
    private final float e0E;
    private float e4D;
    private final int f;
    private final kotlin.Lazy g;
    private final android.graphics.Path g2;
    private final android.content.res.TypedArray h;
    private final kotlin.Lazy hP;
    private final com.alightcreative.app.motion.scene.CubicBSpline hsj;
    private float i6;
    private java.util.List iVU;
    private int jE;
    private int jgN;
    private final android.graphics.RectF lU;
    private Integer n;
    private boolean nvG;
    private final float oiZ;
    private final int[] r8t;
    private final float rs;
    private final float t;
    private final android.graphics.RectF tEh;
    private final Runnable uM;
    private final float v5;
    private Integer w0;
    private final int x1;
    private kotlin.jvm.functions.Function1 z;
    private final int za;
    private final int zm;

    static TimelineLayoutManager()
    {
        int v0_4 = kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager, "internalScrollX", "getInternalScrollX()I", 0));
        kotlin.reflect.KMutableProperty1 v1_1 = kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager, "playing", "getPlaying()Z", 0));
        kotlin.reflect.KProperty[] v2_2 = new kotlin.reflect.KProperty[2];
        v2_2[0] = v0_4;
        v2_2[1] = v1_1;
        com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.z2f = v2_2;
        com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.cKj = 8;
        return;
    }

    public TimelineLayoutManager(android.content.Context p19, android.util.AttributeSet p20, int p21, int p22)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p20, "attributeSet");
        com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager v0_1 = ;
v0_1.FT = p19;
        v0_1.ah = p20;
        v0_1.F0 = new com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$h(Integer.valueOf(0), v0_1);
        v0_1.f = p19.getResources().getDimensionPixelSize(2131166308);
        v0_1.K = p19.getResources().getDimensionPixelOffset(2131166435);
        v0_1.x1 = p19.getResources().getDimensionPixelOffset(2131165269);
        v0_1.Bb = p19.getResources().getDimensionPixelOffset(2131166432);
        v0_1.Z5u = 1065353216;
        v0_1.F = -1;
        v0_1.MgY = new android.os.Handler();
        v0_1.M = kotlin.collections.MapsKt.emptyMap();
        v0_1.Zq = new com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$XSt(Boolean.FALSE, v0_1);
        v0_1.AI = com.alightcreative.app.motion.activities.edit.widgets.A$CU.hUw;
        v0_1.t = (p19.getResources().getDimension(2131166434) / 1073741824);
        v0_1.rs = p19.getResources().getDimension(2131166433);
        v0_1.e0E = p19.getResources().getDimension(2131166431);
        v0_1.Yd = p19.getResources().getDimension(2131166430);
        v0_1.oiZ = p19.getResources().getDimension(2131166421);
        v0_1.v5 = p19.getResources().getDimension(2131166422);
        v0_1.D1 = p19.getResources().getDimension(2131166420);
        v0_1.XA = p19.getResources().getDimension(2131165318);
        v0_1.J = p19.getResources().getDimensionPixelOffset(2131166419);
        v0_1.zm = p19.getResources().getDimensionPixelSize(2131166423);
        int v6_8 = p19.getTheme().obtainStyledAttributes(p20, ZiE.et.cD, p21, p22);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v6_8, "obtainStyledAttributes(...)");
        Integer v8_1 = v6_8.getDimensionPixelSize(12, 40);
        v0_1.LV = v8_1;
        v0_1.Q = v6_8.getDimensionPixelSize(11, 80);
        v0_1.ak = v6_8.getDimensionPixelSize(8, 80);
        int v6_11 = com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.getSimpleName();
        Integer v9_5 = new StringBuilder();
        v9_5.append("rowHeight:");
        v9_5.append(v8_1);
        android.util.Log.d(v6_11, v9_5.toString());
        v0_1.jgN = -1;
        v0_1.za = p19.getResources().getDimensionPixelSize(2131166417);
        v0_1.iVU = kotlin.collections.CollectionsKt.emptyList();
        Integer v8_3 = Integer.valueOf(2130968823);
        Integer.valueOf(2130968816);
        Integer.valueOf(2130968782);
        Integer.valueOf(2130968828);
        Integer.valueOf(2130968778);
        Integer.valueOf(2130968779);
        Integer.valueOf(2130968824);
        Integer.valueOf(2130968825);
        Integer.valueOf(2130968826);
        int[] v5_19 = kotlin.collections.CollectionsKt.toIntArray(kotlin.collections.CollectionsKt.sorted(kotlin.collections.CollectionsKt.listOf(new Integer[] {v8_3, Integer.valueOf(2130968827)}))));
        v0_1.r8t = v5_19;
        Runnable v1_2 = p19.getTheme().obtainStyledAttributes(p20, v5_19, p21, p22);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_2, "obtainStyledAttributes(...)");
        v0_1.h = v1_2;
        v0_1.hP = kotlin.LazyKt.lazy(new HB.tqK(v0_1));
        v0_1.b9Y = kotlin.LazyKt.lazy(new HB.n(v0_1));
        v0_1.Zk = kotlin.LazyKt.lazy(new HB.Bt(v0_1));
        v0_1.tEh = new android.graphics.RectF();
        v0_1.Z = kotlin.LazyKt.lazy(new HB.aW8(v0_1));
        v0_1.QR = kotlin.LazyKt.lazy(new HB.go(v0_1));
        v0_1.ST5 = new android.graphics.Path();
        Runnable v1_22 = MX.xfY.hUw();
        v0_1.hsj = v1_22;
        Runnable v1_24 = com.alightcreative.app.motion.scene.CubicBSplineKt.toPath(v1_22).j();
        v0_1.g2 = v1_24;
        android.graphics.RectF v2_2 = new android.graphics.RectF();
        v1_24.computeBounds(v2_2, 1);
        v0_1.lU = v2_2;
        v0_1.N = kotlin.LazyKt.lazy(new HB.Xo(v0_1));
        v0_1.g = kotlin.LazyKt.lazy(new HB.HLZ(v0_1));
        v0_1.If = kotlin.LazyKt.lazy(new HB.sKo());
        v0_1.uM = HB.gs.j(new HB.ibQ(v0_1));
        return;
    }

    private final int BCj()
    {
        return ((Number) this.g.getValue()).intValue();
    }

    private final android.graphics.Paint BG()
    {
        return ((android.graphics.Paint) this.QR.getValue());
    }

    public static synthetic android.graphics.Paint BYa(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p0)
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.U3H(p0);
    }

    public static synthetic boolean C8(xT.WM p0, com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p1, int p2)
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.QBR(p0, p1, p2);
    }

    private static final kotlin.Unit D(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p1, Runnable p2, Runnable p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "$this$runnable");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "it");
        p1.MgY.removeCallbacks(p2);
        Integer v2_2 = p1.ff();
        if (p1.F != v2_2) {
            p1.F = v2_2;
            kotlin.Unit v1_1 = p1.z;
            if (v1_1 != null) {
                v1_1.invoke(Integer.valueOf(v2_2));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final android.graphics.Paint D3(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p2)
    {
        android.graphics.Paint v0_1 = new android.graphics.Paint();
        v0_1.setColor(-1);
        v0_1.setStyle(android.graphics.Paint$Style.FILL);
        v0_1.setTextSize(p2.FT.getResources().getDimension(2131166421));
        v0_1.setTextAlign(android.graphics.Paint$Align.CENTER);
        v0_1.setAntiAlias(1);
        return v0_1;
    }

    private static final String DQ7(int p2, com.alightcreative.app.motion.scene.SceneBookmark p3, int p4)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("drawBackground bookmarks    bm: (");
        v0_1.append(p2);
        v0_1.append(",");
        v0_1.append(p3);
        v0_1.append(") frame=");
        v0_1.append(p4);
        return v0_1.toString();
    }

    public static final synthetic android.os.Handler FK(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p0)
    {
        return p0.MgY;
    }

    public static synthetic android.graphics.Paint IUG(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p0)
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.zBL(p0);
    }

    private static final android.graphics.Paint Kgh()
    {
        android.graphics.Paint v0_1 = new android.graphics.Paint();
        v0_1.setStyle(android.graphics.Paint$Style.FILL);
        return v0_1;
    }

    public static synthetic android.graphics.Paint LQ(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p0)
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.fP(p0);
    }

    private final int[] LX()
    {
        if (this.S == null) {
            this.S = new int[] {this.h.getColor(kotlin.collections.ArraysKt.indexOf(this.r8t, 2130968824), -1), this.h.getColor(kotlin.collections.ArraysKt.indexOf(this.r8t, 2130968825), -1), this.h.getColor(kotlin.collections.ArraysKt.indexOf(this.r8t, 2130968826), -1), this.h.getColor(kotlin.collections.ArraysKt.indexOf(this.r8t, 2130968827), -1)});
        }
        int[] v0_3 = this.S;
        kotlin.jvm.internal.Intrinsics.checkNotNull(v0_3);
        return v0_3;
    }

    private static final String PfB(kotlin.jvm.internal.Ref$IntRef p2, boolean p3)
    {
        String v2_1 = p2.element;
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("fillVisibleChildren layer=");
        v0_1.append(v2_1);
        v0_1.append(" isDragging=");
        v0_1.append(p3);
        return v0_1.toString();
    }

    private static final boolean QBR(xT.WM p6, com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p7, int p8)
    {
        boolean v0_0 = p6.R6(p8);
        int v1_0 = p7.LV;
        int v2_2 = (((v0_0 * v1_0) - p7.jE) + p7.K);
        int v1_1 = (v1_0 + v2_2);
        boolean v0_2 = p7.iVU.contains(Integer.valueOf(v0_0));
        int v3_0 = p6.j(p8);
        int v4_0 = v3_0.getStartTime();
        int v3_1 = v3_0.getEndTime();
        if (com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$A.$EnumSwitchMapping$0[p6.q(p8).ordinal()] != 1) {
            if ((!v0_2) && ((v1_1 < 0) || (v2_2 > p7.i6()))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            int v4_5 = (((((v4_0 * p7.P()) / 1000) - p7.khl()) + (p7.If() / 2)) - p7.zm);
            int v3_5 = (((v3_1 * p7.P()) / 1000) - p7.khl());
            int v6_12 = p7.If();
            if ((!v0_2) && ((((v3_5 + (v6_12 / 2)) + p7.zm) < 0) || ((v4_5 > p7.If()) || ((v1_1 < 0) || (v2_2 > p7.i6()))))) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static synthetic kotlin.Unit Qj(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p0, android.view.View p1)
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.bo(p0, p1);
    }

    private final String Sbn(int p2)
    {
        if (p2 == null) {
            return "IDLE";
        } else {
            if (p2 == 1) {
                return "DRAGGING";
            } else {
                if (p2 == 2) {
                    return "SETTLING";
                } else {
                    return String.valueOf(p2);
                }
            }
        }
    }

    private static final String Txi()
    {
        return "fillVisibleChildren IN";
    }

    private static final android.graphics.Paint U3H(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p3)
    {
        android.graphics.Paint v0_1 = new android.graphics.Paint();
        v0_1.setColor(p3.h.getColor(kotlin.collections.ArraysKt.indexOf(p3.r8t, 2130968816), -1));
        v0_1.setStyle(android.graphics.Paint$Style.FILL);
        return v0_1;
    }

    private final android.graphics.Paint UU()
    {
        return ((android.graphics.Paint) this.If.getValue());
    }

    private final int X8()
    {
        return ((Number) this.N.getValue()).intValue();
    }

    private final void a(androidx.recyclerview.widget.RecyclerView$Y p19, androidx.recyclerview.widget.RecyclerView$Tn p20)
    {
        fx.Enc.H(this, new HB.Z());
        kotlin.NoWhenBranchMatchedException v1_12 = this.ToE;
        if (v1_12 != null) {
            kotlin.NoWhenBranchMatchedException v1_0 = kotlin.sequences.SequencesKt.filter(kotlin.collections.CollectionsKt.asSequence(kotlin.ranges.RangesKt.until(0, p20.j())), new HB.N5W(v1_12, this));
            this.cv(p19);
            java.util.Iterator v8 = v1_0.iterator();
            while (v8.hasNext()) {
                int v3_13;
                kotlin.NoWhenBranchMatchedException v1_11 = ((Number) v8.next()).intValue();
                HB.PA v2_25 = new kotlin.jvm.internal.Ref$IntRef();
                v2_25.element = v1_11;
                kotlin.NoWhenBranchMatchedException v1_13 = p19.pM1(v1_11);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_13, "getViewForPosition(...)");
                int v3_12 = v1_13.getLayoutParams();
                if (!(v3_12 instanceof com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY)) {
                    v3_13 = 0;
                } else {
                    v3_13 = ((com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY) v3_12);
                }
                if (v3_13 == 0) {
                    v3_13 = 0;
                } else {
                    int v12_20;
                    v3_13.height = this.LV;
                    int v12_14 = com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$A.$EnumSwitchMapping$0[v3_13.H().ordinal()];
                    if (v12_14 == 1) {
                        v12_20 = (((((v3_13.R6() - v3_13.X()) * this.P()) / 1000) + v3_13.leftMargin) + v3_13.rightMargin);
                    } else {
                        if (v12_14 == 2) {
                            v12_20 = this.Q;
                        } else {
                            if (v12_14 == 3) {
                                v12_20 = this.If();
                            } else {
                                if (v12_14 != 4) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                } else {
                                    v12_20 = this.ak;
                                }
                            }
                        }
                    }
                    v3_13.width = v12_20;
                    if (v3_13.q() >= 0) {
                        fx.Enc.H(this, new HB.mW(v2_25, v3_13));
                        v2_25.element = v3_13.q();
                    }
                }
                int v14_0;
                v1_13.setLayoutParams(v3_13);
                fx.Enc.H(this, new HB.N(v2_25, this.iVU.contains(Integer.valueOf(v2_25.element))));
                int v3_2 = this.LV;
                HB.PA v2_4 = (((v2_25.element * v3_2) - this.jE) + this.K);
                int v3_3 = (v3_2 + v2_4);
                int v12_10 = v1_13.getLayoutParams();
                boolean v13_0 = (v12_10 instanceof com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY);
                if (!v13_0) {
                    v14_0 = 0;
                } else {
                    v14_0 = ((com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY) v12_10);
                }
                int v14_2;
                if (v14_0 == 0) {
                    v14_2 = 0;
                } else {
                    v14_2 = v14_0.X();
                }
                int v15_0;
                if (!v13_0) {
                    v15_0 = 0;
                } else {
                    v15_0 = ((com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY) v12_10);
                }
                int v15_2;
                if (v15_0 == 0) {
                    v15_2 = 0;
                } else {
                    v15_2 = v15_0.R6();
                }
                int v16_0;
                if (!v13_0) {
                    v16_0 = 0;
                } else {
                    v16_0 = ((com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY) v12_10);
                }
                int v16_2;
                if (v16_0 == 0) {
                    v16_2 = com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY$xfY.cD;
                } else {
                    v16_2 = v16_0.H();
                    if (v16_2 == 0) {
                    }
                }
                int v5_0 = com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$A.$EnumSwitchMapping$0[v16_2.ordinal()];
                if (v5_0 == 1) {
                    int v4_3;
                    int v5_1 = v3_3;
                    int v3_6 = v2_4;
                    HB.PA v2_9 = (((this.P() * v14_2) / 1000) - this.khl());
                    int v4_1 = this.If();
                    if (!v13_0) {
                        v4_3 = 0;
                    } else {
                        v4_3 = ((com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY) v12_10);
                    }
                    int v4_5;
                    if (v4_3 == 0) {
                        v4_5 = 0;
                    } else {
                        v4_5 = v4_3.leftMargin;
                    }
                    int v9_3;
                    HB.PA v2_11 = ((v2_9 + (v4_1 / 2)) - v4_5);
                    int v4_9 = (((this.P() * v15_2) / 1000) - this.khl());
                    int v9_1 = this.If();
                    if (!v13_0) {
                        v9_3 = 0;
                    } else {
                        v9_3 = ((com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY) v12_10);
                    }
                    int v9_5;
                    if (v9_3 == 0) {
                        v9_5 = 0;
                    } else {
                        v9_5 = v9_3.rightMargin;
                    }
                    int v4_11 = ((v4_9 + (v9_1 / 2)) + v9_5);
                    this.IB(v1_13);
                    this.m0(v1_13, 0, 0);
                    this.dav(v1_13, v2_11, v3_6, v4_11, v5_1);
                    FKt.pD.R6(v1_13, new HB.vp(this, v14_2, v15_2));
                    FKt.pD.R6(v1_13, new HB.PA(this));
                } else {
                    if (v5_0 == 2) {
                        int v5_2 = v3_3;
                        int v3_7 = v2_4;
                        this.IB(v1_13);
                        this.m0(v1_13, 0, 0);
                        this.dav(v1_13, 0, v3_7, this.Q, v5_2);
                    } else {
                        if (v5_0 == 3) {
                            int v5_3 = v3_3;
                            int v3_8 = v2_4;
                            this.IB(v1_13);
                            this.m0(v1_13, 0, 0);
                            this.dav(v1_13, 0, v3_8, this.If(), v5_3);
                        } else {
                            if (v5_0 != 4) {
                                throw new kotlin.NoWhenBranchMatchedException();
                            } else {
                                this.IB(v1_13);
                                this.m0(v1_13, 0, 0);
                                this.dav(v1_13, (this.If() - this.Q), v2_4, this.If(), v3_3);
                            }
                        }
                    }
                }
            }
            kotlin.NoWhenBranchMatchedException v1_5 = p19.T();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_5, "getScrapList(...)");
            kotlin.NoWhenBranchMatchedException v1_8 = kotlin.collections.CollectionsKt.toList(v1_5).iterator();
            while (v1_8.hasNext()) {
                HB.PA v2_22 = ((androidx.recyclerview.widget.RecyclerView$VI) v1_8.next());
                this.V(v2_22.itemView);
                p19.R(v2_22.itemView);
            }
        }
        return;
    }

    private final void aL(int p4, int p5, androidx.recyclerview.widget.RecyclerView$Y p6, androidx.recyclerview.widget.RecyclerView$Tn p7)
    {
        int v0_1 = (((this.i(p6, p7) * this.LV) - (this.i6() - this.K)) + this.x1);
        int v1_2 = ((this.X9x * this.P()) / 1000);
        this.dG((this.khl() + p4));
        this.jE = (this.jE + p5);
        if (this.khl() > v1_2) {
            this.dG(v1_2);
        }
        if (this.khl() < 0) {
            this.dG(0);
        }
        if (this.jE > v0_1) {
            this.jE = v0_1;
        }
        if (this.jE < 0) {
            this.jE = 0;
        }
        this.a(p6, p7);
        return;
    }

    private static final kotlin.Unit bo(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p1, android.view.View p2)
    {
        int v2_1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "v");
        if (!(p2 instanceof HB.BM)) {
            v2_1 = 0;
        } else {
            v2_1 = ((HB.BM) p2);
        }
        if (v2_1 != 0) {
            v2_1.hUw(p1.Ly());
        }
        return kotlin.Unit.INSTANCE;
    }

    private static final int c(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p2)
    {
        return p2.FT.getResources().getColor(2131099649, p2.FT.getTheme());
    }

    private final void dG(int p4)
    {
        this.F0.setValue(this, com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.z2f[0], Integer.valueOf(p4));
        return;
    }

    private final android.graphics.Paint ed()
    {
        return ((android.graphics.Paint) this.Z.getValue());
    }

    private static final android.graphics.Paint exh(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p3)
    {
        android.graphics.Paint v0_1 = new android.graphics.Paint();
        v0_1.setColor(p3.h.getColor(kotlin.collections.ArraysKt.indexOf(p3.r8t, 2130968823), -1));
        v0_1.setStyle(android.graphics.Paint$Style.FILL);
        return v0_1;
    }

    private static final android.graphics.Paint fP(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p3)
    {
        android.graphics.Paint v0_1 = new android.graphics.Paint();
        v0_1.setColor(p3.h.getColor(kotlin.collections.ArraysKt.indexOf(p3.r8t, 2130968782), -7829368));
        return v0_1;
    }

    private static final kotlin.Unit hX(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p6, int p7, int p8, android.view.View p9)
    {
        int v9_1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "v");
        if (!(p9 instanceof HB.d)) {
            v9_1 = 0;
        } else {
            v9_1 = ((HB.d) p9);
        }
        int v0_2 = v9_1;
        if (v0_2 != 0) {
            v0_2.j(p6.ss(), p7, p8, p6.Hm, p6.P());
        }
        return kotlin.Unit.INSTANCE;
    }

    private final int i(androidx.recyclerview.widget.RecyclerView$Y p6, androidx.recyclerview.widget.RecyclerView$Tn p7)
    {
        int v0_0 = this.jgN;
        if (v0_0 < 0) {
            int v7_1 = p7.j();
            int v1 = 0;
            int v2_0 = -1;
            while (v1 < v7_1) {
                int v3_2;
                int v3_0 = p6.pM1(v1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v3_0, "getViewForPosition(...)");
                int v3_1 = v3_0.getLayoutParams();
                if (!(v3_1 instanceof com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY)) {
                    v3_2 = 0;
                } else {
                    v3_2 = ((com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY) v3_1);
                }
                int v3_3;
                if (v3_2 == 0) {
                    v3_3 = -1;
                } else {
                    v3_3 = v3_2.q();
                }
                if (v3_3 < 0) {
                    v3_3 = v1;
                }
                v2_0 = Math.max(v2_0, v3_3);
                v1++;
            }
            int v2_1 = (v2_0 + 1);
            this.jgN = v2_1;
            return v2_1;
        } else {
            return v0_0;
        }
    }

    public static synthetic android.graphics.Paint kBB()
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.Kgh();
    }

    public static synthetic String kV()
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.Txi();
    }

    private final int khl()
    {
        return ((Number) this.F0.getValue(this, com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.z2f[0])).intValue();
    }

    public static synthetic String lk(int p0, com.alightcreative.app.motion.scene.SceneBookmark p1, int p2)
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.DQ7(p0, p1, p2);
    }

    public static synthetic int mk(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p0)
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.pG(p0);
    }

    public static synthetic kotlin.Unit oHE(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p0, Runnable p1, Runnable p2)
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.D(p0, p1, p2);
    }

    public static synthetic kotlin.Unit p6(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p0, int p1, int p2, android.view.View p3)
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.hX(p0, p1, p2, p3);
    }

    private static final int pG(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p2)
    {
        return p2.FT.getResources().getColor(2131099649, p2.FT.getTheme());
    }

    public static synthetic android.graphics.Paint qP(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p0)
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.exh(p0);
    }

    public static synthetic android.graphics.Paint r(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p0)
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.D3(p0);
    }

    public static final synthetic Runnable sR(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p0)
    {
        return p0.uM;
    }

    public static synthetic int u(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p0)
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.c(p0);
    }

    public static synthetic String vZO(kotlin.jvm.internal.Ref$IntRef p0, boolean p1)
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.PfB(p0, p1);
    }

    private final android.graphics.Paint xIG()
    {
        return ((android.graphics.Paint) this.Zk.getValue());
    }

    private final android.graphics.Paint yQ()
    {
        return ((android.graphics.Paint) this.hP.getValue());
    }

    private static final String yS(kotlin.jvm.internal.Ref$IntRef p2, com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY p3)
    {
        String v2_1 = p2.element;
        int v3_1 = p3.q();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("fillVisibleChildren layer ");
        v0_1.append(v2_1);
        v0_1.append(" -> ");
        v0_1.append(v3_1);
        return v0_1.toString();
    }

    public static synthetic String yr(kotlin.jvm.internal.Ref$IntRef p0, com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY p1)
    {
        return com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.yS(p0, p1);
    }

    private static final android.graphics.Paint zBL(com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager p2)
    {
        android.graphics.Paint v0_1 = new android.graphics.Paint();
        v0_1.setStyle(android.graphics.Paint$Style.STROKE);
        v0_1.setStrokeWidth((p2.t * 1073741824));
        return v0_1;
    }

    private final android.graphics.Paint ziF()
    {
        return ((android.graphics.Paint) this.b9Y.getValue());
    }

    public final void CR(boolean p4)
    {
        this.Zq.setValue(this, com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.z2f[1], Boolean.valueOf(p4));
        return;
    }

    public final void CiG(java.util.List p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.iVU = p2;
        return;
    }

    public final void Dm(Integer p1)
    {
        this.e = p1;
        return;
    }

    public void EMD(int p5)
    {
        int v0_3 = com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.getSimpleName();
        String v1_1 = this.Sbn(p5);
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("onScrollStateChanged : ");
        v2_1.append(v1_1);
        android.util.Log.d(v0_3, v2_1.toString());
        this.d = p5;
        if (p5 != 1) {
            this.GO = 0;
            this.AM = 0;
        }
        super.EMD(p5);
        return;
    }

    public final void HmS(kotlin.jvm.functions.Function5 p1)
    {
        this.cv = p1;
        return;
    }

    public final int IUr()
    {
        return this.khl();
    }

    public final boolean Ly()
    {
        return ((Boolean) this.Zq.getValue(this, com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.z2f[1])).booleanValue();
    }

    public final int MW()
    {
        return this.jE;
    }

    public final void N9(Integer p1)
    {
        this.w0 = p1;
        return;
    }

    public final void ND(int p2)
    {
        this.mM(com.alightcreative.app.motion.scene.TimeKt.timeFromFrameNumber(p2, this.Hm));
        return;
    }

    public final int P()
    {
        return ((int) (((float) this.za) * this.Z5u));
    }

    public final int Pf(float p2)
    {
        return ((int) (((p2 + ((float) this.jE)) - ((float) this.K)) / ((float) this.LV)));
    }

    public final int RfS()
    {
        return this.LV;
    }

    public final void RlI(kotlin.jvm.functions.Function1 p1)
    {
        this.z = p1;
        return;
    }

    public final void S2(Integer p1)
    {
        this.C = p1;
        return;
    }

    public void S6(androidx.recyclerview.widget.RecyclerView$Y p1, androidx.recyclerview.widget.RecyclerView$Tn p2)
    {
        if ((p1 == null) || (p2 == null)) {
            super.S6(p1, p2);
            return;
        } else {
            this.a(p1, p2);
            return;
        }
    }

    public final void Sr()
    {
        this.jE = 0;
        this.MgY.removeCallbacks(this.uM);
        this.hk();
        return;
    }

    public final void VoX(int p1)
    {
        this.Hm = p1;
        return;
    }

    public final void aR(com.alightcreative.app.motion.activities.edit.widgets.A p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.AI = p2;
        return;
    }

    public com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY aW()
    {
        return new com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager$xfY(0, 0, 0, 0, 0, 0, 60, 0);
    }

    public boolean ak()
    {
        if ((this.nvG) || (this.AM)) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean cD(SO.xfY p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "detector");
        if (this.nvG) {
            if (((int) (((float) this.za) * (this.Z5u * p6.q()))) >= 1) {
                this.Z5u = (this.Z5u * p6.q());
                int v0_7 = (this.R + (((p6.x() - ((float) (this.If() / 2))) + this.R) * (p6.q() - ((float) 1))));
                this.R = v0_7;
                int v0_8 = (v0_7 + (p6.x() - this.Jd));
                this.R = v0_8;
                this.dG(((int) v0_8));
                this.Jd = p6.x();
            } else {
                return 0;
            }
        }
        return 1;
    }

    public void cLW(androidx.recyclerview.widget.RecyclerView p10, android.graphics.Canvas p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p10, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "canvas");
        java.util.Iterator v0_8 = this.C;
        if (v0_8 != null) {
            float v3_8 = this.LV;
            java.util.Iterator v0_3 = (((v0_8.intValue() * v3_8) - this.jE) + this.K);
            java.util.Iterator v0_5 = (((float) v0_3) + 0);
            float v4_4 = (((float) this.If()) + 0);
            float v5_0 = (((float) (v3_8 + v0_3)) + 0);
            android.graphics.Paint v6_1 = new android.graphics.Paint();
            v6_1.setColor(p10.getResources().getColor(2131099722, 0));
            p11.drawRect(0, v0_5, v4_4, v5_0, v6_1);
        }
        java.util.Iterator v0_9 = this.iVU.iterator();
        while (v0_9.hasNext()) {
            int v2_1 = this.LV;
            android.graphics.Canvas v1_11 = (((float) (((((Number) v0_9.next()).intValue() * v2_1) - this.jE) + this.K)) + this.i6);
            p11.drawRect(0, (v1_11 + 0), (((float) this.If()) + 0), ((((float) v2_1) + v1_11) + 0), this.ziF());
        }
        return;
    }

    public void db()
    {
        int v0_3 = com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.getSimpleName();
        String v1_2 = this.Sbn(this.d);
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("onBeginHorizontalScroll : ");
        v2_1.append(v1_2);
        android.util.Log.d(v0_3, v2_1.toString());
        this.GO = 1;
        this.AM = 0;
        return;
    }

    public bridge synthetic androidx.recyclerview.widget.RecyclerView$x e()
    {
        return this.aW();
    }

    public final void eF(int p1)
    {
        this.jE = p1;
        this.hk();
        return;
    }

    public boolean f()
    {
        if ((this.nvG) || ((this.GO) || (((this.hUw() * this.LV) - (this.i6() - this.K)) <= 0))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int ff()
    {
        return com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(((this.khl() * 1000) / this.P()), this.Hm);
    }

    public void iM(androidx.recyclerview.widget.RecyclerView p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "recyclerView");
        super.iM(p2);
        this.jgN = -1;
        return;
    }

    public final void im(float p1)
    {
        this.i6 = p1;
        return;
    }

    public void j(SO.xfY p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "detector");
        this.nvG = 0;
        return;
    }

    public final void mM(int p2)
    {
        this.dG(((p2 * this.P()) / 1000));
        this.MgY.removeCallbacks(this.uM);
        this.hk();
        return;
    }

    public final void nA(Integer p1)
    {
        this.n = p1;
        return;
    }

    public final void nyD(int p1)
    {
        this.X9x = p1;
        return;
    }

    public int pL(int p3, androidx.recyclerview.widget.RecyclerView$Y p4, androidx.recyclerview.widget.RecyclerView$Tn p5)
    {
        int v0 = this.khl();
        if ((p4 == null) || (p5 == null)) {
            return super.pL(p3, p4, p5);
        } else {
            this.aL(p3, 0, p4, p5);
            return (this.khl() - v0);
        }
    }

    public void pM1()
    {
        int v0_3 = com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager.getSimpleName();
        String v1_2 = this.Sbn(this.d);
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("onBeginVerticalScroll : ");
        v2_1.append(v1_2);
        android.util.Log.d(v0_3, v2_1.toString());
        this.GO = 0;
        this.AM = 1;
        return;
    }

    public void q(android.view.MotionEvent p8, boolean p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "e");
        float v9_4 = kotlin.math.MathKt.roundToInt(((((p8.getX() - ((float) (this.If() / 2))) + ((float) this.khl())) * ((float) 1000)) / ((float) this.P())));
        float v0_7 = com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(v9_4, this.Hm);
        kotlin.jvm.functions.Function5 v1 = this.cv;
        if (v1 != null) {
            v1.invoke(p8, Integer.valueOf(v9_4), Integer.valueOf(v0_7), Float.valueOf((p8.getX() / ((float) this.If()))), Float.valueOf((p8.getY() / ((float) this.i6()))));
        }
        return;
    }

    public final int ss()
    {
        return com.alightcreative.app.motion.scene.TimeKt.roundToFrame(((this.khl() * 1000) / this.P()), this.Hm);
    }

    public void w(androidx.recyclerview.widget.RecyclerView p27, android.graphics.Canvas p28)
    {
        com.alightcreative.app.motion.activities.edit.widgets.TimelineLayoutManager v0 = this;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p27, "view");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p28, "canvas");
        float v2_0 = (- ((float) p27.getTop()));
        float v3_9 = ((float) p27.getHeight());
        if ((this.Jm == null) || ((v3_9 != this.cak) || (v2_0 != this.e4D))) {
            this.cak = v3_9;
            this.e4D = v2_0;
            this.Jm = new android.graphics.LinearGradient(0, this.e4D, 0, this.cak, this.BCj(), this.X8(), android.graphics.Shader$TileMode.CLAMP);
        }
        float v3_5;
        this.UU().setShader(this.Jm);
        p28.drawRect(0, 0, ((float) this.If()), ((float) this.K), this.UU());
        float v9_11 = com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(Math.min((((this.khl() + (this.If() / 2)) * 1000) / this.P()), (this.X9x + 1)), this.Hm);
        float v2_1 = HB.gs.hUw(Math.max(1, com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(((this.Bb * 1000) / this.P()), this.Hm)));
        float v3_109 = Math.max(0, com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime((((this.khl() - (this.If() / 2)) * 1000) / this.P()), this.Hm));
        int v11_4 = (v3_109 - (v3_109 % v2_1));
        int v12_0 = ((com.alightcreative.app.motion.scene.TimeKt.differenceFromFrameTime(((this.khl() * 1000) / this.P()), this.Hm) * this.P()) / 1000);
        int v13_0 = this.AI;
        int v14_0 = (v13_0 instanceof com.alightcreative.app.motion.activities.edit.widgets.A$xfY);
        if (v14_0 == 0) {
            v3_5 = 0;
        } else {
            v3_5 = ((com.alightcreative.app.motion.activities.edit.widgets.A$xfY) v13_0);
        }
        float v3_8;
        if (v3_5 == 0) {
            v3_8 = kotlin.collections.SetsKt.emptySet();
        } else {
            v3_8 = v3_5.j();
            if (v3_8 == 0) {
            }
        }
        float v4_3;
        if (v14_0 == 0) {
            v4_3 = 0;
        } else {
            v4_3 = ((com.alightcreative.app.motion.activities.edit.widgets.A$xfY) v13_0);
        }
        float v4_5;
        if (v4_3 == 0) {
            v4_5 = kotlin.collections.SetsKt.emptySet();
        } else {
            v4_5 = v4_3.hUw();
            if (v4_5 == 0) {
            }
        }
        android.graphics.Paint v5_1 = new java.util.LinkedHashSet();
        if (v2_1 <= 0) {
            Integer v24_0 = v2_1;
            float v2_3 = new StringBuilder();
            v2_3.append("Step must be positive, was: ");
            v2_3.append(v24_0);
            v2_3.append(".");
            throw new IllegalArgumentException(v2_3.toString());
        } else {
            HB.eWj v23_0;
            java.util.Set v22_0;
            android.graphics.RectF v6_0 = kotlin.internal.ProgressionUtilKt.getProgressionLastElement(v11_4, v9_11, v2_1);
            int v17_0 = 2;
            if (v11_4 > v6_0) {
                v23_0 = v13_0;
                v22_0 = v14_0;
            } else {
                float v8_0 = v11_4;
                while(true) {
                    float v7_9;
                    String v15_1 = com.alightcreative.app.motion.scene.TimeKt.timeFromFrameNumber(v8_0, this.Hm);
                    int v10_3 = (((float) ((v15_1 * this.P()) / 1000)) + ((float) (this.If() / 2)));
                    float v7_2 = this.khl();
                    java.util.LinkedHashSet v20_2 = (v8_0 * 100);
                    float v7_6 = this.Hm;
                    if ((v20_2 % v7_6) != 0) {
                        if ((v20_2 % (v7_6 / 2)) != 0) {
                            v7_9 = this.Yd;
                        } else {
                            v7_9 = this.e0E;
                        }
                    } else {
                        v7_9 = this.rs;
                    }
                    java.util.LinkedHashSet v20_3 = ((v10_3 - ((float) v7_2)) + ((float) v12_0));
                    v22_0 = v14_0;
                    HB.eWj v23_1 = this.t;
                    Integer v24_1 = v2_1;
                    v23_0 = v13_0;
                    this.tEh.set((v20_3 - v23_1), 0, (v20_3 + v23_1), v7_9);
                    if (!v4_5.contains(Integer.valueOf(v8_0))) {
                        if (!v3_8.contains(Integer.valueOf(v8_0))) {
                            float v2_11 = this.e;
                            if ((v2_11 != 0) && (this.n != null)) {
                                float v2_12;
                                if (v2_11 == 0) {
                                    v2_12 = 0;
                                } else {
                                    v2_12 = v2_11.intValue();
                                }
                                if (v15_1 >= v2_12) {
                                    float v2_14;
                                    float v2_13 = this.n;
                                    if (v2_13 == 0) {
                                        v2_14 = 0;
                                    } else {
                                        v2_14 = v2_13.intValue();
                                    }
                                    if (v15_1 <= v2_14) {
                                        p28.drawRect(this.tEh, this.yQ());
                                        float v7_13 = this.t;
                                        this.tEh.set((v20_3 - v7_13), 0, (v20_3 + v7_13), (v7_13 * 1073741824));
                                        float v2_19 = this.yQ().getColor();
                                        this.yQ().setColor(1442503009);
                                        p28.drawRect(this.tEh, this.yQ());
                                        this.yQ().setColor(v2_19);
                                        if (v8_0 == v6_0) {
                                            break;
                                        }
                                        v8_0 += v24_1;
                                        v14_0 = v22_0;
                                        v13_0 = v23_0;
                                        v2_1 = v24_1;
                                    }
                                }
                            }
                            p28.drawRect(this.tEh, this.yQ());
                        } else {
                            float v2_21 = this.yQ().getColor();
                            this.yQ().setColor(-1);
                            p28.drawRect(this.tEh, this.yQ());
                            this.yQ().setColor(v2_21);
                            v5_1.add(Integer.valueOf(v8_0));
                        }
                    } else {
                        float v2_24 = this.yQ().getColor();
                        this.yQ().setColor(-16711768);
                        p28.drawRect(this.tEh, this.yQ());
                        this.yQ().setColor(v2_24);
                        v5_1.add(Integer.valueOf(v8_0));
                    }
                }
            }
            float v7_25 = this.LX();
            float v8_1 = this.M.entrySet().iterator();
            while (v8_1.hasNext()) {
                java.util.LinkedHashSet v20_4;
                String v15_3;
                float v8_9;
                int v14_5;
                float v2_113 = ((java.util.Map$Entry) v8_1.next());
                int v10_30 = ((Number) v2_113.getKey()).intValue();
                float v2_115 = ((com.alightcreative.app.motion.scene.SceneBookmark) v2_113.getValue());
                android.graphics.RectF v6_51 = com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(v10_30, this.Hm);
                fx.Enc.H(this, new HB.eWj(v10_30, v2_115, v6_51));
                if ((v11_4 > v6_51) || (v6_51 > v9_11)) {
                    v15_3 = v3_8;
                    v14_5 = v4_5;
                    v20_4 = v8_1;
                    v8_9 = v5_1;
                } else {
                    float v3_107;
                    android.graphics.RectF v6_57 = (((((com.alightcreative.app.motion.scene.TimeKt.timeFromFrameNumber(v6_51, this.Hm) * this.P()) / 1000) + (this.If() / 2)) - this.khl()) + v12_0);
                    this.BG().setColor(v7_25[(v2_115.getAppearance() % this.length)]);
                    this.BG().setAlpha(150);
                    int v13_23 = ((float) v6_57);
                    float v2_121 = (v13_23 + 0);
                    v15_3 = v3_8;
                    v20_4 = v8_1;
                    v8_9 = v5_1;
                    v14_5 = v4_5;
                    p28.drawLine(v2_121, 0, v2_121, ((float) this.K), this.BG());
                    this.BG().setAntiAlias(1);
                    if (com.alightcreative.app.motion.scene.TimeKt.roundToFrame(v0.ss(), v0.Hm) != com.alightcreative.app.motion.scene.TimeKt.roundToFrame(v10_30, this.Hm)) {
                        v3_107 = (this.XA * ((float) v17_0));
                    } else {
                        v3_107 = (this.XA * ((float) 4));
                    }
                    this.ST5.reset();
                    this.ST5.moveTo(v2_121, 0);
                    this.ST5.lineTo(v2_121, (this.XA * ((float) 5)));
                    this.ST5.lineTo((v13_23 - v3_107), (this.XA * ((float) 5)));
                    this.ST5.lineTo(v2_121, this.XA);
                    this.ST5.close();
                    this.BG().setAlpha(255);
                    this.BG().setStyle(android.graphics.Paint$Style.FILL);
                    p28.drawPath(this.ST5, this.BG());
                }
                v5_1 = v8_9;
                v4_5 = v14_5;
                v3_8 = v15_3;
                v8_1 = v20_4;
                v17_0 = 2;
            }
            float v2_30;
            String v15_2 = v3_8;
            int v14_4 = v4_5;
            float v8_2 = v5_1;
            float v2_29 = this.e;
            if (v2_29 == 0) {
                v2_30 = 0;
            } else {
                v2_30 = v2_29.intValue();
            }
            if (v2_30 > 0) {
                float v2_35;
                this.BG().setColor(-1426400927);
                float v2_34 = this.e;
                if (v2_34 == 0) {
                    v2_35 = 0;
                } else {
                    v2_35 = v2_34.intValue();
                }
                float v2_43 = (((((float) ((com.alightcreative.app.motion.scene.TimeKt.timeFromFrameNumber(com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(v2_35, this.Hm), this.Hm) * this.P()) / 1000)) + ((float) (this.If() / 2))) - ((float) this.khl())) + ((float) v12_0));
                float v4_12 = v2_43;
                p28.drawLine(((this.Yd / ((float) 2)) + v2_43), 0, v4_12, 0, this.BG());
                p28.drawLine(v4_12, 0, v4_12, (v0.Yd * 1073741824), v0.BG());
            } else {
                float v2_32;
                float v2_31 = this.n;
                if (v2_31 == 0) {
                    v2_32 = 0;
                } else {
                    v2_32 = v2_31.intValue();
                }
                if (v2_32 > 0) {
                }
            }
            android.graphics.Paint v1_6;
            android.graphics.Paint v1_5 = this.n;
            if (v1_5 == null) {
                v1_6 = 0;
            } else {
                v1_6 = v1_5.intValue();
            }
            if (v1_6 > null) {
                android.graphics.Paint v1_9;
                this.BG().setColor(-1426400927);
                android.graphics.Paint v1_8 = this.n;
                if (v1_8 == null) {
                    v1_9 = 0;
                } else {
                    v1_9 = v1_8.intValue();
                }
                float v2_56 = (((float) v12_0) + ((((float) ((com.alightcreative.app.motion.scene.TimeKt.timeFromFrameNumber(com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(v1_9, this.Hm), this.Hm) * this.P()) / 1000)) + ((float) (this.If() / 2))) - ((float) this.khl())));
                float v4_14 = v2_56;
                p28.drawLine((v2_56 - (this.Yd / ((float) 2))), 0, v4_14, 0, this.BG());
                p28.drawLine(v4_14, 0, v4_14, (this.Yd * 1073741824), this.BG());
            }
            android.graphics.Paint v1_24;
            android.graphics.Paint v1_23 = this.w0;
            if (v1_23 == null) {
                v1_24 = -1;
            } else {
                v1_24 = v1_23.intValue();
            }
            android.graphics.Paint v1_25;
            if (v1_24 <= -1) {
                v1_25 = p28;
            } else {
                android.graphics.Paint v1_27;
                android.graphics.Paint v1_26 = this.w0;
                if (v1_26 == null) {
                    v1_27 = 0;
                } else {
                    v1_27 = v1_26.intValue();
                }
                android.graphics.Paint v1_28 = com.alightcreative.app.motion.scene.TimeKt.frameNumberFromTime(v1_27, this.Hm);
                this.BG().setColor(-957050);
                float v9_2 = (((((float) ((com.alightcreative.app.motion.scene.TimeKt.timeFromFrameNumber(v1_28, this.Hm) * this.P()) / 1000)) + ((float) (this.If() / 2))) - ((float) this.khl())) + ((float) v12_0));
                android.graphics.Paint v1_35 = this.Yd;
                v1_25 = p28;
                p28.drawLine((v9_2 - (v1_35 / ((float) 2))), 0, (v9_2 + (v1_35 / ((float) 2))), 0, this.BG());
                p28.drawLine(v9_2, 0, v9_2, v0.Yd, v0.BG());
            }
            float v2_75 = com.alightcreative.app.motion.activities.edit.widgets.A$CU.hUw;
            float v3_35 = v23_0;
            if ((v3_35 == v2_75) || (v22_0 != null)) {
                float v4_23;
                float v4_20 = com.alightcreative.app.motion.scene.TimeKt.roundToFrame(this.ss(), this.Hm);
                android.graphics.Paint v5_14 = this.FT.getResources();
                if (!this.M.containsKey(Integer.valueOf(v4_20))) {
                    v4_23 = 2131231722;
                } else {
                    v4_23 = 2131231723;
                }
                float v4_24 = v5_14.getDrawable(v4_23, 0);
                android.graphics.Paint v5_16 = com.alightcreative.app.motion.scene.TimeKt.formatFrameNumber(v0.ff(), v0.Hm, "mm:ss:ff");
                android.graphics.RectF v6_13 = new android.graphics.Rect();
                this.xIG().getTextBounds(v5_16, 0, (v5_16.length() - 1), v6_13);
                v4_24.setBounds(((v0.If() / 2) - (v0.J / 2)), ((int) (this.v5 - this.XA)), ((this.If() / 2) + (this.J / 2)), ((int) (((this.v5 + ((float) v6_13.height())) - (this.D1 * ((float) 2))) + this.XA)));
                v4_24.draw(v1_25);
                v1_25.drawText(v5_16, (((float) this.If()) / 1073741824), ((this.v5 + this.oiZ) + this.D1), this.xIG());
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(v3_35, v2_75)) {
                if (v22_0 == null) {
                    if (!(v3_35 instanceof com.alightcreative.app.motion.activities.edit.widgets.A$A)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    } else {
                        float v2_90 = (((((float) ((com.alightcreative.app.motion.scene.TimeKt.timeFromFrameNumber(((com.alightcreative.app.motion.activities.edit.widgets.A$A) v3_35).hUw(), this.Hm) * this.P()) / 1000)) + ((float) (this.If() / 2))) - ((float) this.khl())) + ((float) v12_0));
                        float v3_48 = (v0.v5 + v0.oiZ);
                        v1_25.save();
                        float v3_50 = (v3_48 / 1073741824);
                        v1_25.scale((v3_48 / this.lU.height()), (v3_48 / this.lU.height()), v2_90, v3_50);
                        float v4_32 = this.lU;
                        float v4_35 = this.lU;
                        v1_25.translate(((v2_90 - v4_32.left) - (v4_32.width() / 1073741824)), ((v3_50 - v4_35.top) - (v4_35.height() / 1073741824)));
                        v1_25.drawPath(this.g2, this.ed());
                        v1_25.restore();
                        return;
                    }
                } else {
                    float v2_94 = kotlin.collections.SetsKt.minus(v14_4, v8_2);
                    float v3_56 = kotlin.collections.SetsKt.minus(kotlin.collections.SetsKt.minus(v15_2, ((Iterable) v14_4)), v8_2);
                    float v4_41 = this.yQ().getColor();
                    this.yQ().setColor(-1);
                    float v3_57 = v3_56.iterator();
                    while (v3_57.hasNext()) {
                        android.graphics.Paint v5_38;
                        android.graphics.Paint v5_35 = ((Number) v3_57.next()).intValue();
                        android.graphics.RectF v6_43 = (((((float) ((com.alightcreative.app.motion.scene.TimeKt.timeFromFrameNumber(v5_35, this.Hm) * this.P()) / 1000)) + ((float) (this.If() / 2))) - ((float) this.khl())) + ((float) v12_0));
                        android.graphics.Paint v5_36 = (v5_35 * 100);
                        float v7_37 = this.Hm;
                        if ((v5_36 % v7_37) != 0) {
                            if ((v5_36 % (v7_37 / 2)) != 0) {
                                v5_38 = this.Yd;
                            } else {
                                v5_38 = this.e0E;
                            }
                        } else {
                            v5_38 = this.rs;
                        }
                        float v8_7 = this.t;
                        this.tEh.set((v6_43 - v8_7), 0, (v6_43 + v8_7), v5_38);
                        v1_25.drawRect(this.tEh, this.yQ());
                    }
                    this.yQ().setColor(-16711768);
                    float v2_96 = v2_94.iterator();
                    while (v2_96.hasNext()) {
                        float v3_78;
                        float v3_73 = ((Number) v2_96.next()).intValue();
                        android.graphics.Paint v5_30 = (((((float) ((com.alightcreative.app.motion.scene.TimeKt.timeFromFrameNumber(v3_73, this.Hm) * this.P()) / 1000)) + ((float) (this.If() / 2))) - ((float) this.khl())) + ((float) v12_0));
                        float v3_75 = (v3_73 * 100);
                        android.graphics.RectF v6_33 = this.Hm;
                        if ((v3_75 % v6_33) != 0) {
                            if ((v3_75 % (v6_33 / 2)) != 0) {
                                v3_78 = this.Yd;
                            } else {
                                v3_78 = this.e0E;
                            }
                        } else {
                            v3_78 = this.rs;
                        }
                        float v7_29 = this.t;
                        this.tEh.set((v5_30 - v7_29), 0, (v5_30 + v7_29), v3_78);
                        v1_25.drawRect(this.tEh, this.yQ());
                    }
                    this.yQ().setColor(v4_41);
                    float v2_101 = ((((float) this.If()) / 1073741824) - ((float) (this.f / 2)));
                    float v7_27 = this.ed().getColor();
                    float v3_65 = this.ed();
                    v3_65.setAlpha((v3_65.getAlpha() / 2));
                    v1_25.drawRect(v2_101, 0, (v2_101 + ((float) this.f)), this.v5, this.ed());
                    p28.drawRect(v2_101, (this.oiZ + this.v5), (v2_101 + ((float) this.f)), ((float) this.i6()), this.ed());
                    this.ed().setColor(v7_27);
                    return;
                }
            } else {
                float v2_111 = ((((float) this.If()) / 1073741824) - ((float) (this.f / 2)));
                float v8_8 = this.ed().getColor();
                float v3_86 = com.alightcreative.app.motion.scene.TimeKt.roundToFrame(this.ss(), this.Hm);
                if (this.M.containsKey(Integer.valueOf(v3_86))) {
                    int v10_28;
                    float v4_49 = this.ed();
                    float v3_89 = ((com.alightcreative.app.motion.scene.SceneBookmark) this.M.get(Integer.valueOf(v3_86)));
                    if (v3_89 == 0) {
                        v10_28 = 0;
                    } else {
                        v10_28 = v3_89.getAppearance();
                    }
                    v4_49.setColor(v7_25[(v10_28 % v7_25.length)]);
                }
                v1_25.drawRect(v2_111, 0, (v2_111 + ((float) this.f)), this.v5, this.ed());
                p28.drawRect(v2_111, ((this.v5 + this.oiZ) - this.D1), (v2_111 + ((float) this.f)), ((float) this.i6()), this.ed());
                this.ed().setColor(v8_8);
                return;
            }
        }
    }

    public boolean x(SO.xfY p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "detector");
        this.nvG = 1;
        this.R = ((float) this.khl());
        this.Jd = p3.x();
        return 1;
    }

    public final void y(java.util.Map p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.M = p2;
        return;
    }

    public int ygC(int p3, androidx.recyclerview.widget.RecyclerView$Y p4, androidx.recyclerview.widget.RecyclerView$Tn p5)
    {
        int v0 = this.jE;
        if ((p4 == null) || (p5 == null)) {
            return super.ygC(p3, p4, p5);
        } else {
            this.aL(0, p3, p4, p5);
            return (this.jE - v0);
        }
    }

    public void yy(androidx.recyclerview.widget.RecyclerView$c p1, androidx.recyclerview.widget.RecyclerView$c p2)
    {
        int v2_1;
        super.yy(p1, p2);
        if (!(p2 instanceof xT.WM)) {
            v2_1 = 0;
        } else {
            v2_1 = ((xT.WM) p2);
        }
        this.ToE = v2_1;
        return;
    }
}
