package com.onlineshopping.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Product {
	
	@Id
	@SequenceGenerator(name="product_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_seq")
	int productId;
	String productName;
	int productRating;
	int productQunatity;
	String productDescription;
	String imageURL;
	String productCategory;
	int productPrice;
	

	@ManyToOne
	@JoinColumn(name="orderId")
	Order order;

	

	
	
	
	
}
