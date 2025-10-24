#include<stdio.h>
#include<stdlib.h>
void main()
{
	int* arr=(int*)malloc(20);
//	int arr[5];
	printf("Enter the Array element:");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("print the alternate element:\n");
	for(int i=0;i<5;i++)
	{
		if(i%2==1)
		{
			printf("%d\n",arr[i]);
		}
	}
}