package com.alightcreative.importer.xml.ui;
public final class ImportActivity extends com.alightcreative.importer.xml.ui.xfY {
    private final kotlin.Lazy H;

    static ImportActivity()
    {
        return;
    }

    public ImportActivity()
    {
        this.H = new androidx.lifecycle.bV(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.alightcreative.importer.xml.ui.CU), new com.alightcreative.importer.xml.ui.ImportActivity$CU(this), new com.alightcreative.importer.xml.ui.ImportActivity$A(this), new com.alightcreative.importer.xml.ui.ImportActivity$h(0, this));
        return;
    }

    private static final kotlin.Unit S(com.alightcreative.importer.xml.ui.ImportActivity p0, com.alightcreative.importer.xml.ui.CU p1, int p2, S1F.Enc p3, int p4)
    {
        p0.tEh(p1, p3, S1F.lX.hUw((p2 | 1)));
        return kotlin.Unit.INSTANCE;
    }

    private static final kotlin.Unit Z(com.alightcreative.importer.xml.ui.ImportActivity p2, com.alightcreative.importer.xml.ui.A p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "action");
        if (!(p3 instanceof com.alightcreative.importer.xml.ui.A$A)) {
            if (!(p3 instanceof com.alightcreative.importer.xml.ui.A$xfY)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                android.widget.Toast.makeText(p2, ((com.alightcreative.importer.xml.ui.A$xfY) p3).hUw(), 1).show();
                p2.finish();
            }
        } else {
            String v0_2 = ((com.alightcreative.importer.xml.ui.A$A) p3).hUw();
            if (v0_2 == null) {
                v0_2 = String.valueOf(((com.alightcreative.importer.xml.ui.A$A) p3).j());
            }
            android.widget.Toast.makeText(p2, v0_2, 1).show();
            p2.finish();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic kotlin.Unit Zk(com.alightcreative.importer.xml.ui.ImportActivity p0, com.alightcreative.importer.xml.ui.CU p1, int p2, S1F.Enc p3, int p4)
    {
        return com.alightcreative.importer.xml.ui.ImportActivity.S(p0, p1, p2, p3, p4);
    }

    public static synthetic kotlin.Unit b9Y(com.alightcreative.importer.xml.ui.ImportActivity p0, com.alightcreative.importer.xml.ui.A p1)
    {
        return com.alightcreative.importer.xml.ui.ImportActivity.Z(p0, p1);
    }

    public final com.alightcreative.importer.xml.ui.CU QR()
    {
        return ((com.alightcreative.importer.xml.ui.CU) this.H.getValue());
    }

    protected void onCreate(android.os.Bundle p8)
    {
        int v1_2;
        super.onCreate(p8);
        w9w.j.j(this.getWindow(), 0);
        int v1_5 = this.getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_5, "getWindow(...)");
        FKt.Nrb.j(v1_5, 0, this.getColor(2131099665), 0, 4, 0);
        int v1_0 = 1;
        String v0_1 = 0;
        m.xfY.j(this, 0, R.h.j(-661888616, v1_0, new com.alightcreative.importer.xml.ui.ImportActivity$xfY(this)), v1_0, 0);
        com.alightcreative.importer.xml.ui.CU v8_6 = this.QR();
        int v1_1 = this.getIntent();
        if (v1_1 == 0) {
            int v1_4 = this.getIntent().getParcelableExtra("android.intent.extra.STREAM");
            if (!(v1_4 instanceof android.net.Uri)) {
                v1_2 = 0;
            } else {
                v1_2 = ((android.net.Uri) v1_4);
            }
        } else {
            v1_2 = v1_1.getData();
            if (v1_2 == 0) {
            }
        }
        android.content.Intent v2_3 = this.getIntent();
        if (v2_3 != null) {
            v0_1 = v2_3.getType();
        }
        v8_6.l(v1_2, v0_1);
        return;
    }

    public final void tEh(com.alightcreative.importer.xml.ui.CU p5, S1F.Enc p6, int p7)
    {
        kotlin.jvm.functions.Function1 v1_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "viewModel");
        S1F.uPt v6_1 = p6.ojl(1509840832);
        if ((p7 & 6) != 0) {
            v1_2 = p7;
        } else {
            kotlin.jvm.functions.Function1 v1_0;
            if ((p7 & 8) != 0) {
                v1_0 = v6_1.nvG(p5);
            } else {
                v1_0 = v6_1.w0(p5);
            }
            kotlin.jvm.functions.Function1 v1_1;
            if (v1_0 == null) {
                v1_1 = 2;
            } else {
                v1_1 = 4;
            }
            v1_2 = (v1_1 | p7);
        }
        if ((p7 & 48) == 0) {
            int v2_2;
            if (!v6_1.nvG(this)) {
                v2_2 = 16;
            } else {
                v2_2 = 32;
            }
            v1_2 |= v2_2;
        }
        if (((v1_2 & 19) == 18) && (v6_1.uKP())) {
            v6_1.cv();
        } else {
            if (S1F.Zv9.X9x()) {
                S1F.Zv9.AM(1509840832, v1_2, -1, "com.alightcreative.importer.xml.ui.ImportActivity.ImportActivityContent (ImportActivity.kt:43)");
            }
            boolean v0_5 = ((com.alightcreative.importer.xml.ui.h) oD.A.hUw(p5.cD(), v6_1, 0).getValue());
            v6_1.AI(930415975);
            if (!(v0_5 instanceof com.alightcreative.importer.xml.ui.h$xfY)) {
                if (v0_5) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            } else {
                Kr.XSt.j(0, 0, v6_1, 0, 3);
            }
            v6_1.d();
            v6_1.AI(930422449);
            boolean v0_8 = v6_1.nvG(this);
            kotlin.jvm.functions.Function1 v1_5 = v6_1.x1();
            if ((v0_8) || (v1_5 == S1F.Enc.hUw.hUw())) {
                v1_5 = new CsE.xfY(this);
                v6_1.FT(v1_5);
            }
            kotlin.jvm.functions.Function1 v1_7 = ((kotlin.jvm.functions.Function1) v1_5);
            v6_1.d();
            VVv.XSt.x(p5, this, v1_7);
            if (S1F.Zv9.X9x()) {
                S1F.Zv9.GO();
            }
        }
        S1F.uPt v6_2 = v6_1.db();
        if (v6_2 != null) {
            v6_2.hUw(new CsE.A(this, p5, p7));
        }
        return;
    }
}
