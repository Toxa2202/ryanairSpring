package com.saint.anthony.ryanairspring.repository;

import com.saint.anthony.ryanairspring.entity.Booking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Long> {

}
