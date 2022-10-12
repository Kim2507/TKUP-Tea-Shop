package com.kim.TeaShop.model;

import java.io.Serializable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.persistence.*;
import lombok.*;

@NamedQueries({
    @NamedQuery(name = "ProductDetails.getAllProducts", query = "from ProductDetails" ),
    @NamedQuery(name = "ProductDetails.getProductById", query = "select p from ProductDetails p where p.productId = :product_id" ), 
})	


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity 
@Table(name="products")
public class ProductDetails implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY )
	private Integer productId;
	private String name;
	private String description;
	private double price;
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="order_id", nullable=true)
	private OrderDetails orders;
	
	@ManyToOne
	@JoinColumn(name="cart_id",nullable=true)
	private Cart cart;
	
	
//	public final Map<Integer,String> imageMap(){
//		Map<Integer,String> images_map = new HashMap<Integer,String>();
//		images_map.put(1,"/images/blacktea.png");
//		images_map.put(2, "/images/green_tea.png");
//		return images_map;
//	}
	

	public ProductDetails(String name, String description, double price, int quantity) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void addStock(int quantity) {
		this.quantity +=quantity;
	}
	
	public void removeStock(int quantity) {
		this.quantity -=quantity;
	}
	
//	@Transient
//	public String getMainImagePath() {
//		return this.imageMap().get(this.productId);
//	}

	
	
	
	
	

}
