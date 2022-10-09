package com.kim.TeaShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.kim.TeaShop.model.ProductDetails;
import com.kim.TeaShop.model.User;
import com.kim.TeaShop.repository.UserRepository;

@Controller
public class RegisterController {
	
	@Autowired
	UserRepository userRepo; 
	/*
	 * @GetMapping("/register") 
	 * public String showForm(Model model) { 
	 * Account user = new Account(); 
	 * model.addAttribute("user",user);
	 * 
	 * return "registration"; 
	 * }
	 * 
	 * @PostMapping("/register") public String submitForm(@ModelAttribute("user")
	 * Account user) { System.out.println(user); return "register_success"; }
	 */
	
	@PostMapping("/api/account")
	   public void createAccount(@RequestBody User user) {
		userRepo.save(user);
	   }

}
