package com.alightcreative.app.motion.scene;
public final class SceneHolderImpl implements com.alightcreative.app.motion.scene.SceneHolder {
    public static final int $stable = 8;
    private int _editingSerial;
    private com.alightcreative.app.motion.scene.Scene _rootScene;
    private com.alightcreative.app.motion.scene.Scene _scene;
    private java.util.List callbacks;
    private com.alightcreative.app.motion.scene.EditCategory editCategory;
    private int editMode;
    private java.util.List editingNestedSceneIds;
    private com.alightcreative.app.motion.scene.SceneHolderState sceneHolderState;
    private com.alightcreative.app.motion.scene.SceneSelection selection;
    private com.alightcreative.app.motion.scene.SpoidEnv spoidEnv;
    private xT.yH userPreviewMode;

    static SceneHolderImpl()
    {
        return;
    }

    public SceneHolderImpl(com.alightcreative.app.motion.scene.Scene p23)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p23, "initialScene");
        com.alightcreative.app.motion.scene.SceneHolderImpl v0_1 = ;
v0_1.spoidEnv = new com.alightcreative.app.motion.scene.SpoidEnv(0, 0, 0, 0, 15, 0);
        v0_1.userPreviewMode = new xT.yH(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 32767, 0);
        v0_1.selection = com.alightcreative.app.motion.scene.SceneKt.getEMPTY_SCENE_SELECTION();
        v0_1._scene = p23;
        v0_1._rootScene = p23;
        v0_1.editingNestedSceneIds = kotlin.collections.CollectionsKt.emptyList();
        v0_1.callbacks = kotlin.collections.CollectionsKt.emptyList();
        v0_1.sceneHolderState = new com.alightcreative.app.motion.scene.SceneHolderState(v0_1._scene, v0_1.getSelection(), v0_1.getEditMode(), v0_1.getUserPreviewMode(), 0, 16, 0);
        return;
    }

    public static synthetic String R6(com.alightcreative.app.motion.scene.SceneHolderImpl p0)
    {
        return com.alightcreative.app.motion.scene.SceneHolderImpl._set_userPreviewMode_$lambda$1(p0);
    }

    private static final String _set_editMode_$lambda$0(com.alightcreative.app.motion.scene.SceneHolderImpl p11, int p12)
    {
        String v11_4;
        String v0_4 = new Throwable().getStackTrace()[1].getMethodName();
        String v4_0 = "0";
        if (p11.editMode != 0) {
            String[] v5_0 = ZiE.A.j().getResources().getResourceName(p11.editMode);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v5_0, "getResourceName(...)");
            v11_4 = ((String) kotlin.collections.CollectionsKt.last(kotlin.text.StringsKt.split$default(v5_0, new String[] {"/"}), 0, 0, 6, 0)));
        } else {
            v11_4 = "0";
        }
        if (p12 != null) {
            String v4_1 = ZiE.A.j().getResources().getResourceName(p12);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v4_1, "getResourceName(...)");
            v4_0 = ((String) kotlin.collections.CollectionsKt.last(kotlin.text.StringsKt.split$default(v4_1, new String[] {"/"}), 0, 0, 6, 0)));
        }
        StringBuilder v12_4 = new StringBuilder();
        v12_4.append("SceneHolder:EditMode Changed -- ");
        v12_4.append(v11_4);
        v12_4.append(" -> ");
        v12_4.append(v4_0);
        v12_4.append(" (by ");
        v12_4.append(v0_4);
        v12_4.append(")");
        return v12_4.toString();
    }

    private static final String _set_scene_$lambda$2(com.alightcreative.app.motion.scene.Scene p2)
    {
        String v2_3 = p2.getElements().size();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("Update scene: layers=");
        v0_1.append(v2_3);
        return v0_1.toString();
    }

    private static final String _set_scene_$lambda$3()
    {
        return "Update Scene (BEFORE) : (ROOT)";
    }

    private static final String _set_scene_$lambda$5$lambda$4(java.util.List p5, com.alightcreative.app.motion.scene.SceneElement p6)
    {
        String v5_7 = kotlin.text.StringsKt.repeat(".   ", p5.size());
        long v0_1 = p6.getId();
        String v2_0 = p6.getType().name();
        String v6_1 = p6.getLabel();
        StringBuilder v3_1 = new StringBuilder();
        v3_1.append("Update Scene (BEFORE) : ");
        v3_1.append(v5_7);
        v3_1.append(".");
        v3_1.append(v0_1);
        v3_1.append(" (");
        v3_1.append(v2_0);
        v3_1.append(":");
        v3_1.append(v6_1);
        v3_1.append(")");
        return v3_1.toString();
    }

    private static final String _set_scene_$lambda$6()
    {
        return "Update Scene (AFTER)  : (ROOT)";
    }

    private static final String _set_scene_$lambda$8$lambda$7(java.util.List p5, com.alightcreative.app.motion.scene.SceneElement p6)
    {
        String v5_7 = kotlin.text.StringsKt.repeat(".   ", p5.size());
        long v0_1 = p6.getId();
        String v2_0 = p6.getType().name();
        String v6_1 = p6.getLabel();
        StringBuilder v3_1 = new StringBuilder();
        v3_1.append("Update Scene (AFTER)  : ");
        v3_1.append(v5_7);
        v3_1.append(".");
        v3_1.append(v0_1);
        v3_1.append(" (");
        v3_1.append(v2_0);
        v3_1.append(":");
        v3_1.append(v6_1);
        v3_1.append(")");
        return v3_1.toString();
    }

    private static final String _set_userPreviewMode_$lambda$1(com.alightcreative.app.motion.scene.SceneHolderImpl p2)
    {
        String v2_1 = p2.getUserPreviewMode();
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("userPreviewMode changed: ");
        v0_1.append(v2_1);
        return v0_1.toString();
    }

    public static synthetic String cD(com.alightcreative.app.motion.scene.Scene p0)
    {
        return com.alightcreative.app.motion.scene.SceneHolderImpl._set_scene_$lambda$2(p0);
    }

    private final void dispatchStateChange()
    {
        this.sceneHolderState = new com.alightcreative.app.motion.scene.SceneHolderState(this._scene, this.getSelection(), this.getEditMode(), this.getUserPreviewMode(), this.getEditCategory());
        java.util.Iterator v0_3 = this.callbacks.iterator();
        while (v0_3.hasNext()) {
            ((kotlin.jvm.functions.Function1) v0_3.next()).invoke(this.sceneHolderState);
        }
        return;
    }

    private static final String editNestedScene$lambda$9(long p6, com.alightcreative.app.motion.scene.SceneHolderImpl p8)
    {
        int v8_2;
        java.util.List v0 = p8.getEditingNestedSceneIds();
        int v1_1 = System.identityHashCode(p8.getRootScene());
        int v2_1 = System.identityHashCode(p8.getScene());
        boolean v3_1 = kotlin.jvm.internal.Intrinsics.areEqual(p8.getRootScene(), p8.getScene());
        if (p8.getRootScene() != p8.getScene()) {
            v8_2 = 0;
        } else {
            v8_2 = 1;
        }
        StringBuilder v4_3 = new StringBuilder();
        v4_3.append("editNestedScene(");
        v4_3.append(p6);
        v4_3.append("):  editingNestedSceneIds=");
        v4_3.append(v0);
        v4_3.append(" rootScene=");
        v4_3.append(v1_1);
        v4_3.append(" scene=");
        v4_3.append(v2_1);
        v4_3.append(" rootScene==scene:");
        v4_3.append(v3_1);
        v4_3.append(" rootScene===scene:");
        v4_3.append(v8_2);
        return v4_3.toString();
    }

    private final com.alightcreative.app.motion.scene.Scene getNestedScene(java.util.List p4)
    {
        com.alightcreative.app.motion.scene.Scene v0_0 = this._rootScene;
        java.util.Iterator v4_1 = p4.iterator();
        while (v4_1.hasNext()) {
            long vtmp4 = ((Number) v4_1.next()).longValue();
            if (v0_0 != null) {
                com.alightcreative.app.motion.scene.Scene v0_1 = com.alightcreative.app.motion.scene.SceneKt.elementById(v0_0, Long.valueOf(vtmp4));
                if (v0_1 != null) {
                    v0_0 = com.alightcreative.app.motion.scene.NestedSceneClippingKt.getNestedSceneApplyingClipping(v0_1);
                }
            }
            v0_0 = 0;
        }
        return v0_0;
    }

    public static synthetic String hUw(com.alightcreative.app.motion.scene.SceneHolderImpl p0, int p1)
    {
        return com.alightcreative.app.motion.scene.SceneHolderImpl._set_editMode_$lambda$0(p0, p1);
    }

    public static synthetic String j(com.alightcreative.app.motion.scene.SceneElement p0)
    {
        return com.alightcreative.app.motion.scene.SceneHolderImpl.update$lambda$15(p0);
    }

    public static synthetic String q(long p0, com.alightcreative.app.motion.scene.SceneHolderImpl p2)
    {
        return com.alightcreative.app.motion.scene.SceneHolderImpl.editNestedScene$lambda$9(p0, p2);
    }

    private static final String update$lambda$14(com.alightcreative.app.motion.scene.SceneElement p3)
    {
        long v0 = p3.getId();
        String v3_2 = new StringBuilder();
        v3_2.append("Updated element ");
        v3_2.append(v0);
        return v3_2.toString();
    }

    private static final String update$lambda$15(com.alightcreative.app.motion.scene.SceneElement p3)
    {
        String v0_0 = p3.getId();
        String v3_3 = new StringBuilder();
        v3_3.append(S0.sfUe.pHsbRqMPh.Mwyi);
        v3_3.append(v0_0);
        v3_3.append(" because it was not found in scene");
        return v3_3.toString();
    }

    public static synthetic String x(com.alightcreative.app.motion.scene.SceneElement p0)
    {
        return com.alightcreative.app.motion.scene.SceneHolderImpl.update$lambda$14(p0);
    }

    public com.alightcreative.app.motion.scene.SceneElement add(com.alightcreative.app.motion.scene.SceneElement p27, int p28)
    {
        com.alightcreative.app.motion.scene.Scene v2_2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p27, "element");
        com.alightcreative.app.motion.scene.SceneElement v1_1 = com.alightcreative.app.motion.scene.SceneKt.prepElementForAdd(this._scene, p27);
        int v3_3 = this.getScene();
        if (p28 < 0) {
            v2_2 = kotlin.collections.CollectionsKt.plus(this._scene.getElements(), v1_1);
        } else {
            v2_2 = FKt.g.hUw(this._scene.getElements(), p28, v1_1);
        }
        this.setScene(com.alightcreative.app.motion.scene.SceneKt.uniquifyIds(com.alightcreative.app.motion.scene.Scene.copy$default(v3_3, 0, 0, 0, 0, 0, 0, v2_2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1048511, 0)));
        return v1_1;
    }

    public void copyFrom(com.alightcreative.app.motion.scene.Scene p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "scene");
        this.setScene(p2);
        return;
    }

    public void duplicateAll(Iterable p62)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p62, "elementIds");
        java.util.ArrayList v2_6 = this._scene.getElements();
        java.util.ArrayList v3_1 = new java.util.ArrayList();
        java.util.ArrayList v2_0 = v2_6.iterator();
        while (v2_0.hasNext()) {
            java.util.LinkedHashMap v4_2 = v2_0.next();
            if (kotlin.collections.CollectionsKt.contains(p62, Long.valueOf(((com.alightcreative.app.motion.scene.SceneElement) v4_2).getId()))) {
                v3_1.add(v4_2);
            }
        }
        if (!v3_1.isEmpty()) {
            java.util.ArrayList v2_3 = new java.util.ArrayList();
            java.util.LinkedHashMap v4_3 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(p62, 10)), 16));
            java.util.Iterator v5_9 = p62.iterator();
            while (v5_9.hasNext()) {
                java.util.List v6_8 = v5_9.next();
                ((Number) v6_8).longValue();
                v4_3.put(v6_8, Long.valueOf(com.alightcreative.app.motion.scene.SceneKt.getNextAvailableId(this._scene)));
            }
            com.alightcreative.app.motion.scene.Scene v8 = this._scene;
            java.util.Iterator v5_10 = v8.getElements();
            java.util.ArrayList v15_1 = new java.util.ArrayList();
            java.util.Iterator v5_11 = v5_10.iterator();
            while (v5_11.hasNext()) {
                java.util.List v6_7;
                java.util.List v6_3 = ((com.alightcreative.app.motion.scene.SceneElement) v5_11.next());
                if (!v3_1.contains(v6_3)) {
                    v6_7 = kotlin.collections.CollectionsKt.listOf(v6_3);
                } else {
                    Long v7_18 = com.alightcreative.app.motion.scene.SceneElementKt.getDisplayLabel(v6_3);
                    java.util.List v9_7 = kotlin.text.StringsKt.getLastIndex(v7_18);
                    while (-1 < v9_7) {
                        int v11_4 = v7_18.charAt(v9_7);
                        if ((!kotlin.text.CharsKt.isWhitespace(v11_4)) && (!Character.isDigit(v11_4))) {
                            Long v7_19 = v7_18.substring(0, (v9_7 + 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v7_19, "substring(...)");
                        } else {
                            v9_7--;
                        }
                        Long v7_0;
                        if (!kotlin.text.StringsKt.endsWith$default(v7_19, " Copy", 0, 2, 0)) {
                            v7_0 = com.alightcreative.app.motion.scene.SceneElementKt.getDisplayLabel(v6_3);
                        } else {
                            v7_0 = kotlin.text.StringsKt.removeSuffix(v7_19, " Copy");
                        }
                        Long v7_2 = kotlin.text.StringsKt.trim(v7_0).toString();
                        java.util.List v9_3 = new StringBuilder();
                        v9_3.append(v7_2);
                        v9_3.append(" Copy");
                        java.util.List v9_4 = v9_3.toString();
                        int v11_1 = 1;
                        while(true) {
                            if (!v2_3.contains(v9_4)) {
                                String v12_3 = this._scene.getElements();
                                if ((v12_3 != null) && (v12_3.isEmpty())) {
                                    break;
                                }
                                String v12_4 = v12_3.iterator();
                                while (v12_4.hasNext()) {
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.text.StringsKt.trim(com.alightcreative.app.motion.scene.SceneElementKt.getDisplayLabel(((com.alightcreative.app.motion.scene.SceneElement) v12_4.next()))).toString(), v9_4)) {
                                        java.util.List v9_5 = v6_3;
                                        v11_1++;
                                        java.util.List v6_1 = new StringBuilder();
                                        v6_1.append(v7_2);
                                        v6_1.append(" Copy ");
                                        v6_1.append(v11_1);
                                        v9_4 = v6_1.toString();
                                        v6_3 = v9_5;
                                    }
                                }
                            }
                        }
                        Long v7_9;
                        v2_3.add(v9_4);
                        Long v7_4 = v4_3.get(Long.valueOf(v6_3.getId()));
                        kotlin.jvm.internal.Intrinsics.checkNotNull(v7_4);
                        long v20_0 = ((Number) v7_4).longValue();
                        if ((v6_3.getParent() == null) || (!kotlin.collections.CollectionsKt.contains(p62, v6_3.getParent()))) {
                            v7_9 = v6_3.getParent();
                        } else {
                            v7_9 = ((Long) v4_3.get(v6_3.getParent()));
                        }
                        java.util.List v16_0 = v6_3;
                        v6_7 = kotlin.collections.CollectionsKt.listOf(new com.alightcreative.app.motion.scene.SceneElement[] {v16_0, com.alightcreative.app.motion.scene.SceneElementKt.recreateEngineState(com.alightcreative.app.motion.scene.SceneElement.copy$default(v16_0, 0, 0, 0, v20_0, 0, v9_4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, v7_9, 0, 0, 0, -41, 119, 0))}));
                    }
                    v7_19 = "";
                }
                kotlin.collections.CollectionsKt.addAll(v15_1, v6_7);
            }
            this.setScene(com.alightcreative.app.motion.scene.SceneKt.uniquifyIds(com.alightcreative.app.motion.scene.Scene.copy$default(v8, 0, 0, 0, 0, 0, 0, v15_1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1048511, 0)));
            return;
        } else {
            return;
        }
    }

    public void editNestedScene(long p4)
    {
        fx.Enc.H(this, new com.alightcreative.app.motion.scene.Mp(p4, this));
        if (!com.alightcreative.app.motion.scene.SceneKt.isNestedSceneValid(this)) {
            throw new IllegalStateException("Check failed.");
        } else {
            IllegalArgumentException v0_3 = kotlin.collections.CollectionsKt.plus(this.getEditingNestedSceneIds(), Long.valueOf(p4));
            StringBuilder v1_1 = this.getNestedScene(v0_3);
            if (v1_1 == null) {
                StringBuilder v1_3 = new StringBuilder();
                v1_3.append("No element with ID=");
                v1_3.append(p4);
                throw new IllegalArgumentException(v1_3.toString());
            } else {
                this.editingNestedSceneIds = v0_3;
                this._scene = v1_1;
                this.dispatchStateChange();
                return;
            }
        }
    }

    public void endEditingNestedScene()
    {
        if (!com.alightcreative.app.motion.scene.SceneKt.isNestedSceneValid(this)) {
            throw new IllegalStateException("Check failed.");
        } else {
            IllegalStateException v0_1 = kotlin.collections.CollectionsKt.dropLast(this.getEditingNestedSceneIds(), 1);
            com.alightcreative.app.motion.scene.Scene v1_0 = this.getNestedScene(v0_1);
            if (v1_0 == null) {
                throw new IllegalStateException();
            } else {
                com.alightcreative.app.motion.scene.Scene v2_2 = ((Long) kotlin.collections.CollectionsKt.lastOrNull(this.getEditingNestedSceneIds()));
                if (v2_2 != null) {
                    com.alightcreative.app.motion.scene.Scene v2_4 = com.alightcreative.app.motion.scene.SceneKt.access$withUpdatedTrimmingFor(v1_0, v2_2.longValue());
                    if (v2_4 != null) {
                        v1_0 = v2_4;
                    }
                }
                this.editingNestedSceneIds = v0_1;
                this._scene = v1_0;
                this.dispatchStateChange();
                return;
            }
        }
    }

    public com.alightcreative.app.motion.scene.EditCategory getEditCategory()
    {
        return this.editCategory;
    }

    public int getEditMode()
    {
        return this.editMode;
    }

    public java.util.List getEditingNestedSceneIds()
    {
        return this.editingNestedSceneIds;
    }

    public int getEditingSerial()
    {
        return this._editingSerial;
    }

    public com.alightcreative.app.motion.scene.Scene getRootScene()
    {
        return this._rootScene;
    }

    public com.alightcreative.app.motion.scene.Scene getScene()
    {
        return this._scene;
    }

    public com.alightcreative.app.motion.scene.SceneSelection getSelection()
    {
        return this.selection;
    }

    public com.alightcreative.app.motion.scene.SpoidEnv getSpoidEnv()
    {
        return this.spoidEnv;
    }

    public xT.yH getUserPreviewMode()
    {
        return this.userPreviewMode;
    }

    public long nextAvailableId()
    {
        return com.alightcreative.app.motion.scene.SceneKt.getNextAvailableId(this._scene);
    }

    public void remove(com.alightcreative.app.motion.scene.SceneElement p28)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p28, "element");
        if (this._scene.getElements().contains(p28)) {
            com.alightcreative.app.motion.scene.Scene v3 = this._scene;
            this.setScene(com.alightcreative.app.motion.scene.Scene.copy$default(v3, 0, 0, 0, 0, 0, 0, kotlin.collections.CollectionsKt.minus(v3.getElements(), p28), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1048511, 0));
            return;
        } else {
            return;
        }
    }

    public java.util.List removeAll(Iterable p29)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p29, "elementIds");
        Iterable v2_5 = this._scene.getElements();
        java.util.ArrayList v3_1 = new java.util.ArrayList();
        Iterable v2_0 = v2_5.iterator();
        while (v2_0.hasNext()) {
            com.alightcreative.app.motion.scene.Scene v4_2 = v2_0.next();
            if (kotlin.collections.CollectionsKt.contains(p29, Long.valueOf(((com.alightcreative.app.motion.scene.SceneElement) v4_2).getId()))) {
                v3_1.add(v4_2);
            }
        }
        if (!v3_1.isEmpty()) {
            com.alightcreative.app.motion.scene.Scene v4_1 = this._scene;
            this.setScene(com.alightcreative.app.motion.scene.Scene.copy$default(v4_1, 0, 0, 0, 0, 0, 0, kotlin.collections.CollectionsKt.minus(v4_1.getElements(), ((Iterable) kotlin.collections.CollectionsKt.toSet(v3_1))), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1048511, 0));
            return v3_1;
        } else {
            return kotlin.collections.CollectionsKt.emptyList();
        }
    }

    public void setEditCategory(com.alightcreative.app.motion.scene.EditCategory p1)
    {
        this.editCategory = p1;
        return;
    }

    public void setEditMode(int p8)
    {
        if (this.editMode != p8) {
            fx.Enc.H(this, new com.alightcreative.app.motion.scene.eEN(this, p8));
            this.editMode = p8;
            if (kotlin.jvm.internal.Intrinsics.areEqual(this.getSpoidEnv(), new com.alightcreative.app.motion.scene.SpoidEnv(0, 0, 0, 0, 15, 0))) {
                this.dispatchStateChange();
            } else {
                this.setSpoidEnv(new com.alightcreative.app.motion.scene.SpoidEnv(0, 0, 0, 0, 15, 0));
                return;
            }
        }
        return;
    }

    public void setEditingSerial(int p1)
    {
        this._editingSerial = p1;
        return;
    }

    public void setRootScene(com.alightcreative.app.motion.scene.Scene p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "value");
        if (this._rootScene != p2) {
            this._rootScene = p2;
            while ((!this.getEditingNestedSceneIds().isEmpty()) && (this.getNestedScene(this.getEditingNestedSceneIds()) == null)) {
                this.editingNestedSceneIds = kotlin.collections.CollectionsKt.dropLast(this.getEditingNestedSceneIds(), 1);
            }
            java.util.List v2_4 = this.getNestedScene(this.getEditingNestedSceneIds());
            if (v2_4 == null) {
                v2_4 = this._rootScene;
            }
            this._scene = v2_4;
            if (v2_4 == this._rootScene) {
                this.editingNestedSceneIds = kotlin.collections.CollectionsKt.emptyList();
            }
            this.dispatchStateChange();
        }
        return;
    }

    public void setScene(com.alightcreative.app.motion.scene.Scene p29)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p29, "value");
        if (this._scene == p29) {
            return;
        } else {
            com.alightcreative.app.motion.scene.Scene v3 = com.alightcreative.app.motion.scene.AssociatedEditKt.performAssociatedEdit(p29, this.getEditCategory());
            if (this._scene != this._rootScene) {
                fx.Enc.H(this, new com.alightcreative.app.motion.scene.pD(v3));
                this._rootScene = com.alightcreative.app.motion.scene.Scene.copy$default(com.alightcreative.app.motion.scene.SceneKt.copyUpdatingNestedScene(this._rootScene, this.getEditingNestedSceneIds(), v3), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, System.currentTimeMillis(), 0, 0, 917503, 0);
                this._scene = v3;
                if (!com.alightcreative.app.motion.scene.SceneKt.isNestedSceneValid(this)) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                IllegalStateException v1_9 = com.alightcreative.app.motion.scene.Scene.copy$default(v3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, System.currentTimeMillis(), 0, 0, 917503, 0);
                this._scene = v1_9;
                this._rootScene = v1_9;
            }
            this.dispatchStateChange();
            return;
        }
    }

    public void setSelection(com.alightcreative.app.motion.scene.SceneSelection p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "value");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.selection, p2)) {
            this.selection = p2;
            this.dispatchStateChange();
        }
        return;
    }

    public void setSpoidEnv(com.alightcreative.app.motion.scene.SpoidEnv p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "value");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.spoidEnv, p2)) {
            this.spoidEnv = p2;
            this.dispatchStateChange();
        }
        return;
    }

    public void setUserPreviewMode(xT.yH p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "value");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(this.userPreviewMode, p2)) {
            fx.Enc.H(this, new com.alightcreative.app.motion.scene.k(this));
            this.userPreviewMode = p2;
            this.dispatchStateChange();
        }
        return;
    }

    public void subscribe(kotlin.jvm.functions.Function1 p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "callback");
        this.callbacks = kotlin.collections.CollectionsKt.plus(this.callbacks, p2);
        return;
    }

    public void unsubscribe(kotlin.jvm.functions.Function1 p2)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "callback");
        this.callbacks = kotlin.collections.CollectionsKt.minus(this.callbacks, p2);
        return;
    }

    public void update(com.alightcreative.app.motion.scene.SceneElement p48)
    {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p48, "element");
        com.alightcreative.app.motion.scene.nAU v2_16 = this._scene.getElements().iterator();
        while (v2_16.hasNext()) {
            com.alightcreative.app.motion.scene.Scene v3_1 = v2_16.next();
            if (((com.alightcreative.app.motion.scene.SceneElement) p48).getId() == p48.getId()) {
            }
            com.alightcreative.app.motion.scene.Scene v3_3 = ((com.alightcreative.app.motion.scene.SceneElement) v3_1);
            if (v3_3 == null) {
                fx.Enc.pM1(this, new com.alightcreative.app.motion.scene.Nrb(p48));
                return;
            } else {
                if ((v3_3.getLiveShape().getId() == null) || (v3_3.getLiveShape().getParamValues() == p48.getLiveShape().getParamValues())) {
                    com.alightcreative.app.motion.scene.SceneElement v46 = v3_3;
                    com.alightcreative.app.motion.scene.nAU v2_0 = p48;
                } else {
                    v46 = v3_3;
                    v2_0 = com.alightcreative.app.motion.scene.SceneElement.copy$default(p48, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, com.alightcreative.app.motion.scene.CubicBSplineKt.keyable(com.alightcreative.app.motion.scene.liveshape.LiveShapeScriptKt.getShapeOutline(p48, 0)), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -8193, 127, 0);
                }
                this.setScene(com.alightcreative.app.motion.scene.Scene.copy$default(this.getScene(), 0, 0, 0, 0, 0, 0, FKt.g.x(this._scene.getElements(), v46, v2_0), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1048511, 0));
                fx.Enc.db(this, new com.alightcreative.app.motion.scene.nAU(p48));
                return;
            }
        }
        v3_1 = 0;
    }
}
