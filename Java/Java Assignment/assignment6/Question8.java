package assignment6;

public class Question8 {

	public static void main(String[] args){
		int divide=divisible();
		if(divide==1)
			System.out.printf("Divisible by both");
		else if(divide==2)
			System.out.printf("Divisible by 3 but not by 5");
		else if(divide==3)
			System.out.printf("Divisible by 5 but not by 3");
		else
			System.out.printf("Divisible by None");
	}

	static int divisible()
	{
		int no=15;
//		System.out.System.out.printf("Enter the Number:");
//		scanf("%d",&no);
		if(no % 3==0 && no % 5 == 0){
			return 1;
		}
		else if(no % 3 ==0)
		{
			return 2;
	 	}
		else if(no % 5 == 0)
		{
			return 3;
		}
		else{
			return 5;
		}
		

	} 

}
