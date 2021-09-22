package com.onlineshopping.dao;

import java.util.List;

import com.onlineshopping.model.Order;
import com.onlineshopping.model.User;

public interface OrderDao {
	Order createOrder(Order order);
	void cancelOrder(Order order);
	Order repeatOrder(Order order);
	Order updateOrder(Order order);
	List<Order> viewOrderHistory(User user);
	Order viewOrderDetails(int orderId);
}
