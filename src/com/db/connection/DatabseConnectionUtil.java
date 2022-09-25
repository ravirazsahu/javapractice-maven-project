package com.db.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabseConnectionUtil {
public static void main(String[] args) {
	getConnection();
}
	public DatabseConnectionUtil() {
	}
public static Connection getConnection() {
	Connection con=null;
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:6033/book_manager","root","root");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from EMPLOYEE");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		con.close();
//		return con;
		}catch (Exception e) {
		System.out.println("error:: "+e.getMessage());
		}
	
	return con;

}
}
