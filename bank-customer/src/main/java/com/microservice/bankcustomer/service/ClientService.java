package com.microservice.bankcustomer.service;

import java.util.List;
import java.util.Optional;

import com.microservice.bankcustomer.entity.ClientEntity;

public interface ClientService {
    
public List<ClientEntity> listClient();

public ClientEntity create(ClientEntity ce);

public ClientEntity update(Integer id, String tipClient);

public int delete(Integer id);

public Optional<ClientEntity> findByDni(Integer dni);
}
