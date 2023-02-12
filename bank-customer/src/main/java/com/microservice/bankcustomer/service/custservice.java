package com.microservice.bankcustomer.service;

import java.util.List;
import com.microservice.bankcustomer.entity.customerentity;

public interface custservice {
    
public List<customerentity> listcust();

public customerentity create(customerentity ce);

public customerentity update(Integer id, String tipclient);

public int delete(Integer id);


}
