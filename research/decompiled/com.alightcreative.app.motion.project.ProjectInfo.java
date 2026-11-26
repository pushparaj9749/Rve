package com.alightcreative.app.motion.project;
public abstract class ProjectInfo {
    public static final int $stable;

    static ProjectInfo()
    {
        return;
    }

    private ProjectInfo()
    {
        return;
    }

    public synthetic ProjectInfo(kotlin.jvm.internal.DefaultConstructorMarker p1)
    {
        return;
    }

    public abstract int getDuration();

    public abstract int getFfVer();

    public abstract long getFileSize();

    public abstract int getFphs();

    public abstract int getHeight();

    public abstract String getId();

    public abstract long getLastModified();

    public abstract String getTitle();

    public abstract com.alightcreative.app.motion.scene.SceneType getType();

    public abstract int getWidth();

    public final boolean isTemplate()
    {
        if ((!(this instanceof com.alightcreative.app.motion.project.ProjectInfo$A)) || ((((com.alightcreative.app.motion.project.ProjectInfo$A) this).j() == null) || (((com.alightcreative.app.motion.project.ProjectInfo$A) this).getType() == com.alightcreative.app.motion.scene.SceneType.PRESET))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isXml()
    {
        if ((!(this instanceof com.alightcreative.app.motion.project.ProjectInfo$A)) || ((((com.alightcreative.app.motion.project.ProjectInfo$A) this).j() == null) || ((((com.alightcreative.app.motion.project.ProjectInfo$A) this).getType() == com.alightcreative.app.motion.scene.SceneType.PRESET) || (pg.Tn.Zq(((com.alightcreative.app.motion.project.ProjectInfo$A) this).j()) != null)))) {
            return 0;
        } else {
            return 1;
        }
    }
}
