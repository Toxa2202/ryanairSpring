package com.saint.anthony.ryanairspring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AircraftCreator extends IdHolder{

    @Column(name = "name", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AircraftCreator{" +
                "id=" + super.getId() +
                ", name='" + name + '\'' +
                '}';
    }
}
