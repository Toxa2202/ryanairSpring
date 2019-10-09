package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.FlightAircraftInstance;
import com.saint.anthony.ryanairspring.repository.FlightAircraftInstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/flightaircraftinstance")
public class FlightAircraftInstanceController {
    @Autowired
    private FlightAircraftInstanceRepository flightAircraftInstanceRepository;

    @GetMapping("/all")
    public Iterable<FlightAircraftInstance> getFlightAircraftInstances() {
        return flightAircraftInstanceRepository.findAll();
    }
}
