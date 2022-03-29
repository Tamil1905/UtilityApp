package com.utilityservices.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.utilityservices.dao.*;
import com.utilityservices.model.Register;

public class UserDAO {

//		public static int exceqution(String query) throws Exception {
//			Connection connection = ConnectionUtil.getConnection();
//			Statement statement = connection.createStatement();
//			int rows = (int) statement.executeLargeUpdate(query);
//			System.out.println("Register is completed");
//			System.out.println("user added new user");
//			connection.close();
//			return rows;
//		}
	 	public static int insert(Register details) throws Exception {
				String query = null;
				int t = 0;
					query="insert into utilityapp_users (user_name,emailid,mobile,user_password) values   ('"+details.getName()+"','"+details.getEmailid()+"','"+details.getNumber()+"','"+details.getPassword()+"')";
//					System.out.println(query);
					Connection connect=ConnectionUtil.getConnection();
//					System.out.println("details");
					Statement statement=connect.createStatement();
					t=statement.executeUpdate(query);
					System.out.println("Registered Successfully");
				
				return t;
			}

			@SuppressWarnings("finally")
			public int checkValidation(Register obj1) throws Exception {
				String query = null;
				int result = 0;
				String email=null;
				Connection connection = ConnectionUtil.getConnection();
				Statement statement = connection.createStatement();
				try {

					query="select  emailid, user_password from utilityapp_users where emailid =  '"+obj1.getEmailid()+"' or user_password = '"+obj1.getPassword()+"'";
					ResultSet rs = statement.executeQuery(query);
					if(rs.next()) {
						email=rs.getString("emailid");
					}
					else {
						result++;
					}
					if(email!=null) {
						throw new Exception("You're an existing user");
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				} finally {
					connection.close();
					return result;
				}
			}
			@SuppressWarnings("unused")
			public static int loginCheck(String userMailId, String userPass) throws Exception {
				String query = null;
				int result = 0;
				String mail=null;
				String password=null;
				Connection connection = ConnectionUtil.getConnection();
				Statement statement = connection.createStatement();
				query="select  emailid, user_password from utilityapp_users where emailid =  '"+userMailId+"'";
				ResultSet rs = statement.executeQuery(query);
				while(rs.next()) {
					mail=rs.getString("emailid");
					password=rs.getString("user_password");
				} 
				int res=0;
				if(mail==null) {
					res=0;
					
				}
				else if (password.equals(userPass)) {
					res=1;
					
				}
				else { 
					
					res=-1;
					
				}
				return res;
			}
			
			


	
	
}
