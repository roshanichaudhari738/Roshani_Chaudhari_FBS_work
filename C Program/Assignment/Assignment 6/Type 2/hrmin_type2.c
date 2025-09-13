//type2:w/o parameter,w return type
#include<stdio.h>
int hrmin();
int hr();
void main(){
	int time=hrmin();
	printf("%d",time);
	int hrtime=hr();
	printf("%d",hrtime);
}

int min()
{
	int min=500;
	int hr,rmin;
	hr=min/60;
	rmin=min%60;
	printf("Total hour and min of %d is %d hr , %dmin",min,hr,rmin);
	return rmin;
}

int hr()
{
	int min=500;
	int hr;
	hr=min/60;
	printf("Total hour and min of %d is %d hr ",min,hr);
	return hr;
}