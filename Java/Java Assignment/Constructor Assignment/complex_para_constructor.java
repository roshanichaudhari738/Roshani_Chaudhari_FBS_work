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
		this.real=45;
		this.imaginary=10;
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
		Complex c,i;
		c=new Complex(56,52);
		i=new Complex(10,8);

		//c.setReal(5);
		//c.setImaginary(9);
		c.display();

		System.out.println();		

		//i.setReal(10);
		//i.setImaginary(4);
		i.display();
		
	}
}