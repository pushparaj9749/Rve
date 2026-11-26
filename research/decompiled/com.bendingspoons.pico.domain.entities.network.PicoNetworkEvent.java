package com.bendingspoons.pico.domain.entities.network;
public final class PicoNetworkEvent {
    private final String app;
    private Object data;
    private final String id;
    private double requestTimestamp;
    private final double timestamp;
    private String type;
    private final com.bendingspoons.pico.domain.entities.network.PicoNetworkUser user;

    public PicoNetworkEvent(String p2, double p3, double p5, String p7, com.bendingspoons.pico.domain.entities.network.PicoNetworkUser p8, String p9, Object p10)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p7, "app");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p8, "user");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p9, "type");
        this.id = p2;
        this.timestamp = p3;
        this.requestTimestamp = p5;
        this.app = p7;
        this.user = p8;
        this.type = p9;
        this.data = p10;
        return;
    }

    public static synthetic com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent copy$default(com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent p0, String p1, double p2, double p4, String p6, com.bendingspoons.pico.domain.entities.network.PicoNetworkUser p7, String p8, Object p9, int p10, Object p11)
    {
        if ((p10 & 1) != 0) {
            p1 = p0.id;
        }
        if ((p10 & 2) != 0) {
            p2 = p0.timestamp;
        }
        if ((p10 & 4) != 0) {
            p4 = p0.requestTimestamp;
        }
        if ((p10 & 8) != 0) {
            p6 = p0.app;
        }
        if ((p10 & 16) != 0) {
            p7 = p0.user;
        }
        if ((p10 & 32) != 0) {
            p8 = p0.type;
        }
        if ((p10 & 64) != 0) {
            p9 = p0.data;
        }
        return p0.copy(p1, p2, p4, p6, p7, p8, p9);
    }

    public final String component1()
    {
        return this.id;
    }

    public final double component2()
    {
        return this.timestamp;
    }

    public final double component3()
    {
        return this.requestTimestamp;
    }

    public final String component4()
    {
        return this.app;
    }

    public final com.bendingspoons.pico.domain.entities.network.PicoNetworkUser component5()
    {
        return this.user;
    }

    public final String component6()
    {
        return this.type;
    }

    public final Object component7()
    {
        return this.data;
    }

    public final com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent copy(String p12, double p13, double p15, String p17, com.bendingspoons.pico.domain.entities.network.PicoNetworkUser p18, String p19, Object p20)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p12, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p17, "app");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p18, "user");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p19, "type");
        return new com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent(p12, p13, p15, p17, p18, p19, p20);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.id, ((com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent) p8).id)) {
                    if (Double.compare(this.timestamp, ((com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent) p8).timestamp) == 0) {
                        if (Double.compare(this.requestTimestamp, ((com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent) p8).requestTimestamp) == 0) {
                            if (kotlin.jvm.internal.Intrinsics.areEqual(this.app, ((com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent) p8).app)) {
                                if (kotlin.jvm.internal.Intrinsics.areEqual(this.user, ((com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent) p8).user)) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.type, ((com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent) p8).type)) {
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent) p8).data)) {
                                            return 1;
                                        } else {
                                            return 0;
                                        }
                                    } else {
                                        return 0;
                                    }
                                } else {
                                    return 0;
                                }
                            } else {
                                return 0;
                            }
                        } else {
                            return 0;
                        }
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final String getApp()
    {
        return this.app;
    }

    public final Object getData()
    {
        return this.data;
    }

    public final String getId()
    {
        return this.id;
    }

    public final double getRequestTimestamp()
    {
        return this.requestTimestamp;
    }

    public final double getTimestamp()
    {
        return this.timestamp;
    }

    public final String getType()
    {
        return this.type;
    }

    public final com.bendingspoons.pico.domain.entities.network.PicoNetworkUser getUser()
    {
        return this.user;
    }

    public int hashCode()
    {
        int v1_8;
        int v0_9 = (((((((((((this.id.hashCode() * 31) + Double.hashCode(this.timestamp)) * 31) + Double.hashCode(this.requestTimestamp)) * 31) + this.app.hashCode()) * 31) + this.user.hashCode()) * 31) + this.type.hashCode()) * 31);
        int v1_7 = this.data;
        if (v1_7 != 0) {
            v1_8 = v1_7.hashCode();
        } else {
            v1_8 = 0;
        }
        return (v0_9 + v1_8);
    }

    public final void setData(Object p1)
    {
        this.data = p1;
        return;
    }

    public final void setRequestTimestamp(double p1)
    {
        this.requestTimestamp = p1;
        return;
    }

    public final void setType(String p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "<set-?>");
        this.type = p2;
        return;
    }

    public String toString()
    {
        String v0_0 = this.id;
        double v1 = this.timestamp;
        double v3 = this.requestTimestamp;
        String v5 = this.app;
        com.bendingspoons.pico.domain.entities.network.PicoNetworkUser v6 = this.user;
        String v7 = this.type;
        Object v8 = this.data;
        StringBuilder v9_1 = new StringBuilder();
        v9_1.append("PicoNetworkEvent(id=");
        v9_1.append(v0_0);
        v9_1.append(", timestamp=");
        v9_1.append(v1);
        v9_1.append(", requestTimestamp=");
        v9_1.append(v3);
        v9_1.append(", app=");
        v9_1.append(v5);
        v9_1.append(", user=");
        v9_1.append(v6);
        v9_1.append(", type=");
        v9_1.append(v7);
        v9_1.append(", data=");
        v9_1.append(v8);
        v9_1.append(")");
        return v9_1.toString();
    }
}
