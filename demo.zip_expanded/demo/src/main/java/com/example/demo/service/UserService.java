package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.User;

@Service
public class UserService {

	Logger logger = LoggerFactory.getLogger(UserService.class);
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	// instead of creating object we can also create bean in securityConfig
	
	@Autowired
	private UserRepo repo;
	
	public User saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		//logger.
		return repo.save(user);
	}
}
