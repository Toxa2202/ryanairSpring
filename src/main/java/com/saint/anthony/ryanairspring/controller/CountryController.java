package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.Country;
import com.saint.anthony.ryanairspring.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("/all")
    public Iterable<Country> getCountries() {
        return countryRepository.findAll();
    }
}
