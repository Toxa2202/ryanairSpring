package com.saint.anthony.ryanairspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Booking extends IdHolder{

    private Long flightCall;
    private Long aircraftId;
    private Long seatId;

    public Long getFlightCall() {
        return flightCall;
    }

    public void setFlightCall(Long flightCall) {
        this.flightCall = flightCall;
    }

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

    @Override
    public String toString() {
        return "Booking{" +
                "clientId=" + super.getId() +
                ", flightCall=" + flightCall +
                ", aircraftId=" + aircraftId +
                ", seatId=" + seatId +
                '}';
    }
}
