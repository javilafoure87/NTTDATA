package com.microservice.bankaccount.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Fixed Term Account Entity Class.
 */
@Document(value = "fixed_term_account")
public class FixedTermAccountEntity extends BankAccountEntity {

    /**
     *Method Super.
     */
    public FixedTermAccountEntity() {
        super();
    }
}
