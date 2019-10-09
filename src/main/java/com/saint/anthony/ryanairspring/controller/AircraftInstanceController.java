package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.AircraftInstance;
import com.saint.anthony.ryanairspring.repository.AircraftInstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/aircraftinstance")
public class AircraftInstanceController {
    @Autowired
    private AircraftInstanceRepository aircraftInstanceRepository;

    @GetMapping("/all")
    public Iterable<AircraftInstance> getAircraftInstances() {
        return aircraftInstanceRepository.findAll();
    }
}
