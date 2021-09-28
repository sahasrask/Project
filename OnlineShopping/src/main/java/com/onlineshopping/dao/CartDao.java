package com.onlineshopping.dao;

import java.util.List;

import com.onlineshopping.model.Cart;
import com.onlineshopping.model.Product;

public interface CartDao {
	Cart addProductToCart(Cart cart);
	void deleteProductsFromCart(int cartId);
	//List<Product> checkOut(List<Product> products);
	List<Cart> viewAllProductsInCart();
}
