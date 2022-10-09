package com.kim.TeaShop.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kim.TeaShop.model.Cart;
import com.kim.TeaShop.model.ProductDetails;
import com.kim.TeaShop.model.User;
import com.kim.TeaShop.repository.ProductRepository;
import com.kim.TeaShop.repository.UserRepository;
import com.kim.TeaShop.services.CartService;
import com.kim.TeaShop.services.ProductService;

@Controller
public class AppController {
	
//	private UserRepository user_repo;
//	//private CartService cartService;
//	
//	private ProductDetails product1 = new ProductDetails("noodle","noddle",5.5,3); 
//	@GetMapping()
//	public String viewHomePage() {
//		return "home";
//	}
//	
////	@GetMapping("/register")
////	public String showSignUpForm(Model model) {
////		User user = new User();
////		model.addAttribute("user",user);
////		return "registration";
////	}
//	
////	@PostMapping("/process_register")
////	public String processRegistration(User user) {
////		user_repo.save(user);
////		return "home";
////	}
//	
//	@GetMapping("/home")
//	public String showHomePage() {
//	    return "home";
//	}
//	
//	@GetMapping("/shopping")
//	public String showShoppingPage() {
//	    return "shopping";
//	}
//	
//	
////	@GetMapping("/login")
////	public String showLoginPage() {
////	    return "login";
////	}
//	@GetMapping("/cart")
//	public String showCartPage() {
//	    return "cart";
//	}
//	
//	
	
	
	
	
	
	
	
}
