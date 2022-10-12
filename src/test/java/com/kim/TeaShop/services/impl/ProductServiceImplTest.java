package com.kim.TeaShop.services.impl;

import static org.junit.jupiter.api.Assertions.*;


import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kim.TeaShop.model.ProductDetails;
import com.kim.TeaShop.repository.ProductRepository;
import com.kim.TeaShop.services.ProductService;

@SpringBootTest
@WebAppConfiguration
@ContextConfiguration
class ProductServiceImplTest {
	@Autowired
	ProductService productService;
	@Autowired
	ProductRepository productRepo;
	
	
	@Test
	public void testFindAll() {
		List<ProductDetails> products = productService.getAllProducts();
		for(ProductDetails p : products) {
			System.out.println(p.toString());
		}	
	}
	
	@Test
	public void deleteProductById() {
		Integer id = 4;
		productService.deleteProduct(4);
	}
	
	@Test
	public void testGetProductById() {
		ProductDetails p = new ProductDetails();
		p.setName("Green Tea");
		Optional<ProductDetails> actual = productService.findById(2);
		assertEquals(p.getName(),actual.get().getName());
	}
	
//	@Test
//	public void testGetByName() {
//		ProductDetails p = new ProductDetails();
//		p.setName("Green Tea");
//		ProductDetails actual = productService.findByName("Green");
//		assertEquals(p.getName(),actual.getName());
//	}
//	
//	@Test
//	public void testGetById() {
//		ProductDetails p = new ProductDetails();
//		p.setName("Green Tea");
//		ProductDetails actual = productRepo.getReferenceById(2);
//		assertEquals(p.getName(),actual.getName());
//	}
	
	

}
