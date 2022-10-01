package com.capstone.TeaShop.model;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.*;
import lombok.*;


@Data
@Entity
@Table(name="payment")
public class Payment implements Serializable{
	@Id
	//@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int paymentId;
	private Date date;
	private String cardNo;
	
	@MapsId
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	public Payment() {}

	public Payment(Date date, String cardNo) {
		super();
		this.date = date;
		this.cardNo = cardNo;
	}

		
	
	
	

}
