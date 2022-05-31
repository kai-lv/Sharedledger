package com.wut.javaee.sharedledger.model;

import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
@Entity
@Table(name = "LUser")
@EntityListeners(AuditingEntityListener.class)
public class LUser {
    @Id
    @Column(name = "USERID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userid;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PASSWORD")
    private String password;





}
