package com.niydiy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niydiy.service.UserService;
import com.niydiy.vo.User;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/list")
	public String list(ModelMap model) {
		List<User> list = userService.list();
		System.out.println(list);
		model.addAttribute("lists", list);
		model.addAttribute("name", "macro");
		model.addAttribute("heading", "abababbababba");
		return "/list.jsp";
	}
}
