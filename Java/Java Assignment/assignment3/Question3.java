package assignment3;

public class Question3 {

	public static void main(String[] args) {
		int no=4;
		int fact=1;
		int temp=no;
		while(no>0){
			fact=fact*no--;
		}
		System.out.printf("%d of factorial is %d",temp,fact);

	}

}
