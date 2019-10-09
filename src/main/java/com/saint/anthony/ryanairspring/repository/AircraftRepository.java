package com.saint.anthony.ryanairspring.repository;

import com.saint.anthony.ryanairspring.entity.Aircraft;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftRepository extends CrudRepository<Aircraft, Long> {

}
