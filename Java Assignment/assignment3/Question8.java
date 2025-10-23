package assignment3;

public class Question8 {

	public static void main(String[] args) {
		int no=155;
		int rem,sum=0;
		int temp=no;
		while(no>0){
			rem=no%10;
			int fact=1;
			while(rem>0){
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact; //120+24=144+1=145
//			System.out.printf("sum is %d",sum);
			no=no/10;
		}
		
		if(temp==sum){
			System.out.printf("%d is a Strong Number",temp);
		}
		else{
			System.out.printf("%d is not a Strong Number",temp);
		}

	}

}
