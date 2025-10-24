package assignment6;

public class Question23 {

	public static void main(String[] args) {
		int age=30;
		int age_value=checkage(age);
		if(age_value==1)
			System.out.printf("Child");
		else if(age_value==2)
			System.out.printf("Teenager");
		else if(age_value==3)
			System.out.printf("Adult");
		else
			System.out.printf("Senior");

	}
	static int checkage(int age)
	{
		if(age<12){
//			printf("Child");
			return 1;
		}
		else if(age>12 && age<19){
//			printf("Teenager");
			return 2;
		}
		else if(age>20 && age<50){
//			printf("Adult");
			return 3;
		}
		else{
//			printf("Senior");
			return 4;
		}
	}

}
