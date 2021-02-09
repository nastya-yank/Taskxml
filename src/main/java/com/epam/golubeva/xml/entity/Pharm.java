package com.epam.golubeva.xml.entity;

public class Pharm extends AbstractBaseEntity {
    private Certificate certificate;
    private Package aPackage;
    private Dosage dosage;

    public Pharm(Certificate certificate, Package aPackage, Dosage dosage) {
        this.certificate = certificate;
        this.aPackage = aPackage;
        this.dosage = dosage;
    }
    public Pharm(){

    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public Dosage getDosage() {
        return dosage;
    }

    public void setDosage(Dosage dosage) {
        this.dosage = dosage;
    }
}
