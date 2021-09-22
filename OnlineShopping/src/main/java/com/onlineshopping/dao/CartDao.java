package com.onlineshopping.dao;

import java.util.List;

import com.onlineshopping.model.Cart;
import com.onlineshopping.model.Product;

public interface CartDao {
	Product addProductToCart(Product product);
	List<Product> addProductsToCart(List<Product> products);
	void deleteProductsFromCart(Product product);
	List<Product> checkOut(List<Product> products);
	List<Product> viewAllProductsInCart();
}
