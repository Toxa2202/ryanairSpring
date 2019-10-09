package com.saint.anthony.ryanairspring.repository;

import com.saint.anthony.ryanairspring.entity.FlightAircraftInstance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightAircraftInstanceRepository extends CrudRepository<FlightAircraftInstance, Long> {

}
