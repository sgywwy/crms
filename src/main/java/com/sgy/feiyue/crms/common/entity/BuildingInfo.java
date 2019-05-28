package com.sgy.feiyue.crms.common.entity;

import java.io.Serializable;

public class BuildingInfo implements Serializable {
    private String id;

    private String buildingName;

    private String buildingSimple;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName == null ? null : buildingName.trim();
    }

    public String getBuildingSimple() {
        return buildingSimple;
    }

    public void setBuildingSimple(String buildingSimple) {
        this.buildingSimple = buildingSimple == null ? null : buildingSimple.trim();
    }
}