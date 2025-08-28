#include<stdio.h>
void main(){
	int no;
	int sum,rem,count;
	int temp;
	int originalno;
	int start,end;
	printf("Enter the Start number:");
	scanf("%d",&start);
	printf("Enter the End number:");
	scanf("%d",&end);
	for(no=start;no<=end;no++)
	{
		sum=0;
		count=0;
		temp = no;
		originalno = no;
		while(temp>0){  //calculate count
			count++;
			temp=temp/10;
		}
		
		temp=no;
		//calculate Amstrong
		while(temp>0){
			rem=temp%10;
			int power =1;
			for(int i=1;i<=count;i++)
			{
				power=power*rem;
			}
				
			sum=sum + power;
			temp=temp/10;
	 	}
 	

	
		if(originalno == sum){
			printf("%d is a Armstrong\n",originalno);
		}
	}
}