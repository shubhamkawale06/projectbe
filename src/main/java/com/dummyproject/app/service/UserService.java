package com.dummyproject.app.service;

import org.springframework.stereotype.Service;

import com.dummyproject.app.entity.User;
import com.dummyproject.app.repository.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepository;
	
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public boolean validUserOrNot(String userName,String password) {
		User existingUser = userRepository.findByUserName(userName,password);
		return existingUser!=null;
	}

}
