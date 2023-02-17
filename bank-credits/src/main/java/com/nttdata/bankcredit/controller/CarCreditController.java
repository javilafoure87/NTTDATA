package com.nttdata.bankcredit.controller;

import com.nttdata.bankcredit.entity.CarCreditEntity;
import com.nttdata.bankcredit.entity.PersonEntity;
import com.nttdata.bankcredit.service.CarCreditService;
import com.nttdata.bankcredit.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/carCredit")
public class CarCreditController {

    @Autowired
    CarCreditService cs;

    /**
     * list CarCredit method.
     */
    @GetMapping(value = "/list")
    public List<CarCreditEntity> listCarCredit(){

        return cs.listCarCredit();
    }

    /**
     * save CarCredit method.
     */
    @PostMapping(value = "/save")
    public CarCreditEntity save(@RequestBody CarCreditEntity cc){

        return cs.create(cc);
    }

    /**
     * pay CarCredit method.
     */
    @PutMapping(value = "/pay/{idCc}/debt")
    public CarCreditEntity update(@PathVariable("idCc") Integer idCc, @PathVariable("debt") Integer debt){
        return cs.update(idCc, debt);
    }

    /**
     * delete CarCredit method.
     */
    @DeleteMapping(value = "/delete/{idCc}")
    public int delete(@PathVariable("idCc") Integer idCc){
        return cs.delete(idCc);
    }
}
