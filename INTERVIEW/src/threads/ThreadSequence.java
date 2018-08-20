package threads;

class MyRunnable extends Thread {
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName() +" is executing "+Thread.currentThread().getState());
		}
	}
	
}

public class ThreadSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" executing...");
		MyRunnable r1 = new MyRunnable();
		MyRunnable r2 = new MyRunnable();
		MyRunnable r3 = new MyRunnable();
		
		r1.setName("A");
		r2.setName("B");
		r3.setName("C");
		
/*		r1.start();
		if(!(r1.getState() == null)) {
			r2.start();
		}
		if(!(r2.getState() == null)) {
			r3.start();
		}
		*/
		r1.start();
		r2.start();
		r3.start();
		r3.run();
		
		try {
			r2.join();
			r3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
