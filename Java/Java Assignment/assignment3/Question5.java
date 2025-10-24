package assignment3;

public class Question5 {

	public static void main(String[] args) {
		int r1,rev=0;
		int no=14441;
		int temp=no;
		while(no>0)
		{
			r1=no%10;
			rev=rev*10+r1;
			no=no/10;
			
		}
		
		if(temp==rev){
			System.out.printf("%d is a Palindrome",temp);
		}
		else{
			System.out.printf("%d is not a Palindrome",temp);
		}

	}

}
