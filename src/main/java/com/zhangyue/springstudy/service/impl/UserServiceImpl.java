package com.zhangyue.springstudy.service.impl;

import com.zhangyue.springstudy.dao.UserDao;
import com.zhangyue.springstudy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author zhangyue
 **/
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void out() {
        userDao.print();
        System.out.println("在苦难也要坚持下去！！！！");
    }
}
