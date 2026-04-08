package com.controller;

import java.io.IOException;
import java.sql.Connection;

import com.aspect.DaoObjectProviderClass;
import com.aspect.ObjectProviderClass;
import com.dao.DaoInter;
import com.daoImpl.DaoImpl;
import com.service.LoginValidationInter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SignUpServlet extends HttpServlet {

	Connection con;
	DaoInter dao;
	LoginValidationInter businessObject;
	
	@Override
	public void init(){
		
			
			
			//get the database object for DAO //step..1 get the database connection from context
			con=(Connection) getServletConfig().getServletContext().getAttribute("connection");
			System.out.println("0"+con);
			
			//step..2 get the DAO class object from provider
			//get the information of business logic class from middleware
			String daoclassname=getServletConfig().getInitParameter("daoclassname");
			dao=(DaoImpl) DaoObjectProviderClass.createObject(daoclassname);
			System.out.println("1"+dao);
			
			//step..3 Provide the database connection to the dao class
			dao.setDaoConnection(con);
			System.out.println("2"+dao);
			
			//step..4 get the b.logic object from provider
			String classname=getServletConfig().getInitParameter("classname");
			businessObject=ObjectProviderClass.createObject(classname);
			
			//step..5 give DAO to business logic class
			businessObject.setDao(dao);
			System.out.println("3 "+businessObject);
			
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("userName");
		String email=req.getParameter("userEmail");
		String password=req.getParameter("password");
		
		boolean value=businessObject.signUp(username, password, email);
		RequestDispatcher rd=null;
		if(value)
		{
			rd=req.getRequestDispatcher("/Signin.jsp");
			 rd.forward(req, resp);
		}
		else {
			rd=req.getRequestDispatcher("/Signup.jsp");
			 rd.forward(req, resp);
		}
		
	}
}
