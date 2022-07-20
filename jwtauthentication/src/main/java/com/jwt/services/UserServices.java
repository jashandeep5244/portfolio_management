package com.jwt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.model.User;
import com.jwt.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository userRepo;
	
	public Long findUserId(String uname) {
		User user=userRepo.findByUsername(uname);
		return user.getId();
	}
}
