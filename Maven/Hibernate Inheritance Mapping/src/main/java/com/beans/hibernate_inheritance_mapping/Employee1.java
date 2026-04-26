package com.beans.hibernate_inheritance_mapping;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eId;
	
	private String eName;
	private double eSalary;
	
	public Employee1() {
		super();
	}

	public Employee1(String eName, double eSalary) {
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
		Employee1 other = (Employee1) obj;
		return eId == other.eId && Objects.equals(eName, other.eName)
				&& Double.doubleToLongBits(eSalary) == Double.doubleToLongBits(other.eSalary);
	}

	@Override
	public String toString() {
		return "Employee1 [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
}

@Entity
class Manager1 extends Employee1
{

	private int insentive;

	public Manager1() {
		super();
		
	}

	public Manager1(String eName, double eSalary,int insentive) {
		super(eName, eSalary);
		this.insentive = insentive;
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
		Manager1 other = (Manager1) obj;
		return insentive == other.insentive;
	}

	@Override
	public String toString() {
		return "Manager1 [insentive=" + insentive + "]";
	}
	
}
