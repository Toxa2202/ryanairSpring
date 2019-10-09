package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.Aircraft;
import com.saint.anthony.ryanairspring.entity.Schedule;
import com.saint.anthony.ryanairspring.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    @Autowired
    private ScheduleRepository scheduleRepository;

    @GetMapping("/all")
    public Iterable<Schedule> getSchedules() {
        return scheduleRepository.findAll();
    }
}
