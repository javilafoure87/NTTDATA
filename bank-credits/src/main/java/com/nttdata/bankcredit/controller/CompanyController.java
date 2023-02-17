package com.nttdata.bankcredit.controller;

import com.nttdata.bankcredit.entity.CompanyEntity;
import com.nttdata.bankcredit.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/api/company")
public class CompanyController {

    @Autowired
    CompanyService cs;

    /**
     * list company method.
     */
    @GetMapping(value = "/list")
    public List<CompanyEntity> listComp(){

        return cs.listComp();
    }

    /**
     * save company method.
     */
    @PostMapping(value = "/save")
    public CompanyEntity save(@RequestBody CompanyEntity ce){

        return cs.create(ce);
    }

    /**
     * pay company method.
     */
    @PutMapping(value = "/pay/{idCe}/{amount}")
    public CompanyEntity update(@PathVariable("idCe") Integer idCe, @PathVariable("cantDues") Integer amount){
        return cs.update(idCe, amount);
    }

    /**
     * delete company method.
     */
    @DeleteMapping(value = "/delete/{idCe}")
    public int delete(@PathVariable("idCe") Integer idCe){
        return cs.delete(idCe);
    }
}
