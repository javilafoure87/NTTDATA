package com.nttdata.bankcredit.service;

import com.nttdata.bankcredit.entity.CarCreditEntity;


import java.util.List;

public interface CarCreditService {

    //definition of methods and their parameters (definicion de metodos y sus parametros)

    public List<CarCreditEntity> listCarCredit();

    public CarCreditEntity create(CarCreditEntity cc);

    public CarCreditEntity update(Integer id, Integer debt);

    public int delete(Integer id);
}
