package com.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static Connection conn;
	public static Connection getConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://3.110.76.1:3307/ebook_mems","root","root");//localhost
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
