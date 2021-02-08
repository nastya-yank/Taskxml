package com.epam.golubeva.xml.entity;

import java.util.List;

public class Analog extends Medicine{
    private String quality;

    public Analog(String name, Pharm pharm, Group group, List<Medicine> analogs, List<Version> versions, String mainDrugName) {
        super(name, pharm, group, analogs, versions);
        this.quality = mainDrugName;
    }
    public Analog() {
    }

}
