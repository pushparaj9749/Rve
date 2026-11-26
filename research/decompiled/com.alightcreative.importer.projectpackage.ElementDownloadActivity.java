package com.alightcreative.importer.projectpackage;
public final class ElementDownloadActivity extends com.alightcreative.importer.projectpackage.xfY {
    private final com.alightcreative.importer.projectpackage.ElementDownloadActivity$xfY E;
    private nVu.D H;
    public Vbv.c T;
    public TV.n X;
    private final com.alightcreative.importer.projectpackage.ElementDownloadActivity$A ah;
    public EY.XSt db;
    public nwt.A l;
    public ns.h w;

    static ElementDownloadActivity()
    {
        return;
    }

    public ElementDownloadActivity()
    {
        this.E = new com.alightcreative.importer.projectpackage.ElementDownloadActivity$xfY(this);
        this.ah = new com.alightcreative.importer.projectpackage.ElementDownloadActivity$A(this);
        return;
    }

    public static synthetic void Zk(com.alightcreative.importer.projectpackage.ElementDownloadActivity p0, android.view.View p1)
    {
        com.alightcreative.importer.projectpackage.ElementDownloadActivity.g2(p0, p1);
        return;
    }

    public static synthetic void b9Y(com.alightcreative.importer.projectpackage.ElementDownloadActivity p0)
    {
        com.alightcreative.importer.projectpackage.ElementDownloadActivity.lU(p0);
        return;
    }

    private static final void g2(com.alightcreative.importer.projectpackage.ElementDownloadActivity p0, android.view.View p1)
    {
        p0.finish();
        return;
    }

    private static final void lU(com.alightcreative.importer.projectpackage.ElementDownloadActivity p0)
    {
        android.webkit.WebView v0_1 = p0.H;
        if (v0_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v0_1 = 0;
        }
        v0_1.cD.reload();
        return;
    }

    public static final synthetic nVu.D tEh(com.alightcreative.importer.projectpackage.ElementDownloadActivity p0)
    {
        return p0.H;
    }

    public final ns.h QR()
    {
        int v0_0 = this.w;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("getAlightSettingsUseCase");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final TV.n S()
    {
        int v0_0 = this.X;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final Vbv.c ST5()
    {
        int v0_0 = this.T;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("iapManager");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final EY.XSt Z()
    {
        int v0_0 = this.db;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("crisperManager");
            return 0;
        } else {
            return v0_0;
        }
    }

    public final nwt.A hsj()
    {
        int v0_0 = this.l;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("injet");
            return 0;
        } else {
            return v0_0;
        }
    }

    public void onBackPressed()
    {
        android.webkit.WebView v0_0 = this.H;
        nVu.D v1 = 0;
        String v2 = zkP.EA.UXGujvGg.GfsThDvZc;
        if (v0_0 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(v2);
            v0_0 = 0;
        }
        if (!v0_0.cD.canGoBack()) {
            super.onBackPressed();
            return;
        } else {
            android.webkit.WebView v0_1 = this.H;
            if (v0_1 != null) {
                v1 = v0_1;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(v2);
            }
            v1.cD.goBack();
            return;
        }
    }

    protected void onCreate(android.os.Bundle p5)
    {
        super.onCreate(p5);
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout v5_1 = nVu.D.cD(this.getLayoutInflater());
        this.H = v5_1;
        pg.A v0_0 = 0;
        if (v5_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v5_1 = 0;
        }
        this.setContentView(v5_1.j());
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout v5_3 = this.H;
        if (v5_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v5_3 = 0;
        }
        v5_3.cD.getSettings().setJavaScriptEnabled(1);
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout v5_7 = this.H;
        if (v5_7 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v5_7 = 0;
        }
        v5_7.cD.setWebChromeClient(this.E);
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout v5_9 = this.H;
        if (v5_9 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v5_9 = 0;
        }
        v5_9.cD.setWebViewClient(this.ah);
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout v5_11 = this.H;
        if (v5_11 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v5_11 = 0;
        }
        v5_11.X.setRefreshing(1);
        if (!com.alightcreative.app.motion.persist.xfY.INSTANCE.getStagingFeed()) {
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout v5_15 = this.H;
            if (v5_15 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v5_15 = 0;
            }
            v5_15.cD.loadUrl(hZI.Qa.zNFTGVmSfnI.UbKlEl);
        } else {
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout v5_17 = this.H;
            if (v5_17 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v5_17 = 0;
            }
            v5_17.cD.loadUrl("https://alight-creative-staging.firebaseapp.com/elements?embed=true");
        }
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout v5_19 = this.H;
        if (v5_19 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v5_19 = 0;
        }
        v5_19.x.setIndeterminate(0);
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout v5_21 = this.H;
        if (v5_21 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v5_21 = 0;
        }
        v5_21.R6.setOnClickListener(new pg.xfY(this));
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout v5_23 = this.H;
        if (v5_23 != null) {
            v0_0 = v5_23;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v0_0.X.setOnRefreshListener(new pg.A(this));
        return;
    }
}
