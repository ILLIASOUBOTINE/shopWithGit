package com.enterprise.Shop.service;

import com.enterprise.Shop.enttity.Client;
import com.enterprise.Shop.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClient(){
        return clientRepository.findAll();
    }

}
