package com.saint.anthony.ryanairspring.controller;

import com.saint.anthony.ryanairspring.entity.Client;
import com.saint.anthony.ryanairspring.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/all")
    public Iterable<Client> getClients() {
        return clientRepository.findAll();
    }
}
