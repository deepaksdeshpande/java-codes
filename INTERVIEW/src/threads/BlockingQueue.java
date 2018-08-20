package threads;

import java.util.concurrent.LinkedBlockingQueue;

class Producer implements Runnable {
	@SuppressWarnings("rawtypes")
	private final java.util.concurrent.BlockingQueue sharedQueue;
	
	@SuppressWarnings("rawtypes")
	public Producer(java.util.concurrent.BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println("Produced "+i);
			try {
				sharedQueue.put(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	@SuppressWarnings("rawtypes")
	private final java.util.concurrent.BlockingQueue sharedQueue;
	
	public Consumer(@SuppressWarnings("rawtypes") java.util.concurrent.BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Consumed "+sharedQueue.take());
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class BlockingQueue {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		LinkedBlockingQueue sharedQueue = new LinkedBlockingQueue<>();
		Thread t1 = new Thread(new Producer(sharedQueue));
		Thread t2 = new Thread(new Consumer(sharedQueue));
		t1.start();
		t2.start();
	}
}
