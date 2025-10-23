package assignment3;

public class Question9 {

	public static void main(String[] args) {
		int no=22345;
		int ld=no%10;
		while(no>10){
			no=no/10;
		}
		
		int sum=no+ld;
		System.out.printf("Sum of %d and %d is %d",no,ld,sum);

	}

}
