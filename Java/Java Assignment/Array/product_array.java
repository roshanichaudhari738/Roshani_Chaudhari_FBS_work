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
		this.ProductId=100;
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
		Product arr[] = new Product[3];
		
		arr[0]=new Product();
		arr[1]=new Product(101,"Bag",500,200);
		arr[2]=new Product(102,"Pen",30,50);

		for(int i=0;i<3;i++)
		{
				//System.out.println(arr[i]);	
				arr[i].display();		
		}

	}
}