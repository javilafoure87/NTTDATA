package com.nttdata.bankcredit.service;

import com.nttdata.bankcredit.entity.CarCreditEntity;


import java.util.List;

public interface CarCreditService {

    public List<CarCreditEntity> listCarCredit();

    public CarCreditEntity create(CarCreditEntity cc);

    public CarCreditEntity update(Integer id, Integer debt);

    public int delete(Integer id);
}
