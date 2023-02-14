package com.nttdata.bankcredit.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Person")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class PersonEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPerson;

    int dni;
    int amount;
    int cantDues;
}
