package com.microservice.bankaccount.repository;

import com.microservice.bankaccount.entity.FixedTermAccountEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FixedTermAccountRepository extends MongoRepository<FixedTermAccountEntity,String> {
}
