package com.saint.anthony.ryanairspring.entity;

import javax.persistence.Entity;

@Entity
public class Direction extends IdHolder{
    private String departIataAirportCode;
    private String arrivalIataAirprotCode;

    public String getDepartIataAirportCode() {
        return departIataAirportCode;
    }

    public void setDepartIataAirportCode(String departIataAirportCode) {
        this.departIataAirportCode = departIataAirportCode;
    }

    public String getArrivalIataAirprotCode() {
        return arrivalIataAirprotCode;
    }

    public void setArrivalIataAirprotCode(String arrivalIataAirprotCode) {
        this.arrivalIataAirprotCode = arrivalIataAirprotCode;
    }

    @Override
    public String toString() {
        return "Direction{" +
                "departIataAirportCode='" + departIataAirportCode + '\'' +
                ", arrivalIataAirprotCode='" + arrivalIataAirprotCode + '\'' +
                ", id=" + super.getId() +
                '}';
    }
}
