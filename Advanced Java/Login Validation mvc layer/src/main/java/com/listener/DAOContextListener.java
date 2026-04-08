package com.listener;

import java.sql.Connection;
import java.sql.DriverManager;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class DAOContextListener implements ServletContextListener {

    Connection con;

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        ServletContext c = sce.getServletContext();

        try {

            Class.forName(c.getInitParameter("driver"));

            con = DriverManager.getConnection(
                    c.getInitParameter("url"),
                    c.getInitParameter("username"),
                    c.getInitParameter("password"));

            c.setAttribute("connection", con);

            System.out.println("Database Connected : " + con);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        try {
            con.close();
            System.out.println("Connection Closed");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}