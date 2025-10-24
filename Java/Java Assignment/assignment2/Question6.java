package assignment2;

public class Question6 {

	public static void main(String[] args) {
		double price=550;
		double final_price;
		char studnot='y';
		//double discount;
		
//		printf("Is the student or not y/n:");
//		scanf("%c",&studnot);
//		fflush(stdin);
//		printf("Enter the Price:");
//		scanf("%lf",&price);
		if(studnot=='y')
		{
			if(price>500)
			{
				 final_price = price - (price * 0.20);
				 System.out.printf("Final price: %f", final_price);

			}
			else
			{
				final_price = price - (price * 0.1);
				System.out.printf("Final price: %f", final_price);
			}
				 
		}
		else if(studnot =='n'){
			if(price>600){
				 final_price = price - (price * 0.15);
	            System.out.printf("Final price: %f", final_price);
			}
			else
			{
				final_price = price - (price * 0.0);
	            System.out.printf("Final price: %f", final_price);
	     	}
		}

	}

}
