
package model;

import db.DBConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginAuthenticator {
    public boolean isRole(String username, String role)
    { try{
          Statement st = DBConnector.getStatement();
         String query="select role from users where name='"+username+"'"; 
       System.out.println("query=" + query);
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                String tablerole = rs.getString(1);
                
            }
      }
      
      catch (SQLException ex) {
            System.out.println(ex);
        }
        if(role.equalsIgnoreCase("tablerole"))
    {
        return true;
    }
      return false;

    }
    public boolean isLogin(String username,String password) 
    {
      try{
          Statement st = DBConnector.getStatement();
         String query="select password from users where name='"+username+"'"; 
       System.out.println("query=" + query);
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                String tablepassword = rs.getString(1);
                
            }
      }
      
      catch (SQLException ex) {
            System.out.println(ex);
        }
            if (username != null && password != null && !username.trim().equals("") && password.equalsIgnoreCase("tablepassword"));
            { 
                return true;
            }  
    }
}
