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

    /**
     * implement list person method.
     */
    @Override
    public List<PersonEntity> listPerson(){

        return pr.findAll();

    }

    /**
     * implement create person method.
     */
    @Override
    public PersonEntity create(PersonEntity pe){

        return pr.save(pe);
    }

    /**
     * implement update person method.
     */
   @Override
    public PersonEntity update (Integer dni, Integer amount){
        PersonEntity pe = obtain(dni);

        if (pe != null){

            pe.setAmount(amount);
            pr.save(pe);
        }
        return pe;
    }

    /**
     * obtain method for update person method.
     */
    public PersonEntity obtain (Integer id){

        return pr.findById(id).orElse(null);
    }

    /**
     * implement delete person method.
     */
    public int delete(Integer id){
        PersonEntity pe = obtain(id);

        if (pe != null){
            pr.delete(pe);
            return 1;
        }else
            return 0;
    }

}
