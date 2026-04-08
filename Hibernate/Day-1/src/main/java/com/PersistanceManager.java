package com;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.Employee;

public class PersistanceManager {
	public static void main(String[] args) {
		Session session=null;
		SessionFactory factory;
		
		
			try {
				factory=new Configuration().configure().buildSessionFactory();
				session=factory.openSession();
				Transaction t=session.beginTransaction();
				int s1=Integer.parseInt(args[0]);
				
				//Insert
				
				//object to persist in the db table
//				Employee emp=new Employee(s1,args[1],
//						Integer.parseInt(args[2]));
//				
//				session.persist(emp); //db mai save hua obj
				t.commit();
				
				System.out.println("Record Added");
				
				//fetch the data
				
				//Employee emp1 =  session.get(Employee.class, new Integer(2)); //get the specific data //agr record nahi mila tho null deta hai
				Query query=session.createQuery("from Employee WHERE eName = 'Roshani'",Employee.class); //query interface is use to get multiple data
				List<Employee> list=query.getResultList();
				
				for (Employee e : list) {
					System.out.println(e.geteId()+" "+e.geteName()+" "+e.geteSal());
				}
//				System.out.println("ID: " + emp1.geteId());
//				System.out.println("Name: " + emp1.geteName());
//				System.out.println("Salary: " + emp1.geteSal());
				//System.out.println(emp1);
				session.close();
				factory.close();
			} catch (Exception  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
