package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class PersistManager {

	public static void main(String[] args) {
		Session session=null;
		SessionFactory factory;
		
		
			try {
				factory=new Configuration().configure().buildSessionFactory();
				session=factory.openSession();
				Transaction t=session.beginTransaction();
				//int s1=Integer.parseInt(args[0]);
				
				//Insert
				
				//object to persist in the db table
				Employee emp=new Employee("Ram",96000,"ra006@gmail.com");
				//Project p=new Project(101, "E-Commerce System", "React.js", "Java");
//				
				session.persist(emp); //db mai save hua obj
				t.commit();
				
				System.out.println("Record Added");
				
				//fetch the data
				
//				Employee emp1 =  session.get(Employee.class,new Integer(5)); //get the specific data //agr record nahi mila tho null deta hai
//				System.out.println(emp1);
				Query query=session.createQuery("from Employee",Employee.class); //query interface is use to get multiple data
				List<Employee> list=query.getResultList();
				
				for (Employee e : list) {
					System.out.println(e.geteId()+" "+e.geteName()+" "+e.geteSal()+" "+e.getEmail());
				}
				
				Query query1=session.createQuery("from Project",Project.class); //query interface is use to get multiple data
				List<Project> list1=query1.getResultList();
				
				for (Project e : list1) {
					System.out.println(e.getProjectid()+" "+e.getProjectName()+" "+e.getFrontendTech()+" "+e.getBackendTech());
				}
////				System.out.println("ID: " + emp1.geteId());
////				System.out.println("Name: " + emp1.geteName());
////				System.out.println("Salary: " + emp1.geteSal());
//				//System.out.println(emp1);
//				session.close();
//				factory.close();
			} catch (Exception  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
