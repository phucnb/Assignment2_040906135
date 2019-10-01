package com.algonquincollege.cst8277.assignment2.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.algonquincollege.cst8277.assignment2.model.User;


@Named
@ApplicationScoped
public class UsersDAOImpl  implements Serializable, UsersDAO{
    private int n;
    public UsersDAOImpl() {
        
    }
    
    private static final long serialVersionUID = 1L;
    @Resource(name="jdbc/usersPool")
    private DataSource dataSource;
    
    @Override
    public User createUser(User user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        // TODO Auto-generated method stub
        try {
            Connection conn = dataSource.getConnection();
 
            Statement statement = conn.createStatement();
            String sql = "select username, email from users";
            ResultSet rs = statement.executeQuery(sql);
 
            System.out.println("okay");
 
            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        
        return null;
    }
    
    public int getN() {
        return n;
    }
    
    

}
