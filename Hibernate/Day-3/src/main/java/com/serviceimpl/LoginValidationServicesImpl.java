package com.serviceimpl;

import com.DAOImpl.DAOImpl;
import com.beans.User;
import com.services.LoginValidationServices;

//Bussiness logic class
public class LoginValidationServicesImpl implements LoginValidationServices
{
	//Data supplied by POJO-----Has a relationship
	User u;
	
	//Integrated with DAO class for CRUD operation
	DAOImpl dao=new DAOImpl();

	@Override
	public void createUSer(String userName, String password,String email) {
		// TODO Auto-generated method stub
		u=new User(userName,email, password);//Local obj
		dao.insertUser(u);
	}

	@Override
	public boolean validateUser(String userName, String password) {
		boolean flag=false;
//		if (u.getUserName().equals(userName)) if(u.getPassword().equalsIgnoreCase(password))
//		{
//			flag=true;
//		}
//		else {
//			flag=false;
//		}
		flag=dao.retrive(userName,password);
		
		return flag;
	}
}
