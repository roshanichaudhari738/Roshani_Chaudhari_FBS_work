package assignment6;

public class Question7 {

	public static void main(String[] args){
		int triangle=checktriangle();
		if(triangle==1)
			System.out.printf("Equilateral Triangle");
		else if(triangle==2)
			System.out.printf("Isosceles Triangle");
		else
			System.out.printf("scalene Triangle");
	}

	static char checktriangle()
	{
		int side1=20,side2=20,side3=20;
//		System.out.printf("Enter the value of side1:");
//		scanf("%d",&side1);
//		System.out.printf("Enter the value of side2:");
//		scanf("%d",&side2);
//		System.out.printf("Enter the value of side3:");
//		scanf("%d",&side3);
		
		if(side1==side2 && side2==side3){
			return 1;
		}
		else if(side1==side2 && side2!=side3){
			return 2;
		}
		else{
			return 3;
		}
	}

}
