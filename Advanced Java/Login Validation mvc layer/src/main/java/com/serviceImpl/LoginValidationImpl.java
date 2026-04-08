package com.serviceImpl;

import java.sql.Connection;

import com.beans.UserPOJO;
import com.dao.DaoInter;
import com.daoImpl.DaoImpl;
import com.service.LoginValidationInter;
import com.util.DBConnection;

public class LoginValidationImpl implements LoginValidationInter {
	
	 DaoInter daoi;
	 Connection con ; 
	 DaoInter dao;
	// DaoImpl dao;
	 public LoginValidationImpl() {
	        System.out.println("LoginValidationImpl created");
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

        UserPOJO u = new UserPOJO();
        u.setUserName(user);
        u.setEmail(email);
        u.setPassword(pass);

        dao.register(u);
        return u != null;
	}

	@Override
	public boolean signIn(String user, String pass) {
		if(user == null || pass == null)
            return false;

        UserPOJO u = dao.login(user, pass);
        System.out.println("User Login "+u);
        return u != null;
		
		//daoi.login(user, pass);
		//return true;
	}

	@Override
	public void updatePassword(String user, String existPass, String newPass) {
		UserPOJO u = dao.login(user, existPass);

        if(u == null)
            throw new RuntimeException("Old password incorrect");

        if(newPass.length() < 4)
            throw new RuntimeException("New password too short");

        dao.updatePassword(user, newPass);
		
	}

	@Override
    public void setDao(DaoInter dao) {
        this.dao = dao;  // Servlet se inject hoga
        System.out.println("DAO " + dao);
    }

}
