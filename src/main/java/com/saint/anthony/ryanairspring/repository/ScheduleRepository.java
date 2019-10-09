package com.saint.anthony.ryanairspring.repository;

import com.saint.anthony.ryanairspring.entity.Schedule;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends CrudRepository<Schedule, Long> {

}
