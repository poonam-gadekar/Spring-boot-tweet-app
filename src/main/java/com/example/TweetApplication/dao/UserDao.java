package com.example.TweetApplication.dao;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.TweetApplication.entity.UserEntity;

public interface UserDao extends MongoRepository<UserEntity, Long> {


}
