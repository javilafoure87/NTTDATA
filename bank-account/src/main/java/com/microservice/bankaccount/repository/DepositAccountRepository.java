package com.microservice.bankaccount.repository;

import com.microservice.bankaccount.entity.DepositAccountEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepositAccountRepository extends MongoRepository<DepositAccountEntity,String> {

    Optional<DepositAccountEntity> findById(String id);
}
