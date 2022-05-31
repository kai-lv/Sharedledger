package com.wut.javaee.sharedledger.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "Ledger")
@EntityListeners(AuditingEntityListener.class)
public class Ledger {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ITEM")
    private String item;

    @Column(name = "MONEY")
    private float money;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "CREATED_BY")
    @CreatedBy
    private String createdBy;

    @Column(name = "CREATED_DATE")
    @CreatedDate
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createdDate;
}
