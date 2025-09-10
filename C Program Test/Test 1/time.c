#include<stdio.h>
void main(){
	int hh=2,min=60,sec=60;
	int total_second;
	total_second = hh * 3600 + min * 60 + sec;
	printf("Total second is %d",total_second);
}