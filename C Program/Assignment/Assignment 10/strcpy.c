#include<stdio.h>
#include<string.h>
void main()
{
	char arr[20]="Hello worlds!!!!";
	char arr1[20];
	char *res=strcpy(arr1,arr);
	printf("Concat string is %s",arr1);
}