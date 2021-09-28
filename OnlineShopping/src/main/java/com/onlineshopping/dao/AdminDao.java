package com.onlineshopping.dao;

import java.util.List;

import com.onlineshopping.model.Admin;
import com.onlineshopping.model.Order;
import com.onlineshopping.model.Product;
import com.onlineshopping.model.Retailer;
import com.onlineshopping.model.User;

public interface AdminDao {
	Admin addOrUpdateAdmin(Admin admin);
	
	//Product addProducts(Product products);
	
	void deleteProducts(Product product);
	
	Retailer addRetailer(Retailer retailer);
	
	void deleteRetailer(Retailer retailer);
	
	//List<Order> viewOrders();
	
//	List<Product> updateProducts(List<Product> products);
	Product updateProductPrice(int productId,int productPrice);
	
	List<User> viewAllUsers();
	
	User findUserByUserId(int userId);
}
