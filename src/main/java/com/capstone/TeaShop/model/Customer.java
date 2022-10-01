package com.capstone.TeaShop.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name="customer")
public class Customer implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int cusId;
	private String name;
	private String email;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	
	@OneToOne(cascade= CascadeType.ALL)
	private User account;
	
	@OneToOne(cascade= CascadeType.ALL)
	private Payment payment;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="customer", orphanRemoval=true)
	private List<OrderDetails> orders;

	public Customer(int cusId, String name, String email, String address, String city, String state, String zipCode,
			User account, Payment payment, List<OrderDetails> orders) {
		super();
		this.cusId = cusId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.account = account;
		this.payment = payment;
		this.orders = orders;
	}
	
	

	
	
	
	
	
	
	
	
	

}
