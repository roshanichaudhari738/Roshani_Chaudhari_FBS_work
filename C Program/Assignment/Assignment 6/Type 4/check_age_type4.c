#include<stdio.h>
int checkage(int);
void main(){
	int age;
	printf("Enter the Age:");
	scanf("%d",&age);
	int age_value=checkage(age);
	age_value=='c'?printf("Child"):age_value=='t'?printf("Teenager"):age_value=='a'?printf("Adult"):
	printf("Senior");
}

int checkage(int age)
{
	if(age<12){
//		printf("Child");
		return 'c';
	}
	else if(age>12 && age<19){
//		printf("Teenager");
		return 't';
	}
	else if(age>20 && age<50){
//		printf("Adult");
		return 'a';
	}
	else{
//		printf("Senior");
		return 's';
	}
}