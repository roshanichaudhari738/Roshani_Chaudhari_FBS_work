package Day12;

abstract class Shape {
	String color;
	int Borderwidth;
	double Totalarea;

	Shape() {
		System.out.println("Shape Default Constructor Called");
		this.color = "Black";
		this.Borderwidth = 2;
	}

	Shape(String color, int borderwidth) {
		System.out.println("Shape Parameter Constructor Called");
		this.color = color;
		Borderwidth = borderwidth;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	int getBorderwidth() {
		return Borderwidth;
	}

	void setBorderwidth(int borderwidth) {
		Borderwidth = borderwidth;
	}
	
	abstract double calculateArea();

	
	public String toString()
	{
		return "Shape color: " + this.color+"\n"+"Border Width: " + this.Borderwidth;
	}
}

class rectangle extends Shape {
	int length;
	int width;

	rectangle() {
		super();
		System.out.println("Rectangle Default Constructor Called");
		this.length = 5;
		this.width = 7;
	}

	rectangle(String color, int borderwidth, int length, int width) {
		super(color, borderwidth);
		System.out.println("Rectangle Para Constructor Called");
		this.length = length;
		this.width = width;
	}

	int getLength() {
		return length;
	}

	void setLength(int length) {
		this.length = length;
	}

	int getWidth() {
		return width;
	}

	void setWidth(int width) {
		this.width = width;
	}
	
	double calculateArea()
	{
		 Totalarea= length * width;
		 return Totalarea;
	}
	
	public String toString()
	{
		return super.toString()+"Length: " + this.length+"\n"+"Width: " + this.width;
	}
	
	
}

class Circle extends Shape
{
	double pi;
	int radius;
	
	Circle() {
		super();
		System.out.println("Circle Default Constructor Called");
		pi = 3.14;
		radius = 0;
	}
	
	 Circle(String color, int borderwidth,double pi, int radius) {
		 super(color, borderwidth);
		 System.out.println("Circle Para Constructor Called");
		this.pi = pi;
		this.radius = radius;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	double calculateArea()
	{
		 Totalarea=3.14 * radius;
		return Totalarea;
	}
	
	
	public String toString()
	{
		return super.toString()+"Pi: " + this.pi+"\n"+"Radius" + this.radius;
	}
	
}

class Triangle extends Shape
{
	int base;
	int height;
	
	Triangle() {
		super();
		System.out.println("Triangle Default Constructor Called");
		base = 0;
		height = 0;
	}
	
	 Triangle(String color, int borderwidth,int base, int height) {
		 super(color, borderwidth);
		 System.out.println("Triangle Para Constructor Called");
		this.base = base;
		this.height = height;
	}
	 int getBase() {
		return base;
	}
	 void setBase(int base) {
		this.base = base;
	}
	 int getHeight() {
		return height;
	}
	 void setHeight(int height) {
		this.height = height;
	}
	 
	 double calculateArea()
		{
			 Totalarea=0.5 * base * height;
			 return Totalarea;
		}
	
	 
	 public String toString()
		{
			return super.toString()+"Base: " + this.base+"\n"+"Height" + this.height;
		}
}

class ShapeOverride {

	public static void main(String[] args) {
		Shape s1;
//		 s1 = new Shape();
//		s1.display();
//		s1.calculateArea();
//		System.out.println(s1.calculateArea());
//		System.out.println();
		
		 s1 = new rectangle("white", 1, 5, 6);
		 System.out.println(s1);
		System.out.println("Rectangle Area is "+s1.calculateArea());
		System.out.println();
		
		 s1 = new Circle("Black", 1, 3.14,10);
		 System.out.println(s1);
		System.out.println("Circle Area is "+s1.calculateArea());
		System.out.println();
		
		s1 = new Triangle("Purple", 1,10,4);
		System.out.println(s1);
		System.out.println("Triangle Area is "+s1.calculateArea());
		System.out.println();

	}

}
