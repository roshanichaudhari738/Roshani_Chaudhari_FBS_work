package com.strategypattern;

@FunctionalInterface

interface Payment{
	int pay(int amount);
	default void offeredDiscount(int amount)
	{
		System.out.println("Offered discount are "+amount);
	}
	
	static void paymentFail()
	{
		System.out.println("Payment are fail plz try again !!!");
	}
}

class CashPayment implements Payment
{

	@Override
	public int pay(int amount) {
		System.out.println("Cash payment done "+amount);
		return amount;
		
	}
	
}

class UPIPayment implements Payment
{

	@Override
	public int pay(int amount) {
		System.out.println("Payment done with UPI mode "+amount);
		return amount;
	}
	
}

class CardPayment implements Payment
{

	@Override
	public int pay(int amount) {
		System.out.println("Card Payment done "+amount);
		return amount;
	}
	
}

class PaymentContext 
{
	Payment mode;
	
	public PaymentContext(Payment mode) {
		this.mode=mode;
	}
	
	public void makePayment(int amount) {
		System.out.println(" inside Payment 1");
		mode.pay(amount);
	}
}

public class PatternTest {

	public static void main(String[] args) {
		System.out.println(" inside Payment ");
		
//		Payment p=new Payment() {
//			
//		
//			@Override
//			public void pay(int amount) {
//				
//				System.out.println("Payment "+ amount);
//			}
//		};
//		
////		CashPayment cash=new CashPayment(); //strategy object
//		PaymentContext pay=new PaymentContext(p); //context
		
//		PaymentContext pay=new PaymentContext(new Payment() {
//			
//			@Override
//			public void pay(int amount) {
//				System.out.println("Cash Payment "+ amount);
//				
//			}
//		});
		
		//replace the complete anonymous inner class to lambda expression
		PaymentContext pay=new PaymentContext(amount ->
			{
				int billingamount=amount;
				System.out.println("Cash Payment with no discount"+ amount);
				return billingamount;
			}
		);pay.makePayment(500);
		
		PaymentContext bill=new PaymentContext(amount ->
		{
			float discount=amount*10/100;
			int billingamount=(int) (amount-discount);
			System.out.println("UPI Payment with 10% discount"+ amount);
			return billingamount;
		}
	);bill.makePayment(500);

	}

}
