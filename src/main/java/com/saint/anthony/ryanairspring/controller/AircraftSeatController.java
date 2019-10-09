package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.AircraftSeat;
import com.saint.anthony.ryanairspring.repository.AircraftSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/aircraftseat")
public class AircraftSeatController {
    @Autowired
    private AircraftSeatRepository aircraftSeatRepository;

    @GetMapping("/all")
    public Iterable<AircraftSeat> getAircraftSeats() {
        return aircraftSeatRepository.findAll();
    }
}
