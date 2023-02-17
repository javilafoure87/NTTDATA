package com.microservice.bankcustomer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.bankcustomer.entity.ClientEntity;
import com.microservice.bankcustomer.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository cr;

    /**
     * implement list client method.
     */
    @Override
    public List<ClientEntity> listClient() {
        
        return cr.findAll();
    }

    /**
     * implement create client method.
     */
    @Override
    public ClientEntity create(ClientEntity ce) {
        
        return cr.save(ce);
    }

    /**
     * implement update client method.
     */
    @Override
    public ClientEntity update (Integer id, String clientTip) {
        ClientEntity ce = obtain(id);
        
        if(ce != null){

            ce.setClientTip(clientTip);
            cr.save(ce);

        }
        return ce;
    }

    /**
     * obtain method for update client method.
     */
    public ClientEntity obtain (Integer id){

        return cr.findById(id).orElse(null);
    }

    /**
     * implement delete client method.
     */
    @Override
    public int delete(Integer id) {
        ClientEntity ce = obtain(id);

        if(ce != null){
            cr.delete(ce);
            return 1;
        }else
            return 0;

    }

    /**
     * implement find by dni client in database  method.
     */
    @Override
    public Optional<ClientEntity> findByDni(Integer dni) {

        return  cr.findByDni(dni);
    }
}
