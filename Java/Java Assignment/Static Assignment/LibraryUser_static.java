class LibraryUser  
{
	String Name;
	int LastDate;
	static double finePerDay;

	static
	{
		finePerDay=45.3;
	}

	void setName(String x)
	{
		this.Name=x;
	}

	void setLastDate(int y)
	{
		this.LastDate=y;
	}
	
	static void setfinePerDay(double z) //static function
	{
		finePerDay=z;
	}

	String getName()
	{
		return this.Name;
	}

	int getLastDate()
	{
		return this.LastDate;
	}
	
	double getfinePerDay()
	{
		return this.finePerDay;
	}
	
	double calculateFine()
	{
		return this.LastDate * this.finePerDay;
	}

	LibraryUser()
	{
		System.out.println("Default constructor called");
		this.Name="Not Assigned";
		this.LastDate=0;
		//this.finePerDay=0.0;
	}

	LibraryUser(String name,int b)
	{
		System.out.println("Parameter constructor called");
		this.Name=name;
		this.LastDate=b;
		//this.finePerDay=fpd;
	}

	void display()
	{
		
		System.out.println("LibraryUser Detail :");
		System.out.println("LibraryUser Name is "+this.Name);
		System.out.println("LibraryUser Last Date is "+this.LastDate);
		System.out.println("Fine Per Day is "+this.finePerDay);
		System.out.println("LibraryUser Fine is "+calculateFine());
	}
}
class LibraryUserTest
{
	public static void main(String[] a)
	{
		LibraryUser  e1=new LibraryUser();
		LibraryUser  e2=new LibraryUser("Roshani",25);
		e2.display();
		e1.setName("Xyz");
		e1.setLastDate(7800);
		LibraryUser.setfinePerDay(45.6);//static function call
		e1.display();
		e2.display();
		
	}
}