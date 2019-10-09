package com.saint.anthony.ryanairspring.repository;

import com.saint.anthony.ryanairspring.entity.Direction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectionRepository extends CrudRepository<Direction, Long> {

}
