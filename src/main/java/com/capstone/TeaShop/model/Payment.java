package com.capstone.TeaShop.model;

import java.util.Date;

//import javax.persistence.*;
import lombok.*;


@Getter
@Setter
@ToString
//@Entity
//@Table(name="payment")
public class Payment {
//	@Id
//	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private int paymentId;
	private Date date;
	private String cardNo;
	
	public Payment() {}

	public Payment(Date date, String cardNo) {
		super();
		this.date = date;
		this.cardNo = cardNo;
	}

		
	
	
	

}
