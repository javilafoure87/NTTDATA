package com.nttdata.bankcredit.service;

import com.nttdata.bankcredit.entity.PersonEntity;
import com.nttdata.bankcredit.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    PersonRepository pr;

    @Override
    public List<PersonEntity> listPerson(){

        return pr.findAll();

    }

    @Override
    public PersonEntity create(PersonEntity pe){

        return pr.save(pe);
    }
   @Override
    public PersonEntity update (Integer id, Integer cantDues){
        PersonEntity pe = obtain(id);

        if (pe != null){

            pe.setCantDues(cantDues);
            pr.save(pe);
        }
        return pe;
    }

    public PersonEntity obtain (Integer id){

        return pr.findById(id).orElse(null);
    }

    public int delete(Integer id){
        PersonEntity pe = obtain(id);

        if (pe != null){
            pr.delete(pe);
            return 1;
        }else
            return 0;
    }
}
