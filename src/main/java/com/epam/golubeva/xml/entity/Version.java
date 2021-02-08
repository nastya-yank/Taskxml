package com.epam.golubeva.xml.entity;

import java.util.List;

public abstract class Version {
    private VersionType versionType;
    private List<Pharm> pharms;

    public Version(VersionType versionType, List<Pharm> pharms) {
        this.versionType = versionType;
        this.pharms = pharms;
    }
    public Version(){

    }

    public VersionType getVersionType() {
        return versionType;
    }

    public void setVersionType(VersionType versionType) {
        this.versionType = versionType;
    }

    public List<Pharm> getPharms() {
        return pharms;
    }

    public void setPharms(List<Pharm> pharms) {
        this.pharms = pharms;
    }
}
