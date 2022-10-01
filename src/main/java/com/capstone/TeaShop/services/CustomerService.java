package com.capstone.TeaShop.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.capstone.TeaShop.model.Customer;
import com.capstone.TeaShop.model.ProductDetails;
import com.capstone.TeaShop.repository.CustomerRepository;
import com.capstone.TeaShop.repository.ProductRepository;

public class CustomerService {
	@Autowired
	CustomerRepository customer_repo;

	// Get all 
	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		customer_repo.findAll().forEach(customers::add);
		return customers;
	}

	// Get by ID
	public Optional<Customer> getCustomerById(int id) {
		return customer_repo.findById(id);
	}

	// Adding a single customer into DB
	public void addCustomer(Customer c) {
		customer_repo.save(c);
	}

	// Adding a array of customer into DB
	public void addCustomers(List<Customer> c) {
		customer_repo.saveAll(c);
	}

	// Updating a product
	public void updateCustomer(int id, Customer c) {
		Optional<Customer> customerData = customer_repo.findById(id);

		if (customerData.isPresent()) {
			Customer updated = customerData.get();
			updated.setCusId(c.getCusId());
			updated.setName(c.getName());
			updated.setEmail(c.getEmail());
			updated.setAddress(c.getAddress());
			updated.setCity(c.getCity());
			updated.setState(c.getState());
			updated.setZipCode(c.getZipCode());
			updated.setAccount(c.getAccount());
			updated.setPayment(c.getPayment());
			updated.setOrders(c.getOrders());
			
		}
	}

	// Delete 
	public void deleteCustomer(int id) {
		customer_repo.deleteById(id);
	}

	// Delete all
	public void deleteAllCustomers() {
		customer_repo.deleteAll();
	}


}
