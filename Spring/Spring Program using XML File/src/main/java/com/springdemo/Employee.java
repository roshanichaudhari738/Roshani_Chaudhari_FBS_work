package com.springdemo;

import java.util.List;
import java.util.Objects;

public class Employee implements Services {
	private int no;
	private String name;
	private double salary;
	private Date d;
	private List<Department> departname;
	
	public Employee()
	{
		
	}
	
	public Employee(int no, String name, double salary,Date t,List<Department> d) {
		super();
		this.no = no;
		this.name = name;
		this.salary = salary;
		this.d=t;
		this.departname=d;
	}


	public List<Department> getDepartname() {
		return departname;
	}

	public void setDepartname(List<Department> departname) {
		this.departname = departname;
	}

	public Date getD() {
		return d;
	}


	public void setD(Date d) {
		this.d = d;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public int hashCode() {
		return Objects.hash(name, no, salary);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(name, other.name) && no == other.no
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}


	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", salary=" + salary + "]";
	}


	@Override
	public void info() {
		System.out.println("emp load in data"+ toString() + "Date is "+ d + "Department is "+ departname);
		
	}
	
	
}
