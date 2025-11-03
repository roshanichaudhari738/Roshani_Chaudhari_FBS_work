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

	void setPname(String n)
	{
		this.Pname=n;
	}

	void setPrice(double r)
	{
		this.Price=r;
	}

	void setQuantity(int q)
	{
		this.Quantity=q;
	}
}
class ProductTest
{
	public static void main(String[] args)
	{
		Product p;
		p=new Product();

		p.setProductId(752);
		p.setPname("Pen");
		p.setPrice(60);
		p.setQuantity(100);

		System.out.printf("Product ID is : "+p.ProductId+"\nProduct Name is : "+p.Pname+"\nPrice : "+p.Price+"\nQuantity : "+p.Quantity);
	}
}