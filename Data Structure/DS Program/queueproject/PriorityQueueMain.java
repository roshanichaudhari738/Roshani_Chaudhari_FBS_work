package queueproject;

public class PriorityQueueMain {

	public static void main(String[] args) {
		MyPriorityQueue mpq=new MyPriorityQueue(5);
		
		mpq.enQueue(50);
		mpq.enQueue(10);
		mpq.enQueue(30);
		mpq.enQueue(20);
		mpq.enQueue(40);
		
		mpq.display();
		
		
		System.out.println();
		mpq.deQueue();
		mpq.display();
		
		System.out.println();
		mpq.deQueue();
		mpq.display();
	}

}
