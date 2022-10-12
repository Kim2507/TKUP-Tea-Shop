 package com.kim.TeaShop.services;

import java.util.Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.kim.TeaShop.model.Cart;
import com.kim.TeaShop.model.ProductDetails;
import com.kim.TeaShop.model.User;
import com.kim.TeaShop.repository.CartRepository;
import com.kim.TeaShop.repository.ProductRepository;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


//@AllArgsConstructor
//@Data
@Service
//@Transactional
public class CartService{
	@Autowired
	private CartRepository cartRepo;
	
	
	
	//private static Map<ProductDetails,Integer> map;
	
	public Cart createCartToDB(Cart cart) {
		return cartRepo.save(cart);
		
	}
	
	
	
  
  
  
	

	
	
	//private final ProductRepository productRepository;
	
	
    //private Map<ProductDetails, Integer> products = new HashMap<>();

//	public CartService() {
//		this.productRepository = null;
//}
//
//    public CartService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
////        this.products = new HashMap<>();
//    }
//    
	
   
    

    /**
     * If product is in the map just increment quantity by 1.
     * If product is not in the map with, add it with quantity 1
     *
     * @param product
     */
    
//    public void addProduct(ProductDetails product) {
//        if (products.containsKey(product)) {
//            products.replace(product, products.get(product) + 1);
//        } else {
//            products.put(product, 1);
//        }
//    }
//
//    public CartRepository getCartRepo() {
//		return cartRepo;
//	}
//
//	/**
//     * If product is in the map with quantity > 1, just decrement quantity by 1.
//     * If product is in the map with quantity 1, remove it from map
//     *
//     * @param product
//     */
//    
//    public void removeProduct(ProductDetails product) {
//        if (products.containsKey(product)) {
//            if (products.get(product) > 1)
//                products.replace(product, products.get(product) - 1);
//            else if (products.get(product) == 1) {
//                products.remove(product);
//            }
//        }
//    }
//
//    /**
//     * @return unmodifiable copy of the map
//     */
//    
//    public Map<ProductDetails, Integer> getProductsInCart() {
//        return Collections.unmodifiableMap(products);
//    }

    /**
     * Checkout will rollback if there is not enough of some product in stock
     *
     * @throws NotEnoughProductsInStockException
     */
    
//    public void checkout() throws NotEnoughProductsInStockException {
//        ProductDetails product;
//        for (Map.Entry<ProductDetails, Integer> entry : products.entrySet()) {
//            // Refresh quantity for every product before checking
//            product = productRepository.findOne(entry.getKey().getProductId());
//            if (product.getQuantity() < entry.getValue())
//                throw new NotEnoughProductsInStockException(product);
//            entry.getKey().setQuantity(product.getQuantity() - entry.getValue());
//        }
//        productRepository.save(products.keySet());
//        productRepository.flush();
//        products.clear();
//    }

    
//    public BigDecimal getTotal() {
//        return products.entrySet().stream()
//                .map(entry -> entry.getKey().getPrice().multiply(BigDecimal.valueOf(entry.getValue())))
//                .reduce(BigDecimal::add)
//                .orElse(BigDecimal.ZERO);
//    }
	

	
}
