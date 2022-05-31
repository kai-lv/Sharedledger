package com.wut.javaee.sharedledger.service.impl;


import com.wut.javaee.sharedledger.model.LUser;
import com.wut.javaee.sharedledger.repository.LUserRepository;
import com.wut.javaee.sharedledger.service.LUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Objects;

@Service
public class LUserServiceImpl implements LUserService {
    @Resource
    private LUserRepository LUserRepository;

    @Override
    public LUser insertUser(LUser user) {
        return LUserRepository.save(user);
    }

    @Override
    public List<LUser> deleteUser(Long id) {
        LUserRepository.deleteById(id);
        return LUserRepository.findAll();
    }

    @Override
    public LUser updateUser(LUser user) {
        return LUserRepository.save(user);
    }

    @Override
    public List<LUser> findAllUser() {
        return LUserRepository.findAll();
    }

    @Override
    public String login(HttpSession session, LUser lUser) {
       LUser user = LUserRepository.findByName(lUser.getName());
       if(Objects.equals(user.getPassword(), lUser.getPassword())){
           session.setAttribute("lUser",lUser);
           return "welcome";
       }else {
           return "can't find,please check the name or password";
       }
    }
}
