#include<stdio.h>
int palindrome();
void main()
{
	int res=palindrome();
	if(res==1)
		printf("Palindrome");
	else
		printf("Not Palindrome");
}

int palindrome()
{
	int r1,no,rev=0;
	printf("Enter the Number:");
	scanf("%d",&no);
	int temp=no;
	while(no>0)
	{
		r1=no%10;
		no=no/10;
		rev=rev*10+r1;
		printf("%d\n",rev);
	}
	
	return temp==rev?  1:  0;
//	if(temp==rev)
//		return 1;
//	else
//		return 0;

}