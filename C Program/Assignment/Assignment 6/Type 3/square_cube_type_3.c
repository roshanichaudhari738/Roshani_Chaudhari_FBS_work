#include<stdio.h>
void square(int);
void cube(int);
void main(){
	int no1;
	printf("Enter the 1st Number:");
	scanf("%d",&no1);
	square(no1);
	cube(no1);
}

void square(int no1)
{
	int sq = no1 * no1;
	printf("Square of %d is %d \n",no1,sq);
	
}

void cube(int no1)
{
	int cube = no1 * no1 * no1;
	printf("Cube of %d is %d",no1,cube);
}