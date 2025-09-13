#include<stdio.h>
char checktriangle();
void main(){
	int triangle=checktriangle();
	triangle=='e'?printf("Equilateral Triangle"):triangle=='i'?printf("Isosceles Triangle"):
	printf("scalene Triangle");
}

char checktriangle()
{
	int side1,side2,side3;
	printf("Enter the value of side1:");
	scanf("%d",&side1);
	printf("Enter the value of side2:");
	scanf("%d",&side2);
	printf("Enter the value of side3:");
	scanf("%d",&side3);
	
	if(side1==side2 && side2==side3){
		return 'e';
	}
	else if(side1==side2 && side2!=side3){
		return 'i';
	}
	else{
		return 's';
	}
}