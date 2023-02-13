package com.microservice.bankcustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.bankcustomer.entity.ClientEntity;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {

    
    
}
