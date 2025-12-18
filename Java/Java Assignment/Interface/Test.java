package Practise;

interface Racer
{
	void toRace();
}

abstract class Vehicle
{
	abstract void ride();
	
	abstract void Travel();
	
	abstract void Brake();
	
}

interface Product
{
	void buys();
	void sell();
	
}

class SportsCar extends Vehicle  implements Racer,Product
{
	public void toRace()
	{
		System.out.println("To Race Fun");
	}
	
	public void buys()
	{
		System.out.println("Soprts Car Buy");
	}
	
	public void sell()
	{
		System.out.println("Soprts Car Sell");
	}
	
	void ride()
	{
		System.out.println("Ride");
	}
	
	void Travel()
	{
		System.out.println("Travel");
	}
	
	void Brake()
	{
		System.out.println("Brake");
	}
	
}

abstract class Animal
{
	abstract void eat();
	abstract void walk();
	
}

class Horse extends Animal implements Racer,Product
{
	public void toRace()
	{
		System.out.println("To Race Fun");
	}
	
	public void buys()
	{
		System.out.println("Horse Buy");
	}
	
	public void sell()
	{
		System.out.println("Horse Sell");
	}
	
	void eat()
	{
		System.out.println("Horse Eat");
	}
	
	void walk()
	{
		System.out.println("Horse Walk");
	}
	
}

class Lion extends Animal
{
	void eat()
	{
		System.out.println("Lion Eat");
	}
	
	void walk()
	{
		System.out.println("Lion Walk");
	}
}

public class Test {

	public static void main(String[] args) {
		
		SportsCar v1=new SportsCar();
		v1.ride();
		v1.Travel();
		v1.Brake();
		v1.sell();
		v1.toRace();
		v1.buys();
		System.out.println();
		
		Horse h1=new Horse();
		h1.buys();
		h1.toRace();
		h1.sell();
		h1.eat();
		h1.walk();
		System.out.println();
		
		Animal a1;
		a1=new Lion();
		a1.eat();
		a1.walk();
		System.out.println();

	}

}
