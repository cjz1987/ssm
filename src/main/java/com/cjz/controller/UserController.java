package com.cjz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjz.service.UserService;
import com.cjz.vo.User;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(ModelMap model) {
        List<User> list = userService.list();
        System.out.println(list);
        model.addAttribute("lists", list);
        model.addAttribute("name", "macro");
        model.addAttribute("heading", "abababbababba");
        return "/list.jsp";
    }
}
