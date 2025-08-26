#include<stdio.h>
void main(){
	int no=153;
	int sum=0,rem=0;
	int temp = no;
	int ams;
	while(no>0){
		rem=no%10;
		ams=rem*rem*rem;
		sum=sum + ams;
		no=no/10;
	}
	printf("value of sum is %d\n",sum);
	
	if(temp == sum){
		printf("%d is a Armstrong",temp);
	}else{
		printf("%d is not a Armstrong",temp);
	}
	
}