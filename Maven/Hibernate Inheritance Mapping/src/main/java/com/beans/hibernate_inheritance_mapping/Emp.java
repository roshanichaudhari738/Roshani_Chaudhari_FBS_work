package com.beans.hibernate_inheritance_mapping;

import java.util.Objects;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "designation",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "emp")
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eId;
	private String eName;
	private double eSalary;
	
	public Emp() {
		super();
		
	}

	public Emp( String eName, double eSalary) {
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
		Emp other = (Emp) obj;
		return eId == other.eId && Objects.equals(eName, other.eName)
				&& Double.doubleToLongBits(eSalary) == Double.doubleToLongBits(other.eSalary);
	}

	@Override
	public String toString() {
		return "Emp [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
	
	
	
}

@Entity
@DiscriminatorValue(value = "Manager")
class Manager extends Emp
{
	private int insentive;
	
	public  Manager() {
		
	}

	public Manager( String eName, double eSalary,int insentive) {
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
		Manager other = (Manager) obj;
		return insentive == other.insentive;
	}

	@Override
	public String toString() {
		return "Manager [insentive=" + insentive + "]"+
		"Emp [eID="+geteId() + "eName="+geteName() +"eSalary="+geteSalary() +"]";
	}

	
	
	
}
