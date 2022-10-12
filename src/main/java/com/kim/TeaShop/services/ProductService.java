package com.kim.TeaShop.services;

import java.util.ArrayList;



import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kim.TeaShop.dto.UserDto;
import com.kim.TeaShop.model.ProductDetails;
import com.kim.TeaShop.repository.ProductRepository;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;




@Service
//@Transactional(readOnly = true)
public class ProductService{
	
	@Autowired
	ProductRepository productRepo;
	
	@PersistenceContext
    EntityManager entityManager; 
	
	
	public ProductDetails createProduct(ProductDetails product) {
		return productRepo.save(product);
		
	}
	
	public List<ProductDetails> getAllProducts() {
		List<ProductDetails> products = new ArrayList<>();
		products = productRepo.findAll();
		return products;
	}
	
	public void deleteProducts() {
		productRepo.deleteAll();
	}
	
	public void deleteProduct(Integer id) {
		productRepo.deleteById(id);
	}
	
	public Optional<ProductDetails> findById(Integer productId) {
      return productRepo.findById(productId);
  }
	
	public ProductDetails findById2 (Integer id) {
		return productRepo.getReferenceById(id);
	}

//	@Override
//	public ProductDetails findByName(String name) {
//		Query query = entityManager.createNativeQuery("SELECT p.* FROM teashop2.products as p " +
//	            "WHERE p.name LIKE ?", ProductDetails.class);
//	    query.setParameter(1, name + "%");
//
//	    return (ProductDetails) query.getSingleResult();
//		//return productRepo.findByName(name);
//	}
//
//	@Override
//	public ProductDetails findPById(Integer id) {
//		Query query = entityManager.createNativeQuery("SELECT p.* FROM teashop2.products as p " +
//	            "WHERE p.productId = ?", ProductDetails.class);
//	    query.setParameter(1, id);
//
//	    return (ProductDetails) query.getSingleResult();
//	}
//
//	
//	
//	
	

}
