package com.kim.TeaShop.model;

import java.io.Serializable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;

import lombok.*;
import jakarta.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="cart")
public class Cart implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private Long cartId;
	
	//Key is Product and value is quantity of that product
	
	@OneToMany(cascade=CascadeType.ALL,targetEntity = ProductDetails.class,mappedBy="cart", orphanRemoval=true)
	//@OneToMany
	private Map<ProductDetails, Integer> products;
	
	//@MapsId
	
	
	
	public void addItem(ProductDetails product) {
		this.products.put(product,1);
	}
	
	public void increaseItem(ProductDetails product) {
		if(products.containsKey(product)) {
			int quantity = this.products.get(product)+1;
			removeItem(product);
			this.products.put(product, quantity);
		}else addItem(product);
	}
	
	public void decreaseItem(ProductDetails product) throws Exception {
		if(products.containsKey(product)) {
			int quantity = this.products.get(product)-1;
			removeItem(product);
			this.products.put(product, quantity);
		}
	}
	
	
	public void removeItem(ProductDetails product) {
		this.products.remove(product);
	}

	
	
	
	
	

}