package com.microservice.bankaccount.entity;

import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "saving_account")

public class SavingAccountEntity extends BankAccountEntity{

    public SavingAccountEntity(){
        super();
    }
    public Float maintenanceCommission(){

        setMaintenanceCommission((float) 0);
        return (float) 0;
    }
}
