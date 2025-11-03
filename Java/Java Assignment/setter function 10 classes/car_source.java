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

	void setBrand(String b)
	{
		this.Brand=b;
	}

	void setPrice(double p)
	{
		this.Price=p;
	}

	void setColor(String x)
	{
		this.Color=x;
	}

	void setFuelcapacity(double x)
	{
		this.Fuelcapacity=x;
	}

}
class CarTest
{
	public static void main(String[] args)
	{
		Car c;
		c=new Car();

		c.setModel("Camry");
		c.setBrand("Toyota");
		c.setPrice(630000);
		c.setColor("Black");
		c.setFuelcapacity(100);

		System.out.printf("Model is : "+c.Model+"\nBrand is : "+c.Brand+"\nPrice is : "+c.Price+"\nColor : "+c.Color+"\nFuelcapacity : "+c.Fuelcapacity);
	}
}