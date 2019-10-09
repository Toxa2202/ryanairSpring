package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.FlightStatus;
import com.saint.anthony.ryanairspring.repository.FlightStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/flightstatus")
public class FlightStatusController {
    @Autowired
    private FlightStatusRepository flightStatusRepository;

    @GetMapping("/all")
    public Iterable<FlightStatus> getFlightStatuses() {
        return flightStatusRepository.findAll();
    }
}
