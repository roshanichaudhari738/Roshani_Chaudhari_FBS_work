package Day12;

abstract class Vehicle1
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
	 
	 abstract void accelerate();
	 
	 public String toString()
	 {
		 return "Vehicle ID :"+this.id+"\n"+"Vehicle Speed :"+this.speed+"\n"+"Vehicle Fuel :"+this.fuel+"\n"+"Vehicle Model :"+this.model+"\n"+
	 "Vehicle Price :"+this.price;
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

	
	public String toString()
	{
		return super.toString()+"Car NoofDoor :"+this.noofdoor;
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
	
	public String toString()
	{
		return super.toString()+"Bike NoofDoor :"+this.gear+"\n"+"Bike Milage :"+this.milage;
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
	
	public String toString()
	{
		return super.toString()+"Bus NoofDoor :"+this.capacity+"\n"+"Bus NoofDoor :"+this.routno+"\n"+"Bus Ticket Price :"+this.ticketprice;
	}
	
	
}

public class VehiclePoly {

	public static void main(String[] args) {
		
		Vehicle1 v1;
//		v1=new Vehicle1();
//		v1.accelerate();
		
		
		v1=new Car1(200,250,30,"BMW",520000,6);
		System.out.println(v1.toString());
		v1.accelerate();
		System.out.println("\n\n");
		
		v1=new Bike1(201,100,40,"Honda",100000,4,450);
		System.out.println(v1);
		v1.accelerate();
		System.out.println("\n\n");
		
		v1=new Bus1(202,200,80,"Double Door",200000,50,356,58.25);
		System.out.println(v1);
		v1.accelerate();
		System.out.println("\n\n");

	}

}
