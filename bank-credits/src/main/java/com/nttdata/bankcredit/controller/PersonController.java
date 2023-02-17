package com.nttdata.bankcredit.controller;


import com.nttdata.bankcredit.entity.PersonEntity;
import com.nttdata.bankcredit.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/person")

public class PersonController {

    @Autowired
    PersonService ps;

    /**
     * list person method.
     */
    @GetMapping(value = "/list")
    public List<PersonEntity> listPerson(){

        return ps.listPerson();
    }

    /**
     * save person method.
     */
    @PostMapping(value = "/save")
    public PersonEntity save(@RequestBody PersonEntity pe){

        return ps.create(pe);
    }

    /**
     * pay person method.
     */
    @PutMapping(value = "/pay/{idPe}/{amount}")
    public PersonEntity update(@PathVariable("idPe") Integer idPe, @PathVariable("amount") Integer amount){

        return ps.update(idPe, amount);
    }

    /**
     * delete person method.
     */
    @DeleteMapping(value = "/delete/{idCe}")
    public int delete(@PathVariable("idCe") Integer idCe){
        return ps.delete(idCe);
    }
}
