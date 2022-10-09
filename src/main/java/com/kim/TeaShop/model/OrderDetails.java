package com.kim.TeaShop.model;

import java.io.Serializable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="orders")
public class OrderDetails implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int orderId;
	
	private final double TAX_RATE = 0.05;
	
	private double preTax ;
	private double total;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	//Key is product and value is quantity of that product in that order
	@OneToMany(cascade =CascadeType.ALL,targetEntity = ProductDetails.class,mappedBy="orders", orphanRemoval=true)
	private Map<ProductDetails,Integer> products;
	

	public OrderDetails(double preTax, double total) {
		super();
		this.preTax = preTax;
		this.total = total;
	}
	
	public void setTotal() {
		this.total = this.getPreTax() * (1+this.TAX_RATE);
	}


	
	

}
