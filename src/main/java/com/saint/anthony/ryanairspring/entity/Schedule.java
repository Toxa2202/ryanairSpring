package com.saint.anthony.ryanairspring.entity;

import javax.persistence.Entity;

@Entity
public class Schedule extends IdHolder{
    private String departureIataAirportCode;
    private String arrivalIataAirportCode;
    private String departureTimeGMT;
    private String arrivalTimeGMT;

    public String getDepartureIataAirportCode() {
        return departureIataAirportCode;
    }

    public void setDepartureIataAirportCode(String departureIataAirportCode) {
        this.departureIataAirportCode = departureIataAirportCode;
    }

    public String getArrivalIataAirportCode() {
        return arrivalIataAirportCode;
    }

    public void setArrivalIataAirportCode(String arrivalIataAirportCode) {
        this.arrivalIataAirportCode = arrivalIataAirportCode;
    }

    public String getDepartureTimeGMT() {
        return departureTimeGMT;
    }

    public void setDepartureTimeGMT(String departureTimeGMT) {
        this.departureTimeGMT = departureTimeGMT;
    }

    public String getArrivalTimeGMT() {
        return arrivalTimeGMT;
    }

    public void setArrivalTimeGMT(String arrivalTimeGMT) {
        this.arrivalTimeGMT = arrivalTimeGMT;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleId=" + super.getId() +
                ", departureIataAirportCode='" + departureIataAirportCode + '\'' +
                ", arrivalIataAirportCode='" + arrivalIataAirportCode + '\'' +
                ", departureTimeGMT='" + departureTimeGMT + '\'' +
                ", arrivalTimeGMT='" + arrivalTimeGMT + '\'' +
                '}';
    }
}
