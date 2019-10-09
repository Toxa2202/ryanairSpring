package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.TravelClass;
import com.saint.anthony.ryanairspring.repository.TravelClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/travelclass")
public class TravelClassController {
    @Autowired
    private TravelClassRepository travelClassRepository;

    @GetMapping("/all")
    public Iterable<TravelClass> getTravelClasses() {
        return travelClassRepository.findAll();
    }
}
