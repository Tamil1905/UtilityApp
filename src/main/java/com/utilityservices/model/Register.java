package com.utilityservices.model;


public class Register {
	
	private static int userid = 0;
	
	private static String name = null;
	
	private static String emailid= null;
	
	private static String password = null;
	
	private static String number = null;

	public static int getUserid() {
		return userid;
	}

	public static void setUserid(int userid) {
		Register.userid = userid;
	}

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		Register.name = name;
	}

	public static String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		Register.emailid = emailid;
	}

	public static String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		Register.password = password;
	}

	public static String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		Register.number = number;
	}
	
	public Register (String name,String emailid,String number, String password) {
		this.name= name;
		this.emailid= emailid;
		this.number= number;
		this.password= password;
		
	}

	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
