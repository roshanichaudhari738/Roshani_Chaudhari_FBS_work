package com.dao;

import java.sql.Connection;

import com.beans.User;

public interface DaoInter {
	public void insertUser(User u);
	public boolean retrive(String username,String password);
//	public void setDaoConnection(Connection con);
	
}
