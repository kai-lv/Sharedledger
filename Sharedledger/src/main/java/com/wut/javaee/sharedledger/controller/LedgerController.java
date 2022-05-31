package com.wut.javaee.sharedledger.controller;

import com.wut.javaee.sharedledger.model.Ledger;
import com.wut.javaee.sharedledger.repository.LUserRepository;
import com.wut.javaee.sharedledger.service.LUserService;
import com.wut.javaee.sharedledger.service.LedgerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Ledger")
public class LedgerController {
    @Resource
    private LedgerService LedgerService;


    //新增条目
    @PostMapping("/add")
    public Ledger addItem(@RequestBody Ledger item){
        return LedgerService.insertItem(item);
    }

    //删除条目
    @DeleteMapping("/delete/{id}")
    public List<Ledger> deleteItem(@PathVariable("id") Long id){
        return LedgerService.deleteItem(id);
    }

    //修改条目
    @PutMapping("/update")
    public Ledger updateItem(@RequestBody Ledger item){
        return LedgerService.updateItem(item);
    }

    @GetMapping("/findAll")
    public List<Ledger> findAll(){
        return LedgerService.findAllItem();
    }

}
