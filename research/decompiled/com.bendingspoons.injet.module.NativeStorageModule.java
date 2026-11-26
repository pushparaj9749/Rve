package com.bendingspoons.injet.module;
public abstract class NativeStorageModule implements HX.xfY {

    static NativeStorageModule()
    {
        return;
    }

    public NativeStorageModule()
    {
        return;
    }

    public abstract Object R6(com.bendingspoons.injet.module.NativeStorageModule$SetValueInput p0, kotlin.coroutines.Continuation p1);

    public abstract Object cD(String p0, kotlin.coroutines.Continuation p1);

    public void hUw(com.bendingspoons.injet.webbridge.XSt p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "scope");
        p4.hUw("get", new com.bendingspoons.injet.module.NativeStorageModule$h(new com.bendingspoons.injet.module.NativeStorageModule$xfY(this), 0));
        p4.hUw("set", new com.bendingspoons.injet.module.NativeStorageModule$XSt(new com.bendingspoons.injet.module.NativeStorageModule$A(this), 0));
        p4.hUw("remove", new com.bendingspoons.injet.module.NativeStorageModule$V(new com.bendingspoons.injet.module.NativeStorageModule$CU(this), 0));
        return;
    }

    public String j()
    {
        return "NativeStorage";
    }

    public abstract Object x(String p0, kotlin.coroutines.Continuation p1);
}
