package com.utilityservices.logic;

import com.utilityservices.dao.UserDAO;
import com.utilityservices.model.Register;

public class UserRegistration {
	
	public void registration( ) {
		Register obj = new Register();
		String userMailId = obj.getEmailid();
		String userPass	= Register.getPassword();
		int verify = 1;
		try {
			if (!userMailId.isBlank() && !userMailId.isEmpty() && !userPass.isBlank() && !userPass.isEmpty()) {
				if (userMailId.contains("@gmail.com")) {
//					verify = UserDAO.checkValidation(userMailId, userPass);
					System.out.println(" valid" + verify);
				} else {
					System.out.println("not valid");
				}
			} else {
				System.out.println("not valid");
			}
		} catch (Exception ep) {

			System.out.println(ep.getMessage());
		} 
}
}
