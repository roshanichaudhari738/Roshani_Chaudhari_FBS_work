package com.aspect;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionProvider {
	private static SessionFactory factory;
	public static Session ProvideConnection()
	{
		
		Session session=null;
		try {
			
			factory=new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return session;
		
	}
		
}
