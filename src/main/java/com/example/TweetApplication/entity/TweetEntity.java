package com.example.TweetApplication.entity;

import org.springframework.data.annotation.Id;

public class TweetEntity {
@Id
private int id;
private String tweet;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTweet() {
	return tweet;
}
public void setTweet(String tweet) {
	this.tweet = tweet;
}
public TweetEntity(int id, String tweet) {
	super();
	this.id = id;
	this.tweet = tweet;
}
public TweetEntity() {
	
}


	
}
