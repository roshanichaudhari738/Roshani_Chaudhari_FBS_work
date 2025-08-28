#include<stdio.h>
void main(){
	int no;
	int i,status;
	int start,end;
	printf("Enter the Start number:");
	scanf("%d",&start);
	printf("Enter the End number:");
	scanf("%d",&end);
	for(no=start;no<=end;no++)
	{
		i=2;
		status=0;
		while(i<=(no/2)){
			if(no%i==0){
				status=1;
				break;
			}
			i++;
		}
		
		if(status==0)
			printf("%d is a Prime\n",no);
	}
}