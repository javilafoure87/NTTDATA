package com.microservice.bankcustomer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.bankcustomer.entity.customerentity;

@Repository
public interface customerRepository extends JpaRepository<customerentity, Integer> {

    
    
}
