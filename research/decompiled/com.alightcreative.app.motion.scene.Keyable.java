package com.alightcreative.app.motion.scene;
public interface Keyable {

    public abstract com.alightcreative.app.motion.scene.Keyable copyWith(java.util.List p0, boolean p1, java.util.List p2);

    public abstract java.util.List getAnimators();

    public abstract boolean getKeyed();

    public abstract java.util.List getKeyframes();

    public abstract Object interp(Object p0, Object p1, float p2);
}
