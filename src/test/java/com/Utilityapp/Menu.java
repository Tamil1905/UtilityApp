package com.Utilityapp;

import java.util.Scanner;

import com.utilityservices.dao.AvailableDAO;
import com.utilityservices.logic.AcService;
import com.utilityservices.logic.DisplayMenu;
import com.utilityservices.logic.FridgeService;
import com.utilityservices.logic.TvServiceBooking;
import com.utilityservices.logic.WashMachineService;

public class Menu {
	
	public static void menu() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n1. AC service");
		System.out.println("2. TV service");
		System.out.println("3. Fridge service");
		System.out.println("4. Washing Machine service");
		System.out.println("5. Display all services");
		System.out.println("6. Available Servicemen");
		System.out.println("7. Exit\n");
	
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		if(choice==1) {
			AcService.AcServiceBook();
			System.out.println("Returning you to main page");
			Menu.menu();
		}
		else if(choice == 2) {
			TvServiceBooking.tvSerciceBook();
			System.out.println("Returning you to main page");
			Menu.menu();
		}
		else if(choice == 3) {
			 FridgeService.FridgeServiceBook();
			 System.out.println("Returning you to main page");
				Menu.menu();
		}
		else if(choice == 4) {
			WashMachineService.WashMachineServiceBook();
			System.out.println("Returning you to main page");
			Menu.menu();
		}
		else if(choice == 5) {
			DisplayMenu.displayAll();
			System.out.println("Enter 1 to main menu");
			sc.nextInt();
			Menu.menu();
		}
		else if(choice == 6) {
			AvailableDAO.OrderDetails();
			System.out.println("Enter 1 to main menu");
			sc.nextInt();
			Menu.menu();
		}
		else if(choice == 7) {
			System.out.println("Thanks for using Utilityapp Service");
			System.exit(1);
		}
		else {
			System.out.println("\nWrong input");
			System.exit(1);
		}
		
		
		
		
		
		
		
	}
}
