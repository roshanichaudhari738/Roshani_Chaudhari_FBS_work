package controller;

import model.Employee;

public class EmployeeController {
	
	EmployeeDAO dao = new EmployeeDAO();

	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
//		if(dao.addEmployee(e))
//		{
//			System.out.println("Add Successfull!!!");
//		}
//		else {
//			System.out.println("Array is full!");
//		}
		try {
			dao.addEmployee(e);
		} catch (EmployeeDuplicateID e2) {
			// TODO: handle exception
			System.out.println(e2);
		}
		catch (ValidSalaryException e1) {
			// TODO: handle exception
			System.out.println(e1);
		}
		catch (StringValidateException e3) {
			// TODO: handle exception
			System.out.println(e3);
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
	
	public void sortEmployee(int choice)
	{
		dao.Employeesort(choice);
	}


	public boolean updateEmployeeName(int iD, String name) {
		// TODO Auto-generated method stub
		if(dao.updateEmployeeName(iD,name))
		{
			return true;
		}
		return false;
	}
	
}
