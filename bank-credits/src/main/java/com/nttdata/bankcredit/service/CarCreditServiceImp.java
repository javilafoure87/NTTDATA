package com.nttdata.bankcredit.service;

import com.nttdata.bankcredit.entity.CarCreditEntity;
import com.nttdata.bankcredit.entity.PersonEntity;
import com.nttdata.bankcredit.repository.CarCreditRepository;
import com.nttdata.bankcredit.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarCreditServiceImp implements CarCreditService{

    @Autowired
    CarCreditRepository cr;

    @Override
    public List<CarCreditEntity> listCarCredit(){

        return cr.findAll();

    }

    @Override
    public CarCreditEntity create(CarCreditEntity cc){

        return cr.save(cc);
    }
    @Override
    public CarCreditEntity update (Integer id, Integer debt){
        CarCreditEntity cc = obtain(id);

        if (cc != null){

            cc.setDebt(debt);
            cr.save(cc);
        }
        return cc;
    }

    public CarCreditEntity obtain (Integer id){

        return cr.findById(id).orElse(null);
    }

    public int delete(Integer id){
        CarCreditEntity cc = obtain(id);

        if (cc != null){
            cr.delete(cc);
            return 1;
        }else
            return 0;
    }
}
