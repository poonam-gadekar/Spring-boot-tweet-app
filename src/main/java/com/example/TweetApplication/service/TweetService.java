package com.example.TweetApplication.service;

import java.util.List;
import java.util.Optional;

import com.example.TweetApplication.entity.TweetEntity;

public interface TweetService {

	TweetEntity postTweet(TweetEntity tweetEntity);

	List<TweetEntity> allTweets();

	Optional<TweetEntity> findByIdTweet(Long id);

}
