package com.epam.golubeva.xml.entity;

import java.time.LocalTime;

public class Dosage extends AbstractBaseEntity {
    private short dosage;
    private short day;

    public Dosage(short dosage, short day) {
        this.dosage = dosage;
        this.day = day;
    }
    public Dosage(){

    }

    public short getDosage() {
        return dosage;
    }

    public void setDosage(short dosage) {
        this.dosage = dosage;
    }

    public short getDay() {
        return day;
    }

    public void setDay(short day) {
        this.day = day;
    }
}
