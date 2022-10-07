package com.capstone.TeaShop.model;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity 
@Table(name="products")
public class ProductDetails implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private Integer productId;
	private String name;
	private String description;
	private double price;
	private int quantity;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="order_id", nullable=true)
	private OrderDetails orders;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cart_id",nullable=true)
	private Cart cart;
	
	

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
