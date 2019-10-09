package com.saint.anthony.ryanairspring.entity;

import javax.persistence.Entity;

@Entity
public class Flight extends IdHolder{
    private Long scheduleId;
    private Long flightStatusId;

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Long getFlightStatusId() {
        return flightStatusId;
    }

    public void setFlightStatusId(Long flightStatusId) {
        this.flightStatusId = flightStatusId;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightCall=" + super.getId() +
                ", scheduleId=" + scheduleId +
                ", flightStatusId=" + flightStatusId +
                '}';
    }
}
