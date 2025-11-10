class ElectricityBill 
{
	String CustomerName;
	int Custno;
	int unit;
	static double rateperunit;

	static
	{
		rateperunit=45.3;
	}

	void setCustomerName(String x)
	{
		this.CustomerName=x;
	}

	void setCustno(int y)
	{
		this.Custno=y;
	}

	void setunit(int u)
	{
		this.unit=u;
	}
	
	static void setrateperunit(double z) //static function
	{
		rateperunit=z;
	}

	String getCustomerName()
	{
		return this.CustomerName;
	}

	int getCustno()
	{
		return this.Custno;
	}
	
	double getRatePerUnit()
	{
		return this.rateperunit;
	}
	
	double calculateBill()
	{
		return this.unit * this.rateperunit;
	}

	ElectricityBill()
	{
		System.out.println("Default constructor called");
		this.CustomerName="Not Assigned";
		this.Custno=0;
		this.unit=0;
		//this.rateperunit=0.0;
	}

	ElectricityBill(String name,int b,int u)
	{
		System.out.println("Parameter constructor called");
		this.CustomerName=name;
		this.Custno=b;
		this.unit=u;
		//this.rateperunit=rpu;
	}

	void display()
	{
		System.out.println("Electric Bill Detail :");
		System.out.println("Customer Name is "+this.CustomerName);
		System.out.println("Customer No is "+this.Custno);
		System.out.println("Unit is "+this.unit);
		System.out.println("Rate Per Unit is "+this.rateperunit);
		System.out.println("Customer Total Electric Bill is "+calculateBill());
	}
}
class ElectricityBillTest
{
	public static void main(String[] a)
	{
		ElectricityBill  e1=new ElectricityBill();
		ElectricityBill  e2=new ElectricityBill("Roshani",741258,600);
		e2.display();
		e1.setCustomerName("Xyz");
		e1.setCustno(7800);
		e1.setunit(500);
		ElectricityBill.setrateperunit(4.5);//static function call
		e1.display();
		e2.display();
		
	}
}