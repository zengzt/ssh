package com.tao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tao.TbCommodity;
import com.tao.TbCommodityExample;
import com.tao.serviceimpl.TbCommodityServiceImpl;


@Controller
public class TbCommodityController {
	@Autowired
	private TbCommodityServiceImpl tbcommodityserviceimpl;
	TbCommodityExample tbcommodityexample=new TbCommodityExample();
	TbCommodityExample.Criteria criteria=tbcommodityexample.createCriteria();
	
	@RequestMapping("/selecttbcommodity")
	@ResponseBody
	public List<TbCommodity> selecttbcommodity(String name){
		//根据商品名字查询数据 模糊查询
		if (name==null){
			name="";
		}
		criteria.andCommoditynameLike(name);
		List<TbCommodity> tbcommodity=tbcommodityserviceimpl.selecttbcommodity(tbcommodityexample);
		return tbcommodity;
	}
	
	@RequestMapping("/inserttbcommodity")
	@ResponseBody
	public String inserttbcommodity(){
		//增加商品
		
		return "";
	}
	
	
	
}
