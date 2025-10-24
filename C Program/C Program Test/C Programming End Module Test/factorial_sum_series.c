#include<stdio.h>
int factorial(int);
void main()
{
	int no,sum=0;
	printf("Enter the Number:");
	scanf("%d",&no);
	
	for(int i=1;i<=no;i++)
	{
		sum=sum+factorial(i);
	}
	
	printf("1!+2!+___+%d!=%d",no,sum);
}

int factorial(int no)
{
	int fact=1;

	for(int i=1;i<=no;i++)
	{
		fact=fact*i;
	}
	return fact;
}
