package com.tao.dao;

import com.tao.User;
import com.tao.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
	 //添加用户  
    public void addUser(User user);  
    
    User select(int id);
      
    //根据用户名和密码查询用户  
    //注解的两个参数会自动封装成map集合，括号内即为键  
    public void findUserByNameAndPwd(@Param("id")int id, @Param("name")String name);  
	
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}