//Strong Number
#include<stdio.h>
void main(){
	int no=145;
	int rem,sum;
	int temp;
	int start,end;
	printf("Enter the Start number:");
	scanf("%d",&start);
	printf("Enter the End number:");
	scanf("%d",&end);
	for(no=start;no<=end;no++)
	{
		sum=0;
		temp=no;
		while(temp>0){
			rem=temp%10;
			int fact;
			for(fact=1;rem>0;rem--){
				fact=fact*rem;
	
			}
			sum=sum+fact; 
	//		printf("sum is %d\n",sum);
			temp=temp/10;
		}
		temp=no;
		if(temp==sum){
			printf("%d is a Strong Number\n",temp);
		}
	}
	
}