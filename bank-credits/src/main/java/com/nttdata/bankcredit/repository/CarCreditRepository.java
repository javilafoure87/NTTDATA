package com.nttdata.bankcredit.repository;

import com.nttdata.bankcredit.entity.CarCreditEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * carCredit repository.
 */
@Repository
public interface CarCreditRepository extends JpaRepository<CarCreditEntity, Integer> {
}
