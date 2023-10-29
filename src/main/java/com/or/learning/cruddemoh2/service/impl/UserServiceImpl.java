package com.or.learning.cruddemoh2.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.or.learning.cruddemoh2.entity.UserInfoEntity;
import com.or.learning.cruddemoh2.model.User;
import com.or.learning.cruddemoh2.repository.UserRepository;
import com.or.learning.cruddemoh2.service.UserService;

import jakarta.persistence.criteria.CriteriaBuilder.In;

@Service
public class UserServiceImpl implements UserService {

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

	public static UserInfoEntity saveUsers(User user) {
		UserInfoEntity entity = new UserInfoEntity();
		entity.setName(user.getName());
		entity.setDepartment(user.getDepartment());
		entity.setCreatedDate(new Date());
		entity.setLastModifiedDate(new Date());
		return entity;
	}

	@Override
	public List<UserInfoEntity> saveAllUsers(List<User> users) {
		List<UserInfoEntity> userInfoEntities = new ArrayList<>();
		for (User user : users) {
			userInfoEntities.add(saveUsers(user));
		}
		return userRepository.saveAllAndFlush(userInfoEntities);
	}

	@Override
	public UserInfoEntity updateByUserId(User user, Integer id) {
		Optional<UserInfoEntity> u = userRepository.findById(id);
		System.out.println("***U********");
		System.out.println("*********"+u);

		if (u.isPresent()) {
			u.get().setDepartment(user.getDepartment());
			userRepository.saveAndFlush(u.get());
		} else {
			System.out.println("User not found");
		}
		System.out.println("***U.get******"+u.get());

		return u.get();
	}

	@Override
	public List<UserInfoEntity> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public UserInfoEntity getUserById(Integer id) {
		return userRepository.findById(id).orElse(null);
	}

}