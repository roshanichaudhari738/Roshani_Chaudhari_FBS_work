package assignment3;

public class Question6 {

	public static void main(String[] args) {
		int no=24;
		int i=1,sum=0;
		while(i<(no/2)){
			if(no%i==0){
				
			//System.out.printf("%d\n",no);
			
			sum=sum+i;
			System.out.printf("%d",sum);
				
			}
			i++;
		}

	}

}
