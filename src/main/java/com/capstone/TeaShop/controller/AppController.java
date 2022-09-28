package com.capstone.TeaShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.capstone.TeaShop.model.User;
import com.capstone.TeaShop.repository.UserRepository;

@Controller
public class AppController {
	@Autowired
	private UserRepository user_repo;
	
	@GetMapping()
	public String viewHomePage() {
		return "home";
	}
	
	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		User user = new User();
		model.addAttribute("user",user);
		return "registration";
	}
	
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		user_repo.save(user);
		return "register_success";
	}
	
//	@GetMapping("/shopping")
//	public String listUsers(Model model) {
////	    List<User> listUsers = userRepo.findAll();
////	    model.addAttribute("listUsers", listUsers);
//	     
//	    return "shopping";
//	}
	
	
	
}
