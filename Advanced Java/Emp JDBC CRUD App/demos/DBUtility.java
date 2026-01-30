package com.ash.demos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {
	private static String cname;
	private static String url;
	private static String uname;
	private static String pass;
	
	 public static void databaseConfig()
	{
		try {
			FileInputStream fis=new FileInputStream(".//resources/database.properties");
			Properties prop=new Properties(); //Properties object banaya jo file ka data read karega
			prop.load(fis); //File ka data memory me load kar diya
			
			//read the data by database.properties file
			 cname=prop.getProperty("classname");
			 url=prop.getProperty("url");
			 uname=prop.getProperty("username");
			 pass=prop.getProperty("password");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getSQLConnection()
	{
		databaseConfig();
		try {
			Class.forName(cname); //load the jdbc driver
			Connection con=DriverManager.getConnection(url,uname,pass);//DriverManager->Driver ke through connection lene ke liye //Database se connection establish karta hai
			return con;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void resourceRelease(ResultSet re, PreparedStatement psmt, Connection con) {
		// TODO Auto-generated method stub
		try {
			re.close();
			psmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void resourceRelease(PreparedStatement psmt, Connection con) {
		// TODO Auto-generated method stub
		try {
			psmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
