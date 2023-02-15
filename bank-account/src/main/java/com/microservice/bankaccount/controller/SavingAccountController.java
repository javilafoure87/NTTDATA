package com.microservice.bankaccount.controller;

import com.microservice.bankaccount.client.CustomerAccountClient;
import com.microservice.bankaccount.dto.SavingAccountDTO;
import com.microservice.bankaccount.entity.DepositAccountEntity;
import com.microservice.bankaccount.entity.SavingAccountEntity;
import com.microservice.bankaccount.repository.SavingAccountRepository;
import com.microservice.bankaccount.service.SavingAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/savingAccounts")
@RequiredArgsConstructor
public class SavingAccountController {

    @Autowired
    private SavingAccountService savingAccountService;
    private final SavingAccountRepository savingAccountRepository;
    @Autowired
    private CustomerAccountClient customerAccountClient;

    @PostMapping("/savingAccount")
    public String saveSavingAccount(@RequestBody SavingAccountDTO savingAccountDTO) {

        boolean inCustomerClient = savingAccountDTO.getDepositAccountEntities().stream()
                .allMatch(depositAccountEntity -> customerAccountClient.customerAvailable(depositAccountEntity.getDni()));


        if (inCustomerClient) {
            SavingAccountEntity savingAccountEntity = new SavingAccountEntity();

            savingAccountEntity.setDni(Integer.valueOf(UUID.randomUUID().toString()));
            savingAccountEntity.setDepositAccountEntities(savingAccountDTO.getDepositAccountEntities());

            savingAccountRepository.save(savingAccountEntity);

            return "Saving Account Saved";
        }
        return "Saving Cannot be Account Saved";
    }

    //Create SavingAccount(cuenta de ahorro)
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createSavingAccount(@RequestBody SavingAccountEntity savingAccountEntity){

        savingAccountService.saveSavingAccount(savingAccountEntity);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<SavingAccountEntity> getAllSavingAccounts(){

        return savingAccountService.finAll();
    }

    @GetMapping("/{id}")
    public SavingAccountEntity findById(@PathVariable String id){

        return savingAccountService.findById(id).get();
    }

    @PutMapping()
    public void updateSavingAccount(@RequestBody SavingAccountEntity savingAccountEntity){

        savingAccountService.saveSavingAccount(savingAccountEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteSavingAccountById(@PathVariable String id){

        savingAccountService.deleteById(id);
    }
}
