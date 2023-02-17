package com.nttdata.bankcredit.service;

import com.nttdata.bankcredit.entity.PersonEntity;

import java.util.List;

public interface PersonService {

    //definition of methods and their parameters (definicion de metodos y sus parametros)

    public List<PersonEntity> listPerson();

    public PersonEntity create(PersonEntity pe);

    public PersonEntity update(Integer id, Integer amount);

    public int delete(Integer id);


}
