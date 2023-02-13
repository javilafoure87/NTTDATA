package com.microservice.bankcustomer.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Table(name="customer")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class customerentity implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idClient;

    String name;
    String lastName;
    String dni;
    String tipClient;
    String address;



}
