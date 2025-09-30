#include<stdio.h>
int mystrlen(char*);
void main()
{
	char arr[]="hello";
	
	int res=mystrlen(arr);
	
	printf("length of string is %d",res);
}

int mystrlen(char *arr)
{
	int i=0;
	while(arr[i]!='\0')
	{
		i++;
	}
//	printf("%d",i);
	return i;
}