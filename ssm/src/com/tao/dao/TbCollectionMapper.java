package com.tao.dao;

import com.tao.TbCollection;
import com.tao.TbCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCollectionMapper {
    int countByExample(TbCollectionExample example);

    int deleteByExample(TbCollectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbCollection record);

    int insertSelective(TbCollection record);

    List<TbCollection> selectByExample(TbCollectionExample example);

    TbCollection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbCollection record, @Param("example") TbCollectionExample example);

    int updateByExample(@Param("record") TbCollection record, @Param("example") TbCollectionExample example);

    int updateByPrimaryKeySelective(TbCollection record);

    int updateByPrimaryKey(TbCollection record);
}