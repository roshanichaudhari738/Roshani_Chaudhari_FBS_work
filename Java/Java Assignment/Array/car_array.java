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
		Car arr[] = new Car[3];
		
		arr[0]=new Car();
		arr[1]=new Car("Honda","Hyudai",3600000,"White",300);
		arr[2]=new Car("BMW","Merceidies",89000000,"Black",200);

		for(int i=0;i<arr.length;i++)
		{
				//System.out.println(arr[i]);
				arr[i].display();
		}
		
	}
}