class Calculator
{
	//int a,b,c;
	void add(int a,int b)
	{
		System.out.println("Fun1");
		System.out.println(a+b);
	}
	
	void add(float a,float b)
	{
		System.out.println("Fun2");
		System.out.println(a+b);
	}

	void add(float a,int b)
	{
		System.out.println("Fun3");
		System.out.println(a+b);
	}

	void add(double a,double b)
	{
		System.out.println("Fun4");
		System.out.println(a+b);
	}
	
	//
	void sub(int a,int b)
	{
		System.out.println("Fun1");
		System.out.println(a-b);
	}
	
	void sub(float a,float b)
	{
		System.out.println("Fun2");
		System.out.println(a-b);
	}

	void sub(float a,int b)
	{
		System.out.println("Fun3");
		System.out.println(a-b);
	}

	void sub(double a,double b)
	{
		System.out.println("Fun4");
		System.out.println(a-b);
	}

	//
	void mul(int a,int b)
	{
		System.out.println("Fun1");
		System.out.println(a*b);
	}
	
	void mul(float a,float b)
	{
		System.out.println("Fun2");
		System.out.println(a*b);
	}

	void mul(float a,int b)
	{
		System.out.println("Fun3");
		System.out.println(a*b);
	}

	void mul(double a,double b)
	{
		System.out.println("Fun4");
		System.out.println(a*b);
	}

	//
	void div(int a,int b)
	{
		System.out.println("Fun1");
		System.out.println(a/b);
	}
	
	void div(float a,float b)
	{
		System.out.println("Fun2");
		System.out.println(a/b);
	}

	void div(float a,int b)
	{
		System.out.println("Fun3");
		System.out.println(a/b);
	}

	void div(double a,double b)
	{
		System.out.println("Fun4");
		System.out.println(a/b);
	}

}

class CalculatorTest
{
	public static void main(String[] a)
	{
		Calculator c=new Calculator();
		c.add(5,6);
		c.add(2.3f,6.5f);
		c.add(5.6f,5);
		c.add(5.3,6.3);

		System.out.println();
		c.sub(6,5);
		c.sub(6.7f,6.5f);
		c.sub(5.6f,3);
		c.sub(6.3,5.3);

		System.out.println();
		c.mul(6,5);
		c.mul(6.7f,6.5f);
		c.mul(5.6f,3);
		c.mul(6.3,5.3);

		System.out.println();
		c.div(6,5);
		c.div(6.7f,6.5f);
		c.div(5.6f,3);
		c.div(6.3,5.3);
		
				
	}
}
