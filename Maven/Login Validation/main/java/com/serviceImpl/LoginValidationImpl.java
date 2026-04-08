package com.serviceImpl;

import java.sql.Connection;

import com.beans.User;
import com.dao.DaoInter;
import com.daoImpl.DaoImpl;
import com.service.LoginValidationInter;

public class LoginValidationImpl implements LoginValidationInter {
	
//	 DaoInter daoi;
	 Connection con ; 
	 DaoInter dao;
	// DaoImpl dao;
	 public LoginValidationImpl() {
	        System.out.println("LoginValidationImpl created");
	        dao=new DaoImpl();
	    }
//	 public LoginValidationImpl() {
//	        try {
//	            con = DBConnection.getConnection();
//	            dao = new DaoImpl(con);
//	            System.out.println("Connection successful: " + con);
//	            System.out.println("3 " + this);
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        }
//	    }
	@Override
	public boolean signUp(String user, String pass, String email) {
		if(user == null || user.isEmpty())
            throw new RuntimeException("Username required");

        if(pass == null || pass.length() < 4)
            throw new RuntimeException("Password too short");

        User u = new User();
        u.setUserName(user);
        u.setEmail(email);
        u.setPassword(pass);

        System.out.println("Inside LoginValidation");
        
        dao.insertUser(u);
        System.out.println("Inserted "+u);
        return u != null;
	}

	@Override
	public boolean signIn(String user, String pass) {
		if(user == null || pass == null)
            return false;

		boolean flag=false;
//		if (u.getUserName().equals(userName)) if(u.getPassword().equalsIgnoreCase(password))
//		{
//			flag=true;
//		}
//		else {
//			flag=false;
//		}
		flag=dao.retrive(user,pass);
		
		return flag;
//        return u != null;
		
		//daoi.login(user, pass);
		//return true;
	}

//	@Override
//	public void updatePassword(String user, String existPass, String newPass) {
//		User u = dao.retrive(user, existPass);
//
//        if(u == null)
//            throw new RuntimeException("Old password incorrect");
//
//        if(newPass.length() < 4)
//            throw new RuntimeException("New password too short");
//
//        dao.updatePassword(user, newPass);
//		
//	}

//	@Override
//    public void setDao(DaoInter dao) {
//        this.dao = dao;  // Servlet se inject hoga
//        System.out.println("DAO " + dao);
//    }

}
