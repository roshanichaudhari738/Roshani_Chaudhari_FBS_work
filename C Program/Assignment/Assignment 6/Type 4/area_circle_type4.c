#include<stdio.h>
int areacircle(int,float);
void main(){
	int r;
	float pi;
	r=5;
	pi=3.14;
	int res=areacircle(r,pi);
	printf("result is %d",res);
}

int areacircle(int a,float pi)
{
	return pi*a*a;
}