import java.util.Scanner;
class Product
{
	int ProductId;
	String Pname;
	double Price;
	int Quantity;

	void setProductId(int p)
	{
		this.ProductId=p;
	}
	
	int getProductId()
	{
		return this.ProductId;
	}
	
	void setPname(String n)
	{
		this.Pname=n;
	}

	String getPname()
	{
		return this.Pname;
	}

	void setPrice(double r)
	{
		this.Price=r;
	}

	double getPrice()
	{
		return this.Price;
	}

	void setQuantity(int q)
	{
		this.Quantity=q;
	}
	
	int getQuantity()
	{
		return this.Quantity;
	}
	
	void display()
	{
		System.out.println("Product ID is "+this.ProductId);
		System.out.println("Product Name is "+this.Pname);
		System.out.println("Price is "+this.Price);
		System.out.println("Quantity is "+this.Quantity);
	}

	Product()
	{
		this.ProductId=1111;
		this.Pname="Book";
		this.Price=100;
		this.Quantity=20;
	}

	Product(int i,String n,double p,int q)
	{
		System.out.println("Parameter Constructor");
		this.ProductId=i;
		this.Pname=n;
		this.Price=p;
		this.Quantity=q;
	}
}
class ProductTest
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Product ID");
		int no=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Product Name");
		String name=sc.nextLine();
		//sc.nextLine();
		System.out.println("Enter the Product Price");
		double pr=sc.nextDouble();
		System.out.println("Enter the Product Quantity");
		int q=sc.nextInt();
		
		
		Product p;
		p=new Product(no,name,pr,q);

		//p.setProductId(752);
		//p.getProductId();
		//p.setPname("Pen");
		//p.getPname();
		//p.setPrice(60);
		//p.getPrice();
		//p.setQuantity(100);
		//p.getQuantity();
		p.display();

	}
}