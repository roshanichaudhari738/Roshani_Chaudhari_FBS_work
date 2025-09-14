#include<stdio.h>
void area(int*,int*);
void perimeter(int*,int*);
void main()
{
	int length,breadth;
	printf("enter the length");
	scanf("%d%d",&length,&breadth);
	area(&length,&breadth);
	perimeter(&length,&breadth);
}

void area(int *length,int *breadth)
{
	
	int area=*length * *breadth;
	printf("area is %d ",area);	
}

void perimeter(int *length,int *breadth)
{
	int perimeter=2*(*length+*breadth);
	printf("perimeter is %d ",perimeter);
}