package com.nttdata.bankcredit.controller;


import com.nttdata.bankcredit.entity.PersonEntity;
import com.nttdata.bankcredit.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/person")

public class PersonController {

    @Autowired
    PersonService ps;

    @GetMapping(value = "/list")
    public List<PersonEntity> listPerson(){

        return ps.listPerson();
    }

    @PostMapping(value = "/save")
    public PersonEntity save(@RequestBody PersonEntity pe){

        return ps.create(pe);
    }

    @PutMapping(value = "/update/{idPe}/cantDues")
    public PersonEntity update(@PathVariable("idPe") Integer idPe, @PathVariable("cantDues") Integer cantDues){
        return ps.update(idPe, cantDues);
    }

    @DeleteMapping(value = "/delete/{idCe}")
    public int delete(@PathVariable("idCe") Integer idCe){
        return ps.delete(idCe);
    }
}
