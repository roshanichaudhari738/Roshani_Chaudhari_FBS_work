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
		System.out.println("Complex is : "+this.real+" + "+this.imaginary+"i");
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
		Complex arr[] = new Complex[3];
		
		arr[0]=new Complex();
		arr[1]=new Complex(56,94);
		arr[2]=new Complex(5,3);

		for(int i=0;i<3;i++)
		{
				//System.out.println(arr[i]);
				arr[i].display();
		}
		
	}
}