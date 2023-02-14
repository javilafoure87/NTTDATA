package com.nttdata.bankcredit.service;

import com.nttdata.bankcredit.entity.CompanyEntity;
import com.nttdata.bankcredit.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    CompanyRepository cr;

    @Override
    public List<CompanyEntity> listComp(){
        return cr.findAll();
    }

    @Override
    public CompanyEntity create(CompanyEntity ce){
        return cr.save(ce);
    }

    public CompanyEntity update (Integer id, Integer cantDues){
        CompanyEntity ce = obtain(id);

        if (ce != null){
            ce.setCantDues(cantDues);
            cr.save(ce);
        }
        return ce;
    }

    public CompanyEntity obtain(Integer id){

        return cr.findById(id).orElse(null);
    }

    @Override
    public int delete(Integer id){
        CompanyEntity ce = obtain(id);

        if (ce !=null){
            cr.delete(ce);
            return 1;
        }else
            return 0;
    }
}
