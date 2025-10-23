package assignment5;

public class Question1 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=4-i;k++)
			{
				System.out.printf(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{				
					
				System.out.printf("*");	
					
			}
			System.out.printf("\n");
			
		}
		//inverted pyramid
		for(int i=3;i>=1;i--)
		{
			for(int k=1;k<=4-i;k++)
			{
				System.out.printf(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{				
					
				System.out.printf("*");	
					
			}
			System.out.printf("\n");
			
		}

	}

}
