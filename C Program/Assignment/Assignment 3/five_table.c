#include<stdio.h>
void main(){
	int no=5,value;
	int i=1;
	while(i<=10){
		 value=no * i;
		printf("%d * %d = %d\n",no,i,value);
		i++;
	}
}