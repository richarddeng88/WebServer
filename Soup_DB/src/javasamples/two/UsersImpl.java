package javasamples.two;


import javax.jws.WebMethod;
import javax.jws.WebService;

import java.sql.*;

@WebService
public class UsersImpl implements UsersInterface {

	@WebMethod
    public int getUserCount() { 
		int numusers = 0;
		String dbUrl = "jdbc:mysql://localhost:3306/employees";
		String query = "Select count(*) FROM test";
		String userName = "root";
		String password = "1234";
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			numusers = rs.getInt(0);
			}
		
		}
		con.close();
		return numusers;

	}
}

