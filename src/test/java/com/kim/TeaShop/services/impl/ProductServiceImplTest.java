package com.kim.TeaShop.services.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kim.TeaShop.model.ProductDetails;
import com.kim.TeaShop.repository.ProductRepository;

class ProductServiceImplTest {
	@Autowired
	ProductServiceImpl productService;
	ProductRepository productRepo;
	
	@Test
	public void testFindByName() {
		ProductDetails expected = new ProductDetails("Black Tea","Black Tea Desc",5.5,7);
		ProductDetails actual = productRepo.findByName("Black Tea");
		assertEquals(expected.getName(),actual.getName());
		System.out.println(actual.toString());
		
		
	}
	
	

}
