package com.services;

//Menu card of the software system
public interface LoginValidationServices {
	public void createUSer(String userName,String password,String email);
	public boolean validateUser(String userName,String password);
}
