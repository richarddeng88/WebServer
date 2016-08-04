package org.richard.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Main {
	
	@WebMethod
	public String getProduct() {	
		String a = "ggggg";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "1234");
	        Statement stat = conn.createStatement();
	        ResultSet rs = stat.executeQuery("select catalog from product");
	        rs.next();
            a = rs.getString(1);
            stat.close();
            conn.close();
		}catch (Exception ex){
			a = "No Access to MySQL";
			System.out.println("there is something wrong");
		} finally{
			System.out.println("good luck for you, richard!!!!");
		}
		return a;
	}

}
