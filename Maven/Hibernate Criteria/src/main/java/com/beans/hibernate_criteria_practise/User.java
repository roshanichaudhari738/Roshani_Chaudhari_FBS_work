package com.beans.hibernate_criteria_practise;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_record")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	
	@Column(name = "pass",nullable = false,length = 50)
	private String pass;
	private String securityQue;
	private String securityAns;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String pass, String securityQue, String securityAns) {
		super();
		this.name = name;
		this.pass = pass;
		this.securityQue = securityQue;
		this.securityAns = securityAns;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getSecurityQue() {
		return securityQue;
	}

	public void setSecurityQue(String securityQue) {
		this.securityQue = securityQue;
	}

	public String getSecurityAns() {
		return securityAns;
	}

	public void setSecurityAns(String securityAns) {
		this.securityAns = securityAns;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, pass, securityAns, securityQue);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(name, other.name) && Objects.equals(pass, other.pass)
				&& Objects.equals(securityAns, other.securityAns) && Objects.equals(securityQue, other.securityQue);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", pass=" + pass + ", securityQue=" + securityQue + ", securityAns=" + securityAns
				+ "]";
	}
	
	

}
