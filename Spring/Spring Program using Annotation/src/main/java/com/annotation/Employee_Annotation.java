package com.annotation;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee_Annotation implements Service{
	
	//@Value() is annotation mai ek hi value dal saktey hai multiple value valid nahi hai
	@Value("101")
	private int empno;
	
	@Value("Roshani")
	private String name;
	
	@Value("56000")
	private double salary;
	
	@Autowired
	Date d;
	

	public Employee_Annotation() {
		super();
		
	}

	public Employee_Annotation(@Value("101") int empno,@Value("Riya") String name,@Value("3500") double salary,Date t) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.d=t;
	}
	
	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(@Value("101") int empno) {
		this.empno = empno;
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
		return Objects.hash(empno, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee_Annotation other = (Employee_Annotation) obj;
		return empno == other.empno && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee_Annotation [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public void info() {
		System.out.println("emp data is "+empno+ "All details are "+ toString()+" Joining date is "+d);
		
	}
	
	
}
