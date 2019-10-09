package com.saint.anthony.ryanairspring.entity;

import javax.persistence.Entity;

@Entity
public class AircraftSeat extends IdHolder{

    private Long aircraftId;
    private Long seatId;
    private Long travelClassId;

    public Long getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(Long aircraftId) {
        this.aircraftId = aircraftId;
    }

    public Long getSeatId() {
        return seatId;
    }

    public void setSeatId(Long seatId) {
        this.seatId = seatId;
    }

    public Long getTravelClassId() {
        return travelClassId;
    }

    public void setTravelClassId(Long travelClassId) {
        this.travelClassId = travelClassId;
    }

    @Override
    public String toString() {
        return "AircraftSeat{" +
                "id=" + super.getId() +
                ", aircraftId=" + aircraftId +
                ", seatId=" + seatId +
                ", travelClassId=" + travelClassId +
                '}';
    }
}