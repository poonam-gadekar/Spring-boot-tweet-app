package com.example.TweetApplication.service;

import java.util.List;
import java.util.Optional;

import com.example.TweetApplication.entity.UserEntity;

public interface UserService {

	UserEntity postUser(UserEntity userEntity);

	List<UserEntity> getAllUsers();

	Optional<UserEntity> findById(Long id);




}
