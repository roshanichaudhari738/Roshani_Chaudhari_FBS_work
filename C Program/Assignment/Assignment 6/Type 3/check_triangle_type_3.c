#include<stdio.h>
void checktriangle(int,int,int);
void main(){
	int side1,side2,side3;
	printf("Enter the value of side1:");
	scanf("%d",&side1);
	printf("Enter the value of side2:");
	scanf("%d",&side2);
	printf("Enter the value of side3:");
	scanf("%d",&side3);
	checktriangle(side1,side2,side3);
	
}

void checktriangle(int a,int b,int c)
{
	if(a==b && b==c){
		printf("Equilateral Triangle");
	}
	else if(a==b && b!=c){
		printf("Isosceles Triangle");
	}
	else{
		printf("scalene Triangle");
	}
}