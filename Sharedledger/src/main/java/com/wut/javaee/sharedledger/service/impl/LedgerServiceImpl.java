package com.wut.javaee.sharedledger.service.impl;

import com.wut.javaee.sharedledger.model.Ledger;
import com.wut.javaee.sharedledger.repository.LedgerRepository;
import com.wut.javaee.sharedledger.service.LedgerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LedgerServiceImpl implements LedgerService {
    @Resource
    private LedgerRepository LedgerRepository;

    @Override
    public Ledger insertItem(Ledger item) {
        return LedgerRepository.save(item);
    }

    @Override
    public List<Ledger> deleteItem(Long id) {
        LedgerRepository.deleteById(id);
        return LedgerRepository.findAll();
    }

    @Override
    public Ledger updateItem(Ledger item) {
        return LedgerRepository.save(item);
    }

    @Override
    public List<Ledger> findAllItem() {
        return LedgerRepository.findAll();
    }
}
