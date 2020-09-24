package com.example.googlenote.model;

import java.util.List;




public interface UserRepository {
	
     
	User findById(long id);
	
	User findByName(String name);
	
	void saveUser(User user);
	
    void updateUser(User user);
    
    void deleteUserById(long id);
 
    List<User> getAllUsers();
     
    void deleteAllUsers();
     
    boolean isUserExist(User user);
}
