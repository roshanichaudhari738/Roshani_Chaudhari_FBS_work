package com.innerclass;

 class OuterClass {
	
	private int val=100;
	
	public void print() {
		System.out.println(val);
		InnerClass i=new InnerClass();
		i.iprint();
		System.out.println(i.ival);
	}
	
	//1..Inner class is a member of an outer class
	  public class InnerClass{
		  public int ival=2000;
		  
		  public void iprint() {
			System.out.println("Inner class "+ival);
			System.out.println("Outer class "+val);
		}
	  }
	  
	  //2..static inner class
	  static class StaticInnerClass{
		  static int sVal=256;
		  
		  static void sprint()
		  {
			  System.out.println("Static Method "+sVal);
		  }
		  
		  void print()
		  {
			  System.out.println("Non Static Method "+sVal);
		  }
	  }
	  
	  //3..Method local inner class
	  public void aMethod()
	  {
		  int adata=100; //local variable 
		  //adata++;
		  
		  class A{
			  private static int Adata=200;
			  
			 public void print()
			 {
				 System.out.println(Adata);
				 System.out.println(adata);
			 }
		  }
		  A a1=new A();
		  System.out.println(A.Adata);
		  a1.print();
		  
	  }

	  //Within Outer Class
	public static void main1(String[] args) {
		OuterClass o1=new OuterClass();
		o1.print();
		
		
		InnerClass i=o1.new InnerClass();
		i.iprint();
//		i.print(); can't accessible
		
		System.out.println("Static Class");
		StaticInnerClass s1=o1.new StaticInnerClass();
		//not allowed since static is loaded before object creation
		System.out.println(StaticInnerClass.sVal);
		s1.print();
		StaticInnerClass.sprint();
		
		aMethod.A a1=new aMethod.A();
		//not allowed due to local scope of the class in method

	}

}

public class Test{
	//Other Class inside 
	public static void main(String[] args) {
		OuterClass o1=new OuterClass();
		o1.print();
		
		
		OuterClass.InnerClass i=o1.new InnerClass();
		i.iprint();
//		i.print(); can't accessible
		
		System.out.println("Static Class");
		OuterClass.StaticInnerClass s1=new OuterClass.StaticInnerClass();
		System.out.println(OuterClass.StaticInnerClass.sVal);
		s1.print();
		OuterClass.StaticInnerClass.sprint();
		
		o1.aMethod();
	}
}