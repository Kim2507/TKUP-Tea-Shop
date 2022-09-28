package com.capstone.TeaShop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
//login==> gotoLoginPage() ==> renders login html/thymleaf
//	@GetMapping("/login")
//	public String goToLoginPage() {
//		return "registration";
//	}
//	
//	@GetMapping("/paramLogin") // mapping endpoint to a method
//	public String goToLoginPageParam(@RequestParam() String name, ModelMap modelmap) {
//		modelmap.addAttribute("name",name);
//		modelmap.addAttribute("greeting",String.format("Hi, %s", name));
//		// Not recommended for production ---> will use logogging 
//		System.out.println("Request param is: "+ name);
//		return "login";
//	}
//	
//	private Logger logger = LoggerFactory.getLogger(LoginController.class);
//	@GetMapping("/paramLoginLog") 
//	public String goToLogLoginPageParam(@RequestParam() String name, ModelMap modelmap) {
//		modelmap.addAttribute("name",name);
//		modelmap.addAttribute("greeting",String.format("Hello, %s", name));
//		
//		//setting default is info, it will display everything from info down
//		// let's debug the name
//		logger.debug("Request Param value is {}",name); // will add the parameter value to our placeholder
//		logger.info("Info printed in info level: "+name);
//		logger.warn("Warn printed at Warn level: "+name);
//		return "login";
//	}

}
