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

    /**
     * implement list company method.
     */
    @Override
    public List<CompanyEntity> listComp(){

        return cr.findAll();
    }

    /**
     * implement create company method.
     */
    @Override
    public CompanyEntity create(CompanyEntity ce){

        return cr.save(ce);
    }

    /**
     * implement update company method.
     */
    public CompanyEntity update (Integer id, Integer amount){
        CompanyEntity ce = obtain(id);

        if (ce != null){
            ce.setCantDues(amount);
            cr.save(ce);
        }
        return ce;
    }

    /**
     * obtain method for update company method.
     */
    public CompanyEntity obtain(Integer id){

        return cr.findById(id).orElse(null);
    }

    /**
     * implement delete company method.
     */
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
