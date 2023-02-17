package com.microservice.bankcustomer.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.microservice.bankcustomer.repository.ClientRepository;
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
@RequestMapping(value = "/api/client")

public class ClientController {

    @Autowired
    ClientService cs;
    @Autowired
    private ClientRepository clientRepository;

    /**
     * list client method.
     */
    @GetMapping(value = "/list")
    public List<ClientEntity> listClient(){

        return cs.listClient();
    }

    /**
     * save client method.
     */
    @PostMapping(value = "/save")
    public ClientEntity save(@RequestBody ClientEntity ce){

        return cs.create(ce);
    }

    /**
     * update client method.
     */
    @PutMapping(value = "/update/{idCe}/{tipCe}")
    public ClientEntity update(@PathVariable("idCe") Integer idCe, @PathVariable("tipCe") String tipCe){
        return cs.update(idCe, tipCe);
    }

    /**
     * delete client method.
     */
    @DeleteMapping(value = "/delete/{idCe}")
    public int delete(@PathVariable("idCe") Integer idCe){
        return cs.delete(idCe);

    }

    /**
     * find by dni client in database  method.
     */
    @RequestMapping("/{dni}")
    public boolean customerAvailable(@PathVariable Integer dni){

        Optional<ClientEntity> client = clientRepository.findByDni(dni);
        client.orElseThrow(() -> new RuntimeException("Cannot find Saving Account for the client" + dni));
        return client.get().getDni()> 0;
    }
}
