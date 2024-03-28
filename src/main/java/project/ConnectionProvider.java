/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author Hamza Raza
 */
import java.sql.*;
public class ConnectionProvider {
    public static Connection getCon() throws ClassNotFoundException
    {
        try {
            String url ="jdbc:mysql://localhost:3306/GMS";
            String user="usman";
            String password ="123456";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,user,password);
            return con;
        } catch (SQLException e) {
         return null;
        }
    }
    
}
