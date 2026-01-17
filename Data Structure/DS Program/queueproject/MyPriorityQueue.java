package queueproject;

public class MyPriorityQueue {
	int arr[];
	int front,rear;
	
	public MyPriorityQueue(int size) {
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
		
//		if (!isFull())
//		{
//			int i;
//			for(i=rear;i>=0;i--)
//			{
//				if (arr[i]<ele) {
//					arr[i+1]=arr[i];
////					System.out.println("Inserted Element "+arr[i]);
//				}
//				else {
//					break;
//				}
//			}
//				
//			arr[i+1]=ele;
//			rear++;
//		}
		
		if(isFull())
		{
			System.out.println("Queue is Overflow");
			return;
		}
		
				 if(rear==-1)
				{
					rear=0;
					front=0;
				}
				else if(rear==arr.length-1) //rear index check the arr length-1 equal or not //arr length-1 means array last index
				{
					rear=0;
				}
				else {
					rear++;
				}
				 arr[rear]=ele;
				 System.out.println("Ele "+ele);
				 for (int i = 0; i <= rear; i++) {
						int key=arr[i];
						
						int j=i-1;
						while(j>=0 && arr[j]>key)
						{
							arr[j+1]=arr[j];
							j--;
						}
						arr[j+1]=key;
					}
		
	}
	
//	int deQeue()
//	{
//		if(isEmpty())
//		{
//			System.out.println("Queue is Underflow");
//		}
//		
//	}
	
	int deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Underflow");
			return -1;
		}
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
			return ele;
		
	}
	
	void display()
	{
//	    if (isEmpty()) {
//	        System.out.println("Queue Empty");
//	        return;
//	    }

	    int i = front;
	    while (true) {
	        System.out.println(arr[i]);

	        if (i == rear)
	            break;

	        if (i == arr.length - 1)
	            i = 0;
	        else
	            i++;
//	        System.out.println(arr[i]);
	    }
	}

}
