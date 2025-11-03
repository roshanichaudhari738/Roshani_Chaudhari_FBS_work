class Complex
{
	int real,imaginary;

	void setReal(int r,int i)
	{
		this.real=r;
		this.imaginary=i;

	}
}
class ComplexTest
{
	public static void main(String[] args)
	{
		Complex c;
		c=new Complex();

		c.setReal(5,9);
		
		System.out.printf("Complex is : "+c.real+" + "+c.imaginary+"i");
	}
}