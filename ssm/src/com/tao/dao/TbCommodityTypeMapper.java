package com.tao.dao;

import com.tao.TbCommodityType;
import com.tao.TbCommodityTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCommodityTypeMapper {
    int countByExample(TbCommodityTypeExample example);

    int deleteByExample(TbCommodityTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCommodityType record);

    int insertSelective(TbCommodityType record);

    List<TbCommodityType> selectByExample(TbCommodityTypeExample example);

    TbCommodityType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCommodityType record, @Param("example") TbCommodityTypeExample example);

    int updateByExample(@Param("record") TbCommodityType record, @Param("example") TbCommodityTypeExample example);

    int updateByPrimaryKeySelective(TbCommodityType record);

    int updateByPrimaryKey(TbCommodityType record);
}