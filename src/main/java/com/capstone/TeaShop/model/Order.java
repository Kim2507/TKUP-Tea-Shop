package com.capstone.TeaShop.model;

import java.util.List;

//import javax.persistence.*;

import lombok.*;

@Getter 
@Setter
@Data
@ToString
//@Entity
//@Table(name="order")
public class Order {
//	@Id
//	@GeneratedValue(strategy= GenerationType.IDENTITY )
	
	private int orderId;
	
	private final double TAX_RATE = 0.05;
	
	private double preTax ;
	private double total;
	
//	@ManyToOne
	private Customer customer;
	
	//@OneToMany(targetEntity = Product.class ,cascade = {CascadeType.ALL})
	private List<Product> order_items;
	
	public Order() {}

	public Order(double preTax, double total) {
		super();
		this.preTax = preTax;
		this.total = total;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getTAX_RATE() {
		return TAX_RATE;
	}

	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", TAX_RATE=" + TAX_RATE + ", preTax=" + preTax + ", total=" + total
				+ ", customer=" + customer + "]";
	}
	
	
	
	
	
	

}
