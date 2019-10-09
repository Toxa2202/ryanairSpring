package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.FlightSeatPrice;
import com.saint.anthony.ryanairspring.repository.FlightSeatPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/flightseatprice")
public class FlightSeatPriceController {
    @Autowired
    private FlightSeatPriceRepository flightSeatPriceRepository;

    @GetMapping("/all")
    public Iterable<FlightSeatPrice> getFlightSeatPrices() {
        return flightSeatPriceRepository.findAll();
    }
}
