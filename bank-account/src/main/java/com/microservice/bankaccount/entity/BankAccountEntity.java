package com.microservice.bankaccount.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(value = "account_bank")
@Getter
@Setter
@NoArgsConstructor
public class BankAccountEntity {

    @Id
    private String id;
    private String numberAccount;
    private Float amount;
    private Float maintenanceCommission;
    private Integer moneyWithdrawalMovement;
    private Integer moneyDepositMovement;
    private Date createAt;

    public Integer depositeMoney(){
        Integer oneDepositeMoney=1;
        moneyDepositMovement=oneDepositeMoney;
        return  moneyDepositMovement;
    }
}
