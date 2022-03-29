package com.utilityservices.logic;

import java.util.ArrayList;
import java.util.List;

import com.utilityservices.dao.DetailsDAO;
import com.utilityservices.model.AvailableDetails;


public class DisplayMenu {
	
	public static void displayAll() throws Exception{
		List<AvailableDetails> display=new ArrayList<AvailableDetails>();
		display=DetailsDAO.showAllServices();
		System.out.println("id  "+" Name   "+"Number     "+"Specialist_in          "+"Status     ");
		for(AvailableDetails i: display) {
			System.out.println(i.getId()+"   "+i.getName()+"     "+i.getMobile()+"    "+i.getSpecialist_in()+"      "+i.getStatus());
		}
	}
}
