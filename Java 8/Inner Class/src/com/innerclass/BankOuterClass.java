package com.innerclass;

public class BankOuterClass {
	public void display() {
		Locker l=new Locker();
		System.out.println(l.cash);
	}
	
	
	
	class Locker{
		float cash=35.25f;
	}

	public static void main(String[] args) {
		BankOuterClass b=new BankOuterClass();
		b.display();

	}

}
