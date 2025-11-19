import java.util.Scanner;
class Book
{
	long ISBN;
	String BookName;
	String Category;
	double Price;

	void setISBN(long i)
	{
		this.ISBN=i;
	}
	
	long getISBN()
	{
		return this.ISBN;
	}
	
	void setBName(String b)
	{
		this.BookName=b;
	}

	String getBName()
	{
		return this.BookName;
	}

	void setCategory(String c)
	{
		this.Category=c;
	}

	String getCategory()
	{
		return this.Category;
	}

	void setPrice(double p)
	{
		this.Price=p;
	}

	double getPrice()
	{
		return this.Price;
	}
	
	void display()
	{
		System.out.println("Book ID is "+this.ISBN);
		System.out.println("Book Name is "+this.BookName);
		System.out.println("Category is "+this.Category);
		System.out.println("Price is "+this.Price);
	}

	Book()
	{
		System.out.println("Constructor call");
		this.ISBN=0;
		this.BookName="Not Assign";
		this.Category="Not Assign";
		this.Price=0;
	}

	Book(long l,String n,String c,double d)
	{
		System.out.println("Parameter Constructor");
		this.ISBN=l;
		this.BookName=n;
		this.Category=c;
		this.Price=d;
	}
}
class BookTest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Book ISBN");
		long no=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter the Book Name");
		String name=sc.nextLine();
		//sc.nextLine();
		System.out.println("Enter the Book Category");
		String cat=sc.nextLine();
		System.out.println("Enter the Book Price");
		double pr=sc.nextDouble();

		Book b=new Book(no,name,cat,pr);

		//b.setISBN(85296374);
		//b.getISBN();
		//b.setBName("Wings Of Fire");
		//b.getBName();
		//b.setCategory("Autobiography");
		//b.getCategory();
		//b.setPrice(500);
		//b.getPrice();
		b.display();

	}
}