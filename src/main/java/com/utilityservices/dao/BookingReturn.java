package com.utilityservices.dao;

import java.sql.Connection;
import java.sql.Statement;



public class BookingReturn {
public static void returnbooking(String name1) throws Exception
{
	
	Connection connection;
	connection=ConnectionUtil.getConnection();
	
	String name="available";
	String query1="UPDATE utilityapp_service SET status ='"+name+"' WHERE specialist_in = '"+name1+"'" ;
	
	Statement stm = connection.createStatement();
	stm.executeUpdate(query1);
//	System.out.println("Yeah i am available");
	
	
	
	}
}
