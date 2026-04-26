package com.beans.hibernate_inheritance_mapping;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpTest {

	public static void main(String[] args) {
//		Manager m=new Manager(1, "Roshani", 50000, 0);
//		System.out.println(m);
//		
//		Emp e=new Emp(2, "Riya", 6000);
//		System.out.println(e);
		
		Session session=null;
		SessionFactory factory;
		
		
		try {
			factory =new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			Transaction t=session.beginTransaction();
			
//			Manager m=new Manager("Roshani", 50000, 0);
//			
//			
//			
//			Emp e=new Emp("Riya", 6000);
			
			Manager1 m=new Manager1("Riya", 56000, 3000);
			Employee1 e=new Employee1("Shradha", 650000); 
			session.persist(e);
			session.persist(new Manager1("Roshani", 65000, 1000));
			session.persist(new Employee1("Shiv", 95000));
			session.persist(m);
			t.commit();
			
			
			session.close();
			factory.close();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
