package com.nttdata.bankcredit.service;

import com.nttdata.bankcredit.entity.CompanyEntity;

import java.util.List;

public interface CompanyService {

    //definition of methods and their parameters (definicion de metodos y sus parametros)

    public List<CompanyEntity>listComp();

    public CompanyEntity create(CompanyEntity ce);

    public CompanyEntity update(Integer id, Integer amount);

    public int delete(Integer id);
}
