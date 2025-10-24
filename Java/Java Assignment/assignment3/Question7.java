package assignment3;

public class Question7 {

	public static void main(String[] args) {
		int no=15;
		int i=2,status=0;
		while(i<=(no/2)){
			if(no%i==0){
				status=1;
				break;
			}
			i++;
		}
		
		if(status==0)
			System.out.printf("Prime");
		else
			System.out.printf("Not Prime");

	}

}
