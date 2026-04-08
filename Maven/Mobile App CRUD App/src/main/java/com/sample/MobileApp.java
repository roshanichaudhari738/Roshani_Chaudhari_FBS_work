package com.sample;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MobileApp {

	public static void main(String[] args) {
			Configuration cfg=new Configuration();
			SessionFactory factory=cfg.configure("config.xml").buildSessionFactory();
			Session session= factory.openSession();
			Transaction t=session.beginTransaction();
			
			Scanner sc=new Scanner(System.in);
//			System.out.println("Enter the Brand");
//			String br=sc.nextLine();
//			System.out.println("Enter the Price");
//			float p=sc.nextFloat();
//			System.out.println("Enter the Model");
//			String m=sc.next();
//			sc.nextLine();
//			System.out.println("Enter the Color");
//			String c=sc.nextLine();
//			Mobile m1=new Mobile(br, p, m, c);
			
			//session.persist(m1); //insert the record
			
			//System.out.println("Record Added");
			
//			Mobile o=session.get(Mobile.class,2);
//			System.out.println(o);
			//update the record
//			System.out.println("Enter the change Model");
//			String m=sc.next();
//			o.setModel(m);
//			
//			sc.nextLine();
//			System.out.println("Enter the Color");
//			String c=sc.nextLine();
//			o.setColor(c);
//			
//			session.merge(o);
			
			//delete the record
//			session.remove(o);
//			System.out.println("Record Deleted");
			
			//HQL mein createQuery mein class name likhtey hai table name nahi
			Query query=session.createQuery("from Mobile",Mobile.class); //query interface is use to get multiple data
			List<Mobile> list=query.getResultList();
			
			for (Mobile mobile : list) {
				System.out.println(mobile);
			}
			
			//update or delete mai class name nahi likhna hai(Mobile.class)
			Query q=session.createQuery("Update Mobile set price= :value where brand='Apple'");
			System.out.println("Enter the Price");
			float p=sc.nextFloat();
			q.setParameter("value", p);
			int rows=q.executeUpdate();
			
			
			
			t.commit();
			System.out.println("Record update "+rows);
			
			session.close();
			factory.close();
			
	}

}
