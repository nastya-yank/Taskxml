package com.epam.golubeva.xml.entity;

import java.time.LocalDate;

public class Certificate extends AbstractBaseEntity {
    private Long number;
    private LocalDate atRegistration;
    private LocalDate atFinish;
    private String registrationOrganization;

    public Certificate(Long number, LocalDate atRegistration, LocalDate atFinish, String registrationOrganization) {
        this.number = number;
        this.atRegistration = atRegistration;
        this.atFinish = atFinish;
        this.registrationOrganization = registrationOrganization;
    }
    public Certificate(){

    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public LocalDate getAtRegistration() {
        return atRegistration;
    }

    public void setAtRegistration(LocalDate atRegistration) {
        this.atRegistration = atRegistration;
    }

    public LocalDate getAtFinish() {
        return atFinish;
    }

    public void setAtFinish(LocalDate atFinish) {
        this.atFinish = atFinish;
    }

    public String getRegistrationOrganization() {
        return registrationOrganization;
    }

    public void setRegistrationOrganization(String registrationOrganization) {
        this.registrationOrganization = registrationOrganization;
    }
}
