package com.wut.javaee.sharedledger.repository;

import com.wut.javaee.sharedledger.model.Ledger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LedgerRepository extends JpaRepository<Ledger, Long> {
}
