package com.aspect;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtility {
	private static SessionFactory factory;
	public static Session ProvideConnection()
	{
		//Connection con=null;
//		SessionFactory factory;
		Session session=null;
		try {
//			FileInputStream fis=new FileInputStream(".//Resources//dbconfig.properties");
//			Properties p=new Properties();
//			p.load(fis);
//			
//			String classname=p.getProperty("classname");
//			String url=p.getProperty("url");
//			String user=p.getProperty("username");
//			String pass=p.getProperty("password");
//			
//			Class.forName(classname);
//			con=DriverManager.getConnection(url,user,pass);
			
			//replace jdbc to hibernate
			
			factory=new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return session;
		
	}
}
