package com.capstone.TeaShop.model;

//import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
//@Entity 
//@Table(name="product")
public class Product {
//	@Id
//	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int productId;
	private String name;
	private String desc;
	private double price;
	private int quantity;
	
	public Product() {}

	public Product(String name, String desc, double price, int quantity) {
		super();
		this.name = name;
		this.desc = desc;
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
