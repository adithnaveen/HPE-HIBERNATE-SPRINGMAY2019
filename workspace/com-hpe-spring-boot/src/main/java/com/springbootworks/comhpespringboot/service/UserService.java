package com.springbootworks.comhpespringboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.springbootworks.comhpespringboot.beans.User;

@Component
public class UserService {
	// the data gets populated from DB

	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User(101, "Harish", 34, "harish@hpe.com"));
		users.add(new User(45, "Swathi", 26, "swathi@hpe.com"));
		users.add(new User(78, "Anand", 28, "anand@hpe.com"));
	}

	public List<User> getAllUsers() {
		return users;
	}

	/*
	 * new User (Save) {userName:"Prakash", userAge:34,
	 * userEmail:"prakash@gmail.com"}
	 * 
	 * updating the record {userId: 192, userName:"Prakash Kumar", userAge:34,
	 * userEmail:"prakash@gmail.com"}
	 * 
	 */
	public User save(User user) {
		if (user.getUserId() == 0) {
			int counter = users.size() + 1;
			user.setUserId(counter);
		}

		users.add(user);
		return user;
	}

	public User findOne(int userId) {
		for (User user : users) {
			if (user.getUserId() == userId) {
				return user;
			}
		}
		return null;
	}

	
	public User updateUser(User user) {
		
		this.deleteById(user.getUserId()); 
		
		 users.add(user);
		 return user; 
	}
	
	public User deleteById(int userId) {
		for (User user : users) {
			if (user.getUserId() == userId) {
				System.out.println("User got for deletion " + userId);
				users.remove(user);
				return user;
			}
		}
		return null;
	}
}
