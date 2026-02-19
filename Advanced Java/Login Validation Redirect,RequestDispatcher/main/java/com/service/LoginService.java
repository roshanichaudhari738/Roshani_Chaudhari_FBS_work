package com.service;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class LoginService
 */
public class LoginService extends HttpServlet {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	public void init()
	{
		//getting database configure from middleware
		String driver=getServletConfig().getServletContext().getInitParameter("driver");
		String url=getServletConfig().getServletContext().getInitParameter("url");
		String user=getServletConfig().getServletContext().getInitParameter("username");
		String pass=getServletConfig().getServletContext().getInitParameter("password");
		
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out=response.getWriter();
//			out.println("Welcome to the Server");
			String user=request.getParameter("username");
			String pass=request.getParameter("pass");
			
			//get the servlet specific data --company name
			String company=getServletConfig().getInitParameter("companyname");
			pst=con.prepareStatement("select * from logintable where username=?");
			pst.setString(1, user);
			rs=pst.executeQuery();
			
			RequestDispatcher rd=null;
			if("java".equals(user) && ("1234".equals(pass)))
			{
				out.println("Welcome");
				//html to servlet communicate
//				rd=request.getRequestDispatcher("/RegistrationPage.html");
				
				//servlet to servlet communicate
				rd=request.getRequestDispatcher("/Data");
				rd.forward(request, response);
//				out.println("Welcome");
			}
			else
			{
				rd=request.getRequestDispatcher("/LoginPage.html");
//				rd.include(request, response);
//				out.println("Please try again....");
				response.sendRedirect("www.google.com");
			}
//			out.println(user);
//			out.println(pass);
//			if(rs.next())
//			{
//				out.println("Welcome");
//			}
//			else
//			{
//				out.println("Please try again....");
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void destroy()
	{
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
