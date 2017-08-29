package com.tao.service;

import java.util.List;

import com.tao.TbCommodity;
import com.tao.TbCommodityExample;

public interface TbCommodityService {

	List<TbCommodity> selecttbcommodity(TbCommodityExample tbcommodityexample);

}
