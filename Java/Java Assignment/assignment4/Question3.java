package assignment4;

public class Question3 {

	public static void main(String[] args) {
		int no;
		int start=100,end=300;
//		System.out.printf("Enter the Start number:");
//		scanf("%d",&start);
//		System.out.printf("Enter the End number:");
//		scanf("%d",&end);
		for(no=start;no<=end;no++)
		{
			int sum=0;
			
			for(int i=1;i<=(no/2);i++){
				if(no%i == 0)
				{
					sum=sum+i;
				}
			}
			
			
			if(no == sum){
				System.out.printf("%d is an Perfect\n",no);
			}
		}

	}

}
