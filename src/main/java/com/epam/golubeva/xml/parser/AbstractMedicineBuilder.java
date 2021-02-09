package com.epam.golubeva.xml.parser;

import com.epam.golubeva.xml.entity.Medicines;
import com.epam.golubeva.xml.exception.MedicinesXmlException;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractMedicineBuilder {
    protected Set<Medicines> medicines;
    public AbstractMedicineBuilder(){
        medicines=new HashSet<Medicines>();
    }
    public AbstractMedicineBuilder(Set<Medicines> medicines){
        this.medicines=medicines;
    }

    public Set<Medicines> getMedicines() {
        return medicines;
    }

    public void setMedicines(Set<Medicines> medicines) {
        this.medicines = medicines;
    }
    public abstract void buildSetMedicine(String fileName) throws MedicinesXmlException;
}
