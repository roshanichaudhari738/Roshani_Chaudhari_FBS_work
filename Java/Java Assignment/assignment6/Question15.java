package assignment6;

public class Question15 {

	public static void main(String[] args) {
		int length=10,breadth=5;
		area(length,breadth);
		perimeter(length,breadth);

	}
	static void area(int length,int breadth)
	{
		int area=length*breadth;
		System.out.printf("area is %d ",area);	
	}

	static void perimeter(int length,int breadth)
	{
		int perimeter=2*(length+breadth);
		System.out.printf("perimeter is %d ",perimeter);
	}

}
