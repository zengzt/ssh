package com.tao.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tao.TbCommodityType;
import com.tao.TbCommodityTypeExample;
import com.tao.TbUser;
import com.tao.TbUserExample;
import com.tao.serviceimpl.TbUserServiceImpl;

@Controller
public class TbUserController {
	
	@Autowired
	private TbUserServiceImpl tbuserserviceimpl;
	private TbUserExample tbuserexample;
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request, HttpServletResponse response){
		//账号未设置成唯一
		//登录
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		TbUserExample tbuserexample=new TbUserExample();
		TbUserExample.Criteria criteria=tbuserexample.createCriteria();
		criteria.andUsernameEqualTo(name);
		criteria.andPasswordEqualTo(password);
		return tbuserserviceimpl.login(tbuserexample);
	}
	
	@RequestMapping("/registerseller")
	public String registerseller (HttpServletRequest request, HttpServletResponse response){
		//用户注册商家
		String shopname = request.getParameter("shopname"); 
		String sendcity = request.getParameter("sendcity"); 
		return null;
	}
	
	@RequestMapping("/register")
	public String register(HttpServletRequest request, HttpServletResponse response){
		//注册账号
		TbUser tbuser = new TbUser();
		tbuser.setUsername(request.getParameter("username"));
		tbuser.setPassword(request.getParameter("password"));
		tbuser.setPhone(request.getParameter("phone"));
		tbuser.setSex(request.getParameter("sex"));
		tbuser.setEmail(request.getParameter("email"));
		Date date=new Date();
		tbuser.setCreatedtime(date);
		System.out.println(request.getParameter("username"));
		return tbuserserviceimpl.register(tbuser);
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
	
	@RequestMapping("/test")
	@ResponseBody
	public List<TbCommodityType> test2(){
			TbCommodityTypeExample tbcommoditytypeexample=new TbCommodityTypeExample();
			TbCommodityTypeExample.Criteria c=tbcommoditytypeexample.createCriteria();
			String name="ceshi";
			c.andTypenameLike(name);
			List<TbCommodityType> z=tbuserserviceimpl.test(tbcommoditytypeexample);
			return z;
	}
	
			
	
	
}

