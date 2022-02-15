package com.example.TweetApplication.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TweetApplication.dao.TweetDao;
import com.example.TweetApplication.entity.TweetEntity;
import com.example.TweetApplication.service.TweetService;

@Service
public class TweetServiceImpl implements TweetService {

	@Autowired
	private TweetDao tweetDao;
	
	@Override
	public TweetEntity postTweet(TweetEntity tweetEntity) {
		TweetEntity tweetEntity2 = tweetDao.save(tweetEntity);
		return tweetEntity2;
	}

	@Override
	public List<TweetEntity> allTweets() {
	List<TweetEntity> tweetEntities = tweetDao.findAll();
		return tweetEntities;
	}

	@Override
	public Optional<TweetEntity> findByIdTweet(Long id) {
		Optional<TweetEntity> tweetEntity = tweetDao.findById(id);
		return tweetEntity;
	}

}
