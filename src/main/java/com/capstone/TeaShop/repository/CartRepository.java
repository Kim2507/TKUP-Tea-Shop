package com.capstone.TeaShop.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.capstone.TeaShop.model.*;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {
	
////	//CRUD 
//	//@Autowired
//	public void updateByCardID(Cart cart);
}
