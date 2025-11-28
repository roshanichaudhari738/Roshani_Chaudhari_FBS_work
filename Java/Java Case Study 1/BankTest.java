package Practise;

import java.util.Scanner;

//**************
//    Model
//**************
abstract class Account
{
	int accno;
	String accHolderName;
	double balance;
	
	
	  Account(int accno, String accHolderName, double balance) {
		this.accno = accno;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	  
	   abstract void withdraw(double amount);
	   abstract void deposite(double amount);
	   abstract double interest();
	   
	   void display()
		{
			System.out.println("Account No is "+this.accno);
			System.out.println("Account Name is "+this.accHolderName);
			System.out.println("Account CurrentBalance is "+this.balance);
			System.out.println();
		}

}

class SavingAccount extends Account
{
	double minbalance=10000;

	public SavingAccount(int accno, String accHolderName, double balance) {
		super(accno, accHolderName, balance);
		//this.minbalance = minbalance;
	}
	
	void withdraw(double amount)
	{
		if(balance-amount > minbalance)
		{
			 balance -=amount;
			 System.out.println("Withdraw from saving Account: "+amount);
			 System.out.println("Total Balance are "+balance);
		}
		else
		{
			System.out.println("Cannot Withdraw below minimum balance! ");
		}
	}
	
	void deposite(double amount)
	{
		balance= balance + amount;
		System.out.println("Deposited: "+amount);
		System.out.println("Total Balance: "+balance);
	}
	
	double interest()
	{
		return balance * 0.03;
	}
	
}

class SalaryAccount extends Account
{
	int inactivitymonthlimit=0;
	public boolean isFrozen=false;

	public SalaryAccount(int accno, String accHolderName, double balance, int inactivitymonthlimit) {
		super(accno, accHolderName, balance);
		this.inactivitymonthlimit = inactivitymonthlimit;
	}
	
	void monthEnd()
	{
		if(!isFrozen)
		{
			inactivitymonthlimit++;
			
			if(inactivitymonthlimit>=2)
			{
				isFrozen=true;
				System.out.println("Salary Account "+accno+" Frozen due to 2 month inactivate");
			}
			
		}
	}
	
