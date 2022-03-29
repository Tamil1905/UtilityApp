package com.utilityservices.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.utilityservices.model.AvailableDetails;

public class FindServiceManDao {
	public static List<AvailableDetails> findTvServiceMan() throws Exception
	{
		List<AvailableDetails> list=new ArrayList<AvailableDetails>();
		Connection connection=ConnectionUtil.getConnection();
		PreparedStatement statement=null;
		ResultSet result=null;
		String query="select id,name,mobile,specialist_in,status from utilityapp_service where specialist_in=?";
		statement=connection.prepareStatement(query);
		statement.setString(1, "tv service");
		result=statement.executeQuery();
		int id=0;
		String name=null;
		String number=null;
		String specialist=null;
		String status=null;
		AvailableDetails details=null;
		while(result.next())
		{
			details=new AvailableDetails();
			id=result.getInt("id");
			name=result.getString("name");
			number=result.getString("mobile");
			specialist=result.getString("specialist_in");
			status=result.getString("status");
			details.setId(id);
			details.setName(name);
			details.setMobile(number);
			details.setSpecialist_in(specialist);
			details.setStatus(status);
			list.add(details);
			
		}
		return list;
	}
	public static List<AvailableDetails> findAcServiceMan() throws Exception
	{
		List<AvailableDetails> list=new ArrayList<AvailableDetails>();
		Connection connection=ConnectionUtil.getConnection();
		PreparedStatement statement=null;
		ResultSet result=null;
		String query="select id,name,mobile,specialist_in,status from utilityapp_service where specialist_in=?";
		statement=connection.prepareStatement(query);
		statement.setString(1, "AC service");
		result=statement.executeQuery();
		int id=0;
		String name=null;
		String number=null;
		String specialist=null;
		String status=null;
		AvailableDetails details=null;
		while(result.next())
		{
			details=new AvailableDetails();
			id=result.getInt("id");
			name=result.getString("name");
			number=result.getString("mobile");
			specialist=result.getString("specialist_in");
			status=result.getString("status");
			details.setId(id);
			details.setName(name);
			details.setMobile(number);
			details.setSpecialist_in(specialist);
			details.setStatus(status);
			list.add(details);
			
		}
		return list;
	}
	public static List<AvailableDetails> findFridgeServiceMan() throws Exception
	{
		List<AvailableDetails> list=new ArrayList<AvailableDetails>();
		Connection connection=ConnectionUtil.getConnection();
		PreparedStatement statement=null;
		ResultSet result=null;
		String query="select id,name,mobile,specialist_in,status from utilityapp_service where specialist_in=?";
		statement=connection.prepareStatement(query);
		statement.setString(1, "fridge service");
		result=statement.executeQuery();
		int id=0;
		String name=null;
		String number=null;
		String specialist=null;
		String status=null;
		AvailableDetails details=null;
		while(result.next())
		{
			details=new AvailableDetails();
			id=result.getInt("id");
			name=result.getString("name");
			number=result.getString("mobile");
			specialist=result.getString("specialist_in");
			status=result.getString("status");
			details.setId(id);
			details.setName(name);
			details.setMobile(number);
			details.setSpecialist_in(specialist);
			details.setStatus(status);
			list.add(details);
			
		}
		return list;
	}
	public static List<AvailableDetails> findWashingMachineServiceMan() throws Exception
	{
		List<AvailableDetails> list=new ArrayList<AvailableDetails>();
		Connection connection=ConnectionUtil.getConnection();
		PreparedStatement statement=null;
		ResultSet result=null;
		String query="select id,name,mobile,specialist_in,status from utilityapp_service where specialist_in=?";
		statement=connection.prepareStatement(query);
		statement.setString(1, "washing machine");
		result=statement.executeQuery();
		int id=0;
		String name=null;
		String number=null;
		String specialist=null;
		String status=null;
		AvailableDetails details=null;
		while(result.next())
		{
			details=new AvailableDetails();
			id=result.getInt("id");
			name=result.getString("name");
			number=result.getString("mobile");
			specialist=result.getString("specialist_in");
			status=result.getString("status");
			details.setId(id);
			details.setName(name);
			details.setMobile(number);
			details.setSpecialist_in(specialist);
			details.setStatus(status);
			list.add(details);
			
		}
		return list;
	}




}
