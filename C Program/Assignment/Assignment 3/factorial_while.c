#include<stdio.h>
void main(){
	int no=4;
	int fact=1;
	int temp=no;
	while(no>0){
		fact=fact*no--;
	}
	printf("%d of factorial is %d",temp,fact);
}