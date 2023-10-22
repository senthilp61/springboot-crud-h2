package com.or.learning.cruddemoh2.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.or.learning.cruddemoh2.entity.UserInfoEntity;
import com.or.learning.cruddemoh2.model.User;
import com.or.learning.cruddemoh2.repository.UserRepository;
import com.or.learning.cruddemoh2.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	@Override
	public UserInfoEntity save(User user) {
		
		UserInfoEntity entity = new UserInfoEntity();
		entity.setName(user.getName());
		entity.setDepartment(user.getDepartment());
		entity.setCreatedDate(new Date());
		entity.setLastModifiedDate(new Date());
		
		return userRepository.saveAndFlush(entity);
		
	}
	
	
	
	
}
