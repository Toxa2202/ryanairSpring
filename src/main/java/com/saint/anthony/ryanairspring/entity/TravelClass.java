package com.saint.anthony.ryanairspring.entity;

import javax.persistence.Entity;

@Entity
public class TravelClass extends IdHolder{
    private String travellClassName;
    private String travelClassDescription;

    public String getTravellClassName() {
        return travellClassName;
    }

    public void setTravellClassName(String travellClassName) {
        this.travellClassName = travellClassName;
    }

    public String getTravelClassDescription() {
        return travelClassDescription;
    }

    public void setTravelClassDescription(String travelClassDescription) {
        this.travelClassDescription = travelClassDescription;
    }

    @Override
    public String toString() {
        return "TravelClass{" +
                "travelClassId=" + super.getId() +
                ", travellClassName='" + travellClassName + '\'' +
                ", travelClassDescription='" + travelClassDescription + '\'' +
                '}';
    }
}
