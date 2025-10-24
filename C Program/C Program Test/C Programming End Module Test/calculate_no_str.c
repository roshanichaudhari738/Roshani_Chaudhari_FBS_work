#include<stdio.h>
void main()
{
	char str[20];
	printf("Enter the String:");
	scanf("%s",&str);
	int freq[256]={0};
	
	for(int i=0;str[i]!='\0';i++)
	{
		freq[str[i]]++;
	}
	
	for(int i=0;i<256;i++)
	{
		if(freq[i]!=0)
		{
			printf("Count of character is %c:%d\n",i,freq[i]);
		}
	}
}