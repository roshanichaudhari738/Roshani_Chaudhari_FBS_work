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
}
class BookTest
{
	public static void main(String[] args)
	{
		Book b;
		b=new Book();

		b.setISBN(85296374);
		b.getISBN();
		b.setBName("Wings Of Fire");
		b.getBName();
		b.setCategory("Autobiography");
		b.getCategory();
		b.setPrice(500);
		b.getPrice();
		b.display();

		//System.out.printf("Product ID is : "+p.ProductId+"\nProduct Name is : "+p.Pname+"\nPrice : "+p.Price+"\nQuantity : "+p.Quantity);
	}
}