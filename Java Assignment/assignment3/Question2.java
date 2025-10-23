package assignment3;

public class Question2 {

	public static void main(String[] args) {
		int no=153;
		int sum=0,rem=0;
		int temp = no;
		int ams;
		while(no>0){
			rem=no%10;
			ams=rem*rem*rem;
			sum=sum + ams;
			no=no/10;
		}
		System.out.printf("value of sum is %d\n",sum);
		
		if(temp == sum){
			System.out.printf("%d is a Armstrong",temp);
		}else{
			System.out.printf("%d is not a Armstrong",temp);
		}

	}

}
