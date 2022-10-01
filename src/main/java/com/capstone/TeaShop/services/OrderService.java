package com.capstone.TeaShop.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capstone.TeaShop.model.OrderDetails;
import com.capstone.TeaShop.model.Payment;
import com.capstone.TeaShop.model.ProductDetails;
import com.capstone.TeaShop.repository.OrderRepository;

public class OrderService {
		@Autowired
		OrderRepository order_repo;
		

		// Get all 
		public List<OrderDetails> getAllOrders() {
			List<OrderDetails> orders = new ArrayList<OrderDetails>();
			order_repo.findAll().forEach(orders::add);
			return orders;
		}
		
		// Get by ID
		public Optional<OrderDetails> getById(int id) {
			return order_repo.findById(id);
		}
	
		// Adding a single object into DB
		public void addPayment(OrderDetails o) {
			order_repo.save(o);
		}

		
		// Delete
		public void deletePayment(int id) {
			order_repo.deleteById(id);
		}
		
		// Delete all
		public void deleteAllProducts() {
			order_repo.deleteAll();
		}

}
