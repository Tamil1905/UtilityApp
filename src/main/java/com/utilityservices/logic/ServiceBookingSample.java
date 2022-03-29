package com.utilityservices.logic;

import java.util.List;
import java.util.Scanner;

import com.utilityservices.dao.DetailsDAO;
import com.utilityservices.model.AvailableDetails;

public class ServiceBookingSample {
	static Scanner sc=new Scanner(System.in);
	public static void allServices() throws Exception
	{
		List<AvailableDetails> details=DetailsDAO.showAllServices();
		System.out.println("id  "+" Name   "+"Number     "+"Specialist_in          "+"Status     ");
		for(AvailableDetails i: details) 
		{
			System.out.println(i.getId()+"   "+i.getName()+"     "+i.getMobile()+"    "+i.getSpecialist_in()+"      "+i.getStatus());
		}
		serviceBooking();
		
	}
	public static void serviceBooking()
	{
		System.out.println("Select the service and service man you wanted by choosing the id");
		int serviceId=sc.nextInt();
		
	}

}
