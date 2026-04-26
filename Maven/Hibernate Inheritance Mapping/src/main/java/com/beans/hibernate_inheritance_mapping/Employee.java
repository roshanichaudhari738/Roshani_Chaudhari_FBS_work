package com.beans.hibernate_inheritance_mapping;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eId;
	private String eName;
	private double eSalary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee( String eName, double eSalary) {
		super();
//		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public double geteSalary() {
		return eSalary;
	}

	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eId, eName, eSalary);
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
		return eId == other.eId && Objects.equals(eName, other.eName)
				&& Double.doubleToLongBits(eSalary) == Double.doubleToLongBits(other.eSalary);
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
}

@Entity
//@PrimaryKeyJoinColumn(name = "eId")
class Managers extends Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int insentive;
	
	public  Managers() {
		
	}

	public Managers( String eName, double eSalary,int insentive) {
		super(eName, eSalary);
		this.insentive = insentive;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInsentive() {
		return insentive;
	}

	public void setInsentive(int insentive) {
		this.insentive = insentive;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(insentive);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Managers other = (Managers) obj;
		return insentive == other.insentive;
	}

	@Override
	public String toString() {
		return "Manager [insentive=" + insentive + "]"+
		"Emp [eID="+geteId() + "eName="+geteName() +"eSalary="+geteSalary() +"]";
	}

	
	
	
}
