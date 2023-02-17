package com.microservice.bankaccount.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Saving Account Entity class
 */
@Document(value = "saving_account")
public class SavingAccountEntity extends BankAccountEntity {

    /**
     * Saving Account Entity method.
     */
    public SavingAccountEntity() {
        super();
    }
}
