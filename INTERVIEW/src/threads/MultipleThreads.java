package threads;

public class MultipleThreads implements Runnable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setName("Main");
		MultipleThreads mt = new MultipleThreads();
		Thread t1 = new Thread(mt);
		t1.setName("Deepak");
		//t1.setPriority(Thread.MAX_PRIORITY);
		Thread t2 = new Thread(mt);
		t2.setName("Rishab");
		//t2.setPriority(Thread.NORM_PRIORITY);
		Thread t3 = new Thread(mt);
		t3.setName("Dinesh");
		//t3.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			System.out.println("Executed by : "+Thread.currentThread().getName()+" Priority : "+Thread.currentThread().getPriority());
			Thread.yield();
		}
	}

}
