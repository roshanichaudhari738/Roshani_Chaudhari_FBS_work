class Shape
{
	void area(double base,double height)
	{
		double area=0.5*base*height;
		System.out.println("Area is "+area);
	}

	void area(int length,int breadth)
	{
		int area=length*breadth;
		System.out.println("Area is "+area);
	}

	void area(double radius)
	{
		double area=3.14*radius*radius;
		System.out.println("Area is "+area);
	}
}
class ShapeTest
{
	public static void main(String[] a)
	{
		Shape s1=new Shape();
		s1.area(2.5,3.6);
		s1.area(2,3);
		s1.area(4.5);
	}
}