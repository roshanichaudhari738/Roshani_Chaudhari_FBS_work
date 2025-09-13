#include<stdio.h>
int divisible(int);
void main(){
	int no;
	printf("Enter the Number:");
	scanf("%d",&no);
	int divide=divisible(no);
	divide==1?printf("Divisible by both"):divide==2?printf("Divisible by 3 but not by 5"):
	divide==3?printf("Divisible by 5 but not by 3"):printf("Divisible by None");
}

int divisible(int x)
{
	
	if(x % 3==0 && x % 5 == 0){
		return 1;
	}
	else if(x % 3 ==0)
	{
		return 2;
 	}
	else if(x % 5 == 0)
	{
		return 3;
	}
	else{
		return 5;
	}
	

} 