package com.microservice.bankaccount.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "current_account")
public class CurrentAccountEntity extends BankAccountEntity{

    public CurrentAccountEntity(){
        super();
    }
}
