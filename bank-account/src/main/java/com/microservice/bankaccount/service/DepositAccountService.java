package com.microservice.bankaccount.service;

import com.microservice.bankaccount.entity.DepositAccountEntity;
import com.microservice.bankaccount.entity.SavingAccountEntity;
import com.microservice.bankaccount.repository.DepositAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepositAccountService {

    private final DepositAccountRepository depositAccountRepository;

    public void saveDepositAccount(DepositAccountEntity depositAccountEntity){
        depositAccountRepository.save(depositAccountEntity);
    }

    public Optional<DepositAccountEntity> findByDni(Integer dni){
        return depositAccountRepository.findByDni(dni);
    }
    public Optional<DepositAccountEntity> findById(String id){
        return depositAccountRepository.findById(String.valueOf(Integer.valueOf(id)));
    }
}
