package Day12;

class Vehicle1
{
	int id;
	int speed;
	int fuel;
	String model;
	double price;
	
	Vehicle1()
	{
		System.out.println("Vehicle Default Constructor Called");
		id=10;
		 speed=100;
		 fuel=45;
		 model="not assign";
		 price=45000;
	}
	
	  Vehicle1(int id,int speed, int fuel, String model, double price) {
		 System.out.println("Vehicle Parameter Constructor Called");
		 this.id=id;
		this.speed = speed;
		this.fuel = fuel;
		this.model = model;
		this.price = price;
	}

	  int getId() {
			return id;
		}
	  
	  void setId(int id) {
			this.id = id;
		}
	  
	int getSpeed() {
		return speed;
	}
	 void setSpeed(int speed) {
		this.speed = speed;
	}
	 int getFuel() {
		return fuel;
	}
	 void setFuel(int fuel) {
		this.fuel = fuel;
	}
	 String getModel() {
		return model;
	}
	 void setModel(String model) {
		this.model = model;
	}
	 double getPrice() {
		return price;
	}
	 void setPrice(double price) {
		this.price = price;
	}
	 
	 void accelerate()
	 {
		 System.out.println("Vehicle Accelerate");
	 }
	
	 void display()
		{
			System.out.println("Vehicle ID :"+this.id);
			System.out.println("Vehicle Speed :"+this.speed);
			System.out.println("Vehicle Fuel :"+this.fuel);
			System.out.println("Vehicle Model :"+this.model);
			System.out.println("Vehicle Price :"+this.price);
		}
	
}

class Car1 extends Vehicle1
{
	
	int noofdoor;
	
	Car1()
	{
		super();
		System.out.println("Car Default Constructor Called");
		
		 noofdoor=4;
	}
	
	 Car1(int id, int speed, int fuel, String model, double price, int noofdoor) {
		 super(id,speed,fuel,model,price);
		System.out.println("Car Parameter Constructor Called");
		
		this.noofdoor = noofdoor;
	}

	
	 int getNoofdoor() {
		return noofdoor;
	}
	 void setNoofdoor(int noofdoor) {
		this.noofdoor = noofdoor;
	}
	 
	 void accelerate()
	 {
		 System.out.println("Car Accelerate");
	 }
	
	void display()
	{
		super.display();;
		System.out.println("Car NoofDoor :"+this.noofdoor);
	}
	
}

class Bike1 extends Vehicle1
{
	
	int gear;
	double milage;
	
	Bike1()
	{
		super();
		System.out.println("Bike Default Constructor Called");
		
		 gear=4;
		 milage=120;
	}
	
	 Bike1(int id, int speed, int fuel, String model, double price, int gear, double milage) {
		 super(id,speed,fuel,model,price);
		System.out.println("Bike Default Constructor Called");
		
		this.gear = gear;
		this.milage = milage;
	}

	
	 int getGear() {
		return gear;
	}
	 void setGear(int gear) {
		this.gear = gear;
	}
	 double getMilage() {
		return milage;
	}
	 void setMilage(double milage) {
		this.milage = milage;
	}
	 
	 void accelerate()
	 {
		 System.out.println("Bike Accelerate");
	 }
	
	void display()
	{
		super.display();
		System.out.println("Bike NoofDoor :"+this.gear);
		System.out.println("Bike Milage :"+this.milage);
	}
}

class Bus1 extends Vehicle1
{
	
	long capacity;
	int routno;
	double ticketprice;
	
	Bus1()
	{
		super();
		System.out.println("Bus Default Constructor Called");
		
		 capacity=50;
		 routno=200;
		 ticketprice=52.36;
	}
	
	 Bus1(int id, int speed, int fuel, String model, double price, long capacity, int routno, double ticketprice) {
		 super(id,speed,fuel,model,price);
		System.out.println("Bus Parameter Constructor Called");
		
		this.capacity = capacity;
		this.routno = routno;
		this.ticketprice = ticketprice;
	}

	 
	 long getCapacity() {
		return capacity;
	}
	 void setCapacity(long capacity) {
		this.capacity = capacity;
	}
	 int getRoutno() {
		return routno;
	}
	 void setRoutno(int routno) {
		this.routno = routno;
	}
	 double getTicketprice() {
		return ticketprice;
	}
	 void setTicketprice(double ticketprice) {
		this.ticketprice = ticketprice;
	}
	 
	 void accelerate()
	 {
		 System.out.println("Bus Accelerate");
	 }
	
	void display()
	{
		super.display();
		System.out.println("Bus NoofDoor :"+this.capacity);
		System.out.println("Bus NoofDoor :"+this.routno);
		System.out.println("Bus Ticket Price :"+this.ticketprice);
	}
}

public class VehiclePoly {

	public static void main(String[] args) {
		
		Vehicle1 v1;
		v1=new Vehicle1();
		v1.accelerate();
		
		
		v1=new Car1(200,250,30,"BMW",520000,6);
		v1.display();
		v1.accelerate();
		System.out.println("\n\n");
		
		v1=new Bike1(201,100,40,"Honda",100000,4,450);
		v1.display();
		v1.accelerate();
		System.out.println("\n\n");
		
		v1=new Bus1(202,200,80,"Double Door",200000,50,356,58.25);
		v1.display();
		v1.accelerate();
		System.out.println("\n\n");

	}

}
