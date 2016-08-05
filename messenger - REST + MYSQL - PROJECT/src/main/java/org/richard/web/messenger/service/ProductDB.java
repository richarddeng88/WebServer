package org.richard.web.messenger.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import org.richard.web.messenger.model.Product;

public class ProductDB {
	
	//ArrayList<Product> product = new ArrayList<>();
	
	public Product get_product_detail(){
		Product product = new Product();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "1234");
	        Statement stat = conn.createStatement();
	        ResultSet rs = stat.executeQuery("select * from product");
	        rs.next();
        	int a = rs.getInt("sku");
        	String b = rs.getString("catalog");
        	String c = rs.getString("detail");
        	product = new Product(a,b,c);
        
            stat.close();
            conn.close();
		}catch (Exception ex){
			System.out.println("there is something wrong");
		} finally{
			System.out.println("good luck for you, richard!!!!");
		}
		return product;
	}
	
}
