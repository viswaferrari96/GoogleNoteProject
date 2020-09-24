package com.example.googlenote.model;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	private static final AtomicLong counter = new AtomicLong();
	private static List<User> users;

	
	
	
	public void updateUser(User user) {
		int index = users.indexOf(user);
		users.set(index, user);

	}


	public void deleteUserById(long id) {
		for(Iterator<User> iterator =users.iterator();iterator.hasNext();) {
			User user = iterator.next();
			if(user.getUser_id() == id) {
				iterator.remove();
			}
		}
	}


	public List<User> getAllUsers() {
		return users;
	}


	public void deleteAllUsers() {
		users.clear();

	}

	public boolean isUserExist(User user) {
		return findByName(user.getUser_name())!=null;
	}

	public User findById(long id) {
		for(User user : users) {
			if(user.getUser_id() == id) {
				return user;
			}
		}
		return null;
	}


	public User findByName(String name) {
		for(User user : users) {
			if(user.getUser_name().equalsIgnoreCase(name)){
				return user;
			}
		}
		return null;
	}


	public void saveUser(User user) {
		user.setUser_id(counter.incrementAndGet());
		users.add(user);

	}

}
