package org.richard.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Main {
	
	@WebMethod
	public String getProduct() throws ClassNotFoundException{	
		String a = "ggggg";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "1234");
	        Statement stat = conn.createStatement();
	        ResultSet rs = stat.executeQuery("select catalog from product");
	        rs.next();
            a = rs.getString(1);
            rs.close();
            conn.close();
		}catch (Exception ex){
			System.out.println(ex.getMessage());
		}
		return a;
	}

}
