#include<stdio.h>
void storeArray(int*,int);
void searchArray(int*,int);
void main()
{
	int arr[10];
	storeArray(arr,10);
	searchArray(arr,10);

}

void storeArray(int *arr,int size)
{
	printf("Enter the Array element:");
	for(int i=0;i<size;i++)
	{
		scanf("%d",&arr[i]);
	}
}

void searchArray(int *arr,int size)
{
	int no,flag=0;
	printf("Enter the number yo want to search:");
	scanf("%d",&no);
	for(int i=0;i<size;i++)
	{
		if(arr[i]==no)
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		printf("found");
	}
	else{
		printf("Not Found");
	}
}