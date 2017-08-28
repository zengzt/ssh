package com.tao.dao;

import com.tao.TbCommodityPurchase;
import com.tao.TbCommodityPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCommodityPurchaseMapper {
    int countByExample(TbCommodityPurchaseExample example);

    int deleteByExample(TbCommodityPurchaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCommodityPurchase record);

    int insertSelective(TbCommodityPurchase record);

    List<TbCommodityPurchase> selectByExample(TbCommodityPurchaseExample example);

    TbCommodityPurchase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCommodityPurchase record, @Param("example") TbCommodityPurchaseExample example);

    int updateByExample(@Param("record") TbCommodityPurchase record, @Param("example") TbCommodityPurchaseExample example);

    int updateByPrimaryKeySelective(TbCommodityPurchase record);

    int updateByPrimaryKey(TbCommodityPurchase record);
}