package threads;

import java.util.concurrent.LinkedBlockingQueue;

class Producers implements Runnable {
	@SuppressWarnings("rawtypes")
	private final java.util.concurrent.BlockingQueue queue;
	
	public Producers(@SuppressWarnings("rawtypes") java.util.concurrent.BlockingQueue queue) {
		this.queue = queue;
	}
	@SuppressWarnings("unchecked")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<10; i++) {
			System.out.println("produced "+i);
			try {
				queue.put(i);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumers implements Runnable {
	@SuppressWarnings("rawtypes")
	private final java.util.concurrent.BlockingQueue queue; 
	
	public Consumers(@SuppressWarnings("rawtypes") java.util.concurrent.BlockingQueue queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Consumed "+queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ProducerConsumerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedBlockingQueue queue = new LinkedBlockingQueue();
		Thread t1 = new Thread(new Producers(queue));
		Thread t2 = new Thread(new Consumers(queue));
		t1.start();
		t2.start();
	}

}
