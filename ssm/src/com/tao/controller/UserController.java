package com.tao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tao.serviceimpl.UserServiceImpl;



@Controller
public class UserController {
	
	
	@Autowired
	private UserServiceImpl userService;
		
	@RequestMapping("/zeng")
	public String sel(){
		int id=2;
		return userService.login(id);
	}
}
