package com.capstone.TeaShop.model;

import java.io.Serializable;
import java.util.List;
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
	
	@OneToMany(cascade =CascadeType.ALL,mappedBy="order", orphanRemoval=true)
	private List<ProductDetails> order_items;
	
	public OrderDetails() {}

	public OrderDetails(double preTax, double total) {
		super();
		this.preTax = preTax;
		this.total = total;
	}


	
	

}
