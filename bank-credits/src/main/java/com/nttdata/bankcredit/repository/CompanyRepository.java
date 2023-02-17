package com.nttdata.bankcredit.repository;

import com.nttdata.bankcredit.entity.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * company repository.
 */
@Repository
public interface CompanyRepository extends JpaRepository<CompanyEntity, Integer> {
}
