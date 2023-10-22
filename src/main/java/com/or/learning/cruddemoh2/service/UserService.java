package com.or.learning.cruddemoh2.service;

import com.or.learning.cruddemoh2.entity.UserInfoEntity;
import com.or.learning.cruddemoh2.model.User;

public interface UserService {
	
	public UserInfoEntity save(User user);

}
