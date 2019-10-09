package com.saint.anthony.ryanairspring.entity;

import javax.persistence.Entity;

@Entity
public class FlightSeatPrice extends IdHolder{
    private Long aircraftId;
    private Long seatId;
    private Double priceUSD;

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

    public Double getPriceUSD() {
        return priceUSD;
    }

    public void setPriceUSD(Double priceUSD) {
        this.priceUSD = priceUSD;
    }

    @Override
    public String toString() {
        return "FlightSeatPrice{" +
                "flightId=" + super.getId() +
                ", aircraftId=" + aircraftId +
                ", seatId=" + seatId +
                ", priceUSD=" + priceUSD +
                '}';
    }
}
