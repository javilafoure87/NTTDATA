package com.nttdata.bankcredit.controller;

import com.nttdata.bankcredit.entity.CompanyEntity;
import com.nttdata.bankcredit.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/company")
public class CompanyController {

    @Autowired
    CompanyService cs;

    @GetMapping(value = "/list")
    public List<CompanyEntity> listComp(){

        return cs.listComp();
    }

    @PostMapping(value = "/save")
    public CompanyEntity save(@RequestBody CompanyEntity ce){

        return cs.create(ce);
    }

    @PutMapping(value = "/update/{idCe}/cantDues")
    public CompanyEntity update(@PathVariable("idCe") Integer idCe, @PathVariable("cantDues") Integer cantDues){
        return cs.update(idCe, cantDues);
    }

    @DeleteMapping(value = "/delete/{idCe}")
    public int delete(@PathVariable("idCe") Integer idCe){
        return cs.delete(idCe);
    }
}
