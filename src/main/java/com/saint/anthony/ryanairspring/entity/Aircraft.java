package com.saint.anthony.ryanairspring.entity;

import javax.persistence.*;

@Entity
public class Aircraft extends IdHolder{

    private Integer aircraftCreatorId;
    private String model;

    public Integer getAircraftCreatorId() {
        return aircraftCreatorId;
    }

    public void setAircraftCreatorId(Integer aircraftCreatorId) {
        this.aircraftCreatorId = aircraftCreatorId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "id=" + super.getId() +
                ", aircraftCreatorId=" + aircraftCreatorId +
                ", model='" + model + '\'' +
                '}';
    }
}
