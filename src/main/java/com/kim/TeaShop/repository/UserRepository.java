package com.kim.TeaShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kim.TeaShop.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
	
}
