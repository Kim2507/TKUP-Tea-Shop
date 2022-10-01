package com.capstone.TeaShop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capstone.TeaShop.model.ProductDetails;
@Repository
public interface ProductRepository extends JpaRepository<ProductDetails, Integer> {
	
}
