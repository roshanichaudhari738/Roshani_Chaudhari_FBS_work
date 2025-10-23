package assignment2;

public class Question3 {

	public static void main(String[] args) {
		int no=75;
//		printf("Enter the Number:");
//		scanf("%d",&no);
		if(no % 3==0 && no % 5 == 0){
			System.out.printf("Divisible by both");
		}
		else if(no % 3 ==0)
		{
			System.out.printf("Divisible by 3 but not by 5");
	 	}
		else if(no % 5 == 0)
		{
			System.out.printf("Divisible by 5 but not by 3");
		}
		else{
			System.out.printf("Divisible by None");
		}

	}

}
