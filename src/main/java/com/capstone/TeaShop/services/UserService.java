package com.capstone.TeaShop.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.TeaShop.model.User;
import com.capstone.TeaShop.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository user_repo;
	
	// Get all users
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		user_repo.findAll().forEach(users::add);
		return users;
	}
	
	// Get user by ID
	public Optional<User> getUserById(int id) {
	       return user_repo.findById(id);
	}
	
	// Adding a single object into DB
		public void addUser(User u) {
			user_repo.save(u);
		}

		// Adding a array of object into DB
		public void addUsers(List<User> u) {
			user_repo.saveAll(u);
		}
		

		// Updating an object
//		public void updateUser(int id, User u) {
//			Optional<User> data user_repo.findById(id);
//
//			if (data.isPresent()) {
//				User updated = data.get();
//				updated_product.setProductId(id);
//				updated_product.setName(product.getName());
//				updated_product.setDesc(product.getDesc());
//				updated_product.setPrice(product.getPrice());
//				updated_product.setQuantity(product.getQuantity());
//				updated_product.setOrder(product.getOrder());
//				updated_product.setCart(product.getCart());
//				product_repo.save(updated_product);
//			}
//		}
//	
	// Delete
	public void deleteProduct(int id) {
		user_repo.deleteById(id);
	}
	
	//Delete all
	public void deleteAllProducts() {
		user_repo.deleteAll();
	}


}
