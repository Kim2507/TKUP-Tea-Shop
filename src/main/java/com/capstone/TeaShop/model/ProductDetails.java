package com.capstone.TeaShop.model;

import java.io.Serializable;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.*;
import lombok.*;

@Data
@Entity 
@Table
public class ProductDetails implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int productId;
	private String name;
	private String description;
	private double price;
	private int quantity;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="order_id")
	private OrderDetails order;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cart_id")
	private Cart cart;
	
	public ProductDetails() {}

	public ProductDetails(String name, String description, double price, int quantity) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void addStock(int quantity) {
		this.quantity +=quantity;
	}
	
	public void removeStock(int quantity) {
		this.quantity -=quantity;
	}

	
	
	
	
	

}
