package com.microservice.bankcustomer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.bankcustomer.entity.ClientEntity;
import com.microservice.bankcustomer.service.ClientService;



@RestController
@RequestMapping(value = "/cust")

public class ClientController {

    @Autowired
    ClientService cs;

    @GetMapping(value = "/list")
    public List<ClientEntity> listarcust(){

        return cs.listcust();
    }

    @PostMapping(value = "/save")
    public ClientEntity save(@RequestBody ClientEntity ce){
        return cs.create(ce);
    }
    @PutMapping(value = "/update/{idce}/{tipce}")
    public ClientEntity update(@PathVariable("idce") Integer idce, @PathVariable("tipce") String tipce){
        return cs.update(idce, tipce);

    }
    @DeleteMapping(value = "/delete/{idce}")
    public int delete(@PathVariable("idce") Integer idce){
        return cs.delete(idce);

    }
    

}
