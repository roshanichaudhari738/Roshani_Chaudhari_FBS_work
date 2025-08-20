void main(){
	int add,sub,mul,div,mod,no1,no2;
	printf("Enter the Value1:");
	scanf("%d",&no1);
	printf("Enter the Value2:");
	scanf("%d",&no2);
	add = no1 + no2;
	printf("Addition of %d + %d = %d \n",no1,no2,add);
	sub = no1 - no2;
	printf("Substraction of %d - %d = %d \n",no1,no2,sub);
	div = no1 / no2;
	printf("Divide of %d / %d = %d \n",no1,no2,div);
	mul = no1 * no2;
	printf("Multiplication of %d * %d = %d \n",no1,no2,mul);
	mod = no1 % no2;
	printf("Module of %d mod of %d = %d \n",no1,no2,mod);
}