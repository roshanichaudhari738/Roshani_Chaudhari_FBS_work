package com.util;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws Exception {
    	Connection con=null;
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection(
			    "jdbc:mysql://localhost:3306/jdbc_practise",
			    "root",
			    "Rosh@ni2002");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return con;
    }
}
