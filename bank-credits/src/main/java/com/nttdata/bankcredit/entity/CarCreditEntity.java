package com.nttdata.bankcredit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "card")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarCreditEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idCard;

    int dni;
    int cardNumber;
    int creditLine;
    int debt;
}
