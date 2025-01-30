/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import db.DBConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class RegisterAuthenticator {
    public boolean isRegister(String id,String username,String password,String role,String phone,String email){
        try{
        Connection con=DBConnector.getConnection();
        String query="insert into users values(?,?,?,?,?,?)";
        PreparedStatement pst=con.prepareStatement(query);
        pst.setString(1, id);
        pst.setString(2, username);
        pst.setString(3, email);
        pst.setString(4, password);    
        pst.setString(5, role);
        pst.setString(6, phone);
        int i=pst.executeUpdate();
       if(i>0)
       {
           System.out.println(i+"record inserted");
       }
       else
       {
           System.out.println("insertion failed.... ");
       }
    
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        if(username!=null && password!=null && id!=null && role!=null && email!=null && phone!=null)
        {
            return true;
        }
        
        return false;
    }
    
}
