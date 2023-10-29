package com.or.learning.cruddemoh2.service;

import java.util.List;
import java.util.Optional;

import com.or.learning.cruddemoh2.entity.UserInfoEntity;
import com.or.learning.cruddemoh2.model.User;

public interface UserService {

	public UserInfoEntity save(User user);

	public List<UserInfoEntity> saveAllUsers(List<User> users);

	public UserInfoEntity getUserById(Integer id);

	public List<UserInfoEntity>  getAllUsers();

	public UserInfoEntity updateByUserId(User user,Integer id);

}