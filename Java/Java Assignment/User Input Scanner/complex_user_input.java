import java.util.Scanner;
class Complex
{
	int real,imaginary;

	void setReal(int r)
	{
		this.real=r;
	}

	void setImaginary(int i)
	{
		this.imaginary=i;
	}

	int getReal()
	{
		return this.real;
	}

	int getImaginary()
	{
		return this.imaginary;
	}

	void display()
	{
		System.out.printf("Complex is : "+this.real+" + "+this.imaginary+"i");
	}

	Complex()
	{
		System.out.println("Default Constructor");
		this.real=0;
		this.imaginary=0;
	}
	
	Complex(int i,int r)
	{
		System.out.println("Parameter Constructor");
		this.real=i;
		this.imaginary=r;
	}
}
class ComplexTest
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Complex first num:");
		int a=sc.nextInt();
		System.out.println("Enter the Complex second num:");
		int b=sc.nextInt();		

		Complex c,i;
		c=new Complex(a,b);
		i=new Complex(a,b);

		//c.setReal(5);
		//c.setImaginary(9);
		c.display();

		System.out.println();		

		//i.setReal(10);
		//i.setImaginary(4);
		i.display();
		
	}
}