package com.microservice.bankcustomer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.bankcustomer.entity.ClientEntity;
import com.microservice.bankcustomer.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {

    //implementation of methods
    @Autowired
    ClientRepository cr;

    @Override
    public List<ClientEntity> listClient() {
        
        return cr.findAll();
    }

    @Override
    public ClientEntity create(ClientEntity ce) {
        
        return cr.save(ce);
    }

    @Override
    public ClientEntity update (Integer id, String clientTip) {
        ClientEntity ce = obtain(id);
        
        if(ce != null){

            ce.setClientTip(clientTip);
            cr.save(ce);

        }
        return ce;
    }

    public ClientEntity obtain (Integer id){

        return cr.findById(id).orElse(null);
    }

    @Override
    public int delete(Integer id) {
        ClientEntity ce = obtain(id);

        if(ce != null){
            cr.delete(ce);
            return 1;
        }else
            return 0;

    }

    @Override
    public Optional<ClientEntity> findByDni(Integer dni) {

        return  cr.findByDni(dni);
    }
}
