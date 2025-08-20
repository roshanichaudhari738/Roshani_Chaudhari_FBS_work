#include<stdio.h>
void main(){
	int price;
	char studnot;
	double discount;
	
	printf("Is the student or not y/n:");
	scanf("%c",&studnot);
	
	printf("Enter the Price:");
	scanf("%d",&price);
	if(studnot=='y')
	{
		if(price>500)
		{
			 discount=0.20;
		}
		else
			 discount=0.10;
	}
	else if(studnot =='n'){
		if(price>600){
			 discount=0.15;
		}
		else
			discount=0.0;
	}
	double Discount_Amount= price * discount/100;
	double final_price = price - Discount_Amount;
}