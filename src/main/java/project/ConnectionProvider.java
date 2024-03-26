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
    public static Connection getCon()
    {
        try {
            Class.forName("com.sqljbdc.driver");
            Connection con = DriverManager.getConnection("jdbc:microsoft:sqlserver://loaclHOST:3306/GYM management system>]","root",null);
            return con;
        } catch (Exception e) {
         return null;
        }
    }
    
}
