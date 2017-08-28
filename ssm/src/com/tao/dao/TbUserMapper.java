package com.tao.dao;

import com.tao.TbUser;
import com.tao.TbUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserMapper {
	
	//按条件计数
    int countByExample(TbUserExample example);
    
    //按条件删除
    int deleteByExample(TbUserExample example);
    
    //按主键删除
    int deleteByPrimaryKey(Integer id);
    
    //插入数据
    int insert(TbUser record);

    //有选择性的添加
    int insertSelective(TbUser record);

    //按条件查询
    List<TbUser> selectByExample(TbUserExample example);

    //按主键查询
    TbUser selectByPrimaryKey(Integer id);
 
    //按主键更新值不为null的字段
    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserExample example);

    //按条件更新
    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserExample example);

    //按主键更新值不为null的字段
    int updateByPrimaryKeySelective(TbUser record);

    //按主键更新
    int updateByPrimaryKey(TbUser record);
}