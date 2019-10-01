package com.algonquincollege.cst8277.assignment2.dao;

import java.util.List;

import com.algonquincollege.cst8277.assignment2.model.User;

public interface UsersDAO {
    
    public User createUser(User user);
    public List<User> getAllUsers();
    

}
