package com.microservice.bankaccount.controller;

import com.microservice.bankaccount.entity.DepositAccountEntity;
import com.microservice.bankaccount.service.DepositAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@SuppressWarnings("checkstyle:LineLength")
@RestController
@RequestMapping("/api/deposits")
@RequiredArgsConstructor
public class DepositAccountController {


    @Autowired
    private DepositAccountService depositAccountService;


   /***
    * @PostMapping
    ** ResponseStatus(HttpStatus.OK)
    ** public void saveDepositAccount(@RequestBody DepositAccountEntity depositAccountEntity){
    *       depositAccountService.saveDepositAccount(depositAccountEntity);
    * }
    */

    @PostMapping("/deposit/{id}")
    public boolean savingDepositAccountAvailable(@RequestBody String id) {

        Optional<DepositAccountEntity> depositAccount = depositAccountService.findById(id);
        depositAccount.orElseThrow(() -> new RuntimeException("Cannot find Saving Account for the client" + id));
        return depositAccount.get().getAmount() > 0;
    }


}
