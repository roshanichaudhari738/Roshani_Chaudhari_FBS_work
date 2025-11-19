class Distance
{
	int km,m;

	void setK(int k)
	{
		this.km=k;
	}

	void setM(int m)
	{
		this.m=m;
	}

	int getK()
	{
		return this.km;
	}

	int getM()
	{
		return this.m;
	}

	void display()
	{
		System.out.printf("\nkilometer is : "+this.km+"\nmeter is : "+this.m);
	}

	Distance()
	{
		System.out.println("Default Constructor");
		this.km=45;
		this.m=10;
	}

	Distance(int k,int x)
	{
		System.out.println("Parameter Constructor");
		this.km=k;
		this.m=x;
	}	

}
class DistanceTest
{
	public static void main(String[] args)
	{
		Distance arr[]=new Distance[4];
		
		arr[0]=new Distance();
		arr[1]=new Distance(25,63);
		arr[2]=new Distance(80,4);
		arr[3]=new Distance(10,11);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i].display();
		}
		
	}
}