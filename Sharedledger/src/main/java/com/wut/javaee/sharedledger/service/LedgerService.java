package com.wut.javaee.sharedledger.service;

import com.wut.javaee.sharedledger.model.Ledger;

import java.util.List;

public interface LedgerService {
    //增加账单条目
    Ledger insertItem(Ledger item);
    //删除账单条目
    List<Ledger> deleteItem(Long id);
    //修改账单条目
    Ledger updateItem(Ledger item);
    //查询所有账单条目
    List<Ledger> findAllItem();
}
