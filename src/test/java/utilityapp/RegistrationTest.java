package utilityapp;

import java.util.Scanner;

import com.utilityservices.model.Register;
import com.utilityservices.dao.UserDAO;
import com.utilityservices.logic.RegisterValidation;

public class RegistrationTest {

	public static void main(String[] args) throws Exception {
		Registration();
	}
	public static void Registration() throws Exception {
		Scanner sc =  new Scanner (System.in);
		int a=0,b=0;
		System.out.println("Enter your Name");
		String userName = sc.next();
		System.out.println("Enter your Emailid:");
		String Useremailid =sc.next();
		System.out.println("Enter your Password:");
		String Userpassword=sc.next();
		System.out.println("Enter your Mobile Number");
		String mobile=sc.next();
	
		Register obj1 = new Register();
	
		obj1.setName(userName);
		obj1.setEmailid(Useremailid);
		obj1.setPassword(Userpassword);
		obj1.setNumber(mobile);
		try {
		a=RegisterValidation.validationRegister(obj1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		if(a==1) {
			try {
		UserDAO obj = new UserDAO();
		b = obj.checkValidation(obj1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		if(b == 1) {
			UserDAO.insert(obj1);
		}
	}
	}
}
