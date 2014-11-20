package com.boot.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Address {
    
    private String street;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address [street=" + street + "]";
    }
    
    
}
