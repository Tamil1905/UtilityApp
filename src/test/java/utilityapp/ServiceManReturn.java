package utilityapp;

import java.util.Scanner;

import com.utilityservices.dao.BookingReturn;

public class ServiceManReturn {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your service");
		String name= sc.nextLine();
		BookingReturn.returnbooking(name);

	}

}
