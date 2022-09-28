package com.capstone.TeaShop.model;


//import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
//@Entity
//@Table(name="customer")
public class Customer {
//	@Id
//	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int cusId;
	private String name;
	private String email;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	
//	@OneToOne(cascade= CascadeType.ALL)
	private User account;
	
//	@OneToOne(cascade= CascadeType.ALL)
	private Payment payment;

	
	
	
	
	
	
	
	
	

}
