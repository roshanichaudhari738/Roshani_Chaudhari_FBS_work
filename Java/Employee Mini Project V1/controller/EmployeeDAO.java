package controller;

import model.Admin;
import model.Employee;
import model.HR;
import model.Salesmanager;

public class EmployeeDAO {

	static Employee[] eArr;
	static int count;
	
	static {
		count=0;
		eArr = new Employee[11];
		eArr[count++] = new HR(101, "Rohit", 45000, 1000);
		eArr[count++] = new HR(102, "Riya", 85000, 2000);
		eArr[count++] = new HR(103, "Siya", 36000, 1000);
		eArr[count++] = new Salesmanager(104, "Karan", 8500, 45, 5);
		eArr[count++] = new Salesmanager(105, "Parth", 78000, 15, 10);
		eArr[count++] = new Salesmanager(106, "Shradha", 63000, 5, 50);
		eArr[count++] = new Admin(107, "Piya", 45200, 85);
		eArr[count++] = new Admin(108, "Roshani", 45200, 85);
		eArr[count++] = new Admin(109, "", 45200, 85);
		eArr[count++] = new Admin(110, "Piya", 45200, 85);
		System.out.println("Total Emp "+count);
	}

	public boolean addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
		if(count<eArr.length)
		{
			eArr[count++] =e;
			return true;
		}
		else {
			return false;
		}
	}

	public Employee searchEmployee(int iD) {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++)
		{
			if(eArr[i].getID()==iD)
			{
				return eArr[i];
			}
				
		}
		return null;
	}

	public boolean updateEmployee(int iD, double salary) {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++)
		{
			if(eArr[i].getID()==iD)
			{
				eArr[i].setSalary(salary);
				return true;
			}
				
		}
		return false;
	}

	public boolean deleteEmployee(int iD) {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++)
		{
			if(eArr[i].getID()==iD)
			{
				for(int j=i;j<count;j++)
				{
					eArr[j] =eArr[j+1];
				}
				eArr[--count]=null;
				return true;
			}
				
		}
		return false;
	}

	public void displayAll() {
		// TODO Auto-generated method stub
		for(int i=0;i<count;i++)
		{
			System.out.println(eArr[i]);
				
		}
	}
	
}
