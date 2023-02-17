package com.microservice.bankaccount.controller;

import com.microservice.bankaccount.client.CustomerAccountClient;
import com.microservice.bankaccount.dto.SavingAccountDTO;
import com.microservice.bankaccount.entity.SavingAccountEntity;
import com.microservice.bankaccount.repository.SavingAccountRepository;
import com.microservice.bankaccount.service.SavingAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

/**
 * Saving Account Controller class.
 */
@RestController
@RequestMapping("/api/savingAccounts")
@RequiredArgsConstructor
public class SavingAccountController {

    @Autowired
    private SavingAccountService savingAccountService;
    private final SavingAccountRepository savingAccountRepository;

    @Autowired(required = true)
    private CustomerAccountClient customerAccountClient;

    /**
     * save Saving Account method.
     */
    @PostMapping("/save")
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

    /**
     * create Saving Account method.
     */
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createSavingAccount(@RequestBody SavingAccountEntity savingAccountEntity) {

        savingAccountService.saveSavingAccount(savingAccountEntity);
    }

    /**
     * get All Saving Accounts method.
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<SavingAccountEntity> getAllSavingAccounts() {

        return savingAccountService.finAll();
    }

    /**
     * find ById method.
     */
    @GetMapping("/{id}")
    public SavingAccountEntity findById(@PathVariable String id) {

        return savingAccountService.findById(id).get();
    }

    /**
     * update Saving Account method.
     */
    @PutMapping()
    public void updateSavingAccount(@RequestBody SavingAccountEntity savingAccountEntity) {

        savingAccountService.saveSavingAccount(savingAccountEntity);
    }

    /**
     * delete Saving AccountById method.
     */
    @DeleteMapping("/{id}")
    public void deleteSavingAccountById(@PathVariable String id) {

        savingAccountService.deleteById(id);
    }
}
