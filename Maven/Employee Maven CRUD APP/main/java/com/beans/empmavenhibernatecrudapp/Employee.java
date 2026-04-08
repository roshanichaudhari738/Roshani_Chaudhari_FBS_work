package com.beans.empmavenhibernatecrudapp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_crud_table")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int eId;
	
	@Column(name = "empname",nullable = false,length = 50)
	String name;
	
	@Column(name = "empsalary",nullable = false,length = 50)
	double salary;
	
	public Employee() {
		
	}
	
	public Employee( String name, double salary) {
		super();
//		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
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
	public String toString() {
		// TODO Auto-generated method stub
		return "Id "+eId+"\n"+
				"Name "+name+"\n"+
				"Salary "+salary+
				"\n";
	}

}
