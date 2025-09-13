#include<stdio.h>
int square(int);
int cube(int);
void main(){
	int no1;
	printf("Enter the 1st Number:");
	scanf("%d",&no1);
	int val=square(no1);
	printf("square is %d\n",val);
	int res=cube(no1);
	printf("cube is %d",res);
}

int square(int no1)
{
	return no1 * no1;
	//printf("Square of %d is %d \n",no1,sq);
	
}

int cube(int no1)
{
	return no1 * no1 * no1;
//	printf("Cube of %d is %d",no1,cube);
}