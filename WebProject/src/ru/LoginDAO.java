package ru;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDAO {
    static Connection currentCon = null;
    static ResultSet rs = null;

    public static UserInfo login(UserInfo bean) {
        Statement stm = null;
        String username = bean.getUsername();
        String password = bean.getPassword();

        String searchQuery = "SELECT * FROM user2 WHERE uname='" + username + "'AND password='" + password + "'";


        //connection DB
        try {
            currentCon = ConnectionManager.getConnection();
            stm = currentCon.createStatement();
            rs = stm.executeQuery(searchQuery);
            boolean userExist = rs.next();
            if (!userExist) {
                System.out.println("Username/Password entered is Incorrect or User doesnot Exists.");
                bean.setValid(false);
            } else if (userExist) {
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                System.out.println("Welcome" + firstName);
                bean.getFirstName(firstName);
                bean.getLastName(lastName);
                bean.setValid(true);
            }

        } catch (Exception e) {
            System.out.println("Log In failed: An Exception has occurred! " + e);
        }
        return bean;
    }
}

