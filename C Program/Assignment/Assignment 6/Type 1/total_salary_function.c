#include<stdio.h>
void salarytotal();
void main(){
	double basic=6000;
	double da,ta,hra;
	if(basic<=5000)
	{
		salarytotal();
	}
	else{
		da=basic*0.15;
		ta=basic*0.25;
		hra=basic*0.30;
	}
	float totalsal=basic+da+ta+hra;
	printf("Total Salary is %f",totalsal);
}

void salarytotal()
{
	double basic=6000;
	double da,ta,hra;
	da=basic*0.10;
	ta=basic*0.20;
	hra=basic*0.25;
}