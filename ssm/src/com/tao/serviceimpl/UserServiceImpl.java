package com.tao.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tao.User;
import com.tao.dao.UserDao;
import com.tao.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userdao;
	
	
	@Override
	public String login(int id) {
		// TODO Auto-generated method stub
		User user=userdao.select(id);
		return user.getName();
	}

}
