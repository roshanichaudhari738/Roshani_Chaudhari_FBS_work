#include<stdio.h>
void main()
{
	int units;
	int totalbill;
	printf("Enter the bill:");
	scanf("%d",&units);
	
	if(units>=1 && units<=50)
	{
		totalbill=units*30;
		printf("totalbill is %d",totalbill);
	}
	else if(units>=51 && units<=150)
	{
		totalbill=(50*30)+(units-50)*40;
		printf("totalbill is %d",totalbill);
	}
	else
	{
		totalbill=(50*30)+(50*40)+(units-150)*50;
		printf("totalbill is %f",totalbill);
	}
}