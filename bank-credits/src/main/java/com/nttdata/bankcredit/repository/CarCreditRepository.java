package com.nttdata.bankcredit.repository;

import com.nttdata.bankcredit.entity.CarCreditEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarCreditRepository extends JpaRepository<CarCreditEntity, Integer> {
}
