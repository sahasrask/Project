package com.onlineshopping.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Order {
	
	@Id
	@SequenceGenerator(name="order_seq",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "order_seq")
	int orderId;
	double total;
	OrderStatus orderStatus;
	
	@OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
	List<Product> products;
	
	@ManyToOne
	@JoinColumn(name="userId")
	User user;
	
	
	

}
