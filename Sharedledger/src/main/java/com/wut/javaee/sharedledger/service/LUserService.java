package com.wut.javaee.sharedledger.service;

import com.wut.javaee.sharedledger.model.LUser;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface LUserService {
    //增加用户
    LUser insertUser(LUser user);
    //删除用户
    List<LUser> deleteUser(Long id);
    //修改用户信息
    LUser updateUser(LUser user);
    //查询所有用户
    List<LUser> findAllUser();
    //账号登录
    String login(HttpSession session, LUser luser);
}
