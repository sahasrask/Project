package com.onlineshopping.dao;

import java.util.List;

import com.onlineshopping.model.Product;

public interface RetailerDao {
	List<Product> addProducts(List<Product> products);
	List<Product> stageProducts(List<Product> products);
	Product updateProduct(Product product);

}
