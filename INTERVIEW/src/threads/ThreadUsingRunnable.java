package threads;

public class ThreadUsingRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run by : "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Run by : "+Thread.currentThread().getName());
		ThreadUsingRunnable r = new ThreadUsingRunnable();
		Thread t = new Thread(r);
		t.start();
	}

}
