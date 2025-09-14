#include<stdio.h>
void main()
{
	int arr[5];

	printf("Enter the 5 element of array:");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	int max=arr[0];
	int min=arr[0];
	for(int i=1;i<5;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	printf("Maximum number of array:%d",max);
	printf("Minimum number of array:%d",min);
}