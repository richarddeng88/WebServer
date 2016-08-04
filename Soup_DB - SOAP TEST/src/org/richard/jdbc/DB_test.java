package org.richard.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DB_test {
	
	public static void connection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.print("worked");
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {	
		   connection();
		   
		   String url = "jdbc:mysql://localhost:3306/employees";
		   String user = "root";
		   String pw = "1234";
		   
		   try{
			   // 1. get connectino to DB
			   Connection mycon = DriverManager.getConnection(url,user,pw);
			   
			   // 2. create a statement
			   Statement stmt = mycon.createStatement();
			   
			   // 3. excute SQL query
			   String query = "insert into product values ( 233, 'book', 'ddfdafging')";
			   
			   stmt.execute(query);
			   
			   mycon.close();
			   stmt.close();
			   
			   System.out.println("insert completed");
		   }catch(Exception exc){
		   exc.printStackTrace();
	}
}
}