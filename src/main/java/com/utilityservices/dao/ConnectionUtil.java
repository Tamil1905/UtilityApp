package com.utilityservices.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionUtil {
	
	private String url = "jdbc:mysql://101.53.133.59:3306/revature_training_db";
	private String userName = "rev_user";
	private String password = "rev_user";
	static Connection connection = null;

	public static Connection getConnection() throws Exception {
		ConnectionUtil db = new ConnectionUtil();
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try {
			
			connection = DriverManager.getConnection(db.url, db.userName, db.password);
		} 
		
		catch (SQLException e) {

			e.printStackTrace();
		}
		return connection;
	}

	
}
