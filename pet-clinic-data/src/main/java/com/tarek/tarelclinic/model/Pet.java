package com.tarek.tarelclinic.model;

import java.time.LocalDate;

public class Pet {
    private  PeType peType;
    private Owner owner;
    private LocalDate birthDate;

    public PeType getPeType() {
        return peType;
    }

    public void setPeType(PeType peType) {
        this.peType = peType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
