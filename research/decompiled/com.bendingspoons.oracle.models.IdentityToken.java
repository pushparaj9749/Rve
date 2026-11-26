package com.bendingspoons.oracle.models;
public final class IdentityToken {
    public static final int $stable;
    public static final com.bendingspoons.oracle.models.IdentityToken$xfY Companion;
    private final java.util.Date expirationDate;
    private final String token;
    private final com.bendingspoons.oracle.models.IdentityToken$A type;

    static IdentityToken()
    {
        com.bendingspoons.oracle.models.IdentityToken.Companion = new com.bendingspoons.oracle.models.IdentityToken$xfY(0);
        com.bendingspoons.oracle.models.IdentityToken.$stable = 8;
        return;
    }

    public IdentityToken(String p2, com.bendingspoons.oracle.models.IdentityToken$A p3, java.util.Date p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "token");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "expirationDate");
        this.token = p2;
        this.type = p3;
        this.expirationDate = p4;
        return;
    }

    public static synthetic com.bendingspoons.oracle.models.IdentityToken copy$default(com.bendingspoons.oracle.models.IdentityToken p0, String p1, com.bendingspoons.oracle.models.IdentityToken$A p2, java.util.Date p3, int p4, Object p5)
    {
        if ((p4 & 1) != 0) {
            p1 = p0.token;
        }
        if ((p4 & 2) != 0) {
            p2 = p0.type;
        }
        if ((p4 & 4) != 0) {
            p3 = p0.expirationDate;
        }
        return p0.copy(p1, p2, p3);
    }

    public final String component1()
    {
        return this.token;
    }

    public final com.bendingspoons.oracle.models.IdentityToken$A component2()
    {
        return this.type;
    }

    public final java.util.Date component3()
    {
        return this.expirationDate;
    }

    public final com.bendingspoons.oracle.models.IdentityToken copy(String p2, com.bendingspoons.oracle.models.IdentityToken$A p3, java.util.Date p4)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "token");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p3, "type");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p4, "expirationDate");
        return new com.bendingspoons.oracle.models.IdentityToken(p2, p3, p4);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.bendingspoons.oracle.models.IdentityToken)) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.token, ((com.bendingspoons.oracle.models.IdentityToken) p5).token)) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(this.type, ((com.bendingspoons.oracle.models.IdentityToken) p5).type)) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, ((com.bendingspoons.oracle.models.IdentityToken) p5).expirationDate)) {
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

    public final java.util.Date getExpirationDate()
    {
        return this.expirationDate;
    }

    public final String getSub()
    {
        kotlin.NoWhenBranchMatchedException v0_0 = this.type;
        if (!(v0_0 instanceof com.bendingspoons.oracle.models.IdentityToken$A$A)) {
            if (!(v0_0 instanceof com.bendingspoons.oracle.models.IdentityToken$A$xfY)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                return ((com.bendingspoons.oracle.models.IdentityToken$A$xfY) v0_0).hUw();
            }
        } else {
            return ((com.bendingspoons.oracle.models.IdentityToken$A$A) v0_0).hUw();
        }
    }

    public final String getToken()
    {
        return this.token;
    }

    public final com.bendingspoons.oracle.models.IdentityToken$A getType()
    {
        return this.type;
    }

    public int hashCode()
    {
        return ((((this.token.hashCode() * 31) + this.type.hashCode()) * 31) + this.expirationDate.hashCode());
    }

    public final boolean isLoggedIn()
    {
        kotlin.NoWhenBranchMatchedException v0_0 = this.type;
        if (!(v0_0 instanceof com.bendingspoons.oracle.models.IdentityToken$A$A)) {
            if (!(v0_0 instanceof com.bendingspoons.oracle.models.IdentityToken$A$xfY)) {
                throw new kotlin.NoWhenBranchMatchedException();
            } else {
                return new java.util.Date().before(this.expirationDate);
            }
        } else {
            return 0;
        }
    }

    public String toString()
    {
        String v0_0 = this.token;
        com.bendingspoons.oracle.models.IdentityToken$A v1 = this.type;
        java.util.Date v2 = this.expirationDate;
        StringBuilder v3_1 = new StringBuilder();
        v3_1.append("IdentityToken(token=");
        v3_1.append(v0_0);
        v3_1.append(", type=");
        v3_1.append(v1);
        v3_1.append(", expirationDate=");
        v3_1.append(v2);
        v3_1.append(")");
        return v3_1.toString();
    }
}
