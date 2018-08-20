package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class TaskOn implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task One executing");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class TaskTo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task Two executing");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class TaskThree implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task three executing");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


class MultiRunnable implements Runnable {

	private List<Runnable> list = new ArrayList<Runnable>();
	
	MultiRunnable(List<Runnable> list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(Runnable r: list) {
			new Thread(r).start();
		}
	}
}

class RejectedExecutionHandlerImpl implements RejectedExecutionHandler {
	@Override
	public void rejectedExecution(Runnable runnable, ThreadPoolExecutor executor) {
		System.out.println(runnable.toString() + " : I've been rejected ! ");
	}
}

public class MultiTaskSingleThreadExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<Runnable> bq = new ArrayBlockingQueue<Runnable>(5);
		RejectedExecutionHandler reh = new RejectedExecutionHandlerImpl();
		ThreadPoolExecutor tpe = new ThreadPoolExecutor(3, 3, 10, TimeUnit.SECONDS, bq, reh);
		tpe.prestartAllCoreThreads();
		
		List<Runnable> threads = new ArrayList<Runnable>();
		threads.add(new TaskOn());
		threads.add(new TaskTo());
		threads.add(new TaskThree());
		
		bq.add(new MultiRunnable(threads));
	}

}
