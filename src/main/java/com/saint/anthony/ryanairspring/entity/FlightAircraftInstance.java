package com.saint.anthony.ryanairspring.entity;

import javax.persistence.Entity;

@Entity
public class FlightAircraftInstance extends IdHolder{
    private Long aircraftInstanceId;

    public Long getAircraftInstanceId() {
        return aircraftInstanceId;
    }

    public void setAircraftInstanceId(Long aircraftInstanceId) {
        this.aircraftInstanceId = aircraftInstanceId;
    }

    @Override
    public String toString() {
        return "FlightAircraftInstance{" +
                "flightCall=" + super.getId() +
                ", aircraftInstanceId=" + aircraftInstanceId +
                '}';
    }
}
