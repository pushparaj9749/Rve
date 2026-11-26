package com.bendingspoons.injet.webbridge;
public final class AndroidBridge {
    public static final int $stable = 0;
    public static final com.bendingspoons.injet.webbridge.AndroidBridge$Companion Companion = None;
    private static final String INTERFACE = "androidBridge";
    private final QdR.d coroutineScope;
    private final kotlin.jvm.functions.Function2 evaluateJavascript;
    private final java.util.Map functionCallbacks;
    private final java.util.Map nativeFunctions;
    private final BD.h spiderSense;

    static AndroidBridge()
    {
        com.bendingspoons.injet.webbridge.AndroidBridge.Companion = new com.bendingspoons.injet.webbridge.AndroidBridge$Companion(0);
        com.bendingspoons.injet.webbridge.AndroidBridge.$stable = 8;
        return;
    }

    public AndroidBridge(java.util.Map p2, java.util.Map p3, BD.h p4, kotlin.jvm.functions.Function2 p5, QdR.d p6)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "functionCallbacks");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "nativeFunctions");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "spiderSense");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "evaluateJavascript");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p6, "coroutineScope");
        this.functionCallbacks = p2;
        this.nativeFunctions = p3;
        this.spiderSense = p4;
        this.evaluateJavascript = p5;
        this.coroutineScope = p6;
        return;
    }

    public static final synthetic kotlin.jvm.functions.Function2 access$getEvaluateJavascript$p(com.bendingspoons.injet.webbridge.AndroidBridge p0)
    {
        return p0.evaluateJavascript;
    }

    public static final synthetic BD.h access$getSpiderSense$p(com.bendingspoons.injet.webbridge.AndroidBridge p0)
    {
        return p0.spiderSense;
    }

    private static final String callNativeFunction$lambda$1(String p2)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("[WARNING] native function ");
        v0_1.append(p2);
        v0_1.append(" could not be found.");
        return v0_1.toString();
    }

    private static final String executeWebFunction$lambda$0(String p1, String p2)
    {
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append(p1);
        v0_1.append(", ");
        v0_1.append(p2);
        return v0_1.toString();
    }

    public static synthetic String hUw(String p0, String p1)
    {
        return com.bendingspoons.injet.webbridge.AndroidBridge.executeWebFunction$lambda$0(p0, p1);
    }

    public static synthetic String j(String p0)
    {
        return com.bendingspoons.injet.webbridge.AndroidBridge.callNativeFunction$lambda$1(p0);
    }

    public final void callNativeFunction(String p9, String p10, String p11)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "functionName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p11, "callbackId");
        kotlin.jvm.functions.Function2 v6_1 = ((kotlin.jvm.functions.Function2) this.nativeFunctions.get(p9));
        if (v6_1 != null) {
            QdR.K.x(this.coroutineScope, 0, 0, new com.bendingspoons.injet.webbridge.AndroidBridge$callNativeFunction$2(p11, this, p9, p10, v6_1, 0), 3, 0);
            return;
        } else {
            GQ.xfY.hUw.hUw("callNativeFunction", new com.bendingspoons.injet.webbridge.A(p9));
            GQ.CU.hUw(this.spiderSense, new GQ.A$xfY$c(p9));
            return;
        }
    }

    public final void executeWebFunction(String p4, String p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "jsOutput");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "nativeCallbackId");
        GQ.xfY.hUw.hUw("executeWebFunction", new com.bendingspoons.injet.webbridge.xfY(p4, p5));
        GQ.A$xfY$K v0_4 = ((com.bendingspoons.injet.webbridge.WebOutput) Rw.CU.j().adapter(com.bendingspoons.injet.webbridge.WebOutput).fromJson(p4));
        if (v0_4 == null) {
            GQ.CU.hUw(this.spiderSense, new GQ.A$xfY$qfV(p4));
        }
        BQ.A$A v1_2;
        BD.h v4_1 = 0;
        if (v0_4 == null) {
            v1_2 = 0;
        } else {
            v1_2 = v0_4.getType();
        }
        BD.h v4_2;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(v1_2, "success")) {
            if (v0_4 != null) {
                v4_1 = v0_4.getData();
            }
            v4_2 = new BQ.A$A(new Exception(v4_1));
        } else {
            GQ.A$xfY$K v0_7 = v0_4.getData();
            if (v0_7 == null) {
                v0_7 = "";
            }
            v4_2 = new BQ.A$CU(v0_7);
        }
        GQ.A$xfY$K v0_10 = ((kotlin.jvm.functions.Function1) this.functionCallbacks.get(p5));
        if (v0_10 != null) {
            v0_10.invoke(v4_2);
            return;
        } else {
            GQ.CU.hUw(this.spiderSense, new GQ.A$xfY$K(p5));
            return;
        }
    }
}
