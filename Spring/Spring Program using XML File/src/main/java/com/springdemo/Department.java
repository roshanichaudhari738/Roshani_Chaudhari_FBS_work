package com.springdemo;

import java.util.Objects;

public class Department {
	private String departname;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String departname) {
		super();
		this.departname = departname;
	}

	public String getDepartname() {
		return departname;
	}

	public void setDepartname(String departname) {
		this.departname = departname;
	}

	@Override
	public int hashCode() {
		return Objects.hash(departname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(departname, other.departname);
	}

	@Override
	public String toString() {
		return "Department [departname=" + departname + "]";
	}
	
	
	
}
