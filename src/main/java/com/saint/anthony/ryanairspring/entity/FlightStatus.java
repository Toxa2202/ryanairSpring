package com.saint.anthony.ryanairspring.entity;

import javax.persistence.Entity;

@Entity
public class FlightStatus extends IdHolder{
    private String flightStatusName;
    private String flightStatusDetails;

    public String getFlightStatusName() {
        return flightStatusName;
    }

    public void setFlightStatusName(String flightStatusName) {
        this.flightStatusName = flightStatusName;
    }

    public String getFlightStatusDetails() {
        return flightStatusDetails;
    }

    public void setFlightStatusDetails(String flightStatusDetails) {
        this.flightStatusDetails = flightStatusDetails;
    }

    @Override
    public String toString() {
        return "FlightStatus{" +
                "flightStatusId=" + super.getId() +
                ", flightStatusName='" + flightStatusName + '\'' +
                ", flightStatusDetails='" + flightStatusDetails + '\'' +
                '}';
    }
}
