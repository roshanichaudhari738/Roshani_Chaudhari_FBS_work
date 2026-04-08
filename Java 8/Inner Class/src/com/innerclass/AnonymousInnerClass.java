package com.innerclass;

interface Servicing{
	public void repair();
}

abstract class CarCosmatics{
	String color;
	public abstract void changeColor(String c);
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		//Anonymous Inner Class originate from super interface
		Servicing s=new Servicing()
		{
			public void repair()
			{
				System.out.println("Servicing Car");
			}
		};s.repair();
		//; indicates continuation of the A.I.C
		
		//A.I.C originate from abstract super class
		CarCosmatics c=new CarCosmatics() 
		{
			public void changeColor(String color)
			{
				System.out.println("Change the color of the car "+color);
			}
		};c.changeColor("Red");
		
	}

}
