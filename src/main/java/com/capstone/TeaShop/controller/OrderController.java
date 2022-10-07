package com.capstone.TeaShop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.TeaShop.model.OrderDetails;
import com.capstone.TeaShop.repository.OrderRepository;




@RestController
@RequestMapping("/api")
public class OrderController {
	@Autowired
	OrderRepository orderRepo;
	@PostMapping("/order")
	   public void createOrder(@RequestBody OrderDetails order) {
		orderRepo.save(order);
	   }

}
