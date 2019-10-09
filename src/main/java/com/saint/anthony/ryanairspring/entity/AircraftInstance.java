package com.saint.anthony.ryanairspring.entity;

import javax.persistence.Entity;

@Entity
public class AircraftInstance extends IdHolder{

    private Long aircraftId;

    public Long getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(Long aircraftId) {
        this.aircraftId = aircraftId;
    }

    @Override
    public String toString() {
        return "AircraftInstance{" +
                "aircraftInstanceId=" + super.getId() +
                ", aircraftId=" + aircraftId +
                '}';
    }
}
