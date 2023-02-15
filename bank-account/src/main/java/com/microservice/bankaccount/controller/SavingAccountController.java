package com.microservice.bankaccount.controller;

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

    @RequestMapping("/{numberAccount}")
    public boolean savingAccountAvailable(@PathVariable String numberAccount){

        Optional<SavingAccountEntity> savingAccount = savingAccountService.findByNumberAccount(numberAccount);
        savingAccount.orElseThrow(() -> new RuntimeException("Cannot find Saving Account for the client" + numberAccount));
        return savingAccount.get().getMoney() > 0;
    }
    @PutMapping()
    public void updateSavingAccount(@RequestBody SavingAccountEntity savingAccountEntity){

        savingAccountService.saveSavingAccount(savingAccountEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteSavingAccountById(@PathVariable String id){

        savingAccountService.deleteById(id);
    }

    public String saveSavingAccount(@RequestBody SavingAccountDTO savingAccountDTO){

        SavingAccountEntity savingAccountEntity = new SavingAccountEntity();

        savingAccountEntity.setDepositNo(UUID.randomUUID().toString());
        savingAccountEntity.setDepositAccountEntities(savingAccountDTO.getDepositAccountEntities());

        savingAccountRepository.save(savingAccountEntity);

        return "Saving Account Saved";
    }
}
