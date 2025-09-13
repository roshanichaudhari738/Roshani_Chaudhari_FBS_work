#include<stdio.h>
int leap();
void main(){
	int year=leap();
	year==1?printf("leap year"):printf("not leap year");
}

int leap()
{
	int year;
	printf("Enter the Year:");
	scanf("%d",&year);
	if(year % 4 ==0 && year % 100!=0 || year % 400==0){
		return 1;
	}
	else{
		return 0;
	}
}