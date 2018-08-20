package threads;

public class ThreadUsingThread extends Thread{

	public void run() {
		System.out.println("Run by : "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Run by : "+Thread.currentThread().getName());
		ThreadUsingThread t = new ThreadUsingThread();
		t.start();

	}

}
