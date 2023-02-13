package com.microservice.bankaccount.repository;

import com.microservice.bankaccount.entity.SavingAccountEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SavingAccountRepository  extends MongoRepository<SavingAccountEntity,String> {

    Optional<SavingAccountEntity> findByNumberAccount(String numberAccount);
}
