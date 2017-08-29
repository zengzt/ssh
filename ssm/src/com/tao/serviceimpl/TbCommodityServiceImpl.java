package com.tao.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tao.TbCommodity;
import com.tao.TbCommodityExample;
import com.tao.dao.TbCommodityMapper;
import com.tao.dao.TbCommodityTypeMapper;
import com.tao.service.TbCommodityService;

@Service
public class TbCommodityServiceImpl implements TbCommodityService {
	
	@Autowired
	private TbCommodityMapper tbcommoditymapper;

	@Override
	public List<TbCommodity> selecttbcommodity(TbCommodityExample tbcommodityexample) {
		List<TbCommodity> tbcommodity=tbcommoditymapper.selectByExample(tbcommodityexample);
		return tbcommodity;
	}

}
