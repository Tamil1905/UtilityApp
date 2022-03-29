package com.utilityservices.logic;

import com.utilityservices.model.Register;

public class RegisterValidation {
	
	
	
	public static int validationRegister(Register register) throws Exception {
		
		String name=register.getName();
		String number=register.getNumber();
		String email=register.getEmailid();
		String password=register.getPassword();
		
		if(name.isBlank()||name.isEmpty()) {
			throw new Exception("Name should not be empty");
		}
		if(number.length()!=10) {
			throw new Exception("Number should contain digits");
		}
		if(!email.contains("@")) {
			throw new Exception("Invalid email");
		}
		if(password.length()<8) {
			throw new Exception("Password should not be less than 8 characters");
		}
		return 1;
		
		
}
}
