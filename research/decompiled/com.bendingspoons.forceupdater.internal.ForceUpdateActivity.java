package com.bendingspoons.forceupdater.internal;
public final class ForceUpdateActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final com.bendingspoons.forceupdater.internal.ForceUpdateActivity$xfY j;

    static ForceUpdateActivity()
    {
        com.bendingspoons.forceupdater.internal.ForceUpdateActivity.j = new com.bendingspoons.forceupdater.internal.ForceUpdateActivity$xfY(0);
        return;
    }

    public ForceUpdateActivity()
    {
        return;
    }

    protected void onCreate(android.os.Bundle p3)
    {
        super.onCreate(p3);
        m.xfY.j(this, 0, R.h.j(1523102345, 1, new com.bendingspoons.forceupdater.internal.ForceUpdateActivity$A(this, this.getIntent().getBooleanExtra("key-is-update-forced", 0))), 1, 0);
        return;
    }
}
