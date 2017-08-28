package com.tao.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		if (user==null){
			return "error"; 
		}
		return null;
	}


	@Override
	public String register(TbUser tbuser) {
		int i=tbusermapper.insert(tbuser);
		System.out.println(i);
		return null;
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

}
