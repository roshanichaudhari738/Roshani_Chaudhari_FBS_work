import  java.util.Scanner;
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Km:");
		int a=sc.nextInt();
		System.out.println("Enter the M:");
		int b=sc.nextInt();
		Distance d,f;
		d=new Distance(a,b);
		f=new Distance(a,b);

		//d.setK(5);
		//d.setM(10);
		d.display();

		System.out.println();	
		
		//f.setK(15);
		//f.setM(69);
		f.display();
		
		
	}
}