#include<stdio.h>
#include<string.h>
void main()
{
	char str[10]="Firstbit";
	char str1[10]="Solution";
	char* res=strncat(str,str1,4);
	printf("concate string is %c",res);
}