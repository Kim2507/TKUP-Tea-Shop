//package com.kim.TeaShop.services.impl;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.kim.TeaShop.model.ProductDetails;
//import com.kim.TeaShop.repository.ProductRepository;
//import com.kim.TeaShop.services.ProductService;
//
//@Service
//public class ProductServiceImpl implements ProductService {
//	@Autowired
//	private ProductRepository productRepo;
//	
//	
//	public ProductServiceImpl(ProductRepository productRepo) {
//		super();
//		this.productRepo = productRepo;
//	}
//	
//	
//	
//
//
//	@Override
//	public ProductDetails findByName(String name) {
//		return productRepo.findByName(name);
//	}
//
//	public void updateById(Integer id,ProductDetails product) {
//		Optional<ProductDetails> productData = productRepo.findById(id);
//		
//				if (productData.isPresent()) {
//					ProductDetails updated_product = productData.get();
//					updated_product.setProductId(id);
//					updated_product.setName(product.getName());
//					updated_product.setDescription(product.getDescription());
//					updated_product.setPrice(product.getPrice());
//					updated_product.setQuantity(product.getQuantity());
//					productRepo.save(updated_product);
//				}
//	}
//
//	@Override
//	public void deleteById(Integer id) {
//		productRepo.deleteById(id);
//		
//	}
//	
//	public Optional<ProductDetails> findById(Integer productId) {
//        return productRepo.findById(productId);
//    }
//
//
//
//	
//	
//}
