package com.saint.anthony.ryanairspring.repository;

import com.saint.anthony.ryanairspring.entity.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {

}
