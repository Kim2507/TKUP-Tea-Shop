package com.capstone.TeaShop.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.*;

import lombok.*;


@Data
@Entity
@Table//(name="OrderKim")
public class OrderDetails implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int orderId;
	
	private final double TAX_RATE = 0.05;
	
	private double preTax ;
	private double total;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	//Key is product and value is quantity of that product in that order
	@OneToMany(cascade =CascadeType.ALL,targetEntity = ProductDetails.class,mappedBy="order", orphanRemoval=true)
	private Map<ProductDetails,Integer> order_items;
	
	public OrderDetails() {}

	public OrderDetails(double preTax, double total) {
		super();
		this.preTax = preTax;
		this.total = total;
	}


	
	

}
