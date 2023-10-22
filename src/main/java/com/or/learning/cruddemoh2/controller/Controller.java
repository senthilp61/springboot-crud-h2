package com.or.learning.cruddemoh2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.or.learning.cruddemoh2.entity.UserInfoEntity;
import com.or.learning.cruddemoh2.model.User;
import com.or.learning.cruddemoh2.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class Controller {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/test")
	public String testConnection() {
		
		return "Connection is successful";
	}
	
	@PostMapping("/user")
	public ResponseEntity<UserInfoEntity> saveUser(@RequestBody User user) {
		
		UserInfoEntity userEntity = null;
		userEntity = userService.save(user);
		
		return new ResponseEntity<UserInfoEntity>(userEntity, HttpStatus.CREATED);
	}

}
