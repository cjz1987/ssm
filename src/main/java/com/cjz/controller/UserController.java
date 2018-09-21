package com.cjz.controller;

import com.cjz.service.UserService;
import com.cjz.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

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
