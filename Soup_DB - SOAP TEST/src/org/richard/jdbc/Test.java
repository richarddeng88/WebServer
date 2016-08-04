package org.richard.jdbc;

import java.sql.*;

public class Test {
	public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "1234");
        Statement stat = conn.createStatement();
        stat.execute("drop table product");
        stat.execute("create table product(sku int primary key,catalog varchar(255), detail varchar(255))");
        stat.execute("insert into product values(101, 'book','regression'),(121, 'movie', 'batman')");

        ResultSet rs;
        rs = stat.executeQuery("select catalog from product");
        /*
        while (rs.next()) {
            System.out.print(rs.getInt("sku") + " ");
            System.out.print(rs.getString("catalog") + " ");
            System.out.println(rs.getString("detail"));
        }
        */
        rs.next();
        String a = rs.getString(1);
        System.out.println(a);

        //5 close the environment. 
        stat.close();
        conn.close();
    }
}
