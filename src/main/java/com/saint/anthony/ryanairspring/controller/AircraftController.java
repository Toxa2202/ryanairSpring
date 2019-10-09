package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.Aircraft;
import com.saint.anthony.ryanairspring.repository.AircraftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/aircraft")
public class AircraftController {
    @Autowired
    private AircraftRepository aircraftRepository;

    @GetMapping("/all")
    public Iterable<Aircraft> getAircrafts() {
        return aircraftRepository.findAll();
    }
}
