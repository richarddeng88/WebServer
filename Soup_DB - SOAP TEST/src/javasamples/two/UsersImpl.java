package javasamples.two; 

import javax.jws.WebService;
import java.sql.*;


@WebService(endpointInterface = "javasamples.two.UsersInterface")

public class UsersImpl implements UsersInterface {

    public int getUserCount() { 
		int numusers = 0;
		String dbUrl = "jdbc:mysql://localhost:3306/employees";
		String query = "Select sku FROM product";
		String userName = "root";
		String password = "1234";
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection (dbUrl, userName, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			numusers = rs.getInt(1);
			}
		stmt.close();
		con.close();
		
		} catch(Exception e) {
			numusers = 999999;
			e.printStackTrace();
		} 
		
		return numusers;

	}
}

