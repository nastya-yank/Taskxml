package com.epam.golubeva.xml.entity;

import java.util.List;

public class Medicine {
    private String name;
    private Pharm pharm;
    private Group group;
    private List<Analog> analogs;
    private List<Version> versions;

    public Medicine(String name, Pharm pharm, Group group, List<Analog> analogs, List<Version> versions) {
        this.name = name;
        this.pharm = pharm;
        this.group = group;
        this.analogs = analogs;
        this.versions = versions;
    }
    public Medicine(){

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

    public List<Analog> getAnalogs() {
        return analogs;
    }

    public void setAnalogs(List<Analog> analogs) {
        this.analogs = analogs;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public void setVersions(List<Version> versions) {
        this.versions = versions;
    }
}

