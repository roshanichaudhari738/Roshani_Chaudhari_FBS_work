package assignment2;

public class Question2 {

	public static void main(String[] args) {
		int side1=10,side2=20,side3=20;
//		printf("Enter the value of side1:");
//		scanf("%d",&side1);
//		printf("Enter the value of side2:");
//		scanf("%d",&side2);
//		printf("Enter the value of side3:");
//		scanf("%d",&side3);
		
		if(side1==side2 && side2==side3){
			System.out.printf("Equilateral Triangle");
		}
		else if(side1==side2 && side2!=side3){
			System.out.printf("Isosceles Triangle");
		}
		else{
			System.out.printf("scalene Triangle");
		}

	}

}
