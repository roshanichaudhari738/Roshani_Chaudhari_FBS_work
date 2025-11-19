import java.util.Scanner;
class BankAccount
{
	int accountNumber;
	String accHolderName;
	double currentBalance;
	double interestRate;

	BankAccount()
	{
		this.accountNumber=0;
		this.accHolderName="Not Assign";
		this.currentBalance=0.0;
		this.interestRate=0.0;
	}

	BankAccount(int i,String n,double c,double r)
	{
		this.accountNumber=i;
		this.accHolderName=n;
		this.currentBalance=c;
		this.interestRate=r;
	}

	void setAccountNo(int x)
	{
		this.accountNumber=x;
	}
	
	int getAccountNo()
	{
		return this.accountNumber;
	}

	void setaccHolderName(String x)
	{
		this.accHolderName=x;
	}
	
	String getaccHolderName()
	{
		return this.accHolderName;
	}

	void setcurrentBalance(double x)
	{
		this.currentBalance=x;
	}
	
	double getcurrentBalance()
	{
		return this.currentBalance;
	}

	void setinterestRate(double x)
	{
		this.interestRate=x;
	}
	
	double getinterestRate()
	{
		return this.interestRate;
	}

	void display()
	{
		System.out.println("Account No is "+this.accountNumber);
		System.out.println("Account Name is "+this.accHolderName);
		System.out.println("Account CurrentBalance is "+this.currentBalance);
		System.out.println("Account Interestrate is "+this.interestRate);
	}

	

}
class BankAccountTest
{
	public static void main(String[] ar)
	{
		
		Scanner sc=new Scanner(System.in);
		//ba.setAccountNo(145223);
		//ba.getAccountNo(int x);
		System.out.println("Enter the Account No:");
		int a=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Account Name:");
		String nm=sc.nextLine();
		System.out.println("Enter the Account Current Balance:");
		double d1=sc.nextDouble();
		System.out.println("Enter the Account Intrest Rate:");
		double d2=sc.nextDouble();
		BankAccount ba=new BankAccount(a,nm,d1,d2);
		ba.display();
	}
}