package com.microservice.bankaccount.service;

import com.microservice.bankaccount.entity.SavingAccountEntity;
import com.microservice.bankaccount.repository.SavingAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SavingAccountService {
    private final SavingAccountRepository savingAccountRepository;

    public void saveSavingAccount(SavingAccountEntity savingAccountEntity){
        savingAccountRepository.save(savingAccountEntity);
    }

    public List<SavingAccountEntity> finAll(){

        return savingAccountRepository.findAll();
    }

    public Optional<SavingAccountEntity> findById(String id){
        return savingAccountRepository.findById(id);
    }

    public void deleteById(String id){
        savingAccountRepository.deleteById(id);
    }
}
