package com.onlineshopping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.onlineshopping.model.Admin;
import com.onlineshopping.model.Order;
import com.onlineshopping.model.Product;
import com.onlineshopping.model.Retailer;
import com.onlineshopping.model.User;

@Component
public class AdminDaoImpl implements AdminDao{
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public Admin addOrUpdateAdmin(Admin admin) {
		Admin persistedAdmin=em.merge(admin);  //persistence state
		return persistedAdmin;
	}

	public void deleteProducts(Product productId) {
		String jpql="delete a from Admin a where a.product.productId=:pid";
		Query query=em.createQuery(jpql);
		query.setParameter("pid", productId);
		
	}
	
	@Transactional
	public Retailer addRetailer(Retailer retailer) {
		Retailer persistedRetailer=em.merge(retailer);  
		return persistedRetailer;
	}

	public void deleteRetailer(Retailer retailerId) {
		String jpql="delete a from Admin a where a.retailer.retailerId=:rid";
		Query query=em.createQuery(jpql);
		query.setParameter("rid", retailerId);
		
	}

//	public List<Order> viewOrders() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	public Product updateProductPrice(int productId,int productPrice) {
		String jpql="update Product p set productPrice=:price where ProductId=:pid";
		Query query=em.createQuery(jpql);
		query.setParameter("price", productPrice);
		query.setParameter("pid", productId);
		Product p=(Product) query.getResultList();
		return p;
	} 

	public List<User> viewAllUsers() {
		String jpql="select a from Admin a.user.User";
		Query query= em.createQuery(jpql);
		List<User> users= query.getResultList();
		return users;
	}

	public User findUserByUserId(int userId) {
		User u=em.find(User.class, userId);
		return u;
	}


	

}
