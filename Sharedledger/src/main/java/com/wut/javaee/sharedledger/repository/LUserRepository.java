package com.wut.javaee.sharedledger.repository;

import com.wut.javaee.sharedledger.model.LUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface LUserRepository extends JpaRepository<LUser, Long> {
    LUser findByName(@Param("name") String name);
}
