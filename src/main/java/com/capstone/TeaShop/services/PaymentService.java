package com.capstone.TeaShop.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capstone.TeaShop.model.Payment;
import com.capstone.TeaShop.model.User;
import com.capstone.TeaShop.repository.PaymentRepository;
import com.capstone.TeaShop.repository.UserRepository;

public class PaymentService {
		@Autowired
		PaymentRepository payment_repo;
	
	
		// Get by ID
		public Optional<Payment> getById(int id) {
			return payment_repo.findById(id);
		}
	
		// Adding a single object into DB
		public void addPayment(Payment p) {
			payment_repo.save(p);
		}

		
		// Delete
		public void deletePayment(int id) {
			payment_repo.deleteById(id);
		}


}
