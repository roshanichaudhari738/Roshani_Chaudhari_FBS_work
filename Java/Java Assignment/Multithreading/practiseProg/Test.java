package practiseProg;

class Workers implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String str="1234567890123456789";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workers w1=new Workers();
		Thread t1=new Thread(w1);//There is a chaining create Workers object to pass the thread 
		t1.start();
		String str="abcdefghijklmnopqrstuvwxyzased";
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
