package p1;

public class A {
	
	private void myFunA()
	{
		System.out.println("A");
	}
}

class B extends A
{
	void myFunB()
	{
		A ref;
		ref=new A();
		ref.myFunA();
	}
}

class C
{
	void myFunC()
	{
		A ref;
		ref=new A();
		ref.myFunA();
	}
}
