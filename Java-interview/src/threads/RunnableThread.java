package threads;

public class RunnableThread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Run by : "+Thread.currentThread().getName());
		RunnableThread rt = new RunnableThread();
		Thread t1 = new Thread(rt, "Deepak");
		Thread t2 = new Thread(rt, "D");
		t1.start();
		t2.start();
		Thread.yield();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1000);
			System.out.println("Run by :"+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
