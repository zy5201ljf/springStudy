package com.zhangyue.springstudy.controller;

import com.zhangyue.springstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @Author zhangyue
 **/
@Controller("userController")
public class UserController {
    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void doStr(){
        userService.out();
        System.out.println("生活是苦的，但是要保持微笑！！！");
    }
}
