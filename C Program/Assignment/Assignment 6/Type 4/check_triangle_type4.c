#include<stdio.h>
int checktriangle(int,int,int);
void main(){
	int side1,side2,side3;
	printf("Enter the value of side1:");
	scanf("%d",&side1);
	printf("Enter the value of side2:");
	scanf("%d",&side2);
	printf("Enter the value of side3:");
	scanf("%d",&side3);
	int triangle=checktriangle(side1,side2,side3);
	triangle==1?printf("Equilateral Triangle"):triangle==2?printf("Isosceles Triangle"):
	printf("scalene Triangle");
}

int checktriangle(int a,int b,int c)
{
	
	return (a==b && b==c)?1:(a==b && b!=c)?2:3;
//	if(a==b && b==c){
//		return 1;
//	}
//	else if(a==b && b!=c){
//		return 2;
//	}
//	else{
//		return 3;
//	}
}