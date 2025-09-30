#include<stdio.h>
#include<string.h>
void main()
{
	char arr[]="hello World";
	char *res=strstr(arr,"World");
	//printf("%s",res);
	if(res!=NULL)
	{
		printf("Found");
	}
	else
	{
		printf("Not Found");
	}
}