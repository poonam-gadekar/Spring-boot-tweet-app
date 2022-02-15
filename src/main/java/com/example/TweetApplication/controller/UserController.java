package com.example.TweetApplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TweetApplication.entity.UserEntity;
import com.example.TweetApplication.service.UserService;

@RestController
@RequestMapping("/api/v1.0/tweets")
@CrossOrigin(origins = "http://localhost:9090/api/v1.0/tweets")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/users")
	public UserEntity postUser(@RequestBody UserEntity userEntity) {
		return userService.postUser(userEntity);

	}
	
	@GetMapping("/allUsers")
	public List<UserEntity> getAllUsers(){
		return userService.getAllUsers();
		
	}
	@GetMapping("/findById/{id}")
	public Optional<UserEntity> findById(@PathVariable Long id) {
		return userService.findById(id);
	}
}
