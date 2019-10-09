package com.saint.anthony.ryanairspring.repository;

import com.saint.anthony.ryanairspring.entity.AircraftCreator;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftCreatorRepository extends CrudRepository<AircraftCreator, Long> {

}
