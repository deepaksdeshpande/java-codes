package threads;

public class RunnableThread implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread: "+Thread.currentThread().getName());
		Thread t = new Thread(new RunnableThread());
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread in run method : "+Thread.currentThread().getName());
	}
	
	

}
