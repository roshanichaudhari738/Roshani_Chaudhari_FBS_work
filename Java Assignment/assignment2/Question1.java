package assignment2;

public class Question1 {

	public static void main(String[] args) {
		int age = 25;
		if(age<12){
			System.out.printf("Child");
		}
		else if(age>12 && age<19){
			System.out.printf("Teenager");
		}
		else if(age>20 || age<50){
			System.out.printf("Adult");
		}
		else{
			System.out.printf("Senior");
		}

	}

}
