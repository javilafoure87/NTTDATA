package com.microservice.bankcustomer.service;

import java.util.List;
import com.microservice.bankcustomer.entity.ClientEntity;

public interface ClientService {
    
public List<ClientEntity> listClient();

public ClientEntity create(ClientEntity ce);

public ClientEntity update(Integer id, String tipClient);

public int delete(Integer id);


}
