package com.epam.golubeva.xml.entity;

public class Package extends AbstractBaseEntity {
    private TypePackage typePackage;
    private int amount;
    private double price;

    public Package(TypePackage typePackage, int amount, double price) {
        this.typePackage = typePackage;
        this.amount = amount;
        this.price = price;
    }
    public Package(){

    }

    public TypePackage getTypePackage() {
        return typePackage;
    }

    public void setTypePackage(TypePackage typePackage) {
        this.typePackage = typePackage;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
