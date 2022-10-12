package com.kim.TeaShop.services.impl;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import com.kim.TeaShop.model.User;
import com.kim.TeaShop.repository.UserRepository;


public class UserServiceImplTest {
	@Autowired
	UserRepository userRepo;
	UserServiceImpl userService;
	
	
	public UserServiceImplTest(UserRepository userRepo, UserServiceImpl userService) {
		super();
		this.userRepo = userRepo;
		this.userService = userService;
	}


	@Test
	public void getUserTest() {
		User user = new User();
		user.setEmail("kim@gmail.com");
		User actual = userService.findUserByEmail("kim@gmail.com");
		assertEquals(user.getEmail(),actual.getEmail());
	}
}
