package com.saint.anthony.ryanairspring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
    @Id
    private String iataCountryCode;

    private String countryName;

    public String getIataCountryCode() {
        return iataCountryCode;
    }

    public void setIataCountryCode(String iataCountryCode) {
        this.iataCountryCode = iataCountryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "iataCountryCode='" + iataCountryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                '}';
    }
}
