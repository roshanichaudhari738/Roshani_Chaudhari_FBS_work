package com;

import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "emp_table")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eId;
	
	@Column(nullable = false,length = 50)
	private String eName;
	
	private float eSal;
	
	@Column(unique = true)
	private String email; 
	
	@Transient
	private float ebouns;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pid")
	Project project;  //CONTAINED obj
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String eName, float eSal,String email) {
		super();
//		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
		this.email=email;
		this.project=new Project(102, "E-Commerce System", "React.js", "Java");
	}

	public Project getProject()
	{
		return project;
	}
	
	void setProject(Project project)
	{
		this.project=project;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public float geteSal() {
		return eSal;
	}

	public void seteSal(float eSal) {
		this.eSal = eSal;
	}

	public float getEbouns() {
		return ebouns;
	}

	public void setEbouns(float ebouns) {
		this.ebouns = ebouns;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(eId, eName, eSal);
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
				&& Float.floatToIntBits(eSal) == Float.floatToIntBits(other.eSal);
	}
	

}
