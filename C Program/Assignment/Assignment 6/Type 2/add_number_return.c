#include<stdio.h>
int add();
void main()
{
	int res; //calling function
	res=add();
	
}

int add()
{
	int num1,num2;
	printf("Enter 2 Numbers:");
	scanf("%d%d",&num1,&num2);
	int sum=num1+num2;
	printf("Sum is %d",sum);
	return sum;
}