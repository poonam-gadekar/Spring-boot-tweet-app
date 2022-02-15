package com.example.TweetApplication.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.TweetApplication.entity.TweetEntity;

public interface TweetDao extends MongoRepository<TweetEntity, Long> {

}
