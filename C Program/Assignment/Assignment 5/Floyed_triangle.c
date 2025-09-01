#include<stdio.h>
void main()
{
	char count='A';
	for(int i=1;i<=5;i++)
	{
		
			for(int j=1;j<=i;j++)
			{
				
					printf("%c ",count++);	
				
			}
			printf("\n");
		
	}
}