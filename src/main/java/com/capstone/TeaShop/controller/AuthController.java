package com.capstone.TeaShop.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.capstone.TeaShop.dto.UserDto;
import com.capstone.TeaShop.model.User;
import com.capstone.TeaShop.services.UserService;

import jakarta.validation.Valid;

@Controller
public class AuthController {
	@Autowired
	private UserService userService;
	
	public AuthController(UserService userService) {
        this.userService = userService;
    }
	
//	@GetMapping("/")
//	public String home() {
//		return "index";
//	}
	
	 // handler method to handle login request
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    
    @PostMapping("/login")
    public String loginSuccess(){
        return "shopping";
    }
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		UserDto user = new UserDto();
		model.addAttribute("user",user);
		return "register";
	}
	
	@PostMapping("/register/save")
	public String registration(@Valid @ModelAttribute("user") UserDto userDto, BindingResult result, Model model) {
		User existingUser = userService.findUserByEmail(userDto.getEmail());
		if(existingUser!=null && existingUser.getEmail()!=null && !existingUser.getEmail().isEmpty()) {
			result.rejectValue("email", null,  "There is already an account registered with the same email");
			
		}
		
		if(result.hasErrors()){
            model.addAttribute("user", userDto);
            return "redirect:/register?success";
        }
		
		userService.saveUser(userDto);
//        return "redirect:/register?success";
		return "login";
	}
	
	 // handler method to handle list of users
//    @GetMapping("/users")
//    public String users(Model model){
//        List<UserDto> users = userService.findAllUsers();
//        model.addAttribute("users", users);
//        return "users";
//    }

}
