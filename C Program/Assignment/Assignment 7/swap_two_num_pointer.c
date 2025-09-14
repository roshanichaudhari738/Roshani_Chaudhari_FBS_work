#include<stdio.h>
void tempvar(int*,int*);
void main()
{
	int no1,no2;
	printf("Enter the 2 Number:");
	scanf("%d%d",&no1,&no2);
	tempvar(&no1,&no2);
}
void tempvar(int* a,int* b)
{
	int temp=*a;
	*a=*b;
	*b=temp;
	printf("Swapping of two number is a=%d of b=%d",*a,*b);
}