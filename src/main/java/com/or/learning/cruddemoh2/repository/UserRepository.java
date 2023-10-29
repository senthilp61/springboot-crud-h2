package com.or.learning.cruddemoh2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.or.learning.cruddemoh2.entity.UserInfoEntity;
import com.or.learning.cruddemoh2.model.User;

public interface UserRepository extends JpaRepository<UserInfoEntity, Integer> {
		
	UserInfoEntity getById(User user);

}