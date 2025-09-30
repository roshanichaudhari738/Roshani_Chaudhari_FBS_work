#include<stdio.h>
#include<string.h>
void main()
{
	char str[10]="Hello";
	char pqr[10]="World";
	
	strcat(str,pqr);
		
	printf("pqr is %s\n",str);
	
}