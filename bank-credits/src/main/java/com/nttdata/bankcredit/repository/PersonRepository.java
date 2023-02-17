package com.nttdata.bankcredit.repository;

import com.nttdata.bankcredit.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * person repository.
 */
@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {
}
