package com.microservice.bankaccount.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@NoArgsConstructor
@Document(value = "deposit")
public class DepositAccountEntity {

   @Id
    private String id;
    private Float amount;
    private String nameDeposit;
    private SavingAccountEntity savingAccountEntity;
}
