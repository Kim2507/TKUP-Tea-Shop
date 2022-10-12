package com.kim.TeaShop.model;

import java.io.Serializable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import jakarta.persistence.*;
import lombok.*;


@NamedQuery(name = "getAllOrders", query = "from OrderDetails" )

	

@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="orders")
public class OrderDetails implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int orderId;
	
	private final double TAX_RATE = 0.05;
	
	private double preTax ;
	private double total;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	//Key is product and value is quantity of that product in that order
//	@OneToMany(cascade =CascadeType.ALL,targetEntity = ProductDetails.class,mappedBy="orders",orphanRemoval=true)
//	//@JoinColumn(name="product_Id")
	@OneToMany(cascade =CascadeType.ALL,targetEntity = ProductDetails.class,mappedBy="orders",orphanRemoval=true)
	private Map<ProductDetails,Integer> products;
	

	public OrderDetails(double preTax, double total) {
		super();
		this.preTax = preTax;
		this.total = total;
	}
	
	public void setTotal() {
		this.total = this.getPreTax() * (1+this.TAX_RATE);
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getPreTax() {
		return preTax;
	}

	public void setPreTax(double preTax) {
		this.preTax = preTax;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	//@ElementCollection(targetClass = Integer.class)
	//@MapKeyClass(ProductDetails.class)
	@OneToMany
	public Map<ProductDetails, Integer> getProducts() {
		return products;
	}

	public void setProducts(Map<ProductDetails, Integer> products) {
		this.products = products;
	}

	public double getTAX_RATE() {
		return TAX_RATE;
	}
	
	
	
	


	
	

}
