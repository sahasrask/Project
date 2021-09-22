package com.onlineshopping.dao;

import com.onlineshopping.model.User;

public interface UserDao {
	User RegisterUser(User user);
	User LoginUser(User user);
	User updateUser(User user);
	User findUserByUserId(int userId);
	User resetUserPassword(User userId);
	User deleteUserById(int userId);
}
