package com.capstone.TeaShop.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.capstone.TeaShop.model.ProductDetails;
import com.capstone.TeaShop.repository.ProductRepository;



@Service
public class ProductService {
	@Autowired
	ProductRepository product_repo;

	// Get all products
	public List<ProductDetails> getAllProducts() {
		List<ProductDetails> tutorials = new ArrayList<ProductDetails>();
		product_repo.findAll().forEach(tutorials::add);
		return tutorials;
	}

	// Get product by ID
	public Optional<ProductDetails> getProductById(int id) {
		return product_repo.findById(id);
		
		
	 }
	
	// ProductDetails type Get product by ID
	public ProductDetails getProductByIdP(int id) {
		return product_repo.getReferenceById(id);
	}

	// Adding a single product into DB
	public void addProduct(ProductDetails p) {
		product_repo.save(p);
	}

	// Adding a array of product into DB
	public void addProducts(List<ProductDetails> p) {
		product_repo.saveAll(p);
	}

	// Updating a product
	public void updateProduct(int id, ProductDetails product) {
		Optional<ProductDetails> productData = product_repo.findById(id);

		if (productData.isPresent()) {
			ProductDetails updated_product = productData.get();
			updated_product.setProductId(id);
			updated_product.setName(product.getName());
			updated_product.setDescription(product.getDescription());
			updated_product.setPrice(product.getPrice());
			updated_product.setQuantity(product.getQuantity());
//			updated_product.setOrder(product.getOrder());
			updated_product.setCart(product.getCart());
			product_repo.save(updated_product);
		}
	}

	// Delete product
	public void deleteProduct(int id) {
		product_repo.deleteById(id);
	}

	// Delete products
	public void deleteAllProducts() {
		product_repo.deleteAll();
	}

//	public ResponseEntity<List<Tutorial> findByPublished() {
//	  try {
//	      List<Tutorial> tutorials = tutorialRepository.findByPublished(true);
//
//	      if (tutorials.isEmpty()) {
//	          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	      }
//	      return new ResponseEntity<>(tutorials, HttpStatus.OK);
//	  } catch (Exception e) {
//	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	  }
//	}


}
