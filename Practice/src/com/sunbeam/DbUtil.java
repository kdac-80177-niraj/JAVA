package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	public static final String DB_USER = "KD3_80177_niraj";
	public static final String DB_PASSW = "manager";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public static Connection getConnection() throws Exception{
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSW);
		return con;
	}
}
