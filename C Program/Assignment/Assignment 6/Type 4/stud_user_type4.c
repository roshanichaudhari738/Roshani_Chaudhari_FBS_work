#include<stdio.h>
double isstudent(char,double);
void main(){
	double price;
	char studnot;
	printf("Is the student or not y/n:");
	scanf("%c",&studnot);
	fflush(stdin);
	printf("Enter the Price:");
	scanf("%lf",&price);
	double res=isstudent(studnot,price);
	printf("Result is %lf",res);
}

double isstudent(char studnot,double price)
{
	double final_price;
	double discount;
	if(studnot=='y')
	{
		if(price>500)
			return price - (price * 0.20);
//             printf("Final price: %lf", final_price);
		else
			return price - (price * 0.1);
//             printf("Final price: %lf", final_price);
			 
	}
	else if(studnot =='n')
	{
		if(price>600)
			return price - (price * 0.15);
//            printf("Final price: %lf", final_price);
		else
			return price - (price * 0.0);
//            printf("Final price: %lf", final_price);
	}
//	double Discount_Amount= price * discount/100;
//	double final_price = price - Discount_Amount;
}