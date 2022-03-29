package com.utilityservices.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.utilityservices.model.AvailableDetails;

public class ServiceManNameFinder {
	public static String nameFinder(int id) throws Exception
	{
		Connection connection=ConnectionUtil.getConnection();
		PreparedStatement statement=null;
		ResultSet result=null;
		String query="select name from utilityapp_service where id=?";
		statement=connection.prepareStatement(query);
		statement.setInt(1, id);
		result=statement.executeQuery();
		String name=null;
		if(result.next())
		{
			name=result.getString("name");	
		}
		return name;
	}

}
