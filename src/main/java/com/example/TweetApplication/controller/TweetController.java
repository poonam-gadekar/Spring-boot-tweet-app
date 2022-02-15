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

import com.example.TweetApplication.entity.TweetEntity;
import com.example.TweetApplication.service.TweetService;

@RestController
@RequestMapping("/api/v1.0/tweets")
@CrossOrigin(origins = "http://localhost:9090/api/v1.0/tweets")
public class TweetController {

	@Autowired
	private TweetService tweetService;
	
	@PostMapping("/tweet")
	public TweetEntity postTweet(@RequestBody TweetEntity tweetEntity) {
		return tweetService.postTweet(tweetEntity);
	}
	
	@GetMapping("/allTweets")
	public List<TweetEntity> allTweets(){
		return tweetService.allTweets();
	}
	
	@GetMapping("/findByIdTweet/{id}")
	public Optional<TweetEntity> findByIdTweet(@PathVariable Long id) {
		return tweetService.findByIdTweet(id);
	}
}
