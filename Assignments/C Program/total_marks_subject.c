void main(){
	int sub1,sub2,sub3,sub4,sub5,totalmarks;

	float percentage;
	sub1=56,sub2=89,sub3=69,sub4=45,sub5=80;

	totalmarks = sub1 + sub2 + sub3 + sub4 + sub5;
	printf("Total is %d ",totalmarks);
	percentage = (totalmarks / 500.0) * 100;
	printf("Percentage is %f",percentage);
}