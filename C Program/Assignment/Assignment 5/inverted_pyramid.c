#include<stdio.h>
void main()
{
	for(int i=4;i>=1;i--)
	{
		for(int k=1;k<=4-i;k++)
		{
			printf(" ");
		}
		for(int j=1;j<=2*i-1;j++)
		{				
				
			printf("*");	
				
		}
		printf("\n");
		
	}
}