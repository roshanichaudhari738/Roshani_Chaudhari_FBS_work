package com.service;

import com.dao.DaoInter;

public interface LoginValidationInter {
	public boolean signUp(String user,String pass,String email);
	public boolean signIn(String user,String pass);
	//public String forgetPassword(String user);
	public void updatePassword(String user,String existPass,String newPass);
	public void setDao(DaoInter dao);
}
