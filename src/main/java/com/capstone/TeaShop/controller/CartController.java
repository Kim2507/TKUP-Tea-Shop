package com.capstone.TeaShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.capstone.TeaShop.model.ProductDetails;
import com.capstone.TeaShop.services.CartService;
import com.capstone.TeaShop.services.ProductService;

@Controller
public class CartController {
//	@Autowired
//	CartService cart_service;
	
	@Autowired
	ProductController product_controller;
	
	@Autowired
	ProductService proService;
	
	
	//Add lemon ginger to Cart 
	@GetMapping("/addingToCart/lg")
	public String addLGToCart(ProductDetails p,int id,  Model model) {
		ProductDetails p1 = proService.getProductByIdP(id);
		//String name = p1.getName();
		
		model.addAttribute("lg",p1);
		return "cart";
		
		
	}

}
