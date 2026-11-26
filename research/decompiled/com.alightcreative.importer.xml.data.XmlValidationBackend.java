package com.alightcreative.importer.xml.data;
public final class XmlValidationBackend {
    public static final int $stable = 8;
    private final kotlin.Lazy validateXMLBeforeImporting$delegate;

    static XmlValidationBackend()
    {
        return;
    }

    public XmlValidationBackend()
    {
        this.validateXMLBeforeImporting$delegate = kotlin.LazyKt.lazy(new lc.h());
        return;
    }

    public static synthetic kotlin.jvm.functions.Function2 hUw()
    {
        return com.alightcreative.importer.xml.data.XmlValidationBackend.validateXMLBeforeImporting_delegate$lambda$0();
    }

    private static final kotlin.jvm.functions.Function2 validateXMLBeforeImporting_delegate$lambda$0()
    {
        return new com.alightcreative.importer.xml.data.XmlValidationBackend$xfY("validateProjectPackageXML", com.google.firebase.functions.A.uKP.cD().l("validateProjectPackageXML"), 0);
    }

    public final kotlin.jvm.functions.Function2 getValidateXMLBeforeImporting()
    {
        return ((kotlin.jvm.functions.Function2) this.validateXMLBeforeImporting$delegate.getValue());
    }
}
