package com.capstone.TeaShop.model;

import java.util.List;


//import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
//@Entity
//@Table(name="cart")
public class Cart {
//	@Id
//	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int cartId;
	
//	@OneToMany(targetEntity = Product.class ,cascade = {CascadeType.ALL})
	private List<Product> products;
	
//	@OneToOne(cascade= CascadeType.ALL)
	private Customer customer;
	
	public Cart() {}

	public Cart(int cartId, List<Product> products) {
		super();
		this.cartId = cartId;
		this.products = products;
	}

	
	
	
	
	

}
