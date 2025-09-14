#include<stdio.h>
void fivetable(int*);
void main(){
	int n=5;
	fivetable(&n);
}

void fivetable(int* n)
{
	for(int i=1;i<=10;i++){
		int value=*n*i;
		printf("%d * %d = %d\n",*n,i,value);
	}
}