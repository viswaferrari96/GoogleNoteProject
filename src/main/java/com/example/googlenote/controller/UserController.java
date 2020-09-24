package com.example.googlenote.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.googlenote.model.*;

@RestController
public class UserController {
	
	protected Logger logger = Logger.getLogger(UserController.class.getName());
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/users/all")
	public User[] allUser() {
		logger.info("Calling user Micro for allUsers().");
		
		List<User> usr = userRepository.getAllUsers();
		logger.info("user size" + usr.size());
		
		return usr.toArray(new User[usr.size()]);
	}
}
