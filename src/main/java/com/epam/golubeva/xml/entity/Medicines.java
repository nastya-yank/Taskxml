package com.epam.golubeva.xml.entity;

import java.util.List;

public class Medicines extends AbstractBaseEntity {
    private String name;
    private Pharm pharm;
    private Group group;
    private String analogs;
    private List<Version> versions;

    public Medicines(String name, Pharm pharm, Group group, String analogs, List<Version> versions) {
        this.name = name;
        this.pharm = pharm;
        this.group = group;
        this.analogs = analogs;
        this.versions = versions;
    }
    public Medicines(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pharm getPharm() {
        return pharm;
    }

    public void setPharm(Pharm pharm) {
        this.pharm = pharm;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getAnalogs() {
        return analogs;
    }

    public void setAnalogs(String analogs) {
        this.analogs = analogs;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public void setVersions(List<Version> versions) {
        this.versions = versions;
    }
}

