#include<stdio.h>
void main(){
	int side1,side2,side3;
	printf("Enter the value of side1:");
	scanf("%d",&side1);
	printf("Enter the value of side2:");
	scanf("%d",&side2);
	printf("Enter the value of side3:");
	scanf("%d",&side3);
	
	if(side1==side2 && side2==side3){
		printf("Equilateral Triangle");
	}
	else if(side1==side2 && side2!=side3){
		printf("Isosceles Triangle");
	}
	else{
		printf("scalene Triangle");
	}
}