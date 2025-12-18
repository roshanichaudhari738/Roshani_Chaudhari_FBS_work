package classwork;

interface Mall
{
	void discount();
}

abstract class Mall1
{
	abstract void specialdiscount();
}

class BeautyMall extends Mall1
{
	@Override
	void specialdiscount() {
		// TODO Auto-generated method stub
		System.out.println("Beauty Mall");
	}
}

class FashionMall implements Mall
{
	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("20% Discount");
	}
}

public class AnonymousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mall m1=new FashionMall();
		m1.discount();
		
		Mall m2=new FashionMall();
		m2.discount();
		
		new Mall() {
			
			@Override
			public void discount() {
				// TODO Auto-generated method stub
				System.out.println("50% Discount");
			}
		}.discount();;
		
		new Mall1() {
			
			@Override
			void specialdiscount() {
				// TODO Auto-generated method stub
				System.out.println("123");
			}
		};
	}

}
