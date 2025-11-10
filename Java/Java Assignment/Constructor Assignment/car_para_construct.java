class Car
{
	String Model;
	String Brand;
	double Price;
	String Color;
	double Fuelcapacity;

	void setModel(String m)
	{
		this.Model=m;
	}

	String getModel()
	{
		return this.Model;
	}

	void setBrand(String b)
	{
		this.Brand=b;
	}

	String getBrand()
	{
		return this.Brand;
	}

	void setPrice(double p)
	{
		this.Price=p;
	}

	double getPrice()
	{
		return this.Price;
	}

	void setColor(String x)
	{
		this.Color=x;
	}

	String getColor()
	{
		return this.Color;
	}

	void setFuelcapacity(double x)
	{
		this.Fuelcapacity=x;
	}

	double getFuelcapacity()
	{
		return this.Fuelcapacity;
	}

	void display()
	{
		System.out.println("Car Model :"+this.Model);
		System.out.println("Car Brand :"+this.Brand);
		System.out.println("Car Price :"+this.Price);
		System.out.println("Car Color :"+this.Color);
		System.out.println("Car Fuelcapacity :"+this.Fuelcapacity);
	}

	Car()
	{
		System.out.println("Default Constructor");
		this.Model="Camry";
		this.Brand="Mercedies";
		this.Price=850000;
		this.Color="Black";
		this.Fuelcapacity=500;
	}

	Car(String m,String b,double p,String c,double f)
	{
		System.out.println("Parameter Constructor");
		this.Model=m;
		this.Brand=b;
		this.Price=p;
		this.Color=c;
		this.Fuelcapacity=f;
	}

}
class CarTest
{
	public static void main(String[] args)
	{
		Car c;
		c=new Car("Camry","BMW",960000,"Black",100);
		//a=new Car();

		//c.setModel("Camry");
		//c.setBrand("Toyota");
		//c.setPrice(630000);
		//c.setColor("Black");
		//c.setFuelcapacity(100);
		c.display();

		System.out.println();		

		//a.setModel("BMW");
		//a.setBrand("BMW");
		//a.setPrice(968523);
		//a.setColor("Black");
		//a.setFuelcapacity(456);
		//a.display();
		
	}
}