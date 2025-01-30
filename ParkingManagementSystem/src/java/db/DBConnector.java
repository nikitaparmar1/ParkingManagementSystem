
package db;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
   
    static Connection con=null;
    static Statement st=null;

    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/parkingdb","root","root");
         System.out.println("connected");
         st=con.createStatement();
         
        }
    

    catch(ClassNotFoundException | SQLException e){
        System.out.println(e);
        
    }
    }
    public static Statement getStatement(){
        return st;
    }
    public static Connection getConnection(){
        return con;
    }
}
