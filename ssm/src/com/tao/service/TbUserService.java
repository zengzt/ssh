package com.tao.service;

import java.util.List;

import com.tao.TbCommodityType;
import com.tao.TbCommodityTypeExample;
import com.tao.TbUser;
import com.tao.TbUserExample;

public interface TbUserService {
	
	public String login(TbUserExample tbuser);
	
	public String register(TbUser tbuser);

	int zeng(TbUserExample tbuserexample);

	int zeng1(TbCommodityTypeExample tbcommoditytypeexample);

	List<TbCommodityType> test(TbCommodityTypeExample tbcommoditytypeexample);
	



}
