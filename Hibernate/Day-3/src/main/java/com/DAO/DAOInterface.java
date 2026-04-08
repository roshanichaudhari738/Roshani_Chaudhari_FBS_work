package com.DAO;

import com.beans.*;

//hold all CRUD operation
public interface DAOInterface {
	public void insertUser(User u);
	public boolean retrive(String username,String password);

}
