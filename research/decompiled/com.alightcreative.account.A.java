package com.alightcreative.account;
public final class A implements Vbv.c {
    public static final com.alightcreative.account.A$xfY Yd;
    public static final int oiZ;
    private static final long v5;
    private boolean AI;
    private boolean AM;
    private java.util.List Bb;
    private final rKn.soy E;
    private java.util.Map F;
    private String F0;
    private boolean FT;
    private boolean GO;
    private final ns.h H;
    private java.util.List Hm;
    private final rKn.g IB;
    private final java.util.Map Jd;
    private java.util.List K;
    private boolean LV;
    private boolean M;
    private boolean MgY;
    private final rKn.soy Q;
    private final java.util.Map R;
    private final EZ.A R6;
    private final rKn.soy T;
    private final TV.n X;
    private final java.util.Set X9x;
    private Vbv.V Z5u;
    private com.google.firebase.firestore.q Zq;
    private boolean ah;
    private final rKn.g ak;
    private final Xw.V cD;
    private final rKn.g cLW;
    private boolean cv;
    private QdR.Y d;
    private final rKn.g db;
    private java.util.List e;
    private boolean e0E;
    private final java.util.Map f;
    private final com.alightcreative.account.IAPMiddleware hUw;
    private final E3.A j;
    private final QdR.d jE;
    private final rKn.g l;
    private boolean n;
    private String nvG;
    private final rKn.soy ojl;
    private final rKn.soy pM1;
    private final Z7J.xfY q;
    private boolean rs;
    private QdR.fS t;
    private final rKn.g uKP;
    private final rKn.soy w;
    private com.google.firebase.firestore.q w0;
    private final qY.s x;
    private int x1;
    private final java.util.Set z;

    static A()
    {
        com.alightcreative.account.A.Yd = new com.alightcreative.account.A$xfY(0);
        com.alightcreative.account.A.oiZ = 8;
        com.alightcreative.account.A.v5 = 3600000;
        return;
    }

