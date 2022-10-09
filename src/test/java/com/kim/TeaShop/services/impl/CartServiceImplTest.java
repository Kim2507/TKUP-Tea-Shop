package com.kim.TeaShop.services.impl;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kim.TeaShop.model.Cart;
import com.kim.TeaShop.model.User;
import com.kim.TeaShop.repository.CartRepository;

@Component
public class CartServiceImplTest {
	
	@Autowired
	CartRepository cartRepo;
	
	
	
	public CartServiceImplTest() {
		super();
	}

	

	@Test 
	public void testGetCartByCustomer() {
		User user = new User();
		user.setId((long) 1);
		Cart cart = cartRepo.findByUser(user);
		assertEquals(1,cart.getCartId());
	}

}
