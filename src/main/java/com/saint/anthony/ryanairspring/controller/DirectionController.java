package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.Direction;
import com.saint.anthony.ryanairspring.repository.DirectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/direction")
public class DirectionController {
    @Autowired
    private DirectionRepository directionRepository;

    @GetMapping("/all")
    public Iterable<Direction> getDirections() {
        return directionRepository.findAll();
    }
}
