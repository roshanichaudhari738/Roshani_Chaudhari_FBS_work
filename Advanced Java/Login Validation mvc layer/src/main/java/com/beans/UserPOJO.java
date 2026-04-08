package com.beans;

import java.util.Objects;

public class UserPOJO {	
	public int Id;
	public String userName;
	public String password;
	public String userEmail;
	
	public UserPOJO() {
		
	}

	public int getId() {
		return Id;
	}

	public void setId(int i) {
		Id = i;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return userEmail;
	}

	public void setEmail(String email) {
		this.userEmail = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(password, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPOJO other = (UserPOJO) obj;
		return Objects.equals(password, other.password) && Objects.equals(userName, other.userName);
	}
}
