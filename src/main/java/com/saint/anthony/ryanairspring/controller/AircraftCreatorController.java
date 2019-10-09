package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.AircraftCreator;
import com.saint.anthony.ryanairspring.repository.AircraftCreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/aircraftcreator")
public class AircraftCreatorController {
    @Autowired
    private AircraftCreatorRepository aircraftCreatorRepository;

    @GetMapping("/all")
    public Iterable<AircraftCreator> getAircraftCreators() {
        return aircraftCreatorRepository.findAll();
    }
}
