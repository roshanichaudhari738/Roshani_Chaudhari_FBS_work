package controller;

import model.Employee;

public class EmployeeController {
	
	EmployeeDAO dao = new EmployeeDAO();

	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		if(dao.addEmployee(e))
		{
			System.out.println("Add Successfull!!!");
		}
		else {
			System.out.println("Array is full!");
		}
	}
	

	public Employee searchEmployeeById(int ID) {
		// TODO Auto-generated method stub
		Employee e1=dao.searchEmployee(ID);
		if(e1!=null)
		{
			return e1;
		}
		return null;
	}


	public boolean updateEmployee(int iD, double salary) {
		// TODO Auto-generated method stub
		if(dao.updateEmployee(iD,salary))
		{
			return true;
		}
		return false;
	}


	public boolean deleteEmployee(int iD) {
		// TODO Auto-generated method stub
		if(dao.deleteEmployee(iD))
		{
			return true;
		}
		return false;
	}


	public void displayAll() {
		// TODO Auto-generated method stub
		dao.displayAll();
	}
	
	
}
