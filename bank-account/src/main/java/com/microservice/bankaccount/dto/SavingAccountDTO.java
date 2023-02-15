package com.microservice.bankaccount.dto;

import com.microservice.bankaccount.entity.DepositAccountEntity;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SavingAccountDTO {

    private List<DepositAccountEntity> depositAccountEntities;
}
