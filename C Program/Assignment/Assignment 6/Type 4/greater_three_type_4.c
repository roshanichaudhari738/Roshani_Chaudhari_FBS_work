#include<stdio.h>
int greaterthree(int,int,int);
void main(){
	int a=5,b=25,c=3;
	int res=greaterthree(a,b,c);
	res==0?printf("a is greater"):res==1?printf("c is greater"):res==2?printf("b is greater"):printf("c is greater");
}

int greaterthree(int x,int y,int z)
{
	if(x>y){
		if(x>z){
//			printf("a is greater");
			return 0;
		}
		else{
//			printf("c is greater");
			return 1;
		}
	}else{
		if(y>z){
//			printf("b is greater");
			return 2;
		}
		else{
//			printf("c is greater");
			return 3;
		}		
	}
}