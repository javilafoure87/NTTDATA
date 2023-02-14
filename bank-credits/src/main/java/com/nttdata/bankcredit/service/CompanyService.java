package com.nttdata.bankcredit.service;

import com.nttdata.bankcredit.entity.CompanyEntity;

import java.util.List;

public interface CompanyService {

    public List<CompanyEntity>listComp();

    public CompanyEntity create(CompanyEntity ce);

    public CompanyEntity update(Integer id, Integer cantDues);

    public int delete(Integer id);
}
