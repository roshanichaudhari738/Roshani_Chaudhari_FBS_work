package linkedlistprogram;

public class Linkedlist {
		Node start;
		
		public Linkedlist() {
			start=null;
		}
		
		boolean isEmpty()
		{
			if(start==null)
				return true;
			else
				return false;
		}
		
		void insertend(int ele)
		{
			if (isEmpty()) {
				start=new Node(ele); //insert a 1st node 
				System.out.println("ele insrt "+start);
				System.out.println("ele data"+start.getData());
			}
			else {
				Node temp=start;
				System.out.println("start "+temp);
				while (temp.getNext()!=null) {
					temp=temp.getNext();
					System.out.println("address "+temp);
				}
				Node temp1=new Node(ele); //insert last node
				System.out.println("Insert the ele "+temp1);
				temp.setNext(temp1);
			}
		}
		
		void insertBeg(int ele)
		{
			if (isEmpty()) {
				start=new Node(ele);
			}
			else
			{
				Node temp1=new Node(ele);
				System.out.println("first node "+temp1);
				temp1.setNext(start);
				start=temp1;
				System.out.println("first start "+start);
			}
		}
		
		void insertPos(int ele,int pos)
		{
			if(isEmpty())
			{
				start=new Node(ele);
			}
			//this code for only position=1
			else if(pos==1)
			{
				Node temp1=new Node(ele);
				temp1.setNext(start);
				start=temp1;
			}
			//this code for position>1 and wrong Position
			else {
				Node temp1=new Node(ele);
				Node temp=start;
				int c=1;
				while(temp.getNext()!=null && c<pos-1)
				{
					temp=temp.getNext();
					c++;
				}
				//System.out.println("You have entered the wrong position but I can insert the node !!!");
				temp1.setNext(temp.getNext());
				temp.setNext(temp1);
				System.out.println(ele+" insert at position "+pos);
				
			}
		}
		
		void deletePos(int pos)
		{
			if(isEmpty())
			{
				return;
			}
			else if(pos==1)
			{
				start=start.getNext();
			}
			else {
				int c=1;
				Node temp=start;
				while(temp.getNext()!=null && c<pos-1)
				{
					temp=temp.getNext();
					c++;
				}
				if(c<pos && temp.getNext()==null)
				{
					System.out.println("Invalid");
				}
				temp.setNext(temp.getNext().getNext());
				System.out.println(" delete at position "+pos);
			}
		}
		
		void deleteBeg()
		{
			if (isEmpty()) {
				System.out.println("List is empty! can not have a Node in list");
				return;
			}
			else {
				start=start.getNext();
			}
		}
		
		void deleteEnd()
		{
			if (isEmpty()) {
				System.out.println("List is empty! can not have a Node in list");
				return;
			}
			else if(start.getNext()==null)
			{
				
				start=null;
			}
			else {
				Node temp=start;
				
				while(temp.getNext().getNext()!=null)
				{
					temp=temp.getNext();
				}
				
				temp.setNext(null);
			}
		}
		
		void display()
		{
			if(!isEmpty())
			{
				Node temp=start;
				System.out.println("display temp "+temp);
				while(temp!=null)
				{
					System.out.println(temp.getData());
					temp=temp.getNext();
					System.out.println(temp);
				}
			}
		}
		
}
