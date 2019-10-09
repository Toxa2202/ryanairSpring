package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.Aircraft;
import com.saint.anthony.ryanairspring.entity.Airport;
import com.saint.anthony.ryanairspring.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/airport")
public class AirportController {
    @Autowired
    private AirportRepository airportRepository;

    @GetMapping("/all")
    public Iterable<Airport> getAirports() {
        return airportRepository.findAll();
    }
}
