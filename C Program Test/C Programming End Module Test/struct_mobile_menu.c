#include<stdio.h>
#include<stdlib.h>
typedef struct Mobile
{
	int mid;
	char mname[20];
	int price;
	char brand[50];
}Mobile;

void storedetails(Mobile*);
void displaydetails(Mobile*);
void main()
{
	Mobile mob;
	int ch;
	while(1)
	{
		printf("******* Mobile Details *********\n");
		printf("1.Accept Mobile details\n");
		printf("2.Display Mobile details\n");
		printf("3.exit\n");
		
		printf("Enter the choice:\n");
		scanf("%d",&ch);
		
		switch(ch)
		{
			case 1:
				storedetails(&mob);
			break;
			case 2:
				displaydetails(&mob);
			break;
			case 3:
				exit(0);
				printf("Exiting Program!!!");
			break;
			default:printf("Invalid choice!!!\n");
		}
	}
}

void storedetails(Mobile* mob)
{
	printf("Enter the Mobile Id:");
	scanf("%d",&mob->mid);
	printf("Enter the Mobile Name:");
	scanf("%s",mob->mname);
	printf("Enter the Mobile Price:");
	scanf("%d",&mob->price);
	printf("Enter the Mobile Brand:");
	scanf("%s",mob->brand);
}

void displaydetails(Mobile* mob)
{
	printf("Enter the Mobile Id:%d\n",mob->mid);
	printf("Enter the Mobile Name:%s\n",mob->mname);
	printf("Enter the Mobile Price:%d\n",mob->price);
	printf("Enter the Mobile Brand:%s\n",mob->brand);
}