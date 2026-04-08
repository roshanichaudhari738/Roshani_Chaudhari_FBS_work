package com.dao;

import java.sql.Connection;

import com.beans.UserPOJO;

public interface DaoInter {
	public boolean register(UserPOJO user);
	public UserPOJO login(String userName,String pass);
	public void updatePassword(String email, String newPass);
	public void setDaoConnection(Connection con);
	
}
