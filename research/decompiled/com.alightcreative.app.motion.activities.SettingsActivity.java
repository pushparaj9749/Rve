package com.alightcreative.app.motion.activities;
public final class SettingsActivity extends com.alightcreative.app.motion.activities.H6m {
    private nVu.uZ5 H;

    static SettingsActivity()
    {
        return;
    }

    public SettingsActivity()
    {
        return;
    }

    private static final void Zk(com.alightcreative.app.motion.activities.SettingsActivity p0, android.view.View p1)
    {
        p0.finish();
        return;
    }

    public static synthetic void b9Y(com.alightcreative.app.motion.activities.SettingsActivity p0, android.view.View p1)
    {
        com.alightcreative.app.motion.activities.SettingsActivity.Zk(p0, p1);
        return;
    }

    protected void onCreate(android.os.Bundle p4)
    {
        super.onCreate(p4);
        androidx.fragment.app.eWj v4_1 = nVu.uZ5.cD(this.getLayoutInflater());
        this.H = v4_1;
        int v0_0 = 0;
        if (v4_1 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v4_1 = 0;
        }
        this.setContentView(v4_1.j());
        androidx.fragment.app.eWj v4_3 = this.H;
        if (v4_3 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
            v4_3 = 0;
        }
        v4_3.j.setOnClickListener(new com.alightcreative.app.motion.activities.lI(this));
        androidx.fragment.app.eWj v4_7 = this.getSupportFragmentManager().FT();
        nVu.uZ5 v2_2 = this.H;
        if (v2_2 != null) {
            v0_0 = v2_2;
        } else {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        v4_7.FT(v0_0.R6.getId(), new ok.N()).uKP();
        return;
    }
}
