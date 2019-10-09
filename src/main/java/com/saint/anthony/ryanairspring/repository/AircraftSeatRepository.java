package com.saint.anthony.ryanairspring.repository;

import com.saint.anthony.ryanairspring.entity.AircraftSeat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftSeatRepository extends CrudRepository<AircraftSeat, Long> {

}
