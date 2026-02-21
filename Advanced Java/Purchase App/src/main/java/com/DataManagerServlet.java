package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DataManagerServlet extends HttpServlet {
	
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
			String lap=request.getParameter("laptop");
			String phone=request.getParameter("phone");
			String lapprice=request.getParameter("laptopprice");
			String phoneprice=request.getParameter("phprice");
			
			HttpSession session=request.getSession(false);
			String user=(String)session.getAttribute("username");
			pst=con.prepareStatement("insert into cart (username,laptop,laptop_price,phone,phone_price) value(?,?,?,?,?)");
			pst.setString(1, user);
			pst.setString(2, lap);
			pst.setDouble(3, Double.parseDouble(lapprice));
			pst.setString(4, phone);
			pst.setDouble(5, Double.parseDouble(phoneprice));
			pst.executeUpdate();
			
			RequestDispatcher rd=request.getRequestDispatcher("/Servlet");
			rd.forward(request, response);
			
//			out.println(lap);
//			out.println(phone);
				
				System.out.println("Session ID: "+session.getId());
				session.setAttribute("laptop", lap);
				session.setAttribute("phone", phone);
//				String getlap=(String) session.getAttribute("laptop");
//				System.out.println(getlap);
				out.println("Welcome to the 2nd servlet.....");

				out.println("...Xyz");
				out.println("Username"+user);
				out.println("Laptop is"+session.getAttribute("laptop"));
				out.println("Phone is"+session.getAttribute("phone"));
				System.out.println("Username is :"+user);
				System.out.println("Laptop is :"+session.getAttribute("laptop"));
				System.out.println("Phone is :"+session.getAttribute("phone"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
