package com.microservice.bankaccount.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(value = "account_bank")
@Getter
@Setter
@NoArgsConstructor
public class BankAccountEntity {

    @Id
    private String id;
    private String numberAccount;
    private Float money;
    private Float maintenanceCommission;
    private Date createAt;
    private List<MovementEntity> movementsNumberAccount;

}
