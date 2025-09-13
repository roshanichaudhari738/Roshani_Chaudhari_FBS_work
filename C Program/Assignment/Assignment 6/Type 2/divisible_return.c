#include<stdio.h>
int divisible();
void main(){
	int divide=divisible();
	divide==1?printf("Divisible by both"):divide==2?printf("Divisible by 3 but not by 5"):
	divide==3?printf("Divisible by 5 but not by 3"):printf("Divisible by None");
}

int divisible()
{
	int no;
	printf("Enter the Number:");
	scanf("%d",&no);
	if(no % 3==0 && no % 5 == 0){
		return 1;
	}
	else if(no % 3 ==0)
	{
		return 2;
 	}
	else if(no % 5 == 0)
	{
		return 3;
	}
	else{
		return 5;
	}
	

} 