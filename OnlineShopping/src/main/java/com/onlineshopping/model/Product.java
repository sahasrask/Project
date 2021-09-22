package com.onlineshopping.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

public class Product {
	
	@Id
	@SequenceGenerator(name="product_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_seq")
	int productId;
	String name;
	int productRating;
	int qunatity;
	String description;
	String imageURL;
	String category;
	int price;
	
	
	@ManyToOne
	@JoinColumn(name = "userId")
	User user;


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getProductRating() {
		return productRating;
	}


	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}


	public int getQunatity() {
		return qunatity;
	}


	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImageURL() {
		return imageURL;
	}


	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
