package com.epam.golubeva.xml.entity;

import java.time.LocalTime;

public class Dosage {
    private short dosage;
    private LocalTime time;

    public Dosage(short dosage, LocalTime time) {
        this.dosage = dosage;
        this.time = time;
    }
    public Dosage(){

    }

    public short getDosage() {
        return dosage;
    }

    public void setDosage(short dosage) {
        this.dosage = dosage;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
