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

	void setBName(String b)
	{
		this.BookName=b;
	}

	void setCategory(String c)
	{
		this.Category=c;
	}

	void setPrice(double p)
	{
		this.Price=p;
	}

}
class BookTest
{
	public static void main(String[] args)
	{
		Book b;
		b=new Book();
		
		b.setISBN(85296374);
		b.setBName("Wings Of Fire");
		b.setCategory("Autobiography");
		b.setPrice(500);
		
		System.out.printf("ISBN is : "+b.ISBN);
		System.out.printf("\nBook Name is : "+b.BookName);
		System.out.printf("\nCategory : "+b.Category);
		System.out.printf("\nPrice : "+b.Price);

	}
}