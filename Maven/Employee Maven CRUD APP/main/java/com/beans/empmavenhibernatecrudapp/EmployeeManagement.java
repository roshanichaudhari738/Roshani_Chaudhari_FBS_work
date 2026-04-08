package com.beans.empmavenhibernatecrudapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.aspect.DBUtility;

public class EmployeeManagement {
	int empId;
	String empName;
	double salary;
	
	Transaction t;
	Session s;
	public EmployeeManagement() {
		System.out.println("EmployeeManagement");
		 s=DBUtility.ProvideConnection();
		 t=s.beginTransaction();
	}

	
	Scanner sc=new Scanner(System.in);
	public void addEmployee()
	{
//		System.out.println("Enter empid :");
//		empId=sc.nextInt();
		
		System.out.println("Enter emp Name :");
		empName=sc.next();
		System.out.println("Enter emp Salary :");
		salary=sc.nextDouble();
		
		try {
//			 s=DBUtility.ProvideConnection();
//			String insertQuery = "insert into employee values(?,?,?)";
//			
//			PreparedStatement psmt=con.prepareStatement(insertQuery); //SQL query execute karne ke liye
//			
//			psmt.setInt(1, empId); //set the value of placeholder
//			psmt.setString(2, empName);
//			psmt.setDouble(3, salary);
//			
//			int rows=psmt.executeUpdate(); //return affected rows
//			if(rows>0)
//			{
//				System.out.println("Data inserted");
//			}
//			DBUtility.resourceRelease(psmt, con);
			
			
			t=s.beginTransaction();
			Employee e=new Employee( empName, salary);
			s.persist(e);
			t.commit();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void searchEmp()
	{
		System.out.println("Enter the ID");
		empId=sc.nextInt();
		
		try {
//			Connection con=DBUtility.ProvideConnection();
//			String searchQuery="select * from employee where id=?";
//			PreparedStatement psmt=con.prepareStatement(searchQuery);
//			psmt.setInt(1, empId);
//			ResultSet rs=psmt.executeQuery();
//			
//			//int rows=psmt.executeUpdate();
//			if(rs.next())
//			{
//				empId=rs.getInt(1);
//				empName=rs.getString(2);
//				salary=rs.getDouble(3);
//				
//				Employee e=new Employee(empId, empName, salary);
//				System.out.println(e.toString());
//			}
//			DBUtility.resourceRelease(rs, psmt, con);
			
			//Search the Employee
			t=s.beginTransaction();
			Employee e1=s.get(Employee.class, empId);
			System.out.println(e1);
			t.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public void updateEmp()
	{
		System.out.println("Enter the Id :");
		empId=sc.nextInt();
		System.out.println("enter the Updated Name :");
		 empName=sc.next();
		
		System.out.println("enter the Updated Salary :");
		salary=sc.nextDouble();
		
		try {
//			Connection con=DBUtility.getSQLConnection();
//			String updateQuery="update employee set name=?,salary=? where id=?";
//			
//			PreparedStatement psmt=con.prepareStatement(updateQuery);
//			psmt.setString(1, empName);
//			psmt.setDouble(2, salary);
//			psmt.setInt(3, empId);
//			
//			int rows=psmt.executeUpdate();
//			System.out.println("Record are update !");
			t=s.beginTransaction();
			//HQL works with Java class field names, not database column names.
			Query q=s.createQuery("Update Employee set name= :name , salary= :sal where eId= :empid");
			q.setParameter("name", empName);
			q.setParameter("sal", salary);
			q.setParameter("empid", empId);
			int rows=q.executeUpdate();
			
			t.commit();
			System.out.println("Record Update "+rows);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void deleteEmp()
	{
		System.out.println("Enter the Id :");
		empId=sc.nextInt();
		
		try {
//			Connection con=DBUtility.getSQLConnection();
//			String deleteQuery="delete from employee where id=?";
//			
//			PreparedStatement psmt=con.prepareStatement(deleteQuery);
//			psmt.setInt(1, empId);
//			
//			int rows=psmt.executeUpdate(); 
//			System.out.println("Record are delete !");
			t=s.beginTransaction();
			Query q=s.createQuery("delete from Employee where eId= :empid");
			q.setParameter("empid", empId);
			int rows=q.executeUpdate();
			
			t.commit();
			System.out.println("Record delete "+rows);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void displayAll()
	{
		try {
//			Connection con=DBUtility.getSQLConnection();
//			String query="Select * from employee where salary";
//			PreparedStatement psmt=con.prepareStatement(query);
//			ResultSet re=psmt.executeQuery();//DB ka result store karne ke liye //executeQuery() ye result set ko return karta hai
//			
//			while (re.next()) //check karta hai ki kya next record available hai ya nahi // default position before first record
//			{
//				empId=re.getInt(1);
//				empName=re.getString(2);
//				salary=re.getDouble(3);
//				
//				Employee ref=new Employee(empId, empName, salary);
//				System.out.println(ref.toString());
//			}
//			DBUtility.resourceRelease(re,psmt,con);
			Session session=DBUtility.ProvideConnection();
			t=s.beginTransaction();
			Query q=session.createQuery("from Employee",Employee.class);
			List<Employee> list=q.getResultList();
			
			for(Employee e: list)
			{
				System.out.println(e);
			}
			
			t.commit();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
