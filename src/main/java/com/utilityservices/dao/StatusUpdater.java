package com.utilityservices.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StatusUpdater {
	public static void statusUpdater(int id) throws Exception
	{
		Connection connection=ConnectionUtil.getConnection();
		PreparedStatement statement=null;
		String query="update utilityapp_service set status='not available' where id=?";
		statement=connection.prepareStatement(query);
		statement.setInt(1, id);
		statement.executeUpdate();
		System.out.println("Booking successfull");
//		int rows=statement.executeUpdate();
		
	}

}
