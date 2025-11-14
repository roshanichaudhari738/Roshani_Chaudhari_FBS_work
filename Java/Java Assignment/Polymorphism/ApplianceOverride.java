package Day12;

class Appliance
{
	String Brand;
	String Model;
	int PowerUsage;
	double Price;
	
	 Appliance() {
			System.out.println("Appliance Default Constructor Called");
			Brand = "Not Assign";
			Model = "XYZ";
			PowerUsage = 00;
			Price = 00;
		}
	
	   Appliance(String brand, String model, int powerUsage, double price) {
		   System.out.println("Appliance Parameter Constructor Called");
		Brand = brand;
		Model = model;
		PowerUsage = powerUsage;
		Price = price;
	}
	double getPrice() {
		return Price;
	}
	 void setPrice(double price) {
		Price = price;
	}
	String getBrand() {
		return Brand;
	}
	 void setBrand(String brand) {
		Brand = brand;
	}
	 String getModel() {
		return Model;
	}
	 void setModel(String model) {
		Model = model;
	}
	 int getPowerUsage() {
		return PowerUsage;
	}
	 void setPowerUsage(int powerUsage) {
		PowerUsage = powerUsage;
	}
	 
	 void display()
	 {
		 System.out.println("Appliance Brand is "+this.Brand);
		 System.out.println("Appliance Model is "+this.Model);
		 System.out.println("Appliance PowerUsage is "+this.PowerUsage);
		 System.out.println("Appliance Price is "+this.Price);
	 }
}

class WashingMachine extends Appliance
{
	String WashMode;
	int LoadCapacity;
	double Timer;
	
	WashingMachine() {
		super();
		System.out.println("WashingMachine Default Constructor Called");
		WashMode ="Not";
		LoadCapacity = 0;
		Timer = 0;
	}

	 WashingMachine(String brand, String model, int powerUsage, double price,String washMode, int loadCapacity, double timer) {
		super( brand, model,powerUsage, price);
		System.out.println("WashingMachine Parameter Constructor Called");
		WashMode = washMode;
		LoadCapacity = loadCapacity;
		Timer = timer;
	}
	String getWashMode() {
		return WashMode;
	}
	 void setWashMode(String washMode) {
		WashMode = washMode;
	}
	 int getLoadCapacity() {
		return LoadCapacity;
	}
	 void setLoadCapacity(int loadCapacity) {
		LoadCapacity = loadCapacity;
	}
	 double getTimer() {
		return Timer;
	}
	 void setTimer(double timer) {
		Timer = timer;
	}
	 
	 void display()
	 {
		 super.display();
		 System.out.println("WashingMachine WashMode is "+this.WashMode);
		 System.out.println("WashingMachine LoadCapacity is "+this.LoadCapacity);
		 System.out.println("WashingMachine Timer is "+this.Timer);
	 }
}

class Refrigerator extends Appliance
{
	double Temperature;
	int FreezerCapacity;
	
	Refrigerator() {
		super();
		System.out.println("Refrigerator Default Constructor Called");
		Temperature =0.0;
		FreezerCapacity = 0;
	}
	
	  Refrigerator(String brand, String model, int powerUsage, double price,double temperature, int freezerCapacity) {
		super(brand, model,powerUsage, price);
		System.out.println("Refrigerator Para Constructor Called");
		Temperature = temperature;
		FreezerCapacity = freezerCapacity;
	}
	double getTemperature() {
		return Temperature;
	}
	 void setTemperature(double temperature) {
		Temperature = temperature;
	}
	 int getFreezerCapacity() {
		return FreezerCapacity;
	}
	 void setFreezerCapacity(int freezerCapacity) {
		FreezerCapacity = freezerCapacity;
	}
	 
	 void display()
	 {
		 super.display();
		 System.out.println("Refrigerator Temperature is "+this.Temperature);
		 System.out.println("Refrigerator FreezerCapacity is "+this.FreezerCapacity);
	 }
}

class Microwave extends Appliance
{
	double Timer;
	String Mode;
	
	Microwave() {
		super();
		System.out.println("Microwave Default Constructor Called");
		Timer = 0;
		Mode = "Not Assign";
	}
	
	  Microwave(String brand, String model, int powerUsage, double price,double timer, String mode) {
		super(brand, model,powerUsage, price);
		System.out.println("Microwave Para Constructor Called");
		Timer = timer;
		Mode = mode;
	}
	double getTimer() {
		return Timer;
	}
	 void setTimer(double timer) {
		Timer = timer;
	}
	 String getMode() {
		return Mode;
	}
	 void setMode(String mode) {
		Mode = mode;
	}
	 
	 void display()
	 {
		 super.display();
		 System.out.println("Microwave Timer is "+this.Timer);
		 System.out.println("Microwave Mode is "+this.Mode);
	 }
}

public class ApplianceOverride {

	public static void main(String[] args) {
		
		Appliance ap1;
		ap1=new Appliance();
		ap1.display();
		
		ap1=new WashingMachine();
		ap1.display();
		System.out.println("\n\n");
		
		ap1=new WashingMachine("LG","5Star",45,63000,"Dry",96,31);
		ap1.display();
		System.out.println("\n\n");
		
		ap1=new Refrigerator();
		ap1.display();
		System.out.println("\n\n");
		
		ap1=new Refrigerator("Whirpool","6Star",45,63000,100,52);
		ap1.display();
		System.out.println("\n\n");
		
		ap1=new Microwave();
		ap1.display();
		System.out.println("\n\n");
		
		ap1=new Microwave("Hair","3Star",45,63000,65,"Fry");
		ap1.display();
		System.out.println("\n\n");

	}

}
