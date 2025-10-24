package assignment1;

public class Question4 {

	public static void main(String[] args) {
		int no=131;
		int r1,r2,r3,rev;
		int q1;
		
		r1=no % 10;
		q1=no / 10;
		r2=q1 % 10;
		r3=q1 / 10;
		rev=r1*100 + r2 * 10 + r3;
		
		if(no == rev){
			System.out.printf("%d is a Palindrome Number",no);
		} 
		else{
			System.out.printf("%d is not a Palindrome Number",no);
		}

	}

}
