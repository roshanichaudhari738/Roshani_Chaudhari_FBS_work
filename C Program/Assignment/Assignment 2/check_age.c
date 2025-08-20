#include<stdio.h>
void main(){
	int age;
	printf("Enter the Age:");
	scanf("%d",&age);
	if(age<12){
		printf("Child");
	}
	else if(age>12 && age<19){
		printf("Teenager");
	}
	else if(age>20 || age<50){
		printf("Adult");
	}
	else{
		printf("Senior");
	}
	
}