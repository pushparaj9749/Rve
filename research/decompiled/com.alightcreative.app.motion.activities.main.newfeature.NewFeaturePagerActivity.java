package com.alightcreative.app.motion.activities.main.newfeature;
public final class NewFeaturePagerActivity extends com.alightcreative.app.motion.activities.main.newfeature.xfY {
    public static final int T;
    public static final com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity$xfY X;
    private nVu.f2 H;

    static NewFeaturePagerActivity()
    {
        com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity.X = new com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity$xfY(0);
        com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity.T = 8;
        return;
    }

    public NewFeaturePagerActivity()
    {
        return;
    }

    private static final void QR(com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity p0, android.view.View p1)
    {
        p0.tEh();
        return;
    }

    private static final void S(com.google.android.material.tabs.TabLayout$cY p0, int p1)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "<unused var>");
        return;
    }

    private final java.util.List Z()
    {
        int v0_1;
        if (android.os.Build$VERSION.SDK_INT < 33) {
            v0_1 = this.getIntent().getParcelableArrayListExtra("NEW_FEATURE_INFO_LIST_KEY");
        } else {
            v0_1 = nMQ.XSt.hUw(this.getIntent(), "NEW_FEATURE_INFO_LIST_KEY", com.alightcreative.app.motion.activities.main.newfeature.NewFeatureInfo);
        }
        if (v0_1 == 0) {
            return 0;
        } else {
            return kotlin.collections.CollectionsKt.toList(v0_1);
        }
    }

    public static synthetic void Zk(com.google.android.material.tabs.TabLayout$cY p0, int p1)
    {
        com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity.S(p0, p1);
        return;
    }

    public static synthetic void b9Y(com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity.QR(p0, p1);
        return;
    }

    protected void onCreate(android.os.Bundle p7)
    {
        super.onCreate(p7);
        androidx.appcompat.widget.AppCompatImageButton v7_1 = nVu.f2.cD(this.getLayoutInflater());
        this.H = v7_1;
        nVu.f2 v1 = 0;
        if (v7_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v7_1 = 0;
        }
        this.setContentView(v7_1.j());
        androidx.appcompat.widget.AppCompatImageButton v7_3 = this.Z();
        if (v7_3 != null) {
            com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity$CU v2_0 = this.H;
            if (v2_0 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v2_0 = 0;
            }
            com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity$CU v2_1 = v2_0.x;
            nMQ.V v4_0 = this.getSupportFragmentManager();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_0, "getSupportFragmentManager(...)");
            v2_1.setAdapter(new com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity$A(this, v4_0, this.getLifecycle(), v7_3));
            androidx.appcompat.widget.AppCompatImageButton v7_5 = this.H;
            if (v7_5 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v7_5 = 0;
            }
            v7_5.x.uKP(0, 0);
            androidx.appcompat.widget.AppCompatImageButton v7_7 = this.H;
            if (v7_7 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v7_7 = 0;
            }
            v7_7.x.setPageTransformer(0);
            androidx.appcompat.widget.AppCompatImageButton v7_9 = this.H;
            if (v7_9 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v7_9 = 0;
            }
            v7_9.x.setOffscreenPageLimit(2);
            androidx.appcompat.widget.AppCompatImageButton v7_11 = this.H;
            if (v7_11 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v7_11 = 0;
            }
            v7_11.x.requestDisallowInterceptTouchEvent(0);
            androidx.appcompat.widget.AppCompatImageButton v7_13 = this.H;
            if (v7_13 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v7_13 = 0;
            }
            v7_13.x.setUserInputEnabled(1);
            com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity$CU v2_4 = this.H;
            if (v2_4 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v2_4 = 0;
            }
            com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity$CU v2_5 = v2_4.cD;
            androidx.viewpager2.widget.ViewPager2 v3_3 = this.H;
            if (v3_3 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v3_3 = 0;
            }
            new com.google.android.material.tabs.h(v2_5, v3_3.x, new nMQ.V()).hUw();
            androidx.appcompat.widget.AppCompatImageButton v7_17 = this.H;
            if (v7_17 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
                v7_17 = 0;
            }
            androidx.appcompat.widget.AppCompatImageButton v7_18 = v7_17.x;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_18, gih.bO.fZZztnsYAaL.eiuAezGaar);
            v7_18.H(new com.alightcreative.app.motion.activities.main.newfeature.NewFeaturePagerActivity$CU(v7_18));
            androidx.appcompat.widget.AppCompatImageButton v7_19 = this.H;
            if (v7_19 != null) {
                v1 = v7_19;
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            }
            v1.j.setOnClickListener(new nMQ.cY(this));
            return;
        } else {
            this.tEh();
            return;
        }
    }

    public final void tEh()
    {
        this.finish();
        return;
    }
}
