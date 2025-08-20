#include<stdio.h>
void main(){
	int a=5,b=25,c=3;
	if(a>b){
		if(a>c){
			printf("a is greater");
		}
		else{
			printf("c is greater");
		}
	}else{
		if(b>c){
			printf("b is greater");
		}
		else{
			printf("c is greater");
		}		
	}
}