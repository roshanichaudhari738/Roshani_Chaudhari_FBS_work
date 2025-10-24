#include<stdio.h>
#include<stdlib.h>
void main()
{
	int* arr=(int*)malloc(20);
	int flag=0;
	printf("Enter the 5 element of array:");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}

	for(int i=0;i<5;i++)
	{
		int flag=0;
		
		for(int j=2;j<=arr[i]/2;j++)
		{
			if(arr[i]%j==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1)
		{
			printf("Not Prime no:\n");
			printf("%d\n",arr[i]);
		}
		else{
			printf("prime no is:\n");
			printf("%d\n",arr[i]);
		}
		
	}
	
	
}