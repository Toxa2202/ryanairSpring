package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.Booking;
import com.saint.anthony.ryanairspring.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/booking")
public class BookingController {
    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping("/all")
    public Iterable<Booking> getBookings() {
        return bookingRepository.findAll();
    }
}
