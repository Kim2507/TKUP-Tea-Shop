//package com.kim.TeaShop.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.kim.TeaShop.model.ProductDetails;
//import com.kim.TeaShop.repository.ProductRepository;
//import com.kim.TeaShop.services.ProductService;
//
//
//
//@RestController
//@RequestMapping("/api")
//public class ProductController {
//	@Autowired
//	private ProductService product_service;
//	
//	@Autowired
//	private ProductRepository proRepo;
//	
//	 @GetMapping("/products/{id}")
//	  public Optional<ProductDetails> getProductById(@PathVariable("id") int id) {
//	       return  product_service.getProductById(id);
//	   }
//	
//	
//	@PostMapping("/product")
//	   public void createProduct(@RequestBody ProductDetails product) {
//		proRepo.save(product);
//	  }
//	   
//	   @PostMapping("/products")
//	   public void createProducts(@RequestBody List<ProductDetails> products) {
//		   product_service.addProducts(products);
//	   }
//	   
//	   
//
//}
