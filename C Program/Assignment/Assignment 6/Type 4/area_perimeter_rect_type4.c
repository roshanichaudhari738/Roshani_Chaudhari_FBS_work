#include<stdio.h>
int area(int,int);
int perimeter(int,int);
void main()
{
	int length,breadth;
	printf("enter the length and breadth ");
	scanf("%d%d",&length,&breadth);
	int res=area(length,breadth);
	printf("result is %d\n",res);
	
	int res1=perimeter(length,breadth);
	printf("result is %d",res1);
}

int area(int length,int breadth)
{
	return length*breadth;
}

int perimeter(int length,int breadth)
{
	return 2*(length+breadth);
}