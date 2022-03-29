package utilityapp;

import java.util.Scanner;

import com.utilityservices.model.Register;
import com.utilityservices.dao.UserDAO;


public class LoginTest {

	public static void main(String[] args) throws Exception {
		login();
	}
	public static void login() throws Exception {
		Scanner sc =  new Scanner (System.in);
		System.out.println("Enter you emailid:");
		String Useremailid =sc.next();
		System.out.println("Enter your password:");
		String Userpassword= sc.next();
		Register obj1 = new Register();
		obj1.setEmailid(Useremailid);
		obj1.setPassword(Userpassword);
		
		int a = UserDAO.loginCheck(Useremailid, Userpassword);
		 if(a == 1) {
			 System.out.println("login successfully");
		 }
		 else if(a==-1) {
			 System.out.println("Invalid Credentials");
		 }
		 else if(a==0) {
			 System.out.println("No records found");
		 }
	}
}
