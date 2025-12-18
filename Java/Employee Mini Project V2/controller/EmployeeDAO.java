package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import model.Admin;
import model.Employee;
import model.HR;
import model.Salesmanager;

public class EmployeeDAO {
	
	ArrayList<Employee> eArr=new ArrayList<Employee>();

	public EmployeeDAO()
	{
		eArr.add(new HR(101, "Rohit", 45000, 1000));
		eArr.add(new HR(102, "Riya", 85000, 2000));
		eArr.add(new Salesmanager(104, "Karan", 8500, 45, 5));
		eArr.add(new Salesmanager(106, "Shradha", 63000, 5, 50));
		eArr.add(new Admin(107, "Piya", 45200, 85));
		eArr.add(new Admin(108, "Roshani", 45200, 85));
	}

	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		return eArr.add(e);
	}

	public Employee searchEmployee(int iD) {
		// TODO Auto-generated method stub
		for(Employee e:eArr)
		{
			if(e.getID()==iD)
			{
				return e;
			}
				
		}
		return null;
	}

	public boolean updateEmployee(int iD, double salary) {
		// TODO Auto-generated method stub
		for(Employee e:eArr)
		{
			if(e.getID()==iD)
			{
				e.setSalary(salary);
				return true;
			}
				
		}
		return false;
	}

	public boolean deleteEmployee(int iD) {
		// TODO Auto-generated method stub
		for(int i=0;i<eArr.size();i++)
		{
			if(eArr.get(i).getID()==iD)
			{
				eArr.remove(i);
				return true;
			}
				
		}
		return false;
	}

	public void displayAll() {
	
			System.out.println(eArr);
				
	}
	
	public class MyIDComparator implements Comparator<Employee>
	{
		@Override
		public int compare(Employee o1, Employee o2) {
			
			return o1.getID() - o2.getID();
		}
	}
	
	public class MySalaryComparator implements Comparator<Employee>
	{
		public int compare(Employee o1, Employee o2) {
		
			return (int) (o1.getSalary()-o2.getSalary()); //casting double to int //Ascending sorting
		}
	}
	
	public class MyNameComparator implements Comparator<Employee>
	{
			@Override
			public int compare(Employee o1, Employee o2) {
			
				return o1.getName().compareTo(o2.getName());
			}
	}
	
	
	public void Employeesort(int choice)
	{
		switch (choice) {
		case 1: {
			MyIDComparator mid=new MyIDComparator();
			Collections.sort(eArr, mid);
			break;
		}
		case 2: {
			MySalaryComparator msc=new MySalaryComparator();
			Collections.sort(eArr, msc);
			break;
		}
		case 3: {
			MyNameComparator mnc=new MyNameComparator();
			Collections.sort(eArr, mnc);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
		System.out.println(eArr);
	}
	
}
