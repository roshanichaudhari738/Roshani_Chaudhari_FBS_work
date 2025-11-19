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
		this.ISBN=85296374;
		this.BookName="Good Thoughts";
		this.Category="Autobiography";
		this.Price=4512;
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
		Book arr[] = new Book[3];
		
		arr[0]=new Book();
		arr[1]=new Book(147852,"Wings Of Fire","Autobiography",300);
		arr[2]=new Book(963456123,"English Story","Story",100);

		for(int i=0;i<arr.length;i++)
		{
				//System.out.println(arr[i]);	
				arr[i].display();		
		}

	}
}