    public A(com.alightcreative.account.IAPMiddleware p2, E3.A p3, Xw.V p4, qY.s p5, EZ.A p6, Z7J.xfY p7, ns.h p8, TV.n p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "iapMiddleware");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "crisper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "monopoly");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "purchaseBillingManager");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "setDeviceIdUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "isEligibleForFreeTrialUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "getAlightSettingsUseCase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "eventLogger");
        this.hUw = p2;
        this.j = p3;
        this.cD = p4;
        this.x = p5;
        this.R6 = p6;
        this.q = p7;
        this.H = p8;
        this.X = p9;
        java.util.Map v3_1 = rKn.eWj.hUw(0);
        this.ojl = v3_1;
        this.uKP = v3_1;
        java.util.Map v3_2 = rKn.eWj.hUw(0);
        this.T = v3_2;
        this.db = v3_2;
        java.util.Map v3_3 = rKn.eWj.hUw(0);
        this.w = v3_3;
        this.cLW = v3_3;
        java.util.Map v3_4 = rKn.eWj.hUw(0);
        this.pM1 = v3_4;
        this.l = v3_4;
        java.util.Map v3_5 = Boolean.FALSE;
        QdR.d v4_1 = rKn.eWj.hUw(v3_5);
        this.E = v4_1;
        this.IB = v4_1;
        this.FT = 1;
        this.ah = 1;
        this.jE = QdR.eWj.j();
        java.util.Map v3_6 = rKn.eWj.hUw(v3_5);
        this.Q = v3_6;
        this.ak = v3_6;
        this.f = new java.util.LinkedHashMap();
        this.Bb = kotlin.collections.CollectionsKt.emptyList();
        this.nvG = MYJ.dj.ksSQij.pRHxEI;
        this.Z5u = Vbv.V.j;
        this.Jd = new java.util.LinkedHashMap();
        this.R = new java.util.LinkedHashMap();
        this.X9x = new java.util.LinkedHashSet();
        this.z = new java.util.LinkedHashSet();
        this.F = kotlin.collections.MapsKt.emptyMap();
        this.d = QdR.uZ5.hUw(0);
        this.e = kotlin.collections.CollectionsKt.emptyList();
        return;
    }

    private static final String A()
    {
        return "IAP: verifyPurchases: verification done";
    }

    public static synthetic String AI()
    {
        return com.alightcreative.account.A.q9c();
    }

    public static synthetic String AM()
    {
        return com.alightcreative.account.A.W3V();
    }

    private static final void AX(com.alightcreative.account.A p0, com.google.firebase.auth.FirebaseUser p1, com.google.firebase.firestore.c p2, com.google.firebase.firestore.FirebaseFirestoreException p3)
    {
        if (p2 == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(p3);
            p0.Odv(p3);
            return;
        } else {
            String v1_1 = p1.ygC();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_1, "getUid(...)");
            p0.PC0(p2, v1_1);
            return;
        }
    }

    public static final synthetic void B(com.alightcreative.account.A p0, boolean p1)
    {
        p0.rs = p1;
        return;
    }

    public static synthetic String Bb(com.google.firebase.firestore.FirebaseFirestoreException p0)
    {
        return com.alightcreative.account.A.KE(p0);
    }

    public static final synthetic com.alightcreative.account.IAPMiddleware C(com.alightcreative.account.A p0)
    {
        return p0.hUw;
    }

    private static final String C0b()
    {
        return "IAP: updatePurchasesFromGooglePlay";
    }

    private static final String C4W()
    {
        return "IAP: verifyPurchases: PURCHASED/UNSPEC OUT";
    }

    private static final String CB(java.util.List p2)
    {
        String v2_1 = p2.size();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("IAP: computeActiveLicenses: localLicenses:");
        v0_1.append(v2_1);
        return v0_1.toString();
    }

    private static final String CYw()
    {
        return "IAP: verifyPurchases: VerifyPurchaseResult SUCCESS";
    }

    public static final synthetic Object D1(com.alightcreative.account.A p0, kotlin.coroutines.Continuation p1)
    {
        return p0.S6(p1);
    }

    private static final void EMD(com.alightcreative.account.A p0, com.google.firebase.firestore.c p1, com.google.firebase.firestore.FirebaseFirestoreException p2)
    {
        if (p1 == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(p2);
            p0.En(p2);
            return;
        } else {
            p0.i2(p1);
            return;
        }
    }

    private static final String Ehf()
    {
        return "IAP: verifyPurchases IN";
    }

    private final boolean En(com.google.firebase.firestore.FirebaseFirestoreException p5)
    {
        com.alightcreative.account.A$h v0_1 = com.alightcreative.account.A$h.q.cD();
        fx.Enc.H(v0_1, new Vbv.Tn(p5));
        com.alightcreative.account.A$h.X(v0_1, p5, 0, 2, 0);
        return this.pM1.cD(0);
    }

    public static synthetic String F()
    {
        return com.alightcreative.account.A.YU();
    }

    public static final synthetic void Frn(com.alightcreative.account.A p0, java.util.List p1, String p2)
    {
        p0.zO(p1, p2);
        return;
    }

    public static synthetic String GO()
    {
        return com.alightcreative.account.A.p();
    }

    public static synthetic String Hm()
    {
        return com.alightcreative.account.A.CYw();
    }

    public static final synthetic void Ie(com.alightcreative.account.A p0, java.util.List p1)
    {
        p0.K = p1;
        return;
    }

    public static final synthetic rKn.soy If(com.alightcreative.account.A p0)
    {
        return p0.T;
    }

    public static final synthetic Vbv.V J(com.alightcreative.account.A p0)
    {
        return p0.Z5u;
    }

    private final Object JHw(kotlin.coroutines.Continuation p9)
    {
        Vbv.Ki v0_2;
        if (!(p9 instanceof com.alightcreative.account.A$qfV)) {
            v0_2 = new com.alightcreative.account.A$qfV(this, p9);
        } else {
            v0_2 = ((com.alightcreative.account.A$qfV) p9);
            java.util.ArrayList v1_3 = ((com.alightcreative.account.A$qfV) p9).X;
            if ((v1_3 & -2147483648) == 0) {
            } else {
                ((com.alightcreative.account.A$qfV) p9).X = (v1_3 - -2147483648);
            }
        }
        com.alightcreative.account.A v5_0;
        java.util.Iterator v4_1;
        Object v2_9;
        java.util.List v9_1 = v0_2.q;
        java.util.ArrayList v1_2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object v2_4 = v0_2.X;
        if (v2_4 == null) {
            kotlin.ResultKt.throwOnFailure(v9_1);
            java.util.List v9_5 = this.F.values();
            fx.Enc.H(this, new Vbv.m(v9_5));
            v5_0 = this;
            v4_1 = new java.util.ArrayList();
            v2_9 = ((Iterable) v9_5).iterator();
        } else {
            if (v2_4 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                v2_9 = ((java.util.Iterator) v0_2.x);
                v4_1 = ((java.util.Collection) v0_2.cD);
                v5_0 = ((com.alightcreative.account.A) v0_2.j);
                kotlin.ResultKt.throwOnFailure(v9_1);
                java.util.List v9_10 = ((com.alightcreative.account.LicenseInfo) v9_1);
                if (v9_10 != null) {
                    v4_1.add(v9_10);
                }
            }
        }
        if (!v2_9.hasNext()) {
            java.util.Iterator v4_3 = ((java.util.List) v4_1);
            fx.Enc.H(v5_0, new Vbv.x(v4_3));
            java.util.List v9_14 = v5_0.TT1();
            Vbv.Ki v0_5 = new java.util.ArrayList();
            java.util.List v9_15 = v9_14.iterator();
            while (v9_15.hasNext()) {
                java.util.ArrayList v1_1 = v9_15.next();
                if (com.alightcreative.account.A$xfY.hUw(com.alightcreative.account.A.Yd, ((com.alightcreative.account.LicenseInfo) v1_1), v5_0)) {
                    v0_5.add(v1_1);
                }
            }
            fx.Enc.H(v5_0, new Vbv.MY(v0_5));
            java.util.List v9_19 = new java.util.ArrayList();
            java.util.ArrayList v1_5 = v4_3.iterator();
            while (v1_5.hasNext()) {
                Object v2_0 = v1_5.next();
                if (com.alightcreative.account.A$xfY.hUw(com.alightcreative.account.A.Yd, ((com.alightcreative.account.LicenseInfo) v2_0), v5_0)) {
                    v9_19.add(v2_0);
                }
            }
            fx.Enc.H(v5_0, new Vbv.q(v9_19));
            java.util.ArrayList v1_9 = new java.util.ArrayList();
            java.util.List v9_20 = v9_19.iterator();
            while (v9_20.hasNext()) {
                Object v2_14 = v9_20.next();
                com.alightcreative.account.LicenseInfo v3_7 = ((com.alightcreative.account.LicenseInfo) v2_14);
                if (!v0_5.isEmpty()) {
                    java.util.Iterator v4_5 = v0_5.iterator();
                    while (v4_5.hasNext()) {
                        boolean v6_2 = ((com.alightcreative.account.LicenseInfo) v4_5.next());
                        if ((v6_2.getOrderNumber() != null) && (kotlin.jvm.internal.Intrinsics.areEqual(v6_2.getOrderNumber(), v3_7.getOrderNumber()))) {
                        }
                    }
                }
                v1_9.add(v2_14);
            }
            java.util.List v9_21 = kotlin.collections.CollectionsKt.plus(v0_5, v1_9);
            fx.Enc.H(v5_0, new Vbv.Ki(v9_21));
            return v9_21;
        } else {
            java.util.List v9_3 = ((Xw.F) v2_9.next());
            v0_2.j = v5_0;
            v0_2.cD = v4_1;
            v0_2.x = v2_9;
            v0_2.X = 1;
            v9_1 = v5_0.pL(v9_3, v0_2);
            if (v9_1 != v1_2) {
            } else {
                return v1_2;
            }
        }
    }

    public static synthetic String Jd()
    {
        return com.alightcreative.account.A.Y();
    }

    public static final synthetic Object Jju(com.alightcreative.account.A p0, Xw.F p1, kotlin.coroutines.Continuation p2)
    {
        return p0.pL(p1, p2);
    }

    public static final synthetic rKn.soy Jm(com.alightcreative.account.A p0)
    {
        return p0.Q;
    }

    public static synthetic String K()
    {
        return com.alightcreative.account.A.Ehf();
    }

    private static final String KE(com.google.firebase.firestore.FirebaseFirestoreException p2)
    {
        String v2_1 = p2.getMessage();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("IAP: accountDocumentError: ");
        v0_1.append(v2_1);
        return v0_1.toString();
    }

    private final com.alightcreative.account.PurchasePeriod Kpz(com.bendingspoons.monopoly.Period p4)
    {
        com.alightcreative.account.PurchasePeriod$Unit v1_0;
        com.alightcreative.account.PurchasePeriod$Unit v1_3 = com.alightcreative.account.A$XSt.$EnumSwitchMapping$1[p4.getTimeUnit().ordinal()];
        if (v1_3 == 1) {
            v1_0 = com.alightcreative.account.PurchasePeriod$Unit.Day;
        } else {
            if (v1_3 == 2) {
                v1_0 = com.alightcreative.account.PurchasePeriod$Unit.Week;
            } else {
                if (v1_3 == 3) {
                    v1_0 = com.alightcreative.account.PurchasePeriod$Unit.Month;
                } else {
                    if (v1_3 != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    } else {
                        v1_0 = com.alightcreative.account.PurchasePeriod$Unit.Year;
                    }
                }
            }
        }
        return new com.alightcreative.account.PurchasePeriod(v1_0, p4.getValue());
    }

    public static synthetic String M()
    {
        return com.alightcreative.account.A.A();
    }

    private static final String MMm()
    {
        return "IAP: loadAccountLicensesFromCache";
    }

    private static final kotlin.Unit MTr(com.alightcreative.account.A p6, boolean p7)
    {
        QdR.K.x(p6.jE, 0, 0, new com.alightcreative.account.A$MY(p6, 0), 3, 0);
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic void MgY(com.alightcreative.account.A p0, com.google.firebase.firestore.c p1, com.google.firebase.firestore.FirebaseFirestoreException p2)
    {
        com.alightcreative.account.A.EMD(p0, p1, p2);
        return;
    }

    public static final synthetic rKn.soy N(com.alightcreative.account.A p0)
    {
        return p0.w;
    }

    private static final String O9()
    {
        return "IAP: refreshPurchaseState";
    }

    private final boolean Odv(com.google.firebase.firestore.FirebaseFirestoreException p5)
    {
        com.alightcreative.account.A$h v0_1 = com.alightcreative.account.A$h.q.j();
        fx.Enc.H(v0_1, new Vbv.s(p5));
        com.alightcreative.account.A$h.X(v0_1, p5, 0, 2, 0);
        this.VJy(this.j, 0);
        this.ojl.cD(0);
        this.T.cD(0);
        return this.w.cD(0);
    }

    private final QdR.fS PC0(com.google.firebase.firestore.c p13, String p14)
    {
        com.alightcreative.account.A$h v5 = com.alightcreative.account.A$h.q.j();
        fx.Enc.H(v5, new Vbv.uZ5());
        com.alightcreative.account.A$h.uKP(v5, 0, 1, 0);
        return QdR.K.x(this.jE, 0, 0, new com.alightcreative.account.A$V(p13, this, p14, v5, 0), 3, 0);
    }

    public static final synthetic void Pg(com.alightcreative.account.A p0, QdR.fS p1)
    {
        p0.t = p1;
        return;
    }

    private final QdR.fS QP(String p7)
    {
        return QdR.K.x(this.jE, 0, 0, new com.alightcreative.account.A$Tn(this, p7, 0), 3, 0);
    }

    public static final synthetic EZ.A QR(com.alightcreative.account.A p0)
    {
        return p0.R6;
    }

    public static synthetic String R(java.util.List p0)
    {
        return com.alightcreative.account.A.fdD(p0);
    }

    private static final String RF(com.google.firebase.firestore.FirebaseFirestoreException p2)
    {
        String v2_1 = p2.getMessage();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("IAP: cloudConfigError: ");
        v0_1.append(v2_1);
        return v0_1.toString();
    }

    public static final synthetic long S()
    {
        return com.alightcreative.account.A.v5;
    }

    private final Object S6(kotlin.coroutines.Continuation p22)
    {
        String v2_1;
        if (!(p22 instanceof com.alightcreative.account.A$Enc)) {
            v2_1 = new com.alightcreative.account.A$Enc(this, p22);
        } else {
            v2_1 = ((com.alightcreative.account.A$Enc) p22);
            Object v3_2 = ((com.alightcreative.account.A$Enc) p22).w;
            if ((v3_2 & -2147483648) == 0) {
            } else {
                ((com.alightcreative.account.A$Enc) p22).w = (v3_2 - -2147483648);
            }
        }
        com.alightcreative.account.F v9_0;
        java.util.ArrayList v10_1;
        java.util.Iterator v4_12;
        Boolean v11_1;
        java.util.ArrayList v8_11;
        java.util.Map v12_2;
        Throwable v0_9 = v2_1.T;
        Object v3_1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        java.util.Iterator v4_6 = v2_1.w;
        try {
            if (v4_6 == null) {
                kotlin.ResultKt.throwOnFailure(v0_9);
                fx.Enc.H(this, new Vbv.uS());
                if (!this.MgY) {
                    this.MgY = 1;
                    try {
                        v2_1.j = this;
                        v2_1.w = 1;
                        v0_9 = this.JHw(v2_1);
                    } catch (Throwable v0_1) {
                        v12_2 = this;
                        v12_2.MgY = 0;
                        throw v0_1;
                    }
                    if (v0_9 != v3_1) {
                        v12_2 = this;
                        Throwable v0_26 = ((java.util.List) v0_9);
                        java.util.Iterator v4_9 = new java.util.ArrayList();
                        java.util.ArrayList v8_1 = v0_26.iterator();
                        while (v8_1.hasNext()) {
                            kotlin.collections.CollectionsKt.addAll(v4_9, ((Iterable) ((com.alightcreative.account.LicenseInfo) v8_1.next()).getBenefits()));
                        }
                        java.util.Iterator v4_10 = kotlin.collections.CollectionsKt.toSet(v4_9);
                        if (v12_2.cv) {
                            v12_2 = v12_2.ygC(v12_2.j, v4_10);
                            v12_2.d.ToE(kotlin.Unit.INSTANCE);
                        }
                        java.util.ArrayList v8_9;
                        if (!((Boolean) v12_2.Q.getValue()).booleanValue()) {
                            v8_9 = v12_2.Jd;
                        } else {
                            v8_9 = kotlin.collections.MapsKt.plus(v12_2.R, v12_2.Jd);
                        }
                        v10_1 = v4_10;
                        v4_12 = v12_2.e.iterator();
                        v9_0 = v12_2;
                        v12_2 = v8_9;
                        v8_11 = new java.util.ArrayList();
                        v11_1 = v0_26;
                        try {
                            if (!v4_12.hasNext()) {
                                java.util.List v18_1 = ((java.util.List) v8_11);
                                Vbv.PA v13 = v9_0.a9();
                                boolean v14 = ((Boolean) v9_0.E().getValue()).booleanValue();
                                Vbv.V v15 = v9_0.Z5u;
                                Long v16_1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(com.alightcreative.app.motion.persist.xfY.INSTANCE.getAccountCreated());
                                Throwable v0_10 = com.alightcreative.account.A$h.q.q(((Boolean) v9_0.E().getValue()).booleanValue());
                                java.util.Iterator v4_5 = new java.util.ArrayList();
                                Throwable v0_11 = v0_10.iterator();
                                while (v0_11.hasNext()) {
                                    kotlin.collections.CollectionsKt.addAll(v4_5, ((com.alightcreative.account.A$h) v0_11.next()).T());
                                }
                                java.util.Map v6_1 = v9_0;
                                try {
                                    com.alightcreative.account.F v9_2 = new com.alightcreative.account.F(v10_1, v11_1, v12_2, v13, v14, v15, v16_1, v4_5, v18_1, ((Boolean) v9_0.Q.getValue()).booleanValue());
                                    v6_1.MgY = 0;
                                    v2_1.j = 0;
                                    v2_1.cD = 0;
                                    v2_1.x = 0;
                                    v2_1.q = 0;
                                    v2_1.H = 0;
                                    v2_1.X = 0;
                                    v2_1.w = 3;
                                } catch (Throwable v0_1) {
                                }
                                if (Vbv.Xo.l(v9_2, v2_1) == v3_1) {
                                    return v3_1;
                                }
                                return kotlin.Unit.INSTANCE;
                            } else {
                                Throwable v0_18 = ((String) v4_12.next());
                                v2_1.j = v9_0;
                                v2_1.cD = v11_1;
                                v2_1.x = v10_1;
                                v2_1.q = v12_2;
                                v2_1.H = v8_11;
                                v2_1.X = v4_12;
                                v2_1.w = 2;
                                v0_9 = v9_0.b1(v0_18, v2_1);
                                if (v0_9 == v3_1) {
                                    return v3_1;
                                } else {
                                    Throwable v0_2 = ((com.alightcreative.account.SKUInfo) v0_9);
                                    if (v0_2 == null) {
                                    } else {
                                        v8_11.add(v0_2);
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                            }
                        } catch (Throwable v0_1) {
                            v6_1 = v9_0;
                        }
                        v12_2 = v6_1;
                    }
                } else {
                    return kotlin.Unit.INSTANCE;
                }
            } else {
                if (v4_6 == 1) {
                    v12_2 = ((com.alightcreative.account.A) v2_1.j);
                    kotlin.ResultKt.throwOnFailure(v0_9);
                } else {
                    if (v4_6 == 2) {
                        v4_12 = ((java.util.Iterator) v2_1.X);
                        v8_11 = ((java.util.Collection) v2_1.H);
                        com.alightcreative.account.F v9_13 = ((java.util.Map) v2_1.q);
                        v10_1 = ((java.util.Set) v2_1.x);
                        v11_1 = ((java.util.List) v2_1.cD);
                        java.util.Map v12_1 = ((com.alightcreative.account.A) v2_1.j);
                        kotlin.ResultKt.throwOnFailure(v0_9);
                        v12_2 = v9_13;
                        v9_0 = v12_1;
                    } else {
                        if (v4_6 != 3) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        } else {
                            kotlin.ResultKt.throwOnFailure(v0_9);
                        }
                    }
                }
            }
        } catch (Throwable v0_1) {
        } catch (Throwable v0_1) {
            v12_2 = v9_0;
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final synthetic int ST5(com.alightcreative.account.A p0)
    {
        return p0.x1;
    }

    private final java.util.List TT1()
    {
        if ((!((Boolean) this.E().getValue()).booleanValue()) || (!kotlin.jvm.internal.Intrinsics.areEqual(this.hUw(), this.nvG))) {
            if (((Boolean) this.E().getValue()).booleanValue()) {
                return kotlin.collections.CollectionsKt.emptyList();
            } else {
                java.util.List v0_7 = this.K;
                if (v0_7 == null) {
                    v0_7 = kotlin.collections.CollectionsKt.emptyList();
                }
                return v0_7;
            }
        } else {
            return this.Bb;
        }
    }

    public static final synthetic Object ToE(com.alightcreative.account.A p0, String p1, kotlin.coroutines.Continuation p2)
    {
        return p0.b1(p1, p2);
    }

    static synthetic void V(com.alightcreative.account.A p0, boolean p1, int p2, Object p3)
    {
        if ((p2 & 1) != 0) {
            p1 = 0;
        }
        p0.v9(p1);
        return;
    }

    private final void VJy(E3.A p3, boolean p4)
    {
        org.json.JSONObject v0_1 = new org.json.JSONObject();
        v0_1.put("is_creator_program_active", p4);
        this.X.hUw(new TV.xfY$KLa(v0_1));
        p3.x(v0_1);
        return;
    }

    private static final String W()
    {
        return "IAP: verifyPurchases: VerifyPurchaseResult.InvalidToken";
    }

    private static final String W3V()
    {
        return "clearAndRefreshIAPStatus";
    }

    private static final String WJ()
    {
        return "IAP: verifyPurchases: VerifyPurchaseResult Exception";
    }

    public static synthetic String X9x()
    {
        return com.alightcreative.account.A.MMm();
    }

    public static final synthetic Object XA(com.alightcreative.account.A p0, String p1, com.alightcreative.account.IAPItemType p2, kotlin.coroutines.Continuation p3)
    {
        return p0.wH(p1, p2, p3);
    }

    private static final String Y()
    {
        return "IAP: accountDocumentChanged";
    }

    private static final String YU()
    {
        return "IAP: cloudConfigChanged";
    }

    public static synthetic String Yd()
    {
        return com.alightcreative.account.A.C0b();
    }

    public static final synthetic boolean Z(com.alightcreative.account.A p0)
    {
        return p0.e0E;
    }

    public static final synthetic Object Z0(com.alightcreative.account.A p0, boolean p1, kotlin.coroutines.Continuation p2)
    {
        return p0.rPC(p1, p2);
    }

    public static synthetic String Z5u(java.util.List p0)
    {
        return com.alightcreative.account.A.v(p0);
    }

    public static final synthetic QdR.fS Zk(com.alightcreative.account.A p0)
    {
        return p0.t;
    }

    private final int Zm(com.bendingspoons.monopoly.Period p3)
    {
        int v0_2 = com.alightcreative.account.A$XSt.$EnumSwitchMapping$1[p3.getTimeUnit().ordinal()];
        if (v0_2 == 1) {
            return p3.getValue();
        } else {
            if (v0_2 == 2) {
                return (p3.getValue() * 7);
            } else {
                if (v0_2 == 3) {
                    return (p3.getValue() * 30);
                } else {
                    if (v0_2 != 4) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    } else {
                        return (p3.getValue() * 365);
                    }
                }
            }
        }
    }

    public static synthetic String Zq()
    {
        return com.alightcreative.account.A.lka();
    }

    private final Vbv.PA a9()
    {
        Vbv.PA v0_6 = com.alightcreative.account.A$h.q.q(((Boolean) this.E().getValue()).booleanValue());
        fx.Enc.H(this, new Vbv.Sq(v0_6, this));
        if ((v0_6 == null) || (!v0_6.isEmpty())) {
            com.alightcreative.account.A$CU v1_3 = v0_6.iterator();
            while (v1_3.hasNext()) {
                if (((com.alightcreative.account.A$h) v1_3.next()).cLW()) {
                }
            }
            if ((!this.AM) && (!this.n)) {
                if ((v0_6 == null) || (!v0_6.isEmpty())) {
                    com.alightcreative.account.A$CU v1_8 = v0_6.iterator();
                    while (v1_8.hasNext()) {
                        if (((com.alightcreative.account.A$h) v1_8.next()).db() == com.alightcreative.account.A$CU.x) {
                            return Vbv.PA.x;
                        }
                        return Vbv.PA.cD;
                    }
                }
                if ((v0_6 == null) || (!v0_6.isEmpty())) {
                    Vbv.PA v0_2 = v0_6.iterator();
                    while (v0_2.hasNext()) {
                        if (((com.alightcreative.account.A$h) v0_2.next()).db() != com.alightcreative.account.A$CU.cD) {
                            return Vbv.PA.j;
                        }
                    }
                }
                return Vbv.PA.q;
            }
        }
        return Vbv.PA.cD;
    }

    public static synthetic String ak()
    {
        return com.alightcreative.account.A.W();
    }

    private final Object b1(String p5, kotlin.coroutines.Continuation p6)
    {
        Object v0_2;
        if (!(p6 instanceof com.alightcreative.account.A$D)) {
            v0_2 = new com.alightcreative.account.A$D(this, p6);
        } else {
            v0_2 = ((com.alightcreative.account.A$D) p6);
            boolean v1_2 = ((com.alightcreative.account.A$D) p6).q;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.alightcreative.account.A$D) p6).q = (v1_2 - -2147483648);
            }
        }
        java.util.Iterator v6_1 = v0_2.cD;
        boolean v1_1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int v2_0 = v0_2.q;
        if (v2_0 == 0) {
            kotlin.ResultKt.throwOnFailure(v6_1);
            v0_2.j = p5;
            v0_2.q = 1;
            v6_1 = this.qxC(v0_2);
            if (v6_1 == v1_1) {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                p5 = ((String) v0_2.j);
                kotlin.ResultKt.throwOnFailure(v6_1);
            }
        }
        java.util.Iterator v6_4 = ((Iterable) v6_1).iterator();
        while (v6_4.hasNext()) {
            Object v0_4 = v6_4.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.alightcreative.account.SKUInfo) v0_4).getSku(), p5)) {
                return v0_4;
            }
        }
        return 0;
    }

    public static final synthetic qY.s b9Y(com.alightcreative.account.A p0)
    {
        return p0.x;
    }

    public static final synthetic void cKj(com.alightcreative.account.A p0, boolean p1)
    {
        p0.LV = p1;
        return;
    }

    public static final synthetic void cak(com.alightcreative.account.A p0, String p1)
    {
        p0.jj(p1);
        return;
    }

    public static synthetic String cv(com.google.firebase.firestore.FirebaseFirestoreException p0)
    {
        return com.alightcreative.account.A.RF(p0);
    }

    public static synthetic kotlin.Unit d(com.alightcreative.account.A p0, boolean p1)
    {
        return com.alightcreative.account.A.MTr(p0, p1);
    }

    private static final String dDX(java.util.List p9, com.alightcreative.account.A p10)
    {
        String v9_1 = kotlin.collections.CollectionsKt.joinToString$default(p9, ", ", 0, 0, 0, 0, new com.alightcreative.account.xfY(), 30, 0);
        boolean v0_0 = p10.AM;
        boolean v10_1 = p10.n;
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("IAP Task State: ");
        v1_1.append(v9_1);
        v1_1.append("; updatingPurchasesFromGooglePlay=");
        v1_1.append(v0_0);
        v1_1.append("; isPurchaseBeingMade=");
        v1_1.append(v10_1);
        return v1_1.toString();
    }

    public static final synthetic void dav(com.alightcreative.account.A p0, int p1)
    {
        p0.x1 = p1;
        return;
    }

    public static synthetic String e()
    {
        return com.alightcreative.account.A.WJ();
    }

    public static synthetic String e0E(java.util.List p0, com.alightcreative.account.A p1)
    {
        return com.alightcreative.account.A.dDX(p0, p1);
    }

    public static final synthetic Z7J.xfY e4D(com.alightcreative.account.A p0)
    {
        return p0.q;
    }

    public static synthetic void f(com.alightcreative.account.A p0, com.google.firebase.auth.FirebaseUser p1, com.google.firebase.firestore.c p2, com.google.firebase.firestore.FirebaseFirestoreException p3)
    {
        com.alightcreative.account.A.AX(p0, p1, p2, p3);
        return;
    }

    private static final String fdD(java.util.List p2)
    {
        String v2_1 = p2.size();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("IAP: computeActiveLicenses: activeLocalLicenses:");
        v0_1.append(v2_1);
        return v0_1.toString();
    }

    public static final synthetic rKn.soy g(com.alightcreative.account.A p0)
    {
        return p0.ojl;
    }

    public static final synthetic boolean g2(com.alightcreative.account.A p0)
    {
        return p0.AI;
    }

    public static final synthetic Xw.V h(com.alightcreative.account.A p0)
    {
        return p0.cD;
    }

    public static final synthetic boolean hP(com.alightcreative.account.A p0)
    {
        return p0.M;
    }

    public static final synthetic java.util.List hsj(com.alightcreative.account.A p0)
    {
        return p0.K;
    }

    private final QdR.fS i2(com.google.firebase.firestore.c p11)
    {
        com.alightcreative.account.A$h v0_1 = com.alightcreative.account.A$h.q.cD();
        fx.Enc.H(v0_1, new Vbv.soy());
        com.alightcreative.account.A$h.uKP(v0_1, 0, 1, 0);
        return QdR.K.x(this.jE, 0, 0, new com.alightcreative.account.A$K(p11, this, 0), 3, 0);
    }

    public static final synthetic java.util.List i6(com.alightcreative.account.A p0)
    {
        return p0.Hm;
    }

    private static final String iM(java.util.Collection p2)
    {
        String v2_1 = p2.size();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("IAP: computeActiveLicenses: validLocalPurchases:");
        v0_1.append(v2_1);
        return v0_1.toString();
    }

    public static final synthetic ns.h iVU(com.alightcreative.account.A p0)
    {
        return p0.H;
    }

    private final void jV()
    {
        QdR.K.x(this.jE, 0, 0, new com.alightcreative.account.A$cY(this, 0), 3, 0);
        return;
    }

    private static final String jfW(java.util.List p2)
    {
        String v2_1 = p2.size();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("IAP: computeActiveLicenses: allActiveLicenses:");
        v0_1.append(v2_1);
        return v0_1.toString();
    }

    public static final synthetic java.util.Set jgN(com.alightcreative.account.A p0)
    {
        return p0.X9x;
    }

    private final void jj(String p8)
    {
        fx.Enc.H(this, new Vbv.Y());
        Vbv.V v0_2 = com.alightcreative.app.motion.persist.xfY.INSTANCE;
        if ((v0_2.getLicenseCacheVersion() == v0_2.getLICENSE_CACHE_VERSION()) && ((v0_2.getAccountInfoCacheDate() > (this.cLW() - 1296000000)) && (kotlin.jvm.internal.Intrinsics.areEqual(p8, v0_2.getLicenseUid())))) {
            Vbv.V v0_3;
            if (kotlin.text.StringsKt.trim(v0_2.getLicenseInfo()).toString().length() <= 0) {
                v0_3 = kotlin.collections.CollectionsKt.emptyList();
            } else {
                com.squareup.moshi.JsonAdapter v1_8 = FKt.eWj.hUw();
                Vbv.V v0_4 = v0_2.getLicenseInfo();
                reflect.ParameterizedType v2_1 = new reflect.Type[1];
                v2_1[0] = com.alightcreative.account.LicenseInfo;
                com.squareup.moshi.JsonAdapter v1_9 = v1_8.adapter(com.squareup.moshi.Types.newParameterizedType(java.util.List, v2_1));
                kotlin.jvm.internal.Intrinsics.checkNotNull(v1_9);
                v0_3 = ((java.util.List) v1_9.fromJson(v0_4));
            }
            if (v0_3 != null) {
                this.Bb = v0_3;
                this.Z5u = Vbv.V.cD;
                this.nvG = p8;
            }
        }
        return;
    }

    public static final synthetic rKn.soy lU(com.alightcreative.account.A p0)
    {
        return p0.pM1;
    }

    private static final String lka()
    {
        return "IAP: onActivityCreate";
    }

    public static final synthetic void m(com.alightcreative.account.A p0, boolean p1)
    {
        p0.n = p1;
        return;
    }

    public static final synthetic void m0(com.alightcreative.account.A p0, boolean p1)
    {
        p0.AI = p1;
        return;
    }

    public static synthetic String n()
    {
        return com.alightcreative.account.A.qQf();
    }

    public static final synthetic void nG(com.alightcreative.account.A p0, boolean p1)
    {
        p0.e0E = p1;
        return;
    }

    public static synthetic String nvG()
    {
        return com.alightcreative.account.A.O9();
    }

    public static final synthetic Object o(com.alightcreative.account.A p0, kotlin.coroutines.Continuation p1)
    {
        return p0.wll(p1);
    }

    public static synthetic CharSequence oiZ(com.alightcreative.account.A$h p0)
    {
        return com.alightcreative.account.A.sw(p0);
    }

    private static final String p()
    {
        return "retryAllFailedIAPTasks";
    }

    private final Object pL(Xw.F p18, kotlin.coroutines.Continuation p19)
    {
        String v2_1;
        if (!(p19 instanceof com.alightcreative.account.A$Gc)) {
            v2_1 = new com.alightcreative.account.A$Gc(this, p19);
        } else {
            v2_1 = ((com.alightcreative.account.A$Gc) p19);
            Xw.F v3_4 = ((com.alightcreative.account.A$Gc) p19).H;
            if ((v3_4 & -2147483648) == 0) {
            } else {
                ((com.alightcreative.account.A$Gc) p19).H = (v3_4 - -2147483648);
            }
        }
        Xw.F v3_2;
        String v2_3;
        long v1_1 = v2_1.x;
        Xw.F v3_1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        com.alightcreative.account.IAPItemType v4_0 = v2_1.H;
        Long v6 = 0;
        if (v4_0 == null) {
            kotlin.ResultKt.throwOnFailure(v1_1);
            long v1_2 = p18.cD();
            if (v1_2 != 0) {
                v2_1.j = this;
                v2_1.cD = p18;
                v2_1.H = 1;
                v1_1 = this.b1(v1_2, v2_1);
                if (v1_1 != v3_1) {
                    v2_3 = this;
                    v3_2 = p18;
                    long v1_5 = ((com.alightcreative.account.SKUInfo) v1_1);
                    if (v1_5 != 0) {
                        com.alightcreative.account.LicenseType v9 = com.alightcreative.account.Enc.x(v1_5.getType());
                        if (v9 != null) {
                            java.util.Set v16 = v1_5.getBenefits();
                            String v11 = v1_5.getSku();
                            boolean v12 = v3_2.X();
                            String v13 = v3_2.hUw();
                            com.alightcreative.account.PurchasePeriod v14 = v1_5.getPeriod();
                            long v1_8 = ((com.alightcreative.account.D$A) v2_3.f.get(v3_2.q()));
                            if (v1_8 != 0) {
                                v6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(v1_8.hUw());
                            }
                            return new com.alightcreative.account.LicenseInfo(1, v9, com.alightcreative.account.LicenseStore.GooglePlayStore, v11, v12, v13, v14, v6, v16);
                        } else {
                            return 0;
                        }
                    }
                } else {
                    return v3_1;
                }
            }
        } else {
            if (v4_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                v3_2 = ((Xw.F) v2_1.cD);
                v2_3 = ((com.alightcreative.account.A) v2_1.j);
                kotlin.ResultKt.throwOnFailure(v1_1);
            }
        }
        return 0;
    }

    private static final String q9c()
    {
        return "IAP: computePurchaseStateAndNotifyObservers";
    }

    private static final String qQf()
    {
        return "IAP: init";
    }

    private final Object qxC(kotlin.coroutines.Continuation p11)
    {
        String v0_2;
        if (!(p11 instanceof com.alightcreative.account.A$AWD)) {
            v0_2 = new com.alightcreative.account.A$AWD(this, p11);
        } else {
            v0_2 = ((com.alightcreative.account.A$AWD) p11);
            Object v1_2 = ((com.alightcreative.account.A$AWD) p11).x;
            if ((v1_2 & -2147483648) == 0) {
            } else {
                ((com.alightcreative.account.A$AWD) p11).x = (v1_2 - -2147483648);
            }
        }
        java.util.List v11_1 = v0_2.j;
        Object v1_1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int v2_0 = v0_2.x;
        if (v2_0 == 0) {
            kotlin.ResultKt.throwOnFailure(v11_1);
            com.alightcreative.account.A$h v6 = com.alightcreative.account.A$h.q.x();
            java.util.List v11_3 = QdR.sKo.cD();
            com.alightcreative.account.A$Zv9 v4_1 = new com.alightcreative.account.A$Zv9(1, v6, this, 0, this);
            v0_2.x = 1;
            v11_1 = QdR.K.H(v11_3, v4_1, v0_2);
            if (v11_1 == v1_1) {
                return v1_1;
            }
        } else {
            if (v2_0 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                kotlin.ResultKt.throwOnFailure(v11_1);
            }
        }
        java.util.List v11_6 = ((java.util.List) v11_1);
        if (v11_6 == null) {
            v11_6 = kotlin.collections.CollectionsKt.emptyList();
        }
        return v11_6;
    }

    public static final synthetic void r7(com.alightcreative.account.A p0, E3.A p1, boolean p2)
    {
        p0.VJy(p1, p2);
        return;
    }

    public static final synthetic QdR.d r8t(com.alightcreative.account.A p0)
    {
        return p0.jE;
    }

    private final Object rPC(boolean p13, kotlin.coroutines.Continuation p14)
    {
        Object v0_3;
        if (!(p14 instanceof com.alightcreative.account.A$Uk)) {
            v0_3 = new com.alightcreative.account.A$Uk(this, p14);
        } else {
            v0_3 = ((com.alightcreative.account.A$Uk) p14);
            kotlin.Unit v1_12 = ((com.alightcreative.account.A$Uk) p14).T;
            if ((v1_12 & -2147483648) == 0) {
            } else {
                ((com.alightcreative.account.A$Uk) p14).T = (v1_12 - -2147483648);
            }
        }
        com.alightcreative.account.A v2_1;
        kotlin.Unit v1_7;
        kotlin.Unit v13_2;
        com.alightcreative.account.A$Uk v5 = v0_3;
        Object v14_1 = v5.H;
        Object v0_1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        kotlin.Unit v1_8 = v5.T;
        if (v1_8 == null) {
            kotlin.ResultKt.throwOnFailure(v14_1);
            fx.Enc.H(this, new Vbv.qfV());
            if (p13 != null) {
                if (!this.AM) {
                    this.AM = 1;
                } else {
                    return kotlin.Unit.INSTANCE;
                }
            }
            Object v14_10 = new kotlin.jvm.internal.Ref$BooleanRef();
            kotlin.Unit v1_11 = this.cD;
            com.alightcreative.account.A v2_2 = (p13 ^ 1);
            v5.j = this;
            v5.cD = v14_10;
            v5.T = 1;
            kotlin.Unit v13_10 = Xw.V$CU.hUw(v1_11, v2_2, 1, 0, v5, 4, 0);
            if (v13_10 != v0_1) {
                v14_1 = v13_10;
                v13_2 = v14_10;
                v2_1 = this;
                Object v14_11 = ((BQ.A) v14_1);
                if ((v14_11 instanceof BQ.A$A)) {
                    v2_1.AM = 0;
                    if (!v13_2.element) {
                        return kotlin.Unit.INSTANCE;
                    } else {
                        v5.j = 0;
                        v5.cD = 0;
                        v5.x = 0;
                        v5.q = 0;
                        v5.T = 3;
                        if (v2_1.S6(v5) == v0_1) {
                            return v0_1;
                        }
                    }
                } else {
                    if (!(v14_11 instanceof BQ.A$CU)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    } else {
                        kotlin.Unit v1_20 = ((java.util.List) ((BQ.A$CU) v14_11).hUw());
                        Object v3_5 = new java.util.ArrayList();
                        java.util.LinkedHashMap v4_6 = new java.util.ArrayList();
                        kotlin.Unit v1_21 = v1_20.iterator();
                        while (v1_21.hasNext()) {
                            String v6_9 = v1_21.next();
                            if (((Xw.F) v6_9).x() != Xw.D.cD) {
                                v4_6.add(v6_9);
                            } else {
                                v3_5.add(v6_9);
                            }
                        }
                        kotlin.Unit v1_23 = new kotlin.Pair(v3_5, v4_6);
                        Object v3_7 = ((java.util.List) v1_23.component1());
                        kotlin.Unit v1_25 = ((java.util.List) v1_23.component2());
                        java.util.LinkedHashMap v4_8 = new java.util.ArrayList();
                        Object v3_8 = v3_7.iterator();
                        while (v3_8.hasNext()) {
                            String v6_8 = ((Xw.F) v3_8.next()).cD();
                            if (v6_8 != null) {
                                v4_8.add(v6_8);
                            }
                        }
                        v2_1.e = v4_8;
                        Object v3_10 = new java.util.ArrayList();
                        kotlin.Unit v1_26 = v1_25.iterator();
                        while (v1_26.hasNext()) {
                            java.util.LinkedHashMap v4_3 = v1_26.next();
                            if (((Xw.F) v4_3).cD() != null) {
                                v3_10.add(v4_3);
                            }
                        }
                        java.util.LinkedHashMap v4_2 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(v3_10, 10)), 16));
                        kotlin.Unit v1_5 = v3_10.iterator();
                        while (v1_5.hasNext()) {
                            Object v3_1 = v1_5.next();
                            String v6_2 = ((Xw.F) v3_1).cD();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(v6_2);
                            v4_2.put(v6_2, v3_1);
                        }
                        v2_1.F = v4_2;
                        v2_1.cv = 1;
                        kotlin.Unit v1_6 = v4_2.values();
                        v5.j = v2_1;
                        v5.cD = v13_2;
                        v5.x = v14_11;
                        v5.q = v13_2;
                        v5.T = 2;
                        v14_1 = v2_1.s(v1_6, v5);
                        if (v14_1 != v0_1) {
                            v1_7 = v13_2;
                            v13_2.element = ((Boolean) v14_1).booleanValue();
                            v13_2 = v1_7;
                        }
                    }
                }
            }
        } else {
            if (v1_8 == 1) {
                v13_2 = ((kotlin.jvm.internal.Ref$BooleanRef) v5.cD);
                kotlin.Unit v1_14 = ((com.alightcreative.account.A) v5.j);
                kotlin.ResultKt.throwOnFailure(v14_1);
                v2_1 = v1_14;
            } else {
                if (v1_8 == 2) {
                    v13_2 = ((kotlin.jvm.internal.Ref$BooleanRef) v5.q);
                    v1_7 = ((kotlin.jvm.internal.Ref$BooleanRef) v5.cD);
                    v2_1 = ((com.alightcreative.account.A) v5.j);
                    kotlin.ResultKt.throwOnFailure(v14_1);
                } else {
                    if (v1_8 != 3) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        kotlin.ResultKt.throwOnFailure(v14_1);
                    }
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    public static synthetic String rs(java.util.Collection p0)
    {
        return com.alightcreative.account.A.iM(p0);
    }

    private final Object s(java.util.Collection p22, kotlin.coroutines.Continuation p23)
    {
        com.alightcreative.account.A v2_0;
        Vbv.et v1_1;
        if (!(p23 instanceof com.alightcreative.account.A$VI)) {
            v2_0 = this;
            v1_1 = new com.alightcreative.account.A$VI(this, p23);
        } else {
            v1_1 = ((com.alightcreative.account.A$VI) p23);
            com.alightcreative.account.A v2_2 = ((com.alightcreative.account.A$VI) p23).w;
            if ((v2_2 & -2147483648) == 0) {
            } else {
                ((com.alightcreative.account.A$VI) p23).w = (v2_2 - -2147483648);
                v2_0 = this;
            }
        }
        Vbv.AWD v0_15;
        boolean v12_1;
        com.alightcreative.account.D v10_1;
        Vbv.AWD v0_9;
        String v4_8;
        java.util.Map v13_1;
        com.alightcreative.account.D v10_0;
        Vbv.AWD v0_18;
        Xw.F v9_0;
        String v4_2;
        kotlin.Result$Companion v11_3;
        String v4_3;
        Vbv.AWD v0_12 = v1_1.T;
        Object v3_0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        String v4_5 = v1_1.w;
        try {
            if (v4_5 == null) {
                kotlin.ResultKt.throwOnFailure(v0_12);
                v0_9 = com.alightcreative.account.A$h.q.R6();
                fx.Enc.H(v0_9, new Vbv.Enc());
                com.alightcreative.account.A$h.uKP(v0_9, 0, 1, 0);
                v4_2 = new kotlin.jvm.internal.Ref$BooleanRef();
                v9_0 = ((Iterable) p22).iterator();
                v10_1 = v2_0;
                while (v9_0.hasNext()) {
                    kotlin.Result$Companion v11_2 = ((Xw.F) v9_0.next());
                    boolean v12_0 = v11_2.cD();
                    if (v12_0) {
                        v1_1.j = v10_1;
                        v1_1.cD = v0_9;
                        v1_1.x = v4_2;
                        v1_1.q = v9_0;
                        v1_1.H = v11_2;
                        v1_1.X = v12_0;
                        v1_1.w = 1;
                        java.util.Map v13_0 = v10_1.b1(v12_0, v1_1);
                        if (v13_0 != v3_0) {
                            v12_1 = v0_9;
                            v0_12 = v13_0;
                            v13_1 = v10_1;
                            v10_0 = v9_0;
                            v9_0 = v11_2;
                            v11_3 = v4_2;
                            v4_3 = v12_0;
                            Vbv.AWD v0_13 = ((com.alightcreative.account.SKUInfo) v0_12);
                            if (v0_13 != null) {
                                v12_1.E(1);
                                long v14_0 = com.alightcreative.app.motion.persist.xfY.INSTANCE;
                                int v15_2 = ((Long) v14_0.getVerifiedPurchaseExpirationTime().get(v4_3));
                                if (v15_2 != 0) {
                                    if (v15_2.longValue() <= v13_1.cLW()) {
                                        v15_2 = 0;
                                    } else {
                                        String v4_4 = v14_0.getVerifiedPurchaseUid().get(v4_3);
                                        long v14_2 = v13_1.hUw();
                                        if (v14_2 == 0) {
                                            v14_2 = "";
                                        }
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(v4_4, v14_2)) {
                                        } else {
                                        }
                                    }
                                    if (v15_2 != 0) {
                                        v0_15 = new com.alightcreative.account.D$A(v15_2.longValue());
                                        v4_8 = v9_0;
                                        v9_0 = v10_0;
                                        v10_0 = v11_3;
                                        v11_3 = v12_1;
                                        v12_1 = v13_1;
                                        v0_18 = kotlin.Result.constructor-impl(v0_15);
                                        kotlin.Result$Companion v11_6 = v10_0;
                                        v10_1 = v12_1;
                                        boolean v12_4 = v11_3;
                                        if (kotlin.Result.isFailure-impl(v0_18)) {
                                            v0_18 = 0;
                                        }
                                        Vbv.AWD v0_22 = ((com.alightcreative.account.D) v0_18);
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(v0_22, com.alightcreative.account.D$xfY.hUw)) {
                                            if (!(v0_22 instanceof com.alightcreative.account.D$A)) {
                                                fx.Enc.H(v12_4, new Vbv.Zv9());
                                                com.alightcreative.account.A$h.X(v12_4, mF.A.hUw(mF.xfY.H), 0, 2, 0);
                                            } else {
                                                fx.Enc.H(v12_4, new Vbv.D());
                                                com.alightcreative.account.A$h.uKP(v12_4, 0, 1, 0);
                                                v10_1.f.put(v4_8.q(), v0_22);
                                            }
                                            fx.Enc.H(v12_4, new Vbv.AWD());
                                        } else {
                                            fx.Enc.H(v12_4, new Vbv.F());
                                            com.alightcreative.account.A$h.X(v12_4, mF.A.hUw(mF.xfY.H), 0, 2, 0);
                                            ((java.util.Collection) v10_1.z).add(v4_8.q());
                                        }
                                        v4_2 = v11_6;
                                        v0_9 = v12_4;
                                    }
                                }
                                v11_3.element = 1;
                                String v4_7 = v13_1.hUw;
                                v1_1.j = v13_1;
                                v1_1.cD = v12_1;
                                v1_1.x = v11_3;
                                v1_1.q = v10_0;
                                v1_1.H = v9_0;
                                v1_1.X = 0;
                                v1_1.w = 2;
                                v0_12 = v4_7.Q(v9_0, v0_13, v1_1);
                                if (v0_12 != v3_0) {
                                    v4_8 = v9_0;
                                    v9_0 = v10_0;
                                    v10_0 = v11_3;
                                    v11_3 = v12_1;
                                    v12_1 = v13_1;
                                    v0_15 = ((com.alightcreative.account.D) v0_12);
                                } else {
                                    return v3_0;
                                }
                            } else {
                                v9_0 = v10_0;
                                v4_2 = v11_3;
                                v0_9 = v12_1;
                                v10_1 = v13_1;
                            }
                        }
                    }
                }
                fx.Enc.H(v0_9, new Vbv.et());
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(v4_2.element);
            } else {
                if (v4_5 == 1) {
                    v4_3 = ((String) v1_1.X);
                    v9_0 = ((Xw.F) v1_1.H);
                    v10_0 = ((java.util.Iterator) v1_1.q);
                    v11_3 = ((kotlin.jvm.internal.Ref$BooleanRef) v1_1.x);
                    v12_1 = ((com.alightcreative.account.A$h) v1_1.cD);
                    v13_1 = ((com.alightcreative.account.A) v1_1.j);
                    kotlin.ResultKt.throwOnFailure(v0_12);
                } else {
                    if (v4_5 != 2) {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    } else {
                        v4_8 = ((Xw.F) v1_1.H);
                        v9_0 = ((java.util.Iterator) v1_1.q);
                        v10_0 = ((kotlin.jvm.internal.Ref$BooleanRef) v1_1.x);
                        v11_3 = ((com.alightcreative.account.A$h) v1_1.cD);
                        v12_1 = ((com.alightcreative.account.A) v1_1.j);
                        kotlin.ResultKt.throwOnFailure(v0_12);
                    }
                }
            }
        } catch (Vbv.AWD v0_16) {
        }
        v0_18 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(v0_16));
    }

    private static final CharSequence sw(com.alightcreative.account.A$h p3)
    {
        String v3_1;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "it");
        String v0_2 = p3.l();
        com.alightcreative.account.A$CU v1 = p3.db();
        if (!p3.cLW()) {
            v3_1 = "(-)";
        } else {
            v3_1 = "(R)";
        }
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append(v0_2);
        v2_1.append(":");
        v2_1.append(v1);
        v2_1.append(v3_1);
        return v2_1.toString();
    }

    public static synthetic String t()
    {
        return com.alightcreative.account.A.y3P();
    }

    public static final synthetic boolean tEh(com.alightcreative.account.A p0)
    {
        return p0.rs;
    }

    public static final synthetic Object uM(com.alightcreative.account.A p0, boolean p1, kotlin.coroutines.Continuation p2)
    {
        return p0.vy(p1, p2);
    }

    public static final synthetic void uq6(com.alightcreative.account.A p0, java.util.List p1)
    {
        p0.e = p1;
        return;
    }

    private static final String v(java.util.List p3)
    {
        String v0_0 = p3.size();
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("IAP: computeActiveLicenses: activeAccountLicenses:");
        v1_1.append(v0_0);
        v1_1.append(" : ");
        v1_1.append(p3);
        return v1_1.toString();
    }

    public static final synthetic Object v5(com.alightcreative.account.A p0, kotlin.coroutines.Continuation p1)
    {
        return p0.JHw(p1);
    }

    private final void v9(boolean p8)
    {
        fx.Enc.H(this, new Vbv.LxM());
        QdR.K.x(this.jE, 0, 0, new com.alightcreative.account.A$uZ5(p8, this, 0), 3, 0);
        return;
    }

    private final Object vy(boolean p3, kotlin.coroutines.Continuation p4)
    {
        kotlin.Unit v3_1 = QdR.eWj.q(new com.alightcreative.account.A$s(this, p3, 0), p4);
        if (v3_1 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v3_1;
        }
    }

    public static synthetic String w0()
    {
        return com.alightcreative.account.A.C4W();
    }

    private final Object wH(String p20, com.alightcreative.account.IAPItemType p21, kotlin.coroutines.Continuation p22)
    {
        Long v3_1;
        if (!(p22 instanceof com.alightcreative.account.A$F)) {
            v3_1 = new com.alightcreative.account.A$F(this, p22);
        } else {
            v3_1 = ((com.alightcreative.account.A$F) p22);
            int v4_12 = ((com.alightcreative.account.A$F) p22).X;
            if ((v4_12 & -2147483648) == 0) {
            } else {
                ((com.alightcreative.account.A$F) p22).X = (v4_12 - -2147483648);
            }
        }
        com.alightcreative.account.IAPItemType v9;
        IllegalStateException v6_1;
        Long v3_7;
        String v2_1 = v3_1.q;
        int v4_5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Vbv.xfY v5_2 = v3_1.X;
        if (v5_2 == null) {
            kotlin.ResultKt.throwOnFailure(v2_1);
            String v2_3 = this.cD;
            v3_1.j = this;
            v3_1.cD = p20;
            v3_1.x = p21;
            v3_1.X = 1;
            v2_1 = v2_3.uKP(p20, v3_1);
            if (v2_1 != v4_5) {
                v3_7 = this;
                v6_1 = p20;
                v9 = p21;
            } else {
                return v4_5;
            }
        } else {
            if (v5_2 != 1) {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            } else {
                kotlin.Unit v1_9 = ((com.alightcreative.account.IAPItemType) v3_1.x);
                int v4_7 = ((String) v3_1.cD);
                v3_7 = ((com.alightcreative.account.A) v3_1.j);
                kotlin.ResultKt.throwOnFailure(v2_1);
                v9 = v1_9;
                v6_1 = v4_7;
            }
        }
        kotlin.Unit v1_11 = ((com.bendingspoons.monopoly.product.SubscriptionProduct) BQ.CU.x(((BQ.A) v2_1)));
        if (v1_11 != null) {
            String v2_8 = ((com.bendingspoons.monopoly.product.BasePlan) kotlin.collections.CollectionsKt.firstOrNull(v1_11.getBasePlans()));
            if (v2_8 != null) {
                int v4_11;
                int v4_10 = ((com.bendingspoons.monopoly.product.Offer) kotlin.collections.CollectionsKt.firstOrNull(v2_8.getFreeTrialOffers()));
                if (v4_10 == 0) {
                    v4_11 = 0;
                } else {
                    v4_11 = O5.CU.hUw(v4_10);
                }
                int v4_14;
                String v7_2 = 0;
                if (v4_11 == 0) {
                    v4_14 = 0;
                } else {
                    int v4_13 = v4_11.getPeriod();
                    if (v4_13 == 0) {
                    } else {
                        v4_14 = v3_7.Zm(v4_13);
                    }
                }
                String v7_3;
                if (v4_14 != 0) {
                    v7_3 = 0;
                } else {
                    String v8_3 = kotlin.text.StringsKt.substringAfter$default(v6_1, 95, 0, 2, 0);
                    if (!kotlin.text.StringsKt.contains$default(v8_3, "1w", 0, 2, 0)) {
                        if (kotlin.text.StringsKt.contains$default(v8_3, "3d", 0, 2, 0)) {
                            v7_2 = 3;
                        }
                    } else {
                        v7_2 = 7;
                    }
                    v7_3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(v7_2);
                }
                if (v7_3 != null) {
                    v4_14 = v7_3.intValue();
                }
                int v4_3;
                int v10_1 = v4_14;
                int v4_2 = ((com.bendingspoons.monopoly.product.Offer) kotlin.collections.CollectionsKt.firstOrNull(v2_8.getIntroPriceOffers()));
                if (v4_2 == 0) {
                    v4_3 = 0;
                } else {
                    v4_3 = O5.CU.x(v4_2);
                }
                String v7_0;
                if (v10_1 <= 0) {
                    v7_0 = v3_7.Jd;
                } else {
                    v7_0 = v3_7.R;
                }
                com.alightcreative.account.PurchasePeriod v16;
                com.alightcreative.account.PurchasePeriod v11_0 = v7_0;
                String v7_1 = v1_11.getTitle();
                kotlin.Unit v1_1 = v1_11.getDescription();
                long v13_0 = v11_0;
                com.alightcreative.account.PurchasePeriod v11_1 = v3_7.Kpz(v2_8.getPeriod());
                String v12_2 = v2_8.getFormattedPrice();
                String v15_0 = v13_0;
                long v13_1 = v2_8.getPriceAmountMicros();
                String v2_0 = v2_8.getPriceCurrencyCode();
                if (v4_3 == 0) {
                    v16 = 0;
                } else {
                    String v8_0 = v4_3.getPeriod();
                    if (v8_0 == null) {
                    } else {
                        v16 = v3_7.Kpz(v8_0);
                    }
                }
                int v17;
                if (v4_3 == 0) {
                    v17 = 0;
                } else {
                    v17 = v4_3.getFormattedPrice();
                }
                int v18;
                if (v4_3 == 0) {
                    v18 = 0;
                } else {
                    v18 = kotlin.coroutines.jvm.internal.Boxing.boxLong(v4_3.getPriceAmountMicros());
                }
                v15_0.put(v6_1, new Vbv.xfY(v6_1, v7_1, v1_1, v9, v10_1, v11_1, v12_2, v13_1, v2_0, v16, v17, v18));
                return kotlin.Unit.INSTANCE;
            } else {
                return kotlin.Unit.INSTANCE;
            }
        } else {
            return kotlin.Unit.INSTANCE;
        }
    }

    private final Object wll(kotlin.coroutines.Continuation p11)
    {
        int[] v0_3;
        if (!(p11 instanceof com.alightcreative.account.A$nn)) {
            v0_3 = new com.alightcreative.account.A$nn(this, p11);
        } else {
            v0_3 = ((com.alightcreative.account.A$nn) p11);
            com.alightcreative.account.A v1_4 = ((com.alightcreative.account.A$nn) p11).q;
            if ((v1_4 & -2147483648) == 0) {
            } else {
                ((com.alightcreative.account.A$nn) p11).q = (v1_4 - -2147483648);
            }
        }
        com.alightcreative.account.A v1_3;
        com.alightcreative.account.A$nn v5 = v0_3;
        kotlin.NoWhenBranchMatchedException v11_1 = v5.cD;
        int[] v0_1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        com.alightcreative.account.A v1_1 = v5.q;
        int v8 = 0;
        try {
            if (v1_1 == null) {
                kotlin.ResultKt.throwOnFailure(v11_1);
                this.M = 0;
                try {
                    com.alightcreative.account.A v1_2 = this.hUw;
                    v5.j = this;
                    v5.q = 1;
                    v11_1 = com.alightcreative.account.IAPMiddleware.E(v1_2, 1, 0, v5, 2, 0);
                } catch (int[] v0_4) {
                    kotlin.NoWhenBranchMatchedException v11_2 = v0_4;
                    v1_3 = this;
                    kotlin.NoWhenBranchMatchedException v11_6 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(v11_2));
                }
                if (v11_1 != v0_1) {
                    v1_3 = this;
                    v11_6 = kotlin.Result.constructor-impl(((com.alightcreative.account.IAPMiddleware$A) v11_1));
                } else {
                    return v0_1;
                }
            } else {
                if (v1_1 != 1) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                } else {
                    v1_3 = ((com.alightcreative.account.A) v5.j);
                    kotlin.ResultKt.throwOnFailure(v11_1);
                }
            }
        } catch (int[] v0_7) {
            v11_2 = v0_7;
        }
        if (kotlin.Result.exceptionOrNull-impl(v11_6) != null) {
            v1_3.M = 1;
        }
        if (kotlin.Result.isSuccess-impl(v11_6)) {
            switch (com.alightcreative.account.A$XSt.$EnumSwitchMapping$0[((com.alightcreative.account.IAPMiddleware$A) v11_6).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 5:
                case 6:
                    v8 = 1;
                    break;
                default:
                    throw new kotlin.NoWhenBranchMatchedException();
            }
            v1_3.M = v8;
        }
        return kotlin.Unit.INSTANCE;
    }

    private final void wx()
    {
        com.alightcreative.account.A$h.q.j().E(1);
        return;
    }

    public static synthetic String x1(java.util.List p0)
    {
        return com.alightcreative.account.A.CB(p0);
    }

    private static final String y3P()
    {
        return "IAP: onActivityResume";
    }

    private final void ygC(E3.A p3, java.util.Set p4)
    {
        org.json.JSONObject v0_3 = new java.util.ArrayList();
        TV.n v4_3 = ((Iterable) p4).iterator();
        while (v4_3.hasNext()) {
            TV.xfY$KLa v1_5 = EY.V.hUw(((Vbv.mW) v4_3.next()));
            if (v1_5 != null) {
                v0_3.add(v1_5);
            }
        }
        TV.n v4_5 = new org.json.JSONArray(v0_3);
        org.json.JSONObject v0_2 = new org.json.JSONObject();
        v0_2.put("active_benefits", v4_5);
        this.X.hUw(new TV.xfY$KLa(v0_2));
        p3.x(v0_2);
        return;
    }

    public static final synthetic Object yy(com.alightcreative.account.A p0, java.util.Collection p1, kotlin.coroutines.Continuation p2)
    {
        return p0.s(p1, p2);
    }

    public static synthetic String z(java.util.List p0)
    {
        return com.alightcreative.account.A.jfW(p0);
    }

    public static final synthetic void z2f(com.alightcreative.account.A p0, java.util.List p1)
    {
        p0.Hm = p1;
        return;
    }

    static synthetic Object z8(com.alightcreative.account.A p0, boolean p1, kotlin.coroutines.Continuation p2, int p3, Object p4)
    {
        if ((p3 & 1) != 0) {
            p1 = 0;
        }
        return p0.rPC(p1, p2);
    }

    private final void zO(java.util.List p4, String p5)
    {
        this.Bb = p4;
        this.Z5u = Vbv.V.x;
        this.nvG = p5;
        com.alightcreative.app.motion.persist.xfY v0_1 = com.alightcreative.app.motion.persist.xfY.INSTANCE;
        long v1_3 = FKt.eWj.hUw().adapter(java.util.List);
        kotlin.jvm.internal.Intrinsics.checkNotNull(v1_3);
        String v4_1 = v1_3.toJson(p4);
        kotlin.jvm.internal.Intrinsics.checkNotNull(v4_1);
        v0_1.setLicenseInfo(v4_1);
        v0_1.setLicenseCacheVersion(v0_1.getLICENSE_CACHE_VERSION());
        v0_1.setAccountInfoCacheDate(this.cLW());
        v0_1.setLicenseUid(p5);
        return;
    }

    public static final synthetic E3.A za(com.alightcreative.account.A p0)
    {
        return p0.j;
    }

    public static final synthetic Object zm(com.alightcreative.account.A p0, kotlin.coroutines.Continuation p1)
    {
        return p0.qxC(p1);
    }

    public rKn.g E()
    {
        return this.IB;
    }

    public rKn.g F0()
    {
        return this.l;
    }

    public Object FT(kotlin.coroutines.Continuation p2)
    {
        kotlin.Unit v2_1 = this.d.await(p2);
        if (v2_1 != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return kotlin.Unit.INSTANCE;
        } else {
            return v2_1;
        }
    }

    public void H(java.util.List p8, com.alightcreative.account.IAPItemType p9)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "productIds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "itemType");
        java.util.ArrayList v0_3 = new java.util.ArrayList();
        int v8_3 = p8.iterator();
        while (v8_3.hasNext()) {
            QdR.d v1_1 = v8_3.next();
            if (!this.X9x.contains(((String) v1_1))) {
                v0_3.add(v1_1);
            }
        }
        if (!v0_3.isEmpty()) {
            QdR.K.x(this.jE, 0, 0, new com.alightcreative.account.A$c(this, v0_3, p9, 0), 3, 0);
        }
        return;
    }

    public java.util.List IB()
    {
        return com.alightcreative.account.F.T.hUw().R6();
    }

    public void LV()
    {
        fx.Enc.H(this, new Vbv.BM());
        QdR.K.x(this.jE, 0, 0, new com.alightcreative.account.A$Sq(this, 0), 3, 0);
        return;
    }

    public rKn.g Q()
    {
        return this.ak;
    }

    public rKn.g R6()
    {
        return this.db;
    }

    public void T()
    {
        QdR.K.x(this.jE, 0, 0, new com.alightcreative.account.A$soy(this, 0), 3, 0);
        return;
    }

    public java.util.Set X()
    {
        return com.alightcreative.account.F.T.hUw().x();
    }

    public rKn.g ah()
    {
        return this.cLW;
    }

    public boolean cD()
    {
        return this.ah;
    }

    public long cLW()
    {
        return Math.max(this.hUw.w(), System.currentTimeMillis());
    }

    public boolean db()
    {
        return this.FT;
    }

    public String hUw()
    {
        return this.F0;
    }

    public void hk(String p1)
    {
        this.F0 = p1;
        return;
    }

    public void j()
    {
        fx.Enc.H(this, new Vbv.Uk());
        if (!FKt.qfV.hUw()) {
            throw new IllegalStateException("Check failed.");
        } else {
            if (!this.GO) {
                this.GO = 1;
                int v1_1 = ZiE.A.j().getApplicationContext();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v1_1, "getApplicationContext(...)");
                fx.c.ak(v1_1, new Vbv.VI(this));
                com.alightcreative.account.A.V(this, 0, 1, 0);
                this.T();
                QdR.K.x(this.jE, 0, 0, new com.alightcreative.account.A$hz8(this, 0), 3, 0);
                QdR.K.x(this.jE, 0, 0, new com.alightcreative.account.A$q(this, 0), 3, 0);
                return;
            } else {
                return;
            }
        }
    }

    public rKn.g jE()
    {
        return this.uKP;
    }

    public void l(android.app.Activity p3)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "activity");
        if (this.LV) {
            FKt.c.x(p3, 2132019131, 2132019130);
        }
        this.pM1();
        return;
    }

    public void ojl()
    {
        fx.Enc.H(this, new Vbv.Ep());
        QdR.K.x(this.jE, 0, 0, new com.alightcreative.account.A$Y(this, 0), 3, 0);
        return;
    }

    public void pM1()
    {
        this.LV = 0;
        return;
    }

    public void q(com.google.firebase.auth.FirebaseAuth p8)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "auth");
        Vbv.nn v0_1 = this.w0;
        if (v0_1 != null) {
            v0_1.remove();
        }
        this.w0 = 0;
        com.google.firebase.auth.FirebaseUser v1_1 = this.Zq;
        if (v1_1 != null) {
            v1_1.remove();
        }
        Boolean v6_0;
        this.Zq = 0;
        com.google.firebase.auth.FirebaseUser v1_0 = p8.uKP();
        com.google.firebase.firestore.FirebaseFirestore v2 = com.google.firebase.firestore.FirebaseFirestore.q();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v2, "getInstance(...)");
        boolean v5 = 1;
        if (v1_0 == null) {
            v6_0 = 0;
        } else {
            v6_0 = 1;
        }
        this.E.cD(Boolean.valueOf(v6_0));
        this.ah = Jvx.xfY.hUw(p8);
        this.hUw.cLW(this.cD());
        if (v1_0 != null) {
            v5 = v1_0.VJy();
        }
        com.google.firebase.firestore.q v8_3;
        this.FT = v5;
        if (v1_0 == null) {
            v8_3 = 0;
        } else {
            v8_3 = v1_0.ygC();
        }
        this.hk(v8_3);
        this.hUw.pM1(this.hUw());
        this.jV();
        if (v1_0 == null) {
            this.VJy(this.j, 0);
            this.ojl.cD(0);
            this.T.cD(0);
            this.w.cD(0);
        } else {
            com.google.firebase.firestore.q v8_9 = v1_0.ygC();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v8_9, "getUid(...)");
            this.QP(v8_9);
            this.wx();
            this.w0 = v2.cD("account").T(v1_0.ygC()).x(new Vbv.Gc(this, v1_0));
        }
        if (this.Zq == null) {
            this.Zq = v2.cD("client_config").T("cloud_storage").x(new Vbv.nn(this));
        }
        return;
    }

    public void uKP()
    {
        fx.Enc.X("IAP", new Vbv.K());
        this.hUw.H();
        this.M = 1;
        this.v9(1);
        return;
    }

    public void w()
    {
        fx.Enc.X("IAP", new Vbv.hz8());
        com.alightcreative.account.A.V(this, 0, 1, 0);
        return;
    }

    public void x()
    {
        QdR.K.x(this.jE, 0, 0, new com.alightcreative.account.A$Ki(this, 0), 3, 0);
        return;
    }
}
