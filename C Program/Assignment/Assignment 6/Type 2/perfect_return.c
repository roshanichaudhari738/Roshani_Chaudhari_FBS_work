#include<stdio.h>
int perfect();
void main(){
	int val=perfect();
	val;
}

int perfect()
{
	int no=24;
	int i=1,sum=0;
	while(i<(no/2)){
		if(no%i==0){
			
		//printf("%d\n",no);
		
		sum=sum+i;
		printf("%d",sum);
			
		}
		i++;
	}
}