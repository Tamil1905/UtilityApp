package com.utilityservices.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


import com.utilityservices.model.AvailableDetails;


public class AvailableDAO {
	
	static Scanner sc=new Scanner(System.in);
	public static AvailableDetails Order() throws Exception {
		int choice=0;
		System.out.println("Enter service id");
		choice=sc.nextInt();
		AvailableDetails det=matchOrder(choice);
		return det;
		}
	public static AvailableDetails matchOrder(int choice) throws Exception {
		int id=0;
		String name=null;
		String specialist_in=null;
		String status=null;
		String number=null;
		Connection connect=ConnectionUtil.getConnection();
		String query="select id,name,mobile,specialist_in,status from utilityapp_service where id="+choice+"";
		Statement statement=connect.prepareStatement(query);
		ResultSet rs=statement.executeQuery(query);
		if(rs.next()) {
			id=rs.getInt("id");
			name=rs.getString("name");
			number=rs.getString("mobile");
			specialist_in=rs.getString("specialist_in");
			status=rs.getString("status");
		}
		else {
			throw new Exception("Enter valid input");
		}
		AvailableDetails detail=new AvailableDetails();
		detail.setId(id);
		detail.setName(name);
		detail.setMobile(number);
		detail.setSpecialist_in(specialist_in);
		detail.setStatus(status);
		return detail;
}


		
		public static void OrderDetails() throws Exception {
			try {
			AvailableDetails detail=AvailableDAO.Order();
			System.out.println("Details for your id selection:");
			System.out.println("Service id:"+detail.getId()+"\nName:"+detail.getName()+"\nMobile:"+detail.getMobile()+"\nSpecialist in "+detail.getSpecialist_in()+"\nStatus:"+detail.getStatus());
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			


}
}