package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.Flight;
import com.saint.anthony.ryanairspring.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/flight")
public class FlightController {
    @Autowired
    private FlightRepository flightRepository;

    @GetMapping("/all")
    public Iterable<Flight> getFlights() {
        return flightRepository.findAll();
    }
}
