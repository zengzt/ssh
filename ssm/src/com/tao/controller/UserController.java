package com.tao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tao.serviceimpl.UserServiceImpl;



@Controller
public class UserController {
	
	
	@Autowired
	private UserServiceImpl userService;
		
	@RequestMapping("/zeng")
	public String sel(){
		int id=1;
		return userService.login(id);
	}
}
