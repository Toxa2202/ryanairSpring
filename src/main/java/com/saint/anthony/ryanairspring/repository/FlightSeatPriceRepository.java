package com.saint.anthony.ryanairspring.repository;

import com.saint.anthony.ryanairspring.entity.FlightSeatPrice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightSeatPriceRepository extends CrudRepository<FlightSeatPrice, Long> {

}
