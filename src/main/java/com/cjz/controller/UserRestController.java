package com.cjz.controller;

import com.cjz.service.UserService;
import com.cjz.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRestController {
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/json")
    public List<User> json(){
        List<User> list = userService.list();
        return list;
    }
}
