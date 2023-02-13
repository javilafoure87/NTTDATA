package com.microservice.bankaccount.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "fixed_term_account")
public class FixedTermAccountEntity extends BankAccountEntity {

    public FixedTermAccountEntity(){
        super();
    }
}
