package stackprogram;

public class Stack {
	int arr[];
	int top;
	
	public Stack(int size) {
		arr=new int[size];
		top=-1;
	}
	
	boolean isFull()
	{
		if (top==arr.length-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	void push(int ele)
	{
		boolean result=isFull();
		
		if(result==false)
		{
			top++;
			arr[top]=ele;
		}
		else
		{
			System.out.println("Stack Overflow");
		}
		
	}
	
	int pop()
	{
		boolean result=isEmpty();
		
		if(result==false)
		{
			int ele=arr[top];
			top--;
			return ele;
		}
		else {
			System.out.println("Stack Underflow");
			return -1;
		}
	}
	
	int peek()
	{
		if(isEmpty()==false)
		{
			return arr[top];
		}
		else
			return -1;
	}
	
	void traverse()
	{
		
		for (int i =top; i >-1; i--) {
			System.out.println(arr[i]);
		}
			
		
	}

}
