package assignment6;

public class Question25 {

	public static void main(String[] args) {
		int a=5,b=25,c=3;
		int res=greaterthree(a,b,c);
		if(res==0)
			System.out.printf("a is greater");
		else if(res==1)
			System.out.printf("c is greater");
		else if(res==2)
			System.out.printf("b is greater");
		else 
			System.out.printf("c is greater");

	}
	static int greaterthree(int x,int y,int z)
	{
		if(x>y){
			if(x>z){
//				printf("a is greater");
				return 0;
			}
			else{
//				printf("c is greater");
				return 1;
			}
		}else{
			if(y>z){
//				printf("b is greater");
				return 2;
			}
			else{
//				printf("c is greater");
				return 3;
			}		
		}
	}

}
