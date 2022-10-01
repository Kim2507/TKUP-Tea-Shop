package com.capstone.TeaShop.model;



import java.io.Serializable;

import javax.persistence.*;

import lombok.*;


@Data
@Entity
@Table(name="account")
public class User implements Serializable{
	@Id
	//@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int uid;
	
	@Column(nullable=false, unique=true)
	private String email;
	@Column(nullable=false, unique=true)
	private String password;
	
	@MapsId
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	public User() {}

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	public void updateEmail(String newEmail) {
		email = newEmail;
	}
	
	public void updatePassword(String newPw) {
		password = newPw;
	}


	
	
	
	
	

}
