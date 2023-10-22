package com.or.learning.cruddemoh2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.or.learning.cruddemoh2.entity.UserInfoEntity;

public interface UserRepository extends JpaRepository<UserInfoEntity, Integer> {

}
