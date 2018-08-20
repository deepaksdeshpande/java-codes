package threads;

/*
 * We have two tasks running. Neither is expected to terminate, and both should run for the 
 * duration of the application’s life.
 * 
 * If any task throws an exception, the application will catch it and restart the task. 
 * 
 * If any task runs to completion, the application will notice and restart the task.
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TaskOne implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Task one executing");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class TaskTwo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("Task two executing");
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ExecutorDemo {
	
	private static ExecutorService es = null;
	private static volatile Future<?> taskOneResult = null;
	private static volatile Future<?> taskTwoResult = null;
	
	public static void checkTasks() throws Exception {
		if(taskOneResult==null || taskOneResult.isDone() || taskOneResult.isCancelled()) {
			taskOneResult = es.submit(new TaskOne());
		}
		if(taskTwoResult==null ||taskTwoResult.isDone() || taskTwoResult.isCancelled()) {
			taskTwoResult = es.submit(new TaskTwo());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		es = Executors.newFixedThreadPool(2);
		while (true) {
			try {
				checkTasks();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
