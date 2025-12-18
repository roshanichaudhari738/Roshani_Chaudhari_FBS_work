package p2;
import p1.*;

class X {
	
	void myFunX()
	{
		A ref;
		ref=new A();
		ref.myFunA();
	}

}

class Y extends p1.A
{
	void myFunY()
	{
		p1.A ref;
		ref=new p1.A();
		ref.myFunA();
		super.myFunA();
		this.myFunA();
	}
}
