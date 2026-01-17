package queueproject;

public class Myqueue {
	int arr[];
	int front,rear;
	
	
	public Myqueue(int size) {
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	
	boolean isFull()
	{
		if ((rear==arr.length-1 && front==0) || (rear+1==front)) 
			return true;
		else
			return false;
	}
	
	boolean isEmpty()
	{
		if(rear==-1)
			return true;
		else
			return false;
	}
	
	void enQueue(int ele)
	{
		if (!isFull()) {
			if(rear==-1)
			{
				rear=0;
				front=0;
			}
			else if(rear==arr.length-1)
			{
				rear=0;
			}
			else {
				rear++;
				
			}
			arr[rear]=ele;
		}
	}
	
	void deQueue()
	{
		if(!isEmpty())
		{
			 int ele=arr[front];
			 System.out.println("Deleted element are "+ele);
			if(rear==front)
			{
				rear=-1;
				front=-1;
			}
			else if(front==arr.length-1)
			{
				front=0;
			}
			else {
				front++;
			}
			//return ele;
		}
	}
	
	void display()
	{
	    if (isEmpty()) {
	        System.out.println("Queue Empty");
	        return;
	    }

	    int i = front;
	    while (true) {
	        System.out.println(arr[i]);

	        if (i == rear)
	            break;

	        if (i == arr.length - 1)
	            i = 0;
	        else
	            i++;
	    }
	}


}
