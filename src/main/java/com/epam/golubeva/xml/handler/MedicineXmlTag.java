package com.epam.golubeva.xml.handler;

public enum MedicineXmlTag {
    MEDICINES("medicines"), MEDICINE("medicine"), ID("id"),
    NAME("name"), GROUP("group"),
    ANALOGS("analogs"), VERSION_TYPE("version-type"), NUMBER("number"),
    AT_REGISTRATION("at-registration"),
    AT_FINISH("at-finish"),REGISTRATION_ORGANIZATION("registration-organization"),
   TYPE_PACKAGES("type-packages"),AMOUNT("amount"),
    PRICE("price"),DAY("day"),VERSIONS("versions"),
    PHARMS("pharms"), PHARM("pharm"),
    CERTIFICATE("certificate"), APACKAGE("a-package"),DOSAGE("dosage");

    private String value;

    MedicineXmlTag(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
