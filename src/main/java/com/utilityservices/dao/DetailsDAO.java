package com.utilityservices.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.utilityservices.model.AvailableDetails;


public class DetailsDAO {

	public static List<AvailableDetails> showAllServices() throws Exception{

		Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
//		System.out.println(connection);
		String query="select * from utilityapp_service";
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		List<AvailableDetails> list=new ArrayList<AvailableDetails>();
		int id=0;
		String name=null;
		String specialist_in=null;
		String status=null;
		String number=null;
		while(rs.next()) {
			id=rs.getInt("id");
			name=rs.getString("name");
			number=rs.getString("mobile");
			specialist_in=rs.getString("specialist_in");
			status=rs.getString("status");
			AvailableDetails detail=new AvailableDetails();
			detail.setId(id);
			detail.setName(name);
			detail.setMobile(number);
			detail.setSpecialist_in(specialist_in);
			detail.setStatus(status);
			list.add(detail);
		}
		return list;
	}
}