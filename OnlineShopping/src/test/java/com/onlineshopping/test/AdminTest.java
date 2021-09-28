package com.onlineshopping.test;

import org.junit.Test;

import com.onlineshopping.dao.AdminDao;
import com.onlineshopping.dao.AdminDaoImpl;
import com.onlineshopping.model.Admin;
import com.onlineshopping.model.Product;

public class AdminTest {
	
	AdminDao dao=new AdminDaoImpl();
	
	@Test
	public void testAddAdmin()
	{
		Admin admin=new Admin();
		admin.setAdminFirstName("Sahasra");
		admin.setAdminLastName("Kamatam");
		admin.setAdminEmail("sahasra.dips16@gmail.com");
		admin.setAdminPassword("S@hasra1119");
		admin.setAdminMobileNumber("7995108210");
		
		dao.addOrUpdateAdmin(admin);
		
	}
	
//	@Test
//	public void testAddProduct()
//	{
//		Product product=new Product();
//		product.setProductName("OnePlus 8T");
//		product.setProductPrice(42000);
//		product.setProductQunatity(400);
//		product.setProductRating(4.6);
//		product.setProductCategory("Mobile");
//		product.setProductDescription("Aquamarine Green, 8GB RAM, 128GB Storage");
//		
//		dao.addProducts(product);
//	}
	
	@Test
	public void deleteProduct()
	{
		
	}

}
