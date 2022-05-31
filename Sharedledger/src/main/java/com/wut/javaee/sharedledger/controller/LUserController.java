package com.wut.javaee.sharedledger.controller;

import com.wut.javaee.sharedledger.model.LUser;
import com.wut.javaee.sharedledger.service.LUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/user")
public class LUserController {
    @Resource
    private LUserService LUserService;

    //新增用户
    @PostMapping("/add")
    public LUser addUser(@RequestBody LUser user){
        return LUserService.insertUser(user);
    }

    //删除用户
    @DeleteMapping("/delete/{id}")
    public List<LUser> deleteUser(@PathVariable("id") Long id){
        return LUserService.deleteUser(id);
    }

    //修改用户
    @PutMapping("/update")
    public LUser updateUser(@RequestBody LUser user){
        return LUserService.updateUser(user);
    }

    //查询列表
    @GetMapping("/findAll")
    public List<LUser> findALLUser(){
        return LUserService.findAllUser();
    }


    @PostMapping("/login")
    public String login(HttpSession session, @RequestBody LUser lUser){
        return LUserService.login(session, lUser);
    }
}
