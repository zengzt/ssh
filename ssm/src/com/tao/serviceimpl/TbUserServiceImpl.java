package com.tao.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.tao.TbCommodityType;
import com.tao.TbCommodityTypeExample;
import com.tao.TbUser;
import com.tao.TbUserExample;
import com.tao.dao.TbCommodityTypeMapper;
import com.tao.dao.TbUserMapper;
import com.tao.service.TbUserService;

@Service
public class TbUserServiceImpl implements TbUserService {
	
	@Autowired
	private TbUserMapper tbusermapper; 
	@Autowired
	private TbCommodityTypeMapper tbcommoditytypemapper;

	@Override
	public String login(TbUserExample tbuserexample) {
		List<TbUser> user=tbusermapper.selectByExample(tbuserexample);
		if (user==null || user.size() ==0){
			System.out.println(1111);
			return "error";
		}
		return "index";
	}


	@Override
	public String register(TbUser tbuser) {
		System.out.println(tbuser.getUsername());
		int i=tbusermapper.insertSelective(tbuser);
		if (i==0){
			return "error";
		}
		return "success";
	}
	
	
	@Override
	public int zeng(TbUserExample tbuserexample) {
		List<TbUser> list = tbusermapper.selectByExample(tbuserexample);
		int i=0;
		for (TbUser x:list){
			i=x.getId();
		}
		return i;
	}
	
	
	@Override
	public int zeng1(TbCommodityTypeExample tbcommoditytypeexample) {
		List<TbCommodityType> listtct=tbcommoditytypemapper.selectByExample(tbcommoditytypeexample);
		int i=0;
		for (TbCommodityType b:listtct){
			i=b.getId();
			System.out.println(i);
		}
		return i;
	}
	
	@Override
	public List<TbCommodityType> test(TbCommodityTypeExample tbcommoditytypeexample) {
		//PageHelper.startPage(1, 2);
		List<TbCommodityType> listtct=tbcommoditytypemapper.selectByExample(tbcommoditytypeexample);
		for (TbCommodityType b:listtct){
			int i=b.getId();
			System.out.println(i);
		}
		return listtct;
	}
	


	
	
	

}
