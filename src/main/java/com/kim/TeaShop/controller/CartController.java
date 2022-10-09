package com.kim.TeaShop.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kim.TeaShop.model.Cart;
import com.kim.TeaShop.model.ProductDetails;
import com.kim.TeaShop.repository.CartRepository;
import com.kim.TeaShop.repository.ProductRepository;
import com.kim.TeaShop.services.CartService;
import com.kim.TeaShop.services.ProductService;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Controller
public class CartController {

	ProductService proService;
	ProductRepository productRepo;
	CartRepository cartRepo;
	CartService cartService;
	
	Map<ProductDetails, Integer> productMap;
	
	

	
	
	public CartController(ProductService proService, ProductRepository productRepo, CartRepository cartRepo,CartService cartService) {
		super();
		this.proService = proService;
		this.productRepo = productRepo;
		this.cartRepo = cartRepo;
		this.productMap = new HashMap<>();
		this.cartService = cartService;
		
	}




	public void addItem(ProductDetails product) {
		//cartService
	}




	//Add lemon ginger to Cart 
	@PostMapping("/addToCart")
	public String addToCart(Model model) {
		Cart cart = new Cart();
		ProductDetails whiteTea =  productRepo.findByName("WhiteTea");
		Map<ProductDetails, Integer> productMap= new HashMap<>();
		productMap.put(whiteTea, 1);
		cart.setProducts(productMap);
		model.addAttribute("listProducts",cart.getProducts());
		return "cart2";
		
		
	}
	
	

}
