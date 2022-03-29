package com.utilityservices.logic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

import com.utilityservices.dao.ConnectionUtil;
import com.utilityservices.dao.FindServiceManDao;
import com.utilityservices.dao.ServiceManNameFinder;
import com.utilityservices.dao.StatusUpdater;
import com.utilityservices.model.AvailableDetails;

public class AcService {
	static Scanner sc=new Scanner(System.in);
	public static void AcServiceBook() throws Exception
	{
		List<AvailableDetails> details=FindServiceManDao.findAcServiceMan();
		for(AvailableDetails i: details)
		{
			System.out.println(i.getId()+"   "+i.getName()+"     "+i.getMobile()+"    "+i.getSpecialist_in()+"      "+i.getStatus());
		}
		AcServiceBooking();

	}
	public static void AcServiceBooking() throws Exception
	{
		System.out.println("\nSelect the service man you wanted");
		int manId=sc.nextInt();
		String status=null;
		String name=ServiceManNameFinder.nameFinder(manId);
		String query="select status from utilityapp_service where id='"+manId+"'";
		Connection connect=ConnectionUtil.getConnection();
		Statement statement=connect.createStatement();
		ResultSet rs=statement.executeQuery(query);
		while(rs.next()) {
			status=rs.getString("status");
		}
		if(status.equals("available")) {
		System.out.println("\nYou selected "+name+" for your TV service\nTo confirm click 1");
		System.out.println("Click 2 to select another service man\n");
		int option=sc.nextInt();
			if(option==1)
			{
				StatusUpdater.statusUpdater(manId);
			}
			else if(option==2)
			{
				AcServiceBooking();
			}
			}
		else {
			System.out.println("Sorry service man is unavailable\nCome back later\n");
		}
	}
}
