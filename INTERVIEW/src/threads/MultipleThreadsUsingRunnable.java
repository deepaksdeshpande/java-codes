package threads;

public class MultipleThreadsUsingRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<4000; i++)
			System.out.println("Run by  "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleThreadsUsingRunnable r = new MultipleThreadsUsingRunnable();
		Thread t1 = new Thread(r, "Deepak");
		Thread t2 = new Thread(r, "Lucy");
		Thread t3 = new Thread(r, "Fred");
	
		t1.start();
		t2.start();
		t3.start();
		try {
			t2.join();
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
