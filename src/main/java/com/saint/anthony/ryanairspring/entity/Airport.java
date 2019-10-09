package com.saint.anthony.ryanairspring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Airport {
    @Id
    private String iataAirportCode;

    private String airportName;
    private String cityName;
    private String iataCountryCode;

    public String getIataAirportCode() {
        return iataAirportCode;
    }

    public void setIataAirportCode(String iataAirportCode) {
        this.iataAirportCode = iataAirportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getIataCountryCode() {
        return iataCountryCode;
    }

    public void setIataCountryCode(String iataCountryCode) {
        this.iataCountryCode = iataCountryCode;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "iataAirportCode='" + iataAirportCode + '\'' +
                ", airportName='" + airportName + '\'' +
                ", cityName='" + cityName + '\'' +
                ", iataCountryCode='" + iataCountryCode + '\'' +
                '}';
    }
}
