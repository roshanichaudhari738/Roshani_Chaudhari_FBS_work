package Day12;

abstract class Vehicle
{
	abstract void applybreak();
}

class Car extends Vehicle
{
	void applybreak()
	{
		System.out.println("Drumb Applied");
	}
}

class Bus extends Vehicle
{
	void applybreak()
	{
		System.out.println("Air Applied");
	}
}

class Bike extends Vehicle
{
	void applybreak()
	{
		System.out.println("Disc Applied");
	}
}
public class Override {

	public static void main(String[] args) {
		Vehicle v1;
//		Vehicle v1 = new Vehicle();
//        v1.applybreak();

		v1 = new Car();
		v1.applybreak();

		v1 = new Bus();
		v1.applybreak();

		v1 = new Bike();
		v1.applybreak();

	}

}
