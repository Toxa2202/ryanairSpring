package com.saint.anthony.ryanairspring.repository;

import com.saint.anthony.ryanairspring.entity.Airport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends CrudRepository<Airport, Long> {

}
