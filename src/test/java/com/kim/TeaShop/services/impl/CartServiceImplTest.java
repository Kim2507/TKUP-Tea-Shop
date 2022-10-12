package com.kim.TeaShop.services.impl;



import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;



import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import com.kim.TeaShop.model.Cart;
import com.kim.TeaShop.model.ProductDetails;
import com.kim.TeaShop.model.User;
import com.kim.TeaShop.repository.CartRepository;
import com.kim.TeaShop.repository.ProductRepository;
import com.kim.TeaShop.repository.UserRepository;
import com.kim.TeaShop.services.CartService;
import com.kim.TeaShop.services.ProductService;

import jakarta.persistence.PersistenceContext;

//@Component
//@DataJpaTest
//@Rollback(false)
@SpringBootTest
@WebAppConfiguration
@ContextConfiguration
//@AutoConfigureTestDatabase(replace=Replace.NONE)
public class CartServiceImplTest {
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private ProductService productService;

	@Autowired
	private UserServiceImpl userService;
	
	@Autowired
	private TestEntityManager entityManager;
	
	
	@Test 
	public void testAddProduct() {
		ProductDetails product = new ProductDetails("Black Tea", "desc", 4.5, 9);
		//cartService.getCart();
		//cartService.addProduct(product);
		Cart cart = new Cart();
		Map<ProductDetails,Integer> map = new HashMap<>();
		map.put(product,3);
		cart.setProducts(map);
		cartService.createCartToDB(cart);
		
	}
}

