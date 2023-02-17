package com.microservice.bankaccount.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Current Account Entity class.
 */
@Document(value = "current_account")
public class CurrentAccountEntity extends BankAccountEntity {

    /**
     *Method Super.
     */
    public CurrentAccountEntity() {
        super();
    }
}