	@Override
	void withdraw(double amount) 
	{
		if(isFrozen)
		{
			System.out.println("Cannot withdraw account "+accno+" is frozen");
			return;
		}
		
		if(amount<=balance)
		{
			balance-=amount;
			inactivitymonthlimit=0;
			System.out.println("Withdraw money is "+amount);
			System.out.println("Total Balance are "+balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
		
	}
	
	void deposite(double amount)
	{
		if(isFrozen)
		{
			System.out.println("Cannot deposite account "+accno+"is frozen");
			return;
		}
		balance += amount;
		inactivitymonthlimit=0;
		System.out.println("Deposited: "+amount);
		System.out.println("Total Balance are "+balance);
	}
	
	@Override
	double interest() {
		return balance * 0.04;
	}
	
}

class CurrentAccount extends Account
{
	int overdraftlimit=10000;

	public CurrentAccount(int accno, String accHolderName, double balance) {
		super(accno, accHolderName, balance);
	}
	
	void withdraw(double amount)
	{
		if(amount<balance + overdraftlimit)
		{
			 balance -=amount;
			 System.out.println("Withdrawn using Overdraft:"+amount);
			 System.out.println("Total Balance are "+balance);
		}
		else
		{
			System.out.println("Overdraft limit exceed");
		}
	}
	
	void deposite(double amount)
	{
		balance= balance + amount;
		System.out.println("Deposite Money are "+amount);
		System.out.println("Total balance are "+balance);
		//return balance;
	}
	
	double interest()
	{
		return 0;
	}
	
}

class LoanAccount extends Account
{
	double loanamount;

	public LoanAccount(int accno, String accHolderName, double balance, double loanamount) {
		super(accno, accHolderName, balance);
		this.loanamount = loanamount;
	}
	
	void withdraw(double amount)
	{
		System.out.println("No Money Withdraw Loan account!!!");
	}
	
	void deposite(double amount)
	{
		loanamount =loanamount-amount;
		//balance=balance + amount; 
		System.out.println("Loan Repay :"+amount);
		System.out.println("Remaining Loan: "+loanamount);
	}
	
	double interest()
	{
			return loanamount * 0.03;
	}
	
}

class BankModel 
{
    Account[] accounts = new Account[50]; 
    int count = 0; 
    
    Transaction transaction = new Transaction();

   
    public void addAccount(Account acc)
    {
        if(count < accounts.length)
        {
            accounts[count] = acc;
            count++;
            System.out.println("Account added successfully: " + acc.accno);
        }
        else
        {
            System.out.println("Cannot add more accounts, bank is full!");
        }
    }
    
    Account searchAccount(int accno)
    {
    	for(int i=0; i<count; i++)
    	{
    		if(accounts[i].accno == accno)
    			return accounts[i];
    	}
    	System.out.println("Account not found: "+ accno);
    	return null;
    }
    
     void deposit(int accno, double amount)
    {
    	Account a = searchAccount(accno);
    	if(a!= null)
    	{	
    		a.deposite(amount);
    	    transaction.addRecord("Acc:" + accno + " DEPOSIT " + amount + " "+java.time.LocalDate.now()+" "+java.time.LocalTime.now());
        }  
     }
    
    void withdraw(int accno, double amount)
    {
    	Account a = searchAccount(accno);
    	if(a != null)
    	{	 
    		a.withdraw(amount);
            transaction.addRecord("Acc:" + accno + " WITHDRAW " + amount + " "+java.time.LocalDate.now()+" "+java.time.LocalTime.now()); 
    	}
    }
     
    public void showEODReport()
    {
    	System.out.println("-----EOD Report-----");
    	for(int i=0; i<count; i++)
    	{
    		accounts[i].display();
    	}
    }
    
    void freezeAccount(int accNo)
    {
        Account acc = getAccountByAccNo(accNo);

        if(acc == null)
        {
            System.out.println("Account not found!");
            return;
        }

        if(acc instanceof SalaryAccount)
        {
            SalaryAccount sa = (SalaryAccount) acc;
            sa.isFrozen = true;
            System.out.println("Salary Account " + accNo + " is now frozen manually.");
        }
        else
        {
            System.out.println("Only Salary Account can be frozen.");
        }
    }
    
    void showAllTransactions()
    {
        transaction.displayAll();
    }
    
    void displayAllAccounts()
    {
    	for(int i=0; i < count; i++)
    	{
    		accounts[i].display();
    		System.out.println("Interest: "+ accounts[i].interest());
    		
          System.out.println("----");
    	}
    }

    public Account getAccountByAccNo(int accno) 
    {
        for(int i = 0; i < count; i++) 
        {
            if(accounts[i].accno == accno) 
            {
                return accounts[i];
            }
        }
        System.out.println("Account not found with AccNo: " + accno);
        return null;
    }
    
   public void deleteAccount(int accNo)
    {
        for(int i = 0; i < count; i++)
        {
            if(accounts[i].accno == accNo)
            {
                accounts[i] = accounts[count - 1]; 
                accounts[count - 1] = null;
                count--;

                System.out.println("Account deleted: " + accNo);
                return;
            }
        }
        System.out.println("Account not found!");   
      } 
} 

class Transaction
{
    String[] records = new String[300];
    
    int AccNo;
    String AccType;
    double AccAmount;
    String TransactionDate;
    
    void addRecord(String rec)
    {
        for(int i = 0; i < records.length; i++)
        {
            if(records[i] == null)
            {
                records[i] = rec;
                return;
            }
        }
    }
    
    void displayByAcc(int accNo)
    {
        String key = "Acc:" + accNo;
        int found = 0;
        
        for(int i = 0; i < records.length; i++)
        {
            if(records[i] != null)
            {
                if(records[i].indexOf(key) >= 0)
                {
                    if(records[i].indexOf("DEPOSIT") >= 0 || records[i].indexOf("WITHDRAW") >= 0)
                    {
                        System.out.println(records[i]);
                        found = found + 1;
                    }
                }
            }
        }
        
        if(found == 0)
        {
            System.out.println("No Deposit or Withdraw transactions found for AccNo: " + accNo);
        }
    }
    
    void displayAll()
    {
        int found = 0;
        
        for(int i = 0; i < records.length; i++)
        {
            if(records[i] != null)
            {
                if(records[i].indexOf("DEPOSIT") >= 0 || records[i].indexOf("WITHDRAW") >= 0)
                {
                    System.out.println(records[i]);
                    found = found + 1;
                }
            }
        }
        
        if(found == 0)
        {
            System.out.println("No Deposit or Withdraw transactions found.");
        }
    }
}

//**************
//	Controller
//**************

class BankController
{
	BankModel bank=new BankModel();
	
	public void createacc(Account a)
	{
		bank.addAccount(a);
		System.out.println("Account Created!!!");
	}
	
	public Account searchacc(int accNo)
	{
		return bank.getAccountByAccNo(accNo);
	}
	
	public void deleteacc(int accNo)
	{
		Account a=bank.getAccountByAccNo(accNo);
		
		if(a!=null)
		{
			if(a instanceof SalaryAccount)
			{
				SalaryAccount sa=(SalaryAccount)a;
				sa.isFrozen=false;
			}
			
			System.out.println("Account "+accNo+" deleted!!");
		}
		else
		{
			System.out.println("Account Not Found!!!");
		}
	}
	
	public void depositemoney(int accNo,double amt)
	{
		
		bank.deposit(accNo, amt);
	}
	
	public void withdrawmoney(int accNo,double amt)
	{
		
		bank.withdraw(accNo, amt);
	}
	
	public void freezeAccount(int accNo)
	{
		Account a=bank.getAccountByAccNo(accNo);
		if(a!=null)
		{
			if(a instanceof SalaryAccount)
			{
				SalaryAccount sa=(SalaryAccount)a;
				sa.isFrozen=false;
			}
			System.out.println("Account "+accNo+" freeze");
		}
		else
		{
			System.out.println("Account Not Found!!");
		}
	}
	
	public void displayAllAcc()
	{
		bank.displayAllAccounts();
	}
	
	void showTransaction()
	{
		bank.showAllTransactions();
	}
	
	void showTransactionByAcc(int accNo)
	{
		bank.transaction.displayByAcc(accNo);
	}
	
	void showEOD()
	{
		bank.showEODReport();
	}
	
}


//**************
//	View
//**************

class BankView
{
	BankController bank=new BankController();
    Scanner sc = new Scanner(System.in);
    public void start()
    {
    	int choice = 0;
        while(choice != 10)
        {
            System.out.print("\n1. Create Account\n2. Search Account\n3. Delete Account\n4. Deposit Money\n5. Withdraw Money\n"
            		+ "6. Freeze Account\n7. Show EOD Report\n8. Show Transaction History\n9. Display All Accounts\n10. Exit\n");
            System.out.println("\nEnter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
            case 1:
                System.out.println("1. Saving Account");
                System.out.println("2. Salary Account");
                System.out.println("3. Current Account");
                System.out.println("4. Loan Account");
                System.out.print("Enter Account type: ");
                int type = sc.nextInt();
                System.out.print("Enter Account No: ");
                int accno = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Account Holder Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Balance: ");
                double bal = sc.nextDouble();
                Account acc = null;
                if(type == 1)
                {
                	acc = new SavingAccount(accno, name, bal);
                	System.out.println("Saving Account created Successfully!!!");
                }    
                else if(type == 2)
                {
                    System.out.print("Enter Inactivity Month Limit: ");
                    int limit = sc.nextInt();
                    acc = new SalaryAccount(accno, name, bal, limit);
                    System.out.println("Salary Account created Successfully!!!");
                }
                else if(type == 3)
                {
                	acc = new CurrentAccount(accno, name, bal);
                    System.out.println("Current Account created Successfully!!!");
                }
                else if(type == 4)
                {
                    System.out.print("Enter Loan Amount: ");
                    double loan = sc.nextDouble();
                    acc = new LoanAccount(accno, name, bal, loan);
                    System.out.println("Loan Account created Successfully");
                }
                if(acc != null)
                    bank.createacc(acc);;
                break;
            case 2:
                System.out.print("Enter Account No: ");
                accno = sc.nextInt();
                acc = bank.searchacc(accno);
                if(acc != null)
                    acc.display();
                break;
            case 3:
                System.out.print("Enter Account No: ");
                accno = sc.nextInt();
                bank.deleteacc(accno);
                break;
            case 4:
                System.out.print("Enter Account No: ");
                accno = sc.nextInt();
                System.out.print("Enter Amount: ");
                double amt = sc.nextDouble();
                bank.depositemoney(accno, amt);
                break;
            case 5:
                System.out.print("Enter Account No: ");
                accno = sc.nextInt();
                System.out.print("Enter Amount: ");
                amt = sc.nextDouble();
                bank.withdrawmoney(accno, amt);
                break;
            case 6:
                System.out.print("Enter Account No: ");
                accno = sc.nextInt();
                bank.freezeAccount(accno);
                break;
            case 7:
                bank.showEOD();
                break;
            case 8:
                System.out.print("Enter Account No: ");
                accno = sc.nextInt();
                bank.showTransactionByAcc(accno);
                break;
            case 9:
                bank.displayAllAcc();
                break;
            case 10:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
    public void print(String message) {
        System.out.println(message);
    } 
}

class BankTest
{
    public static void main(String[] args) 
    {
    	BankView bankv=new BankView();
    	bankv.start();
    	
    }
}