package com.saint.anthony.ryanairspring.repository;

import com.saint.anthony.ryanairspring.entity.AircraftInstance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftInstanceRepository extends CrudRepository<AircraftInstance, Long> {

}
