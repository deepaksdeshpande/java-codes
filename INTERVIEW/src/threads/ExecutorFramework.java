package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TestOne implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("Executing task -1");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


class TestTwo implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("Executing task -2");
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class TestThree implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("Executing task -3");
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ExecutorFramework {

	private static ExecutorService executorService = null;
	private static Future<TestOne> testOneResult = null;
	private static Future<TestTwo> testTwoResult = null;
	private static Future<TestThree> testThreeResult = null;
	
	@SuppressWarnings("unchecked")
	public static void checkStatus() {
		if(testOneResult==null || testOneResult.isCancelled() || testOneResult.isDone()) {
			testOneResult = (Future<TestOne>) executorService.submit(new TestOne());
		}
		if(testTwoResult==null || testTwoResult.isCancelled() || testTwoResult.isDone()) {
			testTwoResult = (Future<TestTwo>) executorService.submit(new TestTwo());
		}
		if(testThreeResult == null || testThreeResult.isCancelled() || testThreeResult.isDone()) {
			testThreeResult = (Future<TestThree>) executorService.submit(new TestThree());
		}
	}
	
	public static void main(String[] args) {
		executorService = Executors.newFixedThreadPool(3);
		try {
			ExecutorFramework.checkStatus();
			Thread.sleep(1000);
			executorService.shutdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
