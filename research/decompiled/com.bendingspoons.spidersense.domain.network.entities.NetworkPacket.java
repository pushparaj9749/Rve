package com.bendingspoons.spidersense.domain.network.entities;
public final class NetworkPacket {
    public static final int $stable = 8;
    private final java.util.List events;
    private final double sentAt;
    private final String userId;

    static NetworkPacket()
    {
        return;
    }

    public NetworkPacket(String p2, double p3, java.util.List p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "userId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "events");
        this.userId = p2;
        this.sentAt = p3;
        this.events = p5;
        return;
    }

    public static synthetic com.bendingspoons.spidersense.domain.network.entities.NetworkPacket copy$default(com.bendingspoons.spidersense.domain.network.entities.NetworkPacket p0, String p1, double p2, java.util.List p4, int p5, Object p6)
    {
        if ((p5 & 1) != 0) {
            p1 = p0.userId;
        }
        if ((p5 & 2) != 0) {
            p2 = p0.sentAt;
        }
        if ((p5 & 4) != 0) {
            p4 = p0.events;
        }
        return p0.copy(p1, p2, p4);
    }

    public final String component1()
    {
        return this.userId;
    }

    public final double component2()
    {
        return this.sentAt;
    }

    public final java.util.List component3()
    {
        return this.events;
    }

    public final com.bendingspoons.spidersense.domain.network.entities.NetworkPacket copy(String p2, double p3, java.util.List p5)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "userId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p5, "events");
        return new com.bendingspoons.spidersense.domain.network.entities.NetworkPacket(p2, p3, p5);
    }

    public boolean equals(Object p8)
    {
        if (this != p8) {
            if ((p8 instanceof com.bendingspoons.spidersense.domain.network.entities.NetworkPacket)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.userId, ((com.bendingspoons.spidersense.domain.network.entities.NetworkPacket) p8).userId)) {
                    if (Double.compare(this.sentAt, ((com.bendingspoons.spidersense.domain.network.entities.NetworkPacket) p8).sentAt) == 0) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.events, ((com.bendingspoons.spidersense.domain.network.entities.NetworkPacket) p8).events)) {
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
            return 1;
        }
    }

    public final java.util.List getEvents()
    {
        return this.events;
    }

    public final double getSentAt()
    {
        return this.sentAt;
    }

    public final String getUserId()
    {
        return this.userId;
    }

    public int hashCode()
    {
        return ((((this.userId.hashCode() * 31) + Double.hashCode(this.sentAt)) * 31) + this.events.hashCode());
    }

    public String toString()
    {
        String v0_0 = this.userId;
        double v1 = this.sentAt;
        java.util.List v3 = this.events;
        StringBuilder v4_1 = new StringBuilder();
        v4_1.append("NetworkPacket(userId=");
        v4_1.append(v0_0);
        v4_1.append(", sentAt=");
        v4_1.append(v1);
        v4_1.append(", events=");
        v4_1.append(v3);
        v4_1.append(")");
        return v4_1.toString();
    }
}
