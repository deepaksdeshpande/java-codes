package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Add implements Runnable {

	int[] array = new int[]{3,6,8,10,20,80};
	int sum=0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<array.length; i++) {
			sum += array[i];
		}
		System.out.println("Sum is : "+sum);
	}
}

class Multiply implements Runnable {

	int[] array = new int[]{2,4,6,8,10,12,14};
	int mul=1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<array.length; i++) {
			mul *= array[i]; 
		}
		System.out.println("Multiplication : "+mul);
	}
}

public class ConcurrencyExample {

	private static ExecutorService executorService=null;
	private static Future<Add> taskOne=null;
	private static Future<Multiply> taskTwo = null;
	
	@SuppressWarnings("unchecked")
	public static void checkTasks() {
		if(taskOne == null || taskOne.isCancelled() || taskOne.isDone()) {
			taskOne = (Future<Add>) executorService.submit(new Add());
		}
		if(taskTwo == null || taskTwo.isCancelled() || taskTwo.isDone()) {
			taskTwo = (Future<Multiply>) executorService.submit(new Multiply());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		executorService = Executors.newFixedThreadPool(2);
		try {
			System.out.println("Starting executors...");
			ConcurrencyExample.checkTasks();
			Thread.sleep(1000);
			System.out.println("Shutting down executors...");
			executorService.shutdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
