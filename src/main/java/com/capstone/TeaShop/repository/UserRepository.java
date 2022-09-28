package com.capstone.TeaShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capstone.TeaShop.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
//	@Query("select u from User u where u.email=?1")
//	User findByEmail(String email);
	
}
