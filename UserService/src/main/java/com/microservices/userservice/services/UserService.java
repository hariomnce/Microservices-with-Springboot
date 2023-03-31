package com.microservices.userservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservices.userservice.entity.User;

@Service
public interface UserService {

	// Create user
	User saveUser(User user);

	// Get all users
	List<User> getAllUser();

	// Get single user of given userId
	User getUser(String uId);

	// Delete user
	User deleteByUid(String uId);

	// Update user
	User updateByUid(String uId);

}
