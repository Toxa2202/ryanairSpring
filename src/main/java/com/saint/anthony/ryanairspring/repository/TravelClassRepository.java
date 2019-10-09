package com.saint.anthony.ryanairspring.repository;

import com.saint.anthony.ryanairspring.entity.TravelClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelClassRepository extends CrudRepository<TravelClass, Long> {

}
