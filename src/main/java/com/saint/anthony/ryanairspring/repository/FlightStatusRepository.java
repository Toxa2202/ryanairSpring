package com.saint.anthony.ryanairspring.repository;

import com.saint.anthony.ryanairspring.entity.FlightStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightStatusRepository extends CrudRepository<FlightStatus, Long> {

}
