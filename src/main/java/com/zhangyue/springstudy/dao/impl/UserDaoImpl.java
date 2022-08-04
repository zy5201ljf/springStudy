package com.zhangyue.springstudy.dao.impl;

import com.zhangyue.springstudy.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @Author zhangyue
 **/
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void print() {
        System.out.println("自闭，落寞");
    }
}
