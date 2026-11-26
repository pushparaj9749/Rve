package com.alightcreative.app.motion.activities.survey;
public final class SurveyActivity extends com.alightcreative.app.motion.activities.survey.xfY {
    public com.alightcreative.app.motion.activities.survey.XSt$A H;

    static SurveyActivity()
    {
        return;
    }

    public SurveyActivity()
    {
        return;
    }

    public final com.alightcreative.app.motion.activities.survey.XSt$A b9Y()
    {
        int v0_0 = this.H;
        if (v0_0 == 0) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
            return 0;
        } else {
            return v0_0;
        }
    }

    protected void onCreate(android.os.Bundle p5)
    {
        this.getWindow().setBackgroundDrawableResource(2131099819);
        super.onCreate(p5);
        R.A v5_5 = this.getWindow();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v5_5, "getWindow(...)");
        FKt.Nrb.hUw(v5_5, C.i2.uKP(IRH.CU.iVU()), C.i2.uKP(IRH.CU.iVU()), 1);
        R.A v5_1 = this.getIntent();
        if (v5_1 != null) {
            R.A v5_2 = v5_1.getStringExtra("survey");
            if (v5_2 != null) {
                int v0_4 = this.getIntent();
                if (v0_4 != 0) {
                    int v0_5 = v0_4.getStringExtra("localization");
                    if (v0_5 != 0) {
                        String v1_4 = this.getIntent();
                        if (v1_4 != null) {
                            String v1_5 = v1_4.getStringExtra(pD.jxn.qnVvBA.SmwZldzJgecjD);
                            if (v1_5 != null) {
                                m.xfY.j(this, 0, R.h.j(968760329, 1, new com.alightcreative.app.motion.activities.survey.SurveyActivity$xfY(this, v5_2, v0_5, v1_5)), 1, 0);
                                return;
                            }
                        }
                        this.finish();
                        return;
                    }
                }
                this.finish();
                return;
            }
        }
        this.finish();
        return;
    }
}
