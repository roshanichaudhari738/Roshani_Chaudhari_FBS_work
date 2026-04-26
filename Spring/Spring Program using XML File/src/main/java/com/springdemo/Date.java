package com.springdemo;

import java.util.Objects;

public class Date {
	private int dd,mm,yyyy;

	
	
	public Date() {
	}

	public Date(int dd, int mm, int yyyy) {
		
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYyyy() {
		return yyyy;
	}

	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dd, mm, yyyy);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return dd == other.dd && mm == other.mm && yyyy == other.yyyy;
	}

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}
	
	
}
