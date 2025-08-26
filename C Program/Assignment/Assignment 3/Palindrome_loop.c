#include<stdio.h>
void main(){
	int r1,rev=0;
	int no=14441;
	int temp=no;
	while(no>0)
	{
		r1=no%10;
		rev=rev*10+r1;
		no=no/10;
		
	}
	
	if(temp==rev){
		printf("%d is a Palindrome",temp);
	}
	else{
		printf("%d is not a Palindrome",temp);
	}
}