package com.or.learning.cruddemoh2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

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

	@PostMapping("/users")
	public ResponseEntity<List<UserInfoEntity>> saveUsers(@RequestBody List<User> users) {

		List<UserInfoEntity> userInfoEntity = null;
		userInfoEntity = userService.saveAllUsers(users);

		return new ResponseEntity<List<UserInfoEntity>>(userInfoEntity, HttpStatus.CREATED);

	}

	@PutMapping("/user/{id}")
	public ResponseEntity<UserInfoEntity> updateUser(@RequestBody User user,@PathVariable("id")Integer id) {
		UserInfoEntity userInfoEntity = null;
		userInfoEntity =userService.updateByUserId(user, id);
		return new ResponseEntity<UserInfoEntity>(userInfoEntity,HttpStatus.CREATED);

	}
	
	@GetMapping("/users")
	public ResponseEntity<List<UserInfoEntity>> getAllUsers() {
		
		List<UserInfoEntity> userInfoEntity = null;
		userInfoEntity =userService.getAllUsers();
		return new ResponseEntity<List<UserInfoEntity>>(userInfoEntity,HttpStatus.CREATED);

	}

	@GetMapping("/user/{id}")
	public ResponseEntity<UserInfoEntity> getUserById(@PathVariable("id")Integer id) {
		
		UserInfoEntity userInfoEntity = null;
		userInfoEntity =userService.getUserById(id);
		return new ResponseEntity<UserInfoEntity>(userInfoEntity,HttpStatus.CREATED);

	}

}