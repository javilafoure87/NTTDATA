package com.microservice.bankcustomer.service;

import java.util.List;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.bankcustomer.entity.customerentity;
import com.microservice.bankcustomer.repository.customerRepository;

@Service
public class custserviceimpl implements custservice {

    @Autowired
    customerRepository cr;

    @Override
    public List<customerentity> listcust() {
        
        return cr.findAll();
    }

    @Override
    public customerentity create(customerentity ce) {
        
        return cr.save(ce);
    }

    @Override
    public customerentity update (Integer id, String tipclient) {
        customerentity ce = obtain(id);
        
        if(ce != null){

            ce.setTipClient(tipclient);
            cr.save(ce);

        }
        return ce;
    }

    public customerentity obtain (Integer id){

        return cr.findById(id).orElse(null);
    }

    @Override
    public int delete(Integer id) {
        customerentity ce = obtain(id);

        if(ce != null){
            cr.delete(ce);
            return 1;
        }else
       return 0;

        

        
    }
    

}
