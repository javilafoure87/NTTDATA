package com.microservice.bankaccount.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Setter
@Getter
@NoArgsConstructor
@Document(value = "movements")
public class MovementEntity {

    @Id
    private String Id;
    private String moneyWithdrawalMovement;
    private String moneyDepositMovement;

}
