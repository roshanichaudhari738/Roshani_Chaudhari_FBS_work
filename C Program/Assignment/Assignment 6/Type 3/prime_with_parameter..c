#include<stdio.h>
void prime(int);
void main()
{
	int no;
	printf("Enter the Number:");
	scanf("%d",&no);
	prime(no);
}

void prime(int num)
{
	int flag=0;
	for(int i=2;i<num/2;i++)
	{
		if(num%i==0)
			flag=1;
			break;
	}
	
	
	if(flag==0)
		printf("Prime");
	else
		printf("not Prime");
}