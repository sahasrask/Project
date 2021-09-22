package com.onlineshopping.dao;

import java.util.List;

import com.onlineshopping.model.Product;


public interface ProductDao {
	Product findProductById(int productId);
	List<Product> viewAllProducts();
	List<Product> viewProductsByCategory(String productCategory);
	List<Product> viewProductByPrice(int productPrice);
	List<Product> viewProductsByRating(int productRating);

}
