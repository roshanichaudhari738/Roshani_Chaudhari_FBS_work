package Day12;

class Vehicle
{
	void applybreak()
	{
		System.out.println("Break Applied");
	}
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
		Vehicle v1 = new Vehicle();
        v1.applybreak();

        Vehicle v2 = new Car();
        v2.applybreak();

        Vehicle v3 = new Bus();
        v3.applybreak();

        Vehicle v4 = new Bike();
        v4.applybreak();

	}

}
