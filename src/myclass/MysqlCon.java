/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package myclass;
import java.sql.*; 

/**
 *
 * @author Special User
 */
public class MysqlCon {
    public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
    try (Connection con = DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/tvs","root","")) {
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from voucher");
        while(rs.next())
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
    }  
}catch(ClassNotFoundException | SQLException e){ System.out.println(e);}  
}  
    
}
