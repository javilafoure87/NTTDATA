package com.microservice.bankaccount.repository;

import com.microservice.bankaccount.entity.CurrentAccountEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CurrentAccountRepository extends MongoRepository<CurrentAccountEntity,String> {
}
