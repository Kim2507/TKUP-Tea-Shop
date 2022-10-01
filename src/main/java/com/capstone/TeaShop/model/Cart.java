package com.capstone.TeaShop.model;

import java.io.Serializable;
import java.util.List;
import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Table(name="cart")
public class Cart implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int cartId;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="cart", orphanRemoval=true)
	private List<ProductDetails> products;
	
	@MapsId
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	
	
	public Cart() {}

	public Cart(int cartId, List<ProductDetails> products) {
		super();
		this.cartId = cartId;
		this.products = products;
	}
	
	public void addItem(ProductDetails product) {
		this.products.add(product);
	}
	public void removeItem(ProductDetails product) {
		this.products.remove(product);
	}

	
	
	
	
	

}
