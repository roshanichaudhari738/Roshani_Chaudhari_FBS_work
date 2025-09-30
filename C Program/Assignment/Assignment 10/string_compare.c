#include<stdio.h>
#include<string.h>
void main()
{
	char str[10]="Hello";
	char pqr[10]="Hello";
	
	int res=strcmp(str,pqr);
	if(res==0)
	{
		printf("Str is same");
	}
	else{
		printf("Str is not same");
	}
}