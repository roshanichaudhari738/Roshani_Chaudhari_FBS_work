#include<stdio.h>
void startend(int,int);
void main(){
	int start=1,end=6;
	startend(start,end);
}

void startend(int a,int b)
{
	int sum=0;
	while(a<=b){
		sum=sum+a;
		a++;
	}
	printf("%d",sum);
}