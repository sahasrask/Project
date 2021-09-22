package com.onlineshopping.dao;

import java.util.List;

import com.onlineshopping.model.Order;
import com.onlineshopping.model.Product;
import com.onlineshopping.model.Retailer;
import com.onlineshopping.model.User;

public interface AdminDao {
	List<Product> addProducts(List<Product> products);
	void deleteProducts(Product product);
	Retailer addRetailer(Retailer retailer);
	void deleteRetailer(Retailer retailer);
	List<Order> viewOrders();
	List<Product> updateProducts(List<Product> products);
	List<User> viewAllUsers();
	User findUserByUserId(int userId);
}
