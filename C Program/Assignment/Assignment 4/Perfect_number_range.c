#include<stdio.h>
void main(){
	int no,sum,temp;
	int start,end;
	printf("Enter the Start number:");
	scanf("%d",&start);
	printf("Enter the End number:");
	scanf("%d",&end);
	for(no=start;no<=end;no++)
	{
		sum=0;
		
		for(int i=1;i<=(no/2);i++){
			if(no%i == 0)
			{
				sum=sum+i;
			}
		}
		
		
		if(no == sum){
			printf("%d is an Perfect\n",no);
		}
	}
}