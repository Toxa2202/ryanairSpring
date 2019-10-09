package com.saint.anthony.ryanairspring.repository;

import com.saint.anthony.ryanairspring.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}
