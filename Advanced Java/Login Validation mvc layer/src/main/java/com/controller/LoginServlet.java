package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import org.apache.catalina.connector.Response;

import com.aspect.DaoObjectProviderClass;
import com.aspect.ObjectProviderClass;
import com.beans.UserPOJO;
import com.dao.DaoInter;
import com.daoImpl.DaoImpl;
import com.service.LoginValidationInter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	LoginValidationInter businessObject;
	Connection con;
	DaoInter dao;
	
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
		try {
			PrintWriter out=resp.getWriter();
			resp.setContentType("text/html");
			HttpSession session=req.getSession();
//			 UserPOJO p=(UserPOJO)session.getAttribute("beanClass");
			
			String username=req.getParameter("userName");
			String password=req.getParameter("password");
			System.out.println("Username "+username);
			System.out.println("pass "+password);

			boolean value=businessObject.signIn(username,password);
			
			 //boolean value=businessObject.signIn(p.getUserName(),p.getPassword());
			 RequestDispatcher rd=null;
			 if(value)
			 {
				 session.setAttribute("username", username); // ← ye add karo
				    rd = req.getRequestDispatcher("/login.jsp");
				    rd.forward(req, resp);
//				 rd=req.getRequestDispatcher("/Signin.jsp");
//				 rd.forward(req, resp);
				 
			 }
			 else
			 {
				 session.invalidate();
				 rd=req.getRequestDispatcher("/Signup.jsp");
				 rd.forward(req, resp);
			 }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
