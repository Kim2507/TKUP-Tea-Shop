package com.capstone.TeaShop.model;

import java.io.Serializable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	private Integer cartId;
	
	//Key is Product and value is quantity of that product
	@OneToMany(cascade=CascadeType.ALL, targetEntity = ProductDetails.class,mappedBy="cart", orphanRemoval=true)
	private Map<ProductDetails, Integer> products;
	
	@MapsId
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	
	public void addItem(ProductDetails product) {
		this.products.put(product, product.getQuantity());
	}
	public void removeItem(ProductDetails product) {
		this.products.remove(product);
	}

	
	
	
	
	

}