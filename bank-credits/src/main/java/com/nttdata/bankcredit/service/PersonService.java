package com.nttdata.bankcredit.service;

import com.nttdata.bankcredit.entity.PersonEntity;

import java.util.List;

public interface PersonService {

    public List<PersonEntity> listPerson();

    public PersonEntity create(PersonEntity pe);

    public PersonEntity update(Integer id, Integer cantDues);

    public int delete(Integer id);


}
