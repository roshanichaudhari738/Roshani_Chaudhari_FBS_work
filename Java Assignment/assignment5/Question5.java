package assignment5;

public class Question5 {

	public static void main(String[] args) {
		for(int i=4;i>=1;i--)
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
