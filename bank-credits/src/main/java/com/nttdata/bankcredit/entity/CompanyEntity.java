package com.nttdata.bankcredit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "company")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CompanyEntity implements Serializable {

    //definition of variables for the entity

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idCompany;

    int dni;
    int amount;
    int cantDues;
}
