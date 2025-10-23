package assignment4;

public class Question4 {

	public static void main(String[] args) {
		int no;
		int i,status;
		int start=1,end=100;
//		System.out.printf("Enter the Start number:");
//		scanf("%d",&start);
//		System.out.printf("Enter the End number:");
//		scanf("%d",&end);
		for(no=start;no<=end;no++)
		{
			i=2;
			status=0;
			while(i<=(no/2)){
				if(no%i==0){
					status=1;
					break;
				}
				i++;
			}
			
			if(status==0)
				System.out.printf("%d is a Prime\n",no);
		}

	}

}
