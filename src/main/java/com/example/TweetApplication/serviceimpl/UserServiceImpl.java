package com.example.TweetApplication.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TweetApplication.dao.UserDao;
import com.example.TweetApplication.entity.UserEntity;
import com.example.TweetApplication.service.UserService;

@Service
public class UserServiceImpl implements UserService {
 @Autowired
	private UserDao userdao;
	@Override
	public UserEntity postUser(UserEntity userEntity) {
		UserEntity userEntity2 = userdao.save(userEntity);
		return userEntity2;
	}
	@Override
	public List<UserEntity> getAllUsers() {
		List<UserEntity> userEntities = userdao.findAll();
		return userEntities;
	}
	
	@Override
	public Optional<UserEntity> findById(Long id) {
		Optional<UserEntity> userEntity = userdao.findById(id);
		
		return userEntity;
	}
	
	
	

}
