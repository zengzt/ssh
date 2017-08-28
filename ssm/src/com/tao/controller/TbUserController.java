package com.tao.controller;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tao.TbCommodityTypeExample;
import com.tao.TbUserExample;
import com.tao.serviceimpl.TbUserServiceImpl;

@Controller
public class TbUserController {
	
	@Autowired
	private TbUserServiceImpl tbuserserviceimpl;
	private TbUserExample tbuserexample;
	private Date date;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response){
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(name);
		System.out.println(password);
		return tbuserserviceimpl.login(tbuserexample);
	}
	
	@RequestMapping("/register")
	public String register(HttpServletRequest request, HttpServletResponse response){
		return null;
	}
	
	@RequestMapping("/zeng")
	public String test(){
			TbUserExample tbuserexample=new TbUserExample();
			TbUserExample.Criteria criteria=tbuserexample.createCriteria();
			String name="username";
			criteria.andUsernameEqualTo(name);
			int i=tbuserserviceimpl.zeng(tbuserexample);
			return name;
	}
	
	@RequestMapping("/zeng1")
	public String test1(){
			TbCommodityTypeExample tbcommoditytypeexample=new TbCommodityTypeExample();
			TbCommodityTypeExample.Criteria c=tbcommoditytypeexample.createCriteria();
			String name="ceshi";
			c.andTypenameLike(name);
			int z=tbuserserviceimpl.zeng1(tbcommoditytypeexample);
			return "name";
	}
	
	
	
			
	
	
}

