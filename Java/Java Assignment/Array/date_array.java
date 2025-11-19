class Date
{
	int day,month,year;
	String dow;
	
	void setDay(int x)
	{
		this.day=x;
	}

	void setMonth(int m)
	{
		this.month=m;
	}

	void setYear(int y)
	{
		this.year=y;
	}

	void setDow(String d)
	{
		this.dow=d;
	}

	int getday()
	{
		return this.day;
	}

	int getmonth()
	{
		return this.month;
	}

	int getyear()
	{
		return this.year;
	}


	String getdow()
	{
		return this.dow;
	}

	void display()
	{
		System.out.println("Date day :"+this.day);
		System.out.println("Date Month :"+this.month);
		System.out.println("Date Year :"+this.year);
		System.out.println("Date Dow :"+this.dow);

	}

	Date()
	{
		System.out.println("Default Constructor");
		this.day=0;
		this.month=0;
		this.year=0;
		this.dow="not assigned";
	}
	
	Date(int l,int n,int c,String d)
	{
		System.out.println("Parameter Constructor");
		this.day=l;
		this.month=n;
		this.year=c;
		this.dow=d;
	}
	

}
//Admin class ends here
class Test
{
	public static void main(String[] args)
	{
		Date arr[] = new Date[3];
		Date a1;//Reference
		a1=new Date();

		arr[0]=new Date();
		arr[1]=new Date(7,11,2025,"Saturday");

		for(int i=0;i<3;i++)
		{
				System.out.println(arr[i]);
		}
		
		//a1.setId(111);
		//a1.setName("Aman");
		//a1.setSalary(100000);
		//a1.setAllowances(70000);
		a1.display();
		
		//a2.setId(112);
		//a2.setName("Navya");
		//a2.setSalary(4500);
		//a2.setAllowances(7356);
		//a2.display();
				
	}//main ends here
}//AdminTest ends here