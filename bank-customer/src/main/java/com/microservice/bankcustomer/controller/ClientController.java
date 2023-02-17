package com.microservice.bankcustomer.controller;

import com.microservice.bankcustomer.entity.ClientEntity;
import com.microservice.bankcustomer.repository.ClientRepository;
import com.microservice.bankcustomer.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "/api/client")

public class ClientController {

    @Autowired
    ClientService cs;
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping(value = "/list")
    public List<ClientEntity> listClient() {
        return cs.listClient();
    }

    @PostMapping(value = "/save")
    public ClientEntity save(@RequestBody ClientEntity ce) {
        return cs.create(ce);
    }

    @PutMapping(value = "/update/{idCe}/{tipCe}")
    public ClientEntity update(@PathVariable("idCe") Integer idCe, @PathVariable("tipCe") String tipCe) {
        return cs.update(idCe, tipCe);

    }

    @DeleteMapping(value = "/delete/{idCe}")
    public int delete(@PathVariable("idCe") Integer idCe) {
        return cs.delete(idCe);

    }

    @RequestMapping("/{dni}")
    public boolean customerAvailable(@PathVariable Integer dni) {

        Optional<ClientEntity> client = clientRepository.findByDni(dni);
        client.orElseThrow(() -> new RuntimeException("Cannot find Saving Account for the client" + dni));
        return client.get().getDni() > 0;
    }
}